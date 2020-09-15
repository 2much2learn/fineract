package org.apache.fineract.client.services;

import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.models.DeleteClientsClientIdRequest;
import org.apache.fineract.client.models.DeleteClientsClientIdResponse;
import org.apache.fineract.client.models.FormDataContentDisposition;
import org.apache.fineract.client.models.GetClientsClientIdAccountsResponse;
import org.apache.fineract.client.models.GetClientsClientIdResponse;
import org.apache.fineract.client.models.GetClientsResponse;
import org.apache.fineract.client.models.GetClientsTemplateResponse;
import org.apache.fineract.client.models.PostClientsClientIdRequest;
import org.apache.fineract.client.models.PostClientsClientIdResponse;
import org.apache.fineract.client.models.PostClientsRequest;
import org.apache.fineract.client.models.PostClientsResponse;
import org.apache.fineract.client.models.PutClientsClientIdRequest;
import org.apache.fineract.client.models.PutClientsClientIdResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ClientApi
 */
public class ClientApiTest {

    private ClientApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(ClientApi.class);
    }


    /**
     * Activate a Client | Close a Client | Reject a Client | Withdraw a Client | Reactivate a Client | UndoReject a Client | UndoWithdraw a Client | Assign a Staff | Unassign a Staff | Update Default Savings Account | Propose a Client Transfer | Withdraw a Client Transfer | Reject a Client Transfer | Accept a Client Transfer | Propose and Accept a Client Transfer
     *
     * Activate a Client:  Clients can be created in a Pending state. This API exists to enable client activation (for when a client becomes an approved member of the financial Institution).  If the client happens to be already active this API will result in an error.  Close a Client:  Clients can be closed if they do not have any non-closed loans/savingsAccount. This API exists to close a client .  If the client have any active loans/savingsAccount this API will result in an error.  Reject a Client:  Clients can be rejected when client is in pending for activation status.  If the client is any other status, this API throws an error.  Mandatory Fields: rejectionDate, rejectionReasonId  Withdraw a Client:  Client applications can be withdrawn when client is in a pending for activation status.  If the client is any other status, this API throws an error.  Mandatory Fields: withdrawalDate, withdrawalReasonId  Reactivate a Client: Clients can be reactivated after they have been closed.  Trying to reactivate a client in any other state throws an error.  Mandatory Fields: reactivationDate  UndoReject a Client:  Clients can be reactivated after they have been rejected.  Trying to reactivate a client in any other state throws an error.  Mandatory Fields: reopenedDateUndoWithdraw a Client:  Clients can be reactivated after they have been withdrawn.  Trying to reactivate a client in any other state throws an error.  Mandatory Fields: reopenedDate  Assign a Staff:  Allows you to assign a Staff for existed Client.  The selected Staff should belong to the same office (or an officer higher up in the hierarchy) as the Client he manages.  Unassign a Staff:  Allows you to unassign the Staff assigned to a Client.  Update Default Savings Account:  Allows you to modify or assign a default savings account for an existing Client.  The selected savings account should be one among the existing savings account for a particular customer.  Propose a Client Transfer:  Allows you to propose the transfer of a Client to a different Office.  Withdraw a Client Transfer:  Allows you to withdraw the proposed transfer of a Client to a different Office.  Withdrawal can happen only if the destination Branch (to which the transfer was proposed) has not already accepted the transfer proposal  Reject a Client Transfer:  Allows the Destination Branch to reject the proposed Client Transfer.  Accept a Client Transfer:  Allows the Destination Branch to accept the proposed Client Transfer.  The destination branch may also choose to link this client to a group (in which case, any existing active JLG loan of the client is rescheduled to match the meeting frequency of the group) and loan Officer at the time of accepting the transfer  Propose and Accept a Client Transfer:  Abstraction over the Propose and Accept Client Transfer API&#x27;s which enable a user with Data Scope over both the Target and Destination Branches to directly transfer a Client to the destination Office.  Showing request/response for &#x27;Reject a Client Transfer&#x27;
     */
    @Test
    public void activate1Test() {
        PostClientsClientIdRequest body = null;
        Long clientId = null;
        String command = null;
        // PostClientsClientIdResponse response = api.activate1(body, clientId, command);

        // TODO: test validations
    }

    /**
     * Create a Client
     *
     * Note:  1. You can enter either:firstname/middlename/lastname - for a person (middlename is optional) OR fullname - for a business or organisation (or person known by one name).  2.If address is enable(enable-address&#x3D;true), then additional field called address has to be passed.  Mandatory Fields: firstname and lastname OR fullname, officeId, active&#x3D;true and activationDate OR active&#x3D;false, if(address enabled) address  Optional Fields: groupId, externalId, accountNo, staffId, mobileNo, savingsProductId, genderId, clientTypeId, clientClassificationId
     */
    @Test
    public void create5Test() {
        PostClientsRequest body = null;
        // PostClientsResponse response = api.create5(body);

        // TODO: test validations
    }

    /**
     * Delete a Client
     *
     * If a client is in Pending state, you are allowed to Delete it. The delete is a &#x27;hard delete&#x27; and cannot be recovered from. Once clients become active or have loans or savings associated with them, you cannot delete the client but you may Close the client if they have left the program.
     */
    @Test
    public void delete9Test() {
        DeleteClientsClientIdRequest body = null;
        Long clientId = null;
        // DeleteClientsClientIdResponse response = api.delete9(body, clientId);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void getClientTemplateTest() {
        String legalFormType = null;
        Long officeId = null;
        Long staffId = null;
        String dateFormat = null;
        // Void response = api.getClientTemplate(legalFormType, officeId, staffId, dateFormat);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void postClientTemplateTest() {
        FormDataContentDisposition file = null;
        String locale = null;
        String dateFormat = null;
        String legalFormType = null;
        // String response = api.postClientTemplate(file, locale, dateFormat, legalFormType);

        // TODO: test validations
    }

    /**
     * List Clients
     *
     * The list capability of clients can support pagination and sorting.  Example Requests:  clients  clients?fields&#x3D;displayName,officeName,timeline  clients?offset&#x3D;10&amp;limit&#x3D;50  clients?orderBy&#x3D;displayName&amp;sortOrder&#x3D;DESC
     */
    @Test
    public void retrieveAll20Test() {
        String sqlSearch = null;
        Long officeId = null;
        String externalId = null;
        String displayName = null;
        String firstName = null;
        String lastName = null;
        String status = null;
        String underHierarchy = null;
        Integer offset = null;
        Integer limit = null;
        String orderBy = null;
        String sortOrder = null;
        Boolean orphansOnly = null;
        // GetClientsResponse response = api.retrieveAll20(sqlSearch, officeId, externalId, displayName, firstName, lastName, status, underHierarchy, offset, limit, orderBy, sortOrder, orphansOnly);

        // TODO: test validations
    }

    /**
     * Retrieve client accounts overview
     *
     * An example of how a loan portfolio summary can be provided. This is requested in a specific use case of the community application. It is quite reasonable to add resources like this to simplify User Interface development.  Example Requests:   clients/1/accounts  clients/1/accounts?fields&#x3D;loanAccounts,savingsAccounts
     */
    @Test
    public void retrieveAssociatedAccountsTest() {
        Long clientId = null;
        // GetClientsClientIdAccountsResponse response = api.retrieveAssociatedAccounts(clientId);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void retrieveObligeeDetailsTest() {
        Long clientId = null;
        // String response = api.retrieveObligeeDetails(clientId);

        // TODO: test validations
    }

    /**
     * Retrieve a Client
     *
     * Example Requests:  clients/1   clients/1?template&#x3D;true   clients/1?fields&#x3D;id,displayName,officeName
     */
    @Test
    public void retrieveOne10Test() {
        Long clientId = null;
        Boolean staffInSelectedOfficeOnly = null;
        // GetClientsClientIdResponse response = api.retrieveOne10(clientId, staffInSelectedOfficeOnly);

        // TODO: test validations
    }

    /**
     * Retrieve Client Details Template
     *
     * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists  Example Request:  clients/template
     */
    @Test
    public void retrieveTemplate5Test() {
        Long officeId = null;
        String commandParam = null;
        Boolean staffInSelectedOfficeOnly = null;
        // GetClientsTemplateResponse response = api.retrieveTemplate5(officeId, commandParam, staffInSelectedOfficeOnly);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void retrieveTransferTemplateTest() {
        Long clientId = null;
        // String response = api.retrieveTransferTemplate(clientId);

        // TODO: test validations
    }

    /**
     * Update a Client
     *
     * Note: You can update any of the basic attributes of a client (but not its associations) using this API.  Changing the relationship between a client and its office is not supported through this API. An API specific to handling transfers of clients between offices is available for the same.  The relationship between a client and a group must be removed through the Groups API.
     */
    @Test
    public void update9Test() {
        PutClientsClientIdRequest body = null;
        Long clientId = null;
        // PutClientsClientIdResponse response = api.update9(body, clientId);

        // TODO: test validations
    }
}
