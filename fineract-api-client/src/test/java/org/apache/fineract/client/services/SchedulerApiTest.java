package org.apache.fineract.client.services;

import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.models.GetSchedulerResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SchedulerApi
 */
public class SchedulerApiTest {

    private SchedulerApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(SchedulerApi.class);
    }


    /**
     * Activate Scheduler Jobs | Suspend Scheduler Jobs
     *
     * Activates the scheduler job service. | Suspends the scheduler job service.
     */
    @Test
    public void changeSchedulerStatusTest() {
        String command = null;
        // Void response = api.changeSchedulerStatus(command);

        // TODO: test validations
    }

    /**
     * Retrieve Scheduler Status
     *
     * Returns the scheduler status.  Example Requests:  scheduler
     */
    @Test
    public void retrieveStatusTest() {
        // GetSchedulerResponse response = api.retrieveStatus();

        // TODO: test validations
    }
}
