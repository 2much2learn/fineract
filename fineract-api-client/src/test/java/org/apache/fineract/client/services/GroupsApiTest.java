package org.apache.fineract.client.services;

import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.models.DeleteGroupsGroupIdResponse;
import org.apache.fineract.client.models.FormDataContentDisposition;
import org.apache.fineract.client.models.GetGroupsGroupIdAccountsResponse;
import org.apache.fineract.client.models.GetGroupsGroupIdResponse;
import org.apache.fineract.client.models.GetGroupsResponse;
import org.apache.fineract.client.models.GetGroupsTemplateResponse;
import org.apache.fineract.client.models.PostGroupsGroupIdCommandUnassignStaffRequest;
import org.apache.fineract.client.models.PostGroupsGroupIdCommandUnassignStaffResponse;
import org.apache.fineract.client.models.PostGroupsGroupIdRequest;
import org.apache.fineract.client.models.PostGroupsGroupIdResponse;
import org.apache.fineract.client.models.PostGroupsRequest;
import org.apache.fineract.client.models.PostGroupsResponse;
import org.apache.fineract.client.models.PutGroupsGroupIdRequest;
import org.apache.fineract.client.models.PutGroupsGroupIdResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GroupsApi
 */
public class GroupsApiTest {

    private GroupsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(GroupsApi.class);
    }


    /**
     * Activate a Group | Associate Clients | Disassociate Clients | Transfer Clients across groups | Generate Collection Sheet | Save Collection Sheet | Unassign a Staff | Assign a Staff | Close a Group | Unassign a Role | Update a Role
     *
     * Activate a Group:  Groups can be created in a Pending state. This API exists to enable group activation.    If the group happens to be already active this API will result in an error.  Mandatory Fields: activationDate  Associate Clients:  This API allows to associate existing clients to a group.    The clients are listed from the office to which the group is associated.    If client(s) is already associated with group then API will result in an error.  Mandatory Fields: clientMembers  Disassociate Clients:  This API allows to disassociate clients from a group.    Disassociating a client with active joint liability group loans results in an error.  Mandatory Fields: clientMembers  Transfer Clients across groups:  This API allows to transfer clients from one group to another  Mandatory Fields: destinationGroupId and clients  Optional Fields: inheritDestinationGroupLoanOfficer (defaults to true) and transferActiveLoans (defaults to true)  Generate Collection Sheet:  This API retrieves repayment details of all jlg loans of all members of a group on a specified meeting date.  Mandatory Fields: calendarId and transactionDate  Save Collection Sheet:  This api allows the loan officer to perform bulk repayments of JLG loans for a group on its meeting date.  Mandatory Fields: calendarId, transactionDate, actualDisbursementDate  Optional Fields: clientsAttendance, bulkRepaymentTransaction, bulkDisbursementTransactions  Unassign a Staff:  Allows you to unassign the Staff.  Mandatory Fields: staffId  Assign a Staff:  Allows you to assign Staff to an existing Group.    The selected Staff should be belong to the same office (or an office higher up in the hierarchy) as this groupMandatory Fields: staffId  Optional Fields: inheritStaffForClientAccounts (Optional: Boolean if true all members of the group (i.e all clients with active loans and savings ) will inherit the staffId)  Close a Group:  This API exists to close a group. Groups can be closed if they don&#x27;t have any non-closed clients/loans/savingsAccounts.    If the group has any active clients/loans/savingsAccount, this API will result in an error.Assign a Role:  Allows you to assign a Role to an existing member of a group.    We can define the different roles applicable to group members by adding code values to the pre-defined system code GROUPROLE. Example:Group leader etc.  Mandatory Fields: clientId, role  Unassign a Role:  Allows you to unassign Roles associated tp Group members.  Update a Role:  Allows you to update the member Role.  Mandatory Fields: role  Showing request/response for Transfer Clients across groups
     */
    @Test
    public void activateOrGenerateCollectionSheetTest() {
        PostGroupsGroupIdRequest body = null;
        Long groupId = null;
        String command = null;
        Long roleId = null;
        // PostGroupsGroupIdResponse response = api.activateOrGenerateCollectionSheet(body, groupId, command, roleId);

        // TODO: test validations
    }

    /**
     * Create a Group
     *
     * Creates a Group  Mandatory Fields: name, officeId, active, activationDate (if active&#x3D;true)  Optional Fields: externalId, staffId, clientMembers
     */
    @Test
    public void create7Test() {
        PostGroupsRequest body = null;
        // PostGroupsResponse response = api.create7(body);

        // TODO: test validations
    }

    /**
     * Delete a Group
     *
     * A group can be deleted if it is in pending state and has no associations - clients, loans or savings
     */
    @Test
    public void delete11Test() {
        Long groupId = null;
        // DeleteGroupsGroupIdResponse response = api.delete11(groupId);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void getGroupsTemplateTest() {
        Long officeId = null;
        Long staffId = null;
        String dateFormat = null;
        // Void response = api.getGroupsTemplate(officeId, staffId, dateFormat);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void postGroupTemplateTest() {
        FormDataContentDisposition file = null;
        String locale = null;
        String dateFormat = null;
        // String response = api.postGroupTemplate(file, locale, dateFormat);

        // TODO: test validations
    }

    /**
     * Retrieve Group accounts overview
     *
     * Retrieves details of all Loan and Savings accounts associated with this group.    Example Requests:    groups/1/accounts      groups/1/accounts?fields&#x3D;loanAccounts,savingsAccounts,memberLoanAccounts,  memberSavingsAccounts
     */
    @Test
    public void retrieveAccountsTest() {
        Long groupId = null;
        // GetGroupsGroupIdAccountsResponse response = api.retrieveAccounts(groupId);

        // TODO: test validations
    }

    /**
     * List Groups
     *
     * The default implementation of listing Groups returns 200 entries with support for pagination and sorting. Using the parameter limit with description -1 returns all entries.  Example Requests:    groups    groups?fields&#x3D;name,officeName,joinedDate    groups?offset&#x3D;10&amp;limit&#x3D;50    groups?orderBy&#x3D;name&amp;sortOrder&#x3D;DESC
     */
    @Test
    public void retrieveAll23Test() {
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
        Boolean orphansOnly = null;
        // GetGroupsResponse response = api.retrieveAll23(officeId, staffId, externalId, name, underHierarchy, paged, offset, limit, orderBy, sortOrder, orphansOnly);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void retrieveGsimAccountsTest() {
        Long groupId = null;
        String parentGSIMAccountNo = null;
        Long parentGSIMId = null;
        // String response = api.retrieveGsimAccounts(groupId, parentGSIMAccountNo, parentGSIMId);

        // TODO: test validations
    }

    /**
     * Retrieve a Group
     *
     * Retrieve group information.  Example Requests:    groups/1    groups/1?associations&#x3D;clientMembers
     */
    @Test
    public void retrieveOne13Test() {
        Long groupId = null;
        Boolean staffInSelectedOfficeOnly = null;
        Long roleId = null;
        // GetGroupsGroupIdResponse response = api.retrieveOne13(groupId, staffInSelectedOfficeOnly, roleId);

        // TODO: test validations
    }

    /**
     * Retrieve Group Template
     *
     * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:    Field Defaults  Allowed Value Lists  Example Requests:    groups/template    groups/template?officeId&#x3D;2    groups/template?centerId&#x3D;1    groups/template?centerId&#x3D;1&amp;staffInSelectedOfficeOnly&#x3D;true
     */
    @Test
    public void retrieveTemplate7Test() {
        Long officeId = null;
        Boolean center = null;
        Long centerId = null;
        String command = null;
        Boolean staffInSelectedOfficeOnly = null;
        // GetGroupsTemplateResponse response = api.retrieveTemplate7(officeId, center, centerId, command, staffInSelectedOfficeOnly);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void retrieveglimAccountsTest() {
        Long groupId = null;
        String parentLoanAccountNo = null;
        // String response = api.retrieveglimAccounts(groupId, parentLoanAccountNo);

        // TODO: test validations
    }

    /**
     * Unassign a Staff
     *
     * Allows you to unassign the Staff.  Mandatory Fields: staffId
     */
    @Test
    public void unassignLoanOfficerTest() {
        PostGroupsGroupIdCommandUnassignStaffRequest body = null;
        Long groupId = null;
        // PostGroupsGroupIdCommandUnassignStaffResponse response = api.unassignLoanOfficer(body, groupId);

        // TODO: test validations
    }

    /**
     * Update a Group
     *
     * Updates a Group
     */
    @Test
    public void update11Test() {
        PutGroupsGroupIdRequest body = null;
        Long groupId = null;
        // PutGroupsGroupIdResponse response = api.update11(body, groupId);

        // TODO: test validations
    }
}
