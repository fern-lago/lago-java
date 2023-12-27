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
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * InvoiceOneOffCreateInputInvoiceFeesInner
 */
@JsonPropertyOrder({
  InvoiceOneOffCreateInputInvoiceFeesInner.JSON_PROPERTY_ADD_ON_CODE,
  InvoiceOneOffCreateInputInvoiceFeesInner.JSON_PROPERTY_INVOICE_DISPLAY_NAME,
  InvoiceOneOffCreateInputInvoiceFeesInner.JSON_PROPERTY_UNIT_AMOUNT_CENTS,
  InvoiceOneOffCreateInputInvoiceFeesInner.JSON_PROPERTY_UNITS,
  InvoiceOneOffCreateInputInvoiceFeesInner.JSON_PROPERTY_DESCRIPTION,
  InvoiceOneOffCreateInputInvoiceFeesInner.JSON_PROPERTY_TAX_CODES
})
@JsonTypeName("InvoiceOneOffCreateInput_invoice_fees_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-27T14:12:55.372025191Z[Etc/UTC]")
public class InvoiceOneOffCreateInputInvoiceFeesInner {
  public static final String JSON_PROPERTY_ADD_ON_CODE = "add_on_code";
  private String addOnCode;

  public static final String JSON_PROPERTY_INVOICE_DISPLAY_NAME = "invoice_display_name";
  private String invoiceDisplayName;

  public static final String JSON_PROPERTY_UNIT_AMOUNT_CENTS = "unit_amount_cents";
  private JsonNullable<Integer> unitAmountCents = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_UNITS = "units";
  private JsonNullable<String> units = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private JsonNullable<String> description = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TAX_CODES = "tax_codes";
  private List<String> taxCodes;

  public InvoiceOneOffCreateInputInvoiceFeesInner() {
  }

  public InvoiceOneOffCreateInputInvoiceFeesInner addOnCode(String addOnCode) {
    
    this.addOnCode = addOnCode;
    return this;
  }

   /**
   * The code of the add-on used as invoice item.
   * @return addOnCode
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ADD_ON_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAddOnCode() {
    return addOnCode;
  }


  @JsonProperty(JSON_PROPERTY_ADD_ON_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAddOnCode(String addOnCode) {
    this.addOnCode = addOnCode;
  }


  public InvoiceOneOffCreateInputInvoiceFeesInner invoiceDisplayName(String invoiceDisplayName) {
    
    this.invoiceDisplayName = invoiceDisplayName;
    return this;
  }

   /**
   * Specifies the name that will be displayed on an invoice. If no value is set for this field, the name of the actual charge will be used as the default display name.
   * @return invoiceDisplayName
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INVOICE_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInvoiceDisplayName() {
    return invoiceDisplayName;
  }


  @JsonProperty(JSON_PROPERTY_INVOICE_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInvoiceDisplayName(String invoiceDisplayName) {
    this.invoiceDisplayName = invoiceDisplayName;
  }


  public InvoiceOneOffCreateInputInvoiceFeesInner unitAmountCents(Integer unitAmountCents) {
    this.unitAmountCents = JsonNullable.<Integer>of(unitAmountCents);
    
    return this;
  }

   /**
   * The amount of the fee per unit, expressed in cents. By default, the amount of the add-on is used.
   * @return unitAmountCents
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Integer getUnitAmountCents() {
        return unitAmountCents.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_UNIT_AMOUNT_CENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getUnitAmountCents_JsonNullable() {
    return unitAmountCents;
  }
  
  @JsonProperty(JSON_PROPERTY_UNIT_AMOUNT_CENTS)
  public void setUnitAmountCents_JsonNullable(JsonNullable<Integer> unitAmountCents) {
    this.unitAmountCents = unitAmountCents;
  }

  public void setUnitAmountCents(Integer unitAmountCents) {
    this.unitAmountCents = JsonNullable.<Integer>of(unitAmountCents);
  }


  public InvoiceOneOffCreateInputInvoiceFeesInner units(String units) {
    this.units = JsonNullable.<String>of(units);
    
    return this;
  }

   /**
   * The quantity of units associated with the fee. By default, only 1 unit is added to the invoice.
   * @return units
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getUnits() {
        return units.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_UNITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getUnits_JsonNullable() {
    return units;
  }
  
  @JsonProperty(JSON_PROPERTY_UNITS)
  public void setUnits_JsonNullable(JsonNullable<String> units) {
    this.units = units;
  }

  public void setUnits(String units) {
    this.units = JsonNullable.<String>of(units);
  }


  public InvoiceOneOffCreateInputInvoiceFeesInner description(String description) {
    this.description = JsonNullable.<String>of(description);
    
    return this;
  }

   /**
   * This is a description
   * @return description
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getDescription() {
        return description.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getDescription_JsonNullable() {
    return description;
  }
  
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  public void setDescription_JsonNullable(JsonNullable<String> description) {
    this.description = description;
  }

  public void setDescription(String description) {
    this.description = JsonNullable.<String>of(description);
  }


  public InvoiceOneOffCreateInputInvoiceFeesInner taxCodes(List<String> taxCodes) {
    
    this.taxCodes = taxCodes;
    return this;
  }

  public InvoiceOneOffCreateInputInvoiceFeesInner addTaxCodesItem(String taxCodesItem) {
    if (this.taxCodes == null) {
      this.taxCodes = new ArrayList<>();
    }
    this.taxCodes.add(taxCodesItem);
    return this;
  }

   /**
   * List of unique code used to identify the taxes.
   * @return taxCodes
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAX_CODES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getTaxCodes() {
    return taxCodes;
  }


  @JsonProperty(JSON_PROPERTY_TAX_CODES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTaxCodes(List<String> taxCodes) {
    this.taxCodes = taxCodes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvoiceOneOffCreateInputInvoiceFeesInner invoiceOneOffCreateInputInvoiceFeesInner = (InvoiceOneOffCreateInputInvoiceFeesInner) o;
    return Objects.equals(this.addOnCode, invoiceOneOffCreateInputInvoiceFeesInner.addOnCode) &&
        Objects.equals(this.invoiceDisplayName, invoiceOneOffCreateInputInvoiceFeesInner.invoiceDisplayName) &&
        equalsNullable(this.unitAmountCents, invoiceOneOffCreateInputInvoiceFeesInner.unitAmountCents) &&
        equalsNullable(this.units, invoiceOneOffCreateInputInvoiceFeesInner.units) &&
        equalsNullable(this.description, invoiceOneOffCreateInputInvoiceFeesInner.description) &&
        Objects.equals(this.taxCodes, invoiceOneOffCreateInputInvoiceFeesInner.taxCodes);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(addOnCode, invoiceDisplayName, hashCodeNullable(unitAmountCents), hashCodeNullable(units), hashCodeNullable(description), taxCodes);
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
    sb.append("class InvoiceOneOffCreateInputInvoiceFeesInner {\n");
    sb.append("    addOnCode: ").append(toIndentedString(addOnCode)).append("\n");
    sb.append("    invoiceDisplayName: ").append(toIndentedString(invoiceDisplayName)).append("\n");
    sb.append("    unitAmountCents: ").append(toIndentedString(unitAmountCents)).append("\n");
    sb.append("    units: ").append(toIndentedString(units)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    taxCodes: ").append(toIndentedString(taxCodes)).append("\n");
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

