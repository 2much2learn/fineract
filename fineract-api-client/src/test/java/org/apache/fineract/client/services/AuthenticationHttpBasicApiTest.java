package org.apache.fineract.client.services;

import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.models.PostAuthenticationResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AuthenticationHttpBasicApi
 */
public class AuthenticationHttpBasicApiTest {

    private AuthenticationHttpBasicApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(AuthenticationHttpBasicApi.class);
    }


    /**
     * Verify authentication
     *
     * Authenticates the credentials provided and returns the set roles and permissions allowed.
     */
    @Test
    public void authenticateTest() {
        String body = null;
        // PostAuthenticationResponse response = api.authenticate(body);

        // TODO: test validations
    }
}
