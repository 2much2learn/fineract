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
import org.apache.fineract.client.models.GetFixedDepositProductsInterestCalculationDaysInYearType;
import org.apache.fineract.client.models.GetFixedDepositProductsInterestCalculationType;
import org.apache.fineract.client.models.GetFixedDepositProductsInterestPostingPeriodType;
import org.apache.fineract.client.models.GetFixedDepositProductsProductIdAccountingMappings;
import org.apache.fineract.client.models.GetFixedDepositProductsProductIdActiveChart;
import org.apache.fineract.client.models.GetFixedDepositProductsProductIdCurrency;
import org.apache.fineract.client.models.GetFixedDepositProductsProductIdFeeToIncomeAccountMappings;
import org.apache.fineract.client.models.GetFixedDepositProductsProductIdInterestCompoundingPeriodType;
import org.apache.fineract.client.models.GetFixedDepositProductsProductIdMaxDepositTermType;
import org.apache.fineract.client.models.GetFixedDepositProductsProductIdMinDepositTermType;
import org.apache.fineract.client.models.GetFixedDepositProductsProductIdPenaltyToIncomeAccountMappings;
import org.apache.fineract.client.models.GetFixedDepositProductsProductIdPreClosurePenalInterestOnType;
/**
 * GetFixedDepositProductsProductIdResponse
 */
@Schema(description = "GetFixedDepositProductsProductIdResponse")

public class GetFixedDepositProductsProductIdResponse {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("shortName")
  private String shortName = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("currency")
  private GetFixedDepositProductsProductIdCurrency currency = null;

  @SerializedName("interestCompoundingPeriodType")
  private GetFixedDepositProductsProductIdInterestCompoundingPeriodType interestCompoundingPeriodType = null;

  @SerializedName("interestPostingPeriodType")
  private GetFixedDepositProductsInterestPostingPeriodType interestPostingPeriodType = null;

  @SerializedName("interestCalculationType")
  private GetFixedDepositProductsInterestCalculationType interestCalculationType = null;

  @SerializedName("interestCalculationDaysInYearType")
  private GetFixedDepositProductsInterestCalculationDaysInYearType interestCalculationDaysInYearType = null;

  @SerializedName("accountingMappings")
  private GetFixedDepositProductsProductIdAccountingMappings accountingMappings = null;

  @SerializedName("feeToIncomeAccountMappings")
  private List<GetFixedDepositProductsProductIdFeeToIncomeAccountMappings> feeToIncomeAccountMappings = null;

  @SerializedName("penaltyToIncomeAccountMappings")
  private List<GetFixedDepositProductsProductIdPenaltyToIncomeAccountMappings> penaltyToIncomeAccountMappings = null;

  @SerializedName("preClosurePenalApplicable")
  private Boolean preClosurePenalApplicable = null;

  @SerializedName("preClosurePenalInterest")
  private Double preClosurePenalInterest = null;

  @SerializedName("preClosurePenalInterestOnType")
  private GetFixedDepositProductsProductIdPreClosurePenalInterestOnType preClosurePenalInterestOnType = null;

  @SerializedName("minDepositTerm")
  private Integer minDepositTerm = null;

  @SerializedName("minDepositTermType")
  private GetFixedDepositProductsProductIdMinDepositTermType minDepositTermType = null;

  @SerializedName("maxDepositTerm")
  private Integer maxDepositTerm = null;

  @SerializedName("maxDepositTermType")
  private GetFixedDepositProductsProductIdMaxDepositTermType maxDepositTermType = null;

  @SerializedName("activeChart")
  private GetFixedDepositProductsProductIdActiveChart activeChart = null;

