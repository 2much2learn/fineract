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
import org.apache.fineract.client.models.GetLoansTemplateProductOptions;
import org.apache.fineract.client.models.GetLoansTemplateTimeline;
/**
 * GetLoansTemplateResponse
 */
@Schema(description = "GetLoansTemplateResponse")

public class GetLoansTemplateResponse {
  @SerializedName("clientId")
  private Long clientId = null;

  @SerializedName("clientName")
  private String clientName = null;

  @SerializedName("clientOfficeId")
  private Integer clientOfficeId = null;

  @SerializedName("timeline")
  private GetLoansTemplateTimeline timeline = null;

  @SerializedName("productOptions")
  private List<GetLoansTemplateProductOptions> productOptions = null;

  public GetLoansTemplateResponse clientId(Long clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * Get clientId
   * @return clientId
  **/
  @Schema(example = "1", description = "")
  public Long getClientId() {
    return clientId;
  }

  public void setClientId(Long clientId) {
    this.clientId = clientId;
  }

  public GetLoansTemplateResponse clientName(String clientName) {
    this.clientName = clientName;
    return this;
  }

   /**
   * Get clientName
   * @return clientName
  **/
  @Schema(example = "Kampala first Client", description = "")
  public String getClientName() {
    return clientName;
  }

  public void setClientName(String clientName) {
    this.clientName = clientName;
  }

  public GetLoansTemplateResponse clientOfficeId(Integer clientOfficeId) {
    this.clientOfficeId = clientOfficeId;
    return this;
  }

   /**
   * Get clientOfficeId
   * @return clientOfficeId
  **/
  @Schema(example = "2", description = "")
  public Integer getClientOfficeId() {
    return clientOfficeId;
  }

  public void setClientOfficeId(Integer clientOfficeId) {
    this.clientOfficeId = clientOfficeId;
  }

  public GetLoansTemplateResponse timeline(GetLoansTemplateTimeline timeline) {
    this.timeline = timeline;
    return this;
  }

   /**
   * Get timeline
   * @return timeline
  **/
  @Schema(description = "")
  public GetLoansTemplateTimeline getTimeline() {
    return timeline;
  }

  public void setTimeline(GetLoansTemplateTimeline timeline) {
    this.timeline = timeline;
  }

  public GetLoansTemplateResponse productOptions(List<GetLoansTemplateProductOptions> productOptions) {
    this.productOptions = productOptions;
    return this;
  }

  public GetLoansTemplateResponse addProductOptionsItem(GetLoansTemplateProductOptions productOptionsItem) {
    if (this.productOptions == null) {
      this.productOptions = new ArrayList<>();
    }
    this.productOptions.add(productOptionsItem);
    return this;
  }

   /**
   * Get productOptions
   * @return productOptions
  **/
  @Schema(description = "")
  public List<GetLoansTemplateProductOptions> getProductOptions() {
    return productOptions;
  }

  public void setProductOptions(List<GetLoansTemplateProductOptions> productOptions) {
    this.productOptions = productOptions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetLoansTemplateResponse getLoansTemplateResponse = (GetLoansTemplateResponse) o;
    return Objects.equals(this.clientId, getLoansTemplateResponse.clientId) &&
        Objects.equals(this.clientName, getLoansTemplateResponse.clientName) &&
        Objects.equals(this.clientOfficeId, getLoansTemplateResponse.clientOfficeId) &&
        Objects.equals(this.timeline, getLoansTemplateResponse.timeline) &&
        Objects.equals(this.productOptions, getLoansTemplateResponse.productOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, clientName, clientOfficeId, timeline, productOptions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetLoansTemplateResponse {\n");
    
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientName: ").append(toIndentedString(clientName)).append("\n");
    sb.append("    clientOfficeId: ").append(toIndentedString(clientOfficeId)).append("\n");
    sb.append("    timeline: ").append(toIndentedString(timeline)).append("\n");
    sb.append("    productOptions: ").append(toIndentedString(productOptions)).append("\n");
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