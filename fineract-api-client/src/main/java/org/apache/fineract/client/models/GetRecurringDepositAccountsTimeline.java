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
 * GetRecurringDepositAccountsTimeline
 */


public class GetRecurringDepositAccountsTimeline {
  @SerializedName("submittedOnDate")
  private LocalDate submittedOnDate = null;

  @SerializedName("submittedByUsername")
  private String submittedByUsername = null;

  @SerializedName("submittedByFirstname")
  private String submittedByFirstname = null;

  @SerializedName("submittedByLastname")
  private String submittedByLastname = null;

  public GetRecurringDepositAccountsTimeline submittedOnDate(LocalDate submittedOnDate) {
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

  public GetRecurringDepositAccountsTimeline submittedByUsername(String submittedByUsername) {
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

  public GetRecurringDepositAccountsTimeline submittedByFirstname(String submittedByFirstname) {
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

  public GetRecurringDepositAccountsTimeline submittedByLastname(String submittedByLastname) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetRecurringDepositAccountsTimeline getRecurringDepositAccountsTimeline = (GetRecurringDepositAccountsTimeline) o;
    return Objects.equals(this.submittedOnDate, getRecurringDepositAccountsTimeline.submittedOnDate) &&
        Objects.equals(this.submittedByUsername, getRecurringDepositAccountsTimeline.submittedByUsername) &&
        Objects.equals(this.submittedByFirstname, getRecurringDepositAccountsTimeline.submittedByFirstname) &&
        Objects.equals(this.submittedByLastname, getRecurringDepositAccountsTimeline.submittedByLastname);
  }

  @Override
  public int hashCode() {
    return Objects.hash(submittedOnDate, submittedByUsername, submittedByFirstname, submittedByLastname);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetRecurringDepositAccountsTimeline {\n");
    
    sb.append("    submittedOnDate: ").append(toIndentedString(submittedOnDate)).append("\n");
    sb.append("    submittedByUsername: ").append(toIndentedString(submittedByUsername)).append("\n");
    sb.append("    submittedByFirstname: ").append(toIndentedString(submittedByFirstname)).append("\n");
    sb.append("    submittedByLastname: ").append(toIndentedString(submittedByLastname)).append("\n");
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
