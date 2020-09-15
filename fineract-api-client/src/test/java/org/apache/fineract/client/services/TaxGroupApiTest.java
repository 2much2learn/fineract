package org.apache.fineract.client.services;

import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.models.GetTaxesGroupResponse;
import org.apache.fineract.client.models.PostTaxesGroupRequest;
import org.apache.fineract.client.models.PostTaxesGroupResponse;
import org.apache.fineract.client.models.PutTaxesGroupTaxGroupIdRequest;
import org.apache.fineract.client.models.PutTaxesGroupTaxGroupIdResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TaxGroupApi
 */
public class TaxGroupApiTest {

    private TaxGroupApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(TaxGroupApi.class);
    }


    /**
     * Create a new Tax Group
     *
     * Create a new Tax Group Mandatory Fields: name and taxComponents Mandatory Fields in taxComponents: taxComponentId Optional Fields in taxComponents: id, startDate and endDate
     */
    @Test
    public void createTaxGroupTest() {
        PostTaxesGroupRequest body = null;
        // PostTaxesGroupResponse response = api.createTaxGroup(body);

        // TODO: test validations
    }

    /**
     * List Tax Group
     *
     * List Tax Group
     */
    @Test
    public void retrieveAllTaxGroupsTest() {
        // List<GetTaxesGroupResponse> response = api.retrieveAllTaxGroups();

        // TODO: test validations
    }

    /**
     * Retrieve Tax Group
     *
     * Retrieve Tax Group
     */
    @Test
    public void retrieveTaxGroupTest() {
        Long taxGroupId = null;
        // GetTaxesGroupResponse response = api.retrieveTaxGroup(taxGroupId);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void retrieveTemplate21Test() {
        // String response = api.retrieveTemplate21();

        // TODO: test validations
    }

    /**
     * Update Tax Group
     *
     * Updates Tax Group. Only end date can be up-datable and can insert new tax components.
     */
    @Test
    public void updateTaxGroupTest() {
        PutTaxesGroupTaxGroupIdRequest body = null;
        Long taxGroupId = null;
        // PutTaxesGroupTaxGroupIdResponse response = api.updateTaxGroup(body, taxGroupId);

        // TODO: test validations
    }
}
