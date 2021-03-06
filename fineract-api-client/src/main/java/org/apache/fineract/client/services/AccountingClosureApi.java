package org.apache.fineract.client.services;

import org.apache.fineract.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import org.apache.fineract.client.models.DeleteGlClosuresResponse;
import org.apache.fineract.client.models.GetGlClosureResponse;
import org.apache.fineract.client.models.PostGlClosuresRequest;
import org.apache.fineract.client.models.PostGlClosuresResponse;
import org.apache.fineract.client.models.PutGlClosuresRequest;
import org.apache.fineract.client.models.PutGlClosuresResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface AccountingClosureApi {
  /**
   * Create an Accounting Closure
   * Mandatory Fields officeId,closingDate
   * @param body  (required)
   * @return Call&lt;PostGlClosuresResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("glclosures")
  Call<PostGlClosuresResponse> createGLClosure(
                    @retrofit2.http.Body PostGlClosuresRequest body    
  );

  /**
   * Delete an accounting closure
   * Note: Only the latest accounting closure associated with a branch may be deleted.
   * @param glClosureId glclosureId (required)
   * @return Call&lt;DeleteGlClosuresResponse&gt;
   */
  @DELETE("glclosures/{glClosureId}")
  Call<DeleteGlClosuresResponse> deleteGLClosure(
            @retrofit2.http.Path("glClosureId") Long glClosureId            
  );

  /**
   * Retrieve an Accounting Closure
   * Example Requests:  glclosures/1   /glclosures/1?fields&#x3D;officeName,closingDate
   * @param glClosureId glClosureId (required)
   * @return Call&lt;GetGlClosureResponse&gt;
   */
  @GET("glclosures/{glClosureId}")
  Call<GetGlClosureResponse> retreiveClosure(
            @retrofit2.http.Path("glClosureId") Long glClosureId            
  );

  /**
   * List Accounting closures
   * Example Requests:  glclosures
   * @param officeId  (optional)
   * @return Call&lt;List&lt;GetGlClosureResponse&gt;&gt;
   */
  @GET("glclosures")
  Call<List<GetGlClosureResponse>> retrieveAllClosures(
        @retrofit2.http.Query("officeId") Long officeId                
  );

  /**
   * Update an Accounting closure
   * Once an accounting closure is created, only the comments associated with it may be edited
   * @param glClosureId glClosureId (required)
   * @param body  (optional)
   * @return Call&lt;PutGlClosuresResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("glclosures/{glClosureId}")
  Call<PutGlClosuresResponse> updateGLClosure(
            @retrofit2.http.Path("glClosureId") Long glClosureId            ,                 @retrofit2.http.Body PutGlClosuresRequest body    
  );

}
