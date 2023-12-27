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
import java.util.UUID;
import org.openapitools.client.model.ChargeObjectProperties;
import org.openapitools.client.model.PlanCreateInputPlanChargesInnerGroupPropertiesInner;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * PlanOverridesObjectChargesInner
 */
@JsonPropertyOrder({
  PlanOverridesObjectChargesInner.JSON_PROPERTY_ID,
  PlanOverridesObjectChargesInner.JSON_PROPERTY_BILLABLE_METRIC_ID,
  PlanOverridesObjectChargesInner.JSON_PROPERTY_INVOICE_DISPLAY_NAME,
  PlanOverridesObjectChargesInner.JSON_PROPERTY_MIN_AMOUNT_CENTS,
  PlanOverridesObjectChargesInner.JSON_PROPERTY_PROPERTIES,
  PlanOverridesObjectChargesInner.JSON_PROPERTY_GROUP_PROPERTIES,
  PlanOverridesObjectChargesInner.JSON_PROPERTY_TAX_CODES
})
@JsonTypeName("PlanOverridesObject_charges_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-27T14:12:55.372025191Z[Etc/UTC]")
public class PlanOverridesObjectChargesInner {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_BILLABLE_METRIC_ID = "billable_metric_id";
  private UUID billableMetricId;

  public static final String JSON_PROPERTY_INVOICE_DISPLAY_NAME = "invoice_display_name";
  private String invoiceDisplayName;

  public static final String JSON_PROPERTY_MIN_AMOUNT_CENTS = "min_amount_cents";
  private Integer minAmountCents;

  public static final String JSON_PROPERTY_PROPERTIES = "properties";
  private ChargeObjectProperties properties;

  public static final String JSON_PROPERTY_GROUP_PROPERTIES = "group_properties";
  private List<PlanCreateInputPlanChargesInnerGroupPropertiesInner> groupProperties;

  public static final String JSON_PROPERTY_TAX_CODES = "tax_codes";
  private List<String> taxCodes;

  public PlanOverridesObjectChargesInner() {
  }

  public PlanOverridesObjectChargesInner id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * Unique identifier of the charge created by Lago.
   * @return id
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(UUID id) {
    this.id = id;
  }


  public PlanOverridesObjectChargesInner billableMetricId(UUID billableMetricId) {
    
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


  public PlanOverridesObjectChargesInner invoiceDisplayName(String invoiceDisplayName) {
    
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


  public PlanOverridesObjectChargesInner minAmountCents(Integer minAmountCents) {
    
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


  public PlanOverridesObjectChargesInner properties(ChargeObjectProperties properties) {
    
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


  public PlanOverridesObjectChargesInner groupProperties(List<PlanCreateInputPlanChargesInnerGroupPropertiesInner> groupProperties) {
    
    this.groupProperties = groupProperties;
    return this;
  }

  public PlanOverridesObjectChargesInner addGroupPropertiesItem(PlanCreateInputPlanChargesInnerGroupPropertiesInner groupPropertiesItem) {
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


  public PlanOverridesObjectChargesInner taxCodes(List<String> taxCodes) {
    
    this.taxCodes = taxCodes;
    return this;
  }

  public PlanOverridesObjectChargesInner addTaxCodesItem(String taxCodesItem) {
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
    PlanOverridesObjectChargesInner planOverridesObjectChargesInner = (PlanOverridesObjectChargesInner) o;
    return Objects.equals(this.id, planOverridesObjectChargesInner.id) &&
        Objects.equals(this.billableMetricId, planOverridesObjectChargesInner.billableMetricId) &&
        Objects.equals(this.invoiceDisplayName, planOverridesObjectChargesInner.invoiceDisplayName) &&
        Objects.equals(this.minAmountCents, planOverridesObjectChargesInner.minAmountCents) &&
        Objects.equals(this.properties, planOverridesObjectChargesInner.properties) &&
        Objects.equals(this.groupProperties, planOverridesObjectChargesInner.groupProperties) &&
        Objects.equals(this.taxCodes, planOverridesObjectChargesInner.taxCodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, billableMetricId, invoiceDisplayName, minAmountCents, properties, groupProperties, taxCodes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlanOverridesObjectChargesInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    billableMetricId: ").append(toIndentedString(billableMetricId)).append("\n");
    sb.append("    invoiceDisplayName: ").append(toIndentedString(invoiceDisplayName)).append("\n");
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

