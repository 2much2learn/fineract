package org.apache.fineract.client.services;

import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.models.PostRunaccrualsRequest;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PeriodicAccrualAccountingApi
 */
public class PeriodicAccrualAccountingApiTest {

    private PeriodicAccrualAccountingApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(PeriodicAccrualAccountingApi.class);
    }


    /**
     * Executes Periodic Accrual Accounting
     *
     * Mandatory Fields  tillDate 
     */
    @Test
    public void executePeriodicAccrualAccountingTest() {
        PostRunaccrualsRequest body = null;
        // Void response = api.executePeriodicAccrualAccounting(body);

        // TODO: test validations
    }
}
