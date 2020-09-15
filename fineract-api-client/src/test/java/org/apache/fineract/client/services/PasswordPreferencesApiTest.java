package org.apache.fineract.client.services;

import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.models.GetPasswordPreferencesTemplateResponse;
import org.apache.fineract.client.models.PutPasswordPreferencesTemplateRequest;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PasswordPreferencesApi
 */
public class PasswordPreferencesApiTest {

    private PasswordPreferencesApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(PasswordPreferencesApi.class);
    }


    /**
     * 
     *
     * 
     */
    @Test
    public void retrieve1Test() {
        // GetPasswordPreferencesTemplateResponse response = api.retrieve1();

        // TODO: test validations
    }

    /**
     * List Application Password validation policies
     *
     * ARGUMENTS Example Requests:  passwordpreferences
     */
    @Test
    public void template21Test() {
        // List<GetPasswordPreferencesTemplateResponse> response = api.template21();

        // TODO: test validations
    }

    /**
     * Update password preferences
     *
     * 
     */
    @Test
    public void update22Test() {
        PutPasswordPreferencesTemplateRequest body = null;
        // Void response = api.update22(body);

        // TODO: test validations
    }
}
