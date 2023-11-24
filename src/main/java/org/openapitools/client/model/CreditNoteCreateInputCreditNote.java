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
import org.openapitools.client.model.CreditNoteEstimateInputCreditNoteItemsInner;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * CreditNoteCreateInputCreditNote
 */
@JsonPropertyOrder({
  CreditNoteCreateInputCreditNote.JSON_PROPERTY_INVOICE_ID,
  CreditNoteCreateInputCreditNote.JSON_PROPERTY_REASON,
  CreditNoteCreateInputCreditNote.JSON_PROPERTY_DESCRIPTION,
  CreditNoteCreateInputCreditNote.JSON_PROPERTY_CREDIT_AMOUNT_CENTS,
  CreditNoteCreateInputCreditNote.JSON_PROPERTY_REFUND_AMOUNT_CENTS,
  CreditNoteCreateInputCreditNote.JSON_PROPERTY_ITEMS
})
@JsonTypeName("CreditNoteCreateInput_credit_note")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-24T14:41:05.749099654Z[Etc/UTC]")
public class CreditNoteCreateInputCreditNote {
  public static final String JSON_PROPERTY_INVOICE_ID = "invoice_id";
  private UUID invoiceId;

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
      return null;
    }
  }

  public static final String JSON_PROPERTY_REASON = "reason";
  private JsonNullable<ReasonEnum> reason = JsonNullable.<ReasonEnum>undefined();

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_CREDIT_AMOUNT_CENTS = "credit_amount_cents";
  private JsonNullable<Integer> creditAmountCents = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_REFUND_AMOUNT_CENTS = "refund_amount_cents";
  private JsonNullable<Integer> refundAmountCents = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_ITEMS = "items";
  private List<CreditNoteEstimateInputCreditNoteItemsInner> items = new ArrayList<>();

  public CreditNoteCreateInputCreditNote() {
  }

  public CreditNoteCreateInputCreditNote invoiceId(UUID invoiceId) {
    
    this.invoiceId = invoiceId;
    return this;
  }

   /**
   * The invoice unique identifier, created by Lago.
   * @return invoiceId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_INVOICE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UUID getInvoiceId() {
    return invoiceId;
  }


  @JsonProperty(JSON_PROPERTY_INVOICE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setInvoiceId(UUID invoiceId) {
    this.invoiceId = invoiceId;
  }


  public CreditNoteCreateInputCreditNote reason(ReasonEnum reason) {
    this.reason = JsonNullable.<ReasonEnum>of(reason);
    
    return this;
  }

   /**
   * The reason of the credit note creation. Possible values are &#x60;duplicated_charge&#x60;, &#x60;product_unsatisfactory&#x60;, &#x60;order_change&#x60;, &#x60;order_cancellation&#x60;, &#x60;fraudulent_charge&#x60; or &#x60;other&#x60;.
   * @return reason
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public ReasonEnum getReason() {
        return reason.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<ReasonEnum> getReason_JsonNullable() {
    return reason;
  }
  
  @JsonProperty(JSON_PROPERTY_REASON)
  public void setReason_JsonNullable(JsonNullable<ReasonEnum> reason) {
    this.reason = reason;
  }

  public void setReason(ReasonEnum reason) {
    this.reason = JsonNullable.<ReasonEnum>of(reason);
  }


  public CreditNoteCreateInputCreditNote description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The description of the credit note.
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


  public CreditNoteCreateInputCreditNote creditAmountCents(Integer creditAmountCents) {
    this.creditAmountCents = JsonNullable.<Integer>of(creditAmountCents);
    
    return this;
  }

   /**
   * The total amount to be credited on the customer balance.
   * @return creditAmountCents
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Integer getCreditAmountCents() {
        return creditAmountCents.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CREDIT_AMOUNT_CENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getCreditAmountCents_JsonNullable() {
    return creditAmountCents;
  }
  
  @JsonProperty(JSON_PROPERTY_CREDIT_AMOUNT_CENTS)
  public void setCreditAmountCents_JsonNullable(JsonNullable<Integer> creditAmountCents) {
    this.creditAmountCents = creditAmountCents;
  }

  public void setCreditAmountCents(Integer creditAmountCents) {
    this.creditAmountCents = JsonNullable.<Integer>of(creditAmountCents);
  }


  public CreditNoteCreateInputCreditNote refundAmountCents(Integer refundAmountCents) {
    this.refundAmountCents = JsonNullable.<Integer>of(refundAmountCents);
    
    return this;
  }

   /**
   * The total amount to be refunded to the customer.
   * @return refundAmountCents
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Integer getRefundAmountCents() {
        return refundAmountCents.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_REFUND_AMOUNT_CENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getRefundAmountCents_JsonNullable() {
    return refundAmountCents;
  }
  
  @JsonProperty(JSON_PROPERTY_REFUND_AMOUNT_CENTS)
  public void setRefundAmountCents_JsonNullable(JsonNullable<Integer> refundAmountCents) {
    this.refundAmountCents = refundAmountCents;
  }

  public void setRefundAmountCents(Integer refundAmountCents) {
    this.refundAmountCents = JsonNullable.<Integer>of(refundAmountCents);
  }


  public CreditNoteCreateInputCreditNote items(List<CreditNoteEstimateInputCreditNoteItemsInner> items) {
    
    this.items = items;
    return this;
  }

  public CreditNoteCreateInputCreditNote addItemsItem(CreditNoteEstimateInputCreditNoteItemsInner itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * The list of credit note’s items.
   * @return items
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ITEMS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<CreditNoteEstimateInputCreditNoteItemsInner> getItems() {
    return items;
  }


  @JsonProperty(JSON_PROPERTY_ITEMS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setItems(List<CreditNoteEstimateInputCreditNoteItemsInner> items) {
    this.items = items;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditNoteCreateInputCreditNote creditNoteCreateInputCreditNote = (CreditNoteCreateInputCreditNote) o;
    return Objects.equals(this.invoiceId, creditNoteCreateInputCreditNote.invoiceId) &&
        equalsNullable(this.reason, creditNoteCreateInputCreditNote.reason) &&
        Objects.equals(this.description, creditNoteCreateInputCreditNote.description) &&
        equalsNullable(this.creditAmountCents, creditNoteCreateInputCreditNote.creditAmountCents) &&
        equalsNullable(this.refundAmountCents, creditNoteCreateInputCreditNote.refundAmountCents) &&
        Objects.equals(this.items, creditNoteCreateInputCreditNote.items);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(invoiceId, hashCodeNullable(reason), description, hashCodeNullable(creditAmountCents), hashCodeNullable(refundAmountCents), items);
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
    sb.append("class CreditNoteCreateInputCreditNote {\n");
    sb.append("    invoiceId: ").append(toIndentedString(invoiceId)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    creditAmountCents: ").append(toIndentedString(creditAmountCents)).append("\n");
    sb.append("    refundAmountCents: ").append(toIndentedString(refundAmountCents)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

