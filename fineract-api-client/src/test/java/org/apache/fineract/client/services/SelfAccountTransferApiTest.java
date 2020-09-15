package org.apache.fineract.client.services;

import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.models.GetAccountTransferTemplateResponse;
import org.apache.fineract.client.models.PostNewTransferResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SelfAccountTransferApi
 */
public class SelfAccountTransferApiTest {

    private SelfAccountTransferApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(SelfAccountTransferApi.class);
    }


    /**
     * Create new Transfer
     *
     * Ability to create new transfer of monetary funds from one account to another.   Example Requests:   self/accounttransfers/ 
     */
    @Test
    public void create13Test() {
        String body = null;
        String type = null;
        // List<PostNewTransferResponse> response = api.create13(body, type);

        // TODO: test validations
    }

    /**
     * Retrieve Account Transfer Template
     *
     * Returns list of loan/savings accounts that can be used for account transfer   Example Requests:  self/accounttransfers/template 
     */
    @Test
    public void template15Test() {
        String type = null;
        // List<GetAccountTransferTemplateResponse> response = api.template15(type);

        // TODO: test validations
    }
}
