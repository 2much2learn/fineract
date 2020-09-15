package org.apache.fineract.client.services;

import org.apache.fineract.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import org.apache.fineract.client.models.GetSearchResponse;
import org.apache.fineract.client.models.PostAdhocQuerySearchRequest;
import org.apache.fineract.client.models.PostAdhocQuerySearchResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface SearchApiApi {
  /**
   * Adhoc query search
   * AdHocQuery search has more search options, it is a POST request, it uses request body to send search parameters   Mandatory fields:entities  Optional fields:loanStatus, loanProducts, offices, loanDateOption, loanFromDate, loanToDate,  includeOutStandingAmountPercentage, outStandingAmountPercentageCondition,  minOutStandingAmountPercentage and maxOutStandingAmountPercentage OR outStandingAmountPercentage,  includeOutstandingAmount, outstandingAmountCondition,  minOutstandingAmount and maxOutstandingAmount OR outstandingAmount
   * @param body  (required)
   * @return Call&lt;PostAdhocQuerySearchResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("search/advance")
  Call<PostAdhocQuerySearchResponse> advancedSearch(
                    @retrofit2.http.Body PostAdhocQuerySearchRequest body    
  );

  /**
   * Retrive Adhoc Search query template
   * Mandatory Fields  search?query&#x3D;000000001 
   * @return Call&lt;GetSearchResponse&gt;
   */
  @GET("search/template")
  Call<GetSearchResponse> retrieveAdHocSearchQueryTemplate();
    

  /**
   * Search Resources
   * Example Requests:  search?query&#x3D;000000001   search?query&#x3D;Petra&amp;resource&#x3D;clients,groups   search?query&#x3D;Petra&amp;resource&#x3D;clients,groups&amp;exactMatch&#x3D;true
   * @param query query (optional)
   * @param resource resource (optional)
   * @param exactMatch exactMatch (optional, default to false)
   * @return Call&lt;GetSearchResponse&gt;
   */
  @GET("search")
  Call<GetSearchResponse> searchData(
        @retrofit2.http.Query("query") String query                ,     @retrofit2.http.Query("resource") String resource                ,     @retrofit2.http.Query("exactMatch") Boolean exactMatch                
  );

}
