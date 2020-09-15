package org.apache.fineract.client.services;

import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.models.DeleteFinancialActivityAccountsResponse;
import org.apache.fineract.client.models.GetFinancialActivityAccountsResponse;
import org.apache.fineract.client.models.PostFinancialActivityAccountsRequest;
import org.apache.fineract.client.models.PostFinancialActivityAccountsResponse;
import org.apache.fineract.client.models.PutFinancialActivityAccountsResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MappingFinancialActivitiesToAccountsApi
 */
public class MappingFinancialActivitiesToAccountsApiTest {

    private MappingFinancialActivitiesToAccountsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(MappingFinancialActivitiesToAccountsApi.class);
    }


    /**
     * Create a new Financial Activity to Accounts Mapping
     *
     * Mandatory Fields financialActivityId, glAccountId
     */
    @Test
    public void createGLAccountTest() {
        PostFinancialActivityAccountsRequest body = null;
        // PostFinancialActivityAccountsResponse response = api.createGLAccount(body);

        // TODO: test validations
    }

    /**
     * Delete a Financial Activity to Account Mapping
     *
     * 
     */
    @Test
    public void deleteGLAccountTest() {
        Long mappingId = null;
        // DeleteFinancialActivityAccountsResponse response = api.deleteGLAccount(mappingId);

        // TODO: test validations
    }

    /**
     * Retrieve a Financial Activity to Account Mapping 
     *
     * Example Requests:  financialactivityaccounts/1
     */
    @Test
    public void retreiveTest() {
        Long mappingId = null;
        // GetFinancialActivityAccountsResponse response = api.retreive(mappingId);

        // TODO: test validations
    }

    /**
     * List Financial Activities to Accounts Mappings
     *
     * Example Requests:  financialactivityaccounts
     */
    @Test
    public void retrieveAllTest() {
        // List<GetFinancialActivityAccountsResponse> response = api.retrieveAll();

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void retrieveTemplateTest() {
        // String response = api.retrieveTemplate();

        // TODO: test validations
    }

    /**
     * Update a Financial Activity to Account Mapping
     *
     * the API updates the Ledger account linked to a Financial Activity  
     */
    @Test
    public void updateGLAccountTest() {
        Long mappingId = null;
        PostFinancialActivityAccountsRequest body = null;
        // PutFinancialActivityAccountsResponse response = api.updateGLAccount(mappingId, body);

        // TODO: test validations
    }
}
