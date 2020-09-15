package org.apache.fineract.client.services;

import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.models.GetSelfClientsClientIdAccountsResponse;
import org.apache.fineract.client.models.GetSelfClientsClientIdChargesChargeIdResponse;
import org.apache.fineract.client.models.GetSelfClientsClientIdChargesResponse;
import org.apache.fineract.client.models.GetSelfClientsClientIdResponse;
import org.apache.fineract.client.models.GetSelfClientsClientIdTransactionsResponse;
import org.apache.fineract.client.models.GetSelfClientsClientIdTransactionsTransactionIdResponse;
import org.apache.fineract.client.models.GetSelfClientsResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SelfClientApi
 */
public class SelfClientApiTest {

    private SelfClientApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(SelfClientApi.class);
    }


    /**
     * 
     *
     * 
     */
    @Test
    public void addNewClientImage2Test() {
        String entity = null;
        Long clientId = null;
        String body = null;
        // String response = api.addNewClientImage2(entity, clientId, body);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void deleteClientImage1Test() {
        Long clientId = null;
        // String response = api.deleteClientImage1(clientId);

        // TODO: test validations
    }

    /**
     * List Clients associated to the user
     *
     * The list capability of clients can support pagination and sorting.  Example Requests:  self/clients  self/clients?fields&#x3D;displayName,officeName  self/clients?offset&#x3D;10&amp;limit&#x3D;50  self/clients?orderBy&#x3D;displayName&amp;sortOrder&#x3D;DESC
     */
    @Test
    public void retrieveAll35Test() {
        String displayName = null;
        String firstName = null;
        String lastName = null;
        Integer offset = null;
        String status = null;
        Integer limit = null;
        String orderBy = null;
        String sortOrder = null;
        // GetSelfClientsResponse response = api.retrieveAll35(displayName, firstName, lastName, offset, status, limit, orderBy, sortOrder);

        // TODO: test validations
    }

    /**
     * List Client Charges
     *
     * The list capability of client charges supports pagination.  Example Requests:  self/clients/1/charges  self/clients/1/charges?offset&#x3D;0&amp;limit&#x3D;5
     */
    @Test
    public void retrieveAllClientCharges1Test() {
        Long clientId = null;
        String chargeStatus = null;
        Boolean pendingPayment = null;
        Integer limit = null;
        Integer offset = null;
        // GetSelfClientsClientIdChargesResponse response = api.retrieveAllClientCharges1(clientId, chargeStatus, pendingPayment, limit, offset);

        // TODO: test validations
    }

    /**
     * List Client Transactions
     *
     * The list capability of client transaction can support pagination.  Example Requests:  self/clients/189/transactions  self/clients/189/transactions?offset&#x3D;10&amp;limit&#x3D;50
     */
    @Test
    public void retrieveAllClientTransactions1Test() {
        Long clientId = null;
        Integer offset = null;
        Integer limit = null;
        // GetSelfClientsClientIdTransactionsResponse response = api.retrieveAllClientTransactions1(clientId, offset, limit);

        // TODO: test validations
    }

    /**
     * Retrieve client accounts overview
     *
     * An example of how a loan portfolio summary can be provided. This is requested in a specific use case of the community application. It is quite reasonable to add resources like this to simplify User Interface development.  Example Requests:  self/clients/1/accounts   self/clients/1/accounts?fields&#x3D;loanAccounts,savingsAccounts
     */
    @Test
    public void retrieveAssociatedAccounts1Test() {
        Long clientId = null;
        // GetSelfClientsClientIdAccountsResponse response = api.retrieveAssociatedAccounts1(clientId);

        // TODO: test validations
    }

    /**
     * Retrieve a Client Charge
     *
     * Retrieves a Client Charge  Example Requests:  self/clients/1/charges/1   self/clients/1/charges/1?fields&#x3D;name,id
     */
    @Test
    public void retrieveClientCharge1Test() {
        Long clientId = null;
        Long chargeId = null;
        // GetSelfClientsClientIdChargesChargeIdResponse response = api.retrieveClientCharge1(clientId, chargeId);

        // TODO: test validations
    }

    /**
     * Retrieve a Client Transaction
     *
     * Retrieves a Client TransactionExample Requests:  self/clients/1/transactions/1   self/clients/1/transactions/1?fields&#x3D;id,officeName
     */
    @Test
    public void retrieveClientTransaction1Test() {
        Long clientId = null;
        Long transactionId = null;
        // GetSelfClientsClientIdTransactionsTransactionIdResponse response = api.retrieveClientTransaction1(clientId, transactionId);

        // TODO: test validations
    }

    /**
     * Retrieve Client Image
     *
     * Optional arguments are identical to those of Get Image associated with an Entity (Binary file)  Example Requests:  self/clients/1/images
     */
    @Test
    public void retrieveImageTest() {
        Long clientId = null;
        Integer maxWidth = null;
        Integer maxHeight = null;
        String output = null;
        // Void response = api.retrieveImage(clientId, maxWidth, maxHeight, output);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void retrieveObligeeDetails1Test() {
        Long clientId = null;
        // String response = api.retrieveObligeeDetails1(clientId);

        // TODO: test validations
    }

    /**
     * Retrieve a Client
     *
     * Retrieves a Client  Example Requests:  self/clients/1  self/clients/1?fields&#x3D;id,displayName,officeName
     */
    @Test
    public void retrieveOne25Test() {
        Long clientId = null;
        // GetSelfClientsClientIdResponse response = api.retrieveOne25(clientId);

        // TODO: test validations
    }
}
