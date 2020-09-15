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
import java.time.LocalDate;
import org.apache.fineract.client.models.GetRecurringDepositAccountsAccountChart;
import org.apache.fineract.client.models.GetRecurringDepositAccountsCurrency;
import org.apache.fineract.client.models.GetRecurringDepositAccountsDepositPeriodFrequency;
import org.apache.fineract.client.models.GetRecurringDepositAccountsInterestCalculationDaysInYearType;
import org.apache.fineract.client.models.GetRecurringDepositAccountsInterestCalculationType;
import org.apache.fineract.client.models.GetRecurringDepositAccountsInterestCompoundingPeriodType;
import org.apache.fineract.client.models.GetRecurringDepositAccountsInterestPostingPeriodType;
import org.apache.fineract.client.models.GetRecurringDepositAccountsMaxDepositTermType;
import org.apache.fineract.client.models.GetRecurringDepositAccountsMinDepositTermType;
import org.apache.fineract.client.models.GetRecurringDepositAccountsRecurringDepositFrequencyType;
import org.apache.fineract.client.models.GetRecurringDepositAccountsStatus;
import org.apache.fineract.client.models.GetRecurringDepositAccountsSummary;
import org.apache.fineract.client.models.GetRecurringDepositAccountsTimeline;
/**
 * GetRecurringDepositAccountsAccountIdResponse
 */
@Schema(description = "GetRecurringDepositAccountsAccountIdResponse")

public class GetRecurringDepositAccountsAccountIdResponse {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("accountNo")
  private Long accountNo = null;

  @SerializedName("externalId")
  private String externalId = null;

  @SerializedName("clientId")
  private Integer clientId = null;

  @SerializedName("clientName")
  private String clientName = null;

  @SerializedName("savingsProductId")
  private Integer savingsProductId = null;

  @SerializedName("savingsProductName")
  private String savingsProductName = null;

  @SerializedName("fieldOfficerId")
  private Integer fieldOfficerId = null;

  @SerializedName("status")
  private GetRecurringDepositAccountsStatus status = null;

  @SerializedName("timeline")
  private GetRecurringDepositAccountsTimeline timeline = null;

  @SerializedName("currency")
  private GetRecurringDepositAccountsCurrency currency = null;

  @SerializedName("interestCompoundingPeriodType")
  private GetRecurringDepositAccountsInterestCompoundingPeriodType interestCompoundingPeriodType = null;

  @SerializedName("interestPostingPeriodType")
  private GetRecurringDepositAccountsInterestPostingPeriodType interestPostingPeriodType = null;

  @SerializedName("interestCalculationType")
  private GetRecurringDepositAccountsInterestCalculationType interestCalculationType = null;

  @SerializedName("interestCalculationDaysInYearType")
  private GetRecurringDepositAccountsInterestCalculationDaysInYearType interestCalculationDaysInYearType = null;

  @SerializedName("preClosurePenalApplicable")
  private Boolean preClosurePenalApplicable = null;

  @SerializedName("minDepositTerm")
  private Integer minDepositTerm = null;

  @SerializedName("maxDepositTerm")
  private Integer maxDepositTerm = null;

  @SerializedName("minDepositTermType")
  private GetRecurringDepositAccountsMinDepositTermType minDepositTermType = null;

  @SerializedName("maxDepositTermType")
  private GetRecurringDepositAccountsMaxDepositTermType maxDepositTermType = null;

  @SerializedName("recurringDepositAmount")
  private Integer recurringDepositAmount = null;

  @SerializedName("recurringDepositFrequency")
  private Integer recurringDepositFrequency = null;

  @SerializedName("expectedFirstDepositOnDate")
  private LocalDate expectedFirstDepositOnDate = null;

  @SerializedName("recurringDepositFrequencyType")
  private GetRecurringDepositAccountsRecurringDepositFrequencyType recurringDepositFrequencyType = null;

  @SerializedName("depositPeriod")
  private Integer depositPeriod = null;

  @SerializedName("depositPeriodFrequency")
  private GetRecurringDepositAccountsDepositPeriodFrequency depositPeriodFrequency = null;

  @SerializedName("summary")
  private GetRecurringDepositAccountsSummary summary = null;

