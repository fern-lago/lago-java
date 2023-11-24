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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.Currency;
import org.openapitools.client.model.PlanCreateInputPlanChargesInner;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * PlanCreateInputPlan
 */
@JsonPropertyOrder({
  PlanCreateInputPlan.JSON_PROPERTY_NAME,
  PlanCreateInputPlan.JSON_PROPERTY_INVOICE_DISPLAY_NAME,
  PlanCreateInputPlan.JSON_PROPERTY_CODE,
  PlanCreateInputPlan.JSON_PROPERTY_INTERVAL,
  PlanCreateInputPlan.JSON_PROPERTY_DESCRIPTION,
  PlanCreateInputPlan.JSON_PROPERTY_AMOUNT_CENTS,
  PlanCreateInputPlan.JSON_PROPERTY_AMOUNT_CURRENCY,
  PlanCreateInputPlan.JSON_PROPERTY_TRIAL_PERIOD,
  PlanCreateInputPlan.JSON_PROPERTY_PAY_IN_ADVANCE,
  PlanCreateInputPlan.JSON_PROPERTY_BILL_CHARGES_MONTHLY,
  PlanCreateInputPlan.JSON_PROPERTY_TAX_CODES,
  PlanCreateInputPlan.JSON_PROPERTY_CHARGES
})
@JsonTypeName("PlanCreateInput_plan")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-24T14:41:05.749099654Z[Etc/UTC]")
public class PlanCreateInputPlan {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_INVOICE_DISPLAY_NAME = "invoice_display_name";
  private String invoiceDisplayName;

  public static final String JSON_PROPERTY_CODE = "code";
  private String code;

  /**
   * The interval used for recurring billing. It represents the frequency at which subscription billing occurs. The interval can be one of the following values: &#x60;yearly&#x60;, &#x60;quarterly&#x60;, &#x60;monthly&#x60;, or &#x60;weekly&#x60;.
   */
  public enum IntervalEnum {
    WEEKLY("weekly"),
    
    MONTHLY("monthly"),
    
    QUARTERLY("quarterly"),
    
    YEARLY("yearly");

    private String value;

