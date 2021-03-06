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
import java.util.ArrayList;
import java.util.List;
import org.apache.fineract.client.models.GetAccountTransfersFromAccountType;
import org.apache.fineract.client.models.GetAccountTransfersPageItemsToAccountType;
import org.apache.fineract.client.models.GetAccountTransfersTemplateRefundByTransferCurrency;
import org.apache.fineract.client.models.GetAccountTransfersTemplateRefundByTransferFromAccount;
import org.apache.fineract.client.models.GetAccountTransfersTemplateRefundByTransferFromAccountOptions;
import org.apache.fineract.client.models.GetAccountTransfersTemplateRefundByTransferFromClient;
import org.apache.fineract.client.models.GetAccountTransfersTemplateRefundByTransferFromClientOptions;
import org.apache.fineract.client.models.GetAccountTransfersTemplateRefundByTransferFromOffice;
import org.apache.fineract.client.models.GetAccountTransfersTemplateRefundByTransferFromOfficeOptions;
import org.apache.fineract.client.models.GetAccountTransfersTemplateRefundByTransferToAccount;
import org.apache.fineract.client.models.GetAccountTransfersTemplateRefundByTransferToClient;
/**
 * GetAccountTransfersTemplateRefundByTransferResponse
 */
@Schema(description = "GetAccountTransfersTemplateRefundByTransferResponse")

public class GetAccountTransfersTemplateRefundByTransferResponse {
  @SerializedName("currency")
  private GetAccountTransfersTemplateRefundByTransferCurrency currency = null;

  @SerializedName("transferAmount")
  private Float transferAmount = null;

  @SerializedName("transferDate")
  private LocalDate transferDate = null;

  @SerializedName("fromOffice")
  private GetAccountTransfersTemplateRefundByTransferFromOffice fromOffice = null;

  @SerializedName("fromClient")
  private GetAccountTransfersTemplateRefundByTransferFromClient fromClient = null;

  @SerializedName("fromAccountType")
  private GetAccountTransfersPageItemsToAccountType fromAccountType = null;

  @SerializedName("fromAccount")
  private GetAccountTransfersTemplateRefundByTransferFromAccount fromAccount = null;

  @SerializedName("toOffice")
  private GetAccountTransfersTemplateRefundByTransferFromOffice toOffice = null;

  @SerializedName("toClient")
  private GetAccountTransfersTemplateRefundByTransferToClient toClient = null;

  @SerializedName("toAccountType")
  private GetAccountTransfersFromAccountType toAccountType = null;

  @SerializedName("toAccount")
  private GetAccountTransfersTemplateRefundByTransferToAccount toAccount = null;

  @SerializedName("fromOfficeOptions")
  private List<GetAccountTransfersTemplateRefundByTransferFromOfficeOptions> fromOfficeOptions = null;

  @SerializedName("fromClientOptions")
  private List<GetAccountTransfersTemplateRefundByTransferFromClientOptions> fromClientOptions = null;

  @SerializedName("fromAccountTypeOptions")
  private List<GetAccountTransfersFromAccountType> fromAccountTypeOptions = null;

  @SerializedName("fromAccountOptions")
  private List<GetAccountTransfersTemplateRefundByTransferFromAccountOptions> fromAccountOptions = null;

  @SerializedName("toOfficeOptions")
  private List<GetAccountTransfersTemplateRefundByTransferFromOfficeOptions> toOfficeOptions = null;

  @SerializedName("toClientOptions")
  private List<GetAccountTransfersTemplateRefundByTransferFromClientOptions> toClientOptions = null;

  @SerializedName("toAccountTypeOptions")
  private List<GetAccountTransfersFromAccountType> toAccountTypeOptions = null;

  @SerializedName("toAccountOptions")
  private List<GetAccountTransfersTemplateRefundByTransferToAccount> toAccountOptions = null;

