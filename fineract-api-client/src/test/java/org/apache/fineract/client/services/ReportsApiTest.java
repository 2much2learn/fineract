package org.apache.fineract.client.services;

import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.models.DeleteReportsResponse;
import org.apache.fineract.client.models.GetReportsResponse;
import org.apache.fineract.client.models.GetReportsTemplateResponse;
import org.apache.fineract.client.models.PostReportsResponse;
import org.apache.fineract.client.models.PostRepostRequest;
import org.apache.fineract.client.models.PutReportRequest;
import org.apache.fineract.client.models.PutReportResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ReportsApi
 */
public class ReportsApiTest {

    private ReportsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(ReportsApi.class);
    }


    /**
     * Create a Report
     *
     * 
     */
    @Test
    public void createReportTest() {
        PostRepostRequest body = null;
        // PostReportsResponse response = api.createReport(body);

        // TODO: test validations
    }

    /**
     * Delete a Report
     *
     * Only non-core reports can be deleted.
     */
    @Test
    public void deleteReportTest() {
        Long id = null;
        // DeleteReportsResponse response = api.deleteReport(id);

        // TODO: test validations
    }

    /**
     * Retrieve Report Template
     *
     * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed description Lists  Example Request :   reports/template
     */
    @Test
    public void retrieveOfficeTemplateTest() {
        // GetReportsTemplateResponse response = api.retrieveOfficeTemplate();

        // TODO: test validations
    }

    /**
     * Retrieve a Report 
     *
     * Example Requests:  reports/1   reports/1?template&#x3D;true
     */
    @Test
    public void retrieveReportTest() {
        Long id = null;
        // GetReportsResponse response = api.retrieveReport(id);

        // TODO: test validations
    }

    /**
     * List Reports
     *
     * Lists all reports and their parameters.  Example Request:  reports
     */
    @Test
    public void retrieveReportListTest() {
        // List<GetReportsResponse> response = api.retrieveReportList();

        // TODO: test validations
    }

    /**
     * Update a Report
     *
     * Only the useReport description can be updated for core reports.
     */
    @Test
    public void updateReportTest() {
        PutReportRequest body = null;
        Long id = null;
        // PutReportResponse response = api.updateReport(body, id);

        // TODO: test validations
    }
}
