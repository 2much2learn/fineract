package org.apache.fineract.client.services;

import org.apache.fineract.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import org.apache.fineract.client.models.SurveyData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface SpmSurveysApi {
  /**
   * Deactivate Survey
   * 
   * @param id  (required)
   * @param command  (optional)
   * @return Call&lt;Void&gt;
   */
  @POST("surveys/{id}")
  Call<Void> activateOrDeactivateSurvey(
            @retrofit2.http.Path("id") Long id            ,     @retrofit2.http.Query("command") String command                
  );

  /**
   * Create a Survey
   * Adds a new survey to collect client related data.  Mandatory Fields  countryCode, key, name, questions, responses, sequenceNo, text, description
   * @param body Create survey (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("surveys")
  Call<Void> createSurvey(
                    @retrofit2.http.Body SurveyData body    
  );

  /**
   * 
   * 
   * @param id  (required)
   * @param body  (optional)
   * @return Call&lt;String&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("surveys/{id}")
  Call<String> editSurvey(
            @retrofit2.http.Path("id") Long id            ,                 @retrofit2.http.Body SurveyData body    
  );

  /**
   * List all Surveys
   * 
   * @param isActive  (optional)
   * @return Call&lt;List&lt;SurveyData&gt;&gt;
   */
  @GET("surveys")
  Call<List<SurveyData>> fetchAllSurveys1(
        @retrofit2.http.Query("isActive") Boolean isActive                
  );

  /**
   * Retrieve a Survey
   * 
   * @param id Enter id (required)
   * @return Call&lt;SurveyData&gt;
   */
  @GET("surveys/{id}")
  Call<SurveyData> findSurvey(
            @retrofit2.http.Path("id") Long id            
  );

}
