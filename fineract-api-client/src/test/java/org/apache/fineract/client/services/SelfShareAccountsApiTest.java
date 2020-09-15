package org.apache.fineract.client.services;

import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.models.GetShareAccountsClientIdProductIdResponse;
import org.apache.fineract.client.models.PostNewShareApplicationResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SelfShareAccountsApi
 */
public class SelfShareAccountsApiTest {

    private SelfShareAccountsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(SelfShareAccountsApi.class);
    }


    /**
     * Submit new share application
     *
     * Mandatory fields:  clientId, productId, submittedDate, savingsAccountId, requestedShares, applicationDate   Optional Fields  accountNo, externalId   Inherited from Product (if not provided)  minimumActivePeriod, minimumActivePeriodFrequencyType, lockinPeriodFrequency, lockinPeriodFrequencyType.
     */
    @Test
    public void createAccount1Test() {
        String body = null;
        // List<PostNewShareApplicationResponse> response = api.createAccount1(body);

        // TODO: test validations
    }

    /**
     * Retrieve a share application/account
     *
     *    Example Requests:  self/shareaccounts/12 
     */
    @Test
    public void retrieveShareAccountTest() {
        Long accountId = null;
        // String response = api.retrieveShareAccount(accountId);

        // TODO: test validations
    }

    /**
     * Retrieve Share Account Template
     *
     * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of: Field Defaults  Allowed Value Lists   Arguments  clientId:Integer mandatory productId:Integer optionalIf entered, productId, productName and selectedProduct fields are returned. Example Requests:  self/shareaccounts/template?clientId&#x3D;14  self/shareaccounts/template?clientId&#x3D;14&amp;productId&#x3D;3 
     */
    @Test
    public void template19Test() {
        Long clientId = null;
        Long productId = null;
        // List<GetShareAccountsClientIdProductIdResponse> response = api.template19(clientId, productId);

        // TODO: test validations
    }
}
