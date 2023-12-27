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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.FeeObjectAmountDetailsAllOfGraduatedPercentageRangesInner;
import org.openapitools.client.model.FeeObjectAmountDetailsAllOfGraduatedRangesInner;
import org.openapitools.client.model.FeeObjectAmountDetailsAllOfVolumeRangesInner;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * FeeObjectAmountDetails
 */
@JsonPropertyOrder({
  FeeObjectAmountDetails.JSON_PROPERTY_GRADUATED_RANGES,
  FeeObjectAmountDetails.JSON_PROPERTY_GRADUATED_PERCENTAGE_RANGES,
  FeeObjectAmountDetails.JSON_PROPERTY_FREE_UNITS,
  FeeObjectAmountDetails.JSON_PROPERTY_PAID_UNITS,
  FeeObjectAmountDetails.JSON_PROPERTY_PER_PACKAGE_SIZE,
  FeeObjectAmountDetails.JSON_PROPERTY_PER_PACKAGE_UNIT_AMOUNT,
  FeeObjectAmountDetails.JSON_PROPERTY_UNITS,
  FeeObjectAmountDetails.JSON_PROPERTY_FREE_EVENTS,
  FeeObjectAmountDetails.JSON_PROPERTY_RATE,
  FeeObjectAmountDetails.JSON_PROPERTY_PER_UNIT_TOTAL_AMOUNT,
  FeeObjectAmountDetails.JSON_PROPERTY_PAID_EVENTS,
  FeeObjectAmountDetails.JSON_PROPERTY_FIXED_FEE_UNIT_AMOUNT,
  FeeObjectAmountDetails.JSON_PROPERTY_FIXED_FEE_TOTAL_AMOUNT,
  FeeObjectAmountDetails.JSON_PROPERTY_MIN_MAX_ADJUSTMENT_TOTAL_AMOUNT,
  FeeObjectAmountDetails.JSON_PROPERTY_VOLUME_RANGES
})
@JsonTypeName("FeeObject_amount_details")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-27T14:12:55.372025191Z[Etc/UTC]")
public class FeeObjectAmountDetails {
  public static final String JSON_PROPERTY_GRADUATED_RANGES = "graduated_ranges";
  private List<FeeObjectAmountDetailsAllOfGraduatedRangesInner> graduatedRanges;

  public static final String JSON_PROPERTY_GRADUATED_PERCENTAGE_RANGES = "graduated_percentage_ranges";
  private List<FeeObjectAmountDetailsAllOfGraduatedPercentageRangesInner> graduatedPercentageRanges;

  public static final String JSON_PROPERTY_FREE_UNITS = "free_units";
  private String freeUnits;

  public static final String JSON_PROPERTY_PAID_UNITS = "paid_units";
  private String paidUnits;

  public static final String JSON_PROPERTY_PER_PACKAGE_SIZE = "per_package_size";
  private Integer perPackageSize;

  public static final String JSON_PROPERTY_PER_PACKAGE_UNIT_AMOUNT = "per_package_unit_amount";
  private String perPackageUnitAmount;

  public static final String JSON_PROPERTY_UNITS = "units";
  private String units;

  public static final String JSON_PROPERTY_FREE_EVENTS = "free_events";
  private Integer freeEvents;

  public static final String JSON_PROPERTY_RATE = "rate";
  private String rate;

  public static final String JSON_PROPERTY_PER_UNIT_TOTAL_AMOUNT = "per_unit_total_amount";
  private String perUnitTotalAmount;

  public static final String JSON_PROPERTY_PAID_EVENTS = "paid_events";
  private Integer paidEvents;

  public static final String JSON_PROPERTY_FIXED_FEE_UNIT_AMOUNT = "fixed_fee_unit_amount";
  private String fixedFeeUnitAmount;

  public static final String JSON_PROPERTY_FIXED_FEE_TOTAL_AMOUNT = "fixed_fee_total_amount";
  private String fixedFeeTotalAmount;

  public static final String JSON_PROPERTY_MIN_MAX_ADJUSTMENT_TOTAL_AMOUNT = "min_max_adjustment_total_amount";
  private String minMaxAdjustmentTotalAmount;

  public static final String JSON_PROPERTY_VOLUME_RANGES = "volume_ranges";
  private List<FeeObjectAmountDetailsAllOfVolumeRangesInner> volumeRanges;

  public FeeObjectAmountDetails() {
  }

  public FeeObjectAmountDetails graduatedRanges(List<FeeObjectAmountDetailsAllOfGraduatedRangesInner> graduatedRanges) {
    
    this.graduatedRanges = graduatedRanges;
    return this;
  }

