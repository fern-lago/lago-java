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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.Currency;
import org.openapitools.client.model.PlanOverridesObjectChargesInner;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Based plan overrides.
 */
@JsonPropertyOrder({
  PlanOverridesObject.JSON_PROPERTY_AMOUNT_CENTS,
  PlanOverridesObject.JSON_PROPERTY_AMOUNT_CURRENCY,
  PlanOverridesObject.JSON_PROPERTY_DESCRIPTION,
  PlanOverridesObject.JSON_PROPERTY_INVOICE_DISPLAY_NAME,
  PlanOverridesObject.JSON_PROPERTY_NAME,
  PlanOverridesObject.JSON_PROPERTY_TAX_CODES,
  PlanOverridesObject.JSON_PROPERTY_TRIAL_PERIOD,
  PlanOverridesObject.JSON_PROPERTY_CHARGES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-07T15:52:17.625211Z[Etc/UTC]")
public class PlanOverridesObject {
  public static final String JSON_PROPERTY_AMOUNT_CENTS = "amount_cents";
  private Integer amountCents;

  public static final String JSON_PROPERTY_AMOUNT_CURRENCY = "amount_currency";
  private Currency amountCurrency;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_INVOICE_DISPLAY_NAME = "invoice_display_name";
  private String invoiceDisplayName;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_TAX_CODES = "tax_codes";
  private List<String> taxCodes;

  public static final String JSON_PROPERTY_TRIAL_PERIOD = "trial_period";
  private BigDecimal trialPeriod;

  public static final String JSON_PROPERTY_CHARGES = "charges";
  private List<PlanOverridesObjectChargesInner> charges;

  public PlanOverridesObject() {
  }

  public PlanOverridesObject amountCents(Integer amountCents) {
    
    this.amountCents = amountCents;
    return this;
  }

   /**
   * The base cost of the plan, excluding any applicable taxes, that is billed on a recurring basis. This value is defined at 0 if your plan is a pay-as-you-go plan.
   * @return amountCents
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AMOUNT_CENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAmountCents() {
    return amountCents;
  }


  @JsonProperty(JSON_PROPERTY_AMOUNT_CENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAmountCents(Integer amountCents) {
    this.amountCents = amountCents;
  }


  public PlanOverridesObject amountCurrency(Currency amountCurrency) {
    
    this.amountCurrency = amountCurrency;
    return this;
  }

   /**
   * Get amountCurrency
   * @return amountCurrency
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AMOUNT_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Currency getAmountCurrency() {
    return amountCurrency;
  }


  @JsonProperty(JSON_PROPERTY_AMOUNT_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAmountCurrency(Currency amountCurrency) {
    this.amountCurrency = amountCurrency;
  }


  public PlanOverridesObject description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The description on the plan.
   * @return description
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public PlanOverridesObject invoiceDisplayName(String invoiceDisplayName) {
    
    this.invoiceDisplayName = invoiceDisplayName;
    return this;
  }

   /**
   * Specifies the name that will be displayed on an invoice. If no value is set for this field, the name of the plan will be used as the default display name.
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


  public PlanOverridesObject name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the plan.
   * @return name
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public PlanOverridesObject taxCodes(List<String> taxCodes) {
    
    this.taxCodes = taxCodes;
    return this;
  }

  public PlanOverridesObject addTaxCodesItem(String taxCodesItem) {
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


  public PlanOverridesObject trialPeriod(BigDecimal trialPeriod) {
    
    this.trialPeriod = trialPeriod;
    return this;
  }

   /**
   * The duration in days during which the base cost of the plan is offered for free.
   * @return trialPeriod
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRIAL_PERIOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getTrialPeriod() {
    return trialPeriod;
  }


  @JsonProperty(JSON_PROPERTY_TRIAL_PERIOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTrialPeriod(BigDecimal trialPeriod) {
    this.trialPeriod = trialPeriod;
  }


  public PlanOverridesObject charges(List<PlanOverridesObjectChargesInner> charges) {
    
    this.charges = charges;
    return this;
  }

  public PlanOverridesObject addChargesItem(PlanOverridesObjectChargesInner chargesItem) {
    if (this.charges == null) {
      this.charges = new ArrayList<>();
    }
    this.charges.add(chargesItem);
    return this;
  }

   /**
   * Additional usage-based charges for this plan.
   * @return charges
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHARGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<PlanOverridesObjectChargesInner> getCharges() {
    return charges;
  }


  @JsonProperty(JSON_PROPERTY_CHARGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCharges(List<PlanOverridesObjectChargesInner> charges) {
    this.charges = charges;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlanOverridesObject planOverridesObject = (PlanOverridesObject) o;
    return Objects.equals(this.amountCents, planOverridesObject.amountCents) &&
        Objects.equals(this.amountCurrency, planOverridesObject.amountCurrency) &&
        Objects.equals(this.description, planOverridesObject.description) &&
        Objects.equals(this.invoiceDisplayName, planOverridesObject.invoiceDisplayName) &&
        Objects.equals(this.name, planOverridesObject.name) &&
        Objects.equals(this.taxCodes, planOverridesObject.taxCodes) &&
        Objects.equals(this.trialPeriod, planOverridesObject.trialPeriod) &&
        Objects.equals(this.charges, planOverridesObject.charges);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amountCents, amountCurrency, description, invoiceDisplayName, name, taxCodes, trialPeriod, charges);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlanOverridesObject {\n");
    sb.append("    amountCents: ").append(toIndentedString(amountCents)).append("\n");
    sb.append("    amountCurrency: ").append(toIndentedString(amountCurrency)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    invoiceDisplayName: ").append(toIndentedString(invoiceDisplayName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    taxCodes: ").append(toIndentedString(taxCodes)).append("\n");
    sb.append("    trialPeriod: ").append(toIndentedString(trialPeriod)).append("\n");
    sb.append("    charges: ").append(toIndentedString(charges)).append("\n");
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

