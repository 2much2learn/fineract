package org.apache.fineract.client.services;

import org.apache.fineract.client.ApiClient;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MixMappingApi
 */
public class MixMappingApiTest {

    private MixMappingApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(MixMappingApi.class);
    }


    /**
     * 
     *
     * 
     */
    @Test
    public void retrieveTaxonomyMappingTest() {
        // String response = api.retrieveTaxonomyMapping();

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void updateTaxonomyMappingTest() {
        String body = null;
        // String response = api.updateTaxonomyMapping(body);

        // TODO: test validations
    }
}
