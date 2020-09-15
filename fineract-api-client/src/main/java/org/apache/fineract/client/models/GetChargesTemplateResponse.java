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
import org.apache.fineract.client.models.GetChargesAppliesToResponse;
import org.apache.fineract.client.models.GetChargesCalculationTypeResponse;
import org.apache.fineract.client.models.GetChargesCurrencyResponse;
import org.apache.fineract.client.models.GetChargesPaymentModeResponse;
import org.apache.fineract.client.models.GetChargesTemplateFeeFrequencyOptions;
import org.apache.fineract.client.models.GetChargesTemplateLoanChargeCalculationTypeOptions;
import org.apache.fineract.client.models.GetChargesTemplateLoanChargeTimeTypeOptions;
import org.apache.fineract.client.models.GetChargesTimeTypeResponse;
/**
 * GetChargesTemplateResponse
 */
@Schema(description = "GetChargesTemplateResponse")

public class GetChargesTemplateResponse {
  @SerializedName("active")
  private String active = null;

  @SerializedName("penalty")
  private String penalty = null;

  @SerializedName("currencyOptions")
  private List<GetChargesCurrencyResponse> currencyOptions = null;

  @SerializedName("chargeCalculationTypeOptions")
  private List<GetChargesCalculationTypeResponse> chargeCalculationTypeOptions = null;

  @SerializedName("chargeAppliesToOptions")
  private List<GetChargesAppliesToResponse> chargeAppliesToOptions = null;

  @SerializedName("chargeTimeTypeOptions")
  private List<GetChargesTimeTypeResponse> chargeTimeTypeOptions = null;

  @SerializedName("chargePaymentModeOptions")
  private List<GetChargesPaymentModeResponse> chargePaymentModeOptions = null;

  @SerializedName("loanChargeCalculationTypeOptions")
  private List<GetChargesTemplateLoanChargeCalculationTypeOptions> loanChargeCalculationTypeOptions = null;

  @SerializedName("loanChargeTimeTypeOptions")
  private List<GetChargesTemplateLoanChargeTimeTypeOptions> loanChargeTimeTypeOptions = null;

  @SerializedName("savingsChargeCalculationTypeOptions")
  private List<GetChargesTemplateLoanChargeCalculationTypeOptions> savingsChargeCalculationTypeOptions = null;

  @SerializedName("savingsChargeTimeTypeOptions")
  private List<GetChargesTemplateLoanChargeTimeTypeOptions> savingsChargeTimeTypeOptions = null;

  @SerializedName("feeFrequencyOptions")
  private List<GetChargesTemplateFeeFrequencyOptions> feeFrequencyOptions = null;

