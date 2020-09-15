package org.apache.fineract.client.services;

import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.models.SurveyData;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SpmSurveysApi
 */
public class SpmSurveysApiTest {

    private SpmSurveysApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(SpmSurveysApi.class);
    }


    /**
     * Deactivate Survey
     *
     * 
     */
    @Test
    public void activateOrDeactivateSurveyTest() {
        Long id = null;
        String command = null;
        // Void response = api.activateOrDeactivateSurvey(id, command);

        // TODO: test validations
    }

    /**
     * Create a Survey
     *
     * Adds a new survey to collect client related data.  Mandatory Fields  countryCode, key, name, questions, responses, sequenceNo, text, description
     */
    @Test
    public void createSurveyTest() {
        SurveyData body = null;
        // Void response = api.createSurvey(body);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void editSurveyTest() {
        Long id = null;
        SurveyData body = null;
        // String response = api.editSurvey(id, body);

        // TODO: test validations
    }

    /**
     * List all Surveys
     *
     * 
     */
    @Test
    public void fetchAllSurveys1Test() {
        Boolean isActive = null;
        // List<SurveyData> response = api.fetchAllSurveys1(isActive);

        // TODO: test validations
    }

    /**
     * Retrieve a Survey
     *
     * 
     */
    @Test
    public void findSurveyTest() {
        Long id = null;
        // SurveyData response = api.findSurvey(id);

        // TODO: test validations
    }
}
