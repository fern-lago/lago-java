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
 * FeeObjectAmountDetailsAllOfVolumeRangesInner
 */
@JsonPropertyOrder({
  FeeObjectAmountDetailsAllOfVolumeRangesInner.JSON_PROPERTY_PER_UNIT_AMOUNT,
  FeeObjectAmountDetailsAllOfVolumeRangesInner.JSON_PROPERTY_FLAT_UNIT_AMOUNT,
  FeeObjectAmountDetailsAllOfVolumeRangesInner.JSON_PROPERTY_PER_UNIT_TOTAL_AMOUNT
})
@JsonTypeName("FeeObject_amount_details_allOf_volume_ranges_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-27T14:12:55.372025191Z[Etc/UTC]")
public class FeeObjectAmountDetailsAllOfVolumeRangesInner {
  public static final String JSON_PROPERTY_PER_UNIT_AMOUNT = "per_unit_amount";
  private String perUnitAmount;

  public static final String JSON_PROPERTY_FLAT_UNIT_AMOUNT = "flat_unit_amount";
  private String flatUnitAmount;

  public static final String JSON_PROPERTY_PER_UNIT_TOTAL_AMOUNT = "per_unit_total_amount";
  private String perUnitTotalAmount;

  public FeeObjectAmountDetailsAllOfVolumeRangesInner() {
  }

  public FeeObjectAmountDetailsAllOfVolumeRangesInner perUnitAmount(String perUnitAmount) {
    
    this.perUnitAmount = perUnitAmount;
    return this;
  }

   /**
   * The flat amount for a whole tier, excluding tax, for a &#x60;volume&#x60; charge model.
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


  public FeeObjectAmountDetailsAllOfVolumeRangesInner flatUnitAmount(String flatUnitAmount) {
    
    this.flatUnitAmount = flatUnitAmount;
    return this;
  }

   /**
   * The unit price, excluding tax, for a specific tier of a &#x60;volume&#x60; charge model.
   * @return flatUnitAmount
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FLAT_UNIT_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getFlatUnitAmount() {
    return flatUnitAmount;
  }


  @JsonProperty(JSON_PROPERTY_FLAT_UNIT_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFlatUnitAmount(String flatUnitAmount) {
    this.flatUnitAmount = flatUnitAmount;
  }


  public FeeObjectAmountDetailsAllOfVolumeRangesInner perUnitTotalAmount(String perUnitTotalAmount) {
    
    this.perUnitTotalAmount = perUnitTotalAmount;
    return this;
  }

   /**
   * Total amount of received units to be charged.
   * @return perUnitTotalAmount
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PER_UNIT_TOTAL_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPerUnitTotalAmount() {
    return perUnitTotalAmount;
  }


  @JsonProperty(JSON_PROPERTY_PER_UNIT_TOTAL_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPerUnitTotalAmount(String perUnitTotalAmount) {
    this.perUnitTotalAmount = perUnitTotalAmount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeeObjectAmountDetailsAllOfVolumeRangesInner feeObjectAmountDetailsAllOfVolumeRangesInner = (FeeObjectAmountDetailsAllOfVolumeRangesInner) o;
    return Objects.equals(this.perUnitAmount, feeObjectAmountDetailsAllOfVolumeRangesInner.perUnitAmount) &&
        Objects.equals(this.flatUnitAmount, feeObjectAmountDetailsAllOfVolumeRangesInner.flatUnitAmount) &&
        Objects.equals(this.perUnitTotalAmount, feeObjectAmountDetailsAllOfVolumeRangesInner.perUnitTotalAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(perUnitAmount, flatUnitAmount, perUnitTotalAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeeObjectAmountDetailsAllOfVolumeRangesInner {\n");
    sb.append("    perUnitAmount: ").append(toIndentedString(perUnitAmount)).append("\n");
    sb.append("    flatUnitAmount: ").append(toIndentedString(flatUnitAmount)).append("\n");
    sb.append("    perUnitTotalAmount: ").append(toIndentedString(perUnitTotalAmount)).append("\n");
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
