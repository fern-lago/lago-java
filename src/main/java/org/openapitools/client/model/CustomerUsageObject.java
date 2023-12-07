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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.openapitools.client.model.Currency;
import org.openapitools.client.model.CustomerChargeUsageObject;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * CustomerUsageObject
 */
@JsonPropertyOrder({
  CustomerUsageObject.JSON_PROPERTY_FROM_DATETIME,
  CustomerUsageObject.JSON_PROPERTY_TO_DATETIME,
  CustomerUsageObject.JSON_PROPERTY_ISSUING_DATE,
  CustomerUsageObject.JSON_PROPERTY_LAGO_INVOICE_ID,
  CustomerUsageObject.JSON_PROPERTY_CURRENCY,
  CustomerUsageObject.JSON_PROPERTY_AMOUNT_CENTS,
  CustomerUsageObject.JSON_PROPERTY_TAXES_AMOUNT_CENTS,
  CustomerUsageObject.JSON_PROPERTY_TOTAL_AMOUNT_CENTS,
  CustomerUsageObject.JSON_PROPERTY_CHARGES_USAGE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-07T16:08:18.203563Z[Etc/UTC]")
public class CustomerUsageObject {
  public static final String JSON_PROPERTY_FROM_DATETIME = "from_datetime";
  private OffsetDateTime fromDatetime;

  public static final String JSON_PROPERTY_TO_DATETIME = "to_datetime";
  private OffsetDateTime toDatetime;

  public static final String JSON_PROPERTY_ISSUING_DATE = "issuing_date";
  private OffsetDateTime issuingDate;

  public static final String JSON_PROPERTY_LAGO_INVOICE_ID = "lago_invoice_id";
  private JsonNullable<UUID> lagoInvoiceId = JsonNullable.<UUID>undefined();

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private Currency currency;

  public static final String JSON_PROPERTY_AMOUNT_CENTS = "amount_cents";
  private Integer amountCents;

  public static final String JSON_PROPERTY_TAXES_AMOUNT_CENTS = "taxes_amount_cents";
  private Integer taxesAmountCents;

  public static final String JSON_PROPERTY_TOTAL_AMOUNT_CENTS = "total_amount_cents";
  private Integer totalAmountCents;

  public static final String JSON_PROPERTY_CHARGES_USAGE = "charges_usage";
  private List<CustomerChargeUsageObject> chargesUsage = new ArrayList<>();

  public CustomerUsageObject() {
  }

  public CustomerUsageObject fromDatetime(OffsetDateTime fromDatetime) {
    
    this.fromDatetime = fromDatetime;
    return this;
  }

   /**
   * The lower bound of the billing period, expressed in the ISO 8601 datetime format in Coordinated Universal Time (UTC).
   * @return fromDatetime
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FROM_DATETIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OffsetDateTime getFromDatetime() {
    return fromDatetime;
  }


  @JsonProperty(JSON_PROPERTY_FROM_DATETIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFromDatetime(OffsetDateTime fromDatetime) {
    this.fromDatetime = fromDatetime;
  }


  public CustomerUsageObject toDatetime(OffsetDateTime toDatetime) {
    
    this.toDatetime = toDatetime;
    return this;
  }

   /**
   * The upper bound of the billing period, expressed in the ISO 8601 datetime format in Coordinated Universal Time (UTC).
   * @return toDatetime
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TO_DATETIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OffsetDateTime getToDatetime() {
    return toDatetime;
  }


  @JsonProperty(JSON_PROPERTY_TO_DATETIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setToDatetime(OffsetDateTime toDatetime) {
    this.toDatetime = toDatetime;
  }


  public CustomerUsageObject issuingDate(OffsetDateTime issuingDate) {
    
    this.issuingDate = issuingDate;
    return this;
  }

   /**
   * The date of creation of the invoice.
   * @return issuingDate
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ISSUING_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OffsetDateTime getIssuingDate() {
    return issuingDate;
  }


  @JsonProperty(JSON_PROPERTY_ISSUING_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIssuingDate(OffsetDateTime issuingDate) {
    this.issuingDate = issuingDate;
  }


  public CustomerUsageObject lagoInvoiceId(UUID lagoInvoiceId) {
    this.lagoInvoiceId = JsonNullable.<UUID>of(lagoInvoiceId);
    
    return this;
  }

   /**
   * A unique identifier associated with the invoice related to this particular usage record.
   * @return lagoInvoiceId
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public UUID getLagoInvoiceId() {
        return lagoInvoiceId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LAGO_INVOICE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<UUID> getLagoInvoiceId_JsonNullable() {
    return lagoInvoiceId;
  }
  
  @JsonProperty(JSON_PROPERTY_LAGO_INVOICE_ID)
  public void setLagoInvoiceId_JsonNullable(JsonNullable<UUID> lagoInvoiceId) {
    this.lagoInvoiceId = lagoInvoiceId;
  }

  public void setLagoInvoiceId(UUID lagoInvoiceId) {
    this.lagoInvoiceId = JsonNullable.<UUID>of(lagoInvoiceId);
  }


  public CustomerUsageObject currency(Currency currency) {
    
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


  public CustomerUsageObject amountCents(Integer amountCents) {
    
    this.amountCents = amountCents;
    return this;
  }

   /**
   * The amount in cents, tax excluded.
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


  public CustomerUsageObject taxesAmountCents(Integer taxesAmountCents) {
    
    this.taxesAmountCents = taxesAmountCents;
    return this;
  }

   /**
   * The tax amount in cents.
   * @return taxesAmountCents
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TAXES_AMOUNT_CENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getTaxesAmountCents() {
    return taxesAmountCents;
  }


  @JsonProperty(JSON_PROPERTY_TAXES_AMOUNT_CENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTaxesAmountCents(Integer taxesAmountCents) {
    this.taxesAmountCents = taxesAmountCents;
  }


  public CustomerUsageObject totalAmountCents(Integer totalAmountCents) {
    
    this.totalAmountCents = totalAmountCents;
    return this;
  }

   /**
   * The total amount in cents, tax included.
   * @return totalAmountCents
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TOTAL_AMOUNT_CENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getTotalAmountCents() {
    return totalAmountCents;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_AMOUNT_CENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTotalAmountCents(Integer totalAmountCents) {
    this.totalAmountCents = totalAmountCents;
  }


  public CustomerUsageObject chargesUsage(List<CustomerChargeUsageObject> chargesUsage) {
    
    this.chargesUsage = chargesUsage;
    return this;
  }

  public CustomerUsageObject addChargesUsageItem(CustomerChargeUsageObject chargesUsageItem) {
    if (this.chargesUsage == null) {
      this.chargesUsage = new ArrayList<>();
    }
    this.chargesUsage.add(chargesUsageItem);
    return this;
  }

   /**
   * Array of charges that comprise the current usage. It contains detailed information about individual charge items associated with the usage.
   * @return chargesUsage
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CHARGES_USAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<CustomerChargeUsageObject> getChargesUsage() {
    return chargesUsage;
  }


  @JsonProperty(JSON_PROPERTY_CHARGES_USAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setChargesUsage(List<CustomerChargeUsageObject> chargesUsage) {
    this.chargesUsage = chargesUsage;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerUsageObject customerUsageObject = (CustomerUsageObject) o;
    return Objects.equals(this.fromDatetime, customerUsageObject.fromDatetime) &&
        Objects.equals(this.toDatetime, customerUsageObject.toDatetime) &&
        Objects.equals(this.issuingDate, customerUsageObject.issuingDate) &&
        equalsNullable(this.lagoInvoiceId, customerUsageObject.lagoInvoiceId) &&
        Objects.equals(this.currency, customerUsageObject.currency) &&
        Objects.equals(this.amountCents, customerUsageObject.amountCents) &&
        Objects.equals(this.taxesAmountCents, customerUsageObject.taxesAmountCents) &&
        Objects.equals(this.totalAmountCents, customerUsageObject.totalAmountCents) &&
        Objects.equals(this.chargesUsage, customerUsageObject.chargesUsage);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(fromDatetime, toDatetime, issuingDate, hashCodeNullable(lagoInvoiceId), currency, amountCents, taxesAmountCents, totalAmountCents, chargesUsage);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerUsageObject {\n");
    sb.append("    fromDatetime: ").append(toIndentedString(fromDatetime)).append("\n");
    sb.append("    toDatetime: ").append(toIndentedString(toDatetime)).append("\n");
    sb.append("    issuingDate: ").append(toIndentedString(issuingDate)).append("\n");
    sb.append("    lagoInvoiceId: ").append(toIndentedString(lagoInvoiceId)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    amountCents: ").append(toIndentedString(amountCents)).append("\n");
    sb.append("    taxesAmountCents: ").append(toIndentedString(taxesAmountCents)).append("\n");
    sb.append("    totalAmountCents: ").append(toIndentedString(totalAmountCents)).append("\n");
    sb.append("    chargesUsage: ").append(toIndentedString(chargesUsage)).append("\n");
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

