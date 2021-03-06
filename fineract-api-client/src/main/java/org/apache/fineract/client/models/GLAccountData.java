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
import org.apache.fineract.client.models.CodeValueData;
import org.apache.fineract.client.models.EnumOptionData;
/**
 * GLAccountData
 */


public class GLAccountData {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("glCode")
  private String glCode = null;

  @SerializedName("type")
  private EnumOptionData type = null;

  @SerializedName("tagId")
  private CodeValueData tagId = null;

  @SerializedName("rowIndex")
  private Integer rowIndex = null;

  @SerializedName("typeId")
  private Integer typeId = null;

  public GLAccountData id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public GLAccountData name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GLAccountData glCode(String glCode) {
    this.glCode = glCode;
    return this;
  }

   /**
   * Get glCode
   * @return glCode
  **/
  @Schema(description = "")
  public String getGlCode() {
    return glCode;
  }

  public void setGlCode(String glCode) {
    this.glCode = glCode;
  }

  public GLAccountData type(EnumOptionData type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public EnumOptionData getType() {
    return type;
  }

  public void setType(EnumOptionData type) {
    this.type = type;
  }

  public GLAccountData tagId(CodeValueData tagId) {
    this.tagId = tagId;
    return this;
  }

   /**
   * Get tagId
   * @return tagId
  **/
  @Schema(description = "")
  public CodeValueData getTagId() {
    return tagId;
  }

  public void setTagId(CodeValueData tagId) {
    this.tagId = tagId;
  }

  public GLAccountData rowIndex(Integer rowIndex) {
    this.rowIndex = rowIndex;
    return this;
  }

   /**
   * Get rowIndex
   * @return rowIndex
  **/
  @Schema(description = "")
  public Integer getRowIndex() {
    return rowIndex;
  }

  public void setRowIndex(Integer rowIndex) {
    this.rowIndex = rowIndex;
  }

  public GLAccountData typeId(Integer typeId) {
    this.typeId = typeId;
    return this;
  }

   /**
   * Get typeId
   * @return typeId
  **/
  @Schema(description = "")
  public Integer getTypeId() {
    return typeId;
  }

  public void setTypeId(Integer typeId) {
    this.typeId = typeId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GLAccountData glAccountData = (GLAccountData) o;
    return Objects.equals(this.id, glAccountData.id) &&
        Objects.equals(this.name, glAccountData.name) &&
        Objects.equals(this.glCode, glAccountData.glCode) &&
        Objects.equals(this.type, glAccountData.type) &&
        Objects.equals(this.tagId, glAccountData.tagId) &&
        Objects.equals(this.rowIndex, glAccountData.rowIndex) &&
        Objects.equals(this.typeId, glAccountData.typeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, glCode, type, tagId, rowIndex, typeId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GLAccountData {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    glCode: ").append(toIndentedString(glCode)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    tagId: ").append(toIndentedString(tagId)).append("\n");
    sb.append("    rowIndex: ").append(toIndentedString(rowIndex)).append("\n");
    sb.append("    typeId: ").append(toIndentedString(typeId)).append("\n");
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
