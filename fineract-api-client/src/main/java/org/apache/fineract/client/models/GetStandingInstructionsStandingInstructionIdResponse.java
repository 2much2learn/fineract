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
import org.apache.fineract.client.models.GetFromAccountStandingInstructionSwagger;
import org.apache.fineract.client.models.GetFromAccountTypeStandingInstructionSwagger;
import org.apache.fineract.client.models.GetFromClientStandingInstructionSwagger;
import org.apache.fineract.client.models.GetFromOfficeStandingInstructionSwagger;
import org.apache.fineract.client.models.GetInstructionTypeStandingInstructionSwagger;
import org.apache.fineract.client.models.GetPriorityStandingInstructionSwagger;
import org.apache.fineract.client.models.GetRecurrenceFrequencyStandingInstructionSwagger;
import org.apache.fineract.client.models.GetRecurrenceTypeStandingInstructionSwagger;
import org.apache.fineract.client.models.GetStatusStandingInstructionSwagger;
import org.apache.fineract.client.models.GetToAccountStandingInstructionSwagger;
import org.apache.fineract.client.models.GetToAccountTypeStandingInstructionSwagger;
import org.apache.fineract.client.models.GetToClientStandingInstructionSwagger;
import org.apache.fineract.client.models.GetToOfficeStandingInstructionSwagger;
import org.apache.fineract.client.models.GetTransferTypeStandingInstructionSwagger;
/**
 * GetStandingInstructionsStandingInstructionIdResponse
 */
@Schema(description = "GetStandingInstructionsStandingInstructionIdResponse")

public class GetStandingInstructionsStandingInstructionIdResponse {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("accountDetailId")
  private Long accountDetailId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("fromOffice")
  private GetFromOfficeStandingInstructionSwagger fromOffice = null;

  @SerializedName("fromClient")
  private GetFromClientStandingInstructionSwagger fromClient = null;

  @SerializedName("fromAccountType")
  private GetFromAccountTypeStandingInstructionSwagger fromAccountType = null;

  @SerializedName("fromAccount")
  private GetFromAccountStandingInstructionSwagger fromAccount = null;

  @SerializedName("toOffice")
  private GetToOfficeStandingInstructionSwagger toOffice = null;

  @SerializedName("toClient")
  private GetToClientStandingInstructionSwagger toClient = null;

  @SerializedName("toAccountType")
  private GetToAccountTypeStandingInstructionSwagger toAccountType = null;

  @SerializedName("toAccount")
  private GetToAccountStandingInstructionSwagger toAccount = null;

  @SerializedName("transferType")
  private GetTransferTypeStandingInstructionSwagger transferType = null;

  @SerializedName("priority")
  private GetPriorityStandingInstructionSwagger priority = null;

  @SerializedName("instructionType")
  private GetInstructionTypeStandingInstructionSwagger instructionType = null;

  @SerializedName("status")
  private GetStatusStandingInstructionSwagger status = null;

  @SerializedName("amount")
  private Float amount = null;

  @SerializedName("validFrom")
  private LocalDate validFrom = null;

  @SerializedName("recurrenceType")
  private GetRecurrenceTypeStandingInstructionSwagger recurrenceType = null;

  @SerializedName("recurrenceFrequency")
  private GetRecurrenceFrequencyStandingInstructionSwagger recurrenceFrequency = null;

  @SerializedName("recurrenceInterval")
  private Integer recurrenceInterval = null;

  @SerializedName("recurrenceOnMonthDay")
  private LocalDate recurrenceOnMonthDay = null;

