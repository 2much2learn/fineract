package org.apache.fineract.client.services;

import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.models.GetFloatingRatesFloatingRateIdResponse;
import org.apache.fineract.client.models.GetFloatingRatesResponse;
import org.apache.fineract.client.models.PostFloatingRatesRequest;
import org.apache.fineract.client.models.PostFloatingRatesResponse;
import org.apache.fineract.client.models.PutFloatingRatesFloatingRateIdRequest;
import org.apache.fineract.client.models.PutFloatingRatesFloatingRateIdResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FloatingRatesApi
 */
public class FloatingRatesApiTest {

    private FloatingRatesApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(FloatingRatesApi.class);
    }


    /**
     * Create a new Floating Rate
     *
     * Creates a new Floating Rate Mandatory Fields: name Optional Fields: isBaseLendingRate, isActive, ratePeriods
     */
    @Test
    public void createFloatingRateTest() {
        PostFloatingRatesRequest body = null;
        // PostFloatingRatesResponse response = api.createFloatingRate(body);

        // TODO: test validations
    }

    /**
     * List Floating Rates
     *
     * Lists Floating Rates
     */
    @Test
    public void retrieveAll21Test() {
        // List<GetFloatingRatesResponse> response = api.retrieveAll21();

        // TODO: test validations
    }

    /**
     * Retrieve Floating Rate
     *
     * Retrieves Floating Rate
     */
    @Test
    public void retrieveOne11Test() {
        Long floatingRateId = null;
        // GetFloatingRatesFloatingRateIdResponse response = api.retrieveOne11(floatingRateId);

        // TODO: test validations
    }

    /**
     * Update Floating Rate
     *
     * Updates new Floating Rate. Rate Periods in the past cannot be modified. All the future rateperiods would be replaced with the new ratePeriods data sent.
     */
    @Test
    public void updateFloatingRateTest() {
        PutFloatingRatesFloatingRateIdRequest body = null;
        Long floatingRateId = null;
        // PutFloatingRatesFloatingRateIdResponse response = api.updateFloatingRate(body, floatingRateId);

        // TODO: test validations
    }
}
