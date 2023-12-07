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
import org.openapitools.client.model.AppliedCouponInputAppliedCoupon;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * AppliedCouponInput
 */
@JsonPropertyOrder({
  AppliedCouponInput.JSON_PROPERTY_APPLIED_COUPON
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-07T15:52:17.625211Z[Etc/UTC]")
public class AppliedCouponInput {
  public static final String JSON_PROPERTY_APPLIED_COUPON = "applied_coupon";
  private AppliedCouponInputAppliedCoupon appliedCoupon;

  public AppliedCouponInput() {
  }

  public AppliedCouponInput appliedCoupon(AppliedCouponInputAppliedCoupon appliedCoupon) {
    
    this.appliedCoupon = appliedCoupon;
    return this;
  }

   /**
   * Get appliedCoupon
   * @return appliedCoupon
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_APPLIED_COUPON)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public AppliedCouponInputAppliedCoupon getAppliedCoupon() {
    return appliedCoupon;
  }


  @JsonProperty(JSON_PROPERTY_APPLIED_COUPON)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAppliedCoupon(AppliedCouponInputAppliedCoupon appliedCoupon) {
    this.appliedCoupon = appliedCoupon;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppliedCouponInput appliedCouponInput = (AppliedCouponInput) o;
    return Objects.equals(this.appliedCoupon, appliedCouponInput.appliedCoupon);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appliedCoupon);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppliedCouponInput {\n");
    sb.append("    appliedCoupon: ").append(toIndentedString(appliedCoupon)).append("\n");
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

