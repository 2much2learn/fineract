package org.apache.fineract.client.services;

import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.models.ExternalServicesPropertiesData;
import org.apache.fineract.client.models.PutExternalServiceRequest;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ExternalServicesApi
 */
public class ExternalServicesApiTest {

    private ExternalServicesApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(ExternalServicesApi.class);
    }


    /**
     * Retrieve External Services Configuration
     *
     * Returns a external Service configurations based on the Service Name.  Service Names supported are S3 and SMTP.  Example Requests:  externalservice/SMTP
     */
    @Test
    public void retrieveOne2Test() {
        String servicename = null;
        // ExternalServicesPropertiesData response = api.retrieveOne2(servicename);

        // TODO: test validations
    }

    /**
     * Update External Service
     *
     * Updates the external Service Configuration for a Service Name.  Example:   externalservice/S3
     */
    @Test
    public void updateExternalServicePropertiesTest() {
        PutExternalServiceRequest body = null;
        String servicename = null;
        // Void response = api.updateExternalServiceProperties(body, servicename);

        // TODO: test validations
    }
}
