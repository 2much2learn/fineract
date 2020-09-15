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
import org.apache.fineract.client.models.PageCashierTransactionData;
/**
 * GetTellersTellerIdCashiersCashiersIdSummaryAndTransactionsResponse
 */
@Schema(description = "GetTellersTellerIdCashiersCashiersIdSummaryAndTransactionsResponse")

public class GetTellersTellerIdCashiersCashiersIdSummaryAndTransactionsResponse {
  @SerializedName("sumCashAllocation")
  private BigDecimal sumCashAllocation = null;

  @SerializedName("sumInwardCash")
  private BigDecimal sumInwardCash = null;

  @SerializedName("sumOutwardCash")
  private BigDecimal sumOutwardCash = null;

  @SerializedName("sumCashSettlement")
  private BigDecimal sumCashSettlement = null;

  @SerializedName("netCash")
  private BigDecimal netCash = null;

  @SerializedName("officeName")
  private String officeName = null;

  @SerializedName("tellerId")
  private Long tellerId = null;

  @SerializedName("tellerName")
  private String tellerName = null;

  @SerializedName("cashierId")
  private Long cashierId = null;

  @SerializedName("cashierName")
  private String cashierName = null;

  @SerializedName("cashierTransactions")
  private PageCashierTransactionData cashierTransactions = null;

  public GetTellersTellerIdCashiersCashiersIdSummaryAndTransactionsResponse sumCashAllocation(BigDecimal sumCashAllocation) {
    this.sumCashAllocation = sumCashAllocation;
    return this;
  }

   /**
   * Get sumCashAllocation
   * @return sumCashAllocation
  **/
  @Schema(example = "7000.0", description = "")
  public BigDecimal getSumCashAllocation() {
    return sumCashAllocation;
  }

  public void setSumCashAllocation(BigDecimal sumCashAllocation) {
    this.sumCashAllocation = sumCashAllocation;
  }

  public GetTellersTellerIdCashiersCashiersIdSummaryAndTransactionsResponse sumInwardCash(BigDecimal sumInwardCash) {
    this.sumInwardCash = sumInwardCash;
    return this;
  }

   /**
   * Get sumInwardCash
   * @return sumInwardCash
  **/
  @Schema(example = "0", description = "")
  public BigDecimal getSumInwardCash() {
    return sumInwardCash;
  }

  public void setSumInwardCash(BigDecimal sumInwardCash) {
    this.sumInwardCash = sumInwardCash;
  }

  public GetTellersTellerIdCashiersCashiersIdSummaryAndTransactionsResponse sumOutwardCash(BigDecimal sumOutwardCash) {
    this.sumOutwardCash = sumOutwardCash;
    return this;
  }

   /**
   * Get sumOutwardCash
   * @return sumOutwardCash
  **/
  @Schema(example = "0", description = "")
  public BigDecimal getSumOutwardCash() {
    return sumOutwardCash;
  }

  public void setSumOutwardCash(BigDecimal sumOutwardCash) {
    this.sumOutwardCash = sumOutwardCash;
  }

  public GetTellersTellerIdCashiersCashiersIdSummaryAndTransactionsResponse sumCashSettlement(BigDecimal sumCashSettlement) {
    this.sumCashSettlement = sumCashSettlement;
    return this;
  }

   /**
   * Get sumCashSettlement
   * @return sumCashSettlement
  **/
  @Schema(example = "50.0", description = "")
  public BigDecimal getSumCashSettlement() {
    return sumCashSettlement;
  }

  public void setSumCashSettlement(BigDecimal sumCashSettlement) {
    this.sumCashSettlement = sumCashSettlement;
  }

  public GetTellersTellerIdCashiersCashiersIdSummaryAndTransactionsResponse netCash(BigDecimal netCash) {
    this.netCash = netCash;
    return this;
  }

   /**
   * Get netCash
   * @return netCash
  **/
  @Schema(example = "6950.0", description = "")
  public BigDecimal getNetCash() {
    return netCash;
  }

  public void setNetCash(BigDecimal netCash) {
    this.netCash = netCash;
  }

  public GetTellersTellerIdCashiersCashiersIdSummaryAndTransactionsResponse officeName(String officeName) {
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

  public GetTellersTellerIdCashiersCashiersIdSummaryAndTransactionsResponse tellerId(Long tellerId) {
    this.tellerId = tellerId;
    return this;
  }

   /**
   * Get tellerId
   * @return tellerId
  **/
  @Schema(example = "1", description = "")
  public Long getTellerId() {
    return tellerId;
  }

  public void setTellerId(Long tellerId) {
    this.tellerId = tellerId;
  }

  public GetTellersTellerIdCashiersCashiersIdSummaryAndTransactionsResponse tellerName(String tellerName) {
    this.tellerName = tellerName;
    return this;
  }

   /**
   * Get tellerName
   * @return tellerName
  **/
  @Schema(example = "Teller1", description = "")
  public String getTellerName() {
    return tellerName;
  }

  public void setTellerName(String tellerName) {
    this.tellerName = tellerName;
  }

  public GetTellersTellerIdCashiersCashiersIdSummaryAndTransactionsResponse cashierId(Long cashierId) {
    this.cashierId = cashierId;
    return this;
  }

   /**
   * Get cashierId
   * @return cashierId
  **/
  @Schema(example = "1", description = "")
  public Long getCashierId() {
    return cashierId;
  }

  public void setCashierId(Long cashierId) {
    this.cashierId = cashierId;
  }

  public GetTellersTellerIdCashiersCashiersIdSummaryAndTransactionsResponse cashierName(String cashierName) {
    this.cashierName = cashierName;
    return this;
  }

   /**
   * Get cashierName
   * @return cashierName
  **/
  @Schema(example = "Staff1, Test", description = "")
  public String getCashierName() {
    return cashierName;
  }

  public void setCashierName(String cashierName) {
    this.cashierName = cashierName;
  }

  public GetTellersTellerIdCashiersCashiersIdSummaryAndTransactionsResponse cashierTransactions(PageCashierTransactionData cashierTransactions) {
    this.cashierTransactions = cashierTransactions;
    return this;
  }

   /**
   * Get cashierTransactions
   * @return cashierTransactions
  **/
  @Schema(description = "")
  public PageCashierTransactionData getCashierTransactions() {
    return cashierTransactions;
  }

  public void setCashierTransactions(PageCashierTransactionData cashierTransactions) {
    this.cashierTransactions = cashierTransactions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTellersTellerIdCashiersCashiersIdSummaryAndTransactionsResponse getTellersTellerIdCashiersCashiersIdSummaryAndTransactionsResponse = (GetTellersTellerIdCashiersCashiersIdSummaryAndTransactionsResponse) o;
    return Objects.equals(this.sumCashAllocation, getTellersTellerIdCashiersCashiersIdSummaryAndTransactionsResponse.sumCashAllocation) &&
        Objects.equals(this.sumInwardCash, getTellersTellerIdCashiersCashiersIdSummaryAndTransactionsResponse.sumInwardCash) &&
        Objects.equals(this.sumOutwardCash, getTellersTellerIdCashiersCashiersIdSummaryAndTransactionsResponse.sumOutwardCash) &&
        Objects.equals(this.sumCashSettlement, getTellersTellerIdCashiersCashiersIdSummaryAndTransactionsResponse.sumCashSettlement) &&
        Objects.equals(this.netCash, getTellersTellerIdCashiersCashiersIdSummaryAndTransactionsResponse.netCash) &&
        Objects.equals(this.officeName, getTellersTellerIdCashiersCashiersIdSummaryAndTransactionsResponse.officeName) &&
        Objects.equals(this.tellerId, getTellersTellerIdCashiersCashiersIdSummaryAndTransactionsResponse.tellerId) &&
        Objects.equals(this.tellerName, getTellersTellerIdCashiersCashiersIdSummaryAndTransactionsResponse.tellerName) &&
        Objects.equals(this.cashierId, getTellersTellerIdCashiersCashiersIdSummaryAndTransactionsResponse.cashierId) &&
        Objects.equals(this.cashierName, getTellersTellerIdCashiersCashiersIdSummaryAndTransactionsResponse.cashierName) &&
        Objects.equals(this.cashierTransactions, getTellersTellerIdCashiersCashiersIdSummaryAndTransactionsResponse.cashierTransactions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sumCashAllocation, sumInwardCash, sumOutwardCash, sumCashSettlement, netCash, officeName, tellerId, tellerName, cashierId, cashierName, cashierTransactions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTellersTellerIdCashiersCashiersIdSummaryAndTransactionsResponse {\n");
    
    sb.append("    sumCashAllocation: ").append(toIndentedString(sumCashAllocation)).append("\n");
    sb.append("    sumInwardCash: ").append(toIndentedString(sumInwardCash)).append("\n");
    sb.append("    sumOutwardCash: ").append(toIndentedString(sumOutwardCash)).append("\n");
    sb.append("    sumCashSettlement: ").append(toIndentedString(sumCashSettlement)).append("\n");
    sb.append("    netCash: ").append(toIndentedString(netCash)).append("\n");
    sb.append("    officeName: ").append(toIndentedString(officeName)).append("\n");
    sb.append("    tellerId: ").append(toIndentedString(tellerId)).append("\n");
    sb.append("    tellerName: ").append(toIndentedString(tellerName)).append("\n");
    sb.append("    cashierId: ").append(toIndentedString(cashierId)).append("\n");
    sb.append("    cashierName: ").append(toIndentedString(cashierName)).append("\n");
    sb.append("    cashierTransactions: ").append(toIndentedString(cashierTransactions)).append("\n");
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
