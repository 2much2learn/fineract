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
 * ReportMailingJobRunHistoryData
 */


public class ReportMailingJobRunHistoryData {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("reportMailingJobId")
  private Long reportMailingJobId = null;

  @SerializedName("startDateTime")
  private OffsetDateTime startDateTime = null;

  @SerializedName("endDateTime")
  private OffsetDateTime endDateTime = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("errorMessage")
  private String errorMessage = null;

  @SerializedName("errorLog")
  private String errorLog = null;

  public ReportMailingJobRunHistoryData id(Long id) {
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

  public ReportMailingJobRunHistoryData reportMailingJobId(Long reportMailingJobId) {
    this.reportMailingJobId = reportMailingJobId;
    return this;
  }

   /**
   * Get reportMailingJobId
   * @return reportMailingJobId
  **/
  @Schema(description = "")
  public Long getReportMailingJobId() {
    return reportMailingJobId;
  }

  public void setReportMailingJobId(Long reportMailingJobId) {
    this.reportMailingJobId = reportMailingJobId;
  }

  public ReportMailingJobRunHistoryData startDateTime(OffsetDateTime startDateTime) {
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

  public ReportMailingJobRunHistoryData endDateTime(OffsetDateTime endDateTime) {
    this.endDateTime = endDateTime;
    return this;
  }

   /**
   * Get endDateTime
   * @return endDateTime
  **/
  @Schema(description = "")
  public OffsetDateTime getEndDateTime() {
    return endDateTime;
  }

  public void setEndDateTime(OffsetDateTime endDateTime) {
    this.endDateTime = endDateTime;
  }

  public ReportMailingJobRunHistoryData status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public ReportMailingJobRunHistoryData errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

   /**
   * Get errorMessage
   * @return errorMessage
  **/
  @Schema(description = "")
  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  public ReportMailingJobRunHistoryData errorLog(String errorLog) {
    this.errorLog = errorLog;
    return this;
  }

   /**
   * Get errorLog
   * @return errorLog
  **/
  @Schema(description = "")
  public String getErrorLog() {
    return errorLog;
  }

  public void setErrorLog(String errorLog) {
    this.errorLog = errorLog;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportMailingJobRunHistoryData reportMailingJobRunHistoryData = (ReportMailingJobRunHistoryData) o;
    return Objects.equals(this.id, reportMailingJobRunHistoryData.id) &&
        Objects.equals(this.reportMailingJobId, reportMailingJobRunHistoryData.reportMailingJobId) &&
        Objects.equals(this.startDateTime, reportMailingJobRunHistoryData.startDateTime) &&
        Objects.equals(this.endDateTime, reportMailingJobRunHistoryData.endDateTime) &&
        Objects.equals(this.status, reportMailingJobRunHistoryData.status) &&
        Objects.equals(this.errorMessage, reportMailingJobRunHistoryData.errorMessage) &&
        Objects.equals(this.errorLog, reportMailingJobRunHistoryData.errorLog);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, reportMailingJobId, startDateTime, endDateTime, status, errorMessage, errorLog);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportMailingJobRunHistoryData {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    reportMailingJobId: ").append(toIndentedString(reportMailingJobId)).append("\n");
    sb.append("    startDateTime: ").append(toIndentedString(startDateTime)).append("\n");
    sb.append("    endDateTime: ").append(toIndentedString(endDateTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    errorLog: ").append(toIndentedString(errorLog)).append("\n");
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
