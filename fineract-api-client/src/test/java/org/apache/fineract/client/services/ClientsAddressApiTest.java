package org.apache.fineract.client.services;

import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.models.GetClientClientIdAddressesResponse;
import org.apache.fineract.client.models.PostClientClientIdAddressesRequest;
import org.apache.fineract.client.models.PostClientClientIdAddressesResponse;
import org.apache.fineract.client.models.PutClientClientIdAddressesRequest;
import org.apache.fineract.client.models.PutClientClientIdAddressesResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ClientsAddressApi
 */
public class ClientsAddressApiTest {

    private ClientsAddressApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(ClientsAddressApi.class);
    }


    /**
     * Create an address for a Client
     *
     * Mandatory Fields :  type and clientId
     */
    @Test
    public void addClientAddressTest() {
        PostClientClientIdAddressesRequest body = null;
        Long clientid = null;
        Long type = null;
        // PostClientClientIdAddressesResponse response = api.addClientAddress(body, clientid, type);

        // TODO: test validations
    }

    /**
     * List all addresses for a Client
     *
     * Example Requests:  client/1/addresses   clients/1/addresses?status&#x3D;false,true&amp;&amp;type&#x3D;1,2,3
     */
    @Test
    public void getAddresses1Test() {
        Long clientid = null;
        String status = null;
        Long type = null;
        // List<GetClientClientIdAddressesResponse> response = api.getAddresses1(clientid, status, type);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void getAddressesTemplateTest() {
        // String response = api.getAddressesTemplate();

        // TODO: test validations
    }

    /**
     * Update an address for a Client
     *
     * All the address fields can be updated by using update client address API  Mandatory Fields type and addressId
     */
    @Test
    public void updateClientAddressTest() {
        PutClientClientIdAddressesRequest body = null;
        Long clientid = null;
        // PutClientClientIdAddressesResponse response = api.updateClientAddress(body, clientid);

        // TODO: test validations
    }
}
