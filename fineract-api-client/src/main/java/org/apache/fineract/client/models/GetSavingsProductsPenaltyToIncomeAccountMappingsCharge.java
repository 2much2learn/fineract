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
 * GetSavingsProductsPenaltyToIncomeAccountMappingsCharge
 */


public class GetSavingsProductsPenaltyToIncomeAccountMappingsCharge {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("active")
  private Boolean active = null;

  @SerializedName("penalty")
  private Boolean penalty = null;

  public GetSavingsProductsPenaltyToIncomeAccountMappingsCharge id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(example = "12", description = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public GetSavingsProductsPenaltyToIncomeAccountMappingsCharge name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(example = "sav 2", description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GetSavingsProductsPenaltyToIncomeAccountMappingsCharge active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @Schema(example = "false", description = "")
  public Boolean isActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public GetSavingsProductsPenaltyToIncomeAccountMappingsCharge penalty(Boolean penalty) {
    this.penalty = penalty;
    return this;
  }

   /**
   * Get penalty
   * @return penalty
  **/
  @Schema(example = "true", description = "")
  public Boolean isPenalty() {
    return penalty;
  }

  public void setPenalty(Boolean penalty) {
    this.penalty = penalty;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetSavingsProductsPenaltyToIncomeAccountMappingsCharge getSavingsProductsPenaltyToIncomeAccountMappingsCharge = (GetSavingsProductsPenaltyToIncomeAccountMappingsCharge) o;
    return Objects.equals(this.id, getSavingsProductsPenaltyToIncomeAccountMappingsCharge.id) &&
        Objects.equals(this.name, getSavingsProductsPenaltyToIncomeAccountMappingsCharge.name) &&
        Objects.equals(this.active, getSavingsProductsPenaltyToIncomeAccountMappingsCharge.active) &&
        Objects.equals(this.penalty, getSavingsProductsPenaltyToIncomeAccountMappingsCharge.penalty);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, active, penalty);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetSavingsProductsPenaltyToIncomeAccountMappingsCharge {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    penalty: ").append(toIndentedString(penalty)).append("\n");
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
