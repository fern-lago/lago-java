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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.InvoiceCollectionObject;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * InvoiceCollections
 */
@JsonPropertyOrder({
  InvoiceCollections.JSON_PROPERTY_INVOICE_COLLECTIONS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-07T16:08:18.203563Z[Etc/UTC]")
public class InvoiceCollections {
  public static final String JSON_PROPERTY_INVOICE_COLLECTIONS = "invoice_collections";
  private List<InvoiceCollectionObject> invoiceCollections = new ArrayList<>();

  public InvoiceCollections() {
  }

  public InvoiceCollections invoiceCollections(List<InvoiceCollectionObject> invoiceCollections) {
    
    this.invoiceCollections = invoiceCollections;
    return this;
  }

  public InvoiceCollections addInvoiceCollectionsItem(InvoiceCollectionObject invoiceCollectionsItem) {
    if (this.invoiceCollections == null) {
      this.invoiceCollections = new ArrayList<>();
    }
    this.invoiceCollections.add(invoiceCollectionsItem);
    return this;
  }

   /**
   * Get invoiceCollections
   * @return invoiceCollections
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_INVOICE_COLLECTIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<InvoiceCollectionObject> getInvoiceCollections() {
    return invoiceCollections;
  }


  @JsonProperty(JSON_PROPERTY_INVOICE_COLLECTIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setInvoiceCollections(List<InvoiceCollectionObject> invoiceCollections) {
    this.invoiceCollections = invoiceCollections;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvoiceCollections invoiceCollections = (InvoiceCollections) o;
    return Objects.equals(this.invoiceCollections, invoiceCollections.invoiceCollections);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invoiceCollections);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoiceCollections {\n");
    sb.append("    invoiceCollections: ").append(toIndentedString(invoiceCollections)).append("\n");
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

