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
import org.apache.fineract.client.models.DateTimeFieldType;
import org.apache.fineract.client.models.DurationField;
/**
 * DateTimeField
 */


public class DateTimeField {
  @SerializedName("name")
  private String name = null;

  @SerializedName("type")
  private DateTimeFieldType type = null;

  @SerializedName("supported")
  private Boolean supported = null;

  @SerializedName("lenient")
  private Boolean lenient = null;

  @SerializedName("rangeDurationField")
  private DurationField rangeDurationField = null;

  @SerializedName("leapDurationField")
  private DurationField leapDurationField = null;

  @SerializedName("minimumValue")
  private Integer minimumValue = null;

  @SerializedName("maximumValue")
  private Integer maximumValue = null;

  @SerializedName("durationField")
  private DurationField durationField = null;

  public DateTimeField name(String name) {
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

  public DateTimeField type(DateTimeFieldType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public DateTimeFieldType getType() {
    return type;
  }

  public void setType(DateTimeFieldType type) {
    this.type = type;
  }

  public DateTimeField supported(Boolean supported) {
    this.supported = supported;
    return this;
  }

   /**
   * Get supported
   * @return supported
  **/
  @Schema(description = "")
  public Boolean isSupported() {
    return supported;
  }

  public void setSupported(Boolean supported) {
    this.supported = supported;
  }

  public DateTimeField lenient(Boolean lenient) {
    this.lenient = lenient;
    return this;
  }

   /**
   * Get lenient
   * @return lenient
  **/
  @Schema(description = "")
  public Boolean isLenient() {
    return lenient;
  }

  public void setLenient(Boolean lenient) {
    this.lenient = lenient;
  }

  public DateTimeField rangeDurationField(DurationField rangeDurationField) {
    this.rangeDurationField = rangeDurationField;
    return this;
  }

   /**
   * Get rangeDurationField
   * @return rangeDurationField
  **/
  @Schema(description = "")
  public DurationField getRangeDurationField() {
    return rangeDurationField;
  }

  public void setRangeDurationField(DurationField rangeDurationField) {
    this.rangeDurationField = rangeDurationField;
  }

  public DateTimeField leapDurationField(DurationField leapDurationField) {
    this.leapDurationField = leapDurationField;
    return this;
  }

   /**
   * Get leapDurationField
   * @return leapDurationField
  **/
  @Schema(description = "")
  public DurationField getLeapDurationField() {
    return leapDurationField;
  }

  public void setLeapDurationField(DurationField leapDurationField) {
    this.leapDurationField = leapDurationField;
  }

  public DateTimeField minimumValue(Integer minimumValue) {
    this.minimumValue = minimumValue;
    return this;
  }

   /**
   * Get minimumValue
   * @return minimumValue
  **/
  @Schema(description = "")
  public Integer getMinimumValue() {
    return minimumValue;
  }

  public void setMinimumValue(Integer minimumValue) {
    this.minimumValue = minimumValue;
  }

  public DateTimeField maximumValue(Integer maximumValue) {
    this.maximumValue = maximumValue;
    return this;
  }

   /**
   * Get maximumValue
   * @return maximumValue
  **/
  @Schema(description = "")
  public Integer getMaximumValue() {
    return maximumValue;
  }

  public void setMaximumValue(Integer maximumValue) {
    this.maximumValue = maximumValue;
  }

  public DateTimeField durationField(DurationField durationField) {
    this.durationField = durationField;
    return this;
  }

   /**
   * Get durationField
   * @return durationField
  **/
  @Schema(description = "")
  public DurationField getDurationField() {
    return durationField;
  }

  public void setDurationField(DurationField durationField) {
    this.durationField = durationField;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DateTimeField dateTimeField = (DateTimeField) o;
    return Objects.equals(this.name, dateTimeField.name) &&
        Objects.equals(this.type, dateTimeField.type) &&
        Objects.equals(this.supported, dateTimeField.supported) &&
        Objects.equals(this.lenient, dateTimeField.lenient) &&
        Objects.equals(this.rangeDurationField, dateTimeField.rangeDurationField) &&
        Objects.equals(this.leapDurationField, dateTimeField.leapDurationField) &&
        Objects.equals(this.minimumValue, dateTimeField.minimumValue) &&
        Objects.equals(this.maximumValue, dateTimeField.maximumValue) &&
        Objects.equals(this.durationField, dateTimeField.durationField);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type, supported, lenient, rangeDurationField, leapDurationField, minimumValue, maximumValue, durationField);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DateTimeField {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    supported: ").append(toIndentedString(supported)).append("\n");
    sb.append("    lenient: ").append(toIndentedString(lenient)).append("\n");
    sb.append("    rangeDurationField: ").append(toIndentedString(rangeDurationField)).append("\n");
    sb.append("    leapDurationField: ").append(toIndentedString(leapDurationField)).append("\n");
    sb.append("    minimumValue: ").append(toIndentedString(minimumValue)).append("\n");
    sb.append("    maximumValue: ").append(toIndentedString(maximumValue)).append("\n");
    sb.append("    durationField: ").append(toIndentedString(durationField)).append("\n");
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
