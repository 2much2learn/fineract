package org.apache.fineract.client.services;

import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.models.GetRunReportResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SelfRunReportApi
 */
public class SelfRunReportApiTest {

    private SelfRunReportApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(SelfRunReportApi.class);
    }


    /**
     * Running A Report
     *
     * Example Requests:   self/runreports/Client%20Details?R_officeId&#x3D;1   self/runreports/Client%20Details?R_officeId&#x3D;1&amp;exportCSV&#x3D;true
     */
    @Test
    public void runReport1Test() {
        String reportName = null;
        // GetRunReportResponse response = api.runReport1(reportName);

        // TODO: test validations
    }
}
