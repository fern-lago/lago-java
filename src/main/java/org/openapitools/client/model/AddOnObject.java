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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.openapitools.client.model.Currency;
import org.openapitools.client.model.TaxObject;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * AddOnObject
 */
@JsonPropertyOrder({
  AddOnObject.JSON_PROPERTY_LAGO_ID,
  AddOnObject.JSON_PROPERTY_NAME,
  AddOnObject.JSON_PROPERTY_INVOICE_DISPLAY_NAME,
  AddOnObject.JSON_PROPERTY_CODE,
  AddOnObject.JSON_PROPERTY_AMOUNT_CENTS,
  AddOnObject.JSON_PROPERTY_AMOUNT_CURRENCY,
  AddOnObject.JSON_PROPERTY_DESCRIPTION,
  AddOnObject.JSON_PROPERTY_CREATED_AT,
  AddOnObject.JSON_PROPERTY_TAXES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-24T14:41:05.749099654Z[Etc/UTC]")
public class AddOnObject {
  public static final String JSON_PROPERTY_LAGO_ID = "lago_id";
  private UUID lagoId;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_INVOICE_DISPLAY_NAME = "invoice_display_name";
  private String invoiceDisplayName;

  public static final String JSON_PROPERTY_CODE = "code";
  private String code;

  public static final String JSON_PROPERTY_AMOUNT_CENTS = "amount_cents";
  private Integer amountCents;

  public static final String JSON_PROPERTY_AMOUNT_CURRENCY = "amount_currency";
  private Currency amountCurrency;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private JsonNullable<String> description = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_TAXES = "taxes";
  private List<TaxObject> taxes;

  public AddOnObject() {
  }

  public AddOnObject lagoId(UUID lagoId) {
    
    this.lagoId = lagoId;
    return this;
  }

   /**
   * Unique identifier of the add-on, created by Lago.
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


  public AddOnObject name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the add-on.
   * @return name
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  public AddOnObject invoiceDisplayName(String invoiceDisplayName) {
    
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


  public AddOnObject code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * Unique code used to identify the add-on.
   * @return code
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCode() {
    return code;
  }


  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCode(String code) {
    this.code = code;
  }


  public AddOnObject amountCents(Integer amountCents) {
    
    this.amountCents = amountCents;
    return this;
  }

   /**
   * The cost of the add-on in cents, excluding any applicable taxes, that is billed to a customer. By creating a one-off invoice, you will be able to override this value.
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


  public AddOnObject amountCurrency(Currency amountCurrency) {
    
    this.amountCurrency = amountCurrency;
    return this;
  }

   /**
   * Get amountCurrency
   * @return amountCurrency
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_AMOUNT_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Currency getAmountCurrency() {
    return amountCurrency;
  }


  @JsonProperty(JSON_PROPERTY_AMOUNT_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAmountCurrency(Currency amountCurrency) {
    this.amountCurrency = amountCurrency;
  }


  public AddOnObject description(String description) {
    this.description = JsonNullable.<String>of(description);
    
    return this;
  }

   /**
   * The description of the add-on.
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


  public AddOnObject createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The date and time when the add-on was created. It is expressed in UTC format according to the ISO 8601 datetime standard. This field provides the timestamp for the exact moment when the add-on was initially created.
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


  public AddOnObject taxes(List<TaxObject> taxes) {
    
    this.taxes = taxes;
    return this;
  }

  public AddOnObject addTaxesItem(TaxObject taxesItem) {
    if (this.taxes == null) {
      this.taxes = new ArrayList<>();
    }
    this.taxes.add(taxesItem);
    return this;
  }

   /**
   * All taxes applied to the add-on.
   * @return taxes
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAXES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TaxObject> getTaxes() {
    return taxes;
  }


  @JsonProperty(JSON_PROPERTY_TAXES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTaxes(List<TaxObject> taxes) {
    this.taxes = taxes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddOnObject addOnObject = (AddOnObject) o;
    return Objects.equals(this.lagoId, addOnObject.lagoId) &&
        Objects.equals(this.name, addOnObject.name) &&
        Objects.equals(this.invoiceDisplayName, addOnObject.invoiceDisplayName) &&
        Objects.equals(this.code, addOnObject.code) &&
        Objects.equals(this.amountCents, addOnObject.amountCents) &&
        Objects.equals(this.amountCurrency, addOnObject.amountCurrency) &&
        equalsNullable(this.description, addOnObject.description) &&
        Objects.equals(this.createdAt, addOnObject.createdAt) &&
        Objects.equals(this.taxes, addOnObject.taxes);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(lagoId, name, invoiceDisplayName, code, amountCents, amountCurrency, hashCodeNullable(description), createdAt, taxes);
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
    sb.append("class AddOnObject {\n");
    sb.append("    lagoId: ").append(toIndentedString(lagoId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    invoiceDisplayName: ").append(toIndentedString(invoiceDisplayName)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    amountCents: ").append(toIndentedString(amountCents)).append("\n");
    sb.append("    amountCurrency: ").append(toIndentedString(amountCurrency)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    taxes: ").append(toIndentedString(taxes)).append("\n");
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

