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
import java.time.LocalDate;
import org.apache.fineract.client.models.ClientTimelineData;
/**
 * ClientData
 */


public class ClientData {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("externalId")
  private String externalId = null;

  @SerializedName("activationDate")
  private LocalDate activationDate = null;

  @SerializedName("firstname")
  private String firstname = null;

  @SerializedName("lastname")
  private String lastname = null;

  @SerializedName("officeName")
  private String officeName = null;

  @SerializedName("imageId")
  private Long imageId = null;

  @SerializedName("imagePresent")
  private Boolean imagePresent = null;

  @SerializedName("timeline")
  private ClientTimelineData timeline = null;

  @SerializedName("savingsAccountId")
  private Long savingsAccountId = null;

  @SerializedName("isAddressEnabled")
  private Boolean isAddressEnabled = null;

  @SerializedName("rowIndex")
  private Integer rowIndex = null;

  public ClientData id(Long id) {
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

  public ClientData externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

   /**
   * Get externalId
   * @return externalId
  **/
  @Schema(description = "")
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  public ClientData activationDate(LocalDate activationDate) {
    this.activationDate = activationDate;
    return this;
  }

   /**
   * Get activationDate
   * @return activationDate
  **/
  @Schema(description = "")
  public LocalDate getActivationDate() {
    return activationDate;
  }

  public void setActivationDate(LocalDate activationDate) {
    this.activationDate = activationDate;
  }

  public ClientData firstname(String firstname) {
    this.firstname = firstname;
    return this;
  }

   /**
   * Get firstname
   * @return firstname
  **/
  @Schema(description = "")
  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public ClientData lastname(String lastname) {
    this.lastname = lastname;
    return this;
  }

   /**
   * Get lastname
   * @return lastname
  **/
  @Schema(description = "")
  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  public ClientData officeName(String officeName) {
    this.officeName = officeName;
    return this;
  }

   /**
   * Get officeName
   * @return officeName
  **/
  @Schema(description = "")
  public String getOfficeName() {
    return officeName;
  }

  public void setOfficeName(String officeName) {
    this.officeName = officeName;
  }

  public ClientData imageId(Long imageId) {
    this.imageId = imageId;
    return this;
  }

   /**
   * Get imageId
   * @return imageId
  **/
  @Schema(description = "")
  public Long getImageId() {
    return imageId;
  }

  public void setImageId(Long imageId) {
    this.imageId = imageId;
  }

  public ClientData imagePresent(Boolean imagePresent) {
    this.imagePresent = imagePresent;
    return this;
  }

   /**
   * Get imagePresent
   * @return imagePresent
  **/
  @Schema(description = "")
  public Boolean isImagePresent() {
    return imagePresent;
  }

  public void setImagePresent(Boolean imagePresent) {
    this.imagePresent = imagePresent;
  }

  public ClientData timeline(ClientTimelineData timeline) {
    this.timeline = timeline;
    return this;
  }

   /**
   * Get timeline
   * @return timeline
  **/
  @Schema(description = "")
  public ClientTimelineData getTimeline() {
    return timeline;
  }

  public void setTimeline(ClientTimelineData timeline) {
    this.timeline = timeline;
  }

  public ClientData savingsAccountId(Long savingsAccountId) {
    this.savingsAccountId = savingsAccountId;
    return this;
  }

   /**
   * Get savingsAccountId
   * @return savingsAccountId
  **/
  @Schema(description = "")
  public Long getSavingsAccountId() {
    return savingsAccountId;
  }

  public void setSavingsAccountId(Long savingsAccountId) {
    this.savingsAccountId = savingsAccountId;
  }

  public ClientData isAddressEnabled(Boolean isAddressEnabled) {
    this.isAddressEnabled = isAddressEnabled;
    return this;
  }

   /**
   * Get isAddressEnabled
   * @return isAddressEnabled
  **/
  @Schema(description = "")
  public Boolean isIsAddressEnabled() {
    return isAddressEnabled;
  }

  public void setIsAddressEnabled(Boolean isAddressEnabled) {
    this.isAddressEnabled = isAddressEnabled;
  }

  public ClientData rowIndex(Integer rowIndex) {
    this.rowIndex = rowIndex;
    return this;
  }

   /**
   * Get rowIndex
   * @return rowIndex
  **/
  @Schema(description = "")
  public Integer getRowIndex() {
    return rowIndex;
  }

  public void setRowIndex(Integer rowIndex) {
    this.rowIndex = rowIndex;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClientData clientData = (ClientData) o;
    return Objects.equals(this.id, clientData.id) &&
        Objects.equals(this.externalId, clientData.externalId) &&
        Objects.equals(this.activationDate, clientData.activationDate) &&
        Objects.equals(this.firstname, clientData.firstname) &&
        Objects.equals(this.lastname, clientData.lastname) &&
        Objects.equals(this.officeName, clientData.officeName) &&
        Objects.equals(this.imageId, clientData.imageId) &&
        Objects.equals(this.imagePresent, clientData.imagePresent) &&
        Objects.equals(this.timeline, clientData.timeline) &&
        Objects.equals(this.savingsAccountId, clientData.savingsAccountId) &&
        Objects.equals(this.isAddressEnabled, clientData.isAddressEnabled) &&
        Objects.equals(this.rowIndex, clientData.rowIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, externalId, activationDate, firstname, lastname, officeName, imageId, imagePresent, timeline, savingsAccountId, isAddressEnabled, rowIndex);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientData {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    activationDate: ").append(toIndentedString(activationDate)).append("\n");
    sb.append("    firstname: ").append(toIndentedString(firstname)).append("\n");
    sb.append("    lastname: ").append(toIndentedString(lastname)).append("\n");
    sb.append("    officeName: ").append(toIndentedString(officeName)).append("\n");
    sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
    sb.append("    imagePresent: ").append(toIndentedString(imagePresent)).append("\n");
    sb.append("    timeline: ").append(toIndentedString(timeline)).append("\n");
    sb.append("    savingsAccountId: ").append(toIndentedString(savingsAccountId)).append("\n");
    sb.append("    isAddressEnabled: ").append(toIndentedString(isAddressEnabled)).append("\n");
    sb.append("    rowIndex: ").append(toIndentedString(rowIndex)).append("\n");
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
