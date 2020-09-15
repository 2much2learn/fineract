package org.apache.fineract.client.services;

import org.apache.fineract.client.ApiClient;
import java.time.OffsetDateTime;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MixReportApi
 */
public class MixReportApiTest {

    private MixReportApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(MixReportApi.class);
    }


    /**
     * 
     *
     * 
     */
    @Test
    public void retrieveXBRLReportTest() {
        OffsetDateTime startDate = null;
        OffsetDateTime endDate = null;
        String currency = null;
        // String response = api.retrieveXBRLReport(startDate, endDate, currency);

        // TODO: test validations
    }
}
