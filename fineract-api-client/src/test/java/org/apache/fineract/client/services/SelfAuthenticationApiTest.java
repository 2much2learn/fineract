package org.apache.fineract.client.services;

import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.models.PostSelfAuthenticationResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SelfAuthenticationApi
 */
public class SelfAuthenticationApiTest {

    private SelfAuthenticationApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(SelfAuthenticationApi.class);
    }


    /**
     * Verify authentication
     *
     * Authenticates the credentials provided and returns the set roles and permissions allowed.  Please visit this link for more info - https://demo.fineract.dev/fineract-provider/api-docs/apiLive.htm#selfbasicauth
     */
    @Test
    public void authenticate1Test() {
        String body = null;
        // PostSelfAuthenticationResponse response = api.authenticate1(body);

        // TODO: test validations
    }
}
