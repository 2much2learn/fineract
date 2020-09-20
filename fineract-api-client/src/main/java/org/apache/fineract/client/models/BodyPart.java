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
import org.apache.fineract.client.models.BodyPartHeaders;
import org.apache.fineract.client.models.BodyPartMediaType;
import org.apache.fineract.client.models.ContentDisposition;
import org.apache.fineract.client.models.MultiPart;
/**
 * BodyPart
 */


public class BodyPart {
  @SerializedName("entity")
  private Object entity = null;

  @SerializedName("headers")
  private BodyPartHeaders headers = null;

  @SerializedName("mediaType")
  private BodyPartMediaType mediaType = null;

  @SerializedName("parent")
  private MultiPart parent = null;

  @SerializedName("providers")
  private Object providers = null;

  @SerializedName("contentDisposition")
  private ContentDisposition contentDisposition = null;

  @SerializedName("parameterizedHeaders")
  private BodyPartHeaders parameterizedHeaders = null;

  public BodyPart entity(Object entity) {
    this.entity = entity;
    return this;
  }

   /**
   * Get entity
   * @return entity
  **/
  @Schema(description = "")
  public Object getEntity() {
    return entity;
  }

  public void setEntity(Object entity) {
    this.entity = entity;
  }

  public BodyPart headers(BodyPartHeaders headers) {
    this.headers = headers;
    return this;
  }

   /**
   * Get headers
   * @return headers
  **/
  @Schema(description = "")
  public BodyPartHeaders getHeaders() {
    return headers;
  }

  public void setHeaders(BodyPartHeaders headers) {
    this.headers = headers;
  }

  public BodyPart mediaType(BodyPartMediaType mediaType) {
    this.mediaType = mediaType;
    return this;
  }

   /**
   * Get mediaType
   * @return mediaType
  **/
  @Schema(description = "")
  public BodyPartMediaType getMediaType() {
    return mediaType;
  }

  public void setMediaType(BodyPartMediaType mediaType) {
    this.mediaType = mediaType;
  }

  public BodyPart parent(MultiPart parent) {
    this.parent = parent;
    return this;
  }

   /**
   * Get parent
   * @return parent
  **/
  @Schema(description = "")
  public MultiPart getParent() {
    return parent;
  }

  public void setParent(MultiPart parent) {
    this.parent = parent;
  }

  public BodyPart providers(Object providers) {
    this.providers = providers;
    return this;
  }

   /**
   * Get providers
   * @return providers
  **/
  @Schema(description = "")
  public Object getProviders() {
    return providers;
  }

  public void setProviders(Object providers) {
    this.providers = providers;
  }

  public BodyPart contentDisposition(ContentDisposition contentDisposition) {
    this.contentDisposition = contentDisposition;
    return this;
  }

   /**
   * Get contentDisposition
   * @return contentDisposition
  **/
  @Schema(description = "")
  public ContentDisposition getContentDisposition() {
    return contentDisposition;
  }

  public void setContentDisposition(ContentDisposition contentDisposition) {
    this.contentDisposition = contentDisposition;
  }

  public BodyPart parameterizedHeaders(BodyPartHeaders parameterizedHeaders) {
    this.parameterizedHeaders = parameterizedHeaders;
    return this;
  }

   /**
   * Get parameterizedHeaders
   * @return parameterizedHeaders
  **/
  @Schema(description = "")
  public BodyPartHeaders getParameterizedHeaders() {
    return parameterizedHeaders;
  }

  public void setParameterizedHeaders(BodyPartHeaders parameterizedHeaders) {
    this.parameterizedHeaders = parameterizedHeaders;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BodyPart bodyPart = (BodyPart) o;
    return Objects.equals(this.entity, bodyPart.entity) &&
        Objects.equals(this.headers, bodyPart.headers) &&
        Objects.equals(this.mediaType, bodyPart.mediaType) &&
        Objects.equals(this.parent, bodyPart.parent) &&
        Objects.equals(this.providers, bodyPart.providers) &&
        Objects.equals(this.contentDisposition, bodyPart.contentDisposition) &&
        Objects.equals(this.parameterizedHeaders, bodyPart.parameterizedHeaders);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entity, headers, mediaType, parent, providers, contentDisposition, parameterizedHeaders);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BodyPart {\n");
    
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    providers: ").append(toIndentedString(providers)).append("\n");
    sb.append("    contentDisposition: ").append(toIndentedString(contentDisposition)).append("\n");
    sb.append("    parameterizedHeaders: ").append(toIndentedString(parameterizedHeaders)).append("\n");
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