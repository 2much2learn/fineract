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
/**
 * PostTellersTellerIdCashiersCashierIdSettleRequest
 */
@Schema(description = "PostTellersTellerIdCashiersCashierIdSettleRequest")

public class PostTellersTellerIdCashiersCashierIdSettleRequest {
  @SerializedName("currencyCode")
  private String currencyCode = null;

  @SerializedName("txnAmount")
  private BigDecimal txnAmount = null;

  @SerializedName("txnNote")
  private String txnNote = null;

  @SerializedName("locale")
  private String locale = null;

  @SerializedName("dateFormat")
  private String dateFormat = null;

  @SerializedName("txnDate")
  private OffsetDateTime txnDate = null;

  public PostTellersTellerIdCashiersCashierIdSettleRequest currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * Get currencyCode
   * @return currencyCode
  **/
  @Schema(example = "USD", description = "")
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public PostTellersTellerIdCashiersCashierIdSettleRequest txnAmount(BigDecimal txnAmount) {
    this.txnAmount = txnAmount;
    return this;
  }

   /**
   * Get txnAmount
   * @return txnAmount
  **/
  @Schema(example = "2000", description = "")
  public BigDecimal getTxnAmount() {
    return txnAmount;
  }

  public void setTxnAmount(BigDecimal txnAmount) {
    this.txnAmount = txnAmount;
  }

  public PostTellersTellerIdCashiersCashierIdSettleRequest txnNote(String txnNote) {
    this.txnNote = txnNote;
    return this;
  }

   /**
   * Get txnNote
   * @return txnNote
  **/
  @Schema(example = "cash settlement", description = "")
  public String getTxnNote() {
    return txnNote;
  }

  public void setTxnNote(String txnNote) {
    this.txnNote = txnNote;
  }

  public PostTellersTellerIdCashiersCashierIdSettleRequest locale(String locale) {
    this.locale = locale;
    return this;
  }

   /**
   * Get locale
   * @return locale
  **/
  @Schema(example = "en", description = "")
  public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }

  public PostTellersTellerIdCashiersCashierIdSettleRequest dateFormat(String dateFormat) {
    this.dateFormat = dateFormat;
    return this;
  }

   /**
   * Get dateFormat
   * @return dateFormat
  **/
  @Schema(example = "dd-MM-yyyy", description = "")
  public String getDateFormat() {
    return dateFormat;
  }

  public void setDateFormat(String dateFormat) {
    this.dateFormat = dateFormat;
  }

  public PostTellersTellerIdCashiersCashierIdSettleRequest txnDate(OffsetDateTime txnDate) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostTellersTellerIdCashiersCashierIdSettleRequest postTellersTellerIdCashiersCashierIdSettleRequest = (PostTellersTellerIdCashiersCashierIdSettleRequest) o;
    return Objects.equals(this.currencyCode, postTellersTellerIdCashiersCashierIdSettleRequest.currencyCode) &&
        Objects.equals(this.txnAmount, postTellersTellerIdCashiersCashierIdSettleRequest.txnAmount) &&
        Objects.equals(this.txnNote, postTellersTellerIdCashiersCashierIdSettleRequest.txnNote) &&
        Objects.equals(this.locale, postTellersTellerIdCashiersCashierIdSettleRequest.locale) &&
        Objects.equals(this.dateFormat, postTellersTellerIdCashiersCashierIdSettleRequest.dateFormat) &&
        Objects.equals(this.txnDate, postTellersTellerIdCashiersCashierIdSettleRequest.txnDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currencyCode, txnAmount, txnNote, locale, dateFormat, txnDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostTellersTellerIdCashiersCashierIdSettleRequest {\n");
    
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    txnAmount: ").append(toIndentedString(txnAmount)).append("\n");
    sb.append("    txnNote: ").append(toIndentedString(txnNote)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    dateFormat: ").append(toIndentedString(dateFormat)).append("\n");
    sb.append("    txnDate: ").append(toIndentedString(txnDate)).append("\n");
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
