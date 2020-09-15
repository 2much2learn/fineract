package org.apache.fineract.client.services;

import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.models.FormDataContentDisposition;
import org.apache.fineract.client.models.GetStaffResponse;
import org.apache.fineract.client.models.PostStaffRequest;
import org.apache.fineract.client.models.PostStaffResponse;
import org.apache.fineract.client.models.PutStaffRequest;
import org.apache.fineract.client.models.PutStaffResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for StaffApi
 */
public class StaffApiTest {

    private StaffApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(StaffApi.class);
    }


    /**
     * Create a staff member
     *
     * Creates a staff member.  Mandatory Fields:  officeId, firstname, lastname  Optional Fields:  isLoanOfficer, isActive
     */
    @Test
    public void createStaffTest() {
        PostStaffRequest body = null;
        // PostStaffResponse response = api.createStaff(body);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void getStaffTemplateTest() {
        Long officeId = null;
        String dateFormat = null;
        // Void response = api.getStaffTemplate(officeId, dateFormat);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void postStaffTemplateTest() {
        FormDataContentDisposition file = null;
        String locale = null;
        String dateFormat = null;
        // String response = api.postStaffTemplate(file, locale, dateFormat);

        // TODO: test validations
    }

    /**
     * Retrieve a Staff Member
     *
     * Returns the details of a Staff Member.  Example Requests:  staff/1
     */
    @Test
    public void retreiveStaffTest() {
        Long staffId = null;
        // GetStaffResponse response = api.retreiveStaff(staffId);

        // TODO: test validations
    }

    /**
     * Retrieve Staff
     *
     * Returns the list of staff members.  Example Requests:  staff     Retrieve a Staff by status  Returns the details of a Staff based on status.  By default it Returns all the ACTIVE Staff.  If status&#x3D;INACTIVE, then it returns all INACTIVE Staff.  and for status&#x3D;ALL, it Returns both ACTIVE and INACTIVE Staff.  Example Requests:  staff?status&#x3D;active
     */
    @Test
    public void retrieveStaffTest() {
        Long officeId = null;
        Boolean staffInOfficeHierarchy = null;
        Boolean loanOfficersOnly = null;
        String status = null;
        // GetStaffResponse response = api.retrieveStaff(officeId, staffInOfficeHierarchy, loanOfficersOnly, status);

        // TODO: test validations
    }

    /**
     * Update a Staff Member
     *
     * Updates the details of a staff member.
     */
    @Test
    public void updateStaffTest() {
        PutStaffRequest body = null;
        Long staffId = null;
        // PutStaffResponse response = api.updateStaff(body, staffId);

        // TODO: test validations
    }
}
