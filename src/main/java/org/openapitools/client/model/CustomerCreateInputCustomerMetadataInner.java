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
import java.util.UUID;

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
 * CustomerCreateInputCustomerMetadataInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-31T09:20:28.589842Z[Etc/UTC]")
public class CustomerCreateInputCustomerMetadataInner {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public static final String SERIALIZED_NAME_DISPLAY_IN_INVOICE = "display_in_invoice";
  @SerializedName(SERIALIZED_NAME_DISPLAY_IN_INVOICE)
  private Boolean displayInInvoice;

  public CustomerCreateInputCustomerMetadataInner() {
  }

  public CustomerCreateInputCustomerMetadataInner id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * Identifier for the metadata object, only required when updating a key-value pair
   * @return id
  **/
  @javax.annotation.Nullable
  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public CustomerCreateInputCustomerMetadataInner key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * The metadata object key
   * @return key
  **/
  @javax.annotation.Nonnull
  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    this.key = key;
  }


  public CustomerCreateInputCustomerMetadataInner value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * The metadata object value
   * @return value
  **/
  @javax.annotation.Nonnull
  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }


  public CustomerCreateInputCustomerMetadataInner displayInInvoice(Boolean displayInInvoice) {
    
    this.displayInInvoice = displayInInvoice;
    return this;
  }

   /**
   * Determines whether the item or information should be displayed in the invoice. If set to true, the item or information will be included and visible in the generated invoice. If set to false, the item or information will be excluded and not displayed in the invoice.
   * @return displayInInvoice
  **/
  @javax.annotation.Nonnull
  public Boolean getDisplayInInvoice() {
    return displayInInvoice;
  }


  public void setDisplayInInvoice(Boolean displayInInvoice) {
    this.displayInInvoice = displayInInvoice;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerCreateInputCustomerMetadataInner customerCreateInputCustomerMetadataInner = (CustomerCreateInputCustomerMetadataInner) o;
    return Objects.equals(this.id, customerCreateInputCustomerMetadataInner.id) &&
        Objects.equals(this.key, customerCreateInputCustomerMetadataInner.key) &&
        Objects.equals(this.value, customerCreateInputCustomerMetadataInner.value) &&
        Objects.equals(this.displayInInvoice, customerCreateInputCustomerMetadataInner.displayInInvoice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, key, value, displayInInvoice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerCreateInputCustomerMetadataInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    displayInInvoice: ").append(toIndentedString(displayInInvoice)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("key");
    openapiFields.add("value");
    openapiFields.add("display_in_invoice");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("key");
    openapiRequiredFields.add("value");
    openapiRequiredFields.add("display_in_invoice");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CustomerCreateInputCustomerMetadataInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CustomerCreateInputCustomerMetadataInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CustomerCreateInputCustomerMetadataInner is not found in the empty JSON string", CustomerCreateInputCustomerMetadataInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CustomerCreateInputCustomerMetadataInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CustomerCreateInputCustomerMetadataInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CustomerCreateInputCustomerMetadataInner.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("key").toString()));
      }
      if (!jsonObj.get("value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("value").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CustomerCreateInputCustomerMetadataInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CustomerCreateInputCustomerMetadataInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CustomerCreateInputCustomerMetadataInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CustomerCreateInputCustomerMetadataInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CustomerCreateInputCustomerMetadataInner>() {
           @Override
           public void write(JsonWriter out, CustomerCreateInputCustomerMetadataInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CustomerCreateInputCustomerMetadataInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CustomerCreateInputCustomerMetadataInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CustomerCreateInputCustomerMetadataInner
  * @throws IOException if the JSON string is invalid with respect to CustomerCreateInputCustomerMetadataInner
  */
  public static CustomerCreateInputCustomerMetadataInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CustomerCreateInputCustomerMetadataInner.class);
  }

 /**
  * Convert an instance of CustomerCreateInputCustomerMetadataInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
