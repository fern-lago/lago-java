/*
 * Lago API documentation
 * Lago API allows your application to push customer information and metrics (events) from your application to the billing application.
 *
 * The version of the OpenAPI document: 0.52.2-beta
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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.EventBatchInputEventProperties;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * EventBatchInputEvent
 */
@JsonPropertyOrder({
  EventBatchInputEvent.JSON_PROPERTY_TRANSACTION_ID,
  EventBatchInputEvent.JSON_PROPERTY_EXTERNAL_CUSTOMER_ID,
  EventBatchInputEvent.JSON_PROPERTY_EXTERNAL_SUBSCRIPTION_IDS,
  EventBatchInputEvent.JSON_PROPERTY_CODE,
  EventBatchInputEvent.JSON_PROPERTY_TIMESTAMP,
  EventBatchInputEvent.JSON_PROPERTY_PROPERTIES
})
@JsonTypeName("EventBatchInput_event")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-07T16:08:18.203563Z[Etc/UTC]")
public class EventBatchInputEvent {
  public static final String JSON_PROPERTY_TRANSACTION_ID = "transaction_id";
  private String transactionId;

  public static final String JSON_PROPERTY_EXTERNAL_CUSTOMER_ID = "external_customer_id";
  private String externalCustomerId;

  public static final String JSON_PROPERTY_EXTERNAL_SUBSCRIPTION_IDS = "external_subscription_ids";
  private List<String> externalSubscriptionIds = new ArrayList<>();

  public static final String JSON_PROPERTY_CODE = "code";
  private String code;

  public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
  private Integer timestamp;

  public static final String JSON_PROPERTY_PROPERTIES = "properties";
  private EventBatchInputEventProperties properties;

  public EventBatchInputEvent() {
  }

  public EventBatchInputEvent transactionId(String transactionId) {
    
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


  public EventBatchInputEvent externalCustomerId(String externalCustomerId) {
    
    this.externalCustomerId = externalCustomerId;
    return this;
  }

   /**
   * The customer external unique identifier (provided by your own application). This field is optional if you send the &#x60;external_subscription_ids&#x60;, targeting a specific subscription.
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


  public EventBatchInputEvent externalSubscriptionIds(List<String> externalSubscriptionIds) {
    
    this.externalSubscriptionIds = externalSubscriptionIds;
    return this;
  }

  public EventBatchInputEvent addExternalSubscriptionIdsItem(String externalSubscriptionIdsItem) {
    if (this.externalSubscriptionIds == null) {
      this.externalSubscriptionIds = new ArrayList<>();
    }
    this.externalSubscriptionIds.add(externalSubscriptionIdsItem);
    return this;
  }

   /**
   * Array of unique identifiers of the targeted subscriptions within your application.
   * @return externalSubscriptionIds
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EXTERNAL_SUBSCRIPTION_IDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getExternalSubscriptionIds() {
    return externalSubscriptionIds;
  }


  @JsonProperty(JSON_PROPERTY_EXTERNAL_SUBSCRIPTION_IDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setExternalSubscriptionIds(List<String> externalSubscriptionIds) {
    this.externalSubscriptionIds = externalSubscriptionIds;
  }


  public EventBatchInputEvent code(String code) {
    
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


  public EventBatchInputEvent timestamp(Integer timestamp) {
    
    this.timestamp = timestamp;
    return this;
  }

   /**
   * This field captures the Unix timestamp in seconds indicating the occurrence of the event in Coordinated Universal Time (UTC). If this timestamp is not provided, the API will automatically set it to the time of event reception.
   * @return timestamp
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTimestamp() {
    return timestamp;
  }


  @JsonProperty(JSON_PROPERTY_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimestamp(Integer timestamp) {
    this.timestamp = timestamp;
  }


  public EventBatchInputEvent properties(EventBatchInputEventProperties properties) {
    
    this.properties = properties;
    return this;
  }

   /**
   * Get properties
   * @return properties
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROPERTIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EventBatchInputEventProperties getProperties() {
    return properties;
  }


  @JsonProperty(JSON_PROPERTY_PROPERTIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProperties(EventBatchInputEventProperties properties) {
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
    EventBatchInputEvent eventBatchInputEvent = (EventBatchInputEvent) o;
    return Objects.equals(this.transactionId, eventBatchInputEvent.transactionId) &&
        Objects.equals(this.externalCustomerId, eventBatchInputEvent.externalCustomerId) &&
        Objects.equals(this.externalSubscriptionIds, eventBatchInputEvent.externalSubscriptionIds) &&
        Objects.equals(this.code, eventBatchInputEvent.code) &&
        Objects.equals(this.timestamp, eventBatchInputEvent.timestamp) &&
        Objects.equals(this.properties, eventBatchInputEvent.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionId, externalCustomerId, externalSubscriptionIds, code, timestamp, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventBatchInputEvent {\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    externalCustomerId: ").append(toIndentedString(externalCustomerId)).append("\n");
    sb.append("    externalSubscriptionIds: ").append(toIndentedString(externalSubscriptionIds)).append("\n");
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

