package org.apache.fineract.client.services;

import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.models.PutSelfUserRequest;
import org.apache.fineract.client.models.PutSelfUserResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SelfUserApi
 */
public class SelfUserApiTest {

    private SelfUserApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(SelfUserApi.class);
    }


    /**
     * Update User
     *
     * This API can be used by Self Service user to update their own user information. Currently, \&quot;password\&quot; and \&quot;repeatPassword\&quot; are the only parameters accepted.
     */
    @Test
    public void update21Test() {
        PutSelfUserRequest body = null;
        // PutSelfUserResponse response = api.update21(body);

        // TODO: test validations
    }
}
