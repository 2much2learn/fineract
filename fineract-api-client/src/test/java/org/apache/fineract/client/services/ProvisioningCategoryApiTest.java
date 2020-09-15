package org.apache.fineract.client.services;

import org.apache.fineract.client.ApiClient;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ProvisioningCategoryApi
 */
public class ProvisioningCategoryApiTest {

    private ProvisioningCategoryApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(ProvisioningCategoryApi.class);
    }


    /**
     * 
     *
     * 
     */
    @Test
    public void createProvisioningCategoryTest() {
        String body = null;
        // String response = api.createProvisioningCategory(body);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void deleteProvisioningCategoryTest() {
        Long categoryId = null;
        // String response = api.deleteProvisioningCategory(categoryId);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void retrieveAll15Test() {
        // String response = api.retrieveAll15();

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void updateProvisioningCategoryTest() {
        Long categoryId = null;
        String body = null;
        // String response = api.updateProvisioningCategory(categoryId, body);

        // TODO: test validations
    }
}
