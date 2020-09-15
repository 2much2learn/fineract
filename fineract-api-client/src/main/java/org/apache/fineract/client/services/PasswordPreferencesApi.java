package org.apache.fineract.client.services;

import org.apache.fineract.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import org.apache.fineract.client.models.GetPasswordPreferencesTemplateResponse;
import org.apache.fineract.client.models.PutPasswordPreferencesTemplateRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface PasswordPreferencesApi {
  /**
   * 
   * 
   * @return Call&lt;GetPasswordPreferencesTemplateResponse&gt;
   */
  @GET("passwordpreferences")
  Call<GetPasswordPreferencesTemplateResponse> retrieve1();
    

  /**
   * List Application Password validation policies
   * ARGUMENTS Example Requests:  passwordpreferences
   * @return Call&lt;List&lt;GetPasswordPreferencesTemplateResponse&gt;&gt;
   */
  @GET("passwordpreferences/template")
  Call<List<GetPasswordPreferencesTemplateResponse>> template21();
    

  /**
   * Update password preferences
   * 
   * @param body  (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("passwordpreferences")
  Call<Void> update22(
                    @retrofit2.http.Body PutPasswordPreferencesTemplateRequest body    
  );

}
