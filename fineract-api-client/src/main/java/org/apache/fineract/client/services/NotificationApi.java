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

public interface NotificationApi {
  /**
   * 
   * 
   * @param orderBy  (optional)
   * @param limit  (optional)
   * @param offset  (optional)
   * @param sortOrder  (optional)
   * @param isRead  (optional)
   * @return Call&lt;String&gt;
   */
  @GET("notifications")
  Call<String> getAllNotifications(
        @retrofit2.http.Query("orderBy") String orderBy                ,     @retrofit2.http.Query("limit") Integer limit                ,     @retrofit2.http.Query("offset") Integer offset                ,     @retrofit2.http.Query("sortOrder") String sortOrder                ,     @retrofit2.http.Query("isRead") Boolean isRead                
  );

  /**
   * 
   * 
   * @return Call&lt;Void&gt;
   */
  @PUT("notifications")
  Call<Void> update5();
    

}
