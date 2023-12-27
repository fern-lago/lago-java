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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ChargePropertiesGraduatedPercentageRangesInner
 */
@JsonPropertyOrder({
  ChargePropertiesGraduatedPercentageRangesInner.JSON_PROPERTY_FROM_VALUE,
  ChargePropertiesGraduatedPercentageRangesInner.JSON_PROPERTY_TO_VALUE,
  ChargePropertiesGraduatedPercentageRangesInner.JSON_PROPERTY_RATE,
  ChargePropertiesGraduatedPercentageRangesInner.JSON_PROPERTY_FLAT_AMOUNT
})
@JsonTypeName("ChargeProperties_graduated_percentage_ranges_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-27T14:12:55.372025191Z[Etc/UTC]")
public class ChargePropertiesGraduatedPercentageRangesInner {
  public static final String JSON_PROPERTY_FROM_VALUE = "from_value";
  private Integer fromValue;

  public static final String JSON_PROPERTY_TO_VALUE = "to_value";
  private Integer toValue;

  public static final String JSON_PROPERTY_RATE = "rate";
  private String rate;

  public static final String JSON_PROPERTY_FLAT_AMOUNT = "flat_amount";
  private String flatAmount;

  public ChargePropertiesGraduatedPercentageRangesInner() {
  }

  public ChargePropertiesGraduatedPercentageRangesInner fromValue(Integer fromValue) {
    
    this.fromValue = fromValue;
    return this;
  }

   /**
   * Specifies the lower value of a tier for a &#x60;graduated_percentage&#x60; charge model. It must be either 0 or the previous range&#39;s &#x60;to_value + 1&#x60; to maintain the proper sequence of values.
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


  public ChargePropertiesGraduatedPercentageRangesInner toValue(Integer toValue) {
    
    this.toValue = toValue;
    return this;
  }

   /**
   * Specifies the highest value of a tier for a &#x60;graduated_percentage&#x60; charge model. - This value must be higher than the from_value of the same tier. - This value must be null for the last tier.
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


  public ChargePropertiesGraduatedPercentageRangesInner rate(String rate) {
    
    this.rate = rate;
    return this;
  }

   /**
   * The percentage rate that is applied to the amount of each transaction in the tier for a &#x60;graduated_percentage&#x60; charge model. It is expressed as a decimal value.
   * @return rate
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_RATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getRate() {
    return rate;
  }


  @JsonProperty(JSON_PROPERTY_RATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRate(String rate) {
    this.rate = rate;
  }


  public ChargePropertiesGraduatedPercentageRangesInner flatAmount(String flatAmount) {
    
    this.flatAmount = flatAmount;
    return this;
  }

   /**
   * The flat amount for a whole tier, excluding tax, for a &#x60;graduated_percentage&#x60; charge model. It is expressed as a decimal value.
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChargePropertiesGraduatedPercentageRangesInner chargePropertiesGraduatedPercentageRangesInner = (ChargePropertiesGraduatedPercentageRangesInner) o;
    return Objects.equals(this.fromValue, chargePropertiesGraduatedPercentageRangesInner.fromValue) &&
        Objects.equals(this.toValue, chargePropertiesGraduatedPercentageRangesInner.toValue) &&
        Objects.equals(this.rate, chargePropertiesGraduatedPercentageRangesInner.rate) &&
        Objects.equals(this.flatAmount, chargePropertiesGraduatedPercentageRangesInner.flatAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fromValue, toValue, rate, flatAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChargePropertiesGraduatedPercentageRangesInner {\n");
    sb.append("    fromValue: ").append(toIndentedString(fromValue)).append("\n");
    sb.append("    toValue: ").append(toIndentedString(toValue)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    flatAmount: ").append(toIndentedString(flatAmount)).append("\n");
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

