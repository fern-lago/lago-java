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
import org.openapitools.client.model.Country;
import org.openapitools.client.model.Currency;
import org.openapitools.client.model.CustomerBillingConfiguration;
import org.openapitools.client.model.CustomerCreateInputCustomerMetadataInner;
import org.openapitools.client.model.Timezone;
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
 * CustomerCreateInputCustomer
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-31T09:20:28.589842Z[Etc/UTC]")
public class CustomerCreateInputCustomer {
  public static final String SERIALIZED_NAME_EXTERNAL_ID = "external_id";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ID)
  private String externalId;

  public static final String SERIALIZED_NAME_ADDRESS_LINE1 = "address_line1";
  @SerializedName(SERIALIZED_NAME_ADDRESS_LINE1)
  private String addressLine1;

  public static final String SERIALIZED_NAME_ADDRESS_LINE2 = "address_line2";
  @SerializedName(SERIALIZED_NAME_ADDRESS_LINE2)
  private String addressLine2;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private Country country;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private Currency currency;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_LEGAL_NAME = "legal_name";
  @SerializedName(SERIALIZED_NAME_LEGAL_NAME)
  private String legalName;

  public static final String SERIALIZED_NAME_LEGAL_NUMBER = "legal_number";
  @SerializedName(SERIALIZED_NAME_LEGAL_NUMBER)
  private String legalNumber;

  public static final String SERIALIZED_NAME_LOGO_URL = "logo_url";
  @SerializedName(SERIALIZED_NAME_LOGO_URL)
  private String logoUrl;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PHONE = "phone";
  @SerializedName(SERIALIZED_NAME_PHONE)
  private String phone;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_TAX_CODES = "tax_codes";
  @SerializedName(SERIALIZED_NAME_TAX_CODES)
  private List<String> taxCodes;

  public static final String SERIALIZED_NAME_TAX_IDENTIFICATION_NUMBER = "tax_identification_number";
  @SerializedName(SERIALIZED_NAME_TAX_IDENTIFICATION_NUMBER)
  private String taxIdentificationNumber;

  public static final String SERIALIZED_NAME_TIMEZONE = "timezone";
  @SerializedName(SERIALIZED_NAME_TIMEZONE)
  private Timezone timezone;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_ZIPCODE = "zipcode";
  @SerializedName(SERIALIZED_NAME_ZIPCODE)
  private String zipcode;

  public static final String SERIALIZED_NAME_NET_PAYMENT_TERM = "net_payment_term";
  @SerializedName(SERIALIZED_NAME_NET_PAYMENT_TERM)
  private Integer netPaymentTerm;

  public static final String SERIALIZED_NAME_BILLING_CONFIGURATION = "billing_configuration";
  @SerializedName(SERIALIZED_NAME_BILLING_CONFIGURATION)
  private CustomerBillingConfiguration billingConfiguration;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private List<CustomerCreateInputCustomerMetadataInner> metadata;

  public CustomerCreateInputCustomer() {
  }

  public CustomerCreateInputCustomer externalId(String externalId) {
    
    this.externalId = externalId;
    return this;
  }

   /**
   * The customer external unique identifier (provided by your own application)
   * @return externalId
  **/
  @javax.annotation.Nonnull
  public String getExternalId() {
    return externalId;
  }


  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }


  public CustomerCreateInputCustomer addressLine1(String addressLine1) {
    
    this.addressLine1 = addressLine1;
    return this;
  }

   /**
   * The first line of the billing address
   * @return addressLine1
  **/
  @javax.annotation.Nullable
  public String getAddressLine1() {
    return addressLine1;
  }


  public void setAddressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
  }


  public CustomerCreateInputCustomer addressLine2(String addressLine2) {
    
    this.addressLine2 = addressLine2;
    return this;
  }

   /**
   * The second line of the billing address
   * @return addressLine2
  **/
  @javax.annotation.Nullable
  public String getAddressLine2() {
    return addressLine2;
  }


  public void setAddressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
  }


  public CustomerCreateInputCustomer city(String city) {
    
    this.city = city;
    return this;
  }

   /**
   * The city of the customer&#39;s billing address
   * @return city
  **/
  @javax.annotation.Nullable
  public String getCity() {
    return city;
  }


  public void setCity(String city) {
    this.city = city;
  }


  public CustomerCreateInputCustomer country(Country country) {
    
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @javax.annotation.Nullable
  public Country getCountry() {
    return country;
  }


  public void setCountry(Country country) {
    this.country = country;
  }


  public CustomerCreateInputCustomer currency(Currency currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @javax.annotation.Nullable
  public Currency getCurrency() {
    return currency;
  }


  public void setCurrency(Currency currency) {
    this.currency = currency;
  }


  public CustomerCreateInputCustomer email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * The email of the customer
   * @return email
  **/
  @javax.annotation.Nullable
  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public CustomerCreateInputCustomer legalName(String legalName) {
    
    this.legalName = legalName;
    return this;
  }

   /**
   * The legal company name of the customer
   * @return legalName
  **/
  @javax.annotation.Nullable
  public String getLegalName() {
    return legalName;
  }


  public void setLegalName(String legalName) {
    this.legalName = legalName;
  }


  public CustomerCreateInputCustomer legalNumber(String legalNumber) {
    
    this.legalNumber = legalNumber;
    return this;
  }

   /**
   * The legal company number of the customer
   * @return legalNumber
  **/
  @javax.annotation.Nullable
  public String getLegalNumber() {
    return legalNumber;
  }


  public void setLegalNumber(String legalNumber) {
    this.legalNumber = legalNumber;
  }


  public CustomerCreateInputCustomer logoUrl(String logoUrl) {
    
    this.logoUrl = logoUrl;
    return this;
  }

   /**
   * The logo URL of the customer
   * @return logoUrl
  **/
  @javax.annotation.Nullable
  public String getLogoUrl() {
    return logoUrl;
  }


  public void setLogoUrl(String logoUrl) {
    this.logoUrl = logoUrl;
  }


  public CustomerCreateInputCustomer name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The full name of the customer
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public CustomerCreateInputCustomer phone(String phone) {
    
    this.phone = phone;
    return this;
  }

   /**
   * The phone number of the customer
   * @return phone
  **/
  @javax.annotation.Nullable
  public String getPhone() {
    return phone;
  }


  public void setPhone(String phone) {
    this.phone = phone;
  }


  public CustomerCreateInputCustomer state(String state) {
    
    this.state = state;
    return this;
  }

   /**
   * The state of the customer&#39;s billing address
   * @return state
  **/
  @javax.annotation.Nullable
  public String getState() {
    return state;
  }


  public void setState(String state) {
    this.state = state;
  }


  public CustomerCreateInputCustomer taxCodes(List<String> taxCodes) {
    
    this.taxCodes = taxCodes;
    return this;
  }

  public CustomerCreateInputCustomer addTaxCodesItem(String taxCodesItem) {
    if (this.taxCodes == null) {
      this.taxCodes = new ArrayList<>();
    }
    this.taxCodes.add(taxCodesItem);
    return this;
  }

   /**
   * List of unique code used to identify the taxes.
   * @return taxCodes
  **/
  @javax.annotation.Nullable
  public List<String> getTaxCodes() {
    return taxCodes;
  }


  public void setTaxCodes(List<String> taxCodes) {
    this.taxCodes = taxCodes;
  }


  public CustomerCreateInputCustomer taxIdentificationNumber(String taxIdentificationNumber) {
    
    this.taxIdentificationNumber = taxIdentificationNumber;
    return this;
  }

   /**
   * The tax identification number of the customer
   * @return taxIdentificationNumber
  **/
  @javax.annotation.Nullable
  public String getTaxIdentificationNumber() {
    return taxIdentificationNumber;
  }


  public void setTaxIdentificationNumber(String taxIdentificationNumber) {
    this.taxIdentificationNumber = taxIdentificationNumber;
  }


  public CustomerCreateInputCustomer timezone(Timezone timezone) {
    
    this.timezone = timezone;
    return this;
  }

   /**
   * Get timezone
   * @return timezone
  **/
  @javax.annotation.Nullable
  public Timezone getTimezone() {
    return timezone;
  }


  public void setTimezone(Timezone timezone) {
    this.timezone = timezone;
  }


  public CustomerCreateInputCustomer url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * The custom website URL of the customer
   * @return url
  **/
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public CustomerCreateInputCustomer zipcode(String zipcode) {
    
    this.zipcode = zipcode;
    return this;
  }

   /**
   * The zipcode of the customer&#39;s billing address
   * @return zipcode
  **/
  @javax.annotation.Nullable
  public String getZipcode() {
    return zipcode;
  }


  public void setZipcode(String zipcode) {
    this.zipcode = zipcode;
  }


  public CustomerCreateInputCustomer netPaymentTerm(Integer netPaymentTerm) {
    
    this.netPaymentTerm = netPaymentTerm;
    return this;
  }

   /**
   * The net payment term, expressed in days, specifies the duration within which a customer is expected to remit payment after the invoice is finalized.
   * @return netPaymentTerm
  **/
  @javax.annotation.Nullable
  public Integer getNetPaymentTerm() {
    return netPaymentTerm;
  }


  public void setNetPaymentTerm(Integer netPaymentTerm) {
    this.netPaymentTerm = netPaymentTerm;
  }


  public CustomerCreateInputCustomer billingConfiguration(CustomerBillingConfiguration billingConfiguration) {
    
    this.billingConfiguration = billingConfiguration;
    return this;
  }

   /**
   * Get billingConfiguration
   * @return billingConfiguration
  **/
  @javax.annotation.Nullable
  public CustomerBillingConfiguration getBillingConfiguration() {
    return billingConfiguration;
  }


  public void setBillingConfiguration(CustomerBillingConfiguration billingConfiguration) {
    this.billingConfiguration = billingConfiguration;
  }


  public CustomerCreateInputCustomer metadata(List<CustomerCreateInputCustomerMetadataInner> metadata) {
    
    this.metadata = metadata;
    return this;
  }

  public CustomerCreateInputCustomer addMetadataItem(CustomerCreateInputCustomerMetadataInner metadataItem) {
    if (this.metadata == null) {
      this.metadata = new ArrayList<>();
    }
    this.metadata.add(metadataItem);
    return this;
  }

   /**
   * Set of key-value pairs that you can attach to a customer. This can be useful for storing additional information about the customer in a structured format
   * @return metadata
  **/
  @javax.annotation.Nullable
  public List<CustomerCreateInputCustomerMetadataInner> getMetadata() {
    return metadata;
  }


  public void setMetadata(List<CustomerCreateInputCustomerMetadataInner> metadata) {
    this.metadata = metadata;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerCreateInputCustomer customerCreateInputCustomer = (CustomerCreateInputCustomer) o;
    return Objects.equals(this.externalId, customerCreateInputCustomer.externalId) &&
        Objects.equals(this.addressLine1, customerCreateInputCustomer.addressLine1) &&
        Objects.equals(this.addressLine2, customerCreateInputCustomer.addressLine2) &&
        Objects.equals(this.city, customerCreateInputCustomer.city) &&
        Objects.equals(this.country, customerCreateInputCustomer.country) &&
        Objects.equals(this.currency, customerCreateInputCustomer.currency) &&
        Objects.equals(this.email, customerCreateInputCustomer.email) &&
        Objects.equals(this.legalName, customerCreateInputCustomer.legalName) &&
        Objects.equals(this.legalNumber, customerCreateInputCustomer.legalNumber) &&
        Objects.equals(this.logoUrl, customerCreateInputCustomer.logoUrl) &&
        Objects.equals(this.name, customerCreateInputCustomer.name) &&
        Objects.equals(this.phone, customerCreateInputCustomer.phone) &&
        Objects.equals(this.state, customerCreateInputCustomer.state) &&
        Objects.equals(this.taxCodes, customerCreateInputCustomer.taxCodes) &&
        Objects.equals(this.taxIdentificationNumber, customerCreateInputCustomer.taxIdentificationNumber) &&
        Objects.equals(this.timezone, customerCreateInputCustomer.timezone) &&
        Objects.equals(this.url, customerCreateInputCustomer.url) &&
        Objects.equals(this.zipcode, customerCreateInputCustomer.zipcode) &&
        Objects.equals(this.netPaymentTerm, customerCreateInputCustomer.netPaymentTerm) &&
        Objects.equals(this.billingConfiguration, customerCreateInputCustomer.billingConfiguration) &&
        Objects.equals(this.metadata, customerCreateInputCustomer.metadata);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalId, addressLine1, addressLine2, city, country, currency, email, legalName, legalNumber, logoUrl, name, phone, state, taxCodes, taxIdentificationNumber, timezone, url, zipcode, netPaymentTerm, billingConfiguration, metadata);
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
    sb.append("class CustomerCreateInputCustomer {\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    addressLine1: ").append(toIndentedString(addressLine1)).append("\n");
    sb.append("    addressLine2: ").append(toIndentedString(addressLine2)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    legalName: ").append(toIndentedString(legalName)).append("\n");
    sb.append("    legalNumber: ").append(toIndentedString(legalNumber)).append("\n");
    sb.append("    logoUrl: ").append(toIndentedString(logoUrl)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    taxCodes: ").append(toIndentedString(taxCodes)).append("\n");
    sb.append("    taxIdentificationNumber: ").append(toIndentedString(taxIdentificationNumber)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    zipcode: ").append(toIndentedString(zipcode)).append("\n");
    sb.append("    netPaymentTerm: ").append(toIndentedString(netPaymentTerm)).append("\n");
    sb.append("    billingConfiguration: ").append(toIndentedString(billingConfiguration)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
    openapiFields.add("external_id");
    openapiFields.add("address_line1");
    openapiFields.add("address_line2");
    openapiFields.add("city");
    openapiFields.add("country");
    openapiFields.add("currency");
    openapiFields.add("email");
    openapiFields.add("legal_name");
    openapiFields.add("legal_number");
    openapiFields.add("logo_url");
    openapiFields.add("name");
    openapiFields.add("phone");
    openapiFields.add("state");
    openapiFields.add("tax_codes");
    openapiFields.add("tax_identification_number");
    openapiFields.add("timezone");
    openapiFields.add("url");
    openapiFields.add("zipcode");
    openapiFields.add("net_payment_term");
    openapiFields.add("billing_configuration");
    openapiFields.add("metadata");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("external_id");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CustomerCreateInputCustomer
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CustomerCreateInputCustomer.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CustomerCreateInputCustomer is not found in the empty JSON string", CustomerCreateInputCustomer.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CustomerCreateInputCustomer.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CustomerCreateInputCustomer` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CustomerCreateInputCustomer.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("external_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `external_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("external_id").toString()));
      }
      if ((jsonObj.get("address_line1") != null && !jsonObj.get("address_line1").isJsonNull()) && !jsonObj.get("address_line1").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address_line1` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address_line1").toString()));
      }
      if ((jsonObj.get("address_line2") != null && !jsonObj.get("address_line2").isJsonNull()) && !jsonObj.get("address_line2").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address_line2` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address_line2").toString()));
      }
      if ((jsonObj.get("city") != null && !jsonObj.get("city").isJsonNull()) && !jsonObj.get("city").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `city` to be a primitive type in the JSON string but got `%s`", jsonObj.get("city").toString()));
      }
      // validate the optional field `country`
      if (jsonObj.get("country") != null && !jsonObj.get("country").isJsonNull()) {
        Country.validateJsonElement(jsonObj.get("country"));
      }
      // validate the optional field `currency`
      if (jsonObj.get("currency") != null && !jsonObj.get("currency").isJsonNull()) {
        Currency.validateJsonElement(jsonObj.get("currency"));
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("legal_name") != null && !jsonObj.get("legal_name").isJsonNull()) && !jsonObj.get("legal_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `legal_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("legal_name").toString()));
      }
      if ((jsonObj.get("legal_number") != null && !jsonObj.get("legal_number").isJsonNull()) && !jsonObj.get("legal_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `legal_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("legal_number").toString()));
      }
      if ((jsonObj.get("logo_url") != null && !jsonObj.get("logo_url").isJsonNull()) && !jsonObj.get("logo_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `logo_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("logo_url").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("phone") != null && !jsonObj.get("phone").isJsonNull()) && !jsonObj.get("phone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phone").toString()));
      }
      if ((jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) && !jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("tax_codes") != null && !jsonObj.get("tax_codes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tax_codes` to be an array in the JSON string but got `%s`", jsonObj.get("tax_codes").toString()));
      }
      if ((jsonObj.get("tax_identification_number") != null && !jsonObj.get("tax_identification_number").isJsonNull()) && !jsonObj.get("tax_identification_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tax_identification_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tax_identification_number").toString()));
      }
      // validate the optional field `timezone`
      if (jsonObj.get("timezone") != null && !jsonObj.get("timezone").isJsonNull()) {
        Timezone.validateJsonElement(jsonObj.get("timezone"));
      }
      if ((jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull()) && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      if ((jsonObj.get("zipcode") != null && !jsonObj.get("zipcode").isJsonNull()) && !jsonObj.get("zipcode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `zipcode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("zipcode").toString()));
      }
      // validate the optional field `billing_configuration`
      if (jsonObj.get("billing_configuration") != null && !jsonObj.get("billing_configuration").isJsonNull()) {
        CustomerBillingConfiguration.validateJsonElement(jsonObj.get("billing_configuration"));
      }
      if (jsonObj.get("metadata") != null && !jsonObj.get("metadata").isJsonNull()) {
        JsonArray jsonArraymetadata = jsonObj.getAsJsonArray("metadata");
        if (jsonArraymetadata != null) {
          // ensure the json data is an array
          if (!jsonObj.get("metadata").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `metadata` to be an array in the JSON string but got `%s`", jsonObj.get("metadata").toString()));
          }

          // validate the optional field `metadata` (array)
          for (int i = 0; i < jsonArraymetadata.size(); i++) {
            CustomerCreateInputCustomerMetadataInner.validateJsonElement(jsonArraymetadata.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CustomerCreateInputCustomer.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CustomerCreateInputCustomer' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CustomerCreateInputCustomer> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CustomerCreateInputCustomer.class));

       return (TypeAdapter<T>) new TypeAdapter<CustomerCreateInputCustomer>() {
           @Override
           public void write(JsonWriter out, CustomerCreateInputCustomer value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CustomerCreateInputCustomer read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CustomerCreateInputCustomer given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CustomerCreateInputCustomer
  * @throws IOException if the JSON string is invalid with respect to CustomerCreateInputCustomer
  */
  public static CustomerCreateInputCustomer fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CustomerCreateInputCustomer.class);
  }

 /**
  * Convert an instance of CustomerCreateInputCustomer to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
