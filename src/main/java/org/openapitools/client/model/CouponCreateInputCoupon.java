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
import java.time.OffsetDateTime;
import org.openapitools.client.model.CouponBaseInputAppliesTo;
import org.openapitools.client.model.Currency;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * CouponCreateInputCoupon
 */
@JsonPropertyOrder({
  CouponCreateInputCoupon.JSON_PROPERTY_NAME,
  CouponCreateInputCoupon.JSON_PROPERTY_CODE,
  CouponCreateInputCoupon.JSON_PROPERTY_DESCRIPTION,
  CouponCreateInputCoupon.JSON_PROPERTY_COUPON_TYPE,
  CouponCreateInputCoupon.JSON_PROPERTY_AMOUNT_CENTS,
  CouponCreateInputCoupon.JSON_PROPERTY_AMOUNT_CURRENCY,
  CouponCreateInputCoupon.JSON_PROPERTY_REUSABLE,
  CouponCreateInputCoupon.JSON_PROPERTY_PERCENTAGE_RATE,
  CouponCreateInputCoupon.JSON_PROPERTY_FREQUENCY,
  CouponCreateInputCoupon.JSON_PROPERTY_FREQUENCY_DURATION,
  CouponCreateInputCoupon.JSON_PROPERTY_EXPIRATION,
  CouponCreateInputCoupon.JSON_PROPERTY_EXPIRATION_AT,
  CouponCreateInputCoupon.JSON_PROPERTY_APPLIES_TO
})
@JsonTypeName("CouponCreateInput_coupon")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-24T14:46:07.416771019Z[Etc/UTC]")
public class CouponCreateInputCoupon {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_CODE = "code";
  private String code;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private JsonNullable<String> description = JsonNullable.<String>undefined();

  /**
   * The type of the coupon. It can have two possible values: &#x60;fixed_amount&#x60; or &#x60;percentage&#x60;.  - If set to &#x60;fixed_amount&#x60;, the coupon represents a fixed amount discount. - If set to &#x60;percentage&#x60;, the coupon represents a percentage-based discount.
   */
  public enum CouponTypeEnum {
    FIXED_AMOUNT("fixed_amount"),
    
    PERCENTAGE("percentage");

    private String value;

