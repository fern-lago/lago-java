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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.Currency;
import org.openapitools.client.model.InvoiceOneOffCreateInputInvoiceFeesInner;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * InvoiceOneOffCreateInputInvoice
 */
@JsonPropertyOrder({
  InvoiceOneOffCreateInputInvoice.JSON_PROPERTY_EXTERNAL_CUSTOMER_ID,
  InvoiceOneOffCreateInputInvoice.JSON_PROPERTY_CURRENCY,
  InvoiceOneOffCreateInputInvoice.JSON_PROPERTY_FEES
})
@JsonTypeName("InvoiceOneOffCreateInput_invoice")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-24T14:46:07.416771019Z[Etc/UTC]")
public class InvoiceOneOffCreateInputInvoice {
  public static final String JSON_PROPERTY_EXTERNAL_CUSTOMER_ID = "external_customer_id";
  private String externalCustomerId;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private Currency currency;

  public static final String JSON_PROPERTY_FEES = "fees";
  private List<InvoiceOneOffCreateInputInvoiceFeesInner> fees = new ArrayList<>();

  public InvoiceOneOffCreateInputInvoice() {
  }

  public InvoiceOneOffCreateInputInvoice externalCustomerId(String externalCustomerId) {
    
    this.externalCustomerId = externalCustomerId;
    return this;
  }

   /**
   * Unique identifier assigned to the customer in your application.
   * @return externalCustomerId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EXTERNAL_CUSTOMER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getExternalCustomerId() {
    return externalCustomerId;
  }


  @JsonProperty(JSON_PROPERTY_EXTERNAL_CUSTOMER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setExternalCustomerId(String externalCustomerId) {
    this.externalCustomerId = externalCustomerId;
  }


  public InvoiceOneOffCreateInputInvoice currency(Currency currency) {
    
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


  public InvoiceOneOffCreateInputInvoice fees(List<InvoiceOneOffCreateInputInvoiceFeesInner> fees) {
    
    this.fees = fees;
    return this;
  }

  public InvoiceOneOffCreateInputInvoice addFeesItem(InvoiceOneOffCreateInputInvoiceFeesInner feesItem) {
    if (this.fees == null) {
      this.fees = new ArrayList<>();
    }
    this.fees.add(feesItem);
    return this;
  }

   /**
   * Get fees
   * @return fees
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FEES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<InvoiceOneOffCreateInputInvoiceFeesInner> getFees() {
    return fees;
  }


  @JsonProperty(JSON_PROPERTY_FEES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFees(List<InvoiceOneOffCreateInputInvoiceFeesInner> fees) {
    this.fees = fees;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvoiceOneOffCreateInputInvoice invoiceOneOffCreateInputInvoice = (InvoiceOneOffCreateInputInvoice) o;
    return Objects.equals(this.externalCustomerId, invoiceOneOffCreateInputInvoice.externalCustomerId) &&
        Objects.equals(this.currency, invoiceOneOffCreateInputInvoice.currency) &&
        Objects.equals(this.fees, invoiceOneOffCreateInputInvoice.fees);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalCustomerId, currency, fees);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoiceOneOffCreateInputInvoice {\n");
    sb.append("    externalCustomerId: ").append(toIndentedString(externalCustomerId)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    fees: ").append(toIndentedString(fees)).append("\n");
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

