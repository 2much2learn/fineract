package org.apache.fineract.client.services;

import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.models.PostLoansLoanIdScheduleRequest;
import org.apache.fineract.client.models.PostLoansLoanIdScheduleResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LoanReschedulingApi
 */
public class LoanReschedulingApiTest {

    private LoanReschedulingApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(LoanReschedulingApi.class);
    }


    /**
     * Calculate loan repayment schedule based on Loan term variations | Updates loan repayment schedule based on Loan term variations | Updates loan repayment schedule by removing Loan term variations
     *
     * Calculate loan repayment schedule based on Loan term variations:  Mandatory Fields: exceptions,locale,dateFormat  Updates loan repayment schedule based on Loan term variations:  Mandatory Fields: exceptions,locale,dateFormat  Updates loan repayment schedule by removing Loan term variations:  It updates the loan repayment schedule by removing Loan term variations  Showing request/response for &#x27;Updates loan repayment schedule by removing Loan term variations&#x27;
     */
    @Test
    public void calculateLoanScheduleOrSubmitVariableScheduleTest() {
        PostLoansLoanIdScheduleRequest body = null;
        Long loanId = null;
        String command = null;
        // PostLoansLoanIdScheduleResponse response = api.calculateLoanScheduleOrSubmitVariableSchedule(body, loanId, command);

        // TODO: test validations
    }
}