    CouponTypeEnum(String value) {
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
    public static CouponTypeEnum fromValue(String value) {
      for (CouponTypeEnum b : CouponTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_COUPON_TYPE = "coupon_type";
  private CouponTypeEnum couponType;

  public static final String JSON_PROPERTY_AMOUNT_CENTS = "amount_cents";
  private JsonNullable<Integer> amountCents = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_AMOUNT_CURRENCY = "amount_currency";
  private Currency amountCurrency;

  public static final String JSON_PROPERTY_REUSABLE = "reusable";
  private Boolean reusable;

  public static final String JSON_PROPERTY_PERCENTAGE_RATE = "percentage_rate";
  private JsonNullable<String> percentageRate = JsonNullable.<String>undefined();

  /**
   * The type of frequency for the coupon. It can have three possible values: &#x60;once&#x60;, &#x60;recurring&#x60; or &#x60;forever&#x60;.  - If set to &#x60;once&#x60;, the coupon is applicable only for a single use. - If set to &#x60;recurring&#x60;, the coupon can be used multiple times for recurring billing periods. - If set to &#x60;forever&#x60;, the coupon has unlimited usage and can be applied indefinitely.
   */
  public enum FrequencyEnum {
    ONCE("once"),
    
    RECURRING("recurring");

    private String value;

    FrequencyEnum(String value) {
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
    public static FrequencyEnum fromValue(String value) {
      for (FrequencyEnum b : FrequencyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_FREQUENCY = "frequency";
  private FrequencyEnum frequency;

  public static final String JSON_PROPERTY_FREQUENCY_DURATION = "frequency_duration";
  private JsonNullable<Integer> frequencyDuration = JsonNullable.<Integer>undefined();

  /**
   * Specifies the type of expiration for the coupon. It can have two possible values: &#x60;time_limit&#x60; or &#x60;no_expiration&#x60;.  - If set to &#x60;time_limit&#x60;, the coupon has an expiration based on a specified time limit. - If set to &#x60;no_expiration&#x60;, the coupon does not have an expiration date and remains valid indefinitely.
   */
  public enum ExpirationEnum {
    NO_EXPIRATION("no_expiration"),
    
    TIME_LIMIT("time_limit");

    private String value;

    ExpirationEnum(String value) {
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
    public static ExpirationEnum fromValue(String value) {
      for (ExpirationEnum b : ExpirationEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_EXPIRATION = "expiration";
  private ExpirationEnum expiration;

  public static final String JSON_PROPERTY_EXPIRATION_AT = "expiration_at";
  private JsonNullable<OffsetDateTime> expirationAt = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_APPLIES_TO = "applies_to";
  private JsonNullable<CouponBaseInputAppliesTo> appliesTo = JsonNullable.<CouponBaseInputAppliesTo>undefined();

  public CouponCreateInputCoupon() {
  }

  public CouponCreateInputCoupon name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the coupon.
   * @return name
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  public CouponCreateInputCoupon code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * Unique code used to identify the coupon.
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


  public CouponCreateInputCoupon description(String description) {
    this.description = JsonNullable.<String>of(description);
    
    return this;
  }

   /**
   * Description of the coupon.
   * @return description
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getDescription() {
        return description.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getDescription_JsonNullable() {
    return description;
  }
  
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  public void setDescription_JsonNullable(JsonNullable<String> description) {
    this.description = description;
  }

  public void setDescription(String description) {
    this.description = JsonNullable.<String>of(description);
  }


  public CouponCreateInputCoupon couponType(CouponTypeEnum couponType) {
    
    this.couponType = couponType;
    return this;
  }

   /**
   * The type of the coupon. It can have two possible values: &#x60;fixed_amount&#x60; or &#x60;percentage&#x60;.  - If set to &#x60;fixed_amount&#x60;, the coupon represents a fixed amount discount. - If set to &#x60;percentage&#x60;, the coupon represents a percentage-based discount.
   * @return couponType
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_COUPON_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public CouponTypeEnum getCouponType() {
    return couponType;
  }


  @JsonProperty(JSON_PROPERTY_COUPON_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCouponType(CouponTypeEnum couponType) {
    this.couponType = couponType;
  }


  public CouponCreateInputCoupon amountCents(Integer amountCents) {
    this.amountCents = JsonNullable.<Integer>of(amountCents);
    
    return this;
  }

   /**
   * The amount of the coupon in cents. This field is required only for coupon with &#x60;fixed_amount&#x60; type.
   * @return amountCents
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Integer getAmountCents() {
        return amountCents.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_AMOUNT_CENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getAmountCents_JsonNullable() {
    return amountCents;
  }
  
  @JsonProperty(JSON_PROPERTY_AMOUNT_CENTS)
  public void setAmountCents_JsonNullable(JsonNullable<Integer> amountCents) {
    this.amountCents = amountCents;
  }

  public void setAmountCents(Integer amountCents) {
    this.amountCents = JsonNullable.<Integer>of(amountCents);
  }


  public CouponCreateInputCoupon amountCurrency(Currency amountCurrency) {
    
    this.amountCurrency = amountCurrency;
    return this;
  }

   /**
   * Get amountCurrency
   * @return amountCurrency
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AMOUNT_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Currency getAmountCurrency() {
    return amountCurrency;
  }


  @JsonProperty(JSON_PROPERTY_AMOUNT_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAmountCurrency(Currency amountCurrency) {
    this.amountCurrency = amountCurrency;
  }


  public CouponCreateInputCoupon reusable(Boolean reusable) {
    
    this.reusable = reusable;
    return this;
  }

   /**
   * Indicates whether the coupon can be reused or not. If set to &#x60;true&#x60;, the coupon is reusable, meaning it can be applied multiple times to the same customer. If set to &#x60;false&#x60;, the coupon can only be used once and is not reusable. If not specified, this field is set to &#x60;true&#x60; by default.
   * @return reusable
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REUSABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getReusable() {
    return reusable;
  }


  @JsonProperty(JSON_PROPERTY_REUSABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReusable(Boolean reusable) {
    this.reusable = reusable;
  }


  public CouponCreateInputCoupon percentageRate(String percentageRate) {
    this.percentageRate = JsonNullable.<String>of(percentageRate);
    
    return this;
  }

   /**
   * The percentage rate of the coupon. This field is required only for coupons with a &#x60;percentage&#x60; coupon type.
   * @return percentageRate
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getPercentageRate() {
        return percentageRate.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PERCENTAGE_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getPercentageRate_JsonNullable() {
    return percentageRate;
  }
  
  @JsonProperty(JSON_PROPERTY_PERCENTAGE_RATE)
  public void setPercentageRate_JsonNullable(JsonNullable<String> percentageRate) {
    this.percentageRate = percentageRate;
  }

  public void setPercentageRate(String percentageRate) {
    this.percentageRate = JsonNullable.<String>of(percentageRate);
  }


  public CouponCreateInputCoupon frequency(FrequencyEnum frequency) {
    
    this.frequency = frequency;
    return this;
  }

   /**
   * The type of frequency for the coupon. It can have three possible values: &#x60;once&#x60;, &#x60;recurring&#x60; or &#x60;forever&#x60;.  - If set to &#x60;once&#x60;, the coupon is applicable only for a single use. - If set to &#x60;recurring&#x60;, the coupon can be used multiple times for recurring billing periods. - If set to &#x60;forever&#x60;, the coupon has unlimited usage and can be applied indefinitely.
   * @return frequency
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FREQUENCY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public FrequencyEnum getFrequency() {
    return frequency;
  }


  @JsonProperty(JSON_PROPERTY_FREQUENCY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFrequency(FrequencyEnum frequency) {
    this.frequency = frequency;
  }


  public CouponCreateInputCoupon frequencyDuration(Integer frequencyDuration) {
    this.frequencyDuration = JsonNullable.<Integer>of(frequencyDuration);
    
    return this;
  }

   /**
   * Specifies the number of billing periods to which the coupon applies. This field is required only for coupons with a &#x60;recurring&#x60; frequency type
   * @return frequencyDuration
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Integer getFrequencyDuration() {
        return frequencyDuration.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FREQUENCY_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getFrequencyDuration_JsonNullable() {
    return frequencyDuration;
  }
  
  @JsonProperty(JSON_PROPERTY_FREQUENCY_DURATION)
  public void setFrequencyDuration_JsonNullable(JsonNullable<Integer> frequencyDuration) {
    this.frequencyDuration = frequencyDuration;
  }

  public void setFrequencyDuration(Integer frequencyDuration) {
    this.frequencyDuration = JsonNullable.<Integer>of(frequencyDuration);
  }


  public CouponCreateInputCoupon expiration(ExpirationEnum expiration) {
    
    this.expiration = expiration;
    return this;
  }

   /**
   * Specifies the type of expiration for the coupon. It can have two possible values: &#x60;time_limit&#x60; or &#x60;no_expiration&#x60;.  - If set to &#x60;time_limit&#x60;, the coupon has an expiration based on a specified time limit. - If set to &#x60;no_expiration&#x60;, the coupon does not have an expiration date and remains valid indefinitely.
   * @return expiration
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXPIRATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ExpirationEnum getExpiration() {
    return expiration;
  }


  @JsonProperty(JSON_PROPERTY_EXPIRATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExpiration(ExpirationEnum expiration) {
    this.expiration = expiration;
  }


  public CouponCreateInputCoupon expirationAt(OffsetDateTime expirationAt) {
    this.expirationAt = JsonNullable.<OffsetDateTime>of(expirationAt);
    
    return this;
  }

   /**
   * The expiration date and time of the coupon. This field is required only for coupons with &#x60;expiration&#x60; set to &#x60;time_limit&#x60;. The expiration date and time should be specified in UTC format according to the ISO 8601 datetime standard. It indicates the exact moment when the coupon will expire and is no longer valid.
   * @return expirationAt
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public OffsetDateTime getExpirationAt() {
        return expirationAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EXPIRATION_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<OffsetDateTime> getExpirationAt_JsonNullable() {
    return expirationAt;
  }
  
  @JsonProperty(JSON_PROPERTY_EXPIRATION_AT)
  public void setExpirationAt_JsonNullable(JsonNullable<OffsetDateTime> expirationAt) {
    this.expirationAt = expirationAt;
  }

  public void setExpirationAt(OffsetDateTime expirationAt) {
    this.expirationAt = JsonNullable.<OffsetDateTime>of(expirationAt);
  }


  public CouponCreateInputCoupon appliesTo(CouponBaseInputAppliesTo appliesTo) {
    this.appliesTo = JsonNullable.<CouponBaseInputAppliesTo>of(appliesTo);
    
    return this;
  }

   /**
   * Get appliesTo
   * @return appliesTo
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public CouponBaseInputAppliesTo getAppliesTo() {
        return appliesTo.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_APPLIES_TO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<CouponBaseInputAppliesTo> getAppliesTo_JsonNullable() {
    return appliesTo;
  }
  
  @JsonProperty(JSON_PROPERTY_APPLIES_TO)
  public void setAppliesTo_JsonNullable(JsonNullable<CouponBaseInputAppliesTo> appliesTo) {
    this.appliesTo = appliesTo;
  }

  public void setAppliesTo(CouponBaseInputAppliesTo appliesTo) {
    this.appliesTo = JsonNullable.<CouponBaseInputAppliesTo>of(appliesTo);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CouponCreateInputCoupon couponCreateInputCoupon = (CouponCreateInputCoupon) o;
    return Objects.equals(this.name, couponCreateInputCoupon.name) &&
        Objects.equals(this.code, couponCreateInputCoupon.code) &&
        equalsNullable(this.description, couponCreateInputCoupon.description) &&
        Objects.equals(this.couponType, couponCreateInputCoupon.couponType) &&
        equalsNullable(this.amountCents, couponCreateInputCoupon.amountCents) &&
        Objects.equals(this.amountCurrency, couponCreateInputCoupon.amountCurrency) &&
        Objects.equals(this.reusable, couponCreateInputCoupon.reusable) &&
        equalsNullable(this.percentageRate, couponCreateInputCoupon.percentageRate) &&
        Objects.equals(this.frequency, couponCreateInputCoupon.frequency) &&
        equalsNullable(this.frequencyDuration, couponCreateInputCoupon.frequencyDuration) &&
        Objects.equals(this.expiration, couponCreateInputCoupon.expiration) &&
        equalsNullable(this.expirationAt, couponCreateInputCoupon.expirationAt) &&
        equalsNullable(this.appliesTo, couponCreateInputCoupon.appliesTo);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, code, hashCodeNullable(description), couponType, hashCodeNullable(amountCents), amountCurrency, reusable, hashCodeNullable(percentageRate), frequency, hashCodeNullable(frequencyDuration), expiration, hashCodeNullable(expirationAt), hashCodeNullable(appliesTo));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CouponCreateInputCoupon {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    couponType: ").append(toIndentedString(couponType)).append("\n");
    sb.append("    amountCents: ").append(toIndentedString(amountCents)).append("\n");
    sb.append("    amountCurrency: ").append(toIndentedString(amountCurrency)).append("\n");
    sb.append("    reusable: ").append(toIndentedString(reusable)).append("\n");
    sb.append("    percentageRate: ").append(toIndentedString(percentageRate)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    frequencyDuration: ").append(toIndentedString(frequencyDuration)).append("\n");
    sb.append("    expiration: ").append(toIndentedString(expiration)).append("\n");
    sb.append("    expirationAt: ").append(toIndentedString(expirationAt)).append("\n");
    sb.append("    appliesTo: ").append(toIndentedString(appliesTo)).append("\n");
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

