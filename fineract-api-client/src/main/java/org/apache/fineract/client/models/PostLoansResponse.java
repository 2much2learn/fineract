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
import org.apache.fineract.client.models.GetLoansLoanIdCurrency;
import org.apache.fineract.client.models.PostLoansRepaymentSchedulePeriods;
/**
 * PostLoansResponse
 */
@Schema(description = "PostLoansResponse")

public class PostLoansResponse {
  @SerializedName("currency")
  private GetLoansLoanIdCurrency currency = null;

  @SerializedName("loanTermInDays")
  private Integer loanTermInDays = null;

  @SerializedName("totalPrincipalDisbursed")
  private Long totalPrincipalDisbursed = null;

  @SerializedName("totalPrincipalExpected")
  private Long totalPrincipalExpected = null;

  @SerializedName("totalPrincipalPaid")
  private Long totalPrincipalPaid = null;

  @SerializedName("totalInterestCharged")
  private Double totalInterestCharged = null;

  @SerializedName("totalFeeChargesCharged")
  private Long totalFeeChargesCharged = null;

  @SerializedName("totalPenaltyChargesCharged")
  private Long totalPenaltyChargesCharged = null;

  @SerializedName("totalWaived")
  private Long totalWaived = null;

  @SerializedName("totalWrittenOff")
  private Long totalWrittenOff = null;

  @SerializedName("totalRepaymentExpected")
  private Double totalRepaymentExpected = null;

  @SerializedName("totalRepayment")
  private Long totalRepayment = null;

  @SerializedName("totalOutstanding")
  private Long totalOutstanding = null;

  @SerializedName("periods")
  private List<PostLoansRepaymentSchedulePeriods> periods = null;

