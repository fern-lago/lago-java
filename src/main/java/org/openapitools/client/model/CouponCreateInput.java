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
import org.openapitools.client.model.CouponCreateInputCoupon;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * CouponCreateInput
 */
@JsonPropertyOrder({
  CouponCreateInput.JSON_PROPERTY_COUPON
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-27T14:12:55.372025191Z[Etc/UTC]")
public class CouponCreateInput {
  public static final String JSON_PROPERTY_COUPON = "coupon";
  private CouponCreateInputCoupon coupon;

  public CouponCreateInput() {
  }

  public CouponCreateInput coupon(CouponCreateInputCoupon coupon) {
    
    this.coupon = coupon;
    return this;
  }

   /**
   * Get coupon
   * @return coupon
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_COUPON)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public CouponCreateInputCoupon getCoupon() {
    return coupon;
  }


  @JsonProperty(JSON_PROPERTY_COUPON)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCoupon(CouponCreateInputCoupon coupon) {
    this.coupon = coupon;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CouponCreateInput couponCreateInput = (CouponCreateInput) o;
    return Objects.equals(this.coupon, couponCreateInput.coupon);
  }

  @Override
  public int hashCode() {
    return Objects.hash(coupon);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CouponCreateInput {\n");
    sb.append("    coupon: ").append(toIndentedString(coupon)).append("\n");
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