    IntervalEnum(String value) {
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
    public static IntervalEnum fromValue(String value) {
      for (IntervalEnum b : IntervalEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_INTERVAL = "interval";
  private IntervalEnum interval;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_AMOUNT_CENTS = "amount_cents";
  private Integer amountCents;

  public static final String JSON_PROPERTY_AMOUNT_CURRENCY = "amount_currency";
  private Currency amountCurrency;

  public static final String JSON_PROPERTY_TRIAL_PERIOD = "trial_period";
  private BigDecimal trialPeriod;

  public static final String JSON_PROPERTY_PAY_IN_ADVANCE = "pay_in_advance";
  private Boolean payInAdvance;

  public static final String JSON_PROPERTY_BILL_CHARGES_MONTHLY = "bill_charges_monthly";
  private JsonNullable<Boolean> billChargesMonthly = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_TAX_CODES = "tax_codes";
  private List<String> taxCodes;

  public static final String JSON_PROPERTY_CHARGES = "charges";
  private List<PlanCreateInputPlanChargesInner> charges;

  public PlanCreateInputPlan() {
  }

  public PlanCreateInputPlan name(String name) {
    
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


  public PlanCreateInputPlan invoiceDisplayName(String invoiceDisplayName) {
    
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


  public PlanCreateInputPlan code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * The code of the plan. It serves as a unique identifier associated with a particular plan. The code is typically used for internal or system-level identification purposes, like assigning a subscription, for instance.
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


  public PlanCreateInputPlan interval(IntervalEnum interval) {
    
    this.interval = interval;
    return this;
  }

   /**
   * The interval used for recurring billing. It represents the frequency at which subscription billing occurs. The interval can be one of the following values: &#x60;yearly&#x60;, &#x60;quarterly&#x60;, &#x60;monthly&#x60;, or &#x60;weekly&#x60;.
   * @return interval
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INTERVAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public IntervalEnum getInterval() {
    return interval;
  }


  @JsonProperty(JSON_PROPERTY_INTERVAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInterval(IntervalEnum interval) {
    this.interval = interval;
  }


  public PlanCreateInputPlan description(String description) {
    
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


  public PlanCreateInputPlan amountCents(Integer amountCents) {
    
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


  public PlanCreateInputPlan amountCurrency(Currency amountCurrency) {
    
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


  public PlanCreateInputPlan trialPeriod(BigDecimal trialPeriod) {
    
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


  public PlanCreateInputPlan payInAdvance(Boolean payInAdvance) {
    
    this.payInAdvance = payInAdvance;
    return this;
  }

   /**
   * This field determines the billing timing for the plan. When set to &#x60;true&#x60;, the base cost of the plan is due at the beginning of each billing period. Conversely, when set to &#x60;false&#x60;, the base cost of the plan is due at the end of each billing period.
   * @return payInAdvance
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAY_IN_ADVANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getPayInAdvance() {
    return payInAdvance;
  }


  @JsonProperty(JSON_PROPERTY_PAY_IN_ADVANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPayInAdvance(Boolean payInAdvance) {
    this.payInAdvance = payInAdvance;
  }


  public PlanCreateInputPlan billChargesMonthly(Boolean billChargesMonthly) {
    this.billChargesMonthly = JsonNullable.<Boolean>of(billChargesMonthly);
    
    return this;
  }

   /**
   * This field, when set to &#x60;true&#x60;, enables to invoice usage-based charges on monthly basis, even if the cadence of the plan is yearly. This allows customers to pay charges overage on a monthly basis. This can be set to true only if the plan’s interval is &#x60;yearly&#x60;.
   * @return billChargesMonthly
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Boolean getBillChargesMonthly() {
        return billChargesMonthly.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_BILL_CHARGES_MONTHLY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Boolean> getBillChargesMonthly_JsonNullable() {
    return billChargesMonthly;
  }
  
  @JsonProperty(JSON_PROPERTY_BILL_CHARGES_MONTHLY)
  public void setBillChargesMonthly_JsonNullable(JsonNullable<Boolean> billChargesMonthly) {
    this.billChargesMonthly = billChargesMonthly;
  }

  public void setBillChargesMonthly(Boolean billChargesMonthly) {
    this.billChargesMonthly = JsonNullable.<Boolean>of(billChargesMonthly);
  }


  public PlanCreateInputPlan taxCodes(List<String> taxCodes) {
    
    this.taxCodes = taxCodes;
    return this;
  }

  public PlanCreateInputPlan addTaxCodesItem(String taxCodesItem) {
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


  public PlanCreateInputPlan charges(List<PlanCreateInputPlanChargesInner> charges) {
    
    this.charges = charges;
    return this;
  }

  public PlanCreateInputPlan addChargesItem(PlanCreateInputPlanChargesInner chargesItem) {
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

  public List<PlanCreateInputPlanChargesInner> getCharges() {
    return charges;
  }


  @JsonProperty(JSON_PROPERTY_CHARGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCharges(List<PlanCreateInputPlanChargesInner> charges) {
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
    PlanCreateInputPlan planCreateInputPlan = (PlanCreateInputPlan) o;
    return Objects.equals(this.name, planCreateInputPlan.name) &&
        Objects.equals(this.invoiceDisplayName, planCreateInputPlan.invoiceDisplayName) &&
        Objects.equals(this.code, planCreateInputPlan.code) &&
        Objects.equals(this.interval, planCreateInputPlan.interval) &&
        Objects.equals(this.description, planCreateInputPlan.description) &&
        Objects.equals(this.amountCents, planCreateInputPlan.amountCents) &&
        Objects.equals(this.amountCurrency, planCreateInputPlan.amountCurrency) &&
        Objects.equals(this.trialPeriod, planCreateInputPlan.trialPeriod) &&
        Objects.equals(this.payInAdvance, planCreateInputPlan.payInAdvance) &&
        equalsNullable(this.billChargesMonthly, planCreateInputPlan.billChargesMonthly) &&
        Objects.equals(this.taxCodes, planCreateInputPlan.taxCodes) &&
        Objects.equals(this.charges, planCreateInputPlan.charges);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, invoiceDisplayName, code, interval, description, amountCents, amountCurrency, trialPeriod, payInAdvance, hashCodeNullable(billChargesMonthly), taxCodes, charges);
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
    sb.append("class PlanCreateInputPlan {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    invoiceDisplayName: ").append(toIndentedString(invoiceDisplayName)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    amountCents: ").append(toIndentedString(amountCents)).append("\n");
    sb.append("    amountCurrency: ").append(toIndentedString(amountCurrency)).append("\n");
    sb.append("    trialPeriod: ").append(toIndentedString(trialPeriod)).append("\n");
    sb.append("    payInAdvance: ").append(toIndentedString(payInAdvance)).append("\n");
    sb.append("    billChargesMonthly: ").append(toIndentedString(billChargesMonthly)).append("\n");
    sb.append("    taxCodes: ").append(toIndentedString(taxCodes)).append("\n");
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

