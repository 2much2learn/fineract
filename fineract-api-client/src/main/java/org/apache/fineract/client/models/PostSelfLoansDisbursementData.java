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
 * PostSelfLoansDisbursementData
 */


public class PostSelfLoansDisbursementData {
  @SerializedName("expectedDisbursementDate")
  private String expectedDisbursementDate = null;

  @SerializedName("principal")
  private Long principal = null;

  @SerializedName("approvedPrincipal")
  private Long approvedPrincipal = null;

  public PostSelfLoansDisbursementData expectedDisbursementDate(String expectedDisbursementDate) {
    this.expectedDisbursementDate = expectedDisbursementDate;
    return this;
  }

   /**
   * Get expectedDisbursementDate
   * @return expectedDisbursementDate
  **/
  @Schema(example = "01 November 2013", description = "")
  public String getExpectedDisbursementDate() {
    return expectedDisbursementDate;
  }

  public void setExpectedDisbursementDate(String expectedDisbursementDate) {
    this.expectedDisbursementDate = expectedDisbursementDate;
  }

  public PostSelfLoansDisbursementData principal(Long principal) {
    this.principal = principal;
    return this;
  }

   /**
   * Get principal
   * @return principal
  **/
  @Schema(example = "22000", description = "")
  public Long getPrincipal() {
    return principal;
  }

  public void setPrincipal(Long principal) {
    this.principal = principal;
  }

  public PostSelfLoansDisbursementData approvedPrincipal(Long approvedPrincipal) {
    this.approvedPrincipal = approvedPrincipal;
    return this;
  }

   /**
   * Get approvedPrincipal
   * @return approvedPrincipal
  **/
  @Schema(example = "22000", description = "")
  public Long getApprovedPrincipal() {
    return approvedPrincipal;
  }

  public void setApprovedPrincipal(Long approvedPrincipal) {
    this.approvedPrincipal = approvedPrincipal;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostSelfLoansDisbursementData postSelfLoansDisbursementData = (PostSelfLoansDisbursementData) o;
    return Objects.equals(this.expectedDisbursementDate, postSelfLoansDisbursementData.expectedDisbursementDate) &&
        Objects.equals(this.principal, postSelfLoansDisbursementData.principal) &&
        Objects.equals(this.approvedPrincipal, postSelfLoansDisbursementData.approvedPrincipal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expectedDisbursementDate, principal, approvedPrincipal);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostSelfLoansDisbursementData {\n");
    
    sb.append("    expectedDisbursementDate: ").append(toIndentedString(expectedDisbursementDate)).append("\n");
    sb.append("    principal: ").append(toIndentedString(principal)).append("\n");
    sb.append("    approvedPrincipal: ").append(toIndentedString(approvedPrincipal)).append("\n");
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
