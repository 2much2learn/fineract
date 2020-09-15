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
import java.util.ArrayList;
import java.util.List;
import org.apache.fineract.client.models.GetSavingsChargesOptions;
/**
 * GetSavingsAccountsSavingsAccountIdChargesTemplateResponse
 */
@Schema(description = "GetSavingsAccountsSavingsAccountIdChargesTemplateResponse")

public class GetSavingsAccountsSavingsAccountIdChargesTemplateResponse {
  @SerializedName("amountPaid")
  private Float amountPaid = null;

  @SerializedName("amountWaived")
  private Float amountWaived = null;

  @SerializedName("amountWrittenOff")
  private Float amountWrittenOff = null;

  @SerializedName("chargeOptions")
  private List<GetSavingsChargesOptions> chargeOptions = null;

  @SerializedName("penalty")
  private Boolean penalty = null;

  public GetSavingsAccountsSavingsAccountIdChargesTemplateResponse amountPaid(Float amountPaid) {
    this.amountPaid = amountPaid;
    return this;
  }

   /**
   * Get amountPaid
   * @return amountPaid
  **/
  @Schema(example = "0", description = "")
  public Float getAmountPaid() {
    return amountPaid;
  }

  public void setAmountPaid(Float amountPaid) {
    this.amountPaid = amountPaid;
  }

  public GetSavingsAccountsSavingsAccountIdChargesTemplateResponse amountWaived(Float amountWaived) {
    this.amountWaived = amountWaived;
    return this;
  }

   /**
   * Get amountWaived
   * @return amountWaived
  **/
  @Schema(example = "0", description = "")
  public Float getAmountWaived() {
    return amountWaived;
  }

  public void setAmountWaived(Float amountWaived) {
    this.amountWaived = amountWaived;
  }

  public GetSavingsAccountsSavingsAccountIdChargesTemplateResponse amountWrittenOff(Float amountWrittenOff) {
    this.amountWrittenOff = amountWrittenOff;
    return this;
  }

   /**
   * Get amountWrittenOff
   * @return amountWrittenOff
  **/
  @Schema(example = "0", description = "")
  public Float getAmountWrittenOff() {
    return amountWrittenOff;
  }

  public void setAmountWrittenOff(Float amountWrittenOff) {
    this.amountWrittenOff = amountWrittenOff;
  }

  public GetSavingsAccountsSavingsAccountIdChargesTemplateResponse chargeOptions(List<GetSavingsChargesOptions> chargeOptions) {
    this.chargeOptions = chargeOptions;
    return this;
  }

  public GetSavingsAccountsSavingsAccountIdChargesTemplateResponse addChargeOptionsItem(GetSavingsChargesOptions chargeOptionsItem) {
    if (this.chargeOptions == null) {
      this.chargeOptions = new ArrayList<>();
    }
    this.chargeOptions.add(chargeOptionsItem);
    return this;
  }

   /**
   * Get chargeOptions
   * @return chargeOptions
  **/
  @Schema(description = "")
  public List<GetSavingsChargesOptions> getChargeOptions() {
    return chargeOptions;
  }

  public void setChargeOptions(List<GetSavingsChargesOptions> chargeOptions) {
    this.chargeOptions = chargeOptions;
  }

  public GetSavingsAccountsSavingsAccountIdChargesTemplateResponse penalty(Boolean penalty) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetSavingsAccountsSavingsAccountIdChargesTemplateResponse getSavingsAccountsSavingsAccountIdChargesTemplateResponse = (GetSavingsAccountsSavingsAccountIdChargesTemplateResponse) o;
    return Objects.equals(this.amountPaid, getSavingsAccountsSavingsAccountIdChargesTemplateResponse.amountPaid) &&
        Objects.equals(this.amountWaived, getSavingsAccountsSavingsAccountIdChargesTemplateResponse.amountWaived) &&
        Objects.equals(this.amountWrittenOff, getSavingsAccountsSavingsAccountIdChargesTemplateResponse.amountWrittenOff) &&
        Objects.equals(this.chargeOptions, getSavingsAccountsSavingsAccountIdChargesTemplateResponse.chargeOptions) &&
        Objects.equals(this.penalty, getSavingsAccountsSavingsAccountIdChargesTemplateResponse.penalty);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amountPaid, amountWaived, amountWrittenOff, chargeOptions, penalty);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetSavingsAccountsSavingsAccountIdChargesTemplateResponse {\n");
    
    sb.append("    amountPaid: ").append(toIndentedString(amountPaid)).append("\n");
    sb.append("    amountWaived: ").append(toIndentedString(amountWaived)).append("\n");
    sb.append("    amountWrittenOff: ").append(toIndentedString(amountWrittenOff)).append("\n");
    sb.append("    chargeOptions: ").append(toIndentedString(chargeOptions)).append("\n");
    sb.append("    penalty: ").append(toIndentedString(penalty)).append("\n");
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
