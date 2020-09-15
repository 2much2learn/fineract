package org.apache.fineract.client.services;

import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.models.DeleteCodeValueDataResponse;
import org.apache.fineract.client.models.GetCodeValuesDataResponse;
import org.apache.fineract.client.models.PostCodeValueDataResponse;
import org.apache.fineract.client.models.PostCodeValuesDataRequest;
import org.apache.fineract.client.models.PutCodeValueDataResponse;
import org.apache.fineract.client.models.PutCodeValuesDataRequest;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CodeValuesApi
 */
public class CodeValuesApiTest {

    private CodeValuesApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(CodeValuesApi.class);
    }


    /**
     * Create a Code description
     *
     * 
     */
    @Test
    public void createCodeValueTest() {
        PostCodeValuesDataRequest body = null;
        Long codeId = null;
        // PostCodeValueDataResponse response = api.createCodeValue(body, codeId);

        // TODO: test validations
    }

    /**
     * Delete a Code description
     *
     * Deletes a code description
     */
    @Test
    public void deleteCodeValueTest() {
        Long codeId = null;
        Long codeValueId = null;
        // DeleteCodeValueDataResponse response = api.deleteCodeValue(codeId, codeValueId);

        // TODO: test validations
    }

    /**
     * List Code Values
     *
     * Returns the list of Code Values for a given Code  Example Requests:  codes/1/codevalues
     */
    @Test
    public void retrieveAllCodeValuesTest() {
        Long codeId = null;
        // List<GetCodeValuesDataResponse> response = api.retrieveAllCodeValues(codeId);

        // TODO: test validations
    }

    /**
     * Retrieve a Code description
     *
     * Returns the details of a Code Value  Example Requests:  codes/1/codevalues/1
     */
    @Test
    public void retrieveCodeValueTest() {
        Long codeValueId = null;
        Long codeId = null;
        // GetCodeValuesDataResponse response = api.retrieveCodeValue(codeValueId, codeId);

        // TODO: test validations
    }

    /**
     * Update a Code description
     *
     * Updates the details of a code description.
     */
    @Test
    public void updateCodeValueTest() {
        PutCodeValuesDataRequest body = null;
        Long codeId = null;
        Long codeValueId = null;
        // PutCodeValueDataResponse response = api.updateCodeValue(body, codeId, codeValueId);

        // TODO: test validations
    }
}
