package org.apache.fineract.client.services;

import org.apache.fineract.client.ApiClient;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SelfLoanProductsApi
 */
public class SelfLoanProductsApiTest {

    private SelfLoanProductsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(SelfLoanProductsApi.class);
    }


    /**
     * 
     *
     * 
     */
    @Test
    public void retrieveAllLoanProducts1Test() {
        Long clientId = null;
        // String response = api.retrieveAllLoanProducts1(clientId);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void retrieveLoanProductDetails1Test() {
        Long productId = null;
        Long clientId = null;
        // String response = api.retrieveLoanProductDetails1(productId, clientId);

        // TODO: test validations
    }
}
