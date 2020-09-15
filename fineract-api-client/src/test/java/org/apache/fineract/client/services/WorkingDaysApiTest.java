package org.apache.fineract.client.services;

import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.models.GetWorkingDaysResponse;
import org.apache.fineract.client.models.GetWorkingDaysTemplateResponse;
import org.apache.fineract.client.models.PutWorkingDaysRequest;
import org.apache.fineract.client.models.PutWorkingDaysResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for WorkingDaysApi
 */
public class WorkingDaysApiTest {

    private WorkingDaysApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(WorkingDaysApi.class);
    }


    /**
     * List Working days
     *
     * Example Requests:  workingdays
     */
    @Test
    public void retrieveAll16Test() {
        // List<GetWorkingDaysResponse> response = api.retrieveAll16();

        // TODO: test validations
    }

    /**
     * Working Days Template
     *
     * This is a convenience resource. It can be useful when building maintenance user interface screens for working days.  Example Request:  workingdays/template
     */
    @Test
    public void template4Test() {
        // GetWorkingDaysTemplateResponse response = api.template4();

        // TODO: test validations
    }

    /**
     * Update a Working Day
     *
     * Mandatory Fields recurrence,repaymentRescheduleType,extendTermForDailyRepayments,locale
     */
    @Test
    public void update7Test() {
        PutWorkingDaysRequest body = null;
        // PutWorkingDaysResponse response = api.update7(body);

        // TODO: test validations
    }
}
