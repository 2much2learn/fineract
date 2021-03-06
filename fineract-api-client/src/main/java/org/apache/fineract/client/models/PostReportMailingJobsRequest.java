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
 * PostReportMailingJobsRequest
 */
@Schema(description = "PostReportMailingJobsRequest")

public class PostReportMailingJobsRequest {
  @SerializedName("locale")
  private String locale = null;

  @SerializedName("dateFormat")
  private String dateFormat = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("startDateTime")
  private OffsetDateTime startDateTime = null;

  @SerializedName("stretchyReportId")
  private Long stretchyReportId = null;

  @SerializedName("emailRecipients")
  private String emailRecipients = null;

  @SerializedName("emailSubject")
  private String emailSubject = null;

  @SerializedName("emailMessage")
  private String emailMessage = null;

  @SerializedName("recurrence")
  private String recurrence = null;

  @SerializedName("isActive")
  private Boolean isActive = null;

  @SerializedName("stretchyReportParamMap")
  private String stretchyReportParamMap = null;

  public PostReportMailingJobsRequest locale(String locale) {
    this.locale = locale;
    return this;
  }

   /**
   * Get locale
   * @return locale
  **/
  @Schema(example = "en_GB", description = "")
  public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }

  public PostReportMailingJobsRequest dateFormat(String dateFormat) {
    this.dateFormat = dateFormat;
    return this;
  }

   /**
   * Get dateFormat
   * @return dateFormat
  **/
  @Schema(example = "dd-MM-yyyy HH:mm:ss", description = "")
  public String getDateFormat() {
    return dateFormat;
  }

  public void setDateFormat(String dateFormat) {
    this.dateFormat = dateFormat;
  }

  public PostReportMailingJobsRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(example = "Client Numbers Report", description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PostReportMailingJobsRequest description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(example = "Client Numbers Report", description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PostReportMailingJobsRequest startDateTime(OffsetDateTime startDateTime) {
    this.startDateTime = startDateTime;
    return this;
  }

   /**
   * Get startDateTime
   * @return startDateTime
  **/
  @Schema(description = "")
  public OffsetDateTime getStartDateTime() {
    return startDateTime;
  }

  public void setStartDateTime(OffsetDateTime startDateTime) {
    this.startDateTime = startDateTime;
  }

  public PostReportMailingJobsRequest stretchyReportId(Long stretchyReportId) {
    this.stretchyReportId = stretchyReportId;
    return this;
  }

   /**
   * Get stretchyReportId
   * @return stretchyReportId
  **/
  @Schema(example = "120", description = "")
  public Long getStretchyReportId() {
    return stretchyReportId;
  }

  public void setStretchyReportId(Long stretchyReportId) {
    this.stretchyReportId = stretchyReportId;
  }

  public PostReportMailingJobsRequest emailRecipients(String emailRecipients) {
    this.emailRecipients = emailRecipients;
    return this;
  }

   /**
   * Get emailRecipients
   * @return emailRecipients
  **/
  @Schema(example = "info@musonisystem.com", description = "")
  public String getEmailRecipients() {
    return emailRecipients;
  }

  public void setEmailRecipients(String emailRecipients) {
    this.emailRecipients = emailRecipients;
  }

  public PostReportMailingJobsRequest emailSubject(String emailSubject) {
    this.emailSubject = emailSubject;
    return this;
  }

   /**
   * Get emailSubject
   * @return emailSubject
  **/
  @Schema(example = "Client Numbers Report", description = "")
  public String getEmailSubject() {
    return emailSubject;
  }

  public void setEmailSubject(String emailSubject) {
    this.emailSubject = emailSubject;
  }

  public PostReportMailingJobsRequest emailMessage(String emailMessage) {
    this.emailMessage = emailMessage;
    return this;
  }

   /**
   * Get emailMessage
   * @return emailMessage
  **/
  @Schema(example = "Client Numbers Report", description = "")
  public String getEmailMessage() {
    return emailMessage;
  }

  public void setEmailMessage(String emailMessage) {
    this.emailMessage = emailMessage;
  }

  public PostReportMailingJobsRequest recurrence(String recurrence) {
    this.recurrence = recurrence;
    return this;
  }

   /**
   * Get recurrence
   * @return recurrence
  **/
  @Schema(example = "FREQ=WEEKLY;INTERVAL=1;BYDAY=MO,WE,FR", description = "")
  public String getRecurrence() {
    return recurrence;
  }

  public void setRecurrence(String recurrence) {
    this.recurrence = recurrence;
  }

  public PostReportMailingJobsRequest isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

   /**
   * Get isActive
   * @return isActive
  **/
  @Schema(example = "true", description = "")
  public Boolean isIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  public PostReportMailingJobsRequest stretchyReportParamMap(String stretchyReportParamMap) {
    this.stretchyReportParamMap = stretchyReportParamMap;
    return this;
  }

   /**
   * Get stretchyReportParamMap
   * @return stretchyReportParamMap
  **/
  @Schema(example = "{\"startDate\":\"2016-07-01\",\"endDate\":\"2016-08-02\",\"selectOffice\":\"1\",\"environementUrl\":\"environementUrl\"}", description = "")
  public String getStretchyReportParamMap() {
    return stretchyReportParamMap;
  }

  public void setStretchyReportParamMap(String stretchyReportParamMap) {
    this.stretchyReportParamMap = stretchyReportParamMap;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostReportMailingJobsRequest postReportMailingJobsRequest = (PostReportMailingJobsRequest) o;
    return Objects.equals(this.locale, postReportMailingJobsRequest.locale) &&
        Objects.equals(this.dateFormat, postReportMailingJobsRequest.dateFormat) &&
        Objects.equals(this.name, postReportMailingJobsRequest.name) &&
        Objects.equals(this.description, postReportMailingJobsRequest.description) &&
        Objects.equals(this.startDateTime, postReportMailingJobsRequest.startDateTime) &&
        Objects.equals(this.stretchyReportId, postReportMailingJobsRequest.stretchyReportId) &&
        Objects.equals(this.emailRecipients, postReportMailingJobsRequest.emailRecipients) &&
        Objects.equals(this.emailSubject, postReportMailingJobsRequest.emailSubject) &&
        Objects.equals(this.emailMessage, postReportMailingJobsRequest.emailMessage) &&
        Objects.equals(this.recurrence, postReportMailingJobsRequest.recurrence) &&
        Objects.equals(this.isActive, postReportMailingJobsRequest.isActive) &&
        Objects.equals(this.stretchyReportParamMap, postReportMailingJobsRequest.stretchyReportParamMap);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locale, dateFormat, name, description, startDateTime, stretchyReportId, emailRecipients, emailSubject, emailMessage, recurrence, isActive, stretchyReportParamMap);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostReportMailingJobsRequest {\n");
    
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    dateFormat: ").append(toIndentedString(dateFormat)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    startDateTime: ").append(toIndentedString(startDateTime)).append("\n");
    sb.append("    stretchyReportId: ").append(toIndentedString(stretchyReportId)).append("\n");
    sb.append("    emailRecipients: ").append(toIndentedString(emailRecipients)).append("\n");
    sb.append("    emailSubject: ").append(toIndentedString(emailSubject)).append("\n");
    sb.append("    emailMessage: ").append(toIndentedString(emailMessage)).append("\n");
    sb.append("    recurrence: ").append(toIndentedString(recurrence)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    stretchyReportParamMap: ").append(toIndentedString(stretchyReportParamMap)).append("\n");
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
