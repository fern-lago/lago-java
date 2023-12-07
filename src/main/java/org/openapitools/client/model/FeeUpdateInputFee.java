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
 * FeeUpdateInputFee
 */
@JsonPropertyOrder({
  FeeUpdateInputFee.JSON_PROPERTY_PAYMENT_STATUS
})
@JsonTypeName("FeeUpdateInput_fee")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-07T15:52:17.625211Z[Etc/UTC]")
public class FeeUpdateInputFee {
  /**
   * The payment status of the fee. Possible values are &#x60;pending&#x60;, &#x60;succeeded&#x60;, &#x60;failed&#x60; or &#x60;refunded&#x60;.
   */
  public enum PaymentStatusEnum {
    PENDING("pending"),
    
    SUCCEEDED("succeeded"),
    
    FAILED("failed"),
    
    REFUNDED("refunded");

    private String value;

    PaymentStatusEnum(String value) {
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
    public static PaymentStatusEnum fromValue(String value) {
      for (PaymentStatusEnum b : PaymentStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_PAYMENT_STATUS = "payment_status";
  private PaymentStatusEnum paymentStatus;

  public FeeUpdateInputFee() {
  }

  public FeeUpdateInputFee paymentStatus(PaymentStatusEnum paymentStatus) {
    
    this.paymentStatus = paymentStatus;
    return this;
  }

   /**
   * The payment status of the fee. Possible values are &#x60;pending&#x60;, &#x60;succeeded&#x60;, &#x60;failed&#x60; or &#x60;refunded&#x60;.
   * @return paymentStatus
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PAYMENT_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public PaymentStatusEnum getPaymentStatus() {
    return paymentStatus;
  }


  @JsonProperty(JSON_PROPERTY_PAYMENT_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPaymentStatus(PaymentStatusEnum paymentStatus) {
    this.paymentStatus = paymentStatus;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeeUpdateInputFee feeUpdateInputFee = (FeeUpdateInputFee) o;
    return Objects.equals(this.paymentStatus, feeUpdateInputFee.paymentStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeeUpdateInputFee {\n");
    sb.append("    paymentStatus: ").append(toIndentedString(paymentStatus)).append("\n");
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

