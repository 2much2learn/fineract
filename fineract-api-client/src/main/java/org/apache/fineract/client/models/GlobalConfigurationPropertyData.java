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
/**
 * GlobalConfigurationPropertyData
 */


public class GlobalConfigurationPropertyData {
  @SerializedName("name")
  private String name = null;

  @SerializedName("enabled")
  private Boolean enabled = null;

  @SerializedName("value")
  private Long value = null;

  @SerializedName("dateValue")
  private OffsetDateTime dateValue = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("trapDoor")
  private Boolean trapDoor = null;

  public GlobalConfigurationPropertyData name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GlobalConfigurationPropertyData enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Get enabled
   * @return enabled
  **/
  @Schema(description = "")
  public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public GlobalConfigurationPropertyData value(Long value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @Schema(description = "")
  public Long getValue() {
    return value;
  }

  public void setValue(Long value) {
    this.value = value;
  }

  public GlobalConfigurationPropertyData dateValue(OffsetDateTime dateValue) {
    this.dateValue = dateValue;
    return this;
  }

   /**
   * Get dateValue
   * @return dateValue
  **/
  @Schema(description = "")
  public OffsetDateTime getDateValue() {
    return dateValue;
  }

  public void setDateValue(OffsetDateTime dateValue) {
    this.dateValue = dateValue;
  }

  public GlobalConfigurationPropertyData id(Long id) {
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

  public GlobalConfigurationPropertyData description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public GlobalConfigurationPropertyData trapDoor(Boolean trapDoor) {
    this.trapDoor = trapDoor;
    return this;
  }

   /**
   * Get trapDoor
   * @return trapDoor
  **/
  @Schema(description = "")
  public Boolean isTrapDoor() {
    return trapDoor;
  }

  public void setTrapDoor(Boolean trapDoor) {
    this.trapDoor = trapDoor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GlobalConfigurationPropertyData globalConfigurationPropertyData = (GlobalConfigurationPropertyData) o;
    return Objects.equals(this.name, globalConfigurationPropertyData.name) &&
        Objects.equals(this.enabled, globalConfigurationPropertyData.enabled) &&
        Objects.equals(this.value, globalConfigurationPropertyData.value) &&
        Objects.equals(this.dateValue, globalConfigurationPropertyData.dateValue) &&
        Objects.equals(this.id, globalConfigurationPropertyData.id) &&
        Objects.equals(this.description, globalConfigurationPropertyData.description) &&
        Objects.equals(this.trapDoor, globalConfigurationPropertyData.trapDoor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, enabled, value, dateValue, id, description, trapDoor);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GlobalConfigurationPropertyData {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    dateValue: ").append(toIndentedString(dateValue)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    trapDoor: ").append(toIndentedString(trapDoor)).append("\n");
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