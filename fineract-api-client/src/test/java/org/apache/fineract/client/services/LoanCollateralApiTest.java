package org.apache.fineract.client.services;

import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.models.DeleteLoansLoanIdCollateralsCollateralIdResponse;
import org.apache.fineract.client.models.GetLoansLoanIdCollateralsResponse;
import org.apache.fineract.client.models.GetLoansLoanIdCollateralsTemplateResponse;
import org.apache.fineract.client.models.PostLoansLoanIdCollateralsRequest;
import org.apache.fineract.client.models.PostLoansLoanIdCollateralsResponse;
import org.apache.fineract.client.models.PutLoansLoanIdCollateralsCollateralIdResponse;
import org.apache.fineract.client.models.PutLoansLoandIdCollateralsCollateralIdRequest;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LoanCollateralApi
 */
public class LoanCollateralApiTest {

    private LoanCollateralApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(LoanCollateralApi.class);
    }


    /**
     * Create a Collateral
     *
     * Note: Currently, Collaterals may be added only before a Loan is approved
     */
    @Test
    public void createCollateralTest() {
        PostLoansLoanIdCollateralsRequest body = null;
        Long loanId = null;
        // PostLoansLoanIdCollateralsResponse response = api.createCollateral(body, loanId);

        // TODO: test validations
    }

    /**
     * Remove a Collateral
     *
     * Note: A collateral can only be removed from Loans that are not yet approved.
     */
    @Test
    public void deleteCollateralTest() {
        Long loanId = null;
        Long collateralId = null;
        // DeleteLoansLoanIdCollateralsCollateralIdResponse response = api.deleteCollateral(loanId, collateralId);

        // TODO: test validations
    }

    /**
     * Retrieve Collateral Details Template
     *
     * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists Example Request:  loans/1/collaterals/template
     */
    @Test
    public void newCollateralTemplateTest() {
        Long loanId = null;
        // GetLoansLoanIdCollateralsTemplateResponse response = api.newCollateralTemplate(loanId);

        // TODO: test validations
    }

    /**
     * List Loan Collaterals
     *
     * Example Requests:  loans/1/collaterals   loans/1/collaterals?fields&#x3D;value,description
     */
    @Test
    public void retrieveCollateralDetailsTest() {
        Long loanId = null;
        // List<GetLoansLoanIdCollateralsResponse> response = api.retrieveCollateralDetails(loanId);

        // TODO: test validations
    }

    /**
     * Retrieve a Collateral
     *
     * Example Requests:  /loans/1/collaterals/1   /loans/1/collaterals/1?fields&#x3D;description,description
     */
    @Test
    public void retrieveCollateralDetails1Test() {
        Long loanId = null;
        Long collateralId = null;
        // GetLoansLoanIdCollateralsResponse response = api.retrieveCollateralDetails1(loanId, collateralId);

        // TODO: test validations
    }

    /**
     * Update a Collateral
     *
     * 
     */
    @Test
    public void updateCollateralTest() {
        PutLoansLoandIdCollateralsCollateralIdRequest body = null;
        Long loanId = null;
        Long collateralId = null;
        // PutLoansLoanIdCollateralsCollateralIdResponse response = api.updateCollateral(body, loanId, collateralId);

        // TODO: test validations
    }
}
