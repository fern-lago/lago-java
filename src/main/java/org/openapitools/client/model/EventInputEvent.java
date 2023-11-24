/*
 * Lago API documentation
 * Lago API allows your application to push customer information and metrics (events) from your application to the billing application.
 *
 * The version of the OpenAPI document: 0.52.0-beta
 * Contact: tech@getlago.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.client.model.EventInputEventTimestamp;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * EventInputEvent
 */
@JsonPropertyOrder({
  EventInputEvent.JSON_PROPERTY_TRANSACTION_ID,
  EventInputEvent.JSON_PROPERTY_EXTERNAL_CUSTOMER_ID,
  EventInputEvent.JSON_PROPERTY_EXTERNAL_SUBSCRIPTION_ID,
  EventInputEvent.JSON_PROPERTY_CODE,
  EventInputEvent.JSON_PROPERTY_TIMESTAMP,
  EventInputEvent.JSON_PROPERTY_PROPERTIES
})
@JsonTypeName("EventInput_event")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-24T14:46:07.416771019Z[Etc/UTC]")
public class EventInputEvent {
  public static final String JSON_PROPERTY_TRANSACTION_ID = "transaction_id";
  private String transactionId;

  public static final String JSON_PROPERTY_EXTERNAL_CUSTOMER_ID = "external_customer_id";
  private String externalCustomerId;

  public static final String JSON_PROPERTY_EXTERNAL_SUBSCRIPTION_ID = "external_subscription_id";
  private String externalSubscriptionId;

  public static final String JSON_PROPERTY_CODE = "code";
  private String code;

  public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
  private EventInputEventTimestamp timestamp;

  public static final String JSON_PROPERTY_PROPERTIES = "properties";
  private Map<String, String> properties = new HashMap<>();

  public EventInputEvent() {
  }

  public EventInputEvent transactionId(String transactionId) {
    
    this.transactionId = transactionId;
    return this;
  }

   /**
   * This field represents a unique identifier for the event. It is crucial for ensuring idempotency, meaning that each event can be uniquely identified and processed without causing any unintended side effects.
   * @return transactionId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TRANSACTION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTransactionId() {
    return transactionId;
  }


  @JsonProperty(JSON_PROPERTY_TRANSACTION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }


  public EventInputEvent externalCustomerId(String externalCustomerId) {
    
    this.externalCustomerId = externalCustomerId;
    return this;
  }

   /**
   * The customer external unique identifier (provided by your own application). This field is optional if you send the &#x60;external_subscription_id&#x60;, targeting a specific subscription.
   * @return externalCustomerId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXTERNAL_CUSTOMER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExternalCustomerId() {
    return externalCustomerId;
  }


  @JsonProperty(JSON_PROPERTY_EXTERNAL_CUSTOMER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExternalCustomerId(String externalCustomerId) {
    this.externalCustomerId = externalCustomerId;
  }


  public EventInputEvent externalSubscriptionId(String externalSubscriptionId) {
    
    this.externalSubscriptionId = externalSubscriptionId;
    return this;
  }

   /**
   * The unique identifier of the subscription within your application. It is a mandatory field when the customer possesses multiple subscriptions or when the &#x60;external_customer_id&#x60; is not provided.
   * @return externalSubscriptionId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXTERNAL_SUBSCRIPTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExternalSubscriptionId() {
    return externalSubscriptionId;
  }


  @JsonProperty(JSON_PROPERTY_EXTERNAL_SUBSCRIPTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExternalSubscriptionId(String externalSubscriptionId) {
    this.externalSubscriptionId = externalSubscriptionId;
  }


  public EventInputEvent code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * The code that identifies a targeted billable metric. It is essential that this code matches the &#x60;code&#x60; property of one of your active billable metrics. If the provided code does not correspond to any active billable metric, it will be ignored during the process.
   * @return code
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCode() {
    return code;
  }


  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCode(String code) {
    this.code = code;
  }


  public EventInputEvent timestamp(EventInputEventTimestamp timestamp) {
    
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Get timestamp
   * @return timestamp
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EventInputEventTimestamp getTimestamp() {
    return timestamp;
  }


  @JsonProperty(JSON_PROPERTY_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimestamp(EventInputEventTimestamp timestamp) {
    this.timestamp = timestamp;
  }


  public EventInputEvent properties(Map<String, String> properties) {
    
    this.properties = properties;
    return this;
  }

  public EventInputEvent putPropertiesItem(String key, String propertiesItem) {
    if (this.properties == null) {
      this.properties = new HashMap<>();
    }
    this.properties.put(key, propertiesItem);
    return this;
  }

   /**
   * This field represents additional properties associated with the event, which are utilized in the calculation of the final fee. This object becomes mandatory when the targeted billable metric employs a &#x60;sum_agg&#x60;, &#x60;max_agg&#x60;, or &#x60;unique_count_agg&#x60; aggregation method. However, when using a simple &#x60;count_agg&#x60;, this object is not required.
   * @return properties
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROPERTIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getProperties() {
    return properties;
  }


  @JsonProperty(JSON_PROPERTY_PROPERTIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProperties(Map<String, String> properties) {
    this.properties = properties;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventInputEvent eventInputEvent = (EventInputEvent) o;
    return Objects.equals(this.transactionId, eventInputEvent.transactionId) &&
        Objects.equals(this.externalCustomerId, eventInputEvent.externalCustomerId) &&
        Objects.equals(this.externalSubscriptionId, eventInputEvent.externalSubscriptionId) &&
        Objects.equals(this.code, eventInputEvent.code) &&
        Objects.equals(this.timestamp, eventInputEvent.timestamp) &&
        Objects.equals(this.properties, eventInputEvent.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionId, externalCustomerId, externalSubscriptionId, code, timestamp, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventInputEvent {\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    externalCustomerId: ").append(toIndentedString(externalCustomerId)).append("\n");
    sb.append("    externalSubscriptionId: ").append(toIndentedString(externalSubscriptionId)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

