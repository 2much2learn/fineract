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
 * PostAdhocQuerySearchResponse
 */
@Schema(description = "PostAdhocQuerySearchResponse")

public class PostAdhocQuerySearchResponse {
  @SerializedName("officeName")
  private String officeName = null;

  @SerializedName("loanProductName")
  private String loanProductName = null;

  @SerializedName("loanOutStanding")
  private Long loanOutStanding = null;

  @SerializedName("percentage")
  private Long percentage = null;

  public PostAdhocQuerySearchResponse officeName(String officeName) {
    this.officeName = officeName;
    return this;
  }

   /**
   * Get officeName
   * @return officeName
  **/
  @Schema(example = "HFC", description = "")
  public String getOfficeName() {
    return officeName;
  }

  public void setOfficeName(String officeName) {
    this.officeName = officeName;
  }

  public PostAdhocQuerySearchResponse loanProductName(String loanProductName) {
    this.loanProductName = loanProductName;
    return this;
  }

   /**
   * Get loanProductName
   * @return loanProductName
  **/
  @Schema(example = "01 BC3M", description = "")
  public String getLoanProductName() {
    return loanProductName;
  }

  public void setLoanProductName(String loanProductName) {
    this.loanProductName = loanProductName;
  }

  public PostAdhocQuerySearchResponse loanOutStanding(Long loanOutStanding) {
    this.loanOutStanding = loanOutStanding;
    return this;
  }

   /**
   * Get loanOutStanding
   * @return loanOutStanding
  **/
  @Schema(description = "")
  public Long getLoanOutStanding() {
    return loanOutStanding;
  }

  public void setLoanOutStanding(Long loanOutStanding) {
    this.loanOutStanding = loanOutStanding;
  }

  public PostAdhocQuerySearchResponse percentage(Long percentage) {
    this.percentage = percentage;
    return this;
  }

   /**
   * Get percentage
   * @return percentage
  **/
  @Schema(description = "")
  public Long getPercentage() {
    return percentage;
  }

  public void setPercentage(Long percentage) {
    this.percentage = percentage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostAdhocQuerySearchResponse postAdhocQuerySearchResponse = (PostAdhocQuerySearchResponse) o;
    return Objects.equals(this.officeName, postAdhocQuerySearchResponse.officeName) &&
        Objects.equals(this.loanProductName, postAdhocQuerySearchResponse.loanProductName) &&
        Objects.equals(this.loanOutStanding, postAdhocQuerySearchResponse.loanOutStanding) &&
        Objects.equals(this.percentage, postAdhocQuerySearchResponse.percentage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(officeName, loanProductName, loanOutStanding, percentage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostAdhocQuerySearchResponse {\n");
    
    sb.append("    officeName: ").append(toIndentedString(officeName)).append("\n");
    sb.append("    loanProductName: ").append(toIndentedString(loanProductName)).append("\n");
    sb.append("    loanOutStanding: ").append(toIndentedString(loanOutStanding)).append("\n");
    sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
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
