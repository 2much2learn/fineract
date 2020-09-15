package org.apache.fineract.client.services;

import org.apache.fineract.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import org.apache.fineract.client.models.PostAuthenticationResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface AuthenticationHttpBasicApi {
  /**
   * Verify authentication
   * Authenticates the credentials provided and returns the set roles and permissions allowed.
   * @param body  (optional)
   * @return Call&lt;PostAuthenticationResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("authentication")
  Call<PostAuthenticationResponse> authenticate(
                    @retrofit2.http.Body String body    
  );

}
