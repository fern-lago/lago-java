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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ChargePropertiesVolumeRangesInner
 */
@JsonPropertyOrder({
  ChargePropertiesVolumeRangesInner.JSON_PROPERTY_FROM_VALUE,
  ChargePropertiesVolumeRangesInner.JSON_PROPERTY_TO_VALUE,
  ChargePropertiesVolumeRangesInner.JSON_PROPERTY_FLAT_AMOUNT,
  ChargePropertiesVolumeRangesInner.JSON_PROPERTY_PER_UNIT_AMOUNT
})
@JsonTypeName("ChargeProperties_volume_ranges_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-07T15:52:17.625211Z[Etc/UTC]")
public class ChargePropertiesVolumeRangesInner {
  public static final String JSON_PROPERTY_FROM_VALUE = "from_value";
  private Integer fromValue;

  public static final String JSON_PROPERTY_TO_VALUE = "to_value";
  private Integer toValue;

  public static final String JSON_PROPERTY_FLAT_AMOUNT = "flat_amount";
  private String flatAmount;

  public static final String JSON_PROPERTY_PER_UNIT_AMOUNT = "per_unit_amount";
  private String perUnitAmount;

  public ChargePropertiesVolumeRangesInner() {
  }

  public ChargePropertiesVolumeRangesInner fromValue(Integer fromValue) {
    
    this.fromValue = fromValue;
    return this;
  }

   /**
   * Specifies the lower value of a tier for a &#x60;volume&#x60; charge model. It must be either 0 or the previous range&#39;s &#x60;to_value + 1&#x60; to maintain the proper sequence of values.
   * @return fromValue
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FROM_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getFromValue() {
    return fromValue;
  }


  @JsonProperty(JSON_PROPERTY_FROM_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFromValue(Integer fromValue) {
    this.fromValue = fromValue;
  }


  public ChargePropertiesVolumeRangesInner toValue(Integer toValue) {
    
    this.toValue = toValue;
    return this;
  }

   /**
   * Specifies the highest value of a tier for a &#x60;volume&#x60; charge model. - This value must be higher than the &#x60;from_value&#x60; of the same tier. - This value must be &#x60;null&#x60; for the last tier.
   * @return toValue
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TO_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getToValue() {
    return toValue;
  }


  @JsonProperty(JSON_PROPERTY_TO_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setToValue(Integer toValue) {
    this.toValue = toValue;
  }


  public ChargePropertiesVolumeRangesInner flatAmount(String flatAmount) {
    
    this.flatAmount = flatAmount;
    return this;
  }

   /**
   * The unit price, excluding tax, for a specific tier of a &#x60;volume&#x60; charge model. It is expressed as a decimal value.
   * @return flatAmount
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FLAT_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getFlatAmount() {
    return flatAmount;
  }


  @JsonProperty(JSON_PROPERTY_FLAT_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFlatAmount(String flatAmount) {
    this.flatAmount = flatAmount;
  }


  public ChargePropertiesVolumeRangesInner perUnitAmount(String perUnitAmount) {
    
    this.perUnitAmount = perUnitAmount;
    return this;
  }

   /**
   * The flat amount for a whole tier, excluding tax, for a &#x60;volume&#x60; charge model. It is expressed as a decimal value.
   * @return perUnitAmount
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PER_UNIT_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPerUnitAmount() {
    return perUnitAmount;
  }


  @JsonProperty(JSON_PROPERTY_PER_UNIT_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPerUnitAmount(String perUnitAmount) {
    this.perUnitAmount = perUnitAmount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChargePropertiesVolumeRangesInner chargePropertiesVolumeRangesInner = (ChargePropertiesVolumeRangesInner) o;
    return Objects.equals(this.fromValue, chargePropertiesVolumeRangesInner.fromValue) &&
        Objects.equals(this.toValue, chargePropertiesVolumeRangesInner.toValue) &&
        Objects.equals(this.flatAmount, chargePropertiesVolumeRangesInner.flatAmount) &&
        Objects.equals(this.perUnitAmount, chargePropertiesVolumeRangesInner.perUnitAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fromValue, toValue, flatAmount, perUnitAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChargePropertiesVolumeRangesInner {\n");
    sb.append("    fromValue: ").append(toIndentedString(fromValue)).append("\n");
    sb.append("    toValue: ").append(toIndentedString(toValue)).append("\n");
    sb.append("    flatAmount: ").append(toIndentedString(flatAmount)).append("\n");
    sb.append("    perUnitAmount: ").append(toIndentedString(perUnitAmount)).append("\n");
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

