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
 * API tests for SelfSpmApi
 */
public class SelfSpmApiTest {

    private SelfSpmApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(SelfSpmApi.class);
    }


    /**
     * 
     *
     * 
     */
    @Test
    public void fetchAllSurveysTest() {
        // List<SurveyData> response = api.fetchAllSurveys();

        // TODO: test validations
    }
}
