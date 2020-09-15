package org.apache.fineract.client.services;

import org.apache.fineract.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface SelfServiceRegistrationApi {
  /**
   * 
   * 
   * @param body  (optional)
   * @return Call&lt;String&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @POST("self/registration")
  Call<String> createSelfServiceRegistrationRequest(
                    @retrofit2.http.Body String body    
  );

  /**
   * 
   * 
   * @param body  (optional)
   * @return Call&lt;String&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @POST("self/registration/user")
  Call<String> createSelfServiceUser(
                    @retrofit2.http.Body String body    
  );

}
