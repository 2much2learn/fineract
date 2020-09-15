package org.apache.fineract.client.services;

import org.apache.fineract.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import org.apache.fineract.client.models.Scorecard;
import org.apache.fineract.client.models.ScorecardData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ScoreCardApi {
  /**
   * Create a Scorecard entry
   * Add a new entry to a survey.  Mandatory Fields clientId, createdOn, questionId, responseId, staffId
   * @param surveyId Enter surveyId (required)
   * @param body scorecardData (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("surveys/scorecards/{surveyId}")
  Call<Void> createScorecard1(
            @retrofit2.http.Path("surveyId") Long surveyId            ,                 @retrofit2.http.Body ScorecardData body    
  );

  /**
   * 
   * 
   * @param clientId  (required)
   * @return Call&lt;List&lt;ScorecardData&gt;&gt;
   */
  @GET("surveys/scorecards/clients/{clientId}")
  Call<List<ScorecardData>> findByClient1(
            @retrofit2.http.Path("clientId") Long clientId            
  );

  /**
   * List all Scorecard entries
   * List all Scorecard entries for a survey.
   * @param surveyId Enter surveyId (required)
   * @return Call&lt;List&lt;Scorecard&gt;&gt;
   */
  @GET("surveys/scorecards/{surveyId}")
  Call<List<Scorecard>> findBySurvey(
            @retrofit2.http.Path("surveyId") Long surveyId            
  );

  /**
   * 
   * 
   * @param surveyId Enter surveyId (required)
   * @param clientId Enter clientId (required)
   * @return Call&lt;List&lt;ScorecardData&gt;&gt;
   */
  @GET("surveys/scorecards/{surveyId}/clients/{clientId}")
  Call<List<ScorecardData>> findBySurveyAndClient(
            @retrofit2.http.Path("surveyId") Long surveyId            ,         @retrofit2.http.Path("clientId") Long clientId            
  );

}
