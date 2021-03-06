package org.apache.fineract.client.services;

import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.models.DeleteGLAccountsRequest;
import org.apache.fineract.client.models.FormDataContentDisposition;
import org.apache.fineract.client.models.GetGLAccountsResponse;
import org.apache.fineract.client.models.GetGLAccountsTemplateResponse;
import org.apache.fineract.client.models.PostGLAccountsRequest;
import org.apache.fineract.client.models.PostGLAccountsResponse;
import org.apache.fineract.client.models.PutGLAccountsRequest;
import org.apache.fineract.client.models.PutGLAccountsResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GeneralLedgerAccountApi
 */
public class GeneralLedgerAccountApiTest {

    private GeneralLedgerAccountApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(GeneralLedgerAccountApi.class);
    }


    /**
     * Create a General Ledger Account
     *
     * Note: You may optionally create Hierarchical Chart of Accounts by using the \&quot;parentId\&quot; property of an Account Mandatory Fields:  name, glCode, type, usage and manualEntriesAllowed
     */
    @Test
    public void createGLAccount1Test() {
        PostGLAccountsRequest body = null;
        // PostGLAccountsResponse response = api.createGLAccount1(body);

        // TODO: test validations
    }

    /**
     * Delete an accounting closure
     *
     * Note: Only the latest accounting closure associated with a branch may be deleted.
     */
    @Test
    public void deleteGLAccount1Test() {
        Long glAccountId = null;
        // DeleteGLAccountsRequest response = api.deleteGLAccount1(glAccountId);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void getGlAccountsTemplateTest() {
        String dateFormat = null;
        // Void response = api.getGlAccountsTemplate(dateFormat);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void postGlAccountsTemplateTest() {
        FormDataContentDisposition file = null;
        String locale = null;
        String dateFormat = null;
        // String response = api.postGlAccountsTemplate(file, locale, dateFormat);

        // TODO: test validations
    }

    /**
     * Retrieve a General Ledger Account
     *
     * Example Requests:  glaccounts/1   glaccounts/1?template&#x3D;true   glaccounts/1?fields&#x3D;name,glCode   glaccounts/1?fetchRunningBalance&#x3D;true
     */
    @Test
    public void retreiveAccountTest() {
        Long glAccountId = null;
        Boolean fetchRunningBalance = null;
        // GetGLAccountsResponse response = api.retreiveAccount(glAccountId, fetchRunningBalance);

        // TODO: test validations
    }

    /**
     * List General Ledger Accounts
     *
     * ARGUMENTS type Integer optional manualEntriesAllowed boolean optional usage Integer optional disabled boolean optional parentId Long optional tagId Long optional Example Requests:  glaccounts   glaccounts?type&#x3D;1&amp;manualEntriesAllowed&#x3D;true&amp;usage&#x3D;1&amp;disabled&#x3D;false  glaccounts?fetchRunningBalance&#x3D;true
     */
    @Test
    public void retrieveAllAccountsTest() {
        Integer type = null;
        String searchParam = null;
        Integer usage = null;
        Boolean manualEntriesAllowed = null;
        Boolean disabled = null;
        Boolean fetchRunningBalance = null;
        // List<GetGLAccountsResponse> response = api.retrieveAllAccounts(type, searchParam, usage, manualEntriesAllowed, disabled, fetchRunningBalance);

        // TODO: test validations
    }

    /**
     * Retrieve GL Accounts Template
     *
     * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists Example Request:  glaccounts/template glaccounts/template?type&#x3D;1  type is optional and integer value from 1 to 5.  1.Assets  2.Liabilities  3.Equity  4.Income  5.Expenses
     */
    @Test
    public void retrieveNewAccountDetailsTest() {
        Integer type = null;
        // GetGLAccountsTemplateResponse response = api.retrieveNewAccountDetails(type);

        // TODO: test validations
    }

    /**
     * Update an Accounting closure
     *
     * Once an accounting closure is created, only the comments associated with it may be edited  
     */
    @Test
    public void updateGLAccount1Test() {
        Long glAccountId = null;
        PutGLAccountsRequest body = null;
        // PutGLAccountsResponse response = api.updateGLAccount1(glAccountId, body);

        // TODO: test validations
    }
}
