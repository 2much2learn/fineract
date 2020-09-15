package org.apache.fineract.client.services;

import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.models.DeleteClientsClientIdIdentifiersIdentifierIdResponse;
import org.apache.fineract.client.models.GetClientsClientIdIdentifiersResponse;
import org.apache.fineract.client.models.GetClientsClientIdIdentifiersTemplateResponse;
import org.apache.fineract.client.models.PostClientsClientIdIdentifiersRequest;
import org.apache.fineract.client.models.PostClientsClientIdIdentifiersResponse;
import org.apache.fineract.client.models.PutClientsClientIdIdentifiersIdentifierIdRequest;
import org.apache.fineract.client.models.PutClientsClientIdIdentifiersIdentifierIdResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ClientIdentifierApi
 */
public class ClientIdentifierApiTest {

    private ClientIdentifierApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(ClientIdentifierApi.class);
    }


    /**
     * Create an Identifier for a Client
     *
     * Mandatory Fields documentKey, documentTypeId 
     */
    @Test
    public void createClientIdentifierTest() {
        PostClientsClientIdIdentifiersRequest body = null;
        Long clientId = null;
        // PostClientsClientIdIdentifiersResponse response = api.createClientIdentifier(body, clientId);

        // TODO: test validations
    }

    /**
     * Delete a Client Identifier
     *
     * Deletes a Client Identifier
     */
    @Test
    public void deleteClientIdentifierTest() {
        Long clientId = null;
        Long identifierId = null;
        // DeleteClientsClientIdIdentifiersIdentifierIdResponse response = api.deleteClientIdentifier(clientId, identifierId);

        // TODO: test validations
    }

    /**
     * Retrieve Client Identifier Details Template
     *
     * This is a convenience resource useful for building maintenance user interface screens for client applications. The template data returned consists of any or all of:   Field Defaults  Allowed description Lists   Example Request: clients/1/identifiers/template
     */
    @Test
    public void newClientIdentifierDetailsTest() {
        Long clientId = null;
        // GetClientsClientIdIdentifiersTemplateResponse response = api.newClientIdentifierDetails(clientId);

        // TODO: test validations
    }

    /**
     * List all Identifiers for a Client
     *
     * Example Requests: clients/1/identifiers   clients/1/identifiers?fields&#x3D;documentKey,documentType,description
     */
    @Test
    public void retrieveAllClientIdentifiersTest() {
        Long clientId = null;
        // List<GetClientsClientIdIdentifiersResponse> response = api.retrieveAllClientIdentifiers(clientId);

        // TODO: test validations
    }

    /**
     * Retrieve a Client Identifier
     *
     * Example Requests: clients/1/identifier/2   clients/1/identifier/2?template&#x3D;true  clients/1/identifiers/2?fields&#x3D;documentKey,documentType,description
     */
    @Test
    public void retrieveClientIdentifiersTest() {
        Long clientId = null;
        Long identifierId = null;
        // GetClientsClientIdIdentifiersResponse response = api.retrieveClientIdentifiers(clientId, identifierId);

        // TODO: test validations
    }

    /**
     * Update a Client Identifier
     *
     * Updates a Client Identifier
     */
    @Test
    public void updateClientIdentiferTest() {
        PutClientsClientIdIdentifiersIdentifierIdRequest body = null;
        Long clientId = null;
        Long identifierId = null;
        // PutClientsClientIdIdentifiersIdentifierIdResponse response = api.updateClientIdentifer(body, clientId, identifierId);

        // TODO: test validations
    }
}
