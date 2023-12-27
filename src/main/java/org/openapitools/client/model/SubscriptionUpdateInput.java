/*
 * Lago API documentation
 * Lago API allows your application to push customer information and metrics (events) from your application to the billing application.
 *
 * The version of the OpenAPI document: 0.53.0-beta
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
import org.openapitools.client.model.SubscriptionUpdateInputSubscription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * SubscriptionUpdateInput
 */
@JsonPropertyOrder({
  SubscriptionUpdateInput.JSON_PROPERTY_STATUS,
  SubscriptionUpdateInput.JSON_PROPERTY_SUBSCRIPTION
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-27T14:12:55.372025191Z[Etc/UTC]")
public class SubscriptionUpdateInput {
  /**
   * If the field is not defined and multiple &#x60;active&#x60; and &#x60;pending&#x60; subscriptions exists, Lago will update the &#x60;active&#x60; subscription. However, if you wish to update a &#x60;pending&#x60; subscription, please ensure that you include the &#x60;status&#x60; attribute with the &#x60;pending&#x60; value in your request body.
   */
  public enum StatusEnum {
    ACTIVE("active"),
    
    PENDING("pending");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_STATUS = "status";
  private StatusEnum status;

  public static final String JSON_PROPERTY_SUBSCRIPTION = "subscription";
  private SubscriptionUpdateInputSubscription subscription;

  public SubscriptionUpdateInput() {
  }

  public SubscriptionUpdateInput status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * If the field is not defined and multiple &#x60;active&#x60; and &#x60;pending&#x60; subscriptions exists, Lago will update the &#x60;active&#x60; subscription. However, if you wish to update a &#x60;pending&#x60; subscription, please ensure that you include the &#x60;status&#x60; attribute with the &#x60;pending&#x60; value in your request body.
   * @return status
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StatusEnum getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public SubscriptionUpdateInput subscription(SubscriptionUpdateInputSubscription subscription) {
    
    this.subscription = subscription;
    return this;
  }

   /**
   * Get subscription
   * @return subscription
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SUBSCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public SubscriptionUpdateInputSubscription getSubscription() {
    return subscription;
  }


  @JsonProperty(JSON_PROPERTY_SUBSCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSubscription(SubscriptionUpdateInputSubscription subscription) {
    this.subscription = subscription;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionUpdateInput subscriptionUpdateInput = (SubscriptionUpdateInput) o;
    return Objects.equals(this.status, subscriptionUpdateInput.status) &&
        Objects.equals(this.subscription, subscriptionUpdateInput.subscription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, subscription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionUpdateInput {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    subscription: ").append(toIndentedString(subscription)).append("\n");
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

