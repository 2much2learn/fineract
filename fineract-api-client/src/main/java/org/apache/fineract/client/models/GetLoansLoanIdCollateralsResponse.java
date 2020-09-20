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
import org.apache.fineract.client.models.GetCollateralCurrencyResponse;
import org.apache.fineract.client.models.GetCollateralTypeResponse;
/**
 * GetLoansLoanIdCollateralsResponse
 */
@Schema(description = "GetLoansLoanIdCollateralsResponse")

public class GetLoansLoanIdCollateralsResponse {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("type")
  private GetCollateralTypeResponse type = null;

  @SerializedName("value")
  private Long value = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("currency")
  private GetCollateralCurrencyResponse currency = null;

  public GetLoansLoanIdCollateralsResponse id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(example = "12", description = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public GetLoansLoanIdCollateralsResponse type(GetCollateralTypeResponse type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public GetCollateralTypeResponse getType() {
    return type;
  }

  public void setType(GetCollateralTypeResponse type) {
    this.type = type;
  }

  public GetLoansLoanIdCollateralsResponse value(Long value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @Schema(example = "50000", description = "")
  public Long getValue() {
    return value;
  }

  public void setValue(Long value) {
    this.value = value;
  }

  public GetLoansLoanIdCollateralsResponse description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(example = "24 Carat Gold chain weighing 12 grams", description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public GetLoansLoanIdCollateralsResponse currency(GetCollateralCurrencyResponse currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @Schema(description = "")
  public GetCollateralCurrencyResponse getCurrency() {
    return currency;
  }

  public void setCurrency(GetCollateralCurrencyResponse currency) {
    this.currency = currency;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetLoansLoanIdCollateralsResponse getLoansLoanIdCollateralsResponse = (GetLoansLoanIdCollateralsResponse) o;
    return Objects.equals(this.id, getLoansLoanIdCollateralsResponse.id) &&
        Objects.equals(this.type, getLoansLoanIdCollateralsResponse.type) &&
        Objects.equals(this.value, getLoansLoanIdCollateralsResponse.value) &&
        Objects.equals(this.description, getLoansLoanIdCollateralsResponse.description) &&
        Objects.equals(this.currency, getLoansLoanIdCollateralsResponse.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, value, description, currency);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetLoansLoanIdCollateralsResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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