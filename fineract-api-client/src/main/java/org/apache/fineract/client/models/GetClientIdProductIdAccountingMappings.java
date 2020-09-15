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
import org.apache.fineract.client.models.GetShareAccountsIncomeFromFeeAccountId;
import org.apache.fineract.client.models.GetShareAccountsShareEquityId;
import org.apache.fineract.client.models.GetShareAccountsShareReferenceId;
import org.apache.fineract.client.models.GetShareAccountsShareSuspenseId;
/**
 * GetClientIdProductIdAccountingMappings
 */


public class GetClientIdProductIdAccountingMappings {
  @SerializedName("shareReferenceId")
  private GetShareAccountsShareReferenceId shareReferenceId = null;

  @SerializedName("incomeFromFeeAccountId")
  private GetShareAccountsIncomeFromFeeAccountId incomeFromFeeAccountId = null;

  @SerializedName("ShareEquityId")
  private GetShareAccountsShareEquityId shareEquityId = null;

  @SerializedName("shareSuspenseId")
  private GetShareAccountsShareSuspenseId shareSuspenseId = null;

  public GetClientIdProductIdAccountingMappings shareReferenceId(GetShareAccountsShareReferenceId shareReferenceId) {
    this.shareReferenceId = shareReferenceId;
    return this;
  }

   /**
   * Get shareReferenceId
   * @return shareReferenceId
  **/
  @Schema(description = "")
  public GetShareAccountsShareReferenceId getShareReferenceId() {
    return shareReferenceId;
  }

  public void setShareReferenceId(GetShareAccountsShareReferenceId shareReferenceId) {
    this.shareReferenceId = shareReferenceId;
  }

  public GetClientIdProductIdAccountingMappings incomeFromFeeAccountId(GetShareAccountsIncomeFromFeeAccountId incomeFromFeeAccountId) {
    this.incomeFromFeeAccountId = incomeFromFeeAccountId;
    return this;
  }

   /**
   * Get incomeFromFeeAccountId
   * @return incomeFromFeeAccountId
  **/
  @Schema(description = "")
  public GetShareAccountsIncomeFromFeeAccountId getIncomeFromFeeAccountId() {
    return incomeFromFeeAccountId;
  }

  public void setIncomeFromFeeAccountId(GetShareAccountsIncomeFromFeeAccountId incomeFromFeeAccountId) {
    this.incomeFromFeeAccountId = incomeFromFeeAccountId;
  }

  public GetClientIdProductIdAccountingMappings shareEquityId(GetShareAccountsShareEquityId shareEquityId) {
    this.shareEquityId = shareEquityId;
    return this;
  }

   /**
   * Get shareEquityId
   * @return shareEquityId
  **/
  @Schema(description = "")
  public GetShareAccountsShareEquityId getShareEquityId() {
    return shareEquityId;
  }

  public void setShareEquityId(GetShareAccountsShareEquityId shareEquityId) {
    this.shareEquityId = shareEquityId;
  }

  public GetClientIdProductIdAccountingMappings shareSuspenseId(GetShareAccountsShareSuspenseId shareSuspenseId) {
    this.shareSuspenseId = shareSuspenseId;
    return this;
  }

   /**
   * Get shareSuspenseId
   * @return shareSuspenseId
  **/
  @Schema(description = "")
  public GetShareAccountsShareSuspenseId getShareSuspenseId() {
    return shareSuspenseId;
  }

  public void setShareSuspenseId(GetShareAccountsShareSuspenseId shareSuspenseId) {
    this.shareSuspenseId = shareSuspenseId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetClientIdProductIdAccountingMappings getClientIdProductIdAccountingMappings = (GetClientIdProductIdAccountingMappings) o;
    return Objects.equals(this.shareReferenceId, getClientIdProductIdAccountingMappings.shareReferenceId) &&
        Objects.equals(this.incomeFromFeeAccountId, getClientIdProductIdAccountingMappings.incomeFromFeeAccountId) &&
        Objects.equals(this.shareEquityId, getClientIdProductIdAccountingMappings.shareEquityId) &&
        Objects.equals(this.shareSuspenseId, getClientIdProductIdAccountingMappings.shareSuspenseId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shareReferenceId, incomeFromFeeAccountId, shareEquityId, shareSuspenseId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetClientIdProductIdAccountingMappings {\n");
    
    sb.append("    shareReferenceId: ").append(toIndentedString(shareReferenceId)).append("\n");
    sb.append("    incomeFromFeeAccountId: ").append(toIndentedString(incomeFromFeeAccountId)).append("\n");
    sb.append("    shareEquityId: ").append(toIndentedString(shareEquityId)).append("\n");
    sb.append("    shareSuspenseId: ").append(toIndentedString(shareSuspenseId)).append("\n");
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
