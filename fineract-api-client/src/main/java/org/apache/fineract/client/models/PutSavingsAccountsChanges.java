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
 * PutSavingsAccountsChanges
 */


public class PutSavingsAccountsChanges {
  @SerializedName("nominalAnnualInterestRate")
  private Double nominalAnnualInterestRate = null;

  @SerializedName("locale")
  private String locale = null;

  public PutSavingsAccountsChanges nominalAnnualInterestRate(Double nominalAnnualInterestRate) {
    this.nominalAnnualInterestRate = nominalAnnualInterestRate;
    return this;
  }

   /**
   * Get nominalAnnualInterestRate
   * @return nominalAnnualInterestRate
  **/
  @Schema(example = "5.9999999999", description = "")
  public Double getNominalAnnualInterestRate() {
    return nominalAnnualInterestRate;
  }

  public void setNominalAnnualInterestRate(Double nominalAnnualInterestRate) {
    this.nominalAnnualInterestRate = nominalAnnualInterestRate;
  }

  public PutSavingsAccountsChanges locale(String locale) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PutSavingsAccountsChanges putSavingsAccountsChanges = (PutSavingsAccountsChanges) o;
    return Objects.equals(this.nominalAnnualInterestRate, putSavingsAccountsChanges.nominalAnnualInterestRate) &&
        Objects.equals(this.locale, putSavingsAccountsChanges.locale);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nominalAnnualInterestRate, locale);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PutSavingsAccountsChanges {\n");
    
    sb.append("    nominalAnnualInterestRate: ").append(toIndentedString(nominalAnnualInterestRate)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
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