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
import java.time.LocalDate;
/**
 * PostOfficesRequest
 */
@Schema(description = "PostOfficesRequest")

public class PostOfficesRequest {
  @SerializedName("name")
  private String name = null;

  @SerializedName("dateFormat")
  private String dateFormat = null;

  @SerializedName("locale")
  private String locale = null;

  @SerializedName("openingDate")
  private LocalDate openingDate = null;

  @SerializedName("parentId")
  private Long parentId = null;

  @SerializedName("externalId")
  private String externalId = null;

  public PostOfficesRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(example = "Good Friday", description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PostOfficesRequest dateFormat(String dateFormat) {
    this.dateFormat = dateFormat;
    return this;
  }

   /**
   * Get dateFormat
   * @return dateFormat
  **/
  @Schema(example = "dd MMMM yyyy", description = "")
  public String getDateFormat() {
    return dateFormat;
  }

  public void setDateFormat(String dateFormat) {
    this.dateFormat = dateFormat;
  }

  public PostOfficesRequest locale(String locale) {
    this.locale = locale;
    return this;
  }

   /**
   * Get locale
   * @return locale
  **/
  @Schema(example = "en", description = "")
  public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }

  public PostOfficesRequest openingDate(LocalDate openingDate) {
    this.openingDate = openingDate;
    return this;
  }

   /**
   * Get openingDate
   * @return openingDate
  **/
  @Schema(description = "")
  public LocalDate getOpeningDate() {
    return openingDate;
  }

  public void setOpeningDate(LocalDate openingDate) {
    this.openingDate = openingDate;
  }

  public PostOfficesRequest parentId(Long parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * Get parentId
   * @return parentId
  **/
  @Schema(example = "2", description = "")
  public Long getParentId() {
    return parentId;
  }

  public void setParentId(Long parentId) {
    this.parentId = parentId;
  }

  public PostOfficesRequest externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

   /**
   * Get externalId
   * @return externalId
  **/
  @Schema(example = "SYS54-88", description = "")
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostOfficesRequest postOfficesRequest = (PostOfficesRequest) o;
    return Objects.equals(this.name, postOfficesRequest.name) &&
        Objects.equals(this.dateFormat, postOfficesRequest.dateFormat) &&
        Objects.equals(this.locale, postOfficesRequest.locale) &&
        Objects.equals(this.openingDate, postOfficesRequest.openingDate) &&
        Objects.equals(this.parentId, postOfficesRequest.parentId) &&
        Objects.equals(this.externalId, postOfficesRequest.externalId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, dateFormat, locale, openingDate, parentId, externalId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostOfficesRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dateFormat: ").append(toIndentedString(dateFormat)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    openingDate: ").append(toIndentedString(openingDate)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
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
