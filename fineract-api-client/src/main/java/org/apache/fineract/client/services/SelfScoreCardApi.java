package org.apache.fineract.client.services;

import org.apache.fineract.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import org.apache.fineract.client.models.ScorecardData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface SelfScoreCardApi {
  /**
   * 
   * 
   * @param surveyId  (required)
   * @param body  (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("self/surveys/scorecards/{surveyId}")
  Call<Void> createScorecard(
            @retrofit2.http.Path("surveyId") Long surveyId            ,                 @retrofit2.http.Body ScorecardData body    
  );

  /**
   * 
   * 
   * @param clientId  (required)
   * @return Call&lt;List&lt;ScorecardData&gt;&gt;
   */
  @GET("self/surveys/scorecards/clients/{clientId}")
  Call<List<ScorecardData>> findByClient(
            @retrofit2.http.Path("clientId") Long clientId            
  );

}
