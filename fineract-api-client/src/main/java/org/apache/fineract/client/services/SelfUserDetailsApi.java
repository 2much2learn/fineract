package org.apache.fineract.client.services;

import org.apache.fineract.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import org.apache.fineract.client.models.GetSelfUserDetailsResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface SelfUserDetailsApi {
  /**
   * Fetch authenticated user details
   * Checks the Authentication and returns the set roles and permissions allowed  For more info visit this link - https://demo.fineract.dev/fineract-provider/api-docs/apiLive.htm#selfoauth
   * @param accessToken äccess_token (optional)
   * @return Call&lt;GetSelfUserDetailsResponse&gt;
   */
  @GET("self/userdetails")
  Call<GetSelfUserDetailsResponse> fetchAuthenticatedUserData1(
        @retrofit2.http.Query("access_token") String accessToken                
  );

}
