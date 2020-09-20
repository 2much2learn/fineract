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
import org.apache.fineract.client.models.Client;
import org.apache.fineract.client.models.Question;
import org.apache.fineract.client.models.Response;
import org.apache.fineract.client.models.Survey;
/**
 * Scorecard
 */


public class Scorecard {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("survey")
  private Survey survey = null;

  @SerializedName("question")
  private Question question = null;

  @SerializedName("response")
  private Response response = null;

  @SerializedName("appUser")
  private AppUser appUser = null;

  @SerializedName("client")
  private Client client = null;

  @SerializedName("createdOn")
  private OffsetDateTime createdOn = null;

  @SerializedName("value")
  private Integer value = null;

  @SerializedName("new")
  private Boolean _new = null;

  public Scorecard id(Long id) {
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

  public Scorecard survey(Survey survey) {
    this.survey = survey;
    return this;
  }

   /**
   * Get survey
   * @return survey
  **/
  @Schema(description = "")
  public Survey getSurvey() {
    return survey;
  }

  public void setSurvey(Survey survey) {
    this.survey = survey;
  }

  public Scorecard question(Question question) {
    this.question = question;
    return this;
  }

   /**
   * Get question
   * @return question
  **/
  @Schema(description = "")
  public Question getQuestion() {
    return question;
  }

  public void setQuestion(Question question) {
    this.question = question;
  }

  public Scorecard response(Response response) {
    this.response = response;
    return this;
  }

   /**
   * Get response
   * @return response
  **/
  @Schema(description = "")
  public Response getResponse() {
    return response;
  }

  public void setResponse(Response response) {
    this.response = response;
  }

  public Scorecard appUser(AppUser appUser) {
    this.appUser = appUser;
    return this;
  }

   /**
   * Get appUser
   * @return appUser
  **/
  @Schema(description = "")
  public AppUser getAppUser() {
    return appUser;
  }

  public void setAppUser(AppUser appUser) {
    this.appUser = appUser;
  }

  public Scorecard client(Client client) {
    this.client = client;
    return this;
  }

   /**
   * Get client
   * @return client
  **/
  @Schema(description = "")
  public Client getClient() {
    return client;
  }

  public void setClient(Client client) {
    this.client = client;
  }

  public Scorecard createdOn(OffsetDateTime createdOn) {
    this.createdOn = createdOn;
    return this;
  }

   /**
   * Get createdOn
   * @return createdOn
  **/
  @Schema(description = "")
  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }

  public void setCreatedOn(OffsetDateTime createdOn) {
    this.createdOn = createdOn;
  }

  public Scorecard value(Integer value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @Schema(description = "")
  public Integer getValue() {
    return value;
  }

  public void setValue(Integer value) {
    this.value = value;
  }

  public Scorecard _new(Boolean _new) {
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
    Scorecard scorecard = (Scorecard) o;
    return Objects.equals(this.id, scorecard.id) &&
        Objects.equals(this.survey, scorecard.survey) &&
        Objects.equals(this.question, scorecard.question) &&
        Objects.equals(this.response, scorecard.response) &&
        Objects.equals(this.appUser, scorecard.appUser) &&
        Objects.equals(this.client, scorecard.client) &&
        Objects.equals(this.createdOn, scorecard.createdOn) &&
        Objects.equals(this.value, scorecard.value) &&
        Objects.equals(this._new, scorecard._new);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, survey, question, response, appUser, client, createdOn, value, _new);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Scorecard {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    survey: ").append(toIndentedString(survey)).append("\n");
    sb.append("    question: ").append(toIndentedString(question)).append("\n");
    sb.append("    response: ").append(toIndentedString(response)).append("\n");
    sb.append("    appUser: ").append(toIndentedString(appUser)).append("\n");
    sb.append("    client: ").append(toIndentedString(client)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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