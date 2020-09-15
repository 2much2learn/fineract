package org.apache.fineract.client.services;

import org.apache.fineract.client.ApiClient;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SelfDividendApi
 */
public class SelfDividendApiTest {

    private SelfDividendApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(SelfDividendApi.class);
    }


    /**
     * 
     *
     * 
     */
    @Test
    public void createDividendDetailTest() {
        Long productId = null;
        String body = null;
        // String response = api.createDividendDetail(productId, body);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void deleteDividendDetailTest() {
        Long productId = null;
        Long dividendId = null;
        // String response = api.deleteDividendDetail(productId, dividendId);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void retrieveAll38Test() {
        Long productId = null;
        Integer offset = null;
        Integer limit = null;
        String orderBy = null;
        String sortOrder = null;
        Integer status = null;
        // String response = api.retrieveAll38(productId, offset, limit, orderBy, sortOrder, status);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void retrieveDividendDetailsTest() {
        Long dividendId = null;
        Long productId = null;
        Integer offset = null;
        Integer limit = null;
        String orderBy = null;
        String sortOrder = null;
        String accountNo = null;
        // String response = api.retrieveDividendDetails(dividendId, productId, offset, limit, orderBy, sortOrder, accountNo);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void updateDividendDetailTest() {
        Long productId = null;
        Long dividendId = null;
        String body = null;
        String command = null;
        // String response = api.updateDividendDetail(productId, dividendId, body, command);

        // TODO: test validations
    }
}
