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
 * PostBodyRequestSwagger
 */


public class PostBodyRequestSwagger {
  @SerializedName("officeId")
  private Long officeId = null;

  @SerializedName("firstname")
  private String firstname = null;

  @SerializedName("lastname")
  private String lastname = null;

  @SerializedName("externalId")
  private String externalId = null;

  @SerializedName("dateFormat")
  private String dateFormat = null;

  @SerializedName("locale")
  private String locale = null;

  @SerializedName("active")
  private Boolean active = null;

  @SerializedName("activationDate")
  private String activationDate = null;

  @SerializedName("submittedOnDate")
  private String submittedOnDate = null;

  public PostBodyRequestSwagger officeId(Long officeId) {
    this.officeId = officeId;
    return this;
  }

   /**
   * Get officeId
   * @return officeId
  **/
  @Schema(example = "1", description = "")
  public Long getOfficeId() {
    return officeId;
  }

  public void setOfficeId(Long officeId) {
    this.officeId = officeId;
  }

  public PostBodyRequestSwagger firstname(String firstname) {
    this.firstname = firstname;
    return this;
  }

   /**
   * Get firstname
   * @return firstname
  **/
  @Schema(example = "\"Petra\"", description = "")
  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public PostBodyRequestSwagger lastname(String lastname) {
    this.lastname = lastname;
    return this;
  }

   /**
   * Get lastname
   * @return lastname
  **/
  @Schema(example = "\"Yton\"", description = "")
  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  public PostBodyRequestSwagger externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

   /**
   * Get externalId
   * @return externalId
  **/
  @Schema(example = "\"ex_externalId1\"", description = "")
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  public PostBodyRequestSwagger dateFormat(String dateFormat) {
    this.dateFormat = dateFormat;
    return this;
  }

   /**
   * Get dateFormat
   * @return dateFormat
  **/
  @Schema(example = "\"dd MMMM yyyy\"", description = "")
  public String getDateFormat() {
    return dateFormat;
  }

  public void setDateFormat(String dateFormat) {
    this.dateFormat = dateFormat;
  }

  public PostBodyRequestSwagger locale(String locale) {
    this.locale = locale;
    return this;
  }

   /**
   * Get locale
   * @return locale
  **/
  @Schema(example = "\"en\"", description = "")
  public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }

  public PostBodyRequestSwagger active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @Schema(example = "true", description = "")
  public Boolean isActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public PostBodyRequestSwagger activationDate(String activationDate) {
    this.activationDate = activationDate;
    return this;
  }

   /**
   * Get activationDate
   * @return activationDate
  **/
  @Schema(example = "\"04 March 2009\"", description = "")
  public String getActivationDate() {
    return activationDate;
  }

  public void setActivationDate(String activationDate) {
    this.activationDate = activationDate;
  }

  public PostBodyRequestSwagger submittedOnDate(String submittedOnDate) {
    this.submittedOnDate = submittedOnDate;
    return this;
  }

   /**
   * Get submittedOnDate
   * @return submittedOnDate
  **/
  @Schema(example = "\"04 March 2009\"", description = "")
  public String getSubmittedOnDate() {
    return submittedOnDate;
  }

  public void setSubmittedOnDate(String submittedOnDate) {
    this.submittedOnDate = submittedOnDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostBodyRequestSwagger postBodyRequestSwagger = (PostBodyRequestSwagger) o;
    return Objects.equals(this.officeId, postBodyRequestSwagger.officeId) &&
        Objects.equals(this.firstname, postBodyRequestSwagger.firstname) &&
        Objects.equals(this.lastname, postBodyRequestSwagger.lastname) &&
        Objects.equals(this.externalId, postBodyRequestSwagger.externalId) &&
        Objects.equals(this.dateFormat, postBodyRequestSwagger.dateFormat) &&
        Objects.equals(this.locale, postBodyRequestSwagger.locale) &&
        Objects.equals(this.active, postBodyRequestSwagger.active) &&
        Objects.equals(this.activationDate, postBodyRequestSwagger.activationDate) &&
        Objects.equals(this.submittedOnDate, postBodyRequestSwagger.submittedOnDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(officeId, firstname, lastname, externalId, dateFormat, locale, active, activationDate, submittedOnDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostBodyRequestSwagger {\n");
    
    sb.append("    officeId: ").append(toIndentedString(officeId)).append("\n");
    sb.append("    firstname: ").append(toIndentedString(firstname)).append("\n");
    sb.append("    lastname: ").append(toIndentedString(lastname)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    dateFormat: ").append(toIndentedString(dateFormat)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    activationDate: ").append(toIndentedString(activationDate)).append("\n");
    sb.append("    submittedOnDate: ").append(toIndentedString(submittedOnDate)).append("\n");
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
