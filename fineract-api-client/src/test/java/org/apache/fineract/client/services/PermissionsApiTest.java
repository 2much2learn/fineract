package org.apache.fineract.client.services;

import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.models.CommandProcessingResult;
import org.apache.fineract.client.models.GetPermissionsResponse;
import org.apache.fineract.client.models.PutPermissionsRequest;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PermissionsApi
 */
public class PermissionsApiTest {

    private PermissionsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(PermissionsApi.class);
    }


    /**
     * List Application Permissions
     *
     * ARGUMENTS makerCheckerableoptional, Values are true, false. Default is false. If makerCheckerable&#x3D;false or not supplied then a list of application permissions is returned. The \&quot;selected\&quot; attribute is always true in this case.  If makerCheckerable&#x3D;true then the \&quot;selected\&quot; attribute shows whether the permission is enabled for Maker Check functionality.  Note: Each Apache Fineract transaction is associated with a permission.  Example Requests:  permissions   permissions?makerCheckerable&#x3D;true   permissions?fields&#x3D;grouping,code
     */
    @Test
    public void retrieveAllPermissionsTest() {
        // List<GetPermissionsResponse> response = api.retrieveAllPermissions();

        // TODO: test validations
    }

    /**
     * Enable/Disable Permissions for Maker Checker
     *
     * 
     */
    @Test
    public void updatePermissionsDetailsTest() {
        PutPermissionsRequest body = null;
        // CommandProcessingResult response = api.updatePermissionsDetails(body);

        // TODO: test validations
    }
}
