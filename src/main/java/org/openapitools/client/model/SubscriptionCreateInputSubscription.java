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
import java.time.OffsetDateTime;
import org.openapitools.client.model.PlanOverridesObject;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * SubscriptionCreateInputSubscription
 */
@JsonPropertyOrder({
  SubscriptionCreateInputSubscription.JSON_PROPERTY_EXTERNAL_CUSTOMER_ID,
  SubscriptionCreateInputSubscription.JSON_PROPERTY_PLAN_CODE,
  SubscriptionCreateInputSubscription.JSON_PROPERTY_NAME,
  SubscriptionCreateInputSubscription.JSON_PROPERTY_EXTERNAL_ID,
  SubscriptionCreateInputSubscription.JSON_PROPERTY_BILLING_TIME,
  SubscriptionCreateInputSubscription.JSON_PROPERTY_ENDING_AT,
  SubscriptionCreateInputSubscription.JSON_PROPERTY_SUBSCRIPTION_AT,
  SubscriptionCreateInputSubscription.JSON_PROPERTY_PLAN_OVERRIDES
})
@JsonTypeName("SubscriptionCreateInput_subscription")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-07T15:52:17.625211Z[Etc/UTC]")
public class SubscriptionCreateInputSubscription {
  public static final String JSON_PROPERTY_EXTERNAL_CUSTOMER_ID = "external_customer_id";
  private String externalCustomerId;

  public static final String JSON_PROPERTY_PLAN_CODE = "plan_code";
  private String planCode;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_EXTERNAL_ID = "external_id";
  private String externalId;

  /**
   * The billing time for the subscription, which can be set as either &#x60;anniversary&#x60; or &#x60;calendar&#x60;. If not explicitly provided, it will default to &#x60;calendar&#x60;. The billing time determines the timing of recurring billing cycles for the subscription. By specifying &#x60;anniversary&#x60;, the billing cycle will be based on the specific date the subscription started (billed fully), while &#x60;calendar&#x60; sets the billing cycle at the first day of the week/month/year (billed with proration).
   */
  public enum BillingTimeEnum {
    CALENDAR("calendar"),
    
    ANNIVERSARY("anniversary");

    private String value;

