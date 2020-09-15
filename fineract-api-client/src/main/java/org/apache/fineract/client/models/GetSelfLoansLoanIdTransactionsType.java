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
 * GetSelfLoansLoanIdTransactionsType
 */


public class GetSelfLoansLoanIdTransactionsType {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("code")
  private String code = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("disbursement")
  private Boolean disbursement = null;

  @SerializedName("repaymentAtDisbursement")
  private Boolean repaymentAtDisbursement = null;

  @SerializedName("repayment")
  private Boolean repayment = null;

  @SerializedName("contra")
  private Boolean contra = null;

  @SerializedName("waiveInterest")
  private Boolean waiveInterest = null;

  @SerializedName("waiveCharges")
  private Boolean waiveCharges = null;

  @SerializedName("writeOff")
  private Boolean writeOff = null;

  @SerializedName("recoveryRepayment")
  private Boolean recoveryRepayment = null;

  public GetSelfLoansLoanIdTransactionsType id(Integer id) {
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

  public GetSelfLoansLoanIdTransactionsType code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @Schema(example = "loanTransactionType.repayment", description = "")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public GetSelfLoansLoanIdTransactionsType description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(example = "Repayment", description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public GetSelfLoansLoanIdTransactionsType disbursement(Boolean disbursement) {
    this.disbursement = disbursement;
    return this;
  }

   /**
   * Get disbursement
   * @return disbursement
  **/
  @Schema(example = "false", description = "")
  public Boolean isDisbursement() {
    return disbursement;
  }

  public void setDisbursement(Boolean disbursement) {
    this.disbursement = disbursement;
  }

  public GetSelfLoansLoanIdTransactionsType repaymentAtDisbursement(Boolean repaymentAtDisbursement) {
    this.repaymentAtDisbursement = repaymentAtDisbursement;
    return this;
  }

   /**
   * Get repaymentAtDisbursement
   * @return repaymentAtDisbursement
  **/
  @Schema(example = "false", description = "")
  public Boolean isRepaymentAtDisbursement() {
    return repaymentAtDisbursement;
  }

  public void setRepaymentAtDisbursement(Boolean repaymentAtDisbursement) {
    this.repaymentAtDisbursement = repaymentAtDisbursement;
  }

  public GetSelfLoansLoanIdTransactionsType repayment(Boolean repayment) {
    this.repayment = repayment;
    return this;
  }

   /**
   * Get repayment
   * @return repayment
  **/
  @Schema(example = "true", description = "")
  public Boolean isRepayment() {
    return repayment;
  }

  public void setRepayment(Boolean repayment) {
    this.repayment = repayment;
  }

  public GetSelfLoansLoanIdTransactionsType contra(Boolean contra) {
    this.contra = contra;
    return this;
  }

   /**
   * Get contra
   * @return contra
  **/
  @Schema(example = "false", description = "")
  public Boolean isContra() {
    return contra;
  }

  public void setContra(Boolean contra) {
    this.contra = contra;
  }

  public GetSelfLoansLoanIdTransactionsType waiveInterest(Boolean waiveInterest) {
    this.waiveInterest = waiveInterest;
    return this;
  }

   /**
   * Get waiveInterest
   * @return waiveInterest
  **/
  @Schema(example = "false", description = "")
  public Boolean isWaiveInterest() {
    return waiveInterest;
  }

  public void setWaiveInterest(Boolean waiveInterest) {
    this.waiveInterest = waiveInterest;
  }

  public GetSelfLoansLoanIdTransactionsType waiveCharges(Boolean waiveCharges) {
    this.waiveCharges = waiveCharges;
    return this;
  }

   /**
   * Get waiveCharges
   * @return waiveCharges
  **/
  @Schema(example = "false", description = "")
  public Boolean isWaiveCharges() {
    return waiveCharges;
  }

  public void setWaiveCharges(Boolean waiveCharges) {
    this.waiveCharges = waiveCharges;
  }

  public GetSelfLoansLoanIdTransactionsType writeOff(Boolean writeOff) {
    this.writeOff = writeOff;
    return this;
  }

   /**
   * Get writeOff
   * @return writeOff
  **/
  @Schema(example = "false", description = "")
  public Boolean isWriteOff() {
    return writeOff;
  }

  public void setWriteOff(Boolean writeOff) {
    this.writeOff = writeOff;
  }

  public GetSelfLoansLoanIdTransactionsType recoveryRepayment(Boolean recoveryRepayment) {
    this.recoveryRepayment = recoveryRepayment;
    return this;
  }

   /**
   * Get recoveryRepayment
   * @return recoveryRepayment
  **/
  @Schema(example = "false", description = "")
  public Boolean isRecoveryRepayment() {
    return recoveryRepayment;
  }

  public void setRecoveryRepayment(Boolean recoveryRepayment) {
    this.recoveryRepayment = recoveryRepayment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetSelfLoansLoanIdTransactionsType getSelfLoansLoanIdTransactionsType = (GetSelfLoansLoanIdTransactionsType) o;
    return Objects.equals(this.id, getSelfLoansLoanIdTransactionsType.id) &&
        Objects.equals(this.code, getSelfLoansLoanIdTransactionsType.code) &&
        Objects.equals(this.description, getSelfLoansLoanIdTransactionsType.description) &&
        Objects.equals(this.disbursement, getSelfLoansLoanIdTransactionsType.disbursement) &&
        Objects.equals(this.repaymentAtDisbursement, getSelfLoansLoanIdTransactionsType.repaymentAtDisbursement) &&
        Objects.equals(this.repayment, getSelfLoansLoanIdTransactionsType.repayment) &&
        Objects.equals(this.contra, getSelfLoansLoanIdTransactionsType.contra) &&
        Objects.equals(this.waiveInterest, getSelfLoansLoanIdTransactionsType.waiveInterest) &&
        Objects.equals(this.waiveCharges, getSelfLoansLoanIdTransactionsType.waiveCharges) &&
        Objects.equals(this.writeOff, getSelfLoansLoanIdTransactionsType.writeOff) &&
        Objects.equals(this.recoveryRepayment, getSelfLoansLoanIdTransactionsType.recoveryRepayment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, code, description, disbursement, repaymentAtDisbursement, repayment, contra, waiveInterest, waiveCharges, writeOff, recoveryRepayment);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetSelfLoansLoanIdTransactionsType {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    disbursement: ").append(toIndentedString(disbursement)).append("\n");
    sb.append("    repaymentAtDisbursement: ").append(toIndentedString(repaymentAtDisbursement)).append("\n");
    sb.append("    repayment: ").append(toIndentedString(repayment)).append("\n");
    sb.append("    contra: ").append(toIndentedString(contra)).append("\n");
    sb.append("    waiveInterest: ").append(toIndentedString(waiveInterest)).append("\n");
    sb.append("    waiveCharges: ").append(toIndentedString(waiveCharges)).append("\n");
    sb.append("    writeOff: ").append(toIndentedString(writeOff)).append("\n");
    sb.append("    recoveryRepayment: ").append(toIndentedString(recoveryRepayment)).append("\n");
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
