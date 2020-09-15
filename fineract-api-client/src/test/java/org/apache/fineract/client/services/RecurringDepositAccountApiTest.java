package org.apache.fineract.client.services;

import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.models.DeleteRecurringDepositAccountsResponse;
import org.apache.fineract.client.models.FormDataContentDisposition;
import org.apache.fineract.client.models.GetRecurringDepositAccountsAccountIdResponse;
import org.apache.fineract.client.models.GetRecurringDepositAccountsResponse;
import org.apache.fineract.client.models.GetRecurringDepositAccountsTemplateResponse;
import org.apache.fineract.client.models.PostRecurringDepositAccountsAccountIdRequest;
import org.apache.fineract.client.models.PostRecurringDepositAccountsAccountIdResponse;
import org.apache.fineract.client.models.PostRecurringDepositAccountsRequest;
import org.apache.fineract.client.models.PostRecurringDepositAccountsResponse;
import org.apache.fineract.client.models.PutRecurringDepositAccountsAccountIdRequest;
import org.apache.fineract.client.models.PutRecurringDepositAccountsAccountIdResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RecurringDepositAccountApi
 */
public class RecurringDepositAccountApiTest {

    private RecurringDepositAccountApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(RecurringDepositAccountApi.class);
    }


    /**
     * 
     *
     * 
     */
    @Test
    public void accountClosureTemplate1Test() {
        Long accountId = null;
        String command = null;
        // String response = api.accountClosureTemplate1(accountId, command);

        // TODO: test validations
    }

    /**
     * Delete a recurring deposit application
     *
     * At present we support hard delete of recurring deposit application so long as its in &#x27;Submitted and pending approval&#x27; state. One the application is moves past this state, it is not possible to do a &#x27;hard&#x27; delete of the application or the account. An API endpoint will be added to close/de-activate the recurring deposit account.
     */
    @Test
    public void delete16Test() {
        Long accountId = null;
        // DeleteRecurringDepositAccountsResponse response = api.delete16(accountId);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void getRecurringDepositTemplateTest() {
        Long officeId = null;
        Long staffId = null;
        String dateFormat = null;
        // Void response = api.getRecurringDepositTemplate(officeId, staffId, dateFormat);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void getRecurringDepositTransactionTemplateTest() {
        Long officeId = null;
        String dateFormat = null;
        // Void response = api.getRecurringDepositTransactionTemplate(officeId, dateFormat);

        // TODO: test validations
    }

    /**
     * Approve recurring deposit application | Undo approval recurring deposit application | Reject recurring deposit application | Withdraw recurring deposit application | Activate a recurring deposit account | Update the recommended deposit amount for a recurring deposit account | Close a recurring deposit account | Premature Close a recurring deposit account | Calculate Premature amount on Recurring deposit account | Calculate Interest on recurring Deposit Account | Post Interest on recurring Deposit Account
     *
     * Approve recurring deposit application:  Approves recurring deposit application so long as its in &#x27;Submitted and pending approval&#x27; state.  Undo approval recurring deposit application:  Will move &#x27;approved&#x27; recurring deposit application back to &#x27;Submitted and pending approval&#x27; state.  Reject recurring deposit application  Rejects recurring deposit application so long as its in &#x27;Submitted and pending approval&#x27; state.  Withdraw recurring deposit application:  Used when an applicant withdraws from the recurring deposit application. It must be in &#x27;Submitted and pending approval&#x27; state.  Activate a recurring deposit account:  Results in an approved recurring deposit application being converted into an &#x27;active&#x27; recurring deposit account.  Update the recommended deposit amount for a recurring deposit account:  Updates the recommended deposit amount for a RD account as on the effective date.  Close a recurring deposit account  Results in a Matured recurring deposit account being converted into a &#x27;closed&#x27; recurring deposit account.  On account close allowed actions are.Premature Close a recurring deposit account:  Results in an Active recurring deposit account being converted into a &#x27;Premature Closed&#x27; recurring deposit account with options to withdraw prematured amount. (premature amount is calculated using interest rate chart applicable along with penal interest if any.)  On account premature closure allowed actions are.  Calculate Premature amount on Recurring deposit account:  Calculate premature amount on recurring deposit till premature close date. Premature amount is calculated based on interest chart and penal interest applicable if any.  Calculate Interest on recurring Deposit Account:  Calculates interest earned on a recurring deposit account based on todays date. It does not attempt to post or credit the interest on the account. That is responsibility of the Post Interest API that will likely be called by overnight process.  Post Interest on recurring Deposit Account:  Calculates and Posts interest earned on a recurring deposit account based on todays date and whether an interest posting or crediting event is due.  Showing request/response for &#x27;Post Interest on recurring Deposit Account&#x27;
     */
    @Test
    public void handleCommands5Test() {
        PostRecurringDepositAccountsAccountIdRequest body = null;
        Long accountId = null;
        String command = null;
        // PostRecurringDepositAccountsAccountIdResponse response = api.handleCommands5(body, accountId, command);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void postRecurringDepositTemplateTest() {
        FormDataContentDisposition file = null;
        String locale = null;
        String dateFormat = null;
        // String response = api.postRecurringDepositTemplate(file, locale, dateFormat);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void postRecurringDepositTransactionsTemplateTest() {
        FormDataContentDisposition file = null;
        String locale = null;
        String dateFormat = null;
        // String response = api.postRecurringDepositTransactionsTemplate(file, locale, dateFormat);

        // TODO: test validations
    }

    /**
     * List Recurring deposit applications/accounts
     *
     * Lists Recurring deposit applications/accounts  Example Requests:  recurringdepositaccounts   recurringdepositaccounts?fields&#x3D;name
     */
    @Test
    public void retrieveAll30Test() {
        Boolean paged = null;
        Integer offset = null;
        Integer limit = null;
        String orderBy = null;
        String sortOrder = null;
        // List<GetRecurringDepositAccountsResponse> response = api.retrieveAll30(paged, offset, limit, orderBy, sortOrder);

        // TODO: test validations
    }

    /**
     * Retrieve a recurring deposit application/account
     *
     * Retrieves a recurring deposit application/account  Example Requests :  recurringdepositaccounts/1   recurringdepositaccounts/1?associations&#x3D;all
     */
    @Test
    public void retrieveOne20Test() {
        Long accountId = null;
        Boolean staffInSelectedOfficeOnly = null;
        String chargeStatus = null;
        // GetRecurringDepositAccountsAccountIdResponse response = api.retrieveOne20(accountId, staffInSelectedOfficeOnly, chargeStatus);

        // TODO: test validations
    }

    /**
     * Submit new recurring deposit application
     *
     * Submits new recurring deposit application  Mandatory Fields: clientId or groupId, productId, submittedOnDate, depositAmount, depositPeriod, depositPeriodFrequencyId  Optional Fields: accountNo, externalId, fieldOfficerId,linkAccountId(if provided initial deposit amount will be collected from this account),transferInterestToSavings(By enabling this flag all interest postings will be transferred to linked saving account )  Inherited from Product (if not provided): interestCompoundingPeriodType, interestCalculationType, interestCalculationDaysInYearType, lockinPeriodFrequency, lockinPeriodFrequencyType, preClosurePenalApplicable, preClosurePenalInterest, preClosurePenalInterestOnTypeId, charts, withHoldTax
     */
    @Test
    public void submitApplication1Test() {
        PostRecurringDepositAccountsRequest body = null;
        // PostRecurringDepositAccountsResponse response = api.submitApplication1(body);

        // TODO: test validations
    }

    /**
     * Retrieve recurring Deposit Account Template
     *
     * This is a convenience resource. It can be useful when building maintenance user interface screens for recurring deposit applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists  Example Requests:  recurringdepositaccounts/template?clientId&#x3D;1   recurringdepositaccounts/template?clientId&#x3D;1&amp;productId&#x3D;1
     */
    @Test
    public void template13Test() {
        Long clientId = null;
        Long groupId = null;
        Long productId = null;
        Boolean staffInSelectedOfficeOnly = null;
        // GetRecurringDepositAccountsTemplateResponse response = api.template13(clientId, groupId, productId, staffInSelectedOfficeOnly);

        // TODO: test validations
    }

    /**
     * Modify a recurring deposit application
     *
     * Recurring deposit application can only be modified when in &#x27;Submitted and pending approval&#x27; state. Once the application is approved, the details cannot be changed using this method. Specific api endpoints will be created to allow change of interest detail such as rate, compounding period, posting period etc
     */
    @Test
    public void update16Test() {
        PutRecurringDepositAccountsAccountIdRequest body = null;
        Long accountId = null;
        // PutRecurringDepositAccountsAccountIdResponse response = api.update16(body, accountId);

        // TODO: test validations
    }
}
