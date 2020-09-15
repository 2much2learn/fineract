package org.apache.fineract.client.services;

import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.models.GetSelfSavingsAccountsAccountIdChargesResponse;
import org.apache.fineract.client.models.GetSelfSavingsAccountsAccountIdChargesSavingsAccountChargeIdResponse;
import org.apache.fineract.client.models.GetSelfSavingsAccountsAccountIdTransactionsTransactionIdResponse;
import org.apache.fineract.client.models.GetSelfSavingsAccountsResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SelfSavingsAccountApi
 */
public class SelfSavingsAccountApiTest {

    private SelfSavingsAccountApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(SelfSavingsAccountApi.class);
    }


    /**
     * 
     *
     * 
     */
    @Test
    public void modifySavingsAccountApplicationTest() {
        Long accountId = null;
        String body = null;
        String command = null;
        // String response = api.modifySavingsAccountApplication(accountId, body, command);

        // TODO: test validations
    }

    /**
     * List Savings Charges
     *
     * Lists Savings Charges  Example Requests:  self/savingsaccounts/1/charges  self/savingsaccounts/1/charges?chargeStatus&#x3D;inactive  self/savingsaccounts/1/charges?fields&#x3D;name,amountOrPercentage
     */
    @Test
    public void retrieveAllSavingsAccountCharges1Test() {
        Long accountId = null;
        String chargeStatus = null;
        // List<GetSelfSavingsAccountsAccountIdChargesResponse> response = api.retrieveAllSavingsAccountCharges1(accountId, chargeStatus);

        // TODO: test validations
    }

    /**
     * Retrieve a savings account
     *
     * Retrieves a savings account  Example Requests :  self/savingsaccounts/1   self/savingsaccounts/1?associations&#x3D;transactions
     */
    @Test
    public void retrieveSavingsTest() {
        Long accountId = null;
        String chargeStatus = null;
        // GetSelfSavingsAccountsResponse response = api.retrieveSavings(accountId, chargeStatus);

        // TODO: test validations
    }

    /**
     * Retrieve a Savings account Charge
     *
     * Retrieves a Savings account Charge  Example Requests:  self/savingsaccounts/1/charges/5   self/savingsaccounts/1/charges/5?fields&#x3D;name,amountOrPercentage
     */
    @Test
    public void retrieveSavingsAccountCharge1Test() {
        Long accountId = null;
        Long savingsAccountChargeId = null;
        // GetSelfSavingsAccountsAccountIdChargesSavingsAccountChargeIdResponse response = api.retrieveSavingsAccountCharge1(accountId, savingsAccountChargeId);

        // TODO: test validations
    }

    /**
     * Retrieve Savings Account Transaction
     *
     * Retrieves Savings Account Transaction  Example Requests:  self/savingsaccounts/1/transactions/1
     */
    @Test
    public void retrieveSavingsTransactionTest() {
        Long accountId = null;
        Long transactionId = null;
        // GetSelfSavingsAccountsAccountIdTransactionsTransactionIdResponse response = api.retrieveSavingsTransaction(accountId, transactionId);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void submitSavingsAccountApplicationTest() {
        String body = null;
        String command = null;
        // String response = api.submitSavingsAccountApplication(body, command);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void template18Test() {
        Long clientId = null;
        Long productId = null;
        // String response = api.template18(clientId, productId);

        // TODO: test validations
    }
}
