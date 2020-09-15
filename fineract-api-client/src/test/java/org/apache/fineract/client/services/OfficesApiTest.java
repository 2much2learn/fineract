package org.apache.fineract.client.services;

import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.models.FormDataContentDisposition;
import org.apache.fineract.client.models.GetOfficesResponse;
import org.apache.fineract.client.models.GetOfficesTemplateResponse;
import org.apache.fineract.client.models.PostOfficesRequest;
import org.apache.fineract.client.models.PostOfficesResponse;
import org.apache.fineract.client.models.PutOfficesOfficeIdRequest;
import org.apache.fineract.client.models.PutOfficesOfficeIdResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for OfficesApi
 */
public class OfficesApiTest {

    private OfficesApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(OfficesApi.class);
    }


    /**
     * Create an Office
     *
     * Mandatory Fields name, openingDate, parentId
     */
    @Test
    public void createOfficeTest() {
        PostOfficesRequest body = null;
        // PostOfficesResponse response = api.createOffice(body);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void getOfficeTemplateTest() {
        String dateFormat = null;
        // Void response = api.getOfficeTemplate(dateFormat);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void postOfficeTemplateTest() {
        FormDataContentDisposition file = null;
        String locale = null;
        String dateFormat = null;
        // String response = api.postOfficeTemplate(file, locale, dateFormat);

        // TODO: test validations
    }

    /**
     * Retrieve an Office
     *
     * Example Requests:  offices/1   offices/1?template&#x3D;true   offices/1?fields&#x3D;id,name,parentName
     */
    @Test
    public void retreiveOfficeTest() {
        Long officeId = null;
        // GetOfficesResponse response = api.retreiveOffice(officeId);

        // TODO: test validations
    }

    /**
     * Retrieve Office Details Template
     *
     * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed description Lists Example Request:  offices/template
     */
    @Test
    public void retrieveOfficeTemplate1Test() {
        // GetOfficesTemplateResponse response = api.retrieveOfficeTemplate1();

        // TODO: test validations
    }

    /**
     * List Offices
     *
     * Example Requests:  offices   offices?fields&#x3D;id,name,openingDate
     */
    @Test
    public void retrieveOfficesTest() {
        Boolean includeAllOffices = null;
        String orderBy = null;
        String sortOrder = null;
        // List<GetOfficesResponse> response = api.retrieveOffices(includeAllOffices, orderBy, sortOrder);

        // TODO: test validations
    }

    /**
     * Update Office
     *
     * 
     */
    @Test
    public void updateOfficeTest() {
        PutOfficesOfficeIdRequest body = null;
        Long officeId = null;
        // PutOfficesOfficeIdResponse response = api.updateOffice(body, officeId);

        // TODO: test validations
    }
}
