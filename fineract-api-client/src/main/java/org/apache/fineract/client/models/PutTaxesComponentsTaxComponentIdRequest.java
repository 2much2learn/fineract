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
 * PutTaxesComponentsTaxComponentIdRequest
 */
@Schema(description = "PutTaxesComponentsTaxComponentIdRequest")

public class PutTaxesComponentsTaxComponentIdRequest {
  @SerializedName("name")
  private String name = null;

  @SerializedName("percentage")
  private Float percentage = null;

  @SerializedName("locale")
  private String locale = null;

  @SerializedName("dateFormat")
  private String dateFormat = null;

  @SerializedName("startDate")
  private String startDate = null;

  public PutTaxesComponentsTaxComponentIdRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(example = "tax component 2", description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PutTaxesComponentsTaxComponentIdRequest percentage(Float percentage) {
    this.percentage = percentage;
    return this;
  }

   /**
   * Get percentage
   * @return percentage
  **/
  @Schema(example = "15", description = "")
  public Float getPercentage() {
    return percentage;
  }

  public void setPercentage(Float percentage) {
    this.percentage = percentage;
  }

  public PutTaxesComponentsTaxComponentIdRequest locale(String locale) {
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

  public PutTaxesComponentsTaxComponentIdRequest dateFormat(String dateFormat) {
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

  public PutTaxesComponentsTaxComponentIdRequest startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @Schema(example = "15 April 2016", description = "")
  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PutTaxesComponentsTaxComponentIdRequest putTaxesComponentsTaxComponentIdRequest = (PutTaxesComponentsTaxComponentIdRequest) o;
    return Objects.equals(this.name, putTaxesComponentsTaxComponentIdRequest.name) &&
        Objects.equals(this.percentage, putTaxesComponentsTaxComponentIdRequest.percentage) &&
        Objects.equals(this.locale, putTaxesComponentsTaxComponentIdRequest.locale) &&
        Objects.equals(this.dateFormat, putTaxesComponentsTaxComponentIdRequest.dateFormat) &&
        Objects.equals(this.startDate, putTaxesComponentsTaxComponentIdRequest.startDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, percentage, locale, dateFormat, startDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PutTaxesComponentsTaxComponentIdRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    dateFormat: ").append(toIndentedString(dateFormat)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
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
