package org.apache.fineract.client.services;

import org.apache.fineract.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import org.apache.fineract.client.models.GetUserDetailsResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface FetchAuthenticatedUserDetailsApi {
  /**
   * Fetch authenticated user details 
   * checks the Authentication and returns the set roles and permissions allowed.
   * @param accessToken access_token (optional)
   * @return Call&lt;GetUserDetailsResponse&gt;
   */
  @GET("userdetails")
  Call<GetUserDetailsResponse> fetchAuthenticatedUserData(
        @retrofit2.http.Query("access_token") String accessToken                
  );

}