  public PostLoansResponse currency(GetLoansLoanIdCurrency currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @Schema(description = "")
  public GetLoansLoanIdCurrency getCurrency() {
    return currency;
  }

  public void setCurrency(GetLoansLoanIdCurrency currency) {
    this.currency = currency;
  }

  public PostLoansResponse loanTermInDays(Integer loanTermInDays) {
    this.loanTermInDays = loanTermInDays;
    return this;
  }

   /**
   * Get loanTermInDays
   * @return loanTermInDays
  **/
  @Schema(example = "366", description = "")
  public Integer getLoanTermInDays() {
    return loanTermInDays;
  }

  public void setLoanTermInDays(Integer loanTermInDays) {
    this.loanTermInDays = loanTermInDays;
  }

  public PostLoansResponse totalPrincipalDisbursed(Long totalPrincipalDisbursed) {
    this.totalPrincipalDisbursed = totalPrincipalDisbursed;
    return this;
  }

   /**
   * Get totalPrincipalDisbursed
   * @return totalPrincipalDisbursed
  **/
  @Schema(example = "100000", description = "")
  public Long getTotalPrincipalDisbursed() {
    return totalPrincipalDisbursed;
  }

  public void setTotalPrincipalDisbursed(Long totalPrincipalDisbursed) {
    this.totalPrincipalDisbursed = totalPrincipalDisbursed;
  }

  public PostLoansResponse totalPrincipalExpected(Long totalPrincipalExpected) {
    this.totalPrincipalExpected = totalPrincipalExpected;
    return this;
  }

   /**
   * Get totalPrincipalExpected
   * @return totalPrincipalExpected
  **/
  @Schema(example = "100000", description = "")
  public Long getTotalPrincipalExpected() {
    return totalPrincipalExpected;
  }

  public void setTotalPrincipalExpected(Long totalPrincipalExpected) {
    this.totalPrincipalExpected = totalPrincipalExpected;
  }

  public PostLoansResponse totalPrincipalPaid(Long totalPrincipalPaid) {
    this.totalPrincipalPaid = totalPrincipalPaid;
    return this;
  }

   /**
   * Get totalPrincipalPaid
   * @return totalPrincipalPaid
  **/
  @Schema(example = "0", description = "")
  public Long getTotalPrincipalPaid() {
    return totalPrincipalPaid;
  }

  public void setTotalPrincipalPaid(Long totalPrincipalPaid) {
    this.totalPrincipalPaid = totalPrincipalPaid;
  }

  public PostLoansResponse totalInterestCharged(Double totalInterestCharged) {
    this.totalInterestCharged = totalInterestCharged;
    return this;
  }

   /**
   * Get totalInterestCharged
   * @return totalInterestCharged
  **/
  @Schema(example = "13471.52", description = "")
  public Double getTotalInterestCharged() {
    return totalInterestCharged;
  }

  public void setTotalInterestCharged(Double totalInterestCharged) {
    this.totalInterestCharged = totalInterestCharged;
  }

  public PostLoansResponse totalFeeChargesCharged(Long totalFeeChargesCharged) {
    this.totalFeeChargesCharged = totalFeeChargesCharged;
    return this;
  }

   /**
   * Get totalFeeChargesCharged
   * @return totalFeeChargesCharged
  **/
  @Schema(example = "0", description = "")
  public Long getTotalFeeChargesCharged() {
    return totalFeeChargesCharged;
  }

  public void setTotalFeeChargesCharged(Long totalFeeChargesCharged) {
    this.totalFeeChargesCharged = totalFeeChargesCharged;
  }

  public PostLoansResponse totalPenaltyChargesCharged(Long totalPenaltyChargesCharged) {
    this.totalPenaltyChargesCharged = totalPenaltyChargesCharged;
    return this;
  }

   /**
   * Get totalPenaltyChargesCharged
   * @return totalPenaltyChargesCharged
  **/
  @Schema(example = "0", description = "")
  public Long getTotalPenaltyChargesCharged() {
    return totalPenaltyChargesCharged;
  }

  public void setTotalPenaltyChargesCharged(Long totalPenaltyChargesCharged) {
    this.totalPenaltyChargesCharged = totalPenaltyChargesCharged;
  }

  public PostLoansResponse totalWaived(Long totalWaived) {
    this.totalWaived = totalWaived;
    return this;
  }

   /**
   * Get totalWaived
   * @return totalWaived
  **/
  @Schema(example = "0", description = "")
  public Long getTotalWaived() {
    return totalWaived;
  }

  public void setTotalWaived(Long totalWaived) {
    this.totalWaived = totalWaived;
  }

  public PostLoansResponse totalWrittenOff(Long totalWrittenOff) {
    this.totalWrittenOff = totalWrittenOff;
    return this;
  }

   /**
   * Get totalWrittenOff
   * @return totalWrittenOff
  **/
  @Schema(example = "0", description = "")
  public Long getTotalWrittenOff() {
    return totalWrittenOff;
  }

  public void setTotalWrittenOff(Long totalWrittenOff) {
    this.totalWrittenOff = totalWrittenOff;
  }

  public PostLoansResponse totalRepaymentExpected(Double totalRepaymentExpected) {
    this.totalRepaymentExpected = totalRepaymentExpected;
    return this;
  }

   /**
   * Get totalRepaymentExpected
   * @return totalRepaymentExpected
  **/
  @Schema(example = "113471.52", description = "")
  public Double getTotalRepaymentExpected() {
    return totalRepaymentExpected;
  }

  public void setTotalRepaymentExpected(Double totalRepaymentExpected) {
    this.totalRepaymentExpected = totalRepaymentExpected;
  }

  public PostLoansResponse totalRepayment(Long totalRepayment) {
    this.totalRepayment = totalRepayment;
    return this;
  }

   /**
   * Get totalRepayment
   * @return totalRepayment
  **/
  @Schema(example = "0", description = "")
  public Long getTotalRepayment() {
    return totalRepayment;
  }

  public void setTotalRepayment(Long totalRepayment) {
    this.totalRepayment = totalRepayment;
  }

  public PostLoansResponse totalOutstanding(Long totalOutstanding) {
    this.totalOutstanding = totalOutstanding;
    return this;
  }

   /**
   * Get totalOutstanding
   * @return totalOutstanding
  **/
  @Schema(example = "0", description = "")
  public Long getTotalOutstanding() {
    return totalOutstanding;
  }

  public void setTotalOutstanding(Long totalOutstanding) {
    this.totalOutstanding = totalOutstanding;
  }

  public PostLoansResponse periods(List<PostLoansRepaymentSchedulePeriods> periods) {
    this.periods = periods;
    return this;
  }

  public PostLoansResponse addPeriodsItem(PostLoansRepaymentSchedulePeriods periodsItem) {
    if (this.periods == null) {
      this.periods = new ArrayList<>();
    }
    this.periods.add(periodsItem);
    return this;
  }

   /**
   * Get periods
   * @return periods
  **/
  @Schema(description = "")
  public List<PostLoansRepaymentSchedulePeriods> getPeriods() {
    return periods;
  }

  public void setPeriods(List<PostLoansRepaymentSchedulePeriods> periods) {
    this.periods = periods;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostLoansResponse postLoansResponse = (PostLoansResponse) o;
    return Objects.equals(this.currency, postLoansResponse.currency) &&
        Objects.equals(this.loanTermInDays, postLoansResponse.loanTermInDays) &&
        Objects.equals(this.totalPrincipalDisbursed, postLoansResponse.totalPrincipalDisbursed) &&
        Objects.equals(this.totalPrincipalExpected, postLoansResponse.totalPrincipalExpected) &&
        Objects.equals(this.totalPrincipalPaid, postLoansResponse.totalPrincipalPaid) &&
        Objects.equals(this.totalInterestCharged, postLoansResponse.totalInterestCharged) &&
        Objects.equals(this.totalFeeChargesCharged, postLoansResponse.totalFeeChargesCharged) &&
        Objects.equals(this.totalPenaltyChargesCharged, postLoansResponse.totalPenaltyChargesCharged) &&
        Objects.equals(this.totalWaived, postLoansResponse.totalWaived) &&
        Objects.equals(this.totalWrittenOff, postLoansResponse.totalWrittenOff) &&
        Objects.equals(this.totalRepaymentExpected, postLoansResponse.totalRepaymentExpected) &&
        Objects.equals(this.totalRepayment, postLoansResponse.totalRepayment) &&
        Objects.equals(this.totalOutstanding, postLoansResponse.totalOutstanding) &&
        Objects.equals(this.periods, postLoansResponse.periods);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currency, loanTermInDays, totalPrincipalDisbursed, totalPrincipalExpected, totalPrincipalPaid, totalInterestCharged, totalFeeChargesCharged, totalPenaltyChargesCharged, totalWaived, totalWrittenOff, totalRepaymentExpected, totalRepayment, totalOutstanding, periods);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostLoansResponse {\n");
    
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    loanTermInDays: ").append(toIndentedString(loanTermInDays)).append("\n");
    sb.append("    totalPrincipalDisbursed: ").append(toIndentedString(totalPrincipalDisbursed)).append("\n");
    sb.append("    totalPrincipalExpected: ").append(toIndentedString(totalPrincipalExpected)).append("\n");
    sb.append("    totalPrincipalPaid: ").append(toIndentedString(totalPrincipalPaid)).append("\n");
    sb.append("    totalInterestCharged: ").append(toIndentedString(totalInterestCharged)).append("\n");
    sb.append("    totalFeeChargesCharged: ").append(toIndentedString(totalFeeChargesCharged)).append("\n");
    sb.append("    totalPenaltyChargesCharged: ").append(toIndentedString(totalPenaltyChargesCharged)).append("\n");
    sb.append("    totalWaived: ").append(toIndentedString(totalWaived)).append("\n");
    sb.append("    totalWrittenOff: ").append(toIndentedString(totalWrittenOff)).append("\n");
    sb.append("    totalRepaymentExpected: ").append(toIndentedString(totalRepaymentExpected)).append("\n");
    sb.append("    totalRepayment: ").append(toIndentedString(totalRepayment)).append("\n");
    sb.append("    totalOutstanding: ").append(toIndentedString(totalOutstanding)).append("\n");
    sb.append("    periods: ").append(toIndentedString(periods)).append("\n");
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