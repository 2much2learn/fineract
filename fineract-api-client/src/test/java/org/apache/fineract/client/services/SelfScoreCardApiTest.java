package org.apache.fineract.client.services;

import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.models.ScorecardData;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SelfScoreCardApi
 */
public class SelfScoreCardApiTest {

    private SelfScoreCardApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(SelfScoreCardApi.class);
    }


    /**
     * 
     *
     * 
     */
    @Test
    public void createScorecardTest() {
        Long surveyId = null;
        ScorecardData body = null;
        // Void response = api.createScorecard(surveyId, body);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void findByClientTest() {
        Long clientId = null;
        // List<ScorecardData> response = api.findByClient(clientId);

        // TODO: test validations
    }
}
