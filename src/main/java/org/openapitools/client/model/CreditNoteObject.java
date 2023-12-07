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
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.openapitools.client.model.CreditNoteAppliedTaxObject;
import org.openapitools.client.model.CreditNoteItemObject;
import org.openapitools.client.model.Currency;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * CreditNoteObject
 */
@JsonPropertyOrder({
  CreditNoteObject.JSON_PROPERTY_LAGO_ID,
  CreditNoteObject.JSON_PROPERTY_SEQUENTIAL_ID,
  CreditNoteObject.JSON_PROPERTY_NUMBER,
  CreditNoteObject.JSON_PROPERTY_LAGO_INVOICE_ID,
  CreditNoteObject.JSON_PROPERTY_INVOICE_NUMBER,
  CreditNoteObject.JSON_PROPERTY_ISSUING_DATE,
  CreditNoteObject.JSON_PROPERTY_CREDIT_STATUS,
  CreditNoteObject.JSON_PROPERTY_REFUND_STATUS,
  CreditNoteObject.JSON_PROPERTY_REASON,
  CreditNoteObject.JSON_PROPERTY_DESCRIPTION,
  CreditNoteObject.JSON_PROPERTY_CURRENCY,
  CreditNoteObject.JSON_PROPERTY_TOTAL_AMOUNT_CENTS,
  CreditNoteObject.JSON_PROPERTY_TAXES_AMOUNT_CENTS,
  CreditNoteObject.JSON_PROPERTY_TAXES_RATE,
  CreditNoteObject.JSON_PROPERTY_SUB_TOTAL_EXCLUDING_TAXES_AMOUNT_CENTS,
  CreditNoteObject.JSON_PROPERTY_BALANCE_AMOUNT_CENTS,
  CreditNoteObject.JSON_PROPERTY_CREDIT_AMOUNT_CENTS,
  CreditNoteObject.JSON_PROPERTY_REFUND_AMOUNT_CENTS,
  CreditNoteObject.JSON_PROPERTY_COUPONS_ADJUSTMENT_AMOUNT_CENTS,
  CreditNoteObject.JSON_PROPERTY_CREATED_AT,
  CreditNoteObject.JSON_PROPERTY_UPDATED_AT,
  CreditNoteObject.JSON_PROPERTY_FILE_URL,
  CreditNoteObject.JSON_PROPERTY_ITEMS,
  CreditNoteObject.JSON_PROPERTY_APPLIED_TAXES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-07T16:08:18.203563Z[Etc/UTC]")
public class CreditNoteObject {
  public static final String JSON_PROPERTY_LAGO_ID = "lago_id";
  private UUID lagoId;

  public static final String JSON_PROPERTY_SEQUENTIAL_ID = "sequential_id";
  private Integer sequentialId;

  public static final String JSON_PROPERTY_NUMBER = "number";
  private String number;

  public static final String JSON_PROPERTY_LAGO_INVOICE_ID = "lago_invoice_id";
  private UUID lagoInvoiceId;

  public static final String JSON_PROPERTY_INVOICE_NUMBER = "invoice_number";
  private String invoiceNumber;

  public static final String JSON_PROPERTY_ISSUING_DATE = "issuing_date";
  private LocalDate issuingDate;

  /**
   * The status of the credit portion of the credit note. It indicates the current state or condition of the credit amount associated with the credit note. The possible values for this field are:  - &#x60;available&#x60;: this status indicates that an amount remains available for future usage. The credit can be applied towards future transactions or invoices. - &#x60;consumed&#x60;: this status indicates that the credit amount has been fully consumed. The remaining amount is 0, indicating that the credit has been utilized in its entirety. - &#x60;voided&#x60;: this status indicates that the remaining amount of the credit cannot be used any further. The credit has been voided and is no longer available for application or redemption.
   */
  public enum CreditStatusEnum {
    AVAILABLE("available"),
    
    CONSUMED("consumed"),
    
    VOIDED("voided");

    private String value;

    CreditStatusEnum(String value) {
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
    public static CreditStatusEnum fromValue(String value) {
      for (CreditStatusEnum b : CreditStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  public static final String JSON_PROPERTY_CREDIT_STATUS = "credit_status";
  private JsonNullable<CreditStatusEnum> creditStatus = JsonNullable.<CreditStatusEnum>undefined();

  /**
   * The status of the refund portion of the credit note. It indicates the current state or condition of the refund associated with the credit note. The possible values for this field are:  - &#x60;pending&#x60;: this status indicates that the refund is pending execution. The refund request has been initiated but has not been processed or completed yet. - &#x60;succeeded&#x60;: this status indicates that the refund has been successfully executed. The refund amount has been processed and returned to the customer or the designated recipient. - &#x60;failed&#x60;: this status indicates that the refund failed to execute. The refund request encountered an error or unsuccessful processing, and the refund amount could not be returned.
   */
  public enum RefundStatusEnum {
    PENDING("pending"),
    
    SUCCEEDED("succeeded"),
    
    FAILED("failed");

    private String value;

    RefundStatusEnum(String value) {
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
    public static RefundStatusEnum fromValue(String value) {
      for (RefundStatusEnum b : RefundStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  public static final String JSON_PROPERTY_REFUND_STATUS = "refund_status";
  private JsonNullable<RefundStatusEnum> refundStatus = JsonNullable.<RefundStatusEnum>undefined();

  /**
   * The reason of the credit note creation. Possible values are &#x60;duplicated_charge&#x60;, &#x60;product_unsatisfactory&#x60;, &#x60;order_change&#x60;, &#x60;order_cancellation&#x60;, &#x60;fraudulent_charge&#x60; or &#x60;other&#x60;.
   */
  public enum ReasonEnum {
    DUPLICATED_CHARGE("duplicated_charge"),
    
    PRODUCT_UNSATISFACTORY("product_unsatisfactory"),
    
    ORDER_CHANGE("order_change"),
    
    ORDER_CANCELLATION("order_cancellation"),
    
    FRAUDULENT_CHARGE("fraudulent_charge"),
    
    OTHER("other");

    private String value;

    ReasonEnum(String value) {
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
    public static ReasonEnum fromValue(String value) {
      for (ReasonEnum b : ReasonEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_REASON = "reason";
  private ReasonEnum reason;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private JsonNullable<String> description = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private Currency currency;

  public static final String JSON_PROPERTY_TOTAL_AMOUNT_CENTS = "total_amount_cents";
  private Integer totalAmountCents;

  public static final String JSON_PROPERTY_TAXES_AMOUNT_CENTS = "taxes_amount_cents";
  private Integer taxesAmountCents;

  public static final String JSON_PROPERTY_TAXES_RATE = "taxes_rate";
  private BigDecimal taxesRate;

  public static final String JSON_PROPERTY_SUB_TOTAL_EXCLUDING_TAXES_AMOUNT_CENTS = "sub_total_excluding_taxes_amount_cents";
  private Integer subTotalExcludingTaxesAmountCents;

  public static final String JSON_PROPERTY_BALANCE_AMOUNT_CENTS = "balance_amount_cents";
  private Integer balanceAmountCents;

  public static final String JSON_PROPERTY_CREDIT_AMOUNT_CENTS = "credit_amount_cents";
  private Integer creditAmountCents;

  public static final String JSON_PROPERTY_REFUND_AMOUNT_CENTS = "refund_amount_cents";
  private Integer refundAmountCents;

  public static final String JSON_PROPERTY_COUPONS_ADJUSTMENT_AMOUNT_CENTS = "coupons_adjustment_amount_cents";
  private Integer couponsAdjustmentAmountCents;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private OffsetDateTime updatedAt;

  public static final String JSON_PROPERTY_FILE_URL = "file_url";
  private JsonNullable<String> fileUrl = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ITEMS = "items";
  private List<CreditNoteItemObject> items;

  public static final String JSON_PROPERTY_APPLIED_TAXES = "applied_taxes";
  private List<CreditNoteAppliedTaxObject> appliedTaxes;

  public CreditNoteObject() {
  }

  public CreditNoteObject lagoId(UUID lagoId) {
    
    this.lagoId = lagoId;
    return this;
  }

   /**
   * The credit note unique identifier, created by Lago.
   * @return lagoId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LAGO_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UUID getLagoId() {
    return lagoId;
  }


  @JsonProperty(JSON_PROPERTY_LAGO_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLagoId(UUID lagoId) {
    this.lagoId = lagoId;
  }


  public CreditNoteObject sequentialId(Integer sequentialId) {
    
    this.sequentialId = sequentialId;
    return this;
  }

   /**
   * The sequential identifier of the credit note, specifically scoped on the associated invoice. It provides a unique numerical identifier for the credit note within the context of the invoice.
   * @return sequentialId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SEQUENTIAL_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getSequentialId() {
    return sequentialId;
  }


  @JsonProperty(JSON_PROPERTY_SEQUENTIAL_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSequentialId(Integer sequentialId) {
    this.sequentialId = sequentialId;
  }


  public CreditNoteObject number(String number) {
    
    this.number = number;
    return this;
  }

   /**
   * The credit note unique number.
   * @return number
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getNumber() {
    return number;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setNumber(String number) {
    this.number = number;
  }


  public CreditNoteObject lagoInvoiceId(UUID lagoInvoiceId) {
    
    this.lagoInvoiceId = lagoInvoiceId;
    return this;
  }

   /**
   * Unique identifier assigned to the invoice that the credit note belongs to
   * @return lagoInvoiceId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LAGO_INVOICE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UUID getLagoInvoiceId() {
    return lagoInvoiceId;
  }


  @JsonProperty(JSON_PROPERTY_LAGO_INVOICE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLagoInvoiceId(UUID lagoInvoiceId) {
    this.lagoInvoiceId = lagoInvoiceId;
  }


  public CreditNoteObject invoiceNumber(String invoiceNumber) {
    
    this.invoiceNumber = invoiceNumber;
    return this;
  }

   /**
   * The invoice unique number, related to the credit note.
   * @return invoiceNumber
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_INVOICE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getInvoiceNumber() {
    return invoiceNumber;
  }


  @JsonProperty(JSON_PROPERTY_INVOICE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setInvoiceNumber(String invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
  }


  public CreditNoteObject issuingDate(LocalDate issuingDate) {
    
    this.issuingDate = issuingDate;
    return this;
  }

   /**
   * The date of creation of the credit note. It follows the ISO 8601 date format and provides the specific date when the credit note was created.
   * @return issuingDate
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ISSUING_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public LocalDate getIssuingDate() {
    return issuingDate;
  }


  @JsonProperty(JSON_PROPERTY_ISSUING_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIssuingDate(LocalDate issuingDate) {
    this.issuingDate = issuingDate;
  }


  public CreditNoteObject creditStatus(CreditStatusEnum creditStatus) {
    this.creditStatus = JsonNullable.<CreditStatusEnum>of(creditStatus);
    
    return this;
  }

   /**
   * The status of the credit portion of the credit note. It indicates the current state or condition of the credit amount associated with the credit note. The possible values for this field are:  - &#x60;available&#x60;: this status indicates that an amount remains available for future usage. The credit can be applied towards future transactions or invoices. - &#x60;consumed&#x60;: this status indicates that the credit amount has been fully consumed. The remaining amount is 0, indicating that the credit has been utilized in its entirety. - &#x60;voided&#x60;: this status indicates that the remaining amount of the credit cannot be used any further. The credit has been voided and is no longer available for application or redemption.
   * @return creditStatus
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public CreditStatusEnum getCreditStatus() {
        return creditStatus.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CREDIT_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<CreditStatusEnum> getCreditStatus_JsonNullable() {
    return creditStatus;
  }
  
  @JsonProperty(JSON_PROPERTY_CREDIT_STATUS)
  public void setCreditStatus_JsonNullable(JsonNullable<CreditStatusEnum> creditStatus) {
    this.creditStatus = creditStatus;
  }

  public void setCreditStatus(CreditStatusEnum creditStatus) {
    this.creditStatus = JsonNullable.<CreditStatusEnum>of(creditStatus);
  }


  public CreditNoteObject refundStatus(RefundStatusEnum refundStatus) {
    this.refundStatus = JsonNullable.<RefundStatusEnum>of(refundStatus);
    
    return this;
  }

   /**
   * The status of the refund portion of the credit note. It indicates the current state or condition of the refund associated with the credit note. The possible values for this field are:  - &#x60;pending&#x60;: this status indicates that the refund is pending execution. The refund request has been initiated but has not been processed or completed yet. - &#x60;succeeded&#x60;: this status indicates that the refund has been successfully executed. The refund amount has been processed and returned to the customer or the designated recipient. - &#x60;failed&#x60;: this status indicates that the refund failed to execute. The refund request encountered an error or unsuccessful processing, and the refund amount could not be returned.
   * @return refundStatus
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public RefundStatusEnum getRefundStatus() {
        return refundStatus.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_REFUND_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<RefundStatusEnum> getRefundStatus_JsonNullable() {
    return refundStatus;
  }
  
  @JsonProperty(JSON_PROPERTY_REFUND_STATUS)
  public void setRefundStatus_JsonNullable(JsonNullable<RefundStatusEnum> refundStatus) {
    this.refundStatus = refundStatus;
  }

  public void setRefundStatus(RefundStatusEnum refundStatus) {
    this.refundStatus = JsonNullable.<RefundStatusEnum>of(refundStatus);
  }


  public CreditNoteObject reason(ReasonEnum reason) {
    
    this.reason = reason;
    return this;
  }

   /**
   * The reason of the credit note creation. Possible values are &#x60;duplicated_charge&#x60;, &#x60;product_unsatisfactory&#x60;, &#x60;order_change&#x60;, &#x60;order_cancellation&#x60;, &#x60;fraudulent_charge&#x60; or &#x60;other&#x60;.
   * @return reason
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_REASON)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ReasonEnum getReason() {
    return reason;
  }


  @JsonProperty(JSON_PROPERTY_REASON)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setReason(ReasonEnum reason) {
    this.reason = reason;
  }


  public CreditNoteObject description(String description) {
    this.description = JsonNullable.<String>of(description);
    
    return this;
  }

   /**
   * The description of the credit note.
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


  public CreditNoteObject currency(Currency currency) {
    
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


  public CreditNoteObject totalAmountCents(Integer totalAmountCents) {
    
    this.totalAmountCents = totalAmountCents;
    return this;
  }

   /**
   * The total amount of the credit note, expressed in cents.
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


  public CreditNoteObject taxesAmountCents(Integer taxesAmountCents) {
    
    this.taxesAmountCents = taxesAmountCents;
    return this;
  }

   /**
   * The tax amount of the credit note, expressed in cents.
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


  public CreditNoteObject taxesRate(BigDecimal taxesRate) {
    
    this.taxesRate = taxesRate;
    return this;
  }

   /**
   * The tax rate associated with this specific credit note.
   * @return taxesRate
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TAXES_RATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BigDecimal getTaxesRate() {
    return taxesRate;
  }


  @JsonProperty(JSON_PROPERTY_TAXES_RATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTaxesRate(BigDecimal taxesRate) {
    this.taxesRate = taxesRate;
  }


  public CreditNoteObject subTotalExcludingTaxesAmountCents(Integer subTotalExcludingTaxesAmountCents) {
    
    this.subTotalExcludingTaxesAmountCents = subTotalExcludingTaxesAmountCents;
    return this;
  }

   /**
   * The subtotal of the credit note excluding any applicable taxes, expressed in cents.
   * @return subTotalExcludingTaxesAmountCents
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SUB_TOTAL_EXCLUDING_TAXES_AMOUNT_CENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getSubTotalExcludingTaxesAmountCents() {
    return subTotalExcludingTaxesAmountCents;
  }


  @JsonProperty(JSON_PROPERTY_SUB_TOTAL_EXCLUDING_TAXES_AMOUNT_CENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSubTotalExcludingTaxesAmountCents(Integer subTotalExcludingTaxesAmountCents) {
    this.subTotalExcludingTaxesAmountCents = subTotalExcludingTaxesAmountCents;
  }


  public CreditNoteObject balanceAmountCents(Integer balanceAmountCents) {
    
    this.balanceAmountCents = balanceAmountCents;
    return this;
  }

   /**
   * The remaining credit note amount, expressed in cents.
   * @return balanceAmountCents
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_BALANCE_AMOUNT_CENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getBalanceAmountCents() {
    return balanceAmountCents;
  }


  @JsonProperty(JSON_PROPERTY_BALANCE_AMOUNT_CENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBalanceAmountCents(Integer balanceAmountCents) {
    this.balanceAmountCents = balanceAmountCents;
  }


  public CreditNoteObject creditAmountCents(Integer creditAmountCents) {
    
    this.creditAmountCents = creditAmountCents;
    return this;
  }

   /**
   * The credited amount of the credit note, expressed in cents.
   * @return creditAmountCents
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CREDIT_AMOUNT_CENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getCreditAmountCents() {
    return creditAmountCents;
  }


  @JsonProperty(JSON_PROPERTY_CREDIT_AMOUNT_CENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCreditAmountCents(Integer creditAmountCents) {
    this.creditAmountCents = creditAmountCents;
  }


  public CreditNoteObject refundAmountCents(Integer refundAmountCents) {
    
    this.refundAmountCents = refundAmountCents;
    return this;
  }

   /**
   * The refunded amount of the credit note, expressed in cents.
   * @return refundAmountCents
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_REFUND_AMOUNT_CENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getRefundAmountCents() {
    return refundAmountCents;
  }


  @JsonProperty(JSON_PROPERTY_REFUND_AMOUNT_CENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRefundAmountCents(Integer refundAmountCents) {
    this.refundAmountCents = refundAmountCents;
  }


  public CreditNoteObject couponsAdjustmentAmountCents(Integer couponsAdjustmentAmountCents) {
    
    this.couponsAdjustmentAmountCents = couponsAdjustmentAmountCents;
    return this;
  }

   /**
   * The pro-rated amount of the coupons applied to the source invoice.
   * @return couponsAdjustmentAmountCents
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_COUPONS_ADJUSTMENT_AMOUNT_CENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getCouponsAdjustmentAmountCents() {
    return couponsAdjustmentAmountCents;
  }


  @JsonProperty(JSON_PROPERTY_COUPONS_ADJUSTMENT_AMOUNT_CENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCouponsAdjustmentAmountCents(Integer couponsAdjustmentAmountCents) {
    this.couponsAdjustmentAmountCents = couponsAdjustmentAmountCents;
  }


  public CreditNoteObject createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The date when the credit note was created. It is expressed in Coordinated Universal Time (UTC).
   * @return createdAt
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public CreditNoteObject updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * The date when the credit note was last updated. It is expressed in Coordinated Universal Time (UTC).
   * @return updatedAt
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public CreditNoteObject fileUrl(String fileUrl) {
    this.fileUrl = JsonNullable.<String>of(fileUrl);
    
    return this;
  }

   /**
   * The PDF file of the credit note.
   * @return fileUrl
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getFileUrl() {
        return fileUrl.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FILE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getFileUrl_JsonNullable() {
    return fileUrl;
  }
  
  @JsonProperty(JSON_PROPERTY_FILE_URL)
  public void setFileUrl_JsonNullable(JsonNullable<String> fileUrl) {
    this.fileUrl = fileUrl;
  }

  public void setFileUrl(String fileUrl) {
    this.fileUrl = JsonNullable.<String>of(fileUrl);
  }


  public CreditNoteObject items(List<CreditNoteItemObject> items) {
    
    this.items = items;
    return this;
  }

  public CreditNoteObject addItemsItem(CreditNoteItemObject itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Array of credit note’s items.
   * @return items
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<CreditNoteItemObject> getItems() {
    return items;
  }


  @JsonProperty(JSON_PROPERTY_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setItems(List<CreditNoteItemObject> items) {
    this.items = items;
  }


  public CreditNoteObject appliedTaxes(List<CreditNoteAppliedTaxObject> appliedTaxes) {
    
    this.appliedTaxes = appliedTaxes;
    return this;
  }

  public CreditNoteObject addAppliedTaxesItem(CreditNoteAppliedTaxObject appliedTaxesItem) {
    if (this.appliedTaxes == null) {
      this.appliedTaxes = new ArrayList<>();
    }
    this.appliedTaxes.add(appliedTaxesItem);
    return this;
  }

   /**
   * Get appliedTaxes
   * @return appliedTaxes
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APPLIED_TAXES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<CreditNoteAppliedTaxObject> getAppliedTaxes() {
    return appliedTaxes;
  }


  @JsonProperty(JSON_PROPERTY_APPLIED_TAXES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAppliedTaxes(List<CreditNoteAppliedTaxObject> appliedTaxes) {
    this.appliedTaxes = appliedTaxes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditNoteObject creditNoteObject = (CreditNoteObject) o;
    return Objects.equals(this.lagoId, creditNoteObject.lagoId) &&
        Objects.equals(this.sequentialId, creditNoteObject.sequentialId) &&
        Objects.equals(this.number, creditNoteObject.number) &&
        Objects.equals(this.lagoInvoiceId, creditNoteObject.lagoInvoiceId) &&
        Objects.equals(this.invoiceNumber, creditNoteObject.invoiceNumber) &&
        Objects.equals(this.issuingDate, creditNoteObject.issuingDate) &&
        equalsNullable(this.creditStatus, creditNoteObject.creditStatus) &&
        equalsNullable(this.refundStatus, creditNoteObject.refundStatus) &&
        Objects.equals(this.reason, creditNoteObject.reason) &&
        equalsNullable(this.description, creditNoteObject.description) &&
        Objects.equals(this.currency, creditNoteObject.currency) &&
        Objects.equals(this.totalAmountCents, creditNoteObject.totalAmountCents) &&
        Objects.equals(this.taxesAmountCents, creditNoteObject.taxesAmountCents) &&
        Objects.equals(this.taxesRate, creditNoteObject.taxesRate) &&
        Objects.equals(this.subTotalExcludingTaxesAmountCents, creditNoteObject.subTotalExcludingTaxesAmountCents) &&
        Objects.equals(this.balanceAmountCents, creditNoteObject.balanceAmountCents) &&
        Objects.equals(this.creditAmountCents, creditNoteObject.creditAmountCents) &&
        Objects.equals(this.refundAmountCents, creditNoteObject.refundAmountCents) &&
        Objects.equals(this.couponsAdjustmentAmountCents, creditNoteObject.couponsAdjustmentAmountCents) &&
        Objects.equals(this.createdAt, creditNoteObject.createdAt) &&
        Objects.equals(this.updatedAt, creditNoteObject.updatedAt) &&
        equalsNullable(this.fileUrl, creditNoteObject.fileUrl) &&
        Objects.equals(this.items, creditNoteObject.items) &&
        Objects.equals(this.appliedTaxes, creditNoteObject.appliedTaxes);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(lagoId, sequentialId, number, lagoInvoiceId, invoiceNumber, issuingDate, hashCodeNullable(creditStatus), hashCodeNullable(refundStatus), reason, hashCodeNullable(description), currency, totalAmountCents, taxesAmountCents, taxesRate, subTotalExcludingTaxesAmountCents, balanceAmountCents, creditAmountCents, refundAmountCents, couponsAdjustmentAmountCents, createdAt, updatedAt, hashCodeNullable(fileUrl), items, appliedTaxes);
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
    sb.append("class CreditNoteObject {\n");
    sb.append("    lagoId: ").append(toIndentedString(lagoId)).append("\n");
    sb.append("    sequentialId: ").append(toIndentedString(sequentialId)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    lagoInvoiceId: ").append(toIndentedString(lagoInvoiceId)).append("\n");
    sb.append("    invoiceNumber: ").append(toIndentedString(invoiceNumber)).append("\n");
    sb.append("    issuingDate: ").append(toIndentedString(issuingDate)).append("\n");
    sb.append("    creditStatus: ").append(toIndentedString(creditStatus)).append("\n");
    sb.append("    refundStatus: ").append(toIndentedString(refundStatus)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    totalAmountCents: ").append(toIndentedString(totalAmountCents)).append("\n");
    sb.append("    taxesAmountCents: ").append(toIndentedString(taxesAmountCents)).append("\n");
    sb.append("    taxesRate: ").append(toIndentedString(taxesRate)).append("\n");
    sb.append("    subTotalExcludingTaxesAmountCents: ").append(toIndentedString(subTotalExcludingTaxesAmountCents)).append("\n");
    sb.append("    balanceAmountCents: ").append(toIndentedString(balanceAmountCents)).append("\n");
    sb.append("    creditAmountCents: ").append(toIndentedString(creditAmountCents)).append("\n");
    sb.append("    refundAmountCents: ").append(toIndentedString(refundAmountCents)).append("\n");
    sb.append("    couponsAdjustmentAmountCents: ").append(toIndentedString(couponsAdjustmentAmountCents)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    fileUrl: ").append(toIndentedString(fileUrl)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    appliedTaxes: ").append(toIndentedString(appliedTaxes)).append("\n");
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

