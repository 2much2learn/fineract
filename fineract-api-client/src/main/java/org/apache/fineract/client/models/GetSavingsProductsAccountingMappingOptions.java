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
import org.apache.fineract.client.models.GetSavingsProductsAssetAccountOptions;
import org.apache.fineract.client.models.GetSavingsProductsExpenseAccountOptions;
import org.apache.fineract.client.models.GetSavingsProductsIncomeAccountOptions;
import org.apache.fineract.client.models.GetSavingsProductsLiabilityAccountOptions;
/**
 * GetSavingsProductsAccountingMappingOptions
 */


public class GetSavingsProductsAccountingMappingOptions {
  @SerializedName("liabilityAccountOptions")
  private List<GetSavingsProductsLiabilityAccountOptions> liabilityAccountOptions = null;

  @SerializedName("assetAccountOptions")
  private List<GetSavingsProductsAssetAccountOptions> assetAccountOptions = null;

  @SerializedName("expenseAccountOptions")
  private List<GetSavingsProductsExpenseAccountOptions> expenseAccountOptions = null;

  @SerializedName("incomeAccountOptions")
  private List<GetSavingsProductsIncomeAccountOptions> incomeAccountOptions = null;

  public GetSavingsProductsAccountingMappingOptions liabilityAccountOptions(List<GetSavingsProductsLiabilityAccountOptions> liabilityAccountOptions) {
    this.liabilityAccountOptions = liabilityAccountOptions;
    return this;
  }

  public GetSavingsProductsAccountingMappingOptions addLiabilityAccountOptionsItem(GetSavingsProductsLiabilityAccountOptions liabilityAccountOptionsItem) {
    if (this.liabilityAccountOptions == null) {
      this.liabilityAccountOptions = new ArrayList<>();
    }
    this.liabilityAccountOptions.add(liabilityAccountOptionsItem);
    return this;
  }

   /**
   * Get liabilityAccountOptions
   * @return liabilityAccountOptions
  **/
  @Schema(description = "")
  public List<GetSavingsProductsLiabilityAccountOptions> getLiabilityAccountOptions() {
    return liabilityAccountOptions;
  }

  public void setLiabilityAccountOptions(List<GetSavingsProductsLiabilityAccountOptions> liabilityAccountOptions) {
    this.liabilityAccountOptions = liabilityAccountOptions;
  }

  public GetSavingsProductsAccountingMappingOptions assetAccountOptions(List<GetSavingsProductsAssetAccountOptions> assetAccountOptions) {
    this.assetAccountOptions = assetAccountOptions;
    return this;
  }

  public GetSavingsProductsAccountingMappingOptions addAssetAccountOptionsItem(GetSavingsProductsAssetAccountOptions assetAccountOptionsItem) {
    if (this.assetAccountOptions == null) {
      this.assetAccountOptions = new ArrayList<>();
    }
    this.assetAccountOptions.add(assetAccountOptionsItem);
    return this;
  }

   /**
   * Get assetAccountOptions
   * @return assetAccountOptions
  **/
  @Schema(description = "")
  public List<GetSavingsProductsAssetAccountOptions> getAssetAccountOptions() {
    return assetAccountOptions;
  }

  public void setAssetAccountOptions(List<GetSavingsProductsAssetAccountOptions> assetAccountOptions) {
    this.assetAccountOptions = assetAccountOptions;
  }

  public GetSavingsProductsAccountingMappingOptions expenseAccountOptions(List<GetSavingsProductsExpenseAccountOptions> expenseAccountOptions) {
    this.expenseAccountOptions = expenseAccountOptions;
    return this;
  }

  public GetSavingsProductsAccountingMappingOptions addExpenseAccountOptionsItem(GetSavingsProductsExpenseAccountOptions expenseAccountOptionsItem) {
    if (this.expenseAccountOptions == null) {
      this.expenseAccountOptions = new ArrayList<>();
    }
    this.expenseAccountOptions.add(expenseAccountOptionsItem);
    return this;
  }

   /**
   * Get expenseAccountOptions
   * @return expenseAccountOptions
  **/
  @Schema(description = "")
  public List<GetSavingsProductsExpenseAccountOptions> getExpenseAccountOptions() {
    return expenseAccountOptions;
  }

  public void setExpenseAccountOptions(List<GetSavingsProductsExpenseAccountOptions> expenseAccountOptions) {
    this.expenseAccountOptions = expenseAccountOptions;
  }

  public GetSavingsProductsAccountingMappingOptions incomeAccountOptions(List<GetSavingsProductsIncomeAccountOptions> incomeAccountOptions) {
    this.incomeAccountOptions = incomeAccountOptions;
    return this;
  }

  public GetSavingsProductsAccountingMappingOptions addIncomeAccountOptionsItem(GetSavingsProductsIncomeAccountOptions incomeAccountOptionsItem) {
    if (this.incomeAccountOptions == null) {
      this.incomeAccountOptions = new ArrayList<>();
    }
    this.incomeAccountOptions.add(incomeAccountOptionsItem);
    return this;
  }

   /**
   * Get incomeAccountOptions
   * @return incomeAccountOptions
  **/
  @Schema(description = "")
  public List<GetSavingsProductsIncomeAccountOptions> getIncomeAccountOptions() {
    return incomeAccountOptions;
  }

  public void setIncomeAccountOptions(List<GetSavingsProductsIncomeAccountOptions> incomeAccountOptions) {
    this.incomeAccountOptions = incomeAccountOptions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetSavingsProductsAccountingMappingOptions getSavingsProductsAccountingMappingOptions = (GetSavingsProductsAccountingMappingOptions) o;
    return Objects.equals(this.liabilityAccountOptions, getSavingsProductsAccountingMappingOptions.liabilityAccountOptions) &&
        Objects.equals(this.assetAccountOptions, getSavingsProductsAccountingMappingOptions.assetAccountOptions) &&
        Objects.equals(this.expenseAccountOptions, getSavingsProductsAccountingMappingOptions.expenseAccountOptions) &&
        Objects.equals(this.incomeAccountOptions, getSavingsProductsAccountingMappingOptions.incomeAccountOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(liabilityAccountOptions, assetAccountOptions, expenseAccountOptions, incomeAccountOptions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetSavingsProductsAccountingMappingOptions {\n");
    
    sb.append("    liabilityAccountOptions: ").append(toIndentedString(liabilityAccountOptions)).append("\n");
    sb.append("    assetAccountOptions: ").append(toIndentedString(assetAccountOptions)).append("\n");
    sb.append("    expenseAccountOptions: ").append(toIndentedString(expenseAccountOptions)).append("\n");
    sb.append("    incomeAccountOptions: ").append(toIndentedString(incomeAccountOptions)).append("\n");
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
