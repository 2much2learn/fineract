package org.apache.fineract.client.services;

import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.models.DeleteTemplatesTemplateIdResponse;
import org.apache.fineract.client.models.GetTemplatesResponse;
import org.apache.fineract.client.models.GetTemplatesTemplateIdResponse;
import org.apache.fineract.client.models.GetTemplatesTemplateResponse;
import org.apache.fineract.client.models.PostTemplatesRequest;
import org.apache.fineract.client.models.PostTemplatesResponse;
import org.apache.fineract.client.models.PutTemplatesTemplateIdRequest;
import org.apache.fineract.client.models.PutTemplatesTemplateIdResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UserGeneratedDocumentsApi
 */
public class UserGeneratedDocumentsApiTest {

    private UserGeneratedDocumentsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(UserGeneratedDocumentsApi.class);
    }


    /**
     * Add a UGD
     *
     * Adds a new UGD.  Mandatory Fields name    Example Requests:  templates/1
     */
    @Test
    public void createTemplateTest() {
        PostTemplatesRequest body = null;
        // PostTemplatesResponse response = api.createTemplate(body);

        // TODO: test validations
    }

    /**
     * Delete a UGD
     *
     * 
     */
    @Test
    public void deleteTemplateTest() {
        Long templateId = null;
        // DeleteTemplatesTemplateIdResponse response = api.deleteTemplate(templateId);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void getTemplateByTemplateTest() {
        Long templateId = null;
        // String response = api.getTemplateByTemplate(templateId);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void mergeTemplateTest() {
        Long templateId = null;
        String body = null;
        // String response = api.mergeTemplate(templateId, body);

        // TODO: test validations
    }

    /**
     * Retrieve all UGDs
     *
     * Example Requests:  templates  It is also possible to get specific UGDs by entity and type:  templates?type&#x3D;0&amp;entity&#x3D;0 [Entity: Id]      client: 0, loan: 1  [Type: Id]    Document: 0, E-Mail (not yet): 1,  SMS: 2
     */
    @Test
    public void retrieveAll39Test() {
        Integer typeId = null;
        Integer entityId = null;
        // GetTemplatesResponse response = api.retrieveAll39(typeId, entityId);

        // TODO: test validations
    }

    /**
     * Retrieve a UGD
     *
     * Example Requests:  templates/1
     */
    @Test
    public void retrieveOne27Test() {
        Long templateId = null;
        // GetTemplatesTemplateIdResponse response = api.retrieveOne27(templateId);

        // TODO: test validations
    }

    /**
     * Update a UGD
     *
     * 
     */
    @Test
    public void saveTemplateTest() {
        PutTemplatesTemplateIdRequest body = null;
        Long templateId = null;
        // PutTemplatesTemplateIdResponse response = api.saveTemplate(body, templateId);

        // TODO: test validations
    }

    /**
     * Retrieve UGD Details Template
     *
     * This is a convenience resource. It can be useful when building maintenance user interface screens for UGDs. The UGD data returned consists of any or all of:  ARGUMENTS name String entity String type String text String optional mappers Mapper optional Example Request:  templates/template
     */
    @Test
    public void template20Test() {
        // GetTemplatesTemplateResponse response = api.template20();

        // TODO: test validations
    }
}
