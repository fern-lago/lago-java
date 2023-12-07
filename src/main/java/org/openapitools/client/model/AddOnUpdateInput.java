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
import org.openapitools.client.model.AddOnBaseInput;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * AddOnUpdateInput
 */
@JsonPropertyOrder({
  AddOnUpdateInput.JSON_PROPERTY_ADD_ON
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-07T16:08:18.203563Z[Etc/UTC]")
public class AddOnUpdateInput {
  public static final String JSON_PROPERTY_ADD_ON = "add_on";
  private AddOnBaseInput addOn;

  public AddOnUpdateInput() {
  }

  public AddOnUpdateInput addOn(AddOnBaseInput addOn) {
    
    this.addOn = addOn;
    return this;
  }

   /**
   * Get addOn
   * @return addOn
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ADD_ON)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public AddOnBaseInput getAddOn() {
    return addOn;
  }


  @JsonProperty(JSON_PROPERTY_ADD_ON)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAddOn(AddOnBaseInput addOn) {
    this.addOn = addOn;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddOnUpdateInput addOnUpdateInput = (AddOnUpdateInput) o;
    return Objects.equals(this.addOn, addOnUpdateInput.addOn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addOn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddOnUpdateInput {\n");
    sb.append("    addOn: ").append(toIndentedString(addOn)).append("\n");
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

