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
import java.util.UUID;
import org.openapitools.client.model.ChargeObjectProperties;
import org.openapitools.client.model.PlanCreateInputPlanChargesInnerGroupPropertiesInner;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * PlanCreateInputPlanChargesInner
 */
@JsonPropertyOrder({
  PlanCreateInputPlanChargesInner.JSON_PROPERTY_BILLABLE_METRIC_ID,
  PlanCreateInputPlanChargesInner.JSON_PROPERTY_CHARGE_MODEL,
  PlanCreateInputPlanChargesInner.JSON_PROPERTY_PAY_IN_ADVANCE,
  PlanCreateInputPlanChargesInner.JSON_PROPERTY_INVOICEABLE,
  PlanCreateInputPlanChargesInner.JSON_PROPERTY_INVOICE_DISPLAY_NAME,
  PlanCreateInputPlanChargesInner.JSON_PROPERTY_PRORATED,
  PlanCreateInputPlanChargesInner.JSON_PROPERTY_MIN_AMOUNT_CENTS,
  PlanCreateInputPlanChargesInner.JSON_PROPERTY_PROPERTIES,
  PlanCreateInputPlanChargesInner.JSON_PROPERTY_GROUP_PROPERTIES,
  PlanCreateInputPlanChargesInner.JSON_PROPERTY_TAX_CODES
})
@JsonTypeName("PlanCreateInput_plan_charges_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-24T14:41:05.749099654Z[Etc/UTC]")
public class PlanCreateInputPlanChargesInner {
  public static final String JSON_PROPERTY_BILLABLE_METRIC_ID = "billable_metric_id";
  private UUID billableMetricId;

  /**
   * Specifies the pricing model used for the calculation of the final fee. It can be &#x60;standard&#x60;, &#x60;graduated&#x60;, &#x60;graduated_percentage&#x60; &#x60;package&#x60;, &#x60;percentage&#x60; or &#x60;volume&#x60;.
   */
  public enum ChargeModelEnum {
    STANDARD("standard"),
    
    GRADUATED("graduated"),
    
    GRADUATED_PERCENTAGE("graduated_percentage"),
    
    PACKAGE("package"),
    
    PERCENTAGE("percentage"),
    
    VOLUME("volume");

    private String value;

