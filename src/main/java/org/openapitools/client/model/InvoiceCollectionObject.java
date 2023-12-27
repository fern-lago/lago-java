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
import org.openapitools.client.model.Currency;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * InvoiceCollectionObject
 */
@JsonPropertyOrder({
  InvoiceCollectionObject.JSON_PROPERTY_MONTH,
  InvoiceCollectionObject.JSON_PROPERTY_PAYMENT_STATUS,
  InvoiceCollectionObject.JSON_PROPERTY_INVOICES_COUNT,
  InvoiceCollectionObject.JSON_PROPERTY_AMOUNT_CENTS,
  InvoiceCollectionObject.JSON_PROPERTY_CURRENCY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-27T14:12:55.372025191Z[Etc/UTC]")
public class InvoiceCollectionObject {
  public static final String JSON_PROPERTY_MONTH = "month";
  private String month;

  /**
   * The payment status of the invoices.
   */
  public enum PaymentStatusEnum {
    PENDING("pending"),
    
    SUCCEEDED("succeeded"),
    
    FAILED("failed");

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

  public static final String JSON_PROPERTY_INVOICES_COUNT = "invoices_count";
  private Integer invoicesCount;

  public static final String JSON_PROPERTY_AMOUNT_CENTS = "amount_cents";
  private Integer amountCents;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private Currency currency;

  public InvoiceCollectionObject() {
  }

  public InvoiceCollectionObject month(String month) {
    
    this.month = month;
    return this;
  }

   /**
   * Identifies the month to analyze revenue.
   * @return month
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MONTH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getMonth() {
    return month;
  }


  @JsonProperty(JSON_PROPERTY_MONTH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMonth(String month) {
    this.month = month;
  }


  public InvoiceCollectionObject paymentStatus(PaymentStatusEnum paymentStatus) {
    
    this.paymentStatus = paymentStatus;
    return this;
  }

   /**
   * The payment status of the invoices.
   * @return paymentStatus
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAYMENT_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PaymentStatusEnum getPaymentStatus() {
    return paymentStatus;
  }


  @JsonProperty(JSON_PROPERTY_PAYMENT_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentStatus(PaymentStatusEnum paymentStatus) {
    this.paymentStatus = paymentStatus;
  }


  public InvoiceCollectionObject invoicesCount(Integer invoicesCount) {
    
    this.invoicesCount = invoicesCount;
    return this;
  }

   /**
   * Contains invoices count.
   * @return invoicesCount
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_INVOICES_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getInvoicesCount() {
    return invoicesCount;
  }


  @JsonProperty(JSON_PROPERTY_INVOICES_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setInvoicesCount(Integer invoicesCount) {
    this.invoicesCount = invoicesCount;
  }


  public InvoiceCollectionObject amountCents(Integer amountCents) {
    
    this.amountCents = amountCents;
    return this;
  }

   /**
   * The total amount of revenue for a period, expressed in cents.
   * @return amountCents
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_AMOUNT_CENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getAmountCents() {
    return amountCents;
  }


  @JsonProperty(JSON_PROPERTY_AMOUNT_CENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAmountCents(Integer amountCents) {
    this.amountCents = amountCents;
  }


  public InvoiceCollectionObject currency(Currency currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Currency getCurrency() {
    return currency;
  }


  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrency(Currency currency) {
    this.currency = currency;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvoiceCollectionObject invoiceCollectionObject = (InvoiceCollectionObject) o;
    return Objects.equals(this.month, invoiceCollectionObject.month) &&
        Objects.equals(this.paymentStatus, invoiceCollectionObject.paymentStatus) &&
        Objects.equals(this.invoicesCount, invoiceCollectionObject.invoicesCount) &&
        Objects.equals(this.amountCents, invoiceCollectionObject.amountCents) &&
        Objects.equals(this.currency, invoiceCollectionObject.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(month, paymentStatus, invoicesCount, amountCents, currency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoiceCollectionObject {\n");
    sb.append("    month: ").append(toIndentedString(month)).append("\n");
    sb.append("    paymentStatus: ").append(toIndentedString(paymentStatus)).append("\n");
    sb.append("    invoicesCount: ").append(toIndentedString(invoicesCount)).append("\n");
    sb.append("    amountCents: ").append(toIndentedString(amountCents)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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

