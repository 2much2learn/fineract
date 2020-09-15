package org.apache.fineract.client.services;

import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.models.FormDataContentDisposition;
import org.apache.fineract.client.models.GetAccountsTypeAccountIdResponse;
import org.apache.fineract.client.models.GetAccountsTypeResponse;
import org.apache.fineract.client.models.GetAccountsTypeTemplateResponse;
import org.apache.fineract.client.models.PostAccountsTypeAccountIdRequest;
import org.apache.fineract.client.models.PostAccountsTypeAccountIdResponse;
import org.apache.fineract.client.models.PostAccountsTypeRequest;
import org.apache.fineract.client.models.PostAccountsTypeResponse;
import org.apache.fineract.client.models.PutAccountsTypeAccountIdRequest;
import org.apache.fineract.client.models.PutAccountsTypeAccountIdResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ShareAccountApi
 */
public class ShareAccountApiTest {

    private ShareAccountApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(ShareAccountApi.class);
    }


    /**
     * Submit new share application
     *
     * Submits new share application  Mandatory Fields: clientId, productId, submittedDate, savingsAccountId, requestedShares, applicationDate  Optional Fields: accountNo, externalId  Inherited from Product (if not provided): minimumActivePeriod, minimumActivePeriodFrequencyType, lockinPeriodFrequency, lockinPeriodFrequencyType
     */
    @Test
    public void createAccountTest() {
        PostAccountsTypeRequest body = null;
        String type = null;
        // PostAccountsTypeResponse response = api.createAccount(body, type);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void getSharedAccountsTemplateTest() {
        String type = null;
        Long officeId = null;
        String dateFormat = null;
        // Void response = api.getSharedAccountsTemplate(type, officeId, dateFormat);

        // TODO: test validations
    }

    /**
     * Approve share application | Undo approval share application | Reject share application | Activate a share account | Close a share account | Apply additional shares on a share account | Approve additional shares request on a share account | Reject additional shares request on a share account | Redeem shares on a share account
     *
     * Approve share application:  Approves share application so long as its in &#x27;Submitted and pending approval&#x27; state.  Undo approval share application:  Will move &#x27;approved&#x27; share application back to &#x27;Submitted and pending approval&#x27; state.  Reject share application:  Rejects share application so long as its in &#x27;Submitted and pending approval&#x27; state.  Activate a share account:  Results in an approved share application being converted into an &#x27;active&#x27; share account.  Close a share account:  Results in an Activated share application being converted into an &#x27;closed&#x27; share account.  closedDate is closure date of share account  Mandatory Fields: dateFormat,locale,closedDate  Apply additional shares on a share account:  requestedDate is requsted date of share purchase  requestedShares is number of shares to be purchase  Mandatory Fields: dateFormat,locale,requestedDate, requestedShares  Approve additional shares request on a share account  requestedShares is Share purchase transaction ids  Mandatory Fields: requestedShares  Reject additional shares request on a share account:  requestedShares is Share purchase transaction ids  Mandatory Fields: requestedShares  Redeem shares on a share account:  Results redeem some/all shares from share account.  requestedDate is requsted date of shares redeem  requestedShares is number of shares to be redeemed  Mandatory Fields: dateFormat,locale,requestedDate,requestedShares  Showing request/response for &#x27;Reject additional shares request on a share account&#x27;  For more info visit this link - https://demo.fineract.dev/fineract-provider/api-docs/apiLive.htm#shareaccounts
     */
    @Test
    public void handleCommands2Test() {
        PostAccountsTypeAccountIdRequest body = null;
        String type = null;
        Long accountId = null;
        String command = null;
        // PostAccountsTypeAccountIdResponse response = api.handleCommands2(body, type, accountId, command);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void postSharedAccountsTemplateTest() {
        String type = null;
        FormDataContentDisposition file = null;
        String locale = null;
        String dateFormat = null;
        // String response = api.postSharedAccountsTemplate(type, file, locale, dateFormat);

        // TODO: test validations
    }

    /**
     * Retrieve a share application/account
     *
     * Retrieves a share application/account  Example Requests :  shareaccount/1
     */
    @Test
    public void retrieveAccountTest() {
        Long accountId = null;
        String type = null;
        // GetAccountsTypeAccountIdResponse response = api.retrieveAccount(accountId, type);

        // TODO: test validations
    }

    /**
     * List share applications/accounts
     *
     * Lists share applications/accounts  Example Requests:  shareaccount
     */
    @Test
    public void retrieveAllAccounts1Test() {
        String type = null;
        Integer offset = null;
        Integer limit = null;
        // GetAccountsTypeResponse response = api.retrieveAllAccounts1(type, offset, limit);

        // TODO: test validations
    }

    /**
     * Retrieve Share Account Template
     *
     * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists  Example Requests:  accounts/share/template?clientId&#x3D;1   accounts/share/template?clientId&#x3D;1&amp;productId&#x3D;1
     */
    @Test
    public void template7Test() {
        String type = null;
        Long clientId = null;
        Long productId = null;
        // GetAccountsTypeTemplateResponse response = api.template7(type, clientId, productId);

        // TODO: test validations
    }

    /**
     * Modify a share application
     *
     * Share application can only be modified when in &#x27;Submitted and pending approval&#x27; state. Once the application is approved, the details cannot be changed using this method. Specific api endpoints will be created to allow change of interest detail such as rate, compounding period, posting period etc
     */
    @Test
    public void updateAccountTest() {
        PutAccountsTypeAccountIdRequest body = null;
        String type = null;
        Long accountId = null;
        // PutAccountsTypeAccountIdResponse response = api.updateAccount(body, type, accountId);

        // TODO: test validations
    }
}
