package org.apache.fineract.client.services;

import org.apache.fineract.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface RolesApi {
  /**
   * Enable Role | Disable Role
   * Description : Enable role in case role is disabled. | Disable the role in case role is not associated with any users.      Example Request:   https://DomainName/api/v1/roles/{roleId}?command&#x3D;enable      https://DomainName/api/v1/roles/{roleId}?command&#x3D;disable
   * @param roleId roleId (required)
   * @param command command (optional)
   * @return Call&lt;PostRolesRoleIdResponse&gt;
   */
  @POST("roles/{roleId}")
  Call<PostRolesRoleIdResponse> actionsOnRoles(
            @retrofit2.http.Path("roleId") Long roleId            ,     @retrofit2.http.Query("command") String command                
  );

  /**
   * Create a New Role
   * Mandatory Fields name, description
   * @param body  (required)
   * @return Call&lt;PostRolesResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("roles")
  Call<PostRolesResponse> createRole(
                    @retrofit2.http.Body PostRolesRequest body    
  );

  /**
   * Delete a Role
   * Description : Delete the role in case role is not associated with any users.
   * @param roleId roleId (required)
   * @return Call&lt;DeleteRolesRoleIdResponse&gt;
   */
  @DELETE("roles/{roleId}")
  Call<DeleteRolesRoleIdResponse> deleteRole(
            @retrofit2.http.Path("roleId") Long roleId            
  );

  /**
   * List Roles
   * Example Requests:  roles   roles?fields&#x3D;name
   * @return Call&lt;List&lt;GetRolesResponse&gt;&gt;
   */
  @GET("roles")
  Call<List<GetRolesResponse>> retrieveAllRoles();
    

  /**
   * Retrieve a Role
   * Example Requests:  roles/1   roles/1?fields&#x3D;name
   * @param roleId roleId (required)
   * @return Call&lt;GetRolesRoleIdResponse&gt;
   */
  @GET("roles/{roleId}")
  Call<GetRolesRoleIdResponse> retrieveRole(
            @retrofit2.http.Path("roleId") Long roleId            
  );

  /**
   * Retrieve a Role&#x27;s Permissions
   * Example Requests:  roles/1/permissions
   * @param roleId roleId (required)
   * @return Call&lt;GetRolesRoleIdPermissionsResponse&gt;
   */
  @GET("roles/{roleId}/permissions")
  Call<GetRolesRoleIdPermissionsResponse> retrieveRolePermissions(
            @retrofit2.http.Path("roleId") Long roleId            
  );

  /**
   * Update a Role
   * 
   * @param body  (required)
   * @param roleId roleId (required)
   * @return Call&lt;PutRolesRoleIdResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("roles/{roleId}")
  Call<PutRolesRoleIdResponse> updateRole(
                    @retrofit2.http.Body PutRolesRoleIdRequest body    ,         @retrofit2.http.Path("roleId") Long roleId            
  );

  /**
   * Update a Role&#x27;s Permissions
   * 
   * @param body  (required)
   * @param roleId roleId (required)
   * @return Call&lt;PutRolesRoleIdPermissionsResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("roles/{roleId}/permissions")
  Call<PutRolesRoleIdPermissionsResponse> updateRolePermissions(
                    @retrofit2.http.Body PutRolesRoleIdPermissionsRequest body    ,         @retrofit2.http.Path("roleId") Long roleId            
  );

}
