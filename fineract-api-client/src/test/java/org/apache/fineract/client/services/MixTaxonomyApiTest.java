package org.apache.fineract.client.services;

import org.apache.fineract.client.ApiClient;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MixTaxonomyApi
 */
public class MixTaxonomyApiTest {

    private MixTaxonomyApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(MixTaxonomyApi.class);
    }


    /**
     * 
     *
     * 
     */
    @Test
    public void retrieveAll14Test() {
        // String response = api.retrieveAll14();

        // TODO: test validations
    }
}
