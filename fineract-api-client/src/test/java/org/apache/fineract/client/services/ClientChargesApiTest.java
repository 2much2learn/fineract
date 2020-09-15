package org.apache.fineract.client.services;

import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.models.DeleteClientsClientIdChargesChargeIdResponse;
import org.apache.fineract.client.models.GetClientsChargesPageItems;
import org.apache.fineract.client.models.GetClientsClientIdChargesResponse;
import org.apache.fineract.client.models.PostClientsClientIdChargesChargeIdRequest;
import org.apache.fineract.client.models.PostClientsClientIdChargesChargeIdResponse;
import org.apache.fineract.client.models.PostClientsClientIdChargesRequest;
import org.apache.fineract.client.models.PostClientsClientIdChargesResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ClientChargesApi
 */
public class ClientChargesApiTest {

    private ClientChargesApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(ClientChargesApi.class);
    }


    /**
     * Add Client Charge
     *
     *  This API associates a Client charge with an implicit Client account Mandatory Fields :  chargeId and dueDate   Optional Fields :  amount
     */
    @Test
    public void applyClientChargeTest() {
        PostClientsClientIdChargesRequest body = null;
        Long clientId = null;
        // PostClientsClientIdChargesResponse response = api.applyClientCharge(body, clientId);

        // TODO: test validations
    }

    /**
     * Delete a Client Charge
     *
     * Deletes a Client Charge on which no transactions have taken place (either payments or waivers). 
     */
    @Test
    public void deleteClientChargeTest() {
        Long clientId = null;
        Long chargeId = null;
        // DeleteClientsClientIdChargesChargeIdResponse response = api.deleteClientCharge(clientId, chargeId);

        // TODO: test validations
    }

    /**
     * Pay a Client Charge | Waive a Client Charge
     *
     * Pay a Client Charge:  Mandatory Fields:transactionDate and amount \&quot;Pay either a part of or the entire due amount for a charge.(command&#x3D;paycharge)  Waive a Client Charge:   This API provides the facility of waiving off the remaining amount on a client charge (command&#x3D;waive)  Showing request/response for &#x27;Pay a Client Charge&#x27;
     */
    @Test
    public void payOrWaiveClientChargeTest() {
        PostClientsClientIdChargesChargeIdRequest body = null;
        Long clientId = null;
        Long chargeId = null;
        String command = null;
        // PostClientsClientIdChargesChargeIdResponse response = api.payOrWaiveClientCharge(body, clientId, chargeId, command);

        // TODO: test validations
    }

    /**
     * List Client Charges
     *
     * The list capability of client charges supports pagination.Example Requests: clients/1/charges  clients/1/charges?offset&#x3D;0&amp;limit&#x3D;5
     */
    @Test
    public void retrieveAllClientChargesTest() {
        Long clientId = null;
        String chargeStatus = null;
        Boolean pendingPayment = null;
        Integer limit = null;
        Integer offset = null;
        // GetClientsClientIdChargesResponse response = api.retrieveAllClientCharges(clientId, chargeStatus, pendingPayment, limit, offset);

        // TODO: test validations
    }

    /**
     * Retrieve a Client Charge
     *
     * Example Requests: clients/1/charges/1   clients/1/charges/1?fields&#x3D;name,id
     */
    @Test
    public void retrieveClientChargeTest() {
        Long clientId = null;
        Long chargeId = null;
        // GetClientsChargesPageItems response = api.retrieveClientCharge(clientId, chargeId);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void retrieveTemplate4Test() {
        Long clientId = null;
        // String response = api.retrieveTemplate4(clientId);

        // TODO: test validations
    }
}
