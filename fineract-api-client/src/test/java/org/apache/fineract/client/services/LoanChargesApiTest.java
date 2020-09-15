package org.apache.fineract.client.services;

import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.models.DeleteLoansLoanIdChargesChargeIdResponse;
import org.apache.fineract.client.models.GetLoansLoanIdChargesChargeIdResponse;
import org.apache.fineract.client.models.GetLoansLoanIdChargesTemplateResponse;
import org.apache.fineract.client.models.PostLoansLoanIdChargesChargeIdRequest;
import org.apache.fineract.client.models.PostLoansLoanIdChargesChargeIdResponse;
import org.apache.fineract.client.models.PostLoansLoanIdChargesRequest;
import org.apache.fineract.client.models.PostLoansLoanIdChargesResponse;
import org.apache.fineract.client.models.PutLoansLoanIdChargesChargeIdRequest;
import org.apache.fineract.client.models.PutLoansLoanIdChargesChargeIdResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LoanChargesApi
 */
public class LoanChargesApiTest {

    private LoanChargesApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(LoanChargesApi.class);
    }


    /**
     * Delete a Loan Charge
     *
     * Note: Currently, A Loan Charge may only be removed from Loans that are not yet approved.
     */
    @Test
    public void deleteLoanChargeTest() {
        Long loanId = null;
        Long chargeId = null;
        // DeleteLoansLoanIdChargesChargeIdResponse response = api.deleteLoanCharge(loanId, chargeId);

        // TODO: test validations
    }

    /**
     * Pay Loan Charge
     *
     * Loan Charge will be paid if the loan is linked with a savings account
     */
    @Test
    public void executeLoanChargeTest() {
        PostLoansLoanIdChargesChargeIdRequest body = null;
        Long loanId = null;
        Long chargeId = null;
        String command = null;
        // PostLoansLoanIdChargesChargeIdResponse response = api.executeLoanCharge(body, loanId, chargeId, command);

        // TODO: test validations
    }

    /**
     * Create a Loan Charge
     *
     * It Creates a Loan Charge
     */
    @Test
    public void executeLoanCharge1Test() {
        PostLoansLoanIdChargesRequest body = null;
        Long loanId = null;
        String command = null;
        // PostLoansLoanIdChargesResponse response = api.executeLoanCharge1(body, loanId, command);

        // TODO: test validations
    }

    /**
     * List Loan Charges
     *
     * It lists all the Loan Charges specific to a Loan   Example Requests:  loans/1/charges   loans/1/charges?fields&#x3D;name,amountOrPercentage
     */
    @Test
    public void retrieveAllLoanChargesTest() {
        Long loanId = null;
        // List<GetLoansLoanIdChargesChargeIdResponse> response = api.retrieveAllLoanCharges(loanId);

        // TODO: test validations
    }

    /**
     * Retrieve a Loan Charge
     *
     * Retrieves Loan Charge according to the Loan ID and Charge IDExample Requests:  /loans/1/charges/1   /loans/1/charges/1?fields&#x3D;name,amountOrPercentage
     */
    @Test
    public void retrieveLoanChargeTest() {
        Long loanId = null;
        Long chargeId = null;
        // GetLoansLoanIdChargesChargeIdResponse response = api.retrieveLoanCharge(loanId, chargeId);

        // TODO: test validations
    }

    /**
     * Retrieve Loan Charges Template
     *
     * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed description Lists Example Request:  loans/1/charges/template  
     */
    @Test
    public void retrieveTemplate8Test() {
        Long loanId = null;
        // GetLoansLoanIdChargesTemplateResponse response = api.retrieveTemplate8(loanId);

        // TODO: test validations
    }

    /**
     * Update a Loan Charge
     *
     * Currently Loan Charges may be updated only if the Loan is not yet approved
     */
    @Test
    public void updateLoanChargeTest() {
        PutLoansLoanIdChargesChargeIdRequest body = null;
        Long loanId = null;
        Long chargeId = null;
        // PutLoansLoanIdChargesChargeIdResponse response = api.updateLoanCharge(body, loanId, chargeId);

        // TODO: test validations
    }
}
