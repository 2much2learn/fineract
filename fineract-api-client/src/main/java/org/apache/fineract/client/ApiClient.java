package org.apache.fineract.client;

import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import com.google.gson.JsonElement;
import okhttp3.*;
import org.apache.oltu.oauth2.client.request.OAuthClientRequest.AuthenticationRequestBuilder;
import org.apache.oltu.oauth2.client.request.OAuthClientRequest.TokenRequestBuilder;
import retrofit2.Converter;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;
import org.apache.fineract.client.auth.HttpBasicAuth;
import org.apache.fineract.client.auth.ApiKeyAuth;
import org.apache.fineract.client.auth.OAuth;
import org.apache.fineract.client.auth.OAuth.AccessTokenListener;
import org.apache.fineract.client.auth.OAuthFlow;

import javax.net.ssl.*;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.text.DateFormat;
import java.time.format.DateTimeFormatter;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.HashMap;

public class ApiClient {

  private Map<String, Interceptor> apiAuthorizations;
  private OkHttpClient.Builder okBuilder;
  private Retrofit.Builder adapterBuilder;
  private JSON json;

  public static ApiClient initializeApiClient(String baseUrl, String userName, String password) {

    ApiClient apiClient = new ApiClient();
    apiClient.createDefaultAdapter(baseUrl, userName, password);

    return apiClient;
  }

  public void createDefaultAdapter(String baseUrl, String userName, String password) {
    json = new JSON();
    okBuilder = UnsafeOkHttpClient.getUnsafeOkHttpClient(userName, password);
    okBuilder.addInterceptor(chain -> {
      Request request = chain.request().newBuilder().addHeader("Fineract-Platform-TenantId", "default").build();
      return chain.proceed(request);
    });

    if (!baseUrl.endsWith("/"))
      baseUrl = baseUrl + "/";

    adapterBuilder
        = new Retrofit.Builder()
          .baseUrl(baseUrl)
          .client(okBuilder.build())
          .addConverterFactory(ScalarsConverterFactory.create())
          .addConverterFactory(GsonCustomConverterFactory.create(json.getGson()));;
  }

  public <S> S createService(Class<S> serviceClass) {
    return adapterBuilder
            .client(okBuilder.build())
            .build()
            .create(serviceClass);
  }

  public ApiClient setDateFormat(DateFormat dateFormat) {
    this.json.setDateFormat(dateFormat);
    return this;
  }

  public ApiClient setSqlDateFormat(DateFormat dateFormat) {
    this.json.setSqlDateFormat(dateFormat);
    return this;
  }

  public ApiClient setOffsetDateTimeFormat(DateTimeFormatter dateFormat) {
    this.json.setOffsetDateTimeFormat(dateFormat);
    return this;
  }

  public ApiClient setLocalDateFormat(DateTimeFormatter dateFormat) {
    this.json.setLocalDateFormat(dateFormat);
    return this;
  }

  public Retrofit.Builder getAdapterBuilder() {
    return adapterBuilder;
  }

  public ApiClient setAdapterBuilder(Retrofit.Builder adapterBuilder) {
    this.adapterBuilder = adapterBuilder;
    return this;
  }

  public OkHttpClient.Builder getOkBuilder() {
    return okBuilder;
  }

}

class UnsafeOkHttpClient {
  public static OkHttpClient.Builder getUnsafeOkHttpClient(String userName, String password) {
    try {
      // Create a trust manager that does not validate certificate chains
      final TrustManager[] trustAllCerts = new TrustManager[] {
              new X509TrustManager() {
                @Override
                public void checkClientTrusted(java.security.cert.X509Certificate[] chain, String authType) throws CertificateException {
                }

                @Override
                public void checkServerTrusted(java.security.cert.X509Certificate[] chain, String authType) throws CertificateException {
                }

                @Override
                public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                  return new java.security.cert.X509Certificate[]{};
                }
              }
      };

      // Install the all-trusting trust manager
      final SSLContext sslContext = SSLContext.getInstance("SSL");
      sslContext.init(null, trustAllCerts, new java.security.SecureRandom());

      // Create an ssl socket factory with our all-trusting manager
      final SSLSocketFactory sslSocketFactory = sslContext.getSocketFactory();

      OkHttpClient.Builder builder = new OkHttpClient.Builder();
      builder.authenticator(new Authenticator() {
        public Request authenticate(Route route, okhttp3.Response response) throws IOException {
          String credential = Credentials.basic(userName, password);
          return response.request().newBuilder().header("Authorization", credential).build();
        }
      });
      builder.sslSocketFactory(sslSocketFactory, (X509TrustManager)trustAllCerts[0]);
      builder.hostnameVerifier(new HostnameVerifier() {
        @Override
        public boolean verify(String hostname, SSLSession session) {
          return true;
        }
      });

      return builder;
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }
}

class GsonCustomConverterFactory extends Converter.Factory
{
  private final Gson gson;
  private final GsonConverterFactory gsonConverterFactory;

  public static GsonCustomConverterFactory create(Gson gson) {
    return new GsonCustomConverterFactory(gson);
  }

  private GsonCustomConverterFactory(Gson gson) {
    if (gson == null)
      throw new NullPointerException("gson == null");
    this.gson = gson;
    this.gsonConverterFactory = GsonConverterFactory.create(gson);
  }

  @Override
  public Converter<ResponseBody, ?> responseBodyConverter(Type type, Annotation[] annotations, Retrofit retrofit) {
    if (type.equals(String.class))
      return new GsonResponseBodyConverterToString<Object>(gson, type);
    else
      return gsonConverterFactory.responseBodyConverter(type, annotations, retrofit);
  }

  @Override
  public Converter<?, RequestBody> requestBodyConverter(Type type, Annotation[] parameterAnnotations, Annotation[] methodAnnotations, Retrofit retrofit) {
    return gsonConverterFactory.requestBodyConverter(type, parameterAnnotations, methodAnnotations, retrofit);
  }
}

/**
 * This wrapper is to take care of this case:
 * when the deserialization fails due to JsonParseException and the
 * expected type is String, then just return the body string.
 */
class GsonResponseBodyConverterToString<T> implements Converter<ResponseBody, T> {
  private final Gson gson;
  private final Type type;

  GsonResponseBodyConverterToString(Gson gson, Type type) {
    this.gson = gson;
    this.type = type;
  }

  @Override public T convert(ResponseBody value) throws IOException {
    String returned = value.string();
    try {
      return gson.fromJson(returned, type);
    }
    catch (JsonParseException e) {
      return (T) returned;
    }
  }
}
