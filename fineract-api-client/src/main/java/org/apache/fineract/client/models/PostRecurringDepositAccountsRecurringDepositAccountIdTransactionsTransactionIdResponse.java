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
import org.apache.fineract.client.models.PostRecurringChanges;
/**
 * PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse
 */
@Schema(description = "PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse")

public class PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse {
  @SerializedName("officeId")
  private Integer officeId = null;

  @SerializedName("clientId")
  private Integer clientId = null;

  @SerializedName("savingsId")
  private Integer savingsId = null;

  @SerializedName("resourceId")
  private Integer resourceId = null;

  @SerializedName("changes")
  private PostRecurringChanges changes = null;

  public PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse officeId(Integer officeId) {
    this.officeId = officeId;
    return this;
  }

   /**
   * Get officeId
   * @return officeId
  **/
  @Schema(example = "1", description = "")
  public Integer getOfficeId() {
    return officeId;
  }

  public void setOfficeId(Integer officeId) {
    this.officeId = officeId;
  }

  public PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse clientId(Integer clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * Get clientId
   * @return clientId
  **/
  @Schema(example = "2", description = "")
  public Integer getClientId() {
    return clientId;
  }

  public void setClientId(Integer clientId) {
    this.clientId = clientId;
  }

  public PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse savingsId(Integer savingsId) {
    this.savingsId = savingsId;
    return this;
  }

   /**
   * Get savingsId
   * @return savingsId
  **/
  @Schema(example = "1", description = "")
  public Integer getSavingsId() {
    return savingsId;
  }

  public void setSavingsId(Integer savingsId) {
    this.savingsId = savingsId;
  }

  public PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse resourceId(Integer resourceId) {
    this.resourceId = resourceId;
    return this;
  }

   /**
   * Get resourceId
   * @return resourceId
  **/
  @Schema(example = "48", description = "")
  public Integer getResourceId() {
    return resourceId;
  }

  public void setResourceId(Integer resourceId) {
    this.resourceId = resourceId;
  }

  public PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse changes(PostRecurringChanges changes) {
    this.changes = changes;
    return this;
  }

   /**
   * Get changes
   * @return changes
  **/
  @Schema(description = "")
  public PostRecurringChanges getChanges() {
    return changes;
  }

  public void setChanges(PostRecurringChanges changes) {
    this.changes = changes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse postRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse = (PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse) o;
    return Objects.equals(this.officeId, postRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse.officeId) &&
        Objects.equals(this.clientId, postRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse.clientId) &&
        Objects.equals(this.savingsId, postRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse.savingsId) &&
        Objects.equals(this.resourceId, postRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse.resourceId) &&
        Objects.equals(this.changes, postRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse.changes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(officeId, clientId, savingsId, resourceId, changes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse {\n");
    
    sb.append("    officeId: ").append(toIndentedString(officeId)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    savingsId: ").append(toIndentedString(savingsId)).append("\n");
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    changes: ").append(toIndentedString(changes)).append("\n");
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
