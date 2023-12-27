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
 * FeeObjectAmountDetailsAllOfGraduatedRangesInner
 */
@JsonPropertyOrder({
  FeeObjectAmountDetailsAllOfGraduatedRangesInner.JSON_PROPERTY_UNITS,
  FeeObjectAmountDetailsAllOfGraduatedRangesInner.JSON_PROPERTY_FROM_VALUE,
  FeeObjectAmountDetailsAllOfGraduatedRangesInner.JSON_PROPERTY_TO_VALUE,
  FeeObjectAmountDetailsAllOfGraduatedRangesInner.JSON_PROPERTY_FLAT_UNIT_AMOUNT,
  FeeObjectAmountDetailsAllOfGraduatedRangesInner.JSON_PROPERTY_PER_UNIT_AMOUNT,
  FeeObjectAmountDetailsAllOfGraduatedRangesInner.JSON_PROPERTY_PER_UNIT_TOTAL_AMOUNT,
  FeeObjectAmountDetailsAllOfGraduatedRangesInner.JSON_PROPERTY_TOTAL_WITH_FLAT_AMOUNT
})
@JsonTypeName("FeeObject_amount_details_allOf_graduated_ranges_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-27T14:12:55.372025191Z[Etc/UTC]")
public class FeeObjectAmountDetailsAllOfGraduatedRangesInner {
  public static final String JSON_PROPERTY_UNITS = "units";
  private String units;

  public static final String JSON_PROPERTY_FROM_VALUE = "from_value";
  private Integer fromValue;

  public static final String JSON_PROPERTY_TO_VALUE = "to_value";
  private Integer toValue;

  public static final String JSON_PROPERTY_FLAT_UNIT_AMOUNT = "flat_unit_amount";
  private String flatUnitAmount;

  public static final String JSON_PROPERTY_PER_UNIT_AMOUNT = "per_unit_amount";
  private String perUnitAmount;

  public static final String JSON_PROPERTY_PER_UNIT_TOTAL_AMOUNT = "per_unit_total_amount";
  private String perUnitTotalAmount;

  public static final String JSON_PROPERTY_TOTAL_WITH_FLAT_AMOUNT = "total_with_flat_amount";
  private String totalWithFlatAmount;

  public FeeObjectAmountDetailsAllOfGraduatedRangesInner() {
  }

  public FeeObjectAmountDetailsAllOfGraduatedRangesInner units(String units) {
    
    this.units = units;
    return this;
  }

   /**
   * Total units received in Lago.
   * @return units
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_UNITS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getUnits() {
    return units;
  }


  @JsonProperty(JSON_PROPERTY_UNITS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUnits(String units) {
    this.units = units;
  }


  public FeeObjectAmountDetailsAllOfGraduatedRangesInner fromValue(Integer fromValue) {
    
    this.fromValue = fromValue;
    return this;
  }

   /**
   * Lower value of a tier. It is either 0 or the previous range&#39;s &#x60;to_value + 1&#x60;.
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


  public FeeObjectAmountDetailsAllOfGraduatedRangesInner toValue(Integer toValue) {
    
    this.toValue = toValue;
    return this;
  }

   /**
   * Highest value of a tier. - This value is higher than the from_value of the same tier. - This value is null for the last tier.
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


  public FeeObjectAmountDetailsAllOfGraduatedRangesInner flatUnitAmount(String flatUnitAmount) {
    
    this.flatUnitAmount = flatUnitAmount;
    return this;
  }

   /**
   * Flat unit amount within a specified tier.
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


  public FeeObjectAmountDetailsAllOfGraduatedRangesInner perUnitAmount(String perUnitAmount) {
    
    this.perUnitAmount = perUnitAmount;
    return this;
  }

   /**
   * Amount per unit within a specified tier.
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


  public FeeObjectAmountDetailsAllOfGraduatedRangesInner perUnitTotalAmount(String perUnitTotalAmount) {
    
    this.perUnitTotalAmount = perUnitTotalAmount;
    return this;
  }

   /**
   * Total amount of received units to be charged within a specified tier.
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


  public FeeObjectAmountDetailsAllOfGraduatedRangesInner totalWithFlatAmount(String totalWithFlatAmount) {
    
    this.totalWithFlatAmount = totalWithFlatAmount;
    return this;
  }

   /**
   * Total amount to be charged for a specific tier, taking into account the flat_unit_amount and the per_unit_total_amount.
   * @return totalWithFlatAmount
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TOTAL_WITH_FLAT_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTotalWithFlatAmount() {
    return totalWithFlatAmount;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_WITH_FLAT_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTotalWithFlatAmount(String totalWithFlatAmount) {
    this.totalWithFlatAmount = totalWithFlatAmount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeeObjectAmountDetailsAllOfGraduatedRangesInner feeObjectAmountDetailsAllOfGraduatedRangesInner = (FeeObjectAmountDetailsAllOfGraduatedRangesInner) o;
    return Objects.equals(this.units, feeObjectAmountDetailsAllOfGraduatedRangesInner.units) &&
        Objects.equals(this.fromValue, feeObjectAmountDetailsAllOfGraduatedRangesInner.fromValue) &&
        Objects.equals(this.toValue, feeObjectAmountDetailsAllOfGraduatedRangesInner.toValue) &&
        Objects.equals(this.flatUnitAmount, feeObjectAmountDetailsAllOfGraduatedRangesInner.flatUnitAmount) &&
        Objects.equals(this.perUnitAmount, feeObjectAmountDetailsAllOfGraduatedRangesInner.perUnitAmount) &&
        Objects.equals(this.perUnitTotalAmount, feeObjectAmountDetailsAllOfGraduatedRangesInner.perUnitTotalAmount) &&
        Objects.equals(this.totalWithFlatAmount, feeObjectAmountDetailsAllOfGraduatedRangesInner.totalWithFlatAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(units, fromValue, toValue, flatUnitAmount, perUnitAmount, perUnitTotalAmount, totalWithFlatAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeeObjectAmountDetailsAllOfGraduatedRangesInner {\n");
    sb.append("    units: ").append(toIndentedString(units)).append("\n");
    sb.append("    fromValue: ").append(toIndentedString(fromValue)).append("\n");
    sb.append("    toValue: ").append(toIndentedString(toValue)).append("\n");
    sb.append("    flatUnitAmount: ").append(toIndentedString(flatUnitAmount)).append("\n");
    sb.append("    perUnitAmount: ").append(toIndentedString(perUnitAmount)).append("\n");
    sb.append("    perUnitTotalAmount: ").append(toIndentedString(perUnitTotalAmount)).append("\n");
    sb.append("    totalWithFlatAmount: ").append(toIndentedString(totalWithFlatAmount)).append("\n");
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

