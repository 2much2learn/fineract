package org.apache.fineract.client.services;

import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.models.DeleteReportMailingJobsRequest;
import org.apache.fineract.client.models.DeleteReportMailingJobsResponse;
import org.apache.fineract.client.models.GetReportMailingJobsResponse;
import org.apache.fineract.client.models.GetReportMailingJobsTemplate;
import org.apache.fineract.client.models.PostReportMailingJobsRequest;
import org.apache.fineract.client.models.PostReportMailingJobsResponse;
import org.apache.fineract.client.models.PutReportMailingJobsRequest;
import org.apache.fineract.client.models.PutReportMailingJobsResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ReportMailingJobsApi
 */
public class ReportMailingJobsApiTest {

    private ReportMailingJobsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(ReportMailingJobsApi.class);
    }


    /**
     * Create a Report Mailing Job
     *
     * Mandatory Fields: name, startDateTime, stretchyReportId, emailRecipients, emailSubject, emailMessage, emailAttachmentFileFormatId, recurrence, isActive  Optional Fields: description, stretchyReportParamMap
     */
    @Test
    public void createReportMailingJobTest() {
        PostReportMailingJobsRequest body = null;
        // PostReportMailingJobsResponse response = api.createReportMailingJob(body);

        // TODO: test validations
    }

    /**
     * Delete a Report Mailing Job
     *
     * 
     */
    @Test
    public void deleteReportMailingJobTest() {
        DeleteReportMailingJobsRequest body = null;
        Long entityId = null;
        // DeleteReportMailingJobsResponse response = api.deleteReportMailingJob(body, entityId);

        // TODO: test validations
    }

    /**
     * List Report Mailing Jobs
     *
     * Example Requests:  reportmailingjobs
     */
    @Test
    public void retrieveAllReportMailingJobsTest() {
        Integer offset = null;
        Integer limit = null;
        String orderBy = null;
        String sortOrder = null;
        // List<GetReportMailingJobsResponse> response = api.retrieveAllReportMailingJobs(offset, limit, orderBy, sortOrder);

        // TODO: test validations
    }

    /**
     * Retrieve a Report Mailing Job
     *
     * Example Requests:  reportmailingjobs/1   reportmailingjobs/1?template&#x3D;true
     */
    @Test
    public void retrieveReportMailingJobTest() {
        Long entityId = null;
        // GetReportMailingJobsResponse response = api.retrieveReportMailingJob(entityId);

        // TODO: test validations
    }

    /**
     * Retrieve Report Mailing Job Details Template
     *
     * This is a convenience resource. It can be useful when building maintenance user interface screens for report mailing job applications. The template data returned consists of any or all of:  Field Defaults Allowed description Lists Example Request:  reportmailingjobs/template
     */
    @Test
    public void retrieveReportMailingJobTemplateTest() {
        // GetReportMailingJobsTemplate response = api.retrieveReportMailingJobTemplate();

        // TODO: test validations
    }

    /**
     * Update a Report Mailing Job 
     *
     * 
     */
    @Test
    public void updateReportMailingJobTest() {
        PutReportMailingJobsRequest body = null;
        Long entityId = null;
        // PutReportMailingJobsResponse response = api.updateReportMailingJob(body, entityId);

        // TODO: test validations
    }
}
