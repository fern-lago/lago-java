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
import org.openapitools.client.model.AddOnObject;
import org.openapitools.client.model.PaginationMeta;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * AddOnsPaginated
 */
@JsonPropertyOrder({
  AddOnsPaginated.JSON_PROPERTY_ADD_ONS,
  AddOnsPaginated.JSON_PROPERTY_META
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-07T15:52:17.625211Z[Etc/UTC]")
public class AddOnsPaginated {
  public static final String JSON_PROPERTY_ADD_ONS = "add_ons";
  private List<AddOnObject> addOns = new ArrayList<>();

  public static final String JSON_PROPERTY_META = "meta";
  private PaginationMeta meta;

  public AddOnsPaginated() {
  }

  public AddOnsPaginated addOns(List<AddOnObject> addOns) {
    
    this.addOns = addOns;
    return this;
  }

  public AddOnsPaginated addAddOnsItem(AddOnObject addOnsItem) {
    if (this.addOns == null) {
      this.addOns = new ArrayList<>();
    }
    this.addOns.add(addOnsItem);
    return this;
  }

   /**
   * Get addOns
   * @return addOns
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ADD_ONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<AddOnObject> getAddOns() {
    return addOns;
  }


  @JsonProperty(JSON_PROPERTY_ADD_ONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAddOns(List<AddOnObject> addOns) {
    this.addOns = addOns;
  }


  public AddOnsPaginated meta(PaginationMeta meta) {
    
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
    AddOnsPaginated addOnsPaginated = (AddOnsPaginated) o;
    return Objects.equals(this.addOns, addOnsPaginated.addOns) &&
        Objects.equals(this.meta, addOnsPaginated.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addOns, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddOnsPaginated {\n");
    sb.append("    addOns: ").append(toIndentedString(addOns)).append("\n");
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

