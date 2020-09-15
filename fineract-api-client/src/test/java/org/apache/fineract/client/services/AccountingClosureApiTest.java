package org.apache.fineract.client.services;

import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.models.DeleteGlClosuresResponse;
import org.apache.fineract.client.models.GetGlClosureResponse;
import org.apache.fineract.client.models.PostGlClosuresRequest;
import org.apache.fineract.client.models.PostGlClosuresResponse;
import org.apache.fineract.client.models.PutGlClosuresRequest;
import org.apache.fineract.client.models.PutGlClosuresResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AccountingClosureApi
 */
public class AccountingClosureApiTest {

    private AccountingClosureApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(AccountingClosureApi.class);
    }


    /**
     * Create an Accounting Closure
     *
     * Mandatory Fields officeId,closingDate
     */
    @Test
    public void createGLClosureTest() {
        PostGlClosuresRequest body = null;
        // PostGlClosuresResponse response = api.createGLClosure(body);

        // TODO: test validations
    }

    /**
     * Delete an accounting closure
     *
     * Note: Only the latest accounting closure associated with a branch may be deleted.
     */
    @Test
    public void deleteGLClosureTest() {
        Long glClosureId = null;
        // DeleteGlClosuresResponse response = api.deleteGLClosure(glClosureId);

        // TODO: test validations
    }

    /**
     * Retrieve an Accounting Closure
     *
     * Example Requests:  glclosures/1   /glclosures/1?fields&#x3D;officeName,closingDate
     */
    @Test
    public void retreiveClosureTest() {
        Long glClosureId = null;
        // GetGlClosureResponse response = api.retreiveClosure(glClosureId);

        // TODO: test validations
    }

    /**
     * List Accounting closures
     *
     * Example Requests:  glclosures
     */
    @Test
    public void retrieveAllClosuresTest() {
        Long officeId = null;
        // List<GetGlClosureResponse> response = api.retrieveAllClosures(officeId);

        // TODO: test validations
    }

    /**
     * Update an Accounting closure
     *
     * Once an accounting closure is created, only the comments associated with it may be edited
     */
    @Test
    public void updateGLClosureTest() {
        Long glClosureId = null;
        PutGlClosuresRequest body = null;
        // PutGlClosuresResponse response = api.updateGLClosure(glClosureId, body);

        // TODO: test validations
    }
}
