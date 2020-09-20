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
import java.time.OffsetDateTime;
import org.apache.fineract.client.models.AppUser;
import org.apache.fineract.client.models.TaxComponent;
/**
 * TaxGroupMappings
 */


public class TaxGroupMappings {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("createdBy")
  private AppUser createdBy = null;

  @SerializedName("createdDate")
  private OffsetDateTime createdDate = null;

  @SerializedName("lastModifiedBy")
  private AppUser lastModifiedBy = null;

  @SerializedName("lastModifiedDate")
  private OffsetDateTime lastModifiedDate = null;

  @SerializedName("taxComponent")
  private TaxComponent taxComponent = null;

  @SerializedName("endDate")
  private OffsetDateTime endDate = null;

  @SerializedName("new")
  private Boolean _new = null;

  public TaxGroupMappings id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public TaxGroupMappings createdBy(AppUser createdBy) {
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Get createdBy
   * @return createdBy
  **/
  @Schema(description = "")
  public AppUser getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(AppUser createdBy) {
    this.createdBy = createdBy;
  }

  public TaxGroupMappings createdDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
    return this;
  }

   /**
   * Get createdDate
   * @return createdDate
  **/
  @Schema(description = "")
  public OffsetDateTime getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
  }

  public TaxGroupMappings lastModifiedBy(AppUser lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
    return this;
  }

   /**
   * Get lastModifiedBy
   * @return lastModifiedBy
  **/
  @Schema(description = "")
  public AppUser getLastModifiedBy() {
    return lastModifiedBy;
  }

  public void setLastModifiedBy(AppUser lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
  }

  public TaxGroupMappings lastModifiedDate(OffsetDateTime lastModifiedDate) {
    this.lastModifiedDate = lastModifiedDate;
    return this;
  }

   /**
   * Get lastModifiedDate
   * @return lastModifiedDate
  **/
  @Schema(description = "")
  public OffsetDateTime getLastModifiedDate() {
    return lastModifiedDate;
  }

  public void setLastModifiedDate(OffsetDateTime lastModifiedDate) {
    this.lastModifiedDate = lastModifiedDate;
  }

  public TaxGroupMappings taxComponent(TaxComponent taxComponent) {
    this.taxComponent = taxComponent;
    return this;
  }

   /**
   * Get taxComponent
   * @return taxComponent
  **/
  @Schema(description = "")
  public TaxComponent getTaxComponent() {
    return taxComponent;
  }

  public void setTaxComponent(TaxComponent taxComponent) {
    this.taxComponent = taxComponent;
  }

  public TaxGroupMappings endDate(OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Get endDate
   * @return endDate
  **/
  @Schema(description = "")
  public OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }

  public TaxGroupMappings _new(Boolean _new) {
    this._new = _new;
    return this;
  }

   /**
   * Get _new
   * @return _new
  **/
  @Schema(description = "")
  public Boolean isNew() {
    return _new;
  }

  public void setNew(Boolean _new) {
    this._new = _new;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaxGroupMappings taxGroupMappings = (TaxGroupMappings) o;
    return Objects.equals(this.id, taxGroupMappings.id) &&
        Objects.equals(this.createdBy, taxGroupMappings.createdBy) &&
        Objects.equals(this.createdDate, taxGroupMappings.createdDate) &&
        Objects.equals(this.lastModifiedBy, taxGroupMappings.lastModifiedBy) &&
        Objects.equals(this.lastModifiedDate, taxGroupMappings.lastModifiedDate) &&
        Objects.equals(this.taxComponent, taxGroupMappings.taxComponent) &&
        Objects.equals(this.endDate, taxGroupMappings.endDate) &&
        Objects.equals(this._new, taxGroupMappings._new);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdBy, createdDate, lastModifiedBy, lastModifiedDate, taxComponent, endDate, _new);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxGroupMappings {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    lastModifiedBy: ").append(toIndentedString(lastModifiedBy)).append("\n");
    sb.append("    lastModifiedDate: ").append(toIndentedString(lastModifiedDate)).append("\n");
    sb.append("    taxComponent: ").append(toIndentedString(taxComponent)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    _new: ").append(toIndentedString(_new)).append("\n");
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