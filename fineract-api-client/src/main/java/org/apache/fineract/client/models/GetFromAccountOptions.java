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
import org.apache.fineract.client.models.GetAccountOptions;
/**
 * GetFromAccountOptions
 */


public class GetFromAccountOptions {
  @SerializedName("accountId")
  private Integer accountId = null;

  @SerializedName("accountNo")
  private Integer accountNo = null;

  @SerializedName("accountType")
  private GetAccountOptions accountType = null;

  @SerializedName("clientId")
  private Integer clientId = null;

  @SerializedName("clientName")
  private String clientName = null;

  @SerializedName("officeId")
  private Integer officeId = null;

  @SerializedName("officeName")
  private String officeName = null;

  public GetFromAccountOptions accountId(Integer accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * Get accountId
   * @return accountId
  **/
  @Schema(example = "2", description = "")
  public Integer getAccountId() {
    return accountId;
  }

  public void setAccountId(Integer accountId) {
    this.accountId = accountId;
  }

  public GetFromAccountOptions accountNo(Integer accountNo) {
    this.accountNo = accountNo;
    return this;
  }

   /**
   * Get accountNo
   * @return accountNo
  **/
  @Schema(example = "1", description = "")
  public Integer getAccountNo() {
    return accountNo;
  }

  public void setAccountNo(Integer accountNo) {
    this.accountNo = accountNo;
  }

  public GetFromAccountOptions accountType(GetAccountOptions accountType) {
    this.accountType = accountType;
    return this;
  }

   /**
   * Get accountType
   * @return accountType
  **/
  @Schema(description = "")
  public GetAccountOptions getAccountType() {
    return accountType;
  }

  public void setAccountType(GetAccountOptions accountType) {
    this.accountType = accountType;
  }

  public GetFromAccountOptions clientId(Integer clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * Get clientId
   * @return clientId
  **/
  @Schema(example = "1", description = "")
  public Integer getClientId() {
    return clientId;
  }

  public void setClientId(Integer clientId) {
    this.clientId = clientId;
  }

  public GetFromAccountOptions clientName(String clientName) {
    this.clientName = clientName;
    return this;
  }

   /**
   * Get clientName
   * @return clientName
  **/
  @Schema(example = "ABC", description = "")
  public String getClientName() {
    return clientName;
  }

  public void setClientName(String clientName) {
    this.clientName = clientName;
  }

  public GetFromAccountOptions officeId(Integer officeId) {
    this.officeId = officeId;
    return this;
  }

   /**
   * Get officeId
   * @return officeId
  **/
  @Schema(example = "1", description = "")
  public Integer getOfficeId() {
    return officeId;
  }

  public void setOfficeId(Integer officeId) {
    this.officeId = officeId;
  }

  public GetFromAccountOptions officeName(String officeName) {
    this.officeName = officeName;
    return this;
  }

   /**
   * Get officeName
   * @return officeName
  **/
  @Schema(example = "HEAD OFFICE", description = "")
  public String getOfficeName() {
    return officeName;
  }

  public void setOfficeName(String officeName) {
    this.officeName = officeName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetFromAccountOptions getFromAccountOptions = (GetFromAccountOptions) o;
    return Objects.equals(this.accountId, getFromAccountOptions.accountId) &&
        Objects.equals(this.accountNo, getFromAccountOptions.accountNo) &&
        Objects.equals(this.accountType, getFromAccountOptions.accountType) &&
        Objects.equals(this.clientId, getFromAccountOptions.clientId) &&
        Objects.equals(this.clientName, getFromAccountOptions.clientName) &&
        Objects.equals(this.officeId, getFromAccountOptions.officeId) &&
        Objects.equals(this.officeName, getFromAccountOptions.officeName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, accountNo, accountType, clientId, clientName, officeId, officeName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetFromAccountOptions {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    accountNo: ").append(toIndentedString(accountNo)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientName: ").append(toIndentedString(clientName)).append("\n");
    sb.append("    officeId: ").append(toIndentedString(officeId)).append("\n");
    sb.append("    officeName: ").append(toIndentedString(officeName)).append("\n");
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