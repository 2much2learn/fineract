package org.apache.fineract.client.services;

import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.models.DeleteHookResponse;
import org.apache.fineract.client.models.GetHookResponse;
import org.apache.fineract.client.models.GetHookTemplateResponse;
import org.apache.fineract.client.models.PostHookRequest;
import org.apache.fineract.client.models.PostHookResponse;
import org.apache.fineract.client.models.PutHookRequest;
import org.apache.fineract.client.models.PutHookResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for HooksApi
 */
public class HooksApiTest {

    private HooksApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(HooksApi.class);
    }


    /**
     * Create a Hook
     *
     * The following parameters can be passed for the creation of a hook :-  name - string - Required. The name of the template that is being called. (See /hooks/template for the list of valid hook names.)  isActive - boolean - Determines whether the hook is actually triggered.  events - array - Determines what events the hook is triggered for.  config - hash - Required. Key/value pairs to provide settings for this hook. These settings vary between the templates.  templateId - Optional. The UGD template ID associated with the same entity (client or loan).
     */
    @Test
    public void createHookTest() {
        PostHookRequest body = null;
        // PostHookResponse response = api.createHook(body);

        // TODO: test validations
    }

    /**
     * Delete a Hook
     *
     * Deletes a hook.
     */
    @Test
    public void deleteHookTest() {
        Long hookId = null;
        // DeleteHookResponse response = api.deleteHook(hookId);

        // TODO: test validations
    }

    /**
     * Retrieve a Hook
     *
     * Returns the details of a Hook.  Example Requests:  hooks/1
     */
    @Test
    public void retrieveHookTest() {
        Long hookId = null;
        // GetHookResponse response = api.retrieveHook(hookId);

        // TODO: test validations
    }

    /**
     * Retrieve Hooks
     *
     * Returns the list of hooks.  Example Requests:  hooks
     */
    @Test
    public void retrieveHooksTest() {
        // List<GetHookResponse> response = api.retrieveHooks();

        // TODO: test validations
    }

    /**
     * Retrieve Hooks Template
     *
     * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed description Lists Example Request:  hooks/template
     */
    @Test
    public void template3Test() {
        // GetHookTemplateResponse response = api.template3();

        // TODO: test validations
    }

    /**
     * Update a Hook
     *
     * Updates the details of a hook.
     */
    @Test
    public void updateHookTest() {
        PutHookRequest body = null;
        Long hookId = null;
        // PutHookResponse response = api.updateHook(body, hookId);

        // TODO: test validations
    }
}
