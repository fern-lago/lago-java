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
import org.openapitools.client.model.BillableMetricObject;
import org.openapitools.client.model.PaginationMeta;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * BillableMetricsPaginated
 */
@JsonPropertyOrder({
  BillableMetricsPaginated.JSON_PROPERTY_BILLABLE_METRICS,
  BillableMetricsPaginated.JSON_PROPERTY_META
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-24T14:46:07.416771019Z[Etc/UTC]")
public class BillableMetricsPaginated {
  public static final String JSON_PROPERTY_BILLABLE_METRICS = "billable_metrics";
  private List<BillableMetricObject> billableMetrics = new ArrayList<>();

  public static final String JSON_PROPERTY_META = "meta";
  private PaginationMeta meta;

  public BillableMetricsPaginated() {
  }

  public BillableMetricsPaginated billableMetrics(List<BillableMetricObject> billableMetrics) {
    
    this.billableMetrics = billableMetrics;
    return this;
  }

  public BillableMetricsPaginated addBillableMetricsItem(BillableMetricObject billableMetricsItem) {
    if (this.billableMetrics == null) {
      this.billableMetrics = new ArrayList<>();
    }
    this.billableMetrics.add(billableMetricsItem);
    return this;
  }

   /**
   * Get billableMetrics
   * @return billableMetrics
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_BILLABLE_METRICS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<BillableMetricObject> getBillableMetrics() {
    return billableMetrics;
  }


  @JsonProperty(JSON_PROPERTY_BILLABLE_METRICS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBillableMetrics(List<BillableMetricObject> billableMetrics) {
    this.billableMetrics = billableMetrics;
  }


  public BillableMetricsPaginated meta(PaginationMeta meta) {
    
    this.meta = meta;
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public PaginationMeta getMeta() {
    return meta;
  }


  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMeta(PaginationMeta meta) {
    this.meta = meta;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillableMetricsPaginated billableMetricsPaginated = (BillableMetricsPaginated) o;
    return Objects.equals(this.billableMetrics, billableMetricsPaginated.billableMetrics) &&
        Objects.equals(this.meta, billableMetricsPaginated.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billableMetrics, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillableMetricsPaginated {\n");
    sb.append("    billableMetrics: ").append(toIndentedString(billableMetrics)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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

