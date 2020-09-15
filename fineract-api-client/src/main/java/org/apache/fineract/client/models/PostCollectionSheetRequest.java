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
import org.apache.fineract.client.models.PostCollectionSheetBulkRepaymentTransactions;
/**
 * PostCollectionSheetRequest
 */
@Schema(description = "PostCollectionSheetRequest")

public class PostCollectionSheetRequest {
  @SerializedName("dateFormat")
  private String dateFormat = null;

  @SerializedName("locale")
  private String locale = null;

  @SerializedName("transactionDate")
  private String transactionDate = null;

  @SerializedName("actualDisbursementDate")
  private String actualDisbursementDate = null;

  @SerializedName("bulkDisbursementTransactions")
  private List<Integer> bulkDisbursementTransactions = null;

  @SerializedName("bulkRepaymentTransactions")
  private PostCollectionSheetBulkRepaymentTransactions bulkRepaymentTransactions = null;

  @SerializedName("bulkSavingsDueTransactions")
  private List<Integer> bulkSavingsDueTransactions = null;

  public PostCollectionSheetRequest dateFormat(String dateFormat) {
    this.dateFormat = dateFormat;
    return this;
  }

   /**
   * Get dateFormat
   * @return dateFormat
  **/
  @Schema(example = "dd MMMM yyyy", description = "")
  public String getDateFormat() {
    return dateFormat;
  }

  public void setDateFormat(String dateFormat) {
    this.dateFormat = dateFormat;
  }

  public PostCollectionSheetRequest locale(String locale) {
    this.locale = locale;
    return this;
  }

   /**
   * Get locale
   * @return locale
  **/
  @Schema(example = "en", description = "")
  public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }

  public PostCollectionSheetRequest transactionDate(String transactionDate) {
    this.transactionDate = transactionDate;
    return this;
  }

   /**
   * Get transactionDate
   * @return transactionDate
  **/
  @Schema(example = "04 May 2014", description = "")
  public String getTransactionDate() {
    return transactionDate;
  }

  public void setTransactionDate(String transactionDate) {
    this.transactionDate = transactionDate;
  }

  public PostCollectionSheetRequest actualDisbursementDate(String actualDisbursementDate) {
    this.actualDisbursementDate = actualDisbursementDate;
    return this;
  }

   /**
   * Get actualDisbursementDate
   * @return actualDisbursementDate
  **/
  @Schema(example = "04 May 2014", description = "")
  public String getActualDisbursementDate() {
    return actualDisbursementDate;
  }

  public void setActualDisbursementDate(String actualDisbursementDate) {
    this.actualDisbursementDate = actualDisbursementDate;
  }

  public PostCollectionSheetRequest bulkDisbursementTransactions(List<Integer> bulkDisbursementTransactions) {
    this.bulkDisbursementTransactions = bulkDisbursementTransactions;
    return this;
  }

  public PostCollectionSheetRequest addBulkDisbursementTransactionsItem(Integer bulkDisbursementTransactionsItem) {
    if (this.bulkDisbursementTransactions == null) {
      this.bulkDisbursementTransactions = new ArrayList<>();
    }
    this.bulkDisbursementTransactions.add(bulkDisbursementTransactionsItem);
    return this;
  }

   /**
   * Get bulkDisbursementTransactions
   * @return bulkDisbursementTransactions
  **/
  @Schema(description = "")
  public List<Integer> getBulkDisbursementTransactions() {
    return bulkDisbursementTransactions;
  }

  public void setBulkDisbursementTransactions(List<Integer> bulkDisbursementTransactions) {
    this.bulkDisbursementTransactions = bulkDisbursementTransactions;
  }

  public PostCollectionSheetRequest bulkRepaymentTransactions(PostCollectionSheetBulkRepaymentTransactions bulkRepaymentTransactions) {
    this.bulkRepaymentTransactions = bulkRepaymentTransactions;
    return this;
  }

   /**
   * Get bulkRepaymentTransactions
   * @return bulkRepaymentTransactions
  **/
  @Schema(description = "")
  public PostCollectionSheetBulkRepaymentTransactions getBulkRepaymentTransactions() {
    return bulkRepaymentTransactions;
  }

  public void setBulkRepaymentTransactions(PostCollectionSheetBulkRepaymentTransactions bulkRepaymentTransactions) {
    this.bulkRepaymentTransactions = bulkRepaymentTransactions;
  }

  public PostCollectionSheetRequest bulkSavingsDueTransactions(List<Integer> bulkSavingsDueTransactions) {
    this.bulkSavingsDueTransactions = bulkSavingsDueTransactions;
    return this;
  }

  public PostCollectionSheetRequest addBulkSavingsDueTransactionsItem(Integer bulkSavingsDueTransactionsItem) {
    if (this.bulkSavingsDueTransactions == null) {
      this.bulkSavingsDueTransactions = new ArrayList<>();
    }
    this.bulkSavingsDueTransactions.add(bulkSavingsDueTransactionsItem);
    return this;
  }

   /**
   * Get bulkSavingsDueTransactions
   * @return bulkSavingsDueTransactions
  **/
  @Schema(description = "")
  public List<Integer> getBulkSavingsDueTransactions() {
    return bulkSavingsDueTransactions;
  }

  public void setBulkSavingsDueTransactions(List<Integer> bulkSavingsDueTransactions) {
    this.bulkSavingsDueTransactions = bulkSavingsDueTransactions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostCollectionSheetRequest postCollectionSheetRequest = (PostCollectionSheetRequest) o;
    return Objects.equals(this.dateFormat, postCollectionSheetRequest.dateFormat) &&
        Objects.equals(this.locale, postCollectionSheetRequest.locale) &&
        Objects.equals(this.transactionDate, postCollectionSheetRequest.transactionDate) &&
        Objects.equals(this.actualDisbursementDate, postCollectionSheetRequest.actualDisbursementDate) &&
        Objects.equals(this.bulkDisbursementTransactions, postCollectionSheetRequest.bulkDisbursementTransactions) &&
        Objects.equals(this.bulkRepaymentTransactions, postCollectionSheetRequest.bulkRepaymentTransactions) &&
        Objects.equals(this.bulkSavingsDueTransactions, postCollectionSheetRequest.bulkSavingsDueTransactions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateFormat, locale, transactionDate, actualDisbursementDate, bulkDisbursementTransactions, bulkRepaymentTransactions, bulkSavingsDueTransactions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostCollectionSheetRequest {\n");
    
    sb.append("    dateFormat: ").append(toIndentedString(dateFormat)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    transactionDate: ").append(toIndentedString(transactionDate)).append("\n");
    sb.append("    actualDisbursementDate: ").append(toIndentedString(actualDisbursementDate)).append("\n");
    sb.append("    bulkDisbursementTransactions: ").append(toIndentedString(bulkDisbursementTransactions)).append("\n");
    sb.append("    bulkRepaymentTransactions: ").append(toIndentedString(bulkRepaymentTransactions)).append("\n");
    sb.append("    bulkSavingsDueTransactions: ").append(toIndentedString(bulkSavingsDueTransactions)).append("\n");
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
