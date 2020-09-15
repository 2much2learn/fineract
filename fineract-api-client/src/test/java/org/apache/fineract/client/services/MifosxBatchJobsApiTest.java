package org.apache.fineract.client.services;

import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.models.GetJobsJobIDJobRunHistoryResponse;
import org.apache.fineract.client.models.GetJobsResponse;
import org.apache.fineract.client.models.PutJobsJobIDRequest;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MifosxBatchJobsApi
 */
public class MifosxBatchJobsApiTest {

    private MifosxBatchJobsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(MifosxBatchJobsApi.class);
    }


    /**
     * Run a Job
     *
     * Manually Execute Specific Job.
     */
    @Test
    public void executeJobTest() {
        Long jobId = null;
        String command = null;
        // Void response = api.executeJob(jobId, command);

        // TODO: test validations
    }

    /**
     * Retrieve Scheduler Jobs
     *
     * Returns the list of jobs.  Example Requests:  jobs
     */
    @Test
    public void retrieveAll8Test() {
        // List<GetJobsResponse> response = api.retrieveAll8();

        // TODO: test validations
    }

    /**
     * Retrieve Job Run History
     *
     * Example Requests:  jobs/5/runhistory?offset&#x3D;0&amp;limit&#x3D;200
     */
    @Test
    public void retrieveHistoryTest() {
        Long jobId = null;
        Integer offset = null;
        Integer limit = null;
        String orderBy = null;
        String sortOrder = null;
        // GetJobsJobIDJobRunHistoryResponse response = api.retrieveHistory(jobId, offset, limit, orderBy, sortOrder);

        // TODO: test validations
    }

    /**
     * Retrieve a Job
     *
     * Returns the details of a Job.  Example Requests:  jobs/5
     */
    @Test
    public void retrieveOne5Test() {
        Long jobId = null;
        // GetJobsResponse response = api.retrieveOne5(jobId);

        // TODO: test validations
    }

    /**
     * Update a Job
     *
     * Updates the details of a job.
     */
    @Test
    public void updateJobDetailTest() {
        PutJobsJobIDRequest body = null;
        Long jobId = null;
        // Void response = api.updateJobDetail(body, jobId);

        // TODO: test validations
    }
}
