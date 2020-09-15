package org.apache.fineract.client.services;

import org.apache.fineract.client.ApiClient;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CashiersApi
 */
public class CashiersApiTest {

    private CashiersApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(CashiersApi.class);
    }


    /**
     * 
     *
     * 
     */
    @Test
    public void getCashierDataTest() {
        Long officeId = null;
        Long tellerId = null;
        Long staffId = null;
        String date = null;
        // String response = api.getCashierData(officeId, tellerId, staffId, date);

        // TODO: test validations
    }
}
