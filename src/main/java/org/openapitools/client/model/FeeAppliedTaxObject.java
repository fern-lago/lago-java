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
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;
import org.openapitools.client.model.Currency;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * FeeAppliedTaxObject
 */
@JsonPropertyOrder({
  FeeAppliedTaxObject.JSON_PROPERTY_LAGO_FEE_ID,
  FeeAppliedTaxObject.JSON_PROPERTY_LAGO_ID,
  FeeAppliedTaxObject.JSON_PROPERTY_LAGO_TAX_ID,
  FeeAppliedTaxObject.JSON_PROPERTY_TAX_NAME,
  FeeAppliedTaxObject.JSON_PROPERTY_TAX_CODE,
  FeeAppliedTaxObject.JSON_PROPERTY_TAX_RATE,
  FeeAppliedTaxObject.JSON_PROPERTY_TAX_DESCRIPTION,
  FeeAppliedTaxObject.JSON_PROPERTY_AMOUNT_CENTS,
  FeeAppliedTaxObject.JSON_PROPERTY_AMOUNT_CURRENCY,
  FeeAppliedTaxObject.JSON_PROPERTY_CREATED_AT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-27T14:12:55.372025191Z[Etc/UTC]")
public class FeeAppliedTaxObject {
  public static final String JSON_PROPERTY_LAGO_FEE_ID = "lago_fee_id";
  private UUID lagoFeeId;

  public static final String JSON_PROPERTY_LAGO_ID = "lago_id";
  private UUID lagoId;

  public static final String JSON_PROPERTY_LAGO_TAX_ID = "lago_tax_id";
  private UUID lagoTaxId;

  public static final String JSON_PROPERTY_TAX_NAME = "tax_name";
  private String taxName;

  public static final String JSON_PROPERTY_TAX_CODE = "tax_code";
  private String taxCode;

  public static final String JSON_PROPERTY_TAX_RATE = "tax_rate";
  private BigDecimal taxRate;

  public static final String JSON_PROPERTY_TAX_DESCRIPTION = "tax_description";
  private String taxDescription;

  public static final String JSON_PROPERTY_AMOUNT_CENTS = "amount_cents";
  private Integer amountCents;

  public static final String JSON_PROPERTY_AMOUNT_CURRENCY = "amount_currency";
  private Currency amountCurrency;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public FeeAppliedTaxObject() {
  }

  public FeeAppliedTaxObject lagoFeeId(UUID lagoFeeId) {
    
    this.lagoFeeId = lagoFeeId;
    return this;
  }

   /**
   * Unique identifier of the fee, created by Lago.
   * @return lagoFeeId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAGO_FEE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getLagoFeeId() {
    return lagoFeeId;
  }


  @JsonProperty(JSON_PROPERTY_LAGO_FEE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLagoFeeId(UUID lagoFeeId) {
    this.lagoFeeId = lagoFeeId;
  }


  public FeeAppliedTaxObject lagoId(UUID lagoId) {
    
    this.lagoId = lagoId;
    return this;
  }

   /**
   * Unique identifier of the applied tax, created by Lago.
   * @return lagoId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAGO_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getLagoId() {
    return lagoId;
  }


  @JsonProperty(JSON_PROPERTY_LAGO_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLagoId(UUID lagoId) {
    this.lagoId = lagoId;
  }


  public FeeAppliedTaxObject lagoTaxId(UUID lagoTaxId) {
    
    this.lagoTaxId = lagoTaxId;
    return this;
  }

   /**
   * Unique identifier of the tax, created by Lago.
   * @return lagoTaxId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAGO_TAX_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getLagoTaxId() {
    return lagoTaxId;
  }


  @JsonProperty(JSON_PROPERTY_LAGO_TAX_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLagoTaxId(UUID lagoTaxId) {
    this.lagoTaxId = lagoTaxId;
  }


  public FeeAppliedTaxObject taxName(String taxName) {
    
    this.taxName = taxName;
    return this;
  }

   /**
   * Name of the tax.
   * @return taxName
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAX_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTaxName() {
    return taxName;
  }


  @JsonProperty(JSON_PROPERTY_TAX_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTaxName(String taxName) {
    this.taxName = taxName;
  }


  public FeeAppliedTaxObject taxCode(String taxCode) {
    
    this.taxCode = taxCode;
    return this;
  }

   /**
   * Unique code used to identify the tax associated with the API request.
   * @return taxCode
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAX_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTaxCode() {
    return taxCode;
  }


  @JsonProperty(JSON_PROPERTY_TAX_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTaxCode(String taxCode) {
    this.taxCode = taxCode;
  }


  public FeeAppliedTaxObject taxRate(BigDecimal taxRate) {
    
    this.taxRate = taxRate;
    return this;
  }

   /**
   * The percentage rate of the tax
   * @return taxRate
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAX_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getTaxRate() {
    return taxRate;
  }


  @JsonProperty(JSON_PROPERTY_TAX_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTaxRate(BigDecimal taxRate) {
    this.taxRate = taxRate;
  }


  public FeeAppliedTaxObject taxDescription(String taxDescription) {
    
    this.taxDescription = taxDescription;
    return this;
  }

   /**
   * Internal description of the taxe
   * @return taxDescription
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAX_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTaxDescription() {
    return taxDescription;
  }


  @JsonProperty(JSON_PROPERTY_TAX_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTaxDescription(String taxDescription) {
    this.taxDescription = taxDescription;
  }


  public FeeAppliedTaxObject amountCents(Integer amountCents) {
    
    this.amountCents = amountCents;
    return this;
  }

   /**
   * Amount of the tax
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


  public FeeAppliedTaxObject amountCurrency(Currency amountCurrency) {
    
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


  public FeeAppliedTaxObject createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The date and time when the applied tax was created. It is expressed in UTC format according to the ISO 8601 datetime standard. This field provides the timestamp for the exact moment when the applied tax was initially created.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeeAppliedTaxObject feeAppliedTaxObject = (FeeAppliedTaxObject) o;
    return Objects.equals(this.lagoFeeId, feeAppliedTaxObject.lagoFeeId) &&
        Objects.equals(this.lagoId, feeAppliedTaxObject.lagoId) &&
        Objects.equals(this.lagoTaxId, feeAppliedTaxObject.lagoTaxId) &&
        Objects.equals(this.taxName, feeAppliedTaxObject.taxName) &&
        Objects.equals(this.taxCode, feeAppliedTaxObject.taxCode) &&
        Objects.equals(this.taxRate, feeAppliedTaxObject.taxRate) &&
        Objects.equals(this.taxDescription, feeAppliedTaxObject.taxDescription) &&
        Objects.equals(this.amountCents, feeAppliedTaxObject.amountCents) &&
        Objects.equals(this.amountCurrency, feeAppliedTaxObject.amountCurrency) &&
        Objects.equals(this.createdAt, feeAppliedTaxObject.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lagoFeeId, lagoId, lagoTaxId, taxName, taxCode, taxRate, taxDescription, amountCents, amountCurrency, createdAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeeAppliedTaxObject {\n");
    sb.append("    lagoFeeId: ").append(toIndentedString(lagoFeeId)).append("\n");
    sb.append("    lagoId: ").append(toIndentedString(lagoId)).append("\n");
    sb.append("    lagoTaxId: ").append(toIndentedString(lagoTaxId)).append("\n");
    sb.append("    taxName: ").append(toIndentedString(taxName)).append("\n");
    sb.append("    taxCode: ").append(toIndentedString(taxCode)).append("\n");
    sb.append("    taxRate: ").append(toIndentedString(taxRate)).append("\n");
    sb.append("    taxDescription: ").append(toIndentedString(taxDescription)).append("\n");
    sb.append("    amountCents: ").append(toIndentedString(amountCents)).append("\n");
    sb.append("    amountCurrency: ").append(toIndentedString(amountCurrency)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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

