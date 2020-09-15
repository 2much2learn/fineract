package org.apache.fineract.client.services;

import org.apache.fineract.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import org.apache.fineract.client.models.GetGlobalConfigurationsResponse;
import org.apache.fineract.client.models.PutGlobalConfigurationsRequest;
import org.apache.fineract.client.models.PutGlobalConfigurationsResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface GlobalConfigurationApi {
  /**
   * Retrieve Global Configuration | Retrieve Global Configuration for surveys
   * Returns the list global enable/disable configurations.  Example Requests:  configurations   Returns the list global enable/disable survey configurations.  Example Requests:  configurations/survey
   * @param survey survey (optional, default to false)
   * @return Call&lt;List&lt;GetGlobalConfigurationsResponse&gt;&gt;
   */
  @GET("configurations")
  Call<List<GetGlobalConfigurationsResponse>> retrieveConfiguration(
        @retrofit2.http.Query("survey") Boolean survey                
  );

  /**
   * Retrieve Global Configuration
   * Returns a global enable/disable configurations.  Example Requests:  configurations/1
   * @param configId configId (required)
   * @return Call&lt;GetGlobalConfigurationsResponse&gt;
   */
  @GET("configurations/{configId}")
  Call<GetGlobalConfigurationsResponse> retrieveOne3(
            @retrofit2.http.Path("configId") Long configId            
  );

  /**
   * Update Global Configuration
   * Updates an enable/disable global configuration item.
   * @param body  (required)
   * @param configId configId (required)
   * @return Call&lt;PutGlobalConfigurationsResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("configurations/{configId}")
  Call<PutGlobalConfigurationsResponse> updateConfiguration1(
                    @retrofit2.http.Body PutGlobalConfigurationsRequest body    ,         @retrofit2.http.Path("configId") Long configId            
  );

}
