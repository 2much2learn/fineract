package org.apache.fineract.client.services;

import org.apache.fineract.client.ApiClient;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CashierJournalsApi
 */
public class CashierJournalsApiTest {

    private CashierJournalsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(CashierJournalsApi.class);
    }


    /**
     * 
     *
     * 
     */
    @Test
    public void getJournalData1Test() {
        Long officeId = null;
        Long tellerId = null;
        Long cashierId = null;
        String dateRange = null;
        // String response = api.getJournalData1(officeId, tellerId, cashierId, dateRange);

        // TODO: test validations
    }
}
