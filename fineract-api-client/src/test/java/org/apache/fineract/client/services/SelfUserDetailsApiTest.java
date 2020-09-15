package org.apache.fineract.client.services;

import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.models.GetSelfUserDetailsResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SelfUserDetailsApi
 */
public class SelfUserDetailsApiTest {

    private SelfUserDetailsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(SelfUserDetailsApi.class);
    }


    /**
     * Fetch authenticated user details
     *
     * Checks the Authentication and returns the set roles and permissions allowed  For more info visit this link - https://demo.fineract.dev/fineract-provider/api-docs/apiLive.htm#selfoauth
     */
    @Test
    public void fetchAuthenticatedUserData1Test() {
        String accessToken = null;
        // GetSelfUserDetailsResponse response = api.fetchAuthenticatedUserData1(accessToken);

        // TODO: test validations
    }
}
