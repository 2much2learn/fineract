package org.apache.fineract.client.services;

import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.models.ReportMailingJobRunHistoryData;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ListReportMailingJobHistoryApi
 */
public class ListReportMailingJobHistoryApiTest {

    private ListReportMailingJobHistoryApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(ListReportMailingJobHistoryApi.class);
    }


    /**
     * List Report Mailing Job History
     *
     * The list capability of report mailing job history can support pagination and sorting.  Example Requests:  reportmailingjobrunhistory/1
     */
    @Test
    public void retrieveAllByReportMailingJobIdTest() {
        Long reportMailingJobId = null;
        Integer offset = null;
        Integer limit = null;
        String orderBy = null;
        String sortOrder = null;
        // ReportMailingJobRunHistoryData response = api.retrieveAllByReportMailingJobId(reportMailingJobId, offset, limit, orderBy, sortOrder);

        // TODO: test validations
    }
}
