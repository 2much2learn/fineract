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
 * GetAccountTransfersTimeline
 */


public class GetAccountTransfersTimeline {
  @SerializedName("submittedOnDate")
  private LocalDate submittedOnDate = null;

  @SerializedName("submittedByUsername")
  private String submittedByUsername = null;

  @SerializedName("submittedByFirstname")
  private String submittedByFirstname = null;

  @SerializedName("submittedByLastname")
  private String submittedByLastname = null;

  @SerializedName("activatedOnDate")
  private LocalDate activatedOnDate = null;

  @SerializedName("activatedByUsername")
  private String activatedByUsername = null;

  @SerializedName("activatedByFirstname")
  private String activatedByFirstname = null;

  @SerializedName("activatedByLastname")
  private String activatedByLastname = null;

  public GetAccountTransfersTimeline submittedOnDate(LocalDate submittedOnDate) {
    this.submittedOnDate = submittedOnDate;
    return this;
  }

   /**
   * Get submittedOnDate
   * @return submittedOnDate
  **/
  @Schema(description = "")
  public LocalDate getSubmittedOnDate() {
    return submittedOnDate;
  }

  public void setSubmittedOnDate(LocalDate submittedOnDate) {
    this.submittedOnDate = submittedOnDate;
  }

  public GetAccountTransfersTimeline submittedByUsername(String submittedByUsername) {
    this.submittedByUsername = submittedByUsername;
    return this;
  }

   /**
   * Get submittedByUsername
   * @return submittedByUsername
  **/
  @Schema(example = "mifos", description = "")
  public String getSubmittedByUsername() {
    return submittedByUsername;
  }

  public void setSubmittedByUsername(String submittedByUsername) {
    this.submittedByUsername = submittedByUsername;
  }

  public GetAccountTransfersTimeline submittedByFirstname(String submittedByFirstname) {
    this.submittedByFirstname = submittedByFirstname;
    return this;
  }

   /**
   * Get submittedByFirstname
   * @return submittedByFirstname
  **/
  @Schema(example = "App", description = "")
  public String getSubmittedByFirstname() {
    return submittedByFirstname;
  }

  public void setSubmittedByFirstname(String submittedByFirstname) {
    this.submittedByFirstname = submittedByFirstname;
  }

  public GetAccountTransfersTimeline submittedByLastname(String submittedByLastname) {
    this.submittedByLastname = submittedByLastname;
    return this;
  }

   /**
   * Get submittedByLastname
   * @return submittedByLastname
  **/
  @Schema(example = "Administrator", description = "")
  public String getSubmittedByLastname() {
    return submittedByLastname;
  }

  public void setSubmittedByLastname(String submittedByLastname) {
    this.submittedByLastname = submittedByLastname;
  }

  public GetAccountTransfersTimeline activatedOnDate(LocalDate activatedOnDate) {
    this.activatedOnDate = activatedOnDate;
    return this;
  }

   /**
   * Get activatedOnDate
   * @return activatedOnDate
  **/
  @Schema(description = "")
  public LocalDate getActivatedOnDate() {
    return activatedOnDate;
  }

  public void setActivatedOnDate(LocalDate activatedOnDate) {
    this.activatedOnDate = activatedOnDate;
  }

  public GetAccountTransfersTimeline activatedByUsername(String activatedByUsername) {
    this.activatedByUsername = activatedByUsername;
    return this;
  }

   /**
   * Get activatedByUsername
   * @return activatedByUsername
  **/
  @Schema(example = "mifos", description = "")
  public String getActivatedByUsername() {
    return activatedByUsername;
  }

  public void setActivatedByUsername(String activatedByUsername) {
    this.activatedByUsername = activatedByUsername;
  }

  public GetAccountTransfersTimeline activatedByFirstname(String activatedByFirstname) {
    this.activatedByFirstname = activatedByFirstname;
    return this;
  }

   /**
   * Get activatedByFirstname
   * @return activatedByFirstname
  **/
  @Schema(example = "App", description = "")
  public String getActivatedByFirstname() {
    return activatedByFirstname;
  }

  public void setActivatedByFirstname(String activatedByFirstname) {
    this.activatedByFirstname = activatedByFirstname;
  }

  public GetAccountTransfersTimeline activatedByLastname(String activatedByLastname) {
    this.activatedByLastname = activatedByLastname;
    return this;
  }

   /**
   * Get activatedByLastname
   * @return activatedByLastname
  **/
  @Schema(example = "Administrator", description = "")
  public String getActivatedByLastname() {
    return activatedByLastname;
  }

  public void setActivatedByLastname(String activatedByLastname) {
    this.activatedByLastname = activatedByLastname;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAccountTransfersTimeline getAccountTransfersTimeline = (GetAccountTransfersTimeline) o;
    return Objects.equals(this.submittedOnDate, getAccountTransfersTimeline.submittedOnDate) &&
        Objects.equals(this.submittedByUsername, getAccountTransfersTimeline.submittedByUsername) &&
        Objects.equals(this.submittedByFirstname, getAccountTransfersTimeline.submittedByFirstname) &&
        Objects.equals(this.submittedByLastname, getAccountTransfersTimeline.submittedByLastname) &&
        Objects.equals(this.activatedOnDate, getAccountTransfersTimeline.activatedOnDate) &&
        Objects.equals(this.activatedByUsername, getAccountTransfersTimeline.activatedByUsername) &&
        Objects.equals(this.activatedByFirstname, getAccountTransfersTimeline.activatedByFirstname) &&
        Objects.equals(this.activatedByLastname, getAccountTransfersTimeline.activatedByLastname);
  }

  @Override
  public int hashCode() {
    return Objects.hash(submittedOnDate, submittedByUsername, submittedByFirstname, submittedByLastname, activatedOnDate, activatedByUsername, activatedByFirstname, activatedByLastname);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAccountTransfersTimeline {\n");
    
    sb.append("    submittedOnDate: ").append(toIndentedString(submittedOnDate)).append("\n");
    sb.append("    submittedByUsername: ").append(toIndentedString(submittedByUsername)).append("\n");
    sb.append("    submittedByFirstname: ").append(toIndentedString(submittedByFirstname)).append("\n");
    sb.append("    submittedByLastname: ").append(toIndentedString(submittedByLastname)).append("\n");
    sb.append("    activatedOnDate: ").append(toIndentedString(activatedOnDate)).append("\n");
    sb.append("    activatedByUsername: ").append(toIndentedString(activatedByUsername)).append("\n");
    sb.append("    activatedByFirstname: ").append(toIndentedString(activatedByFirstname)).append("\n");
    sb.append("    activatedByLastname: ").append(toIndentedString(activatedByLastname)).append("\n");
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
