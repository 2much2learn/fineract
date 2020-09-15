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
import org.apache.fineract.client.models.GetRecurringProductOptions;
/**
 * GetRecurringDepositAccountsTemplateResponse
 */
@Schema(description = "GetRecurringDepositAccountsTemplateResponse")

public class GetRecurringDepositAccountsTemplateResponse {
  @SerializedName("clientId")
  private Integer clientId = null;

  @SerializedName("clientName")
  private String clientName = null;

  @SerializedName("productOptions")
  private List<GetRecurringProductOptions> productOptions = null;

  public GetRecurringDepositAccountsTemplateResponse clientId(Integer clientId) {
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

  public GetRecurringDepositAccountsTemplateResponse clientName(String clientName) {
    this.clientName = clientName;
    return this;
  }

   /**
   * Get clientName
   * @return clientName
  **/
  @Schema(example = "small business", description = "")
  public String getClientName() {
    return clientName;
  }

  public void setClientName(String clientName) {
    this.clientName = clientName;
  }

  public GetRecurringDepositAccountsTemplateResponse productOptions(List<GetRecurringProductOptions> productOptions) {
    this.productOptions = productOptions;
    return this;
  }

  public GetRecurringDepositAccountsTemplateResponse addProductOptionsItem(GetRecurringProductOptions productOptionsItem) {
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
  public List<GetRecurringProductOptions> getProductOptions() {
    return productOptions;
  }

  public void setProductOptions(List<GetRecurringProductOptions> productOptions) {
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
    GetRecurringDepositAccountsTemplateResponse getRecurringDepositAccountsTemplateResponse = (GetRecurringDepositAccountsTemplateResponse) o;
    return Objects.equals(this.clientId, getRecurringDepositAccountsTemplateResponse.clientId) &&
        Objects.equals(this.clientName, getRecurringDepositAccountsTemplateResponse.clientName) &&
        Objects.equals(this.productOptions, getRecurringDepositAccountsTemplateResponse.productOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, clientName, productOptions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetRecurringDepositAccountsTemplateResponse {\n");
    
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientName: ").append(toIndentedString(clientName)).append("\n");
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
