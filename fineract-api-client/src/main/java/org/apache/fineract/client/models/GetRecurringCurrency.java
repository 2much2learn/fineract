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
 * GetRecurringCurrency
 */


public class GetRecurringCurrency {
  @SerializedName("code")
  private String code = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("decimalPlaces")
  private Integer decimalPlaces = null;

  @SerializedName("inMultiplesOf")
  private Integer inMultiplesOf = null;

  @SerializedName("displaySymbol")
  private String displaySymbol = null;

  @SerializedName("nameCode")
  private String nameCode = null;

  @SerializedName("displayLabel")
  private String displayLabel = null;

  public GetRecurringCurrency code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @Schema(example = "USD", description = "")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public GetRecurringCurrency name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(example = "US Dollar", description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GetRecurringCurrency decimalPlaces(Integer decimalPlaces) {
    this.decimalPlaces = decimalPlaces;
    return this;
  }

   /**
   * Get decimalPlaces
   * @return decimalPlaces
  **/
  @Schema(example = "4", description = "")
  public Integer getDecimalPlaces() {
    return decimalPlaces;
  }

  public void setDecimalPlaces(Integer decimalPlaces) {
    this.decimalPlaces = decimalPlaces;
  }

  public GetRecurringCurrency inMultiplesOf(Integer inMultiplesOf) {
    this.inMultiplesOf = inMultiplesOf;
    return this;
  }

   /**
   * Get inMultiplesOf
   * @return inMultiplesOf
  **/
  @Schema(example = "100", description = "")
  public Integer getInMultiplesOf() {
    return inMultiplesOf;
  }

  public void setInMultiplesOf(Integer inMultiplesOf) {
    this.inMultiplesOf = inMultiplesOf;
  }

  public GetRecurringCurrency displaySymbol(String displaySymbol) {
    this.displaySymbol = displaySymbol;
    return this;
  }

   /**
   * Get displaySymbol
   * @return displaySymbol
  **/
  @Schema(example = "$", description = "")
  public String getDisplaySymbol() {
    return displaySymbol;
  }

  public void setDisplaySymbol(String displaySymbol) {
    this.displaySymbol = displaySymbol;
  }

  public GetRecurringCurrency nameCode(String nameCode) {
    this.nameCode = nameCode;
    return this;
  }

   /**
   * Get nameCode
   * @return nameCode
  **/
  @Schema(example = "currency.USD", description = "")
  public String getNameCode() {
    return nameCode;
  }

  public void setNameCode(String nameCode) {
    this.nameCode = nameCode;
  }

  public GetRecurringCurrency displayLabel(String displayLabel) {
    this.displayLabel = displayLabel;
    return this;
  }

   /**
   * Get displayLabel
   * @return displayLabel
  **/
  @Schema(example = "US Dollar ($)", description = "")
  public String getDisplayLabel() {
    return displayLabel;
  }

  public void setDisplayLabel(String displayLabel) {
    this.displayLabel = displayLabel;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetRecurringCurrency getRecurringCurrency = (GetRecurringCurrency) o;
    return Objects.equals(this.code, getRecurringCurrency.code) &&
        Objects.equals(this.name, getRecurringCurrency.name) &&
        Objects.equals(this.decimalPlaces, getRecurringCurrency.decimalPlaces) &&
        Objects.equals(this.inMultiplesOf, getRecurringCurrency.inMultiplesOf) &&
        Objects.equals(this.displaySymbol, getRecurringCurrency.displaySymbol) &&
        Objects.equals(this.nameCode, getRecurringCurrency.nameCode) &&
        Objects.equals(this.displayLabel, getRecurringCurrency.displayLabel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, name, decimalPlaces, inMultiplesOf, displaySymbol, nameCode, displayLabel);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetRecurringCurrency {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    decimalPlaces: ").append(toIndentedString(decimalPlaces)).append("\n");
    sb.append("    inMultiplesOf: ").append(toIndentedString(inMultiplesOf)).append("\n");
    sb.append("    displaySymbol: ").append(toIndentedString(displaySymbol)).append("\n");
    sb.append("    nameCode: ").append(toIndentedString(nameCode)).append("\n");
    sb.append("    displayLabel: ").append(toIndentedString(displayLabel)).append("\n");
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
