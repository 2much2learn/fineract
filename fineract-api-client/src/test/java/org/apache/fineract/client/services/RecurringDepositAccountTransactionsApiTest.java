package org.apache.fineract.client.services;

import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.models.GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTemplateResponse;
import org.apache.fineract.client.models.GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse;
import org.apache.fineract.client.models.PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsRequest;
import org.apache.fineract.client.models.PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsResponse;
import org.apache.fineract.client.models.PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RecurringDepositAccountTransactionsApi
 */
public class RecurringDepositAccountTransactionsApiTest {

    private RecurringDepositAccountTransactionsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(RecurringDepositAccountTransactionsApi.class);
    }


    /**
     * Adjust Transaction | Undo transaction
     *
     * Adjust Transaction:  This command modifies the given transaction.  Undo transaction:  This command reverses the given transaction.  Showing request/response for &#x27;Adjust Transaction&#x27;
     */
    @Test
    public void handleTransactionCommandsTest() {
        PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsRequest body = null;
        Long recurringDepositAccountId = null;
        Long transactionId = null;
        String command = null;
        // PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse response = api.handleTransactionCommands(body, recurringDepositAccountId, transactionId, command);

        // TODO: test validations
    }

    /**
     * Retrieve Recurring Deposit Account Transaction
     *
     * Retrieves Recurring Deposit Account Transaction  Example Requests:  recurringdepositaccounts/1/transactions/1
     */
    @Test
    public void retrieveOne19Test() {
        Long recurringDepositAccountId = null;
        Long transactionId = null;
        // GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse response = api.retrieveOne19(recurringDepositAccountId, transactionId);

        // TODO: test validations
    }

    /**
     * Retrieve Recurring Deposit Account Transaction Template
     *
     * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists Example Requests:  recurringdepositaccounts/1/transactions/template?command&#x3D;deposit  recurringdepositaccounts/1/transactions/template?command&#x3D;withdrawal
     */
    @Test
    public void retrieveTemplate15Test() {
        Long recurringDepositAccountId = null;
        String command = null;
        // GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTemplateResponse response = api.retrieveTemplate15(recurringDepositAccountId, command);

        // TODO: test validations
    }

    /**
     * Deposit Transaction | Withdrawal Transaction
     *
     * Deposit Transaction:  Used for a deposit transaction  Withdrawal Transaction:  Used for a Withdrawal Transaction  Showing request/response for Deposit Transaction
     */
    @Test
    public void transaction1Test() {
        PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsRequest body = null;
        Long recurringDepositAccountId = null;
        String command = null;
        // PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsResponse response = api.transaction1(body, recurringDepositAccountId, command);

        // TODO: test validations
    }
}
