package org.apache.fineract.client.services;

import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.models.GetGlobalConfigurationsResponse;
import org.apache.fineract.client.models.PutGlobalConfigurationsRequest;
import org.apache.fineract.client.models.PutGlobalConfigurationsResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GlobalConfigurationApi
 */
public class GlobalConfigurationApiTest {

    private GlobalConfigurationApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(GlobalConfigurationApi.class);
    }


    /**
     * Retrieve Global Configuration | Retrieve Global Configuration for surveys
     *
     * Returns the list global enable/disable configurations.  Example Requests:  configurations   Returns the list global enable/disable survey configurations.  Example Requests:  configurations/survey
     */
    @Test
    public void retrieveConfigurationTest() {
        Boolean survey = null;
        // List<GetGlobalConfigurationsResponse> response = api.retrieveConfiguration(survey);

        // TODO: test validations
    }

    /**
     * Retrieve Global Configuration
     *
     * Returns a global enable/disable configurations.  Example Requests:  configurations/1
     */
    @Test
    public void retrieveOne3Test() {
        Long configId = null;
        // GetGlobalConfigurationsResponse response = api.retrieveOne3(configId);

        // TODO: test validations
    }

    /**
     * Update Global Configuration
     *
     * Updates an enable/disable global configuration item.
     */
    @Test
    public void updateConfiguration1Test() {
        PutGlobalConfigurationsRequest body = null;
        Long configId = null;
        // PutGlobalConfigurationsResponse response = api.updateConfiguration1(body, configId);

        // TODO: test validations
    }
}