  public GetFixedDepositProductsProductIdResponse id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(example = "1", description = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public GetFixedDepositProductsProductIdResponse name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(example = "Fixed deposit product", description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GetFixedDepositProductsProductIdResponse shortName(String shortName) {
    this.shortName = shortName;
    return this;
  }

   /**
   * Get shortName
   * @return shortName
  **/
  @Schema(example = "FD01", description = "")
  public String getShortName() {
    return shortName;
  }

  public void setShortName(String shortName) {
    this.shortName = shortName;
  }

  public GetFixedDepositProductsProductIdResponse description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(example = "Daily compounding using Daily Balance, 5% per year, 365 days in year", description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public GetFixedDepositProductsProductIdResponse currency(GetFixedDepositProductsProductIdCurrency currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @Schema(description = "")
  public GetFixedDepositProductsProductIdCurrency getCurrency() {
    return currency;
  }

  public void setCurrency(GetFixedDepositProductsProductIdCurrency currency) {
    this.currency = currency;
  }

  public GetFixedDepositProductsProductIdResponse interestCompoundingPeriodType(GetFixedDepositProductsProductIdInterestCompoundingPeriodType interestCompoundingPeriodType) {
    this.interestCompoundingPeriodType = interestCompoundingPeriodType;
    return this;
  }

   /**
   * Get interestCompoundingPeriodType
   * @return interestCompoundingPeriodType
  **/
  @Schema(description = "")
  public GetFixedDepositProductsProductIdInterestCompoundingPeriodType getInterestCompoundingPeriodType() {
    return interestCompoundingPeriodType;
  }

  public void setInterestCompoundingPeriodType(GetFixedDepositProductsProductIdInterestCompoundingPeriodType interestCompoundingPeriodType) {
    this.interestCompoundingPeriodType = interestCompoundingPeriodType;
  }

  public GetFixedDepositProductsProductIdResponse interestPostingPeriodType(GetFixedDepositProductsInterestPostingPeriodType interestPostingPeriodType) {
    this.interestPostingPeriodType = interestPostingPeriodType;
    return this;
  }

   /**
   * Get interestPostingPeriodType
   * @return interestPostingPeriodType
  **/
  @Schema(description = "")
  public GetFixedDepositProductsInterestPostingPeriodType getInterestPostingPeriodType() {
    return interestPostingPeriodType;
  }

  public void setInterestPostingPeriodType(GetFixedDepositProductsInterestPostingPeriodType interestPostingPeriodType) {
    this.interestPostingPeriodType = interestPostingPeriodType;
  }

  public GetFixedDepositProductsProductIdResponse interestCalculationType(GetFixedDepositProductsInterestCalculationType interestCalculationType) {
    this.interestCalculationType = interestCalculationType;
    return this;
  }

   /**
   * Get interestCalculationType
   * @return interestCalculationType
  **/
  @Schema(description = "")
  public GetFixedDepositProductsInterestCalculationType getInterestCalculationType() {
    return interestCalculationType;
  }

  public void setInterestCalculationType(GetFixedDepositProductsInterestCalculationType interestCalculationType) {
    this.interestCalculationType = interestCalculationType;
  }

  public GetFixedDepositProductsProductIdResponse interestCalculationDaysInYearType(GetFixedDepositProductsInterestCalculationDaysInYearType interestCalculationDaysInYearType) {
    this.interestCalculationDaysInYearType = interestCalculationDaysInYearType;
    return this;
  }

   /**
   * Get interestCalculationDaysInYearType
   * @return interestCalculationDaysInYearType
  **/
  @Schema(description = "")
  public GetFixedDepositProductsInterestCalculationDaysInYearType getInterestCalculationDaysInYearType() {
    return interestCalculationDaysInYearType;
  }

  public void setInterestCalculationDaysInYearType(GetFixedDepositProductsInterestCalculationDaysInYearType interestCalculationDaysInYearType) {
    this.interestCalculationDaysInYearType = interestCalculationDaysInYearType;
  }

  public GetFixedDepositProductsProductIdResponse accountingMappings(GetFixedDepositProductsProductIdAccountingMappings accountingMappings) {
    this.accountingMappings = accountingMappings;
    return this;
  }

   /**
   * Get accountingMappings
   * @return accountingMappings
  **/
  @Schema(description = "")
  public GetFixedDepositProductsProductIdAccountingMappings getAccountingMappings() {
    return accountingMappings;
  }

  public void setAccountingMappings(GetFixedDepositProductsProductIdAccountingMappings accountingMappings) {
    this.accountingMappings = accountingMappings;
  }

  public GetFixedDepositProductsProductIdResponse feeToIncomeAccountMappings(List<GetFixedDepositProductsProductIdFeeToIncomeAccountMappings> feeToIncomeAccountMappings) {
    this.feeToIncomeAccountMappings = feeToIncomeAccountMappings;
    return this;
  }

  public GetFixedDepositProductsProductIdResponse addFeeToIncomeAccountMappingsItem(GetFixedDepositProductsProductIdFeeToIncomeAccountMappings feeToIncomeAccountMappingsItem) {
    if (this.feeToIncomeAccountMappings == null) {
      this.feeToIncomeAccountMappings = new ArrayList<>();
    }
    this.feeToIncomeAccountMappings.add(feeToIncomeAccountMappingsItem);
    return this;
  }

   /**
   * Get feeToIncomeAccountMappings
   * @return feeToIncomeAccountMappings
  **/
  @Schema(description = "")
  public List<GetFixedDepositProductsProductIdFeeToIncomeAccountMappings> getFeeToIncomeAccountMappings() {
    return feeToIncomeAccountMappings;
  }

  public void setFeeToIncomeAccountMappings(List<GetFixedDepositProductsProductIdFeeToIncomeAccountMappings> feeToIncomeAccountMappings) {
    this.feeToIncomeAccountMappings = feeToIncomeAccountMappings;
  }

  public GetFixedDepositProductsProductIdResponse penaltyToIncomeAccountMappings(List<GetFixedDepositProductsProductIdPenaltyToIncomeAccountMappings> penaltyToIncomeAccountMappings) {
    this.penaltyToIncomeAccountMappings = penaltyToIncomeAccountMappings;
    return this;
  }

  public GetFixedDepositProductsProductIdResponse addPenaltyToIncomeAccountMappingsItem(GetFixedDepositProductsProductIdPenaltyToIncomeAccountMappings penaltyToIncomeAccountMappingsItem) {
    if (this.penaltyToIncomeAccountMappings == null) {
      this.penaltyToIncomeAccountMappings = new ArrayList<>();
    }
    this.penaltyToIncomeAccountMappings.add(penaltyToIncomeAccountMappingsItem);
    return this;
  }

   /**
   * Get penaltyToIncomeAccountMappings
   * @return penaltyToIncomeAccountMappings
  **/
  @Schema(description = "")
  public List<GetFixedDepositProductsProductIdPenaltyToIncomeAccountMappings> getPenaltyToIncomeAccountMappings() {
    return penaltyToIncomeAccountMappings;
  }

  public void setPenaltyToIncomeAccountMappings(List<GetFixedDepositProductsProductIdPenaltyToIncomeAccountMappings> penaltyToIncomeAccountMappings) {
    this.penaltyToIncomeAccountMappings = penaltyToIncomeAccountMappings;
  }

  public GetFixedDepositProductsProductIdResponse preClosurePenalApplicable(Boolean preClosurePenalApplicable) {
    this.preClosurePenalApplicable = preClosurePenalApplicable;
    return this;
  }

   /**
   * Get preClosurePenalApplicable
   * @return preClosurePenalApplicable
  **/
  @Schema(example = "true", description = "")
  public Boolean isPreClosurePenalApplicable() {
    return preClosurePenalApplicable;
  }

  public void setPreClosurePenalApplicable(Boolean preClosurePenalApplicable) {
    this.preClosurePenalApplicable = preClosurePenalApplicable;
  }

  public GetFixedDepositProductsProductIdResponse preClosurePenalInterest(Double preClosurePenalInterest) {
    this.preClosurePenalInterest = preClosurePenalInterest;
    return this;
  }

   /**
   * Get preClosurePenalInterest
   * @return preClosurePenalInterest
  **/
  @Schema(example = "1.75", description = "")
  public Double getPreClosurePenalInterest() {
    return preClosurePenalInterest;
  }

  public void setPreClosurePenalInterest(Double preClosurePenalInterest) {
    this.preClosurePenalInterest = preClosurePenalInterest;
  }

  public GetFixedDepositProductsProductIdResponse preClosurePenalInterestOnType(GetFixedDepositProductsProductIdPreClosurePenalInterestOnType preClosurePenalInterestOnType) {
    this.preClosurePenalInterestOnType = preClosurePenalInterestOnType;
    return this;
  }

   /**
   * Get preClosurePenalInterestOnType
   * @return preClosurePenalInterestOnType
  **/
  @Schema(description = "")
  public GetFixedDepositProductsProductIdPreClosurePenalInterestOnType getPreClosurePenalInterestOnType() {
    return preClosurePenalInterestOnType;
  }

  public void setPreClosurePenalInterestOnType(GetFixedDepositProductsProductIdPreClosurePenalInterestOnType preClosurePenalInterestOnType) {
    this.preClosurePenalInterestOnType = preClosurePenalInterestOnType;
  }

  public GetFixedDepositProductsProductIdResponse minDepositTerm(Integer minDepositTerm) {
    this.minDepositTerm = minDepositTerm;
    return this;
  }

   /**
   * Get minDepositTerm
   * @return minDepositTerm
  **/
  @Schema(example = "1", description = "")
  public Integer getMinDepositTerm() {
    return minDepositTerm;
  }

  public void setMinDepositTerm(Integer minDepositTerm) {
    this.minDepositTerm = minDepositTerm;
  }

  public GetFixedDepositProductsProductIdResponse minDepositTermType(GetFixedDepositProductsProductIdMinDepositTermType minDepositTermType) {
    this.minDepositTermType = minDepositTermType;
    return this;
  }

   /**
   * Get minDepositTermType
   * @return minDepositTermType
  **/
  @Schema(description = "")
  public GetFixedDepositProductsProductIdMinDepositTermType getMinDepositTermType() {
    return minDepositTermType;
  }

  public void setMinDepositTermType(GetFixedDepositProductsProductIdMinDepositTermType minDepositTermType) {
    this.minDepositTermType = minDepositTermType;
  }

  public GetFixedDepositProductsProductIdResponse maxDepositTerm(Integer maxDepositTerm) {
    this.maxDepositTerm = maxDepositTerm;
    return this;
  }

   /**
   * Get maxDepositTerm
   * @return maxDepositTerm
  **/
  @Schema(example = "5", description = "")
  public Integer getMaxDepositTerm() {
    return maxDepositTerm;
  }

  public void setMaxDepositTerm(Integer maxDepositTerm) {
    this.maxDepositTerm = maxDepositTerm;
  }

  public GetFixedDepositProductsProductIdResponse maxDepositTermType(GetFixedDepositProductsProductIdMaxDepositTermType maxDepositTermType) {
    this.maxDepositTermType = maxDepositTermType;
    return this;
  }

   /**
   * Get maxDepositTermType
   * @return maxDepositTermType
  **/
  @Schema(description = "")
  public GetFixedDepositProductsProductIdMaxDepositTermType getMaxDepositTermType() {
    return maxDepositTermType;
  }

  public void setMaxDepositTermType(GetFixedDepositProductsProductIdMaxDepositTermType maxDepositTermType) {
    this.maxDepositTermType = maxDepositTermType;
  }

  public GetFixedDepositProductsProductIdResponse activeChart(GetFixedDepositProductsProductIdActiveChart activeChart) {
    this.activeChart = activeChart;
    return this;
  }

   /**
   * Get activeChart
   * @return activeChart
  **/
  @Schema(description = "")
  public GetFixedDepositProductsProductIdActiveChart getActiveChart() {
    return activeChart;
  }

  public void setActiveChart(GetFixedDepositProductsProductIdActiveChart activeChart) {
    this.activeChart = activeChart;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetFixedDepositProductsProductIdResponse getFixedDepositProductsProductIdResponse = (GetFixedDepositProductsProductIdResponse) o;
    return Objects.equals(this.id, getFixedDepositProductsProductIdResponse.id) &&
        Objects.equals(this.name, getFixedDepositProductsProductIdResponse.name) &&
        Objects.equals(this.shortName, getFixedDepositProductsProductIdResponse.shortName) &&
        Objects.equals(this.description, getFixedDepositProductsProductIdResponse.description) &&
        Objects.equals(this.currency, getFixedDepositProductsProductIdResponse.currency) &&
        Objects.equals(this.interestCompoundingPeriodType, getFixedDepositProductsProductIdResponse.interestCompoundingPeriodType) &&
        Objects.equals(this.interestPostingPeriodType, getFixedDepositProductsProductIdResponse.interestPostingPeriodType) &&
        Objects.equals(this.interestCalculationType, getFixedDepositProductsProductIdResponse.interestCalculationType) &&
        Objects.equals(this.interestCalculationDaysInYearType, getFixedDepositProductsProductIdResponse.interestCalculationDaysInYearType) &&
        Objects.equals(this.accountingMappings, getFixedDepositProductsProductIdResponse.accountingMappings) &&
        Objects.equals(this.feeToIncomeAccountMappings, getFixedDepositProductsProductIdResponse.feeToIncomeAccountMappings) &&
        Objects.equals(this.penaltyToIncomeAccountMappings, getFixedDepositProductsProductIdResponse.penaltyToIncomeAccountMappings) &&
        Objects.equals(this.preClosurePenalApplicable, getFixedDepositProductsProductIdResponse.preClosurePenalApplicable) &&
        Objects.equals(this.preClosurePenalInterest, getFixedDepositProductsProductIdResponse.preClosurePenalInterest) &&
        Objects.equals(this.preClosurePenalInterestOnType, getFixedDepositProductsProductIdResponse.preClosurePenalInterestOnType) &&
        Objects.equals(this.minDepositTerm, getFixedDepositProductsProductIdResponse.minDepositTerm) &&
        Objects.equals(this.minDepositTermType, getFixedDepositProductsProductIdResponse.minDepositTermType) &&
        Objects.equals(this.maxDepositTerm, getFixedDepositProductsProductIdResponse.maxDepositTerm) &&
        Objects.equals(this.maxDepositTermType, getFixedDepositProductsProductIdResponse.maxDepositTermType) &&
        Objects.equals(this.activeChart, getFixedDepositProductsProductIdResponse.activeChart);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, shortName, description, currency, interestCompoundingPeriodType, interestPostingPeriodType, interestCalculationType, interestCalculationDaysInYearType, accountingMappings, feeToIncomeAccountMappings, penaltyToIncomeAccountMappings, preClosurePenalApplicable, preClosurePenalInterest, preClosurePenalInterestOnType, minDepositTerm, minDepositTermType, maxDepositTerm, maxDepositTermType, activeChart);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetFixedDepositProductsProductIdResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    shortName: ").append(toIndentedString(shortName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    interestCompoundingPeriodType: ").append(toIndentedString(interestCompoundingPeriodType)).append("\n");
    sb.append("    interestPostingPeriodType: ").append(toIndentedString(interestPostingPeriodType)).append("\n");
    sb.append("    interestCalculationType: ").append(toIndentedString(interestCalculationType)).append("\n");
    sb.append("    interestCalculationDaysInYearType: ").append(toIndentedString(interestCalculationDaysInYearType)).append("\n");
    sb.append("    accountingMappings: ").append(toIndentedString(accountingMappings)).append("\n");
    sb.append("    feeToIncomeAccountMappings: ").append(toIndentedString(feeToIncomeAccountMappings)).append("\n");
    sb.append("    penaltyToIncomeAccountMappings: ").append(toIndentedString(penaltyToIncomeAccountMappings)).append("\n");
    sb.append("    preClosurePenalApplicable: ").append(toIndentedString(preClosurePenalApplicable)).append("\n");
    sb.append("    preClosurePenalInterest: ").append(toIndentedString(preClosurePenalInterest)).append("\n");
    sb.append("    preClosurePenalInterestOnType: ").append(toIndentedString(preClosurePenalInterestOnType)).append("\n");
    sb.append("    minDepositTerm: ").append(toIndentedString(minDepositTerm)).append("\n");
    sb.append("    minDepositTermType: ").append(toIndentedString(minDepositTermType)).append("\n");
    sb.append("    maxDepositTerm: ").append(toIndentedString(maxDepositTerm)).append("\n");
    sb.append("    maxDepositTermType: ").append(toIndentedString(maxDepositTermType)).append("\n");
    sb.append("    activeChart: ").append(toIndentedString(activeChart)).append("\n");
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
