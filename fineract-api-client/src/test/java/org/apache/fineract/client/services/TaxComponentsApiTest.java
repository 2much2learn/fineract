package org.apache.fineract.client.services;

import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.models.GetTaxesComponentsResponse;
import org.apache.fineract.client.models.PostTaxesComponentsRequest;
import org.apache.fineract.client.models.PostTaxesComponentsResponse;
import org.apache.fineract.client.models.PutTaxesComponentsTaxComponentIdRequest;
import org.apache.fineract.client.models.PutTaxesComponentsTaxComponentIdResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TaxComponentsApi
 */
public class TaxComponentsApiTest {

    private TaxComponentsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(TaxComponentsApi.class);
    }


    /**
     * Create a new Tax Component
     *
     * Creates a new Tax Component  Mandatory Fields: name, percentage  Optional Fields: debitAccountType, debitAcountId, creditAccountType, creditAcountId, startDate
     */
    @Test
    public void createTaxCompoentTest() {
        PostTaxesComponentsRequest body = null;
        // PostTaxesComponentsResponse response = api.createTaxCompoent(body);

        // TODO: test validations
    }

    /**
     * List Tax Components
     *
     * List Tax Components
     */
    @Test
    public void retrieveAllTaxComponentsTest() {
        // List<GetTaxesComponentsResponse> response = api.retrieveAllTaxComponents();

        // TODO: test validations
    }

    /**
     * Retrieve Tax Component
     *
     * Retrieve Tax Component
     */
    @Test
    public void retrieveTaxComponentTest() {
        Long taxComponentId = null;
        // GetTaxesComponentsResponse response = api.retrieveTaxComponent(taxComponentId);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void retrieveTemplate20Test() {
        // String response = api.retrieveTemplate20();

        // TODO: test validations
    }

    /**
     * Update Tax Component
     *
     * Updates Tax component. Debit and credit account details cannot be modified. All the future tax components would be replaced with the new percentage.
     */
    @Test
    public void updateTaxCompoentTest() {
        PutTaxesComponentsTaxComponentIdRequest body = null;
        Long taxComponentId = null;
        // PutTaxesComponentsTaxComponentIdResponse response = api.updateTaxCompoent(body, taxComponentId);

        // TODO: test validations
    }
}
