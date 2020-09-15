package org.apache.fineract.client.services;

import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.models.Scorecard;
import org.apache.fineract.client.models.ScorecardData;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ScoreCardApi
 */
public class ScoreCardApiTest {

    private ScoreCardApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(ScoreCardApi.class);
    }


    /**
     * Create a Scorecard entry
     *
     * Add a new entry to a survey.  Mandatory Fields clientId, createdOn, questionId, responseId, staffId
     */
    @Test
    public void createScorecard1Test() {
        Long surveyId = null;
        ScorecardData body = null;
        // Void response = api.createScorecard1(surveyId, body);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void findByClient1Test() {
        Long clientId = null;
        // List<ScorecardData> response = api.findByClient1(clientId);

        // TODO: test validations
    }

    /**
     * List all Scorecard entries
     *
     * List all Scorecard entries for a survey.
     */
    @Test
    public void findBySurveyTest() {
        Long surveyId = null;
        // List<Scorecard> response = api.findBySurvey(surveyId);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void findBySurveyAndClientTest() {
        Long surveyId = null;
        Long clientId = null;
        // List<ScorecardData> response = api.findBySurveyAndClient(surveyId, clientId);

        // TODO: test validations
    }
}
