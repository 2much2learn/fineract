package org.apache.fineract.client.services;

import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.models.DeleteSavingsAccountsAccountIdResponse;
import org.apache.fineract.client.models.FormDataContentDisposition;
import org.apache.fineract.client.models.GetSavingsAccountsAccountIdResponse;
import org.apache.fineract.client.models.GetSavingsAccountsResponse;
import org.apache.fineract.client.models.GetSavingsAccountsTemplateResponse;
import org.apache.fineract.client.models.PostSavingsAccountsAccountIdRequest;
import org.apache.fineract.client.models.PostSavingsAccountsAccountIdResponse;
import org.apache.fineract.client.models.PostSavingsAccountsRequest;
import org.apache.fineract.client.models.PostSavingsAccountsResponse;
import org.apache.fineract.client.models.PutSavingsAccountsAccountIdRequest;
import org.apache.fineract.client.models.PutSavingsAccountsAccountIdResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SavingsAccountApi
 */
public class SavingsAccountApiTest {

    private SavingsAccountApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(SavingsAccountApi.class);
    }


    /**
     * Delete a savings application
     *
     * At present we support hard delete of savings application so long as its in &#x27;Submitted and pending approval&#x27; state. One the application is moves past this state, it is not possible to do a &#x27;hard&#x27; delete of the application or the account. An API endpoint will be added to close/de-activate the savings account.
     */
    @Test
    public void delete18Test() {
        Long accountId = null;
        // DeleteSavingsAccountsAccountIdResponse response = api.delete18(accountId);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void getSavingsTemplateTest() {
        Long officeId = null;
        Long staffId = null;
        String dateFormat = null;
        // Void response = api.getSavingsTemplate(officeId, staffId, dateFormat);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void getSavingsTransactionTemplateTest() {
        Long officeId = null;
        String dateFormat = null;
        // Void response = api.getSavingsTransactionTemplate(officeId, dateFormat);

        // TODO: test validations
    }

    /**
     * Approve savings application | Undo approval savings application | Assign Savings Officer | Unassign Savings Officer | Reject savings application | Withdraw savings application | Activate a savings account | Close a savings account | Calculate Interest on Savings Account | Post Interest on Savings Account | Block Savings Account | Unblock Savings Account | Block Savings Account Credit transactions | Unblock Savings Account Credit transactions | Block Savings Account Debit transactions | Unblock Savings Account debit transactions
     *
     * Approve savings application:  Approves savings application so long as its in &#x27;Submitted and pending approval&#x27; state.  Undo approval savings application:  Will move &#x27;approved&#x27; savings application back to &#x27;Submitted and pending approval&#x27; state.  Assign Savings Officer:  Allows you to assign Savings Officer for existing Savings Account.  Unassign Savings Officer:  Allows you to unassign the Savings Officer.  Reject savings application:  Rejects savings application so long as its in &#x27;Submitted and pending approval&#x27; state.  Withdraw savings application:  Used when an applicant withdraws from the savings application. It must be in &#x27;Submitted and pending approval&#x27; state.  Activate a savings account:  Results in an approved savings application being converted into an &#x27;active&#x27; savings account.  Close a savings account:  Results in an Activated savings application being converted into an &#x27;closed&#x27; savings account.  closedOnDate is closure date of savings account  withdrawBalance is a boolean description, true value of this field performs a withdrawal transaction with account&#x27;s running balance.  Mandatory Fields: dateFormat,locale,closedOnDate  Optional Fields: note, withdrawBalance, paymentTypeId, accountNumber, checkNumber, routingCode, receiptNumber, bankNumber  Calculate Interest on Savings Account:  Calculates interest earned on a savings account based on todays date. It does not attempt to post or credit the interest on the account. That is responsibility of the Post Interest API that will likely be called by overnight process.  Post Interest on Savings Account:  Calculates and Posts interest earned on a savings account based on today&#x27;s date and whether an interest posting or crediting event is due.  Block Savings Account:  Blocks Savings account from all types of credit and debit transactions  Unblock Savings Account:  Unblock a blocked account. On unblocking account, user can perform debit and credit transactions  Block Savings Account Credit transactions:  Savings account will be blocked from all types of credit transactions.  Unblock Savings Account Credit transactions:  It unblocks the Saving account&#x27;s credit operations. Now all types of credits can be transacted to Savings account  Block Savings Account Debit transactions:  All types of debit operations from Savings account wil be blocked  Unblock Savings Account debit transactions:  It unblocks the Saving account&#x27;s debit operations. Now all types of debits can be transacted from Savings account  Showing request/response for &#x27;Unassign Savings Officer&#x27;
     */
    @Test
    public void handleCommands6Test() {
        PostSavingsAccountsAccountIdRequest body = null;
        Long accountId = null;
        String command = null;
        // PostSavingsAccountsAccountIdResponse response = api.handleCommands6(body, accountId, command);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void handleGSIMCommandsTest() {
        Long parentAccountId = null;
        String body = null;
        String command = null;
        // String response = api.handleGSIMCommands(parentAccountId, body, command);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void postSavingsTemplateTest() {
        FormDataContentDisposition file = null;
        String locale = null;
        String dateFormat = null;
        // String response = api.postSavingsTemplate(file, locale, dateFormat);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void postSavingsTransactionTemplateTest() {
        FormDataContentDisposition file = null;
        String locale = null;
        String dateFormat = null;
        // String response = api.postSavingsTransactionTemplate(file, locale, dateFormat);

        // TODO: test validations
    }

    /**
     * List savings applications/accounts
     *
     * Lists savings applications/accounts  Example Requests:  savingsaccounts   savingsaccounts?fields&#x3D;name
     */
    @Test
    public void retrieveAll32Test() {
        String sqlSearch = null;
        String externalId = null;
        Integer offset = null;
        Integer limit = null;
        String orderBy = null;
        String sortOrder = null;
        // GetSavingsAccountsResponse response = api.retrieveAll32(sqlSearch, externalId, offset, limit, orderBy, sortOrder);

        // TODO: test validations
    }

    /**
     * Retrieve a savings application/account
     *
     * Retrieves a savings application/account  Example Requests :  savingsaccounts/1   savingsaccounts/1?associations&#x3D;all
     */
    @Test
    public void retrieveOne23Test() {
        Long accountId = null;
        Boolean staffInSelectedOfficeOnly = null;
        String chargeStatus = null;
        // GetSavingsAccountsAccountIdResponse response = api.retrieveOne23(accountId, staffInSelectedOfficeOnly, chargeStatus);

        // TODO: test validations
    }

    /**
     * Submit new savings application
     *
     * Submits new savings application  Mandatory Fields: clientId or groupId, productId, submittedOnDate  Optional Fields: accountNo, externalId, fieldOfficerId  Inherited from Product (if not provided): nominalAnnualInterestRate, interestCompoundingPeriodType, interestCalculationType, interestCalculationDaysInYearType, minRequiredOpeningBalance, lockinPeriodFrequency, lockinPeriodFrequencyType, withdrawalFeeForTransfers, allowOverdraft, overdraftLimit, withHoldTax  Additional Mandatory Field if Entity-Datatable Check is enabled for the entity of type Savings: datatables
     */
    @Test
    public void submitApplication2Test() {
        PostSavingsAccountsRequest body = null;
        // PostSavingsAccountsResponse response = api.submitApplication2(body);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void submitGSIMApplicationTest() {
        String body = null;
        // String response = api.submitGSIMApplication(body);

        // TODO: test validations
    }

    /**
     * Retrieve Savings Account Template
     *
     * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists  Example Requests:  savingsaccounts/template?clientId&#x3D;1   savingsaccounts/template?clientId&#x3D;1&amp;productId&#x3D;1
     */
    @Test
    public void template14Test() {
        Long clientId = null;
        Long groupId = null;
        Long productId = null;
        Boolean staffInSelectedOfficeOnly = null;
        // GetSavingsAccountsTemplateResponse response = api.template14(clientId, groupId, productId, staffInSelectedOfficeOnly);

        // TODO: test validations
    }

    /**
     * Modify a savings application | Modify savings account withhold tax applicability
     *
     * Modify a savings application:  Savings application can only be modified when in &#x27;Submitted and pending approval&#x27; state. Once the application is approved, the details cannot be changed using this method. Specific api endpoints will be created to allow change of interest detail such as rate, compounding period, posting period etc  Modify savings account withhold tax applicability:  Savings application&#x27;s withhold tax can be modified when in &#x27;Active&#x27; state. Once the application is activated, can modify the account withhold tax to post tax or vice-versaShowing request/response for &#x27;Modify a savings application&#x27;
     */
    @Test
    public void update18Test() {
        PutSavingsAccountsAccountIdRequest body = null;
        Long accountId = null;
        String command = null;
        // PutSavingsAccountsAccountIdResponse response = api.update18(body, accountId, command);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void updateGsimTest() {
        Long parentAccountId = null;
        String body = null;
        // String response = api.updateGsim(parentAccountId, body);

        // TODO: test validations
    }
}
