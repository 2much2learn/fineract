package org.apache.fineract.client.services;

import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.models.DateParam;
import org.apache.fineract.client.models.DeleteCentersCenterIdResponse;
import org.apache.fineract.client.models.FormDataContentDisposition;
import org.apache.fineract.client.models.GetCentersCenterIdAccountsResponse;
import org.apache.fineract.client.models.GetCentersCenterIdResponse;
import org.apache.fineract.client.models.GetCentersResponse;
import org.apache.fineract.client.models.GetCentersTemplateResponse;
import org.apache.fineract.client.models.PostCentersCenterIdRequest;
import org.apache.fineract.client.models.PostCentersCenterIdResponse;
import org.apache.fineract.client.models.PostCentersRequest;
import org.apache.fineract.client.models.PostCentersResponse;
import org.apache.fineract.client.models.PutCentersCenterIdRequest;
import org.apache.fineract.client.models.PutCentersCenterIdResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CentersApi
 */
public class CentersApiTest {

    private CentersApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(CentersApi.class);
    }


    /**
     * Activate a Center | Generate Collection Sheet | Save Collection Sheet | Close a Center | Associate Groups | Disassociate Groups
     *
     * Activate a Center:  Centers can be created in a Pending state. This API exists to enable center activation. If the center happens to be already active, this API will result in an error.  Close a Center:  Centers can be closed if they don&#x27;t have any non-closed groups or saving accounts. If the Center has any active groups or savings accounts, this API will result in an error.  Associate Groups:  This API allows associating existing groups to a center. The groups are listed from the office to which the center is associated. If group(s) is already associated with a center, this API will result in an error.  Disassociate Groups:  This API allows to disassociate groups from a center.  Generate Collection Sheet:  This Api retrieves repayment details of all jlg loans under a center as on a specified meeting date.  Save Collection Sheet:  This Api allows the loan officer to perform bulk repayments of JLG loans for a center on a given meeting date.  Showing Request/Response for Close a Center
     */
    @Test
    public void activate2Test() {
        PostCentersCenterIdRequest body = null;
        Long centerId = null;
        String command = null;
        // PostCentersCenterIdResponse response = api.activate2(body, centerId, command);

        // TODO: test validations
    }

    /**
     * Create a Center
     *
     * Creates a Center  Mandatory Fields: name, officeId, active, activationDate (if active&#x3D;true)  Optional Fields: externalId, staffId, groupMembers
     */
    @Test
    public void create6Test() {
        PostCentersRequest body = null;
        // PostCentersResponse response = api.create6(body);

        // TODO: test validations
    }

    /**
     * Delete a Center
     *
     * A Center can be deleted if it is in pending state and has no association - groups, loans or savings
     */
    @Test
    public void delete10Test() {
        Long centerId = null;
        // DeleteCentersCenterIdResponse response = api.delete10(centerId);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void getCentersTemplateTest() {
        Long officeId = null;
        Long staffId = null;
        String dateFormat = null;
        // Void response = api.getCentersTemplate(officeId, staffId, dateFormat);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void postCentersTemplateTest() {
        FormDataContentDisposition file = null;
        String locale = null;
        String dateFormat = null;
        // String response = api.postCentersTemplate(file, locale, dateFormat);

        // TODO: test validations
    }

    /**
     * List Centers
     *
     * The default implementation supports pagination and sorting with the default pagination size set to 200 records. The parameter limit with description -1 will return all entries.  Example Requests:    centers    centers?fields&#x3D;name,officeName,joinedDate    centers?offset&#x3D;10&amp;limit&#x3D;50    centers?orderBy&#x3D;name&amp;sortOrder&#x3D;DESC
     */
    @Test
    public void retrieveAll22Test() {
        Long officeId = null;
        Long staffId = null;
        String externalId = null;
        String name = null;
        String underHierarchy = null;
        Boolean paged = null;
        Integer offset = null;
        Integer limit = null;
        String orderBy = null;
        String sortOrder = null;
        DateParam meetingDate = null;
        String dateFormat = null;
        String locale = null;
        // GetCentersResponse response = api.retrieveAll22(officeId, staffId, externalId, name, underHierarchy, paged, offset, limit, orderBy, sortOrder, meetingDate, dateFormat, locale);

        // TODO: test validations
    }

    /**
     * Retrieve Center accounts overview
     *
     * An example of how a savings summary for a Center can be provided. This is requested in a specific use case of the reference application.  It is quite reasonable to add resources like this to simplify User Interface development.    Example Requests:    centers/9/accounts
     */
    @Test
    public void retrieveGroupAccountTest() {
        Long centerId = null;
        // GetCentersCenterIdAccountsResponse response = api.retrieveGroupAccount(centerId);

        // TODO: test validations
    }

    /**
     * Retrieve a Center
     *
     * Retrieves a Center  Example Requests:    centers/1    centers/1?associations&#x3D;groupMembers
     */
    @Test
    public void retrieveOne12Test() {
        Long centerId = null;
        Boolean staffInSelectedOfficeOnly = null;
        // GetCentersCenterIdResponse response = api.retrieveOne12(centerId, staffInSelectedOfficeOnly);

        // TODO: test validations
    }

    /**
     * Retrieve a Center Template
     *
     * Retrieves a Center Template  Example Requests:    centers/template    centers/template?officeId&#x3D;2
     */
    @Test
    public void retrieveTemplate6Test() {
        String command = null;
        Long officeId = null;
        Boolean staffInSelectedOfficeOnly = null;
        // GetCentersTemplateResponse response = api.retrieveTemplate6(command, officeId, staffInSelectedOfficeOnly);

        // TODO: test validations
    }

    /**
     * Update a Center
     *
     * Updates a Center
     */
    @Test
    public void update10Test() {
        PutCentersCenterIdRequest body = null;
        Long centerId = null;
        // PutCentersCenterIdResponse response = api.update10(body, centerId);

        // TODO: test validations
    }
}
