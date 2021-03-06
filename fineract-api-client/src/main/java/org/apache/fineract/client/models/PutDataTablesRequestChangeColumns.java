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
/**
 * PutDataTablesRequestChangeColumns
 */


public class PutDataTablesRequestChangeColumns {
  @SerializedName("name")
  private String name = null;

  @SerializedName("newName")
  private String newName = null;

  @SerializedName("code")
  private String code = null;

  @SerializedName("newCode")
  private String newCode = null;

  @SerializedName("mandatory")
  private Boolean mandatory = null;

  public PutDataTablesRequestChangeColumns name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(example = "Question", description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PutDataTablesRequestChangeColumns newName(String newName) {
    this.newName = newName;
    return this;
  }

   /**
   * Get newName
   * @return newName
  **/
  @Schema(example = "Question 2", description = "")
  public String getNewName() {
    return newName;
  }

  public void setNewName(String newName) {
    this.newName = newName;
  }

  public PutDataTablesRequestChangeColumns code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @Schema(example = "Gender", description = "")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public PutDataTablesRequestChangeColumns newCode(String newCode) {
    this.newCode = newCode;
    return this;
  }

   /**
   * Get newCode
   * @return newCode
  **/
  @Schema(example = "Gender2", description = "")
  public String getNewCode() {
    return newCode;
  }

  public void setNewCode(String newCode) {
    this.newCode = newCode;
  }

  public PutDataTablesRequestChangeColumns mandatory(Boolean mandatory) {
    this.mandatory = mandatory;
    return this;
  }

   /**
   * Get mandatory
   * @return mandatory
  **/
  @Schema(example = "true", description = "")
  public Boolean isMandatory() {
    return mandatory;
  }

  public void setMandatory(Boolean mandatory) {
    this.mandatory = mandatory;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PutDataTablesRequestChangeColumns putDataTablesRequestChangeColumns = (PutDataTablesRequestChangeColumns) o;
    return Objects.equals(this.name, putDataTablesRequestChangeColumns.name) &&
        Objects.equals(this.newName, putDataTablesRequestChangeColumns.newName) &&
        Objects.equals(this.code, putDataTablesRequestChangeColumns.code) &&
        Objects.equals(this.newCode, putDataTablesRequestChangeColumns.newCode) &&
        Objects.equals(this.mandatory, putDataTablesRequestChangeColumns.mandatory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, newName, code, newCode, mandatory);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PutDataTablesRequestChangeColumns {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    newName: ").append(toIndentedString(newName)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    newCode: ").append(toIndentedString(newCode)).append("\n");
    sb.append("    mandatory: ").append(toIndentedString(mandatory)).append("\n");
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
