package org.apache.fineract.client.services;

import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.models.DeleteUsersUserIdResponse;
import org.apache.fineract.client.models.FormDataContentDisposition;
import org.apache.fineract.client.models.GetUsersResponse;
import org.apache.fineract.client.models.GetUsersTemplateResponse;
import org.apache.fineract.client.models.GetUsersUserIdResponse;
import org.apache.fineract.client.models.PostUsersRequest;
import org.apache.fineract.client.models.PostUsersResponse;
import org.apache.fineract.client.models.PutUsersUserIdRequest;
import org.apache.fineract.client.models.PutUsersUserIdResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UsersApi
 */
public class UsersApiTest {

    private UsersApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(UsersApi.class);
    }


    /**
     * Create a User
     *
     * Adds new application user.  Note: Password information is not required (or processed). Password details at present are auto-generated and then sent to the email account given (which is why it can take a few seconds to complete).  Mandatory Fields:  username, firstname, lastname, email, officeId, roles, sendPasswordToEmail  Optional Fields:  staffId,passwordNeverExpires,isSelfServiceUser,clients
     */
    @Test
    public void create14Test() {
        PostUsersRequest body = null;
        // PostUsersResponse response = api.create14(body);

        // TODO: test validations
    }

    /**
     * Delete a User
     *
     * Removes the user and the associated roles and permissions.
     */
    @Test
    public void delete21Test() {
        Long userId = null;
        // DeleteUsersUserIdResponse response = api.delete21(userId);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void getUserTemplateTest() {
        Long officeId = null;
        Long staffId = null;
        String dateFormat = null;
        // Void response = api.getUserTemplate(officeId, staffId, dateFormat);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void postUsersTemplateTest() {
        FormDataContentDisposition file = null;
        String locale = null;
        String dateFormat = null;
        // String response = api.postUsersTemplate(file, locale, dateFormat);

        // TODO: test validations
    }

    /**
     * Retrieve list of users
     *
     * Example Requests:  users   users?fields&#x3D;id,username,email,officeName
     */
    @Test
    public void retrieveAll40Test() {
        // List<GetUsersResponse> response = api.retrieveAll40();

        // TODO: test validations
    }

    /**
     * Retrieve a User
     *
     * Example Requests:  users/1   users/1?template&#x3D;true   users/1?fields&#x3D;username,officeName
     */
    @Test
    public void retrieveOne28Test() {
        Long userId = null;
        // GetUsersUserIdResponse response = api.retrieveOne28(userId);

        // TODO: test validations
    }

    /**
     * Retrieve User Details Template
     *
     * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed description Lists Example Request:  users/template
     */
    @Test
    public void template22Test() {
        // GetUsersTemplateResponse response = api.template22();

        // TODO: test validations
    }

    /**
     * Update a User
     *
     * When updating a password you must provide the repeatPassword parameter also.
     */
    @Test
    public void update23Test() {
        PutUsersUserIdRequest body = null;
        Long userId = null;
        // PutUsersUserIdResponse response = api.update23(body, userId);

        // TODO: test validations
    }
}
