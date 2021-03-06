package org.apache.fineract.client.services;

import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.models.DateParam;
import org.apache.fineract.client.models.GetLoansLoanIdTransactionsTemplateResponse;
import org.apache.fineract.client.models.GetLoansLoanIdTransactionsTransactionIdResponse;
import org.apache.fineract.client.models.PostLoansLoanIdTransactionsRequest;
import org.apache.fineract.client.models.PostLoansLoanIdTransactionsResponse;
import org.apache.fineract.client.models.PostLoansLoanIdTransactionsTransactionIdRequest;
import org.apache.fineract.client.models.PostLoansLoanIdTransactionsTransactionIdResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LoanTransactionsApi
 */
public class LoanTransactionsApiTest {

    private LoanTransactionsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(LoanTransactionsApi.class);
    }


    /**
     * Adjust a Transaction
     *
     * Note: there is no need to specify command&#x3D;{transactionType} parameter.  Mandatory Fields: transactionDate, transactionAmount
     */
    @Test
    public void adjustLoanTransactionTest() {
        PostLoansLoanIdTransactionsTransactionIdRequest body = null;
        Long loanId = null;
        Long transactionId = null;
        // PostLoansLoanIdTransactionsTransactionIdResponse response = api.adjustLoanTransaction(body, loanId, transactionId);

        // TODO: test validations
    }

    /**
     * Make a Repayment | Make a Refund of an Active Loan by Cash | Foreclosure of an Active Loan | Waive Interest | Write-off Loan | Make Recovery Payment | Undo Loan Write-off Transaction
     *
     * Make Recovery Payment:  This API allows collecting recovery payments for written-off loans
     */
    @Test
    public void executeLoanTransactionTest() {
        PostLoansLoanIdTransactionsRequest body = null;
        Long loanId = null;
        String command = null;
        // PostLoansLoanIdTransactionsResponse response = api.executeLoanTransaction(body, loanId, command);

        // TODO: test validations
    }

    /**
     * Retrieve a Transaction Details
     *
     * Retrieves a Transaction Details  Example Request:  loans/5/transactions/3
     */
    @Test
    public void retrieveTransactionTest() {
        Long loanId = null;
        Long transactionId = null;
        // GetLoansLoanIdTransactionsTransactionIdResponse response = api.retrieveTransaction(loanId, transactionId);

        // TODO: test validations
    }

    /**
     * Retrieve Loan Transaction Template
     *
     * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists  Example Request:  loans/1/transactions/template?command&#x3D;repayment
     */
    @Test
    public void retrieveTransactionTemplateTest() {
        Long loanId = null;
        String command = null;
        String dateFormat = null;
        DateParam transactionDate = null;
        String locale = null;
        // GetLoansLoanIdTransactionsTemplateResponse response = api.retrieveTransactionTemplate(loanId, command, dateFormat, transactionDate, locale);

        // TODO: test validations
    }
}
