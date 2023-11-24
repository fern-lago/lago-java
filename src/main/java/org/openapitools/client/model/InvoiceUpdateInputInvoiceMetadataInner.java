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
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * InvoiceUpdateInputInvoiceMetadataInner
 */
@JsonPropertyOrder({
  InvoiceUpdateInputInvoiceMetadataInner.JSON_PROPERTY_ID,
  InvoiceUpdateInputInvoiceMetadataInner.JSON_PROPERTY_KEY,
  InvoiceUpdateInputInvoiceMetadataInner.JSON_PROPERTY_VALUE
})
@JsonTypeName("InvoiceUpdateInput_invoice_metadata_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-24T14:41:05.749099654Z[Etc/UTC]")
public class InvoiceUpdateInputInvoiceMetadataInner {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_KEY = "key";
  private String key;

  public static final String JSON_PROPERTY_VALUE = "value";
  private String value;

  public InvoiceUpdateInputInvoiceMetadataInner() {
  }

  public InvoiceUpdateInputInvoiceMetadataInner id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * The metadata object identifier. Only required when updating existing metadata.
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


  public InvoiceUpdateInputInvoiceMetadataInner key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * The key in the key-value pair of the metadata.
   * @return key
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getKey() {
    return key;
  }


  @JsonProperty(JSON_PROPERTY_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKey(String key) {
    this.key = key;
  }


  public InvoiceUpdateInputInvoiceMetadataInner value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * The value in the key-value pair of the metadata.
   * @return value
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getValue() {
    return value;
  }


  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvoiceUpdateInputInvoiceMetadataInner invoiceUpdateInputInvoiceMetadataInner = (InvoiceUpdateInputInvoiceMetadataInner) o;
    return Objects.equals(this.id, invoiceUpdateInputInvoiceMetadataInner.id) &&
        Objects.equals(this.key, invoiceUpdateInputInvoiceMetadataInner.key) &&
        Objects.equals(this.value, invoiceUpdateInputInvoiceMetadataInner.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, key, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoiceUpdateInputInvoiceMetadataInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

