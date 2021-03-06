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
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import org.apache.fineract.client.models.CashierTxnType;
/**
 * GetTellersTellerIdCashiersCashiersIdTransactionsResponse
 */
@Schema(description = "GetTellersTellerIdCashiersCashiersIdTransactionsResponse")

public class GetTellersTellerIdCashiersCashiersIdTransactionsResponse {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("cashierId")
  private Long cashierId = null;

  @SerializedName("txnType")
  private CashierTxnType txnType = null;

  @SerializedName("txnAmount")
  private BigDecimal txnAmount = null;

  @SerializedName("txnDate")
  private OffsetDateTime txnDate = null;

  @SerializedName("entityId")
  private Long entityId = null;

  @SerializedName("entityType")
  private String entityType = null;

  @SerializedName("txnNote")
  private String txnNote = null;

  @SerializedName("createdDate")
  private OffsetDateTime createdDate = null;

  @SerializedName("officeId")
  private Long officeId = null;

  @SerializedName("officeName")
  private String officeName = null;

  @SerializedName("tellerId")
  private Long tellerId = null;

  @SerializedName("cashierName")
  private String cashierName = null;

  public GetTellersTellerIdCashiersCashiersIdTransactionsResponse id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(example = "8", description = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public GetTellersTellerIdCashiersCashiersIdTransactionsResponse cashierId(Long cashierId) {
    this.cashierId = cashierId;
    return this;
  }

   /**
   * Get cashierId
   * @return cashierId
  **/
  @Schema(example = "15", description = "")
  public Long getCashierId() {
    return cashierId;
  }

  public void setCashierId(Long cashierId) {
    this.cashierId = cashierId;
  }

  public GetTellersTellerIdCashiersCashiersIdTransactionsResponse txnType(CashierTxnType txnType) {
    this.txnType = txnType;
    return this;
  }

   /**
   * Get txnType
   * @return txnType
  **/
  @Schema(description = "")
  public CashierTxnType getTxnType() {
    return txnType;
  }

  public void setTxnType(CashierTxnType txnType) {
    this.txnType = txnType;
  }

  public GetTellersTellerIdCashiersCashiersIdTransactionsResponse txnAmount(BigDecimal txnAmount) {
    this.txnAmount = txnAmount;
    return this;
  }

   /**
   * Get txnAmount
   * @return txnAmount
  **/
  @Schema(example = "1000", description = "")
  public BigDecimal getTxnAmount() {
    return txnAmount;
  }

  public void setTxnAmount(BigDecimal txnAmount) {
    this.txnAmount = txnAmount;
  }

  public GetTellersTellerIdCashiersCashiersIdTransactionsResponse txnDate(OffsetDateTime txnDate) {
    this.txnDate = txnDate;
    return this;
  }

   /**
   * Get txnDate
   * @return txnDate
  **/
  @Schema(description = "")
  public OffsetDateTime getTxnDate() {
    return txnDate;
  }

  public void setTxnDate(OffsetDateTime txnDate) {
    this.txnDate = txnDate;
  }

  public GetTellersTellerIdCashiersCashiersIdTransactionsResponse entityId(Long entityId) {
    this.entityId = entityId;
    return this;
  }

   /**
   * Get entityId
   * @return entityId
  **/
  @Schema(example = "2", description = "")
  public Long getEntityId() {
    return entityId;
  }

  public void setEntityId(Long entityId) {
    this.entityId = entityId;
  }

  public GetTellersTellerIdCashiersCashiersIdTransactionsResponse entityType(String entityType) {
    this.entityType = entityType;
    return this;
  }

   /**
   * Get entityType
   * @return entityType
  **/
  @Schema(example = "loans", description = "")
  public String getEntityType() {
    return entityType;
  }

  public void setEntityType(String entityType) {
    this.entityType = entityType;
  }

  public GetTellersTellerIdCashiersCashiersIdTransactionsResponse txnNote(String txnNote) {
    this.txnNote = txnNote;
    return this;
  }

   /**
   * Get txnNote
   * @return txnNote
  **/
  @Schema(example = "Disbursement, Loan:2-000000002,Client:1-Test 1", description = "")
  public String getTxnNote() {
    return txnNote;
  }

  public void setTxnNote(String txnNote) {
    this.txnNote = txnNote;
  }

  public GetTellersTellerIdCashiersCashiersIdTransactionsResponse createdDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
    return this;
  }

