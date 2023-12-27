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
import org.openapitools.client.model.MrrObject;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Mrrs
 */
@JsonPropertyOrder({
  Mrrs.JSON_PROPERTY_MRRS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-27T14:12:55.372025191Z[Etc/UTC]")
public class Mrrs {
  public static final String JSON_PROPERTY_MRRS = "mrrs";
  private List<MrrObject> mrrs = new ArrayList<>();

  public Mrrs() {
  }

  public Mrrs mrrs(List<MrrObject> mrrs) {
    
    this.mrrs = mrrs;
    return this;
  }

  public Mrrs addMrrsItem(MrrObject mrrsItem) {
    if (this.mrrs == null) {
      this.mrrs = new ArrayList<>();
    }
    this.mrrs.add(mrrsItem);
    return this;
  }

   /**
   * Get mrrs
   * @return mrrs
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MRRS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<MrrObject> getMrrs() {
    return mrrs;
  }


  @JsonProperty(JSON_PROPERTY_MRRS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMrrs(List<MrrObject> mrrs) {
    this.mrrs = mrrs;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Mrrs mrrs = (Mrrs) o;
    return Objects.equals(this.mrrs, mrrs.mrrs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mrrs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Mrrs {\n");
    sb.append("    mrrs: ").append(toIndentedString(mrrs)).append("\n");
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

