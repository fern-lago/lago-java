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
import org.openapitools.client.model.Currency;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * InvoicedUsageObject
 */
@JsonPropertyOrder({
  InvoicedUsageObject.JSON_PROPERTY_MONTH,
  InvoicedUsageObject.JSON_PROPERTY_CODE,
  InvoicedUsageObject.JSON_PROPERTY_AMOUNT_CENTS,
  InvoicedUsageObject.JSON_PROPERTY_CURRENCY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-24T14:46:07.416771019Z[Etc/UTC]")
public class InvoicedUsageObject {
  public static final String JSON_PROPERTY_MONTH = "month";
  private String month;

  public static final String JSON_PROPERTY_CODE = "code";
  private String code;

  public static final String JSON_PROPERTY_AMOUNT_CENTS = "amount_cents";
  private Integer amountCents;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private Currency currency;

  public InvoicedUsageObject() {
  }

  public InvoicedUsageObject month(String month) {
    
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


  public InvoicedUsageObject code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * The code of the usage-based billable metrics.
   * @return code
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCode() {
    return code;
  }


  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCode(String code) {
    this.code = code;
  }


  public InvoicedUsageObject amountCents(Integer amountCents) {
    
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


  public InvoicedUsageObject currency(Currency currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Currency getCurrency() {
    return currency;
  }


  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
    InvoicedUsageObject invoicedUsageObject = (InvoicedUsageObject) o;
    return Objects.equals(this.month, invoicedUsageObject.month) &&
        Objects.equals(this.code, invoicedUsageObject.code) &&
        Objects.equals(this.amountCents, invoicedUsageObject.amountCents) &&
        Objects.equals(this.currency, invoicedUsageObject.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(month, code, amountCents, currency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoicedUsageObject {\n");
    sb.append("    month: ").append(toIndentedString(month)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
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