   /**
   * Get createdDate
   * @return createdDate
  **/
  @Schema(description = "")
  public OffsetDateTime getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
  }

  public GetTellersTellerIdCashiersCashiersIdTransactionsResponse officeId(Long officeId) {
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

  public GetTellersTellerIdCashiersCashiersIdTransactionsResponse officeName(String officeName) {
    this.officeName = officeName;
    return this;
  }

   /**
   * Get officeName
   * @return officeName
  **/
  @Schema(example = "Head Office", description = "")
  public String getOfficeName() {
    return officeName;
  }

  public void setOfficeName(String officeName) {
    this.officeName = officeName;
  }

  public GetTellersTellerIdCashiersCashiersIdTransactionsResponse tellerId(Long tellerId) {
    this.tellerId = tellerId;
    return this;
  }

   /**
   * Get tellerId
   * @return tellerId
  **/
  @Schema(example = "0", description = "")
  public Long getTellerId() {
    return tellerId;
  }

  public void setTellerId(Long tellerId) {
    this.tellerId = tellerId;
  }

  public GetTellersTellerIdCashiersCashiersIdTransactionsResponse cashierName(String cashierName) {
    this.cashierName = cashierName;
    return this;
  }

   /**
   * Get cashierName
   * @return cashierName
  **/
  @Schema(example = "B, Ramesh", description = "")
  public String getCashierName() {
    return cashierName;
  }

  public void setCashierName(String cashierName) {
    this.cashierName = cashierName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTellersTellerIdCashiersCashiersIdTransactionsResponse getTellersTellerIdCashiersCashiersIdTransactionsResponse = (GetTellersTellerIdCashiersCashiersIdTransactionsResponse) o;
    return Objects.equals(this.id, getTellersTellerIdCashiersCashiersIdTransactionsResponse.id) &&
        Objects.equals(this.cashierId, getTellersTellerIdCashiersCashiersIdTransactionsResponse.cashierId) &&
        Objects.equals(this.txnType, getTellersTellerIdCashiersCashiersIdTransactionsResponse.txnType) &&
        Objects.equals(this.txnAmount, getTellersTellerIdCashiersCashiersIdTransactionsResponse.txnAmount) &&
        Objects.equals(this.txnDate, getTellersTellerIdCashiersCashiersIdTransactionsResponse.txnDate) &&
        Objects.equals(this.entityId, getTellersTellerIdCashiersCashiersIdTransactionsResponse.entityId) &&
        Objects.equals(this.entityType, getTellersTellerIdCashiersCashiersIdTransactionsResponse.entityType) &&
        Objects.equals(this.txnNote, getTellersTellerIdCashiersCashiersIdTransactionsResponse.txnNote) &&
        Objects.equals(this.createdDate, getTellersTellerIdCashiersCashiersIdTransactionsResponse.createdDate) &&
        Objects.equals(this.officeId, getTellersTellerIdCashiersCashiersIdTransactionsResponse.officeId) &&
        Objects.equals(this.officeName, getTellersTellerIdCashiersCashiersIdTransactionsResponse.officeName) &&
        Objects.equals(this.tellerId, getTellersTellerIdCashiersCashiersIdTransactionsResponse.tellerId) &&
        Objects.equals(this.cashierName, getTellersTellerIdCashiersCashiersIdTransactionsResponse.cashierName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, cashierId, txnType, txnAmount, txnDate, entityId, entityType, txnNote, createdDate, officeId, officeName, tellerId, cashierName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTellersTellerIdCashiersCashiersIdTransactionsResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    cashierId: ").append(toIndentedString(cashierId)).append("\n");
    sb.append("    txnType: ").append(toIndentedString(txnType)).append("\n");
    sb.append("    txnAmount: ").append(toIndentedString(txnAmount)).append("\n");
    sb.append("    txnDate: ").append(toIndentedString(txnDate)).append("\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    txnNote: ").append(toIndentedString(txnNote)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    officeId: ").append(toIndentedString(officeId)).append("\n");
    sb.append("    officeName: ").append(toIndentedString(officeName)).append("\n");
    sb.append("    tellerId: ").append(toIndentedString(tellerId)).append("\n");
    sb.append("    cashierName: ").append(toIndentedString(cashierName)).append("\n");
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
