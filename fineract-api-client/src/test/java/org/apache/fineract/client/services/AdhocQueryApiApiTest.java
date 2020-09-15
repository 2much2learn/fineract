package org.apache.fineract.client.services;

import org.apache.fineract.client.ApiClient;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AdhocQueryApiApi
 */
public class AdhocQueryApiApiTest {

    private AdhocQueryApiApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(AdhocQueryApiApi.class);
    }


    /**
     * 
     *
     * 
     */
    @Test
    public void createAdHocQueryTest() {
        String body = null;
        // String response = api.createAdHocQuery(body);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void deleteAdHocQueryTest() {
        Long adHocId = null;
        // String response = api.deleteAdHocQuery(adHocId);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void retrieveAdHocQueryTest() {
        Long adHocId = null;
        // String response = api.retrieveAdHocQuery(adHocId);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void retrieveAll2Test() {
        // String response = api.retrieveAll2();

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void templateTest() {
        // String response = api.template();

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void updateTest() {
        Long adHocId = null;
        String body = null;
        // String response = api.update(adHocId, body);

        // TODO: test validations
    }
}
