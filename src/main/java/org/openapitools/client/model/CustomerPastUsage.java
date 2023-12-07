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
import org.openapitools.client.model.CustomerUsage;
import org.openapitools.client.model.PaginationMeta;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * CustomerPastUsage
 */
@JsonPropertyOrder({
  CustomerPastUsage.JSON_PROPERTY_USAGE_PERIODS,
  CustomerPastUsage.JSON_PROPERTY_META
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-07T16:08:18.203563Z[Etc/UTC]")
public class CustomerPastUsage {
  public static final String JSON_PROPERTY_USAGE_PERIODS = "usage_periods";
  private List<CustomerUsage> usagePeriods = new ArrayList<>();

  public static final String JSON_PROPERTY_META = "meta";
  private PaginationMeta meta;

  public CustomerPastUsage() {
  }

  public CustomerPastUsage usagePeriods(List<CustomerUsage> usagePeriods) {
    
    this.usagePeriods = usagePeriods;
    return this;
  }

  public CustomerPastUsage addUsagePeriodsItem(CustomerUsage usagePeriodsItem) {
    if (this.usagePeriods == null) {
      this.usagePeriods = new ArrayList<>();
    }
    this.usagePeriods.add(usagePeriodsItem);
    return this;
  }

   /**
   * Get usagePeriods
   * @return usagePeriods
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_USAGE_PERIODS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<CustomerUsage> getUsagePeriods() {
    return usagePeriods;
  }


  @JsonProperty(JSON_PROPERTY_USAGE_PERIODS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUsagePeriods(List<CustomerUsage> usagePeriods) {
    this.usagePeriods = usagePeriods;
  }


  public CustomerPastUsage meta(PaginationMeta meta) {
    
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
    CustomerPastUsage customerPastUsage = (CustomerPastUsage) o;
    return Objects.equals(this.usagePeriods, customerPastUsage.usagePeriods) &&
        Objects.equals(this.meta, customerPastUsage.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(usagePeriods, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerPastUsage {\n");
    sb.append("    usagePeriods: ").append(toIndentedString(usagePeriods)).append("\n");
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

