/*
 * Apache Fineract
 * Apache Fineract is a secure, multi-tenanted microfinance platform  The goal of the Apache Fineract API is to empower developers to build apps on top of the Apache Fineract Platform<br>The [reference app](https://cui.fineract.dev) (username: mifos, password: password) works on the same demo tenant as the interactive links in this documentation  - The API is organized around [REST](https://en.wikipedia.org/wiki/Representational_state_transfer) - Find out more about Apache Fineract [here](/fineract-provider/api-docs/apiLive.htm#top) - You can [Try The API From Your Browser](/fineract-provider/api-docs/apiLive.htm#interact) - The Generic Options are available [here](/fineract-provider/api-docs/apiLive.htm#genopts) - Find out more about [Updating Dates and Numbers](/fineract-provider/api-docs/apiLive.htm#dates_and_numbers) - For the Authentication and the Basic of HTTP and HTTPS refer [here](/fineract-provider/api-docs/apiLive.htm#authentication_overview) - Check about ERROR codes [here](/fineract-provider/api-docs/apiLive.htm#errors)  Please refer to the [old documentation](/fineract-provider/api-docs/apiLive.htm) for any documentation queries
 *
 * OpenAPI spec version: 1.3.0-806-gcdf3c76-dirty
 * Contact: dev@fineract.apache.org
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package org.apache.fineract.client.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.fineract.client.models.GetRolesRoleIdPermissionsResponsePermissionData;
/**
 * GetRolesRoleIdPermissionsResponse
 */
@Schema(description = "GetRolesRoleIdPermissionsResponse")

public class GetRolesRoleIdPermissionsResponse {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("permissionUsageData")
  private List<GetRolesRoleIdPermissionsResponsePermissionData> permissionUsageData = null;

  public GetRolesRoleIdPermissionsResponse id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(example = "1", description = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public GetRolesRoleIdPermissionsResponse name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(example = "Super Users", description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GetRolesRoleIdPermissionsResponse description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(example = "This role provides all application permissions.", description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public GetRolesRoleIdPermissionsResponse permissionUsageData(List<GetRolesRoleIdPermissionsResponsePermissionData> permissionUsageData) {
    this.permissionUsageData = permissionUsageData;
    return this;
  }

  public GetRolesRoleIdPermissionsResponse addPermissionUsageDataItem(GetRolesRoleIdPermissionsResponsePermissionData permissionUsageDataItem) {
    if (this.permissionUsageData == null) {
      this.permissionUsageData = new ArrayList<>();
    }
    this.permissionUsageData.add(permissionUsageDataItem);
    return this;
  }

   /**
   * Get permissionUsageData
   * @return permissionUsageData
  **/
  @Schema(description = "")
  public List<GetRolesRoleIdPermissionsResponsePermissionData> getPermissionUsageData() {
    return permissionUsageData;
  }

  public void setPermissionUsageData(List<GetRolesRoleIdPermissionsResponsePermissionData> permissionUsageData) {
    this.permissionUsageData = permissionUsageData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetRolesRoleIdPermissionsResponse getRolesRoleIdPermissionsResponse = (GetRolesRoleIdPermissionsResponse) o;
    return Objects.equals(this.id, getRolesRoleIdPermissionsResponse.id) &&
        Objects.equals(this.name, getRolesRoleIdPermissionsResponse.name) &&
        Objects.equals(this.description, getRolesRoleIdPermissionsResponse.description) &&
        Objects.equals(this.permissionUsageData, getRolesRoleIdPermissionsResponse.permissionUsageData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, permissionUsageData);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetRolesRoleIdPermissionsResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    permissionUsageData: ").append(toIndentedString(permissionUsageData)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
