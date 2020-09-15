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
 * PostAccountingRulesRequest
 */
@Schema(description = "PostAccountingRulesRequest")

public class PostAccountingRulesRequest {
  @SerializedName("name")
  private String name = null;

  @SerializedName("officeId")
  private Long officeId = null;

  @SerializedName("accountToDebit")
  private Long accountToDebit = null;

  @SerializedName("accountToCredit")
  private Long accountToCredit = null;

  @SerializedName("description")
  private String description = null;

  public PostAccountingRulesRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(example = "test", description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PostAccountingRulesRequest officeId(Long officeId) {
    this.officeId = officeId;
    return this;
  }

   /**
   * Get officeId
   * @return officeId
  **/
  @Schema(example = "1", description = "")
  public Long getOfficeId() {
    return officeId;
  }

  public void setOfficeId(Long officeId) {
    this.officeId = officeId;
  }

  public PostAccountingRulesRequest accountToDebit(Long accountToDebit) {
    this.accountToDebit = accountToDebit;
    return this;
  }

   /**
   * Get accountToDebit
   * @return accountToDebit
  **/
  @Schema(example = "21", description = "")
  public Long getAccountToDebit() {
    return accountToDebit;
  }

  public void setAccountToDebit(Long accountToDebit) {
    this.accountToDebit = accountToDebit;
  }

  public PostAccountingRulesRequest accountToCredit(Long accountToCredit) {
    this.accountToCredit = accountToCredit;
    return this;
  }

   /**
   * Get accountToCredit
   * @return accountToCredit
  **/
  @Schema(example = "9", description = "")
  public Long getAccountToCredit() {
    return accountToCredit;
  }

  public void setAccountToCredit(Long accountToCredit) {
    this.accountToCredit = accountToCredit;
  }

  public PostAccountingRulesRequest description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(example = "Employee salary", description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostAccountingRulesRequest postAccountingRulesRequest = (PostAccountingRulesRequest) o;
    return Objects.equals(this.name, postAccountingRulesRequest.name) &&
        Objects.equals(this.officeId, postAccountingRulesRequest.officeId) &&
        Objects.equals(this.accountToDebit, postAccountingRulesRequest.accountToDebit) &&
        Objects.equals(this.accountToCredit, postAccountingRulesRequest.accountToCredit) &&
        Objects.equals(this.description, postAccountingRulesRequest.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, officeId, accountToDebit, accountToCredit, description);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostAccountingRulesRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    officeId: ").append(toIndentedString(officeId)).append("\n");
    sb.append("    accountToDebit: ").append(toIndentedString(accountToDebit)).append("\n");
    sb.append("    accountToCredit: ").append(toIndentedString(accountToCredit)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