  public FeeObjectAmountDetails addGraduatedRangesItem(FeeObjectAmountDetailsAllOfGraduatedRangesInner graduatedRangesItem) {
    if (this.graduatedRanges == null) {
      this.graduatedRanges = new ArrayList<>();
    }
    this.graduatedRanges.add(graduatedRangesItem);
    return this;
  }

   /**
   * Graduated ranges, used for a &#x60;graduated&#x60; charge model.
   * @return graduatedRanges
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GRADUATED_RANGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<FeeObjectAmountDetailsAllOfGraduatedRangesInner> getGraduatedRanges() {
    return graduatedRanges;
  }


  @JsonProperty(JSON_PROPERTY_GRADUATED_RANGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGraduatedRanges(List<FeeObjectAmountDetailsAllOfGraduatedRangesInner> graduatedRanges) {
    this.graduatedRanges = graduatedRanges;
  }


  public FeeObjectAmountDetails graduatedPercentageRanges(List<FeeObjectAmountDetailsAllOfGraduatedPercentageRangesInner> graduatedPercentageRanges) {
    
    this.graduatedPercentageRanges = graduatedPercentageRanges;
    return this;
  }

  public FeeObjectAmountDetails addGraduatedPercentageRangesItem(FeeObjectAmountDetailsAllOfGraduatedPercentageRangesInner graduatedPercentageRangesItem) {
    if (this.graduatedPercentageRanges == null) {
      this.graduatedPercentageRanges = new ArrayList<>();
    }
    this.graduatedPercentageRanges.add(graduatedPercentageRangesItem);
    return this;
  }

   /**
   * Graduated percentage ranges, used for a &#x60;graduated_percentage&#x60; charge model.
   * @return graduatedPercentageRanges
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GRADUATED_PERCENTAGE_RANGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<FeeObjectAmountDetailsAllOfGraduatedPercentageRangesInner> getGraduatedPercentageRanges() {
    return graduatedPercentageRanges;
  }


  @JsonProperty(JSON_PROPERTY_GRADUATED_PERCENTAGE_RANGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGraduatedPercentageRanges(List<FeeObjectAmountDetailsAllOfGraduatedPercentageRangesInner> graduatedPercentageRanges) {
    this.graduatedPercentageRanges = graduatedPercentageRanges;
  }


  public FeeObjectAmountDetails freeUnits(String freeUnits) {
    
    this.freeUnits = freeUnits;
    return this;
  }

   /**
   * The quantity of units that are provided free of charge for each billing period in a &#x60;package&#x60; charge model.
   * @return freeUnits
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FREE_UNITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFreeUnits() {
    return freeUnits;
  }


  @JsonProperty(JSON_PROPERTY_FREE_UNITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFreeUnits(String freeUnits) {
    this.freeUnits = freeUnits;
  }


  public FeeObjectAmountDetails paidUnits(String paidUnits) {
    
    this.paidUnits = paidUnits;
    return this;
  }

   /**
   * The quantity of units that are not provided free of charge for each billing period in a &#x60;package&#x60; charge model.
   * @return paidUnits
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAID_UNITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPaidUnits() {
    return paidUnits;
  }


  @JsonProperty(JSON_PROPERTY_PAID_UNITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaidUnits(String paidUnits) {
    this.paidUnits = paidUnits;
  }


  public FeeObjectAmountDetails perPackageSize(Integer perPackageSize) {
    
    this.perPackageSize = perPackageSize;
    return this;
  }

   /**
   * The quantity of units included, defined for Package or Percentage charge model.
   * @return perPackageSize
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PER_PACKAGE_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPerPackageSize() {
    return perPackageSize;
  }


  @JsonProperty(JSON_PROPERTY_PER_PACKAGE_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPerPackageSize(Integer perPackageSize) {
    this.perPackageSize = perPackageSize;
  }


  public FeeObjectAmountDetails perPackageUnitAmount(String perPackageUnitAmount) {
    
    this.perPackageUnitAmount = perPackageUnitAmount;
    return this;
  }

   /**
   * Total amount to charge for received paid_units, defined for Package or Percentage charge model.
   * @return perPackageUnitAmount
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PER_PACKAGE_UNIT_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPerPackageUnitAmount() {
    return perPackageUnitAmount;
  }


  @JsonProperty(JSON_PROPERTY_PER_PACKAGE_UNIT_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPerPackageUnitAmount(String perPackageUnitAmount) {
    this.perPackageUnitAmount = perPackageUnitAmount;
  }


  public FeeObjectAmountDetails units(String units) {
    
    this.units = units;
    return this;
  }

   /**
   * The total units received in Lago for the Percentage charge model.
   * @return units
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UNITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUnits() {
    return units;
  }


  @JsonProperty(JSON_PROPERTY_UNITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUnits(String units) {
    this.units = units;
  }


  public FeeObjectAmountDetails freeEvents(Integer freeEvents) {
    
    this.freeEvents = freeEvents;
    return this;
  }

   /**
   * Total number of free events allowed for the Percentage charge model.
   * @return freeEvents
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FREE_EVENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getFreeEvents() {
    return freeEvents;
  }


  @JsonProperty(JSON_PROPERTY_FREE_EVENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFreeEvents(Integer freeEvents) {
    this.freeEvents = freeEvents;
  }


  public FeeObjectAmountDetails rate(String rate) {
    
    this.rate = rate;
    return this;
  }

   /**
   * Percentage rate applied for the Percentage charge model.
   * @return rate
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRate() {
    return rate;
  }


  @JsonProperty(JSON_PROPERTY_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRate(String rate) {
    this.rate = rate;
  }


  public FeeObjectAmountDetails perUnitTotalAmount(String perUnitTotalAmount) {
    
    this.perUnitTotalAmount = perUnitTotalAmount;
    return this;
  }

   /**
   * Total amount of received units to be charged for the Percentage charge model.
   * @return perUnitTotalAmount
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PER_UNIT_TOTAL_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPerUnitTotalAmount() {
    return perUnitTotalAmount;
  }


  @JsonProperty(JSON_PROPERTY_PER_UNIT_TOTAL_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPerUnitTotalAmount(String perUnitTotalAmount) {
    this.perUnitTotalAmount = perUnitTotalAmount;
  }


  public FeeObjectAmountDetails paidEvents(Integer paidEvents) {
    
    this.paidEvents = paidEvents;
    return this;
  }

   /**
   * Total number of paid events for the Percentage charge model.
   * @return paidEvents
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAID_EVENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPaidEvents() {
    return paidEvents;
  }


  @JsonProperty(JSON_PROPERTY_PAID_EVENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaidEvents(Integer paidEvents) {
    this.paidEvents = paidEvents;
  }


  public FeeObjectAmountDetails fixedFeeUnitAmount(String fixedFeeUnitAmount) {
    
    this.fixedFeeUnitAmount = fixedFeeUnitAmount;
    return this;
  }

   /**
   * Fixed fee unit price per received paid_event for the Percentage charge model.
   * @return fixedFeeUnitAmount
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FIXED_FEE_UNIT_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFixedFeeUnitAmount() {
    return fixedFeeUnitAmount;
  }


  @JsonProperty(JSON_PROPERTY_FIXED_FEE_UNIT_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFixedFeeUnitAmount(String fixedFeeUnitAmount) {
    this.fixedFeeUnitAmount = fixedFeeUnitAmount;
  }


  public FeeObjectAmountDetails fixedFeeTotalAmount(String fixedFeeTotalAmount) {
    
    this.fixedFeeTotalAmount = fixedFeeTotalAmount;
    return this;
  }

   /**
   * Total amount to charge for received paid_events for the Percentage charge model.
   * @return fixedFeeTotalAmount
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FIXED_FEE_TOTAL_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFixedFeeTotalAmount() {
    return fixedFeeTotalAmount;
  }


  @JsonProperty(JSON_PROPERTY_FIXED_FEE_TOTAL_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFixedFeeTotalAmount(String fixedFeeTotalAmount) {
    this.fixedFeeTotalAmount = fixedFeeTotalAmount;
  }


  public FeeObjectAmountDetails minMaxAdjustmentTotalAmount(String minMaxAdjustmentTotalAmount) {
    
    this.minMaxAdjustmentTotalAmount = minMaxAdjustmentTotalAmount;
    return this;
  }

   /**
   * Total adjustment amount linked to minimum and maximum spending per transaction for the Percentage charge model.
   * @return minMaxAdjustmentTotalAmount
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MIN_MAX_ADJUSTMENT_TOTAL_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMinMaxAdjustmentTotalAmount() {
    return minMaxAdjustmentTotalAmount;
  }


  @JsonProperty(JSON_PROPERTY_MIN_MAX_ADJUSTMENT_TOTAL_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMinMaxAdjustmentTotalAmount(String minMaxAdjustmentTotalAmount) {
    this.minMaxAdjustmentTotalAmount = minMaxAdjustmentTotalAmount;
  }


  public FeeObjectAmountDetails volumeRanges(List<FeeObjectAmountDetailsAllOfVolumeRangesInner> volumeRanges) {
    
    this.volumeRanges = volumeRanges;
    return this;
  }

  public FeeObjectAmountDetails addVolumeRangesItem(FeeObjectAmountDetailsAllOfVolumeRangesInner volumeRangesItem) {
    if (this.volumeRanges == null) {
      this.volumeRanges = new ArrayList<>();
    }
    this.volumeRanges.add(volumeRangesItem);
    return this;
  }

   /**
   * Volume ranges, used for a &#x60;volume&#x60; charge model.
   * @return volumeRanges
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VOLUME_RANGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<FeeObjectAmountDetailsAllOfVolumeRangesInner> getVolumeRanges() {
    return volumeRanges;
  }


  @JsonProperty(JSON_PROPERTY_VOLUME_RANGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVolumeRanges(List<FeeObjectAmountDetailsAllOfVolumeRangesInner> volumeRanges) {
    this.volumeRanges = volumeRanges;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeeObjectAmountDetails feeObjectAmountDetails = (FeeObjectAmountDetails) o;
    return Objects.equals(this.graduatedRanges, feeObjectAmountDetails.graduatedRanges) &&
        Objects.equals(this.graduatedPercentageRanges, feeObjectAmountDetails.graduatedPercentageRanges) &&
        Objects.equals(this.freeUnits, feeObjectAmountDetails.freeUnits) &&
        Objects.equals(this.paidUnits, feeObjectAmountDetails.paidUnits) &&
        Objects.equals(this.perPackageSize, feeObjectAmountDetails.perPackageSize) &&
        Objects.equals(this.perPackageUnitAmount, feeObjectAmountDetails.perPackageUnitAmount) &&
        Objects.equals(this.units, feeObjectAmountDetails.units) &&
        Objects.equals(this.freeEvents, feeObjectAmountDetails.freeEvents) &&
        Objects.equals(this.rate, feeObjectAmountDetails.rate) &&
        Objects.equals(this.perUnitTotalAmount, feeObjectAmountDetails.perUnitTotalAmount) &&
        Objects.equals(this.paidEvents, feeObjectAmountDetails.paidEvents) &&
        Objects.equals(this.fixedFeeUnitAmount, feeObjectAmountDetails.fixedFeeUnitAmount) &&
        Objects.equals(this.fixedFeeTotalAmount, feeObjectAmountDetails.fixedFeeTotalAmount) &&
        Objects.equals(this.minMaxAdjustmentTotalAmount, feeObjectAmountDetails.minMaxAdjustmentTotalAmount) &&
        Objects.equals(this.volumeRanges, feeObjectAmountDetails.volumeRanges);
  }

  @Override
  public int hashCode() {
    return Objects.hash(graduatedRanges, graduatedPercentageRanges, freeUnits, paidUnits, perPackageSize, perPackageUnitAmount, units, freeEvents, rate, perUnitTotalAmount, paidEvents, fixedFeeUnitAmount, fixedFeeTotalAmount, minMaxAdjustmentTotalAmount, volumeRanges);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeeObjectAmountDetails {\n");
    sb.append("    graduatedRanges: ").append(toIndentedString(graduatedRanges)).append("\n");
    sb.append("    graduatedPercentageRanges: ").append(toIndentedString(graduatedPercentageRanges)).append("\n");
    sb.append("    freeUnits: ").append(toIndentedString(freeUnits)).append("\n");
    sb.append("    paidUnits: ").append(toIndentedString(paidUnits)).append("\n");
    sb.append("    perPackageSize: ").append(toIndentedString(perPackageSize)).append("\n");
    sb.append("    perPackageUnitAmount: ").append(toIndentedString(perPackageUnitAmount)).append("\n");
    sb.append("    units: ").append(toIndentedString(units)).append("\n");
    sb.append("    freeEvents: ").append(toIndentedString(freeEvents)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    perUnitTotalAmount: ").append(toIndentedString(perUnitTotalAmount)).append("\n");
    sb.append("    paidEvents: ").append(toIndentedString(paidEvents)).append("\n");
    sb.append("    fixedFeeUnitAmount: ").append(toIndentedString(fixedFeeUnitAmount)).append("\n");
    sb.append("    fixedFeeTotalAmount: ").append(toIndentedString(fixedFeeTotalAmount)).append("\n");
    sb.append("    minMaxAdjustmentTotalAmount: ").append(toIndentedString(minMaxAdjustmentTotalAmount)).append("\n");
    sb.append("    volumeRanges: ").append(toIndentedString(volumeRanges)).append("\n");
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

