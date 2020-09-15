package org.apache.fineract.client.services;

import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.models.DateParam;
import org.apache.fineract.client.models.DeleteHolidaysHolidayIdResponse;
import org.apache.fineract.client.models.GetHolidaysResponse;
import org.apache.fineract.client.models.PostHolidaysHolidayIdRequest;
import org.apache.fineract.client.models.PostHolidaysHolidayIdResponse;
import org.apache.fineract.client.models.PostHolidaysRequest;
import org.apache.fineract.client.models.PostHolidaysResponse;
import org.apache.fineract.client.models.PutHolidaysHolidayIdRequest;
import org.apache.fineract.client.models.PutHolidaysHolidayIdResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for HolidaysApi
 */
public class HolidaysApiTest {

    private HolidaysApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(HolidaysApi.class);
    }


    /**
     * Create a Holiday
     *
     * Mandatory Fields: name, description, fromDate, toDate, repaymentsRescheduledTo, offices
     */
    @Test
    public void createNewHolidayTest() {
        PostHolidaysRequest body = null;
        // PostHolidaysResponse response = api.createNewHoliday(body);

        // TODO: test validations
    }

    /**
     * Delete a Holiday
     *
     * This API allows to delete a holiday. This is a soft delete the deleted holiday status is marked as deleted.
     */
    @Test
    public void delete7Test() {
        Long holidayId = null;
        // DeleteHolidaysHolidayIdResponse response = api.delete7(holidayId);

        // TODO: test validations
    }

    /**
     * Activate a Holiday
     *
     * Always Holidays are created in pending state. This API allows to activate a holiday.  Only the active holidays are considered for rescheduling the loan repayment.
     */
    @Test
    public void handleCommands1Test() {
        PostHolidaysHolidayIdRequest body = null;
        Long holidayId = null;
        String command = null;
        // PostHolidaysHolidayIdResponse response = api.handleCommands1(body, holidayId, command);

        // TODO: test validations
    }

    /**
     * List Holidays
     *
     * Example Requests:  holidays?officeId&#x3D;1
     */
    @Test
    public void retrieveAllHolidaysTest() {
        Long officeId = null;
        DateParam fromDate = null;
        DateParam toDate = null;
        String locale = null;
        String dateFormat = null;
        // List<GetHolidaysResponse> response = api.retrieveAllHolidays(officeId, fromDate, toDate, locale, dateFormat);

        // TODO: test validations
    }

    /**
     * Retrieve a Holiday
     *
     * Example Requests:  holidays/1
     */
    @Test
    public void retrieveOne7Test() {
        Long holidayId = null;
        // GetHolidaysResponse response = api.retrieveOne7(holidayId);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void retrieveRepaymentScheduleUpdationTyeOptionsTest() {
        // String response = api.retrieveRepaymentScheduleUpdationTyeOptions();

        // TODO: test validations
    }

    /**
     * Update a Holiday
     *
     * If a holiday is in pending state (created and not activated) then all fields are allowed to modify. Once holidays become active only name and descriptions are allowed to modify.
     */
    @Test
    public void update6Test() {
        PutHolidaysHolidayIdRequest body = null;
        Long holidayId = null;
        // PutHolidaysHolidayIdResponse response = api.update6(body, holidayId);

        // TODO: test validations
    }
}
