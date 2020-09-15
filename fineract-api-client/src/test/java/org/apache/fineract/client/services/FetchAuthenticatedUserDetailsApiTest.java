package org.apache.fineract.client.services;

import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.models.GetUserDetailsResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FetchAuthenticatedUserDetailsApi
 */
public class FetchAuthenticatedUserDetailsApiTest {

    private FetchAuthenticatedUserDetailsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(FetchAuthenticatedUserDetailsApi.class);
    }


    /**
     * Fetch authenticated user details 
     *
     * checks the Authentication and returns the set roles and permissions allowed.
     */
    @Test
    public void fetchAuthenticatedUserDataTest() {
        String accessToken = null;
        // GetUserDetailsResponse response = api.fetchAuthenticatedUserData(accessToken);

        // TODO: test validations
    }
}
