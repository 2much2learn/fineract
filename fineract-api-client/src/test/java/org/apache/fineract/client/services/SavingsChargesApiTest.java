package org.apache.fineract.client.services;

import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.models.DeleteSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse;
import org.apache.fineract.client.models.GetSavingsAccountsSavingsAccountIdChargesResponse;
import org.apache.fineract.client.models.GetSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse;
import org.apache.fineract.client.models.GetSavingsAccountsSavingsAccountIdChargesTemplateResponse;
import org.apache.fineract.client.models.PostSavingsAccountsSavingsAccountIdChargesRequest;
import org.apache.fineract.client.models.PostSavingsAccountsSavingsAccountIdChargesResponse;
import org.apache.fineract.client.models.PostSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdRequest;
import org.apache.fineract.client.models.PostSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse;
import org.apache.fineract.client.models.PutSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdRequest;
import org.apache.fineract.client.models.PutSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SavingsChargesApi
 */
public class SavingsChargesApiTest {

    private SavingsChargesApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(SavingsChargesApi.class);
    }


    /**
     * Create a Savings account Charge
     *
     * Creates a Savings account Charge  Mandatory Fields for Savings account Charges: chargeId, amount  chargeId, amount, dueDate, dateFormat, locale  chargeId, amount, feeOnMonthDay, monthDayFormat, locale
     */
    @Test
    public void addSavingsAccountChargeTest() {
        PostSavingsAccountsSavingsAccountIdChargesRequest body = null;
        Long savingsAccountId = null;
        // PostSavingsAccountsSavingsAccountIdChargesResponse response = api.addSavingsAccountCharge(body, savingsAccountId);

        // TODO: test validations
    }

    /**
     * Delete a Savings account Charge
     *
     * Note: Currently, A Savings account Charge may only be removed from Savings that are not yet approved.
     */
    @Test
    public void deleteSavingsAccountChargeTest() {
        Long savingsAccountId = null;
        Long savingsAccountChargeId = null;
        // DeleteSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse response = api.deleteSavingsAccountCharge(savingsAccountId, savingsAccountChargeId);

        // TODO: test validations
    }

    /**
     * Pay a Savings account Charge | Waive off a Savings account Charge | Inactivate a Savings account Charge
     *
     * Pay a Savings account Charge:  An active charge will be paid when savings account is active and having sufficient balance.  Waive off a Savings account Charge:  Outstanding charge amount will be waived off.  Inactivate a Savings account Charge:  A charge will be allowed to inactivate when savings account is active and not having any dues as of today. If charge is overpaid, corresponding charge payment transactions will be reversed.  Showing request/response for &#x27;Pay a Savings account Charge&#x27;
     */
    @Test
    public void payOrWaiveSavingsAccountChargeTest() {
        PostSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdRequest body = null;
        Long savingsAccountId = null;
        Long savingsAccountChargeId = null;
        String command = null;
        // PostSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse response = api.payOrWaiveSavingsAccountCharge(body, savingsAccountId, savingsAccountChargeId, command);

        // TODO: test validations
    }

    /**
     * List Savings Charges
     *
     * Lists Savings Charges  Example Requests:  savingsaccounts/1/charges  savingsaccounts/1/charges?chargeStatus&#x3D;all  savingsaccounts/1/charges?chargeStatus&#x3D;inactive  savingsaccounts/1/charges?chargeStatus&#x3D;active  savingsaccounts/1/charges?fields&#x3D;name,amountOrPercentage
     */
    @Test
    public void retrieveAllSavingsAccountChargesTest() {
        Long savingsAccountId = null;
        String chargeStatus = null;
        // List<GetSavingsAccountsSavingsAccountIdChargesResponse> response = api.retrieveAllSavingsAccountCharges(savingsAccountId, chargeStatus);

        // TODO: test validations
    }

    /**
     * Retrieve a Savings account Charge
     *
     * Retrieves a Savings account Charge  Example Requests:  /savingsaccounts/1/charges/5   /savingsaccounts/1/charges/5?fields&#x3D;name,amountOrPercentage
     */
    @Test
    public void retrieveSavingsAccountChargeTest() {
        Long savingsAccountId = null;
        Long savingsAccountChargeId = null;
        // GetSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse response = api.retrieveSavingsAccountCharge(savingsAccountId, savingsAccountChargeId);

        // TODO: test validations
    }

    /**
     * Retrieve Savings Charges Template
     *
     * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed description Lists Example Request:  savingsaccounts/1/charges/template
     */
    @Test
    public void retrieveTemplate17Test() {
        Long savingsAccountId = null;
        // GetSavingsAccountsSavingsAccountIdChargesTemplateResponse response = api.retrieveTemplate17(savingsAccountId);

        // TODO: test validations
    }

    /**
     * Update a Savings account Charge
     *
     * Currently Savings account Charges may be updated only if the Savings account is not yet approved.
     */
    @Test
    public void updateSavingsAccountChargeTest() {
        PutSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdRequest body = null;
        Long savingsAccountId = null;
        Long savingsAccountChargeId = null;
        // PutSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse response = api.updateSavingsAccountCharge(body, savingsAccountId, savingsAccountChargeId);

        // TODO: test validations
    }
}