    BillingTimeEnum(String value) {
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
    public static BillingTimeEnum fromValue(String value) {
      for (BillingTimeEnum b : BillingTimeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_BILLING_TIME = "billing_time";
  private BillingTimeEnum billingTime;

  public static final String JSON_PROPERTY_ENDING_AT = "ending_at";
  private OffsetDateTime endingAt;

  public static final String JSON_PROPERTY_SUBSCRIPTION_AT = "subscription_at";
  private OffsetDateTime subscriptionAt;

  public static final String JSON_PROPERTY_PLAN_OVERRIDES = "plan_overrides";
  private PlanOverridesObject planOverrides;

  public SubscriptionCreateInputSubscription() {
  }

  public SubscriptionCreateInputSubscription externalCustomerId(String externalCustomerId) {
    
    this.externalCustomerId = externalCustomerId;
    return this;
  }

   /**
   * The customer external unique identifier (provided by your own application)
   * @return externalCustomerId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EXTERNAL_CUSTOMER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getExternalCustomerId() {
    return externalCustomerId;
  }


  @JsonProperty(JSON_PROPERTY_EXTERNAL_CUSTOMER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setExternalCustomerId(String externalCustomerId) {
    this.externalCustomerId = externalCustomerId;
  }


  public SubscriptionCreateInputSubscription planCode(String planCode) {
    
    this.planCode = planCode;
    return this;
  }

   /**
   * The unique code representing the plan to be attached to the customer. This code must correspond to the &#x60;code&#x60; property of one of the active plans.
   * @return planCode
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PLAN_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPlanCode() {
    return planCode;
  }


  @JsonProperty(JSON_PROPERTY_PLAN_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPlanCode(String planCode) {
    this.planCode = planCode;
  }


  public SubscriptionCreateInputSubscription name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The display name of the subscription on an invoice. This field allows for customization of the subscription&#39;s name for billing purposes, especially useful when a single customer has multiple subscriptions using the same plan.
   * @return name
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public SubscriptionCreateInputSubscription externalId(String externalId) {
    
    this.externalId = externalId;
    return this;
  }

   /**
   * The unique external identifier for the subscription. This identifier serves as an idempotency key, ensuring that each subscription is unique.
   * @return externalId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EXTERNAL_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getExternalId() {
    return externalId;
  }


  @JsonProperty(JSON_PROPERTY_EXTERNAL_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }


  public SubscriptionCreateInputSubscription billingTime(BillingTimeEnum billingTime) {
    
    this.billingTime = billingTime;
    return this;
  }

   /**
   * The billing time for the subscription, which can be set as either &#x60;anniversary&#x60; or &#x60;calendar&#x60;. If not explicitly provided, it will default to &#x60;calendar&#x60;. The billing time determines the timing of recurring billing cycles for the subscription. By specifying &#x60;anniversary&#x60;, the billing cycle will be based on the specific date the subscription started (billed fully), while &#x60;calendar&#x60; sets the billing cycle at the first day of the week/month/year (billed with proration).
   * @return billingTime
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BILLING_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BillingTimeEnum getBillingTime() {
    return billingTime;
  }


  @JsonProperty(JSON_PROPERTY_BILLING_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBillingTime(BillingTimeEnum billingTime) {
    this.billingTime = billingTime;
  }


  public SubscriptionCreateInputSubscription endingAt(OffsetDateTime endingAt) {
    
    this.endingAt = endingAt;
    return this;
  }

   /**
   * The effective end date of the subscription. If this field is set to null, the subscription will automatically renew. This date should be provided in ISO 8601 datetime format, and use Coordinated Universal Time (UTC).
   * @return endingAt
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENDING_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getEndingAt() {
    return endingAt;
  }


  @JsonProperty(JSON_PROPERTY_ENDING_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndingAt(OffsetDateTime endingAt) {
    this.endingAt = endingAt;
  }


  public SubscriptionCreateInputSubscription subscriptionAt(OffsetDateTime subscriptionAt) {
    
    this.subscriptionAt = subscriptionAt;
    return this;
  }

   /**
   * The start date for the subscription, allowing for the creation of subscriptions that can begin in the past or future. Please note that it cannot be used to update the start date of a pending subscription or schedule an upgrade/downgrade. The start_date should be provided in ISO 8601 datetime format and expressed in Coordinated Universal Time (UTC).
   * @return subscriptionAt
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUBSCRIPTION_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getSubscriptionAt() {
    return subscriptionAt;
  }


  @JsonProperty(JSON_PROPERTY_SUBSCRIPTION_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubscriptionAt(OffsetDateTime subscriptionAt) {
    this.subscriptionAt = subscriptionAt;
  }


  public SubscriptionCreateInputSubscription planOverrides(PlanOverridesObject planOverrides) {
    
    this.planOverrides = planOverrides;
    return this;
  }

   /**
   * Get planOverrides
   * @return planOverrides
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PLAN_OVERRIDES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PlanOverridesObject getPlanOverrides() {
    return planOverrides;
  }


  @JsonProperty(JSON_PROPERTY_PLAN_OVERRIDES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlanOverrides(PlanOverridesObject planOverrides) {
    this.planOverrides = planOverrides;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionCreateInputSubscription subscriptionCreateInputSubscription = (SubscriptionCreateInputSubscription) o;
    return Objects.equals(this.externalCustomerId, subscriptionCreateInputSubscription.externalCustomerId) &&
        Objects.equals(this.planCode, subscriptionCreateInputSubscription.planCode) &&
        Objects.equals(this.name, subscriptionCreateInputSubscription.name) &&
        Objects.equals(this.externalId, subscriptionCreateInputSubscription.externalId) &&
        Objects.equals(this.billingTime, subscriptionCreateInputSubscription.billingTime) &&
        Objects.equals(this.endingAt, subscriptionCreateInputSubscription.endingAt) &&
        Objects.equals(this.subscriptionAt, subscriptionCreateInputSubscription.subscriptionAt) &&
        Objects.equals(this.planOverrides, subscriptionCreateInputSubscription.planOverrides);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalCustomerId, planCode, name, externalId, billingTime, endingAt, subscriptionAt, planOverrides);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionCreateInputSubscription {\n");
    sb.append("    externalCustomerId: ").append(toIndentedString(externalCustomerId)).append("\n");
    sb.append("    planCode: ").append(toIndentedString(planCode)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    billingTime: ").append(toIndentedString(billingTime)).append("\n");
    sb.append("    endingAt: ").append(toIndentedString(endingAt)).append("\n");
    sb.append("    subscriptionAt: ").append(toIndentedString(subscriptionAt)).append("\n");
    sb.append("    planOverrides: ").append(toIndentedString(planOverrides)).append("\n");
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

