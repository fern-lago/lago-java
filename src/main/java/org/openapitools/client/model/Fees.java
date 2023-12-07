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
import org.openapitools.client.model.FeeObject;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Fees
 */
@JsonPropertyOrder({
  Fees.JSON_PROPERTY_FEES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-07T15:52:17.625211Z[Etc/UTC]")
public class Fees {
  public static final String JSON_PROPERTY_FEES = "fees";
  private List<FeeObject> fees = new ArrayList<>();

  public Fees() {
  }

  public Fees fees(List<FeeObject> fees) {
    
    this.fees = fees;
    return this;
  }

  public Fees addFeesItem(FeeObject feesItem) {
    if (this.fees == null) {
      this.fees = new ArrayList<>();
    }
    this.fees.add(feesItem);
    return this;
  }

   /**
   * Get fees
   * @return fees
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FEES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<FeeObject> getFees() {
    return fees;
  }


  @JsonProperty(JSON_PROPERTY_FEES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFees(List<FeeObject> fees) {
    this.fees = fees;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Fees fees = (Fees) o;
    return Objects.equals(this.fees, fees.fees);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fees);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Fees {\n");
    sb.append("    fees: ").append(toIndentedString(fees)).append("\n");
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

