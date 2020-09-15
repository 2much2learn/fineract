package org.apache.fineract.client.services;

import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.models.DeleteFixedDepositAccountsAccountIdResponse;
import org.apache.fineract.client.models.FormDataContentDisposition;
import org.apache.fineract.client.models.GetFixedDepositAccountsAccountIdResponse;
import org.apache.fineract.client.models.GetFixedDepositAccountsResponse;
import org.apache.fineract.client.models.GetFixedDepositAccountsTemplateResponse;
import org.apache.fineract.client.models.PostFixedDepositAccountsAccountIdRequest;
import org.apache.fineract.client.models.PostFixedDepositAccountsAccountIdResponse;
import org.apache.fineract.client.models.PostFixedDepositAccountsRequest;
import org.apache.fineract.client.models.PostFixedDepositAccountsResponse;
import org.apache.fineract.client.models.PutFixedDepositAccountsAccountIdRequest;
import org.apache.fineract.client.models.PutFixedDepositAccountsAccountIdResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FixedDepositAccountApi
 */
public class FixedDepositAccountApiTest {

    private FixedDepositAccountApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(FixedDepositAccountApi.class);
    }


    /**
     * 
     *
     * 
     */
    @Test
    public void accountClosureTemplateTest() {
        Long accountId = null;
        String command = null;
        // String response = api.accountClosureTemplate(accountId, command);

        // TODO: test validations
    }

    /**
     * Delete a fixed deposit application
     *
     * At present we support hard delete of fixed deposit application so long as its in &#x27;Submitted and pending approval&#x27; state. One the application is moves past this state, it is not possible to do a &#x27;hard&#x27; delete of the application or the account. An API endpoint will be added to close/de-activate the fixed deposit account.
     */
    @Test
    public void delete14Test() {
        Long accountId = null;
        // DeleteFixedDepositAccountsAccountIdResponse response = api.delete14(accountId);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void getFixedDepositTemplateTest() {
        Long officeId = null;
        Long staffId = null;
        String dateFormat = null;
        // Void response = api.getFixedDepositTemplate(officeId, staffId, dateFormat);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void getFixedDepositTransactionTemplateTest() {
        Long officeId = null;
        String dateFormat = null;
        // Void response = api.getFixedDepositTransactionTemplate(officeId, dateFormat);

        // TODO: test validations
    }

    /**
     * Approve fixed deposit application | Undo approval fixed deposit application | Reject fixed deposit application | Withdraw fixed deposit application | Activate a fixed deposit account | Close a fixed deposit account | Premature Close a fixed deposit account | Calculate Premature amount on Fixed deposit account | Calculate Interest on Fixed Deposit Account | Post Interest on Fixed Deposit Account
     *
     * Approve fixed deposit application:  Approves fixed deposit application so long as its in &#x27;Submitted and pending approval&#x27; state.  Undo approval fixed deposit application:  Will move &#x27;approved&#x27; fixed deposit application back to &#x27;Submitted and pending approval&#x27; state.  Reject fixed deposit application:  Rejects fixed deposit application so long as its in &#x27;Submitted and pending approval&#x27; state.  Withdraw fixed deposit application:  Used when an applicant withdraws from the fixed deposit application. It must be in &#x27;Submitted and pending approval&#x27; state.  Close a fixed deposit account:  Results in a Matured fixed deposit account being converted into a &#x27;closed&#x27; fixed deposit account.  Premature Close a fixed deposit account:  Results in an Active fixed deposit account being converted into a &#x27;Premature Closed&#x27; fixed deposit account with options to withdraw prematured amount. (premature amount is calculated using interest rate chart applicable along with penal interest if any.)  Calculate Premature amount on Fixed deposit account:  Calculate premature amount on fixed deposit account till premature close date. Premature amount is calculated based on interest chart and penal interest applicable.  Calculate Interest on Fixed Deposit Account:  Calculates interest earned on a fixed deposit account based on todays date. It does not attempt to post or credit the interest on the account. That is responsibility of the Post Interest API that will likely be called by overnight process.  Post Interest on Fixed Deposit Account:  Calculates and Posts interest earned on a fixed deposit account based on today&#x27;s date and whether an interest posting or crediting event is due.  Showing request/response for Calculate Interest on Fixed Deposit Account
     */
    @Test
    public void handleCommands4Test() {
        PostFixedDepositAccountsAccountIdRequest body = null;
        Long accountId = null;
        String command = null;
        // PostFixedDepositAccountsAccountIdResponse response = api.handleCommands4(body, accountId, command);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void postFixedDepositTemplateTest() {
        FormDataContentDisposition file = null;
        String locale = null;
        String dateFormat = null;
        // String response = api.postFixedDepositTemplate(file, locale, dateFormat);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void postFixedDepositTransactionTemplateTest() {
        FormDataContentDisposition file = null;
        String locale = null;
        String dateFormat = null;
        // String response = api.postFixedDepositTransactionTemplate(file, locale, dateFormat);

        // TODO: test validations
    }

    /**
     * List Fixed deposit applications/accounts
     *
     * Lists Fixed Deposit Accounts  Example Requests:    fixeddepositaccounts    fixeddepositaccounts?fields&#x3D;name
     */
    @Test
    public void retrieveAll28Test() {
        Boolean paged = null;
        Integer offset = null;
        Integer limit = null;
        String orderBy = null;
        String sortOrder = null;
        // List<GetFixedDepositAccountsResponse> response = api.retrieveAll28(paged, offset, limit, orderBy, sortOrder);

        // TODO: test validations
    }

    /**
     * Retrieve a fixed deposit application/account
     *
     * Retrieves a fixed deposit application/account  Example Requests :    fixeddepositaccounts/1  fixeddepositaccounts/1?associations&#x3D;all
     */
    @Test
    public void retrieveOne17Test() {
        Long accountId = null;
        Boolean staffInSelectedOfficeOnly = null;
        String chargeStatus = null;
        // GetFixedDepositAccountsAccountIdResponse response = api.retrieveOne17(accountId, staffInSelectedOfficeOnly, chargeStatus);

        // TODO: test validations
    }

    /**
     * Submit new fixed deposit application
     *
     * Submits a new fixed deposit applicationMandatory Fields: clientId or groupId, productId, submittedOnDate, depositAmount, depositPeriod, depositPeriodFrequencyId  Optional Fields: accountNo, externalId, fieldOfficerId,linkAccountId(if provided initial deposit amount will be collected from this account),transferInterestToSavings(By enabling this flag all interest postings will be transferred to linked saving account )
     */
    @Test
    public void submitApplicationTest() {
        PostFixedDepositAccountsRequest body = null;
        // PostFixedDepositAccountsResponse response = api.submitApplication(body);

        // TODO: test validations
    }

    /**
     * Retrieve Fixed Deposit Account Template
     *
     * This is a convenience resource. It can be useful when building maintenance user interface screens for fixed deposit applications. The template data returned consists of any or all of:    Field Defaults  Allowed Value ListsExample Requests:    fixeddepositaccounts/template?clientId&#x3D;1
     */
    @Test
    public void template12Test() {
        Long clientId = null;
        Long groupId = null;
        Long productId = null;
        Boolean staffInSelectedOfficeOnly = null;
        // GetFixedDepositAccountsTemplateResponse response = api.template12(clientId, groupId, productId, staffInSelectedOfficeOnly);

        // TODO: test validations
    }

    /**
     * Modify a fixed deposit application
     *
     * Fixed deposit application can only be modified when in &#x27;Submitted and pending approval&#x27; state. Once the application is approved, the details cannot be changed using this method. Specific api endpoints will be created to allow change of interest detail such as rate, compounding period, posting period etc
     */
    @Test
    public void update14Test() {
        PutFixedDepositAccountsAccountIdRequest body = null;
        Long accountId = null;
        // PutFixedDepositAccountsAccountIdResponse response = api.update14(body, accountId);

        // TODO: test validations
    }
}
