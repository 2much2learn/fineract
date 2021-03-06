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
import org.apache.fineract.client.models.GetChargesAppliesTo;
import org.apache.fineract.client.models.GetChargesChargeCalculationType;
import org.apache.fineract.client.models.GetChargesCurrencyResponse;
import org.apache.fineract.client.models.GetSavingsChargesChargeTimeType;
/**
 * GetSavingsChargesOptions
 */


public class GetSavingsChargesOptions {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("active")
  private Boolean active = null;

  @SerializedName("penalty")
  private Boolean penalty = null;

  @SerializedName("currency")
  private GetChargesCurrencyResponse currency = null;

  @SerializedName("amount")
  private Float amount = null;

  @SerializedName("chargeTimeType")
  private GetSavingsChargesChargeTimeType chargeTimeType = null;

  @SerializedName("chargesAppliesTo")
  private GetChargesAppliesTo chargesAppliesTo = null;

  @SerializedName("chargeCalculationType")
  private GetChargesChargeCalculationType chargeCalculationType = null;

  public GetSavingsChargesOptions id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(example = "2", description = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public GetSavingsChargesOptions name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(example = "Passbook Fee", description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GetSavingsChargesOptions active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @Schema(example = "true", description = "")
  public Boolean isActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public GetSavingsChargesOptions penalty(Boolean penalty) {
    this.penalty = penalty;
    return this;
  }

   /**
   * Get penalty
   * @return penalty
  **/
  @Schema(example = "false", description = "")
  public Boolean isPenalty() {
    return penalty;
  }

  public void setPenalty(Boolean penalty) {
    this.penalty = penalty;
  }

  public GetSavingsChargesOptions currency(GetChargesCurrencyResponse currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @Schema(description = "")
  public GetChargesCurrencyResponse getCurrency() {
    return currency;
  }

  public void setCurrency(GetChargesCurrencyResponse currency) {
    this.currency = currency;
  }

  public GetSavingsChargesOptions amount(Float amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @Schema(example = "100", description = "")
  public Float getAmount() {
    return amount;
  }

  public void setAmount(Float amount) {
    this.amount = amount;
  }

  public GetSavingsChargesOptions chargeTimeType(GetSavingsChargesChargeTimeType chargeTimeType) {
    this.chargeTimeType = chargeTimeType;
    return this;
  }

   /**
   * Get chargeTimeType
   * @return chargeTimeType
  **/
  @Schema(description = "")
  public GetSavingsChargesChargeTimeType getChargeTimeType() {
    return chargeTimeType;
  }

  public void setChargeTimeType(GetSavingsChargesChargeTimeType chargeTimeType) {
    this.chargeTimeType = chargeTimeType;
  }

  public GetSavingsChargesOptions chargesAppliesTo(GetChargesAppliesTo chargesAppliesTo) {
    this.chargesAppliesTo = chargesAppliesTo;
    return this;
  }

   /**
   * Get chargesAppliesTo
   * @return chargesAppliesTo
  **/
  @Schema(description = "")
  public GetChargesAppliesTo getChargesAppliesTo() {
    return chargesAppliesTo;
  }

  public void setChargesAppliesTo(GetChargesAppliesTo chargesAppliesTo) {
    this.chargesAppliesTo = chargesAppliesTo;
  }

  public GetSavingsChargesOptions chargeCalculationType(GetChargesChargeCalculationType chargeCalculationType) {
    this.chargeCalculationType = chargeCalculationType;
    return this;
  }

   /**
   * Get chargeCalculationType
   * @return chargeCalculationType
  **/
  @Schema(description = "")
  public GetChargesChargeCalculationType getChargeCalculationType() {
    return chargeCalculationType;
  }

  public void setChargeCalculationType(GetChargesChargeCalculationType chargeCalculationType) {
    this.chargeCalculationType = chargeCalculationType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetSavingsChargesOptions getSavingsChargesOptions = (GetSavingsChargesOptions) o;
    return Objects.equals(this.id, getSavingsChargesOptions.id) &&
        Objects.equals(this.name, getSavingsChargesOptions.name) &&
        Objects.equals(this.active, getSavingsChargesOptions.active) &&
        Objects.equals(this.penalty, getSavingsChargesOptions.penalty) &&
        Objects.equals(this.currency, getSavingsChargesOptions.currency) &&
        Objects.equals(this.amount, getSavingsChargesOptions.amount) &&
        Objects.equals(this.chargeTimeType, getSavingsChargesOptions.chargeTimeType) &&
        Objects.equals(this.chargesAppliesTo, getSavingsChargesOptions.chargesAppliesTo) &&
        Objects.equals(this.chargeCalculationType, getSavingsChargesOptions.chargeCalculationType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, active, penalty, currency, amount, chargeTimeType, chargesAppliesTo, chargeCalculationType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetSavingsChargesOptions {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    penalty: ").append(toIndentedString(penalty)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    chargeTimeType: ").append(toIndentedString(chargeTimeType)).append("\n");
    sb.append("    chargesAppliesTo: ").append(toIndentedString(chargesAppliesTo)).append("\n");
    sb.append("    chargeCalculationType: ").append(toIndentedString(chargeCalculationType)).append("\n");
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
