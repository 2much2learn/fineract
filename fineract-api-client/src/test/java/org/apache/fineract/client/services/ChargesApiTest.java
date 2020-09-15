package org.apache.fineract.client.services;

import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.models.DeleteChargesChargeIdResponse;
import org.apache.fineract.client.models.GetChargesResponse;
import org.apache.fineract.client.models.GetChargesTemplateResponse;
import org.apache.fineract.client.models.PostChargesRequest;
import org.apache.fineract.client.models.PostChargesResponse;
import org.apache.fineract.client.models.PutChargesChargeIdRequest;
import org.apache.fineract.client.models.PutChargesChargeIdResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ChargesApi
 */
public class ChargesApiTest {

    private ChargesApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(ChargesApi.class);
    }


    /**
     * Create/Define a Charge
     *
     * Define a new charge that can later be associated with loans and savings through their respective product definitions or directly on each account instance.
     */
    @Test
    public void createChargeTest() {
        PostChargesRequest body = null;
        // PostChargesResponse response = api.createCharge(body);

        // TODO: test validations
    }

    /**
     * Delete a Charge
     *
     * Deletes a Charge.
     */
    @Test
    public void deleteChargeTest() {
        Long chargeId = null;
        // DeleteChargesChargeIdResponse response = api.deleteCharge(chargeId);

        // TODO: test validations
    }

    /**
     * Retrieve Charges
     *
     * Returns the list of defined charges.  Example Requests:  charges
     */
    @Test
    public void retrieveAllChargesTest() {
        // List<GetChargesResponse> response = api.retrieveAllCharges();

        // TODO: test validations
    }

    /**
     * Retrieve a Charge
     *
     * Returns the details of a defined Charge.  Example Requests:  charges/1
     */
    @Test
    public void retrieveChargeTest() {
        Long chargeId = null;
        // GetChargesResponse response = api.retrieveCharge(chargeId);

        // TODO: test validations
    }

    /**
     * Retrieve Charge Template
     *
     * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed description Lists Example Request:  charges/template 
     */
    @Test
    public void retrieveNewChargeDetailsTest() {
        // GetChargesTemplateResponse response = api.retrieveNewChargeDetails();

        // TODO: test validations
    }

    /**
     * Update a Charge
     *
     * Updates the details of a Charge.
     */
    @Test
    public void updateChargeTest() {
        PutChargesChargeIdRequest body = null;
        Long chargeId = null;
        // PutChargesChargeIdResponse response = api.updateCharge(body, chargeId);

        // TODO: test validations
    }
}
