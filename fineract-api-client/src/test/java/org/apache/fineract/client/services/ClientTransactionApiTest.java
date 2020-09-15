package org.apache.fineract.client.services;

import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.models.GetClientsClientIdTransactionsResponse;
import org.apache.fineract.client.models.GetClientsClientIdTransactionsTransactionIdResponse;
import org.apache.fineract.client.models.PostClientsClientIdTransactionsTransactionIdResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ClientTransactionApi
 */
public class ClientTransactionApiTest {

    private ClientTransactionApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(ClientTransactionApi.class);
    }


    /**
     * List Client Transactions
     *
     * The list capability of client transaction can support pagination.  Example Requests:  clients/189/transactions  clients/189/transactions?offset&#x3D;10&amp;limit&#x3D;50
     */
    @Test
    public void retrieveAllClientTransactionsTest() {
        Long clientId = null;
        Integer offset = null;
        Integer limit = null;
        // GetClientsClientIdTransactionsResponse response = api.retrieveAllClientTransactions(clientId, offset, limit);

        // TODO: test validations
    }

    /**
     * Retrieve a Client Transaction
     *
     * Example Requests: clients/1/transactions/1   clients/1/transactions/1?fields&#x3D;id,officeName
     */
    @Test
    public void retrieveClientTransactionTest() {
        Long clientId = null;
        Long transactionId = null;
        // GetClientsClientIdTransactionsTransactionIdResponse response = api.retrieveClientTransaction(clientId, transactionId);

        // TODO: test validations
    }

    /**
     * Undo a Client Transaction
     *
     * Undoes a Client Transaction
     */
    @Test
    public void undoClientTransactionTest() {
        Long clientId = null;
        Long transactionId = null;
        String command = null;
        // PostClientsClientIdTransactionsTransactionIdResponse response = api.undoClientTransaction(clientId, transactionId, command);

        // TODO: test validations
    }
}
