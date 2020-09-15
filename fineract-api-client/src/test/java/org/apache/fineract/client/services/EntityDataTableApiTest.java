package org.apache.fineract.client.services;

import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.models.DeleteEntityDatatableChecksTemplateResponse;
import org.apache.fineract.client.models.GetEntityDatatableChecksResponse;
import org.apache.fineract.client.models.GetEntityDatatableChecksTemplateResponse;
import org.apache.fineract.client.models.PostEntityDatatableChecksTemplateRequest;
import org.apache.fineract.client.models.PostEntityDatatableChecksTemplateResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EntityDataTableApi
 */
public class EntityDataTableApiTest {

    private EntityDataTableApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(EntityDataTableApi.class);
    }


    /**
     * Create Entity-Datatable Checks
     *
     * Mandatory Fields :  entity, status, datatableName  Non-Mandatory Fields :  productId
     */
    @Test
    public void createEntityDatatableCheckTest() {
        PostEntityDatatableChecksTemplateRequest body = null;
        // PostEntityDatatableChecksTemplateResponse response = api.createEntityDatatableCheck(body);

        // TODO: test validations
    }

    /**
     * Delete Entity-Datatable Checks
     *
     * Deletes an existing Entity-Datatable Check
     */
    @Test
    public void deleteDatatable1Test() {
        Long entityDatatableCheckId = null;
        String body = null;
        // DeleteEntityDatatableChecksTemplateResponse response = api.deleteDatatable1(entityDatatableCheckId, body);

        // TODO: test validations
    }

    /**
     * Retrieve Entity-Datatable Checks Template
     *
     * This is a convenience resource useful for building maintenance user interface screens for Entity-Datatable Checks applications. The template data returned consists of:  Allowed description Lists Example Request:  entityDatatableChecks/template
     */
    @Test
    public void getTemplateTest() {
        // GetEntityDatatableChecksTemplateResponse response = api.getTemplate();

        // TODO: test validations
    }

    /**
     * List Entity-Datatable Checks
     *
     * The list capability of Entity-Datatable Checks can support pagination.  OPTIONAL ARGUMENTS offset Integer optional, defaults to 0 Indicates the result from which pagination startslimit Integer optional, defaults to 200 Restricts the size of results returned. To override the default and return all entries you must explicitly pass a non-positive integer value for limit e.g. limit&#x3D;0, or limit&#x3D;-1 Example Request:  entityDatatableChecks?offset&#x3D;0&amp;limit&#x3D;15
     */
    @Test
    public void retrieveAll6Test() {
        Long status = null;
        String entity = null;
        Long productId = null;
        Integer offset = null;
        Integer limit = null;
        // List<GetEntityDatatableChecksResponse> response = api.retrieveAll6(status, entity, productId, offset, limit);

        // TODO: test validations
    }
}
