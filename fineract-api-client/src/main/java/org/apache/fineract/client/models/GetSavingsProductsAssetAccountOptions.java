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
import org.apache.fineract.client.models.GetSavingsAssetLiabilityType;
import org.apache.fineract.client.models.GetSavingsAssetTagId;
import org.apache.fineract.client.models.GetSavingsProductsLiabilityUsage;
/**
 * GetSavingsProductsAssetAccountOptions
 */


public class GetSavingsProductsAssetAccountOptions {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("glCode")
  private Integer glCode = null;

  @SerializedName("disabled")
  private Boolean disabled = null;

  @SerializedName("manualEntriesAllowed")
  private Boolean manualEntriesAllowed = null;

  @SerializedName("type")
  private GetSavingsAssetLiabilityType type = null;

  @SerializedName("usage")
  private GetSavingsProductsLiabilityUsage usage = null;

  @SerializedName("tagId")
  private GetSavingsAssetTagId tagId = null;

  public GetSavingsProductsAssetAccountOptions id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(example = "2", description = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public GetSavingsProductsAssetAccountOptions name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(example = "Cash", description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GetSavingsProductsAssetAccountOptions glCode(Integer glCode) {
    this.glCode = glCode;
    return this;
  }

   /**
   * Get glCode
   * @return glCode
  **/
  @Schema(example = "100001", description = "")
  public Integer getGlCode() {
    return glCode;
  }

  public void setGlCode(Integer glCode) {
    this.glCode = glCode;
  }

  public GetSavingsProductsAssetAccountOptions disabled(Boolean disabled) {
    this.disabled = disabled;
    return this;
  }

   /**
   * Get disabled
   * @return disabled
  **/
  @Schema(example = "false", description = "")
  public Boolean isDisabled() {
    return disabled;
  }

  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }

  public GetSavingsProductsAssetAccountOptions manualEntriesAllowed(Boolean manualEntriesAllowed) {
    this.manualEntriesAllowed = manualEntriesAllowed;
    return this;
  }

   /**
   * Get manualEntriesAllowed
   * @return manualEntriesAllowed
  **/
  @Schema(example = "true", description = "")
  public Boolean isManualEntriesAllowed() {
    return manualEntriesAllowed;
  }

  public void setManualEntriesAllowed(Boolean manualEntriesAllowed) {
    this.manualEntriesAllowed = manualEntriesAllowed;
  }

  public GetSavingsProductsAssetAccountOptions type(GetSavingsAssetLiabilityType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public GetSavingsAssetLiabilityType getType() {
    return type;
  }

  public void setType(GetSavingsAssetLiabilityType type) {
    this.type = type;
  }

  public GetSavingsProductsAssetAccountOptions usage(GetSavingsProductsLiabilityUsage usage) {
    this.usage = usage;
    return this;
  }

   /**
   * Get usage
   * @return usage
  **/
  @Schema(description = "")
  public GetSavingsProductsLiabilityUsage getUsage() {
    return usage;
  }

  public void setUsage(GetSavingsProductsLiabilityUsage usage) {
    this.usage = usage;
  }

  public GetSavingsProductsAssetAccountOptions tagId(GetSavingsAssetTagId tagId) {
    this.tagId = tagId;
    return this;
  }

   /**
   * Get tagId
   * @return tagId
  **/
  @Schema(description = "")
  public GetSavingsAssetTagId getTagId() {
    return tagId;
  }

  public void setTagId(GetSavingsAssetTagId tagId) {
    this.tagId = tagId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetSavingsProductsAssetAccountOptions getSavingsProductsAssetAccountOptions = (GetSavingsProductsAssetAccountOptions) o;
    return Objects.equals(this.id, getSavingsProductsAssetAccountOptions.id) &&
        Objects.equals(this.name, getSavingsProductsAssetAccountOptions.name) &&
        Objects.equals(this.glCode, getSavingsProductsAssetAccountOptions.glCode) &&
        Objects.equals(this.disabled, getSavingsProductsAssetAccountOptions.disabled) &&
        Objects.equals(this.manualEntriesAllowed, getSavingsProductsAssetAccountOptions.manualEntriesAllowed) &&
        Objects.equals(this.type, getSavingsProductsAssetAccountOptions.type) &&
        Objects.equals(this.usage, getSavingsProductsAssetAccountOptions.usage) &&
        Objects.equals(this.tagId, getSavingsProductsAssetAccountOptions.tagId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, glCode, disabled, manualEntriesAllowed, type, usage, tagId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetSavingsProductsAssetAccountOptions {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    glCode: ").append(toIndentedString(glCode)).append("\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    manualEntriesAllowed: ").append(toIndentedString(manualEntriesAllowed)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
    sb.append("    tagId: ").append(toIndentedString(tagId)).append("\n");
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