  public GetAccountTransfersTemplateRefundByTransferResponse currency(GetAccountTransfersTemplateRefundByTransferCurrency currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @Schema(description = "")
  public GetAccountTransfersTemplateRefundByTransferCurrency getCurrency() {
    return currency;
  }

  public void setCurrency(GetAccountTransfersTemplateRefundByTransferCurrency currency) {
    this.currency = currency;
  }

  public GetAccountTransfersTemplateRefundByTransferResponse transferAmount(Float transferAmount) {
    this.transferAmount = transferAmount;
    return this;
  }

   /**
   * Get transferAmount
   * @return transferAmount
  **/
  @Schema(example = "130", description = "")
  public Float getTransferAmount() {
    return transferAmount;
  }

  public void setTransferAmount(Float transferAmount) {
    this.transferAmount = transferAmount;
  }

  public GetAccountTransfersTemplateRefundByTransferResponse transferDate(LocalDate transferDate) {
    this.transferDate = transferDate;
    return this;
  }

   /**
   * Get transferDate
   * @return transferDate
  **/
  @Schema(description = "")
  public LocalDate getTransferDate() {
    return transferDate;
  }

  public void setTransferDate(LocalDate transferDate) {
    this.transferDate = transferDate;
  }

  public GetAccountTransfersTemplateRefundByTransferResponse fromOffice(GetAccountTransfersTemplateRefundByTransferFromOffice fromOffice) {
    this.fromOffice = fromOffice;
    return this;
  }

   /**
   * Get fromOffice
   * @return fromOffice
  **/
  @Schema(description = "")
  public GetAccountTransfersTemplateRefundByTransferFromOffice getFromOffice() {
    return fromOffice;
  }

  public void setFromOffice(GetAccountTransfersTemplateRefundByTransferFromOffice fromOffice) {
    this.fromOffice = fromOffice;
  }

  public GetAccountTransfersTemplateRefundByTransferResponse fromClient(GetAccountTransfersTemplateRefundByTransferFromClient fromClient) {
    this.fromClient = fromClient;
    return this;
  }

   /**
   * Get fromClient
   * @return fromClient
  **/
  @Schema(description = "")
  public GetAccountTransfersTemplateRefundByTransferFromClient getFromClient() {
    return fromClient;
  }

  public void setFromClient(GetAccountTransfersTemplateRefundByTransferFromClient fromClient) {
    this.fromClient = fromClient;
  }

  public GetAccountTransfersTemplateRefundByTransferResponse fromAccountType(GetAccountTransfersPageItemsToAccountType fromAccountType) {
    this.fromAccountType = fromAccountType;
    return this;
  }

   /**
   * Get fromAccountType
   * @return fromAccountType
  **/
  @Schema(description = "")
  public GetAccountTransfersPageItemsToAccountType getFromAccountType() {
    return fromAccountType;
  }

  public void setFromAccountType(GetAccountTransfersPageItemsToAccountType fromAccountType) {
    this.fromAccountType = fromAccountType;
  }

  public GetAccountTransfersTemplateRefundByTransferResponse fromAccount(GetAccountTransfersTemplateRefundByTransferFromAccount fromAccount) {
    this.fromAccount = fromAccount;
    return this;
  }

   /**
   * Get fromAccount
   * @return fromAccount
  **/
  @Schema(description = "")
  public GetAccountTransfersTemplateRefundByTransferFromAccount getFromAccount() {
    return fromAccount;
  }

  public void setFromAccount(GetAccountTransfersTemplateRefundByTransferFromAccount fromAccount) {
    this.fromAccount = fromAccount;
  }

  public GetAccountTransfersTemplateRefundByTransferResponse toOffice(GetAccountTransfersTemplateRefundByTransferFromOffice toOffice) {
    this.toOffice = toOffice;
    return this;
  }

   /**
   * Get toOffice
   * @return toOffice
  **/
  @Schema(description = "")
  public GetAccountTransfersTemplateRefundByTransferFromOffice getToOffice() {
    return toOffice;
  }

  public void setToOffice(GetAccountTransfersTemplateRefundByTransferFromOffice toOffice) {
    this.toOffice = toOffice;
  }

  public GetAccountTransfersTemplateRefundByTransferResponse toClient(GetAccountTransfersTemplateRefundByTransferToClient toClient) {
    this.toClient = toClient;
    return this;
  }

   /**
   * Get toClient
   * @return toClient
  **/
  @Schema(description = "")
  public GetAccountTransfersTemplateRefundByTransferToClient getToClient() {
    return toClient;
  }

  public void setToClient(GetAccountTransfersTemplateRefundByTransferToClient toClient) {
    this.toClient = toClient;
  }

  public GetAccountTransfersTemplateRefundByTransferResponse toAccountType(GetAccountTransfersFromAccountType toAccountType) {
    this.toAccountType = toAccountType;
    return this;
  }

   /**
   * Get toAccountType
   * @return toAccountType
  **/
  @Schema(description = "")
  public GetAccountTransfersFromAccountType getToAccountType() {
    return toAccountType;
  }

  public void setToAccountType(GetAccountTransfersFromAccountType toAccountType) {
    this.toAccountType = toAccountType;
  }

  public GetAccountTransfersTemplateRefundByTransferResponse toAccount(GetAccountTransfersTemplateRefundByTransferToAccount toAccount) {
    this.toAccount = toAccount;
    return this;
  }

   /**
   * Get toAccount
   * @return toAccount
  **/
  @Schema(description = "")
  public GetAccountTransfersTemplateRefundByTransferToAccount getToAccount() {
    return toAccount;
  }

  public void setToAccount(GetAccountTransfersTemplateRefundByTransferToAccount toAccount) {
    this.toAccount = toAccount;
  }

  public GetAccountTransfersTemplateRefundByTransferResponse fromOfficeOptions(List<GetAccountTransfersTemplateRefundByTransferFromOfficeOptions> fromOfficeOptions) {
    this.fromOfficeOptions = fromOfficeOptions;
    return this;
  }

  public GetAccountTransfersTemplateRefundByTransferResponse addFromOfficeOptionsItem(GetAccountTransfersTemplateRefundByTransferFromOfficeOptions fromOfficeOptionsItem) {
    if (this.fromOfficeOptions == null) {
      this.fromOfficeOptions = new ArrayList<>();
    }
    this.fromOfficeOptions.add(fromOfficeOptionsItem);
    return this;
  }

   /**
   * Get fromOfficeOptions
   * @return fromOfficeOptions
  **/
  @Schema(description = "")
  public List<GetAccountTransfersTemplateRefundByTransferFromOfficeOptions> getFromOfficeOptions() {
    return fromOfficeOptions;
  }

  public void setFromOfficeOptions(List<GetAccountTransfersTemplateRefundByTransferFromOfficeOptions> fromOfficeOptions) {
    this.fromOfficeOptions = fromOfficeOptions;
  }

  public GetAccountTransfersTemplateRefundByTransferResponse fromClientOptions(List<GetAccountTransfersTemplateRefundByTransferFromClientOptions> fromClientOptions) {
    this.fromClientOptions = fromClientOptions;
    return this;
  }

  public GetAccountTransfersTemplateRefundByTransferResponse addFromClientOptionsItem(GetAccountTransfersTemplateRefundByTransferFromClientOptions fromClientOptionsItem) {
    if (this.fromClientOptions == null) {
      this.fromClientOptions = new ArrayList<>();
    }
    this.fromClientOptions.add(fromClientOptionsItem);
    return this;
  }

   /**
   * Get fromClientOptions
   * @return fromClientOptions
  **/
  @Schema(description = "")
  public List<GetAccountTransfersTemplateRefundByTransferFromClientOptions> getFromClientOptions() {
    return fromClientOptions;
  }

  public void setFromClientOptions(List<GetAccountTransfersTemplateRefundByTransferFromClientOptions> fromClientOptions) {
    this.fromClientOptions = fromClientOptions;
  }

  public GetAccountTransfersTemplateRefundByTransferResponse fromAccountTypeOptions(List<GetAccountTransfersFromAccountType> fromAccountTypeOptions) {
    this.fromAccountTypeOptions = fromAccountTypeOptions;
    return this;
  }

  public GetAccountTransfersTemplateRefundByTransferResponse addFromAccountTypeOptionsItem(GetAccountTransfersFromAccountType fromAccountTypeOptionsItem) {
    if (this.fromAccountTypeOptions == null) {
      this.fromAccountTypeOptions = new ArrayList<>();
    }
    this.fromAccountTypeOptions.add(fromAccountTypeOptionsItem);
    return this;
  }

   /**
   * Get fromAccountTypeOptions
   * @return fromAccountTypeOptions
  **/
  @Schema(description = "")
  public List<GetAccountTransfersFromAccountType> getFromAccountTypeOptions() {
    return fromAccountTypeOptions;
  }

  public void setFromAccountTypeOptions(List<GetAccountTransfersFromAccountType> fromAccountTypeOptions) {
    this.fromAccountTypeOptions = fromAccountTypeOptions;
  }

  public GetAccountTransfersTemplateRefundByTransferResponse fromAccountOptions(List<GetAccountTransfersTemplateRefundByTransferFromAccountOptions> fromAccountOptions) {
    this.fromAccountOptions = fromAccountOptions;
    return this;
  }

  public GetAccountTransfersTemplateRefundByTransferResponse addFromAccountOptionsItem(GetAccountTransfersTemplateRefundByTransferFromAccountOptions fromAccountOptionsItem) {
    if (this.fromAccountOptions == null) {
      this.fromAccountOptions = new ArrayList<>();
    }
    this.fromAccountOptions.add(fromAccountOptionsItem);
    return this;
  }

   /**
   * Get fromAccountOptions
   * @return fromAccountOptions
  **/
  @Schema(description = "")
  public List<GetAccountTransfersTemplateRefundByTransferFromAccountOptions> getFromAccountOptions() {
    return fromAccountOptions;
  }

  public void setFromAccountOptions(List<GetAccountTransfersTemplateRefundByTransferFromAccountOptions> fromAccountOptions) {
    this.fromAccountOptions = fromAccountOptions;
  }

  public GetAccountTransfersTemplateRefundByTransferResponse toOfficeOptions(List<GetAccountTransfersTemplateRefundByTransferFromOfficeOptions> toOfficeOptions) {
    this.toOfficeOptions = toOfficeOptions;
    return this;
  }

  public GetAccountTransfersTemplateRefundByTransferResponse addToOfficeOptionsItem(GetAccountTransfersTemplateRefundByTransferFromOfficeOptions toOfficeOptionsItem) {
    if (this.toOfficeOptions == null) {
      this.toOfficeOptions = new ArrayList<>();
    }
    this.toOfficeOptions.add(toOfficeOptionsItem);
    return this;
  }

   /**
   * Get toOfficeOptions
   * @return toOfficeOptions
  **/
  @Schema(description = "")
  public List<GetAccountTransfersTemplateRefundByTransferFromOfficeOptions> getToOfficeOptions() {
    return toOfficeOptions;
  }

  public void setToOfficeOptions(List<GetAccountTransfersTemplateRefundByTransferFromOfficeOptions> toOfficeOptions) {
    this.toOfficeOptions = toOfficeOptions;
  }

  public GetAccountTransfersTemplateRefundByTransferResponse toClientOptions(List<GetAccountTransfersTemplateRefundByTransferFromClientOptions> toClientOptions) {
    this.toClientOptions = toClientOptions;
    return this;
  }

  public GetAccountTransfersTemplateRefundByTransferResponse addToClientOptionsItem(GetAccountTransfersTemplateRefundByTransferFromClientOptions toClientOptionsItem) {
    if (this.toClientOptions == null) {
      this.toClientOptions = new ArrayList<>();
    }
    this.toClientOptions.add(toClientOptionsItem);
    return this;
  }

   /**
   * Get toClientOptions
   * @return toClientOptions
  **/
  @Schema(description = "")
  public List<GetAccountTransfersTemplateRefundByTransferFromClientOptions> getToClientOptions() {
    return toClientOptions;
  }

  public void setToClientOptions(List<GetAccountTransfersTemplateRefundByTransferFromClientOptions> toClientOptions) {
    this.toClientOptions = toClientOptions;
  }

  public GetAccountTransfersTemplateRefundByTransferResponse toAccountTypeOptions(List<GetAccountTransfersFromAccountType> toAccountTypeOptions) {
    this.toAccountTypeOptions = toAccountTypeOptions;
    return this;
  }

  public GetAccountTransfersTemplateRefundByTransferResponse addToAccountTypeOptionsItem(GetAccountTransfersFromAccountType toAccountTypeOptionsItem) {
    if (this.toAccountTypeOptions == null) {
      this.toAccountTypeOptions = new ArrayList<>();
    }
    this.toAccountTypeOptions.add(toAccountTypeOptionsItem);
    return this;
  }

   /**
   * Get toAccountTypeOptions
   * @return toAccountTypeOptions
  **/
  @Schema(description = "")
  public List<GetAccountTransfersFromAccountType> getToAccountTypeOptions() {
    return toAccountTypeOptions;
  }

  public void setToAccountTypeOptions(List<GetAccountTransfersFromAccountType> toAccountTypeOptions) {
    this.toAccountTypeOptions = toAccountTypeOptions;
  }

  public GetAccountTransfersTemplateRefundByTransferResponse toAccountOptions(List<GetAccountTransfersTemplateRefundByTransferToAccount> toAccountOptions) {
    this.toAccountOptions = toAccountOptions;
    return this;
  }

  public GetAccountTransfersTemplateRefundByTransferResponse addToAccountOptionsItem(GetAccountTransfersTemplateRefundByTransferToAccount toAccountOptionsItem) {
    if (this.toAccountOptions == null) {
      this.toAccountOptions = new ArrayList<>();
    }
    this.toAccountOptions.add(toAccountOptionsItem);
    return this;
  }

   /**
   * Get toAccountOptions
   * @return toAccountOptions
  **/
  @Schema(description = "")
  public List<GetAccountTransfersTemplateRefundByTransferToAccount> getToAccountOptions() {
    return toAccountOptions;
  }

  public void setToAccountOptions(List<GetAccountTransfersTemplateRefundByTransferToAccount> toAccountOptions) {
    this.toAccountOptions = toAccountOptions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAccountTransfersTemplateRefundByTransferResponse getAccountTransfersTemplateRefundByTransferResponse = (GetAccountTransfersTemplateRefundByTransferResponse) o;
    return Objects.equals(this.currency, getAccountTransfersTemplateRefundByTransferResponse.currency) &&
        Objects.equals(this.transferAmount, getAccountTransfersTemplateRefundByTransferResponse.transferAmount) &&
        Objects.equals(this.transferDate, getAccountTransfersTemplateRefundByTransferResponse.transferDate) &&
        Objects.equals(this.fromOffice, getAccountTransfersTemplateRefundByTransferResponse.fromOffice) &&
        Objects.equals(this.fromClient, getAccountTransfersTemplateRefundByTransferResponse.fromClient) &&
        Objects.equals(this.fromAccountType, getAccountTransfersTemplateRefundByTransferResponse.fromAccountType) &&
        Objects.equals(this.fromAccount, getAccountTransfersTemplateRefundByTransferResponse.fromAccount) &&
        Objects.equals(this.toOffice, getAccountTransfersTemplateRefundByTransferResponse.toOffice) &&
        Objects.equals(this.toClient, getAccountTransfersTemplateRefundByTransferResponse.toClient) &&
        Objects.equals(this.toAccountType, getAccountTransfersTemplateRefundByTransferResponse.toAccountType) &&
        Objects.equals(this.toAccount, getAccountTransfersTemplateRefundByTransferResponse.toAccount) &&
        Objects.equals(this.fromOfficeOptions, getAccountTransfersTemplateRefundByTransferResponse.fromOfficeOptions) &&
        Objects.equals(this.fromClientOptions, getAccountTransfersTemplateRefundByTransferResponse.fromClientOptions) &&
        Objects.equals(this.fromAccountTypeOptions, getAccountTransfersTemplateRefundByTransferResponse.fromAccountTypeOptions) &&
        Objects.equals(this.fromAccountOptions, getAccountTransfersTemplateRefundByTransferResponse.fromAccountOptions) &&
        Objects.equals(this.toOfficeOptions, getAccountTransfersTemplateRefundByTransferResponse.toOfficeOptions) &&
        Objects.equals(this.toClientOptions, getAccountTransfersTemplateRefundByTransferResponse.toClientOptions) &&
        Objects.equals(this.toAccountTypeOptions, getAccountTransfersTemplateRefundByTransferResponse.toAccountTypeOptions) &&
        Objects.equals(this.toAccountOptions, getAccountTransfersTemplateRefundByTransferResponse.toAccountOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currency, transferAmount, transferDate, fromOffice, fromClient, fromAccountType, fromAccount, toOffice, toClient, toAccountType, toAccount, fromOfficeOptions, fromClientOptions, fromAccountTypeOptions, fromAccountOptions, toOfficeOptions, toClientOptions, toAccountTypeOptions, toAccountOptions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAccountTransfersTemplateRefundByTransferResponse {\n");
    
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    transferAmount: ").append(toIndentedString(transferAmount)).append("\n");
    sb.append("    transferDate: ").append(toIndentedString(transferDate)).append("\n");
    sb.append("    fromOffice: ").append(toIndentedString(fromOffice)).append("\n");
    sb.append("    fromClient: ").append(toIndentedString(fromClient)).append("\n");
    sb.append("    fromAccountType: ").append(toIndentedString(fromAccountType)).append("\n");
    sb.append("    fromAccount: ").append(toIndentedString(fromAccount)).append("\n");
    sb.append("    toOffice: ").append(toIndentedString(toOffice)).append("\n");
    sb.append("    toClient: ").append(toIndentedString(toClient)).append("\n");
    sb.append("    toAccountType: ").append(toIndentedString(toAccountType)).append("\n");
    sb.append("    toAccount: ").append(toIndentedString(toAccount)).append("\n");
    sb.append("    fromOfficeOptions: ").append(toIndentedString(fromOfficeOptions)).append("\n");
    sb.append("    fromClientOptions: ").append(toIndentedString(fromClientOptions)).append("\n");
    sb.append("    fromAccountTypeOptions: ").append(toIndentedString(fromAccountTypeOptions)).append("\n");
    sb.append("    fromAccountOptions: ").append(toIndentedString(fromAccountOptions)).append("\n");
    sb.append("    toOfficeOptions: ").append(toIndentedString(toOfficeOptions)).append("\n");
    sb.append("    toClientOptions: ").append(toIndentedString(toClientOptions)).append("\n");
    sb.append("    toAccountTypeOptions: ").append(toIndentedString(toAccountTypeOptions)).append("\n");
    sb.append("    toAccountOptions: ").append(toIndentedString(toAccountOptions)).append("\n");
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
