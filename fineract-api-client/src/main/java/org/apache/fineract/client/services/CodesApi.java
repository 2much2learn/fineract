package org.apache.fineract.client.services;

import org.apache.fineract.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import org.apache.fineract.client.models.DeleteCodesResponse;
import org.apache.fineract.client.models.GetCodesResponse;
import org.apache.fineract.client.models.PostCodesRequest;
import org.apache.fineract.client.models.PostCodesResponse;
import org.apache.fineract.client.models.PutCodesRequest;
import org.apache.fineract.client.models.PutCodesResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface CodesApi {
  /**
   * Create a Code
   * Creates a code. Codes created through api are always &#x27;user defined&#x27; and so system defined is marked as false.
   * @param body  (required)
   * @return Call&lt;PostCodesResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("codes")
  Call<PostCodesResponse> createCode(
                    @retrofit2.http.Body PostCodesRequest body    
  );

  /**
   * Delete a Code
   * Deletes a code if it is not system defined.
   * @param codeId codeId (required)
   * @return Call&lt;DeleteCodesResponse&gt;
   */
  @DELETE("codes/{codeId}")
  Call<DeleteCodesResponse> deleteCode(
            @retrofit2.http.Path("codeId") Long codeId            
  );

  /**
   * Retrieve a Code
   * Returns the details of a Code.  Example Requests:  codes/1
   * @param codeId codeId (required)
   * @return Call&lt;GetCodesResponse&gt;
   */
  @GET("codes/{codeId}")
  Call<GetCodesResponse> retrieveCode(
            @retrofit2.http.Path("codeId") Long codeId            
  );

  /**
   * Retrieve Codes
   * Returns the list of codes.  Example Requests:  codes
   * @return Call&lt;List&lt;GetCodesResponse&gt;&gt;
   */
  @GET("codes")
  Call<List<GetCodesResponse>> retrieveCodes();
    

  /**
   * Update a Code
   * Updates the details of a code if it is not system defined.
   * @param body  (required)
   * @param codeId codeId (required)
   * @return Call&lt;PutCodesResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("codes/{codeId}")
  Call<PutCodesResponse> updateCode(
                    @retrofit2.http.Body PutCodesRequest body    ,         @retrofit2.http.Path("codeId") Long codeId            
  );

}
