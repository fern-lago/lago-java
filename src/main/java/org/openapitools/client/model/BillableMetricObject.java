/*
 * Lago API documentation
 * Lago API allows your application to push customer information and metrics (events) from your application to the billing application.
 *
 * The version of the OpenAPI document: 0.46.0-beta
 * Contact: tech@getlago.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.UUID;
import org.openapitools.client.model.BillableMetricGroup;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * BillableMetricObject
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-31T09:20:28.589842Z[Etc/UTC]")
public class BillableMetricObject {
  public static final String SERIALIZED_NAME_LAGO_ID = "lago_id";
  @SerializedName(SERIALIZED_NAME_LAGO_ID)
  private UUID lagoId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_RECURRING = "recurring";
  @SerializedName(SERIALIZED_NAME_RECURRING)
  private Boolean recurring;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_FIELD_NAME = "field_name";
  @SerializedName(SERIALIZED_NAME_FIELD_NAME)
  private String fieldName;

  /**
   * Aggregation method used to compute usage for this billable metric. Possible values are &#x60;count_agg&#x60;, &#x60;sum_agg&#x60;, &#x60;max_agg&#x60; or &#x60;unique_count_agg&#x60;.
   */
  @JsonAdapter(AggregationTypeEnum.Adapter.class)
  public enum AggregationTypeEnum {
    COUNT_AGG("count_agg"),
    
    SUM_AGG("sum_agg"),
    
    MAX_AGG("max_agg"),
    
    UNIQUE_COUNT_AGG("unique_count_agg");

    private String value;

    AggregationTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AggregationTypeEnum fromValue(String value) {
      for (AggregationTypeEnum b : AggregationTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AggregationTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AggregationTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AggregationTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AggregationTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_AGGREGATION_TYPE = "aggregation_type";
  @SerializedName(SERIALIZED_NAME_AGGREGATION_TYPE)
  private AggregationTypeEnum aggregationType;

  public static final String SERIALIZED_NAME_GROUP = "group";
  @SerializedName(SERIALIZED_NAME_GROUP)
  private BillableMetricGroup group;

  public static final String SERIALIZED_NAME_ACTIVE_SUBSCRIPTIONS_COUNT = "active_subscriptions_count";
  @SerializedName(SERIALIZED_NAME_ACTIVE_SUBSCRIPTIONS_COUNT)
  private Integer activeSubscriptionsCount;

  public static final String SERIALIZED_NAME_DRAFT_INVOICES_COUNT = "draft_invoices_count";
  @SerializedName(SERIALIZED_NAME_DRAFT_INVOICES_COUNT)
  private Integer draftInvoicesCount;

  public static final String SERIALIZED_NAME_PLANS_COUNT = "plans_count";
  @SerializedName(SERIALIZED_NAME_PLANS_COUNT)
  private Integer plansCount;

  public BillableMetricObject() {
  }

  public BillableMetricObject lagoId(UUID lagoId) {
    
    this.lagoId = lagoId;
    return this;
  }

   /**
   * Unique identifier of the billable metric created by Lago.
   * @return lagoId
  **/
  @javax.annotation.Nonnull
  public UUID getLagoId() {
    return lagoId;
  }


  public void setLagoId(UUID lagoId) {
    this.lagoId = lagoId;
  }


  public BillableMetricObject name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the billable metric.
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public BillableMetricObject code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * Unique code used to identify the billable metric associated with the API request. This code associates each event with the correct metric.
   * @return code
  **/
  @javax.annotation.Nonnull
  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public BillableMetricObject description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Internal description of the billable metric.
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public BillableMetricObject recurring(Boolean recurring) {
    
    this.recurring = recurring;
    return this;
  }

   /**
   * Defines if the billable metric is persisted billing period over billing period.  - If set to &#x60;true&#x60;: the accumulated number of units calculated from the previous billing period is persisted to the next billing period. - If set to &#x60;false&#x60;: the accumulated number of units is reset to 0 at the end of the billing period. - If not defined in the request, default value is &#x60;false&#x60;.
   * @return recurring
  **/
  @javax.annotation.Nonnull
  public Boolean getRecurring() {
    return recurring;
  }


  public void setRecurring(Boolean recurring) {
    this.recurring = recurring;
  }


  public BillableMetricObject createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Creation date of the billable metric.
   * @return createdAt
  **/
  @javax.annotation.Nonnull
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public BillableMetricObject fieldName(String fieldName) {
    
    this.fieldName = fieldName;
    return this;
  }

   /**
   * Property of the billable metric used for aggregating usage data. This field is not required for &#x60;count_agg&#x60;.
   * @return fieldName
  **/
  @javax.annotation.Nullable
  public String getFieldName() {
    return fieldName;
  }


  public void setFieldName(String fieldName) {
    this.fieldName = fieldName;
  }


  public BillableMetricObject aggregationType(AggregationTypeEnum aggregationType) {
    
    this.aggregationType = aggregationType;
    return this;
  }

   /**
   * Aggregation method used to compute usage for this billable metric. Possible values are &#x60;count_agg&#x60;, &#x60;sum_agg&#x60;, &#x60;max_agg&#x60; or &#x60;unique_count_agg&#x60;.
   * @return aggregationType
  **/
  @javax.annotation.Nonnull
  public AggregationTypeEnum getAggregationType() {
    return aggregationType;
  }


  public void setAggregationType(AggregationTypeEnum aggregationType) {
    this.aggregationType = aggregationType;
  }


  public BillableMetricObject group(BillableMetricGroup group) {
    
    this.group = group;
    return this;
  }

   /**
   * Get group
   * @return group
  **/
  @javax.annotation.Nullable
  public BillableMetricGroup getGroup() {
    return group;
  }


  public void setGroup(BillableMetricGroup group) {
    this.group = group;
  }


  public BillableMetricObject activeSubscriptionsCount(Integer activeSubscriptionsCount) {
    
    this.activeSubscriptionsCount = activeSubscriptionsCount;
    return this;
  }

   /**
   * Number of active subscriptions using this billable metric.
   * @return activeSubscriptionsCount
  **/
  @javax.annotation.Nonnull
  public Integer getActiveSubscriptionsCount() {
    return activeSubscriptionsCount;
  }


  public void setActiveSubscriptionsCount(Integer activeSubscriptionsCount) {
    this.activeSubscriptionsCount = activeSubscriptionsCount;
  }


  public BillableMetricObject draftInvoicesCount(Integer draftInvoicesCount) {
    
    this.draftInvoicesCount = draftInvoicesCount;
    return this;
  }

   /**
   * Number of draft invoices for which this billable metric is listed as an invoice item.
   * @return draftInvoicesCount
  **/
  @javax.annotation.Nonnull
  public Integer getDraftInvoicesCount() {
    return draftInvoicesCount;
  }


  public void setDraftInvoicesCount(Integer draftInvoicesCount) {
    this.draftInvoicesCount = draftInvoicesCount;
  }


  public BillableMetricObject plansCount(Integer plansCount) {
    
    this.plansCount = plansCount;
    return this;
  }

   /**
   * Number of plans using this billable metric.
   * @return plansCount
  **/
  @javax.annotation.Nonnull
  public Integer getPlansCount() {
    return plansCount;
  }


  public void setPlansCount(Integer plansCount) {
    this.plansCount = plansCount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillableMetricObject billableMetricObject = (BillableMetricObject) o;
    return Objects.equals(this.lagoId, billableMetricObject.lagoId) &&
        Objects.equals(this.name, billableMetricObject.name) &&
        Objects.equals(this.code, billableMetricObject.code) &&
        Objects.equals(this.description, billableMetricObject.description) &&
        Objects.equals(this.recurring, billableMetricObject.recurring) &&
        Objects.equals(this.createdAt, billableMetricObject.createdAt) &&
        Objects.equals(this.fieldName, billableMetricObject.fieldName) &&
        Objects.equals(this.aggregationType, billableMetricObject.aggregationType) &&
        Objects.equals(this.group, billableMetricObject.group) &&
        Objects.equals(this.activeSubscriptionsCount, billableMetricObject.activeSubscriptionsCount) &&
        Objects.equals(this.draftInvoicesCount, billableMetricObject.draftInvoicesCount) &&
        Objects.equals(this.plansCount, billableMetricObject.plansCount);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(lagoId, name, code, description, recurring, createdAt, fieldName, aggregationType, group, activeSubscriptionsCount, draftInvoicesCount, plansCount);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillableMetricObject {\n");
    sb.append("    lagoId: ").append(toIndentedString(lagoId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    recurring: ").append(toIndentedString(recurring)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
    sb.append("    aggregationType: ").append(toIndentedString(aggregationType)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    activeSubscriptionsCount: ").append(toIndentedString(activeSubscriptionsCount)).append("\n");
    sb.append("    draftInvoicesCount: ").append(toIndentedString(draftInvoicesCount)).append("\n");
    sb.append("    plansCount: ").append(toIndentedString(plansCount)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("lago_id");
    openapiFields.add("name");
    openapiFields.add("code");
    openapiFields.add("description");
    openapiFields.add("recurring");
    openapiFields.add("created_at");
    openapiFields.add("field_name");
    openapiFields.add("aggregation_type");
    openapiFields.add("group");
    openapiFields.add("active_subscriptions_count");
    openapiFields.add("draft_invoices_count");
    openapiFields.add("plans_count");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("lago_id");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("code");
    openapiRequiredFields.add("recurring");
    openapiRequiredFields.add("created_at");
    openapiRequiredFields.add("aggregation_type");
    openapiRequiredFields.add("active_subscriptions_count");
    openapiRequiredFields.add("draft_invoices_count");
    openapiRequiredFields.add("plans_count");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to BillableMetricObject
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BillableMetricObject.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BillableMetricObject is not found in the empty JSON string", BillableMetricObject.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!BillableMetricObject.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BillableMetricObject` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : BillableMetricObject.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("lago_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lago_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lago_id").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("field_name") != null && !jsonObj.get("field_name").isJsonNull()) && !jsonObj.get("field_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `field_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("field_name").toString()));
      }
      if (!jsonObj.get("aggregation_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `aggregation_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("aggregation_type").toString()));
      }
      // validate the optional field `group`
      if (jsonObj.get("group") != null && !jsonObj.get("group").isJsonNull()) {
        BillableMetricGroup.validateJsonElement(jsonObj.get("group"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BillableMetricObject.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BillableMetricObject' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BillableMetricObject> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BillableMetricObject.class));

       return (TypeAdapter<T>) new TypeAdapter<BillableMetricObject>() {
           @Override
           public void write(JsonWriter out, BillableMetricObject value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BillableMetricObject read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BillableMetricObject given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BillableMetricObject
  * @throws IOException if the JSON string is invalid with respect to BillableMetricObject
  */
  public static BillableMetricObject fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BillableMetricObject.class);
  }

 /**
  * Convert an instance of BillableMetricObject to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