  public GetChargesTemplateResponse active(String active) {
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @Schema(example = "false", description = "")
  public String getActive() {
    return active;
  }

  public void setActive(String active) {
    this.active = active;
  }

  public GetChargesTemplateResponse penalty(String penalty) {
    this.penalty = penalty;
    return this;
  }

   /**
   * Get penalty
   * @return penalty
  **/
  @Schema(example = "false", description = "")
  public String getPenalty() {
    return penalty;
  }

  public void setPenalty(String penalty) {
    this.penalty = penalty;
  }

  public GetChargesTemplateResponse currencyOptions(List<GetChargesCurrencyResponse> currencyOptions) {
    this.currencyOptions = currencyOptions;
    return this;
  }

  public GetChargesTemplateResponse addCurrencyOptionsItem(GetChargesCurrencyResponse currencyOptionsItem) {
    if (this.currencyOptions == null) {
      this.currencyOptions = new ArrayList<>();
    }
    this.currencyOptions.add(currencyOptionsItem);
    return this;
  }

   /**
   * Get currencyOptions
   * @return currencyOptions
  **/
  @Schema(description = "")
  public List<GetChargesCurrencyResponse> getCurrencyOptions() {
    return currencyOptions;
  }

  public void setCurrencyOptions(List<GetChargesCurrencyResponse> currencyOptions) {
    this.currencyOptions = currencyOptions;
  }

  public GetChargesTemplateResponse chargeCalculationTypeOptions(List<GetChargesCalculationTypeResponse> chargeCalculationTypeOptions) {
    this.chargeCalculationTypeOptions = chargeCalculationTypeOptions;
    return this;
  }

  public GetChargesTemplateResponse addChargeCalculationTypeOptionsItem(GetChargesCalculationTypeResponse chargeCalculationTypeOptionsItem) {
    if (this.chargeCalculationTypeOptions == null) {
      this.chargeCalculationTypeOptions = new ArrayList<>();
    }
    this.chargeCalculationTypeOptions.add(chargeCalculationTypeOptionsItem);
    return this;
  }

   /**
   * Get chargeCalculationTypeOptions
   * @return chargeCalculationTypeOptions
  **/
  @Schema(description = "")
  public List<GetChargesCalculationTypeResponse> getChargeCalculationTypeOptions() {
    return chargeCalculationTypeOptions;
  }

  public void setChargeCalculationTypeOptions(List<GetChargesCalculationTypeResponse> chargeCalculationTypeOptions) {
    this.chargeCalculationTypeOptions = chargeCalculationTypeOptions;
  }

  public GetChargesTemplateResponse chargeAppliesToOptions(List<GetChargesAppliesToResponse> chargeAppliesToOptions) {
    this.chargeAppliesToOptions = chargeAppliesToOptions;
    return this;
  }

  public GetChargesTemplateResponse addChargeAppliesToOptionsItem(GetChargesAppliesToResponse chargeAppliesToOptionsItem) {
    if (this.chargeAppliesToOptions == null) {
      this.chargeAppliesToOptions = new ArrayList<>();
    }
    this.chargeAppliesToOptions.add(chargeAppliesToOptionsItem);
    return this;
  }

   /**
   * Get chargeAppliesToOptions
   * @return chargeAppliesToOptions
  **/
  @Schema(description = "")
  public List<GetChargesAppliesToResponse> getChargeAppliesToOptions() {
    return chargeAppliesToOptions;
  }

  public void setChargeAppliesToOptions(List<GetChargesAppliesToResponse> chargeAppliesToOptions) {
    this.chargeAppliesToOptions = chargeAppliesToOptions;
  }

  public GetChargesTemplateResponse chargeTimeTypeOptions(List<GetChargesTimeTypeResponse> chargeTimeTypeOptions) {
    this.chargeTimeTypeOptions = chargeTimeTypeOptions;
    return this;
  }

  public GetChargesTemplateResponse addChargeTimeTypeOptionsItem(GetChargesTimeTypeResponse chargeTimeTypeOptionsItem) {
    if (this.chargeTimeTypeOptions == null) {
      this.chargeTimeTypeOptions = new ArrayList<>();
    }
    this.chargeTimeTypeOptions.add(chargeTimeTypeOptionsItem);
    return this;
  }

   /**
   * Get chargeTimeTypeOptions
   * @return chargeTimeTypeOptions
  **/
  @Schema(description = "")
  public List<GetChargesTimeTypeResponse> getChargeTimeTypeOptions() {
    return chargeTimeTypeOptions;
  }

  public void setChargeTimeTypeOptions(List<GetChargesTimeTypeResponse> chargeTimeTypeOptions) {
    this.chargeTimeTypeOptions = chargeTimeTypeOptions;
  }

  public GetChargesTemplateResponse chargePaymentModeOptions(List<GetChargesPaymentModeResponse> chargePaymentModeOptions) {
    this.chargePaymentModeOptions = chargePaymentModeOptions;
    return this;
  }

  public GetChargesTemplateResponse addChargePaymentModeOptionsItem(GetChargesPaymentModeResponse chargePaymentModeOptionsItem) {
    if (this.chargePaymentModeOptions == null) {
      this.chargePaymentModeOptions = new ArrayList<>();
    }
    this.chargePaymentModeOptions.add(chargePaymentModeOptionsItem);
    return this;
  }

   /**
   * Get chargePaymentModeOptions
   * @return chargePaymentModeOptions
  **/
  @Schema(description = "")
  public List<GetChargesPaymentModeResponse> getChargePaymentModeOptions() {
    return chargePaymentModeOptions;
  }

  public void setChargePaymentModeOptions(List<GetChargesPaymentModeResponse> chargePaymentModeOptions) {
    this.chargePaymentModeOptions = chargePaymentModeOptions;
  }

  public GetChargesTemplateResponse loanChargeCalculationTypeOptions(List<GetChargesTemplateLoanChargeCalculationTypeOptions> loanChargeCalculationTypeOptions) {
    this.loanChargeCalculationTypeOptions = loanChargeCalculationTypeOptions;
    return this;
  }

  public GetChargesTemplateResponse addLoanChargeCalculationTypeOptionsItem(GetChargesTemplateLoanChargeCalculationTypeOptions loanChargeCalculationTypeOptionsItem) {
    if (this.loanChargeCalculationTypeOptions == null) {
      this.loanChargeCalculationTypeOptions = new ArrayList<>();
    }
    this.loanChargeCalculationTypeOptions.add(loanChargeCalculationTypeOptionsItem);
    return this;
  }

   /**
   * Get loanChargeCalculationTypeOptions
   * @return loanChargeCalculationTypeOptions
  **/
  @Schema(description = "")
  public List<GetChargesTemplateLoanChargeCalculationTypeOptions> getLoanChargeCalculationTypeOptions() {
    return loanChargeCalculationTypeOptions;
  }

  public void setLoanChargeCalculationTypeOptions(List<GetChargesTemplateLoanChargeCalculationTypeOptions> loanChargeCalculationTypeOptions) {
    this.loanChargeCalculationTypeOptions = loanChargeCalculationTypeOptions;
  }

  public GetChargesTemplateResponse loanChargeTimeTypeOptions(List<GetChargesTemplateLoanChargeTimeTypeOptions> loanChargeTimeTypeOptions) {
    this.loanChargeTimeTypeOptions = loanChargeTimeTypeOptions;
    return this;
  }

  public GetChargesTemplateResponse addLoanChargeTimeTypeOptionsItem(GetChargesTemplateLoanChargeTimeTypeOptions loanChargeTimeTypeOptionsItem) {
    if (this.loanChargeTimeTypeOptions == null) {
      this.loanChargeTimeTypeOptions = new ArrayList<>();
    }
    this.loanChargeTimeTypeOptions.add(loanChargeTimeTypeOptionsItem);
    return this;
  }

   /**
   * Get loanChargeTimeTypeOptions
   * @return loanChargeTimeTypeOptions
  **/
  @Schema(description = "")
  public List<GetChargesTemplateLoanChargeTimeTypeOptions> getLoanChargeTimeTypeOptions() {
    return loanChargeTimeTypeOptions;
  }

  public void setLoanChargeTimeTypeOptions(List<GetChargesTemplateLoanChargeTimeTypeOptions> loanChargeTimeTypeOptions) {
    this.loanChargeTimeTypeOptions = loanChargeTimeTypeOptions;
  }

  public GetChargesTemplateResponse savingsChargeCalculationTypeOptions(List<GetChargesTemplateLoanChargeCalculationTypeOptions> savingsChargeCalculationTypeOptions) {
    this.savingsChargeCalculationTypeOptions = savingsChargeCalculationTypeOptions;
    return this;
  }

  public GetChargesTemplateResponse addSavingsChargeCalculationTypeOptionsItem(GetChargesTemplateLoanChargeCalculationTypeOptions savingsChargeCalculationTypeOptionsItem) {
    if (this.savingsChargeCalculationTypeOptions == null) {
      this.savingsChargeCalculationTypeOptions = new ArrayList<>();
    }
    this.savingsChargeCalculationTypeOptions.add(savingsChargeCalculationTypeOptionsItem);
    return this;
  }

   /**
   * Get savingsChargeCalculationTypeOptions
   * @return savingsChargeCalculationTypeOptions
  **/
  @Schema(description = "")
  public List<GetChargesTemplateLoanChargeCalculationTypeOptions> getSavingsChargeCalculationTypeOptions() {
    return savingsChargeCalculationTypeOptions;
  }

  public void setSavingsChargeCalculationTypeOptions(List<GetChargesTemplateLoanChargeCalculationTypeOptions> savingsChargeCalculationTypeOptions) {
    this.savingsChargeCalculationTypeOptions = savingsChargeCalculationTypeOptions;
  }

  public GetChargesTemplateResponse savingsChargeTimeTypeOptions(List<GetChargesTemplateLoanChargeTimeTypeOptions> savingsChargeTimeTypeOptions) {
    this.savingsChargeTimeTypeOptions = savingsChargeTimeTypeOptions;
    return this;
  }

  public GetChargesTemplateResponse addSavingsChargeTimeTypeOptionsItem(GetChargesTemplateLoanChargeTimeTypeOptions savingsChargeTimeTypeOptionsItem) {
    if (this.savingsChargeTimeTypeOptions == null) {
      this.savingsChargeTimeTypeOptions = new ArrayList<>();
    }
    this.savingsChargeTimeTypeOptions.add(savingsChargeTimeTypeOptionsItem);
    return this;
  }

   /**
   * Get savingsChargeTimeTypeOptions
   * @return savingsChargeTimeTypeOptions
  **/
  @Schema(description = "")
  public List<GetChargesTemplateLoanChargeTimeTypeOptions> getSavingsChargeTimeTypeOptions() {
    return savingsChargeTimeTypeOptions;
  }

  public void setSavingsChargeTimeTypeOptions(List<GetChargesTemplateLoanChargeTimeTypeOptions> savingsChargeTimeTypeOptions) {
    this.savingsChargeTimeTypeOptions = savingsChargeTimeTypeOptions;
  }

  public GetChargesTemplateResponse feeFrequencyOptions(List<GetChargesTemplateFeeFrequencyOptions> feeFrequencyOptions) {
    this.feeFrequencyOptions = feeFrequencyOptions;
    return this;
  }

  public GetChargesTemplateResponse addFeeFrequencyOptionsItem(GetChargesTemplateFeeFrequencyOptions feeFrequencyOptionsItem) {
    if (this.feeFrequencyOptions == null) {
      this.feeFrequencyOptions = new ArrayList<>();
    }
    this.feeFrequencyOptions.add(feeFrequencyOptionsItem);
    return this;
  }

   /**
   * Get feeFrequencyOptions
   * @return feeFrequencyOptions
  **/
  @Schema(description = "")
  public List<GetChargesTemplateFeeFrequencyOptions> getFeeFrequencyOptions() {
    return feeFrequencyOptions;
  }

  public void setFeeFrequencyOptions(List<GetChargesTemplateFeeFrequencyOptions> feeFrequencyOptions) {
    this.feeFrequencyOptions = feeFrequencyOptions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetChargesTemplateResponse getChargesTemplateResponse = (GetChargesTemplateResponse) o;
    return Objects.equals(this.active, getChargesTemplateResponse.active) &&
        Objects.equals(this.penalty, getChargesTemplateResponse.penalty) &&
        Objects.equals(this.currencyOptions, getChargesTemplateResponse.currencyOptions) &&
        Objects.equals(this.chargeCalculationTypeOptions, getChargesTemplateResponse.chargeCalculationTypeOptions) &&
        Objects.equals(this.chargeAppliesToOptions, getChargesTemplateResponse.chargeAppliesToOptions) &&
        Objects.equals(this.chargeTimeTypeOptions, getChargesTemplateResponse.chargeTimeTypeOptions) &&
        Objects.equals(this.chargePaymentModeOptions, getChargesTemplateResponse.chargePaymentModeOptions) &&
        Objects.equals(this.loanChargeCalculationTypeOptions, getChargesTemplateResponse.loanChargeCalculationTypeOptions) &&
        Objects.equals(this.loanChargeTimeTypeOptions, getChargesTemplateResponse.loanChargeTimeTypeOptions) &&
        Objects.equals(this.savingsChargeCalculationTypeOptions, getChargesTemplateResponse.savingsChargeCalculationTypeOptions) &&
        Objects.equals(this.savingsChargeTimeTypeOptions, getChargesTemplateResponse.savingsChargeTimeTypeOptions) &&
        Objects.equals(this.feeFrequencyOptions, getChargesTemplateResponse.feeFrequencyOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, penalty, currencyOptions, chargeCalculationTypeOptions, chargeAppliesToOptions, chargeTimeTypeOptions, chargePaymentModeOptions, loanChargeCalculationTypeOptions, loanChargeTimeTypeOptions, savingsChargeCalculationTypeOptions, savingsChargeTimeTypeOptions, feeFrequencyOptions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetChargesTemplateResponse {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    penalty: ").append(toIndentedString(penalty)).append("\n");
    sb.append("    currencyOptions: ").append(toIndentedString(currencyOptions)).append("\n");
    sb.append("    chargeCalculationTypeOptions: ").append(toIndentedString(chargeCalculationTypeOptions)).append("\n");
    sb.append("    chargeAppliesToOptions: ").append(toIndentedString(chargeAppliesToOptions)).append("\n");
    sb.append("    chargeTimeTypeOptions: ").append(toIndentedString(chargeTimeTypeOptions)).append("\n");
    sb.append("    chargePaymentModeOptions: ").append(toIndentedString(chargePaymentModeOptions)).append("\n");
    sb.append("    loanChargeCalculationTypeOptions: ").append(toIndentedString(loanChargeCalculationTypeOptions)).append("\n");
    sb.append("    loanChargeTimeTypeOptions: ").append(toIndentedString(loanChargeTimeTypeOptions)).append("\n");
    sb.append("    savingsChargeCalculationTypeOptions: ").append(toIndentedString(savingsChargeCalculationTypeOptions)).append("\n");
    sb.append("    savingsChargeTimeTypeOptions: ").append(toIndentedString(savingsChargeTimeTypeOptions)).append("\n");
    sb.append("    feeFrequencyOptions: ").append(toIndentedString(feeFrequencyOptions)).append("\n");
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
