package org.apache.fineract.client.services;

import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.models.DeleteRolesRoleIdResponse;
import org.apache.fineract.client.models.GetRolesResponse;
import org.apache.fineract.client.models.GetRolesRoleIdPermissionsResponse;
import org.apache.fineract.client.models.GetRolesRoleIdResponse;
import org.apache.fineract.client.models.PostRolesRequest;
import org.apache.fineract.client.models.PostRolesResponse;
import org.apache.fineract.client.models.PostRolesRoleIdResponse;
import org.apache.fineract.client.models.PutRolesRoleIdPermissionsRequest;
import org.apache.fineract.client.models.PutRolesRoleIdPermissionsResponse;
import org.apache.fineract.client.models.PutRolesRoleIdRequest;
import org.apache.fineract.client.models.PutRolesRoleIdResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RolesApi
 */
public class RolesApiTest {

    private RolesApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(RolesApi.class);
    }


    /**
     * Enable Role | Disable Role
     *
     * Description : Enable role in case role is disabled. | Disable the role in case role is not associated with any users.      Example Request:   https://DomainName/api/v1/roles/{roleId}?command&#x3D;enable      https://DomainName/api/v1/roles/{roleId}?command&#x3D;disable
     */
    @Test
    public void actionsOnRolesTest() {
        Long roleId = null;
        String command = null;
        // PostRolesRoleIdResponse response = api.actionsOnRoles(roleId, command);

        // TODO: test validations
    }

    /**
     * Create a New Role
     *
     * Mandatory Fields name, description
     */
    @Test
    public void createRoleTest() {
        PostRolesRequest body = null;
        // PostRolesResponse response = api.createRole(body);

        // TODO: test validations
    }

    /**
     * Delete a Role
     *
     * Description : Delete the role in case role is not associated with any users.
     */
    @Test
    public void deleteRoleTest() {
        Long roleId = null;
        // DeleteRolesRoleIdResponse response = api.deleteRole(roleId);

        // TODO: test validations
    }

    /**
     * List Roles
     *
     * Example Requests:  roles   roles?fields&#x3D;name
     */
    @Test
    public void retrieveAllRolesTest() {
        // List<GetRolesResponse> response = api.retrieveAllRoles();

        // TODO: test validations
    }

    /**
     * Retrieve a Role
     *
     * Example Requests:  roles/1   roles/1?fields&#x3D;name
     */
    @Test
    public void retrieveRoleTest() {
        Long roleId = null;
        // GetRolesRoleIdResponse response = api.retrieveRole(roleId);

        // TODO: test validations
    }

    /**
     * Retrieve a Role&#x27;s Permissions
     *
     * Example Requests:  roles/1/permissions
     */
    @Test
    public void retrieveRolePermissionsTest() {
        Long roleId = null;
        // GetRolesRoleIdPermissionsResponse response = api.retrieveRolePermissions(roleId);

        // TODO: test validations
    }

    /**
     * Update a Role
     *
     * 
     */
    @Test
    public void updateRoleTest() {
        PutRolesRoleIdRequest body = null;
        Long roleId = null;
        // PutRolesRoleIdResponse response = api.updateRole(body, roleId);

        // TODO: test validations
    }

    /**
     * Update a Role&#x27;s Permissions
     *
     * 
     */
    @Test
    public void updateRolePermissionsTest() {
        PutRolesRoleIdPermissionsRequest body = null;
        Long roleId = null;
        // PutRolesRoleIdPermissionsResponse response = api.updateRolePermissions(body, roleId);

        // TODO: test validations
    }
}