  public GetStandingInstructionsStandingInstructionIdResponse id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(example = "1", description = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public GetStandingInstructionsStandingInstructionIdResponse accountDetailId(Long accountDetailId) {
    this.accountDetailId = accountDetailId;
    return this;
  }

   /**
   * Get accountDetailId
   * @return accountDetailId
  **/
  @Schema(example = "6", description = "")
  public Long getAccountDetailId() {
    return accountDetailId;
  }

  public void setAccountDetailId(Long accountDetailId) {
    this.accountDetailId = accountDetailId;
  }

  public GetStandingInstructionsStandingInstructionIdResponse name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(example = "test standing", description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GetStandingInstructionsStandingInstructionIdResponse fromOffice(GetFromOfficeStandingInstructionSwagger fromOffice) {
    this.fromOffice = fromOffice;
    return this;
  }

   /**
   * Get fromOffice
   * @return fromOffice
  **/
  @Schema(description = "")
  public GetFromOfficeStandingInstructionSwagger getFromOffice() {
    return fromOffice;
  }

  public void setFromOffice(GetFromOfficeStandingInstructionSwagger fromOffice) {
    this.fromOffice = fromOffice;
  }

  public GetStandingInstructionsStandingInstructionIdResponse fromClient(GetFromClientStandingInstructionSwagger fromClient) {
    this.fromClient = fromClient;
    return this;
  }

   /**
   * Get fromClient
   * @return fromClient
  **/
  @Schema(description = "")
  public GetFromClientStandingInstructionSwagger getFromClient() {
    return fromClient;
  }

  public void setFromClient(GetFromClientStandingInstructionSwagger fromClient) {
    this.fromClient = fromClient;
  }

  public GetStandingInstructionsStandingInstructionIdResponse fromAccountType(GetFromAccountTypeStandingInstructionSwagger fromAccountType) {
    this.fromAccountType = fromAccountType;
    return this;
  }

   /**
   * Get fromAccountType
   * @return fromAccountType
  **/
  @Schema(description = "")
  public GetFromAccountTypeStandingInstructionSwagger getFromAccountType() {
    return fromAccountType;
  }

  public void setFromAccountType(GetFromAccountTypeStandingInstructionSwagger fromAccountType) {
    this.fromAccountType = fromAccountType;
  }

  public GetStandingInstructionsStandingInstructionIdResponse fromAccount(GetFromAccountStandingInstructionSwagger fromAccount) {
    this.fromAccount = fromAccount;
    return this;
  }

   /**
   * Get fromAccount
   * @return fromAccount
  **/
  @Schema(description = "")
  public GetFromAccountStandingInstructionSwagger getFromAccount() {
    return fromAccount;
  }

  public void setFromAccount(GetFromAccountStandingInstructionSwagger fromAccount) {
    this.fromAccount = fromAccount;
  }

  public GetStandingInstructionsStandingInstructionIdResponse toOffice(GetToOfficeStandingInstructionSwagger toOffice) {
    this.toOffice = toOffice;
    return this;
  }

   /**
   * Get toOffice
   * @return toOffice
  **/
  @Schema(description = "")
  public GetToOfficeStandingInstructionSwagger getToOffice() {
    return toOffice;
  }

  public void setToOffice(GetToOfficeStandingInstructionSwagger toOffice) {
    this.toOffice = toOffice;
  }

  public GetStandingInstructionsStandingInstructionIdResponse toClient(GetToClientStandingInstructionSwagger toClient) {
    this.toClient = toClient;
    return this;
  }

   /**
   * Get toClient
   * @return toClient
  **/
  @Schema(description = "")
  public GetToClientStandingInstructionSwagger getToClient() {
    return toClient;
  }

  public void setToClient(GetToClientStandingInstructionSwagger toClient) {
    this.toClient = toClient;
  }

  public GetStandingInstructionsStandingInstructionIdResponse toAccountType(GetToAccountTypeStandingInstructionSwagger toAccountType) {
    this.toAccountType = toAccountType;
    return this;
  }

   /**
   * Get toAccountType
   * @return toAccountType
  **/
  @Schema(description = "")
  public GetToAccountTypeStandingInstructionSwagger getToAccountType() {
    return toAccountType;
  }

  public void setToAccountType(GetToAccountTypeStandingInstructionSwagger toAccountType) {
    this.toAccountType = toAccountType;
  }

  public GetStandingInstructionsStandingInstructionIdResponse toAccount(GetToAccountStandingInstructionSwagger toAccount) {
    this.toAccount = toAccount;
    return this;
  }

   /**
   * Get toAccount
   * @return toAccount
  **/
  @Schema(description = "")
  public GetToAccountStandingInstructionSwagger getToAccount() {
    return toAccount;
  }

  public void setToAccount(GetToAccountStandingInstructionSwagger toAccount) {
    this.toAccount = toAccount;
  }

  public GetStandingInstructionsStandingInstructionIdResponse transferType(GetTransferTypeStandingInstructionSwagger transferType) {
    this.transferType = transferType;
    return this;
  }

   /**
   * Get transferType
   * @return transferType
  **/
  @Schema(description = "")
  public GetTransferTypeStandingInstructionSwagger getTransferType() {
    return transferType;
  }

  public void setTransferType(GetTransferTypeStandingInstructionSwagger transferType) {
    this.transferType = transferType;
  }

  public GetStandingInstructionsStandingInstructionIdResponse priority(GetPriorityStandingInstructionSwagger priority) {
    this.priority = priority;
    return this;
  }

   /**
   * Get priority
   * @return priority
  **/
  @Schema(description = "")
  public GetPriorityStandingInstructionSwagger getPriority() {
    return priority;
  }

  public void setPriority(GetPriorityStandingInstructionSwagger priority) {
    this.priority = priority;
  }

  public GetStandingInstructionsStandingInstructionIdResponse instructionType(GetInstructionTypeStandingInstructionSwagger instructionType) {
    this.instructionType = instructionType;
    return this;
  }

   /**
   * Get instructionType
   * @return instructionType
  **/
  @Schema(description = "")
  public GetInstructionTypeStandingInstructionSwagger getInstructionType() {
    return instructionType;
  }

  public void setInstructionType(GetInstructionTypeStandingInstructionSwagger instructionType) {
    this.instructionType = instructionType;
  }

  public GetStandingInstructionsStandingInstructionIdResponse status(GetStatusStandingInstructionSwagger status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public GetStatusStandingInstructionSwagger getStatus() {
    return status;
  }

  public void setStatus(GetStatusStandingInstructionSwagger status) {
    this.status = status;
  }

  public GetStandingInstructionsStandingInstructionIdResponse amount(Float amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @Schema(example = "150.0", description = "")
  public Float getAmount() {
    return amount;
  }

  public void setAmount(Float amount) {
    this.amount = amount;
  }

  public GetStandingInstructionsStandingInstructionIdResponse validFrom(LocalDate validFrom) {
    this.validFrom = validFrom;
    return this;
  }

   /**
   * Get validFrom
   * @return validFrom
  **/
  @Schema(description = "")
  public LocalDate getValidFrom() {
    return validFrom;
  }

  public void setValidFrom(LocalDate validFrom) {
    this.validFrom = validFrom;
  }

  public GetStandingInstructionsStandingInstructionIdResponse recurrenceType(GetRecurrenceTypeStandingInstructionSwagger recurrenceType) {
    this.recurrenceType = recurrenceType;
    return this;
  }

   /**
   * Get recurrenceType
   * @return recurrenceType
  **/
  @Schema(description = "")
  public GetRecurrenceTypeStandingInstructionSwagger getRecurrenceType() {
    return recurrenceType;
  }

  public void setRecurrenceType(GetRecurrenceTypeStandingInstructionSwagger recurrenceType) {
    this.recurrenceType = recurrenceType;
  }

  public GetStandingInstructionsStandingInstructionIdResponse recurrenceFrequency(GetRecurrenceFrequencyStandingInstructionSwagger recurrenceFrequency) {
    this.recurrenceFrequency = recurrenceFrequency;
    return this;
  }

   /**
   * Get recurrenceFrequency
   * @return recurrenceFrequency
  **/
  @Schema(description = "")
  public GetRecurrenceFrequencyStandingInstructionSwagger getRecurrenceFrequency() {
    return recurrenceFrequency;
  }

  public void setRecurrenceFrequency(GetRecurrenceFrequencyStandingInstructionSwagger recurrenceFrequency) {
    this.recurrenceFrequency = recurrenceFrequency;
  }

  public GetStandingInstructionsStandingInstructionIdResponse recurrenceInterval(Integer recurrenceInterval) {
    this.recurrenceInterval = recurrenceInterval;
    return this;
  }

   /**
   * Get recurrenceInterval
   * @return recurrenceInterval
  **/
  @Schema(example = "1", description = "")
  public Integer getRecurrenceInterval() {
    return recurrenceInterval;
  }

  public void setRecurrenceInterval(Integer recurrenceInterval) {
    this.recurrenceInterval = recurrenceInterval;
  }

  public GetStandingInstructionsStandingInstructionIdResponse recurrenceOnMonthDay(LocalDate recurrenceOnMonthDay) {
    this.recurrenceOnMonthDay = recurrenceOnMonthDay;
    return this;
  }

   /**
   * Get recurrenceOnMonthDay
   * @return recurrenceOnMonthDay
  **/
  @Schema(description = "")
  public LocalDate getRecurrenceOnMonthDay() {
    return recurrenceOnMonthDay;
  }

  public void setRecurrenceOnMonthDay(LocalDate recurrenceOnMonthDay) {
    this.recurrenceOnMonthDay = recurrenceOnMonthDay;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetStandingInstructionsStandingInstructionIdResponse getStandingInstructionsStandingInstructionIdResponse = (GetStandingInstructionsStandingInstructionIdResponse) o;
    return Objects.equals(this.id, getStandingInstructionsStandingInstructionIdResponse.id) &&
        Objects.equals(this.accountDetailId, getStandingInstructionsStandingInstructionIdResponse.accountDetailId) &&
        Objects.equals(this.name, getStandingInstructionsStandingInstructionIdResponse.name) &&
        Objects.equals(this.fromOffice, getStandingInstructionsStandingInstructionIdResponse.fromOffice) &&
        Objects.equals(this.fromClient, getStandingInstructionsStandingInstructionIdResponse.fromClient) &&
        Objects.equals(this.fromAccountType, getStandingInstructionsStandingInstructionIdResponse.fromAccountType) &&
        Objects.equals(this.fromAccount, getStandingInstructionsStandingInstructionIdResponse.fromAccount) &&
        Objects.equals(this.toOffice, getStandingInstructionsStandingInstructionIdResponse.toOffice) &&
        Objects.equals(this.toClient, getStandingInstructionsStandingInstructionIdResponse.toClient) &&
        Objects.equals(this.toAccountType, getStandingInstructionsStandingInstructionIdResponse.toAccountType) &&
        Objects.equals(this.toAccount, getStandingInstructionsStandingInstructionIdResponse.toAccount) &&
        Objects.equals(this.transferType, getStandingInstructionsStandingInstructionIdResponse.transferType) &&
        Objects.equals(this.priority, getStandingInstructionsStandingInstructionIdResponse.priority) &&
        Objects.equals(this.instructionType, getStandingInstructionsStandingInstructionIdResponse.instructionType) &&
        Objects.equals(this.status, getStandingInstructionsStandingInstructionIdResponse.status) &&
        Objects.equals(this.amount, getStandingInstructionsStandingInstructionIdResponse.amount) &&
        Objects.equals(this.validFrom, getStandingInstructionsStandingInstructionIdResponse.validFrom) &&
        Objects.equals(this.recurrenceType, getStandingInstructionsStandingInstructionIdResponse.recurrenceType) &&
        Objects.equals(this.recurrenceFrequency, getStandingInstructionsStandingInstructionIdResponse.recurrenceFrequency) &&
        Objects.equals(this.recurrenceInterval, getStandingInstructionsStandingInstructionIdResponse.recurrenceInterval) &&
        Objects.equals(this.recurrenceOnMonthDay, getStandingInstructionsStandingInstructionIdResponse.recurrenceOnMonthDay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, accountDetailId, name, fromOffice, fromClient, fromAccountType, fromAccount, toOffice, toClient, toAccountType, toAccount, transferType, priority, instructionType, status, amount, validFrom, recurrenceType, recurrenceFrequency, recurrenceInterval, recurrenceOnMonthDay);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetStandingInstructionsStandingInstructionIdResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    accountDetailId: ").append(toIndentedString(accountDetailId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    fromOffice: ").append(toIndentedString(fromOffice)).append("\n");
    sb.append("    fromClient: ").append(toIndentedString(fromClient)).append("\n");
    sb.append("    fromAccountType: ").append(toIndentedString(fromAccountType)).append("\n");
    sb.append("    fromAccount: ").append(toIndentedString(fromAccount)).append("\n");
    sb.append("    toOffice: ").append(toIndentedString(toOffice)).append("\n");
    sb.append("    toClient: ").append(toIndentedString(toClient)).append("\n");
    sb.append("    toAccountType: ").append(toIndentedString(toAccountType)).append("\n");
    sb.append("    toAccount: ").append(toIndentedString(toAccount)).append("\n");
    sb.append("    transferType: ").append(toIndentedString(transferType)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    instructionType: ").append(toIndentedString(instructionType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    validFrom: ").append(toIndentedString(validFrom)).append("\n");
    sb.append("    recurrenceType: ").append(toIndentedString(recurrenceType)).append("\n");
    sb.append("    recurrenceFrequency: ").append(toIndentedString(recurrenceFrequency)).append("\n");
    sb.append("    recurrenceInterval: ").append(toIndentedString(recurrenceInterval)).append("\n");
    sb.append("    recurrenceOnMonthDay: ").append(toIndentedString(recurrenceOnMonthDay)).append("\n");
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
