package org.apache.fineract.client.services;

import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.models.DeleteCodesResponse;
import org.apache.fineract.client.models.GetCodesResponse;
import org.apache.fineract.client.models.PostCodesRequest;
import org.apache.fineract.client.models.PostCodesResponse;
import org.apache.fineract.client.models.PutCodesRequest;
import org.apache.fineract.client.models.PutCodesResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CodesApi
 */
public class CodesApiTest {

    private CodesApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(CodesApi.class);
    }


    /**
     * Create a Code
     *
     * Creates a code. Codes created through api are always &#x27;user defined&#x27; and so system defined is marked as false.
     */
    @Test
    public void createCodeTest() {
        PostCodesRequest body = null;
        // PostCodesResponse response = api.createCode(body);

        // TODO: test validations
    }

    /**
     * Delete a Code
     *
     * Deletes a code if it is not system defined.
     */
    @Test
    public void deleteCodeTest() {
        Long codeId = null;
        // DeleteCodesResponse response = api.deleteCode(codeId);

        // TODO: test validations
    }

    /**
     * Retrieve a Code
     *
     * Returns the details of a Code.  Example Requests:  codes/1
     */
    @Test
    public void retrieveCodeTest() {
        Long codeId = null;
        // GetCodesResponse response = api.retrieveCode(codeId);

        // TODO: test validations
    }

    /**
     * Retrieve Codes
     *
     * Returns the list of codes.  Example Requests:  codes
     */
    @Test
    public void retrieveCodesTest() {
        // List<GetCodesResponse> response = api.retrieveCodes();

        // TODO: test validations
    }

    /**
     * Update a Code
     *
     * Updates the details of a code if it is not system defined.
     */
    @Test
    public void updateCodeTest() {
        PutCodesRequest body = null;
        Long codeId = null;
        // PutCodesResponse response = api.updateCode(body, codeId);

        // TODO: test validations
    }
}
