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
/**
 * InteropTransactionTypeData
 */


public class InteropTransactionTypeData {
  /**
   * Gets or Sets scenario
   */
  @JsonAdapter(ScenarioEnum.Adapter.class)
  public enum ScenarioEnum {
    DEPOSIT("DEPOSIT"),
    WITHDRAWAL("WITHDRAWAL"),
    TRANSFER("TRANSFER"),
    PAYMENT("PAYMENT"),
    REFUND("REFUND");

    private String value;

    ScenarioEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ScenarioEnum fromValue(String text) {
      for (ScenarioEnum b : ScenarioEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ScenarioEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ScenarioEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ScenarioEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ScenarioEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("scenario")
  private ScenarioEnum scenario = null;

  @SerializedName("subScenario")
  private String subScenario = null;

  /**
   * Gets or Sets initiator
   */
  @JsonAdapter(InitiatorEnum.Adapter.class)
  public enum InitiatorEnum {
    PAYER("PAYER"),
    PAYEE("PAYEE");

    private String value;

    InitiatorEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static InitiatorEnum fromValue(String text) {
      for (InitiatorEnum b : InitiatorEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<InitiatorEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final InitiatorEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public InitiatorEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return InitiatorEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("initiator")
  private InitiatorEnum initiator = null;

  /**
   * Gets or Sets initiatorType
   */
  @JsonAdapter(InitiatorTypeEnum.Adapter.class)
  public enum InitiatorTypeEnum {
    CONSUMER("CONSUMER"),
    AGENT("AGENT"),
    BUSINESS("BUSINESS"),
    DEVICE("DEVICE");

    private String value;

    InitiatorTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static InitiatorTypeEnum fromValue(String text) {
      for (InitiatorTypeEnum b : InitiatorTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<InitiatorTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final InitiatorTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public InitiatorTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return InitiatorTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("initiatorType")
  private InitiatorTypeEnum initiatorType = null;

  public InteropTransactionTypeData scenario(ScenarioEnum scenario) {
    this.scenario = scenario;
    return this;
  }

   /**
   * Get scenario
   * @return scenario
  **/
  @Schema(required = true, description = "")
  public ScenarioEnum getScenario() {
    return scenario;
  }

  public void setScenario(ScenarioEnum scenario) {
    this.scenario = scenario;
  }

  public InteropTransactionTypeData subScenario(String subScenario) {
    this.subScenario = subScenario;
    return this;
  }

   /**
   * Get subScenario
   * @return subScenario
  **/
  @Schema(description = "")
  public String getSubScenario() {
    return subScenario;
  }

  public void setSubScenario(String subScenario) {
    this.subScenario = subScenario;
  }

  public InteropTransactionTypeData initiator(InitiatorEnum initiator) {
    this.initiator = initiator;
    return this;
  }

   /**
   * Get initiator
   * @return initiator
  **/
  @Schema(required = true, description = "")
  public InitiatorEnum getInitiator() {
    return initiator;
  }

  public void setInitiator(InitiatorEnum initiator) {
    this.initiator = initiator;
  }

  public InteropTransactionTypeData initiatorType(InitiatorTypeEnum initiatorType) {
    this.initiatorType = initiatorType;
    return this;
  }

   /**
   * Get initiatorType
   * @return initiatorType
  **/
  @Schema(required = true, description = "")
  public InitiatorTypeEnum getInitiatorType() {
    return initiatorType;
  }

  public void setInitiatorType(InitiatorTypeEnum initiatorType) {
    this.initiatorType = initiatorType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InteropTransactionTypeData interopTransactionTypeData = (InteropTransactionTypeData) o;
    return Objects.equals(this.scenario, interopTransactionTypeData.scenario) &&
        Objects.equals(this.subScenario, interopTransactionTypeData.subScenario) &&
        Objects.equals(this.initiator, interopTransactionTypeData.initiator) &&
        Objects.equals(this.initiatorType, interopTransactionTypeData.initiatorType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scenario, subScenario, initiator, initiatorType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InteropTransactionTypeData {\n");
    
    sb.append("    scenario: ").append(toIndentedString(scenario)).append("\n");
    sb.append("    subScenario: ").append(toIndentedString(subScenario)).append("\n");
    sb.append("    initiator: ").append(toIndentedString(initiator)).append("\n");
    sb.append("    initiatorType: ").append(toIndentedString(initiatorType)).append("\n");
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