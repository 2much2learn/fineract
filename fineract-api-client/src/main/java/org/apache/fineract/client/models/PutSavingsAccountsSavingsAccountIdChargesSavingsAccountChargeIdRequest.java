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
 * PutSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdRequest
 */
@Schema(description = "PutSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdRequest")

public class PutSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdRequest {
  @SerializedName("dateFormat")
  private String dateFormat = null;

  @SerializedName("locale")
  private String locale = null;

  @SerializedName("amount")
  private Float amount = null;

  @SerializedName("dueDate")
  private String dueDate = null;

  public PutSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdRequest dateFormat(String dateFormat) {
    this.dateFormat = dateFormat;
    return this;
  }

   /**
   * Get dateFormat
   * @return dateFormat
  **/
  @Schema(example = "dd MMMM yyyy", description = "")
  public String getDateFormat() {
    return dateFormat;
  }

  public void setDateFormat(String dateFormat) {
    this.dateFormat = dateFormat;
  }

  public PutSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdRequest locale(String locale) {
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

  public PutSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdRequest amount(Float amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @Schema(example = "60", description = "")
  public Float getAmount() {
    return amount;
  }

  public void setAmount(Float amount) {
    this.amount = amount;
  }

  public PutSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdRequest dueDate(String dueDate) {
    this.dueDate = dueDate;
    return this;
  }

   /**
   * Get dueDate
   * @return dueDate
  **/
  @Schema(example = "27 March 2013", description = "")
  public String getDueDate() {
    return dueDate;
  }

  public void setDueDate(String dueDate) {
    this.dueDate = dueDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PutSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdRequest putSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdRequest = (PutSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdRequest) o;
    return Objects.equals(this.dateFormat, putSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdRequest.dateFormat) &&
        Objects.equals(this.locale, putSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdRequest.locale) &&
        Objects.equals(this.amount, putSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdRequest.amount) &&
        Objects.equals(this.dueDate, putSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdRequest.dueDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateFormat, locale, amount, dueDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PutSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdRequest {\n");
    
    sb.append("    dateFormat: ").append(toIndentedString(dateFormat)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
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
