package org.apache.fineract.client.services;

import org.apache.fineract.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import org.apache.fineract.client.models.GetCachesResponse;
import org.apache.fineract.client.models.PutCachesRequest;
import org.apache.fineract.client.models.PutCachesResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface CacheApi {
  /**
   * Retrieve Cache Types
   * Returns the list of caches.  Example Requests:  caches
   * @return Call&lt;List&lt;GetCachesResponse&gt;&gt;
   */
  @GET("caches")
  Call<List<GetCachesResponse>> retrieveAll4();
    

  /**
   * Switch Cache
   * Switches the cache to chosen one.
   * @param body  (required)
   * @return Call&lt;PutCachesResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("caches")
  Call<PutCachesResponse> switchCache(
                    @retrofit2.http.Body PutCachesRequest body    
  );

}
