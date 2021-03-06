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
import org.apache.fineract.client.models.GetRecurringDepositAccountsCurrency;
/**
 * GetRecurringDepositAccountsSummary
 */


public class GetRecurringDepositAccountsSummary {
  @SerializedName("currency")
  private GetRecurringDepositAccountsCurrency currency = null;

  @SerializedName("accountBalance")
  private Float accountBalance = null;

  public GetRecurringDepositAccountsSummary currency(GetRecurringDepositAccountsCurrency currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @Schema(description = "")
  public GetRecurringDepositAccountsCurrency getCurrency() {
    return currency;
  }

  public void setCurrency(GetRecurringDepositAccountsCurrency currency) {
    this.currency = currency;
  }

  public GetRecurringDepositAccountsSummary accountBalance(Float accountBalance) {
    this.accountBalance = accountBalance;
    return this;
  }

   /**
   * Get accountBalance
   * @return accountBalance
  **/
  @Schema(example = "0", description = "")
  public Float getAccountBalance() {
    return accountBalance;
  }

  public void setAccountBalance(Float accountBalance) {
    this.accountBalance = accountBalance;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetRecurringDepositAccountsSummary getRecurringDepositAccountsSummary = (GetRecurringDepositAccountsSummary) o;
    return Objects.equals(this.currency, getRecurringDepositAccountsSummary.currency) &&
        Objects.equals(this.accountBalance, getRecurringDepositAccountsSummary.accountBalance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currency, accountBalance);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetRecurringDepositAccountsSummary {\n");
    
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    accountBalance: ").append(toIndentedString(accountBalance)).append("\n");
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
