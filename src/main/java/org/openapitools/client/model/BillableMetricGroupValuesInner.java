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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.BillableMetricGroupValuesInnerOneOf;



import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import com.google.gson.JsonParseException;

import org.openapitools.client.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-31T09:20:28.589842Z[Etc/UTC]")
public class BillableMetricGroupValuesInner extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(BillableMetricGroupValuesInner.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!BillableMetricGroupValuesInner.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'BillableMetricGroupValuesInner' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<String> adapterString = gson.getDelegateAdapter(this, TypeToken.get(String.class));
            final TypeAdapter<BillableMetricGroupValuesInnerOneOf> adapterBillableMetricGroupValuesInnerOneOf = gson.getDelegateAdapter(this, TypeToken.get(BillableMetricGroupValuesInnerOneOf.class));

            return (TypeAdapter<T>) new TypeAdapter<BillableMetricGroupValuesInner>() {
                @Override
                public void write(JsonWriter out, BillableMetricGroupValuesInner value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `String`
                    if (value.getActualInstance() instanceof String) {
                      JsonPrimitive primitive = adapterString.toJsonTree((String)value.getActualInstance()).getAsJsonPrimitive();
                      elementAdapter.write(out, primitive);
                      return;
                    }
                    // check if the actual instance is of the type `BillableMetricGroupValuesInnerOneOf`
                    if (value.getActualInstance() instanceof BillableMetricGroupValuesInnerOneOf) {
                      JsonElement element = adapterBillableMetricGroupValuesInnerOneOf.toJsonTree((BillableMetricGroupValuesInnerOneOf)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: BillableMetricGroupValuesInnerOneOf, String");
                }

                @Override
                public BillableMetricGroupValuesInner read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize String
                    try {
                      // validate the JSON object to see if any exception is thrown
                      if(!jsonElement.getAsJsonPrimitive().isString()) {
                        throw new IllegalArgumentException(String.format("Expected json element to be of type String in the JSON string but got `%s`", jsonElement.toString()));
                      }
                      actualAdapter = adapterString;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'String'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for String failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'String'", e);
                    }
                    // deserialize BillableMetricGroupValuesInnerOneOf
                    try {
                      // validate the JSON object to see if any exception is thrown
                      BillableMetricGroupValuesInnerOneOf.validateJsonElement(jsonElement);
                      actualAdapter = adapterBillableMetricGroupValuesInnerOneOf;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'BillableMetricGroupValuesInnerOneOf'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for BillableMetricGroupValuesInnerOneOf failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'BillableMetricGroupValuesInnerOneOf'", e);
                    }

                    if (match == 1) {
                        BillableMetricGroupValuesInner ret = new BillableMetricGroupValuesInner();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for BillableMetricGroupValuesInner: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public BillableMetricGroupValuesInner() {
        super("oneOf", Boolean.FALSE);
    }

    public BillableMetricGroupValuesInner(BillableMetricGroupValuesInnerOneOf o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public BillableMetricGroupValuesInner(String o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("String", String.class);
        schemas.put("BillableMetricGroupValuesInnerOneOf", BillableMetricGroupValuesInnerOneOf.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return BillableMetricGroupValuesInner.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * BillableMetricGroupValuesInnerOneOf, String
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof String) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof BillableMetricGroupValuesInnerOneOf) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be BillableMetricGroupValuesInnerOneOf, String");
    }

    /**
     * Get the actual instance, which can be the following:
     * BillableMetricGroupValuesInnerOneOf, String
     *
     * @return The actual instance (BillableMetricGroupValuesInnerOneOf, String)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `String`. If the actual instance is not `String`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `String`
     * @throws ClassCastException if the instance is not `String`
     */
    public String getString() throws ClassCastException {
        return (String)super.getActualInstance();
    }
    /**
     * Get the actual instance of `BillableMetricGroupValuesInnerOneOf`. If the actual instance is not `BillableMetricGroupValuesInnerOneOf`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `BillableMetricGroupValuesInnerOneOf`
     * @throws ClassCastException if the instance is not `BillableMetricGroupValuesInnerOneOf`
     */
    public BillableMetricGroupValuesInnerOneOf getBillableMetricGroupValuesInnerOneOf() throws ClassCastException {
        return (BillableMetricGroupValuesInnerOneOf)super.getActualInstance();
    }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to BillableMetricGroupValuesInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with String
    try {
      if(!jsonElement.getAsJsonPrimitive().isString()) {
        throw new IllegalArgumentException(String.format("Expected json element to be of type String in the JSON string but got `%s`", jsonElement.toString()));
      }
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for String failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with BillableMetricGroupValuesInnerOneOf
    try {
      BillableMetricGroupValuesInnerOneOf.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for BillableMetricGroupValuesInnerOneOf failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for BillableMetricGroupValuesInner with oneOf schemas: BillableMetricGroupValuesInnerOneOf, String. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
    }
  }

 /**
  * Create an instance of BillableMetricGroupValuesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BillableMetricGroupValuesInner
  * @throws IOException if the JSON string is invalid with respect to BillableMetricGroupValuesInner
  */
  public static BillableMetricGroupValuesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BillableMetricGroupValuesInner.class);
  }

 /**
  * Convert an instance of BillableMetricGroupValuesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