  @SerializedName("accountChart")
  private GetRecurringDepositAccountsAccountChart accountChart = null;

  public GetRecurringDepositAccountsAccountIdResponse id(Integer id) {
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

  public GetRecurringDepositAccountsAccountIdResponse accountNo(Long accountNo) {
    this.accountNo = accountNo;
    return this;
  }

   /**
   * Get accountNo
   * @return accountNo
  **/
  @Schema(description = "")
  public Long getAccountNo() {
    return accountNo;
  }

  public void setAccountNo(Long accountNo) {
    this.accountNo = accountNo;
  }

  public GetRecurringDepositAccountsAccountIdResponse externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

   /**
   * Get externalId
   * @return externalId
  **/
  @Schema(example = "RD-23", description = "")
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  public GetRecurringDepositAccountsAccountIdResponse clientId(Integer clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * Get clientId
   * @return clientId
  **/
  @Schema(example = "1", description = "")
  public Integer getClientId() {
    return clientId;
  }

  public void setClientId(Integer clientId) {
    this.clientId = clientId;
  }

  public GetRecurringDepositAccountsAccountIdResponse clientName(String clientName) {
    this.clientName = clientName;
    return this;
  }

   /**
   * Get clientName
   * @return clientName
  **/
  @Schema(example = "Sangamesh N", description = "")
  public String getClientName() {
    return clientName;
  }

  public void setClientName(String clientName) {
    this.clientName = clientName;
  }

  public GetRecurringDepositAccountsAccountIdResponse savingsProductId(Integer savingsProductId) {
    this.savingsProductId = savingsProductId;
    return this;
  }

   /**
   * Get savingsProductId
   * @return savingsProductId
  **/
  @Schema(example = "3", description = "")
  public Integer getSavingsProductId() {
    return savingsProductId;
  }

  public void setSavingsProductId(Integer savingsProductId) {
    this.savingsProductId = savingsProductId;
  }

  public GetRecurringDepositAccountsAccountIdResponse savingsProductName(String savingsProductName) {
    this.savingsProductName = savingsProductName;
    return this;
  }

   /**
   * Get savingsProductName
   * @return savingsProductName
  **/
  @Schema(example = "RD01", description = "")
  public String getSavingsProductName() {
    return savingsProductName;
  }

  public void setSavingsProductName(String savingsProductName) {
    this.savingsProductName = savingsProductName;
  }

  public GetRecurringDepositAccountsAccountIdResponse fieldOfficerId(Integer fieldOfficerId) {
    this.fieldOfficerId = fieldOfficerId;
    return this;
  }

   /**
   * Get fieldOfficerId
   * @return fieldOfficerId
  **/
  @Schema(example = "0", description = "")
  public Integer getFieldOfficerId() {
    return fieldOfficerId;
  }

  public void setFieldOfficerId(Integer fieldOfficerId) {
    this.fieldOfficerId = fieldOfficerId;
  }

  public GetRecurringDepositAccountsAccountIdResponse status(GetRecurringDepositAccountsStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public GetRecurringDepositAccountsStatus getStatus() {
    return status;
  }

  public void setStatus(GetRecurringDepositAccountsStatus status) {
    this.status = status;
  }

  public GetRecurringDepositAccountsAccountIdResponse timeline(GetRecurringDepositAccountsTimeline timeline) {
    this.timeline = timeline;
    return this;
  }

   /**
   * Get timeline
   * @return timeline
  **/
  @Schema(description = "")
  public GetRecurringDepositAccountsTimeline getTimeline() {
    return timeline;
  }

  public void setTimeline(GetRecurringDepositAccountsTimeline timeline) {
    this.timeline = timeline;
  }

  public GetRecurringDepositAccountsAccountIdResponse currency(GetRecurringDepositAccountsCurrency currency) {
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

  public GetRecurringDepositAccountsAccountIdResponse interestCompoundingPeriodType(GetRecurringDepositAccountsInterestCompoundingPeriodType interestCompoundingPeriodType) {
    this.interestCompoundingPeriodType = interestCompoundingPeriodType;
    return this;
  }

   /**
   * Get interestCompoundingPeriodType
   * @return interestCompoundingPeriodType
  **/
  @Schema(description = "")
  public GetRecurringDepositAccountsInterestCompoundingPeriodType getInterestCompoundingPeriodType() {
    return interestCompoundingPeriodType;
  }

  public void setInterestCompoundingPeriodType(GetRecurringDepositAccountsInterestCompoundingPeriodType interestCompoundingPeriodType) {
    this.interestCompoundingPeriodType = interestCompoundingPeriodType;
  }

  public GetRecurringDepositAccountsAccountIdResponse interestPostingPeriodType(GetRecurringDepositAccountsInterestPostingPeriodType interestPostingPeriodType) {
    this.interestPostingPeriodType = interestPostingPeriodType;
    return this;
  }

   /**
   * Get interestPostingPeriodType
   * @return interestPostingPeriodType
  **/
  @Schema(description = "")
  public GetRecurringDepositAccountsInterestPostingPeriodType getInterestPostingPeriodType() {
    return interestPostingPeriodType;
  }

  public void setInterestPostingPeriodType(GetRecurringDepositAccountsInterestPostingPeriodType interestPostingPeriodType) {
    this.interestPostingPeriodType = interestPostingPeriodType;
  }

  public GetRecurringDepositAccountsAccountIdResponse interestCalculationType(GetRecurringDepositAccountsInterestCalculationType interestCalculationType) {
    this.interestCalculationType = interestCalculationType;
    return this;
  }

   /**
   * Get interestCalculationType
   * @return interestCalculationType
  **/
  @Schema(description = "")
  public GetRecurringDepositAccountsInterestCalculationType getInterestCalculationType() {
    return interestCalculationType;
  }

  public void setInterestCalculationType(GetRecurringDepositAccountsInterestCalculationType interestCalculationType) {
    this.interestCalculationType = interestCalculationType;
  }

  public GetRecurringDepositAccountsAccountIdResponse interestCalculationDaysInYearType(GetRecurringDepositAccountsInterestCalculationDaysInYearType interestCalculationDaysInYearType) {
    this.interestCalculationDaysInYearType = interestCalculationDaysInYearType;
    return this;
  }

   /**
   * Get interestCalculationDaysInYearType
   * @return interestCalculationDaysInYearType
  **/
  @Schema(description = "")
  public GetRecurringDepositAccountsInterestCalculationDaysInYearType getInterestCalculationDaysInYearType() {
    return interestCalculationDaysInYearType;
  }

  public void setInterestCalculationDaysInYearType(GetRecurringDepositAccountsInterestCalculationDaysInYearType interestCalculationDaysInYearType) {
    this.interestCalculationDaysInYearType = interestCalculationDaysInYearType;
  }

  public GetRecurringDepositAccountsAccountIdResponse preClosurePenalApplicable(Boolean preClosurePenalApplicable) {
    this.preClosurePenalApplicable = preClosurePenalApplicable;
    return this;
  }

   /**
   * Get preClosurePenalApplicable
   * @return preClosurePenalApplicable
  **/
  @Schema(example = "false", description = "")
  public Boolean isPreClosurePenalApplicable() {
    return preClosurePenalApplicable;
  }

  public void setPreClosurePenalApplicable(Boolean preClosurePenalApplicable) {
    this.preClosurePenalApplicable = preClosurePenalApplicable;
  }

  public GetRecurringDepositAccountsAccountIdResponse minDepositTerm(Integer minDepositTerm) {
    this.minDepositTerm = minDepositTerm;
    return this;
  }

   /**
   * Get minDepositTerm
   * @return minDepositTerm
  **/
  @Schema(example = "3", description = "")
  public Integer getMinDepositTerm() {
    return minDepositTerm;
  }

  public void setMinDepositTerm(Integer minDepositTerm) {
    this.minDepositTerm = minDepositTerm;
  }

  public GetRecurringDepositAccountsAccountIdResponse maxDepositTerm(Integer maxDepositTerm) {
    this.maxDepositTerm = maxDepositTerm;
    return this;
  }

   /**
   * Get maxDepositTerm
   * @return maxDepositTerm
  **/
  @Schema(example = "4", description = "")
  public Integer getMaxDepositTerm() {
    return maxDepositTerm;
  }

  public void setMaxDepositTerm(Integer maxDepositTerm) {
    this.maxDepositTerm = maxDepositTerm;
  }

  public GetRecurringDepositAccountsAccountIdResponse minDepositTermType(GetRecurringDepositAccountsMinDepositTermType minDepositTermType) {
    this.minDepositTermType = minDepositTermType;
    return this;
  }

   /**
   * Get minDepositTermType
   * @return minDepositTermType
  **/
  @Schema(description = "")
  public GetRecurringDepositAccountsMinDepositTermType getMinDepositTermType() {
    return minDepositTermType;
  }

  public void setMinDepositTermType(GetRecurringDepositAccountsMinDepositTermType minDepositTermType) {
    this.minDepositTermType = minDepositTermType;
  }

  public GetRecurringDepositAccountsAccountIdResponse maxDepositTermType(GetRecurringDepositAccountsMaxDepositTermType maxDepositTermType) {
    this.maxDepositTermType = maxDepositTermType;
    return this;
  }

   /**
   * Get maxDepositTermType
   * @return maxDepositTermType
  **/
  @Schema(description = "")
  public GetRecurringDepositAccountsMaxDepositTermType getMaxDepositTermType() {
    return maxDepositTermType;
  }

  public void setMaxDepositTermType(GetRecurringDepositAccountsMaxDepositTermType maxDepositTermType) {
    this.maxDepositTermType = maxDepositTermType;
  }

  public GetRecurringDepositAccountsAccountIdResponse recurringDepositAmount(Integer recurringDepositAmount) {
    this.recurringDepositAmount = recurringDepositAmount;
    return this;
  }

   /**
   * Get recurringDepositAmount
   * @return recurringDepositAmount
  **/
  @Schema(example = "100", description = "")
  public Integer getRecurringDepositAmount() {
    return recurringDepositAmount;
  }

  public void setRecurringDepositAmount(Integer recurringDepositAmount) {
    this.recurringDepositAmount = recurringDepositAmount;
  }

  public GetRecurringDepositAccountsAccountIdResponse recurringDepositFrequency(Integer recurringDepositFrequency) {
    this.recurringDepositFrequency = recurringDepositFrequency;
    return this;
  }

   /**
   * Get recurringDepositFrequency
   * @return recurringDepositFrequency
  **/
  @Schema(example = "1", description = "")
  public Integer getRecurringDepositFrequency() {
    return recurringDepositFrequency;
  }

  public void setRecurringDepositFrequency(Integer recurringDepositFrequency) {
    this.recurringDepositFrequency = recurringDepositFrequency;
  }

  public GetRecurringDepositAccountsAccountIdResponse expectedFirstDepositOnDate(LocalDate expectedFirstDepositOnDate) {
    this.expectedFirstDepositOnDate = expectedFirstDepositOnDate;
    return this;
  }

   /**
   * Get expectedFirstDepositOnDate
   * @return expectedFirstDepositOnDate
  **/
  @Schema(description = "")
  public LocalDate getExpectedFirstDepositOnDate() {
    return expectedFirstDepositOnDate;
  }

  public void setExpectedFirstDepositOnDate(LocalDate expectedFirstDepositOnDate) {
    this.expectedFirstDepositOnDate = expectedFirstDepositOnDate;
  }

  public GetRecurringDepositAccountsAccountIdResponse recurringDepositFrequencyType(GetRecurringDepositAccountsRecurringDepositFrequencyType recurringDepositFrequencyType) {
    this.recurringDepositFrequencyType = recurringDepositFrequencyType;
    return this;
  }

   /**
   * Get recurringDepositFrequencyType
   * @return recurringDepositFrequencyType
  **/
  @Schema(description = "")
  public GetRecurringDepositAccountsRecurringDepositFrequencyType getRecurringDepositFrequencyType() {
    return recurringDepositFrequencyType;
  }

  public void setRecurringDepositFrequencyType(GetRecurringDepositAccountsRecurringDepositFrequencyType recurringDepositFrequencyType) {
    this.recurringDepositFrequencyType = recurringDepositFrequencyType;
  }

  public GetRecurringDepositAccountsAccountIdResponse depositPeriod(Integer depositPeriod) {
    this.depositPeriod = depositPeriod;
    return this;
  }

   /**
   * Get depositPeriod
   * @return depositPeriod
  **/
  @Schema(example = "6", description = "")
  public Integer getDepositPeriod() {
    return depositPeriod;
  }

  public void setDepositPeriod(Integer depositPeriod) {
    this.depositPeriod = depositPeriod;
  }

  public GetRecurringDepositAccountsAccountIdResponse depositPeriodFrequency(GetRecurringDepositAccountsDepositPeriodFrequency depositPeriodFrequency) {
    this.depositPeriodFrequency = depositPeriodFrequency;
    return this;
  }

   /**
   * Get depositPeriodFrequency
   * @return depositPeriodFrequency
  **/
  @Schema(description = "")
  public GetRecurringDepositAccountsDepositPeriodFrequency getDepositPeriodFrequency() {
    return depositPeriodFrequency;
  }

  public void setDepositPeriodFrequency(GetRecurringDepositAccountsDepositPeriodFrequency depositPeriodFrequency) {
    this.depositPeriodFrequency = depositPeriodFrequency;
  }

  public GetRecurringDepositAccountsAccountIdResponse summary(GetRecurringDepositAccountsSummary summary) {
    this.summary = summary;
    return this;
  }

   /**
   * Get summary
   * @return summary
  **/
  @Schema(description = "")
  public GetRecurringDepositAccountsSummary getSummary() {
    return summary;
  }

  public void setSummary(GetRecurringDepositAccountsSummary summary) {
    this.summary = summary;
  }

  public GetRecurringDepositAccountsAccountIdResponse accountChart(GetRecurringDepositAccountsAccountChart accountChart) {
    this.accountChart = accountChart;
    return this;
  }

   /**
   * Get accountChart
   * @return accountChart
  **/
  @Schema(description = "")
  public GetRecurringDepositAccountsAccountChart getAccountChart() {
    return accountChart;
  }

  public void setAccountChart(GetRecurringDepositAccountsAccountChart accountChart) {
    this.accountChart = accountChart;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetRecurringDepositAccountsAccountIdResponse getRecurringDepositAccountsAccountIdResponse = (GetRecurringDepositAccountsAccountIdResponse) o;
    return Objects.equals(this.id, getRecurringDepositAccountsAccountIdResponse.id) &&
        Objects.equals(this.accountNo, getRecurringDepositAccountsAccountIdResponse.accountNo) &&
        Objects.equals(this.externalId, getRecurringDepositAccountsAccountIdResponse.externalId) &&
        Objects.equals(this.clientId, getRecurringDepositAccountsAccountIdResponse.clientId) &&
        Objects.equals(this.clientName, getRecurringDepositAccountsAccountIdResponse.clientName) &&
        Objects.equals(this.savingsProductId, getRecurringDepositAccountsAccountIdResponse.savingsProductId) &&
        Objects.equals(this.savingsProductName, getRecurringDepositAccountsAccountIdResponse.savingsProductName) &&
        Objects.equals(this.fieldOfficerId, getRecurringDepositAccountsAccountIdResponse.fieldOfficerId) &&
        Objects.equals(this.status, getRecurringDepositAccountsAccountIdResponse.status) &&
        Objects.equals(this.timeline, getRecurringDepositAccountsAccountIdResponse.timeline) &&
        Objects.equals(this.currency, getRecurringDepositAccountsAccountIdResponse.currency) &&
        Objects.equals(this.interestCompoundingPeriodType, getRecurringDepositAccountsAccountIdResponse.interestCompoundingPeriodType) &&
        Objects.equals(this.interestPostingPeriodType, getRecurringDepositAccountsAccountIdResponse.interestPostingPeriodType) &&
        Objects.equals(this.interestCalculationType, getRecurringDepositAccountsAccountIdResponse.interestCalculationType) &&
        Objects.equals(this.interestCalculationDaysInYearType, getRecurringDepositAccountsAccountIdResponse.interestCalculationDaysInYearType) &&
        Objects.equals(this.preClosurePenalApplicable, getRecurringDepositAccountsAccountIdResponse.preClosurePenalApplicable) &&
        Objects.equals(this.minDepositTerm, getRecurringDepositAccountsAccountIdResponse.minDepositTerm) &&
        Objects.equals(this.maxDepositTerm, getRecurringDepositAccountsAccountIdResponse.maxDepositTerm) &&
        Objects.equals(this.minDepositTermType, getRecurringDepositAccountsAccountIdResponse.minDepositTermType) &&
        Objects.equals(this.maxDepositTermType, getRecurringDepositAccountsAccountIdResponse.maxDepositTermType) &&
        Objects.equals(this.recurringDepositAmount, getRecurringDepositAccountsAccountIdResponse.recurringDepositAmount) &&
        Objects.equals(this.recurringDepositFrequency, getRecurringDepositAccountsAccountIdResponse.recurringDepositFrequency) &&
        Objects.equals(this.expectedFirstDepositOnDate, getRecurringDepositAccountsAccountIdResponse.expectedFirstDepositOnDate) &&
        Objects.equals(this.recurringDepositFrequencyType, getRecurringDepositAccountsAccountIdResponse.recurringDepositFrequencyType) &&
        Objects.equals(this.depositPeriod, getRecurringDepositAccountsAccountIdResponse.depositPeriod) &&
        Objects.equals(this.depositPeriodFrequency, getRecurringDepositAccountsAccountIdResponse.depositPeriodFrequency) &&
        Objects.equals(this.summary, getRecurringDepositAccountsAccountIdResponse.summary) &&
        Objects.equals(this.accountChart, getRecurringDepositAccountsAccountIdResponse.accountChart);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, accountNo, externalId, clientId, clientName, savingsProductId, savingsProductName, fieldOfficerId, status, timeline, currency, interestCompoundingPeriodType, interestPostingPeriodType, interestCalculationType, interestCalculationDaysInYearType, preClosurePenalApplicable, minDepositTerm, maxDepositTerm, minDepositTermType, maxDepositTermType, recurringDepositAmount, recurringDepositFrequency, expectedFirstDepositOnDate, recurringDepositFrequencyType, depositPeriod, depositPeriodFrequency, summary, accountChart);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetRecurringDepositAccountsAccountIdResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    accountNo: ").append(toIndentedString(accountNo)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientName: ").append(toIndentedString(clientName)).append("\n");
    sb.append("    savingsProductId: ").append(toIndentedString(savingsProductId)).append("\n");
    sb.append("    savingsProductName: ").append(toIndentedString(savingsProductName)).append("\n");
    sb.append("    fieldOfficerId: ").append(toIndentedString(fieldOfficerId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    timeline: ").append(toIndentedString(timeline)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    interestCompoundingPeriodType: ").append(toIndentedString(interestCompoundingPeriodType)).append("\n");
    sb.append("    interestPostingPeriodType: ").append(toIndentedString(interestPostingPeriodType)).append("\n");
    sb.append("    interestCalculationType: ").append(toIndentedString(interestCalculationType)).append("\n");
    sb.append("    interestCalculationDaysInYearType: ").append(toIndentedString(interestCalculationDaysInYearType)).append("\n");
    sb.append("    preClosurePenalApplicable: ").append(toIndentedString(preClosurePenalApplicable)).append("\n");
    sb.append("    minDepositTerm: ").append(toIndentedString(minDepositTerm)).append("\n");
    sb.append("    maxDepositTerm: ").append(toIndentedString(maxDepositTerm)).append("\n");
    sb.append("    minDepositTermType: ").append(toIndentedString(minDepositTermType)).append("\n");
    sb.append("    maxDepositTermType: ").append(toIndentedString(maxDepositTermType)).append("\n");
    sb.append("    recurringDepositAmount: ").append(toIndentedString(recurringDepositAmount)).append("\n");
    sb.append("    recurringDepositFrequency: ").append(toIndentedString(recurringDepositFrequency)).append("\n");
    sb.append("    expectedFirstDepositOnDate: ").append(toIndentedString(expectedFirstDepositOnDate)).append("\n");
    sb.append("    recurringDepositFrequencyType: ").append(toIndentedString(recurringDepositFrequencyType)).append("\n");
    sb.append("    depositPeriod: ").append(toIndentedString(depositPeriod)).append("\n");
    sb.append("    depositPeriodFrequency: ").append(toIndentedString(depositPeriodFrequency)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    accountChart: ").append(toIndentedString(accountChart)).append("\n");
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
