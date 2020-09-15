package org.apache.fineract.client.services;

import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.models.GetFieldConfigurationEntityResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EntityFieldConfigurationApi
 */
public class EntityFieldConfigurationApiTest {

    private EntityFieldConfigurationApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(EntityFieldConfigurationApi.class);
    }


    /**
     * Retrieves the Entity Field Configuration
     *
     * It retrieves all the Entity Field Configuration
     */
    @Test
    public void getAddressesTest() {
        String entity = null;
        // List<GetFieldConfigurationEntityResponse> response = api.getAddresses(entity);

        // TODO: test validations
    }
}