    ChargeModelEnum(String value) {
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
    public static ChargeModelEnum fromValue(String value) {
      for (ChargeModelEnum b : ChargeModelEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_CHARGE_MODEL = "charge_model";
  private ChargeModelEnum chargeModel;

  public static final String JSON_PROPERTY_PAY_IN_ADVANCE = "pay_in_advance";
  private Boolean payInAdvance;

  public static final String JSON_PROPERTY_INVOICEABLE = "invoiceable";
  private Boolean invoiceable;

  public static final String JSON_PROPERTY_INVOICE_DISPLAY_NAME = "invoice_display_name";
  private String invoiceDisplayName;

  public static final String JSON_PROPERTY_PRORATED = "prorated";
  private Boolean prorated;

  public static final String JSON_PROPERTY_MIN_AMOUNT_CENTS = "min_amount_cents";
  private Integer minAmountCents;

  public static final String JSON_PROPERTY_PROPERTIES = "properties";
  private ChargeObjectProperties properties;

  public static final String JSON_PROPERTY_GROUP_PROPERTIES = "group_properties";
  private List<PlanCreateInputPlanChargesInnerGroupPropertiesInner> groupProperties;

  public static final String JSON_PROPERTY_TAX_CODES = "tax_codes";
  private List<String> taxCodes;

  public PlanCreateInputPlanChargesInner() {
  }

  public PlanCreateInputPlanChargesInner billableMetricId(UUID billableMetricId) {
    
    this.billableMetricId = billableMetricId;
    return this;
  }

   /**
   * Unique identifier of the billable metric created by Lago.
   * @return billableMetricId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BILLABLE_METRIC_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getBillableMetricId() {
    return billableMetricId;
  }


  @JsonProperty(JSON_PROPERTY_BILLABLE_METRIC_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBillableMetricId(UUID billableMetricId) {
    this.billableMetricId = billableMetricId;
  }


  public PlanCreateInputPlanChargesInner chargeModel(ChargeModelEnum chargeModel) {
    
    this.chargeModel = chargeModel;
    return this;
  }

   /**
   * Specifies the pricing model used for the calculation of the final fee. It can be &#x60;standard&#x60;, &#x60;graduated&#x60;, &#x60;graduated_percentage&#x60; &#x60;package&#x60;, &#x60;percentage&#x60; or &#x60;volume&#x60;.
   * @return chargeModel
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHARGE_MODEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ChargeModelEnum getChargeModel() {
    return chargeModel;
  }


  @JsonProperty(JSON_PROPERTY_CHARGE_MODEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChargeModel(ChargeModelEnum chargeModel) {
    this.chargeModel = chargeModel;
  }


  public PlanCreateInputPlanChargesInner payInAdvance(Boolean payInAdvance) {
    
    this.payInAdvance = payInAdvance;
    return this;
  }

   /**
   * This field determines the billing timing for this specific usage-based charge. When set to &#x60;true&#x60;, the charge is due and invoiced immediately. Conversely, when set to false, the charge is due and invoiced at the end of each billing period.
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


  public PlanCreateInputPlanChargesInner invoiceable(Boolean invoiceable) {
    
    this.invoiceable = invoiceable;
    return this;
  }

   /**
   * This field specifies whether the charge should be included in a proper invoice. If set to false, no invoice will be issued for this charge. You can only set it to &#x60;false&#x60; when &#x60;pay_in_advance&#x60; is &#x60;true&#x60;.
   * @return invoiceable
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INVOICEABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getInvoiceable() {
    return invoiceable;
  }


  @JsonProperty(JSON_PROPERTY_INVOICEABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInvoiceable(Boolean invoiceable) {
    this.invoiceable = invoiceable;
  }


  public PlanCreateInputPlanChargesInner invoiceDisplayName(String invoiceDisplayName) {
    
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


  public PlanCreateInputPlanChargesInner prorated(Boolean prorated) {
    
    this.prorated = prorated;
    return this;
  }

   /**
   * Specifies whether a charge is prorated based on the remaining number of days in the billing period or billed fully.  - If set to &#x60;true&#x60;, the charge is prorated based on the remaining days in the current billing period. - If set to &#x60;false&#x60;, the charge is billed in full. - If not defined in the request, default value is &#x60;false&#x60;.
   * @return prorated
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRORATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getProrated() {
    return prorated;
  }


  @JsonProperty(JSON_PROPERTY_PRORATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProrated(Boolean prorated) {
    this.prorated = prorated;
  }


  public PlanCreateInputPlanChargesInner minAmountCents(Integer minAmountCents) {
    
    this.minAmountCents = minAmountCents;
    return this;
  }

   /**
   * The minimum spending amount required for the charge, measured in cents and excluding any applicable taxes. It indicates the minimum amount that needs to be charged for each billing period.
   * @return minAmountCents
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MIN_AMOUNT_CENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMinAmountCents() {
    return minAmountCents;
  }


  @JsonProperty(JSON_PROPERTY_MIN_AMOUNT_CENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMinAmountCents(Integer minAmountCents) {
    this.minAmountCents = minAmountCents;
  }


  public PlanCreateInputPlanChargesInner properties(ChargeObjectProperties properties) {
    
    this.properties = properties;
    return this;
  }

   /**
   * Get properties
   * @return properties
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROPERTIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ChargeObjectProperties getProperties() {
    return properties;
  }


  @JsonProperty(JSON_PROPERTY_PROPERTIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProperties(ChargeObjectProperties properties) {
    this.properties = properties;
  }


  public PlanCreateInputPlanChargesInner groupProperties(List<PlanCreateInputPlanChargesInnerGroupPropertiesInner> groupProperties) {
    
    this.groupProperties = groupProperties;
    return this;
  }

  public PlanCreateInputPlanChargesInner addGroupPropertiesItem(PlanCreateInputPlanChargesInnerGroupPropertiesInner groupPropertiesItem) {
    if (this.groupProperties == null) {
      this.groupProperties = new ArrayList<>();
    }
    this.groupProperties.add(groupPropertiesItem);
    return this;
  }

   /**
   * All charge information, sorted by groups.
   * @return groupProperties
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GROUP_PROPERTIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<PlanCreateInputPlanChargesInnerGroupPropertiesInner> getGroupProperties() {
    return groupProperties;
  }


  @JsonProperty(JSON_PROPERTY_GROUP_PROPERTIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGroupProperties(List<PlanCreateInputPlanChargesInnerGroupPropertiesInner> groupProperties) {
    this.groupProperties = groupProperties;
  }


  public PlanCreateInputPlanChargesInner taxCodes(List<String> taxCodes) {
    
    this.taxCodes = taxCodes;
    return this;
  }

  public PlanCreateInputPlanChargesInner addTaxCodesItem(String taxCodesItem) {
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
    PlanCreateInputPlanChargesInner planCreateInputPlanChargesInner = (PlanCreateInputPlanChargesInner) o;
    return Objects.equals(this.billableMetricId, planCreateInputPlanChargesInner.billableMetricId) &&
        Objects.equals(this.chargeModel, planCreateInputPlanChargesInner.chargeModel) &&
        Objects.equals(this.payInAdvance, planCreateInputPlanChargesInner.payInAdvance) &&
        Objects.equals(this.invoiceable, planCreateInputPlanChargesInner.invoiceable) &&
        Objects.equals(this.invoiceDisplayName, planCreateInputPlanChargesInner.invoiceDisplayName) &&
        Objects.equals(this.prorated, planCreateInputPlanChargesInner.prorated) &&
        Objects.equals(this.minAmountCents, planCreateInputPlanChargesInner.minAmountCents) &&
        Objects.equals(this.properties, planCreateInputPlanChargesInner.properties) &&
        Objects.equals(this.groupProperties, planCreateInputPlanChargesInner.groupProperties) &&
        Objects.equals(this.taxCodes, planCreateInputPlanChargesInner.taxCodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billableMetricId, chargeModel, payInAdvance, invoiceable, invoiceDisplayName, prorated, minAmountCents, properties, groupProperties, taxCodes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlanCreateInputPlanChargesInner {\n");
    sb.append("    billableMetricId: ").append(toIndentedString(billableMetricId)).append("\n");
    sb.append("    chargeModel: ").append(toIndentedString(chargeModel)).append("\n");
    sb.append("    payInAdvance: ").append(toIndentedString(payInAdvance)).append("\n");
    sb.append("    invoiceable: ").append(toIndentedString(invoiceable)).append("\n");
    sb.append("    invoiceDisplayName: ").append(toIndentedString(invoiceDisplayName)).append("\n");
    sb.append("    prorated: ").append(toIndentedString(prorated)).append("\n");
    sb.append("    minAmountCents: ").append(toIndentedString(minAmountCents)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    groupProperties: ").append(toIndentedString(groupProperties)).append("\n");
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

