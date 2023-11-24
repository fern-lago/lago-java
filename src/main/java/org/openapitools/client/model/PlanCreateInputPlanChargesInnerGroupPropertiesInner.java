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
import org.openapitools.client.model.GroupPropertiesObjectValues;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * PlanCreateInputPlanChargesInnerGroupPropertiesInner
 */
@JsonPropertyOrder({
  PlanCreateInputPlanChargesInnerGroupPropertiesInner.JSON_PROPERTY_GROUP_ID,
  PlanCreateInputPlanChargesInnerGroupPropertiesInner.JSON_PROPERTY_VALUES
})
@JsonTypeName("PlanCreateInput_plan_charges_inner_group_properties_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-24T14:46:07.416771019Z[Etc/UTC]")
public class PlanCreateInputPlanChargesInnerGroupPropertiesInner {
  public static final String JSON_PROPERTY_GROUP_ID = "group_id";
  private String groupId;

  public static final String JSON_PROPERTY_VALUES = "values";
  private GroupPropertiesObjectValues values;

  public PlanCreateInputPlanChargesInnerGroupPropertiesInner() {
  }

  public PlanCreateInputPlanChargesInnerGroupPropertiesInner groupId(String groupId) {
    
    this.groupId = groupId;
    return this;
  }

   /**
   * Unique identifier of a billable metric group, created by Lago.
   * @return groupId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getGroupId() {
    return groupId;
  }


  @JsonProperty(JSON_PROPERTY_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }


  public PlanCreateInputPlanChargesInnerGroupPropertiesInner values(GroupPropertiesObjectValues values) {
    
    this.values = values;
    return this;
  }

   /**
   * Get values
   * @return values
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_VALUES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public GroupPropertiesObjectValues getValues() {
    return values;
  }


  @JsonProperty(JSON_PROPERTY_VALUES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setValues(GroupPropertiesObjectValues values) {
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
    PlanCreateInputPlanChargesInnerGroupPropertiesInner planCreateInputPlanChargesInnerGroupPropertiesInner = (PlanCreateInputPlanChargesInnerGroupPropertiesInner) o;
    return Objects.equals(this.groupId, planCreateInputPlanChargesInnerGroupPropertiesInner.groupId) &&
        Objects.equals(this.values, planCreateInputPlanChargesInnerGroupPropertiesInner.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupId, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlanCreateInputPlanChargesInnerGroupPropertiesInner {\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
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

