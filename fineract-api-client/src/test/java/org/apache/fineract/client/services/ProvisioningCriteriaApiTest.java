package org.apache.fineract.client.services;

import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.models.DeleteProvisioningCriteriaResponse;
import org.apache.fineract.client.models.GetProvisioningCriteriaCriteriaIdResponse;
import org.apache.fineract.client.models.GetProvisioningCriteriaResponse;
import org.apache.fineract.client.models.PostProvisioningCriteriaRequest;
import org.apache.fineract.client.models.PostProvisioningCriteriaResponse;
import org.apache.fineract.client.models.PutProvisioningCriteriaRequest;
import org.apache.fineract.client.models.PutProvisioningCriteriaResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ProvisioningCriteriaApi
 */
public class ProvisioningCriteriaApiTest {

    private ProvisioningCriteriaApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(ProvisioningCriteriaApi.class);
    }


    /**
     * Create a new Provisioning Criteria
     *
     * Creates a new Provisioning Criteria  Mandatory Fields:  criteriaName provisioningcriteria  Optional Fields:  loanProducts
     */
    @Test
    public void createProvisioningCriteriaTest() {
        PostProvisioningCriteriaRequest body = null;
        // PostProvisioningCriteriaResponse response = api.createProvisioningCriteria(body);

        // TODO: test validations
    }

    /**
     * Deletes Provisioning Criteria
     *
     * Deletes Provisioning Criteria
     */
    @Test
    public void deleteProvisioningCriteriaTest() {
        Long criteriaId = null;
        // DeleteProvisioningCriteriaResponse response = api.deleteProvisioningCriteria(criteriaId);

        // TODO: test validations
    }

    /**
     * Retrieves all created Provisioning Criterias
     *
     * Retrieves all created Provisioning Criterias
     */
    @Test
    public void retrieveAllProvisioningCriteriasTest() {
        // List<GetProvisioningCriteriaResponse> response = api.retrieveAllProvisioningCriterias();

        // TODO: test validations
    }

    /**
     * Retrieves a Provisioning Criteria
     *
     * Retrieves a Provisioning Criteria
     */
    @Test
    public void retrieveProvisioningCriteriaTest() {
        Long criteriaId = null;
        // GetProvisioningCriteriaCriteriaIdResponse response = api.retrieveProvisioningCriteria(criteriaId);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void retrieveTemplate3Test() {
        // String response = api.retrieveTemplate3();

        // TODO: test validations
    }

    /**
     * Updates a new Provisioning Criteria
     *
     * Updates a new Provisioning Criteria  Optional Fields criteriaName, loanProducts, provisioningcriteria
     */
    @Test
    public void updateProvisioningCriteriaTest() {
        PutProvisioningCriteriaRequest body = null;
        Long criteriaId = null;
        // PutProvisioningCriteriaResponse response = api.updateProvisioningCriteria(body, criteriaId);

        // TODO: test validations
    }
}
