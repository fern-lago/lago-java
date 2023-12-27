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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Second dimension of group.
 */
@JsonPropertyOrder({
  BillableMetricGroupValuesInnerOneOf.JSON_PROPERTY_KEY,
  BillableMetricGroupValuesInnerOneOf.JSON_PROPERTY_VALUES
})
@JsonTypeName("BillableMetricGroup_values_inner_oneOf")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-27T14:12:55.372025191Z[Etc/UTC]")
public class BillableMetricGroupValuesInnerOneOf {
  public static final String JSON_PROPERTY_KEY = "key";
  private String key;

  public static final String JSON_PROPERTY_VALUES = "values";
  private List<String> values = new ArrayList<>();

  public BillableMetricGroupValuesInnerOneOf() {
  }

  public BillableMetricGroupValuesInnerOneOf key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * Name of the event property used to group values.
   * @return key
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getKey() {
    return key;
  }


  @JsonProperty(JSON_PROPERTY_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setKey(String key) {
    this.key = key;
  }


  public BillableMetricGroupValuesInnerOneOf values(List<String> values) {
    
    this.values = values;
    return this;
  }

  public BillableMetricGroupValuesInnerOneOf addValuesItem(String valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
    this.values.add(valuesItem);
    return this;
  }

   /**
   * Array of strings representing all possible values.
   * @return values
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_VALUES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getValues() {
    return values;
  }


  @JsonProperty(JSON_PROPERTY_VALUES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setValues(List<String> values) {
    this.values = values;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillableMetricGroupValuesInnerOneOf billableMetricGroupValuesInnerOneOf = (BillableMetricGroupValuesInnerOneOf) o;
    return Objects.equals(this.key, billableMetricGroupValuesInnerOneOf.key) &&
        Objects.equals(this.values, billableMetricGroupValuesInnerOneOf.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillableMetricGroupValuesInnerOneOf {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

