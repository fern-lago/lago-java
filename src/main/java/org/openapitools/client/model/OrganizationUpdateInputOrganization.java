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
import org.openapitools.client.model.Country;
import org.openapitools.client.model.Currency;
import org.openapitools.client.model.OrganizationBillingConfiguration;
import org.openapitools.client.model.Timezone;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * OrganizationUpdateInputOrganization
 */
@JsonPropertyOrder({
  OrganizationUpdateInputOrganization.JSON_PROPERTY_WEBHOOK_URL,
  OrganizationUpdateInputOrganization.JSON_PROPERTY_COUNTRY,
  OrganizationUpdateInputOrganization.JSON_PROPERTY_DEFAULT_CURRENCY,
  OrganizationUpdateInputOrganization.JSON_PROPERTY_ADDRESS_LINE1,
  OrganizationUpdateInputOrganization.JSON_PROPERTY_ADDRESS_LINE2,
  OrganizationUpdateInputOrganization.JSON_PROPERTY_STATE,
  OrganizationUpdateInputOrganization.JSON_PROPERTY_ZIPCODE,
  OrganizationUpdateInputOrganization.JSON_PROPERTY_EMAIL,
  OrganizationUpdateInputOrganization.JSON_PROPERTY_CITY,
  OrganizationUpdateInputOrganization.JSON_PROPERTY_LEGAL_NAME,
  OrganizationUpdateInputOrganization.JSON_PROPERTY_LEGAL_NUMBER,
  OrganizationUpdateInputOrganization.JSON_PROPERTY_NET_PAYMENT_TERM,
  OrganizationUpdateInputOrganization.JSON_PROPERTY_TAX_IDENTIFICATION_NUMBER,
  OrganizationUpdateInputOrganization.JSON_PROPERTY_TIMEZONE,
  OrganizationUpdateInputOrganization.JSON_PROPERTY_EMAIL_SETTINGS,
  OrganizationUpdateInputOrganization.JSON_PROPERTY_BILLING_CONFIGURATION
})
@JsonTypeName("OrganizationUpdateInput_organization")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-07T15:52:17.625211Z[Etc/UTC]")
public class OrganizationUpdateInputOrganization {
  public static final String JSON_PROPERTY_WEBHOOK_URL = "webhook_url";
  private JsonNullable<String> webhookUrl = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_COUNTRY = "country";
  private Country country;

  public static final String JSON_PROPERTY_DEFAULT_CURRENCY = "default_currency";
  private Currency defaultCurrency;

  public static final String JSON_PROPERTY_ADDRESS_LINE1 = "address_line1";
  private JsonNullable<String> addressLine1 = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ADDRESS_LINE2 = "address_line2";
  private JsonNullable<String> addressLine2 = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_STATE = "state";
  private JsonNullable<String> state = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ZIPCODE = "zipcode";
  private JsonNullable<String> zipcode = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_EMAIL = "email";
  private JsonNullable<String> email = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CITY = "city";
  private JsonNullable<String> city = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_LEGAL_NAME = "legal_name";
  private JsonNullable<String> legalName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_LEGAL_NUMBER = "legal_number";
  private JsonNullable<String> legalNumber = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_NET_PAYMENT_TERM = "net_payment_term";
  private Integer netPaymentTerm;

  public static final String JSON_PROPERTY_TAX_IDENTIFICATION_NUMBER = "tax_identification_number";
  private JsonNullable<String> taxIdentificationNumber = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TIMEZONE = "timezone";
  private Timezone timezone;

  /**
   * Gets or Sets emailSettings
   */
  public enum EmailSettingsEnum {
    INVOICE_FINALIZED("invoice.finalized"),
    
    CREDIT_NOTE_CREATED("credit_note.created");

    private String value;

    EmailSettingsEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static EmailSettingsEnum fromValue(String value) {
      for (EmailSettingsEnum b : EmailSettingsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_EMAIL_SETTINGS = "email_settings";
  private List<EmailSettingsEnum> emailSettings;

  public static final String JSON_PROPERTY_BILLING_CONFIGURATION = "billing_configuration";
  private OrganizationBillingConfiguration billingConfiguration;

  public OrganizationUpdateInputOrganization() {
  }

  public OrganizationUpdateInputOrganization webhookUrl(String webhookUrl) {
    this.webhookUrl = JsonNullable.<String>of(webhookUrl);
    
    return this;
  }

   /**
   * The URL of your newest updated webhook endpoint. This URL allows your organization to receive important messages, notifications, or data from the Lago system. By configuring your webhook endpoint to this URL, you can ensure that your organization stays informed and receives relevant information in a timely manner.
   * @return webhookUrl
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getWebhookUrl() {
        return webhookUrl.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_WEBHOOK_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getWebhookUrl_JsonNullable() {
    return webhookUrl;
  }
  
  @JsonProperty(JSON_PROPERTY_WEBHOOK_URL)
  public void setWebhookUrl_JsonNullable(JsonNullable<String> webhookUrl) {
    this.webhookUrl = webhookUrl;
  }

  public void setWebhookUrl(String webhookUrl) {
    this.webhookUrl = JsonNullable.<String>of(webhookUrl);
  }


  public OrganizationUpdateInputOrganization country(Country country) {
    
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Country getCountry() {
    return country;
  }


  @JsonProperty(JSON_PROPERTY_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCountry(Country country) {
    this.country = country;
  }


  public OrganizationUpdateInputOrganization defaultCurrency(Currency defaultCurrency) {
    
    this.defaultCurrency = defaultCurrency;
    return this;
  }

   /**
   * Get defaultCurrency
   * @return defaultCurrency
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEFAULT_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Currency getDefaultCurrency() {
    return defaultCurrency;
  }


  @JsonProperty(JSON_PROPERTY_DEFAULT_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDefaultCurrency(Currency defaultCurrency) {
    this.defaultCurrency = defaultCurrency;
  }


  public OrganizationUpdateInputOrganization addressLine1(String addressLine1) {
    this.addressLine1 = JsonNullable.<String>of(addressLine1);
    
    return this;
  }

   /**
   * The first line of your organization’s billing address.
   * @return addressLine1
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getAddressLine1() {
        return addressLine1.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ADDRESS_LINE1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getAddressLine1_JsonNullable() {
    return addressLine1;
  }
  
  @JsonProperty(JSON_PROPERTY_ADDRESS_LINE1)
  public void setAddressLine1_JsonNullable(JsonNullable<String> addressLine1) {
    this.addressLine1 = addressLine1;
  }

  public void setAddressLine1(String addressLine1) {
    this.addressLine1 = JsonNullable.<String>of(addressLine1);
  }


  public OrganizationUpdateInputOrganization addressLine2(String addressLine2) {
    this.addressLine2 = JsonNullable.<String>of(addressLine2);
    
    return this;
  }

   /**
   * The second line of your organization’s billing address.
   * @return addressLine2
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getAddressLine2() {
        return addressLine2.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ADDRESS_LINE2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getAddressLine2_JsonNullable() {
    return addressLine2;
  }
  
  @JsonProperty(JSON_PROPERTY_ADDRESS_LINE2)
  public void setAddressLine2_JsonNullable(JsonNullable<String> addressLine2) {
    this.addressLine2 = addressLine2;
  }

  public void setAddressLine2(String addressLine2) {
    this.addressLine2 = JsonNullable.<String>of(addressLine2);
  }


  public OrganizationUpdateInputOrganization state(String state) {
    this.state = JsonNullable.<String>of(state);
    
    return this;
  }

   /**
   * The state of your organization’s billing address.
   * @return state
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getState() {
        return state.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getState_JsonNullable() {
    return state;
  }
  
  @JsonProperty(JSON_PROPERTY_STATE)
  public void setState_JsonNullable(JsonNullable<String> state) {
    this.state = state;
  }

  public void setState(String state) {
    this.state = JsonNullable.<String>of(state);
  }


  public OrganizationUpdateInputOrganization zipcode(String zipcode) {
    this.zipcode = JsonNullable.<String>of(zipcode);
    
    return this;
  }

   /**
   * The zipcode of your organization’s billing address.
   * @return zipcode
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getZipcode() {
        return zipcode.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ZIPCODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getZipcode_JsonNullable() {
    return zipcode;
  }
  
  @JsonProperty(JSON_PROPERTY_ZIPCODE)
  public void setZipcode_JsonNullable(JsonNullable<String> zipcode) {
    this.zipcode = zipcode;
  }

  public void setZipcode(String zipcode) {
    this.zipcode = JsonNullable.<String>of(zipcode);
  }


  public OrganizationUpdateInputOrganization email(String email) {
    this.email = JsonNullable.<String>of(email);
    
    return this;
  }

   /**
   * The email address of your organization used to bill your customers.
   * @return email
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getEmail() {
        return email.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getEmail_JsonNullable() {
    return email;
  }
  
  @JsonProperty(JSON_PROPERTY_EMAIL)
  public void setEmail_JsonNullable(JsonNullable<String> email) {
    this.email = email;
  }

  public void setEmail(String email) {
    this.email = JsonNullable.<String>of(email);
  }


  public OrganizationUpdateInputOrganization city(String city) {
    this.city = JsonNullable.<String>of(city);
    
    return this;
  }

   /**
   * The city of your organization’s billing address.
   * @return city
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getCity() {
        return city.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCity_JsonNullable() {
    return city;
  }
  
  @JsonProperty(JSON_PROPERTY_CITY)
  public void setCity_JsonNullable(JsonNullable<String> city) {
    this.city = city;
  }

  public void setCity(String city) {
    this.city = JsonNullable.<String>of(city);
  }


  public OrganizationUpdateInputOrganization legalName(String legalName) {
    this.legalName = JsonNullable.<String>of(legalName);
    
    return this;
  }

   /**
   * The legal name of your organization.
   * @return legalName
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getLegalName() {
        return legalName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LEGAL_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getLegalName_JsonNullable() {
    return legalName;
  }
  
  @JsonProperty(JSON_PROPERTY_LEGAL_NAME)
  public void setLegalName_JsonNullable(JsonNullable<String> legalName) {
    this.legalName = legalName;
  }

  public void setLegalName(String legalName) {
    this.legalName = JsonNullable.<String>of(legalName);
  }


  public OrganizationUpdateInputOrganization legalNumber(String legalNumber) {
    this.legalNumber = JsonNullable.<String>of(legalNumber);
    
    return this;
  }

   /**
   * The legal number of your organization.
   * @return legalNumber
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getLegalNumber() {
        return legalNumber.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LEGAL_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getLegalNumber_JsonNullable() {
    return legalNumber;
  }
  
  @JsonProperty(JSON_PROPERTY_LEGAL_NUMBER)
  public void setLegalNumber_JsonNullable(JsonNullable<String> legalNumber) {
    this.legalNumber = legalNumber;
  }

  public void setLegalNumber(String legalNumber) {
    this.legalNumber = JsonNullable.<String>of(legalNumber);
  }


  public OrganizationUpdateInputOrganization netPaymentTerm(Integer netPaymentTerm) {
    
    this.netPaymentTerm = netPaymentTerm;
    return this;
  }

   /**
   * The net payment term, expressed in days, specifies the duration within which a customer is expected to remit payment after the invoice is finalized.
   * @return netPaymentTerm
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NET_PAYMENT_TERM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNetPaymentTerm() {
    return netPaymentTerm;
  }


  @JsonProperty(JSON_PROPERTY_NET_PAYMENT_TERM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNetPaymentTerm(Integer netPaymentTerm) {
    this.netPaymentTerm = netPaymentTerm;
  }


  public OrganizationUpdateInputOrganization taxIdentificationNumber(String taxIdentificationNumber) {
    this.taxIdentificationNumber = JsonNullable.<String>of(taxIdentificationNumber);
    
    return this;
  }

   /**
   * The tax identification number of your organization.
   * @return taxIdentificationNumber
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getTaxIdentificationNumber() {
        return taxIdentificationNumber.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TAX_IDENTIFICATION_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getTaxIdentificationNumber_JsonNullable() {
    return taxIdentificationNumber;
  }
  
  @JsonProperty(JSON_PROPERTY_TAX_IDENTIFICATION_NUMBER)
  public void setTaxIdentificationNumber_JsonNullable(JsonNullable<String> taxIdentificationNumber) {
    this.taxIdentificationNumber = taxIdentificationNumber;
  }

  public void setTaxIdentificationNumber(String taxIdentificationNumber) {
    this.taxIdentificationNumber = JsonNullable.<String>of(taxIdentificationNumber);
  }


  public OrganizationUpdateInputOrganization timezone(Timezone timezone) {
    
    this.timezone = timezone;
    return this;
  }

   /**
   * Get timezone
   * @return timezone
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIMEZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Timezone getTimezone() {
    return timezone;
  }


  @JsonProperty(JSON_PROPERTY_TIMEZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimezone(Timezone timezone) {
    this.timezone = timezone;
  }


  public OrganizationUpdateInputOrganization emailSettings(List<EmailSettingsEnum> emailSettings) {
    
    this.emailSettings = emailSettings;
    return this;
  }

  public OrganizationUpdateInputOrganization addEmailSettingsItem(EmailSettingsEnum emailSettingsItem) {
    if (this.emailSettings == null) {
      this.emailSettings = new ArrayList<>();
    }
    this.emailSettings.add(emailSettingsItem);
    return this;
  }

   /**
   * Represents the email settings of the organization. It allows you to define which documents are sent by email. The field value determines the types of documents that trigger email notifications. Possible values for are &#x60;invoice.finalized&#x60; and &#x60;credit_note.created&#x60;. By configuring this field, you can specify whether invoices, credit notes, or both should be sent to recipients via email.
   * @return emailSettings
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMAIL_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<EmailSettingsEnum> getEmailSettings() {
    return emailSettings;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmailSettings(List<EmailSettingsEnum> emailSettings) {
    this.emailSettings = emailSettings;
  }


  public OrganizationUpdateInputOrganization billingConfiguration(OrganizationBillingConfiguration billingConfiguration) {
    
    this.billingConfiguration = billingConfiguration;
    return this;
  }

   /**
   * Get billingConfiguration
   * @return billingConfiguration
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BILLING_CONFIGURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OrganizationBillingConfiguration getBillingConfiguration() {
    return billingConfiguration;
  }


  @JsonProperty(JSON_PROPERTY_BILLING_CONFIGURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBillingConfiguration(OrganizationBillingConfiguration billingConfiguration) {
    this.billingConfiguration = billingConfiguration;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationUpdateInputOrganization organizationUpdateInputOrganization = (OrganizationUpdateInputOrganization) o;
    return equalsNullable(this.webhookUrl, organizationUpdateInputOrganization.webhookUrl) &&
        Objects.equals(this.country, organizationUpdateInputOrganization.country) &&
        Objects.equals(this.defaultCurrency, organizationUpdateInputOrganization.defaultCurrency) &&
        equalsNullable(this.addressLine1, organizationUpdateInputOrganization.addressLine1) &&
        equalsNullable(this.addressLine2, organizationUpdateInputOrganization.addressLine2) &&
        equalsNullable(this.state, organizationUpdateInputOrganization.state) &&
        equalsNullable(this.zipcode, organizationUpdateInputOrganization.zipcode) &&
        equalsNullable(this.email, organizationUpdateInputOrganization.email) &&
        equalsNullable(this.city, organizationUpdateInputOrganization.city) &&
        equalsNullable(this.legalName, organizationUpdateInputOrganization.legalName) &&
        equalsNullable(this.legalNumber, organizationUpdateInputOrganization.legalNumber) &&
        Objects.equals(this.netPaymentTerm, organizationUpdateInputOrganization.netPaymentTerm) &&
        equalsNullable(this.taxIdentificationNumber, organizationUpdateInputOrganization.taxIdentificationNumber) &&
        Objects.equals(this.timezone, organizationUpdateInputOrganization.timezone) &&
        Objects.equals(this.emailSettings, organizationUpdateInputOrganization.emailSettings) &&
        Objects.equals(this.billingConfiguration, organizationUpdateInputOrganization.billingConfiguration);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(webhookUrl), country, defaultCurrency, hashCodeNullable(addressLine1), hashCodeNullable(addressLine2), hashCodeNullable(state), hashCodeNullable(zipcode), hashCodeNullable(email), hashCodeNullable(city), hashCodeNullable(legalName), hashCodeNullable(legalNumber), netPaymentTerm, hashCodeNullable(taxIdentificationNumber), timezone, emailSettings, billingConfiguration);
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
    sb.append("class OrganizationUpdateInputOrganization {\n");
    sb.append("    webhookUrl: ").append(toIndentedString(webhookUrl)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    defaultCurrency: ").append(toIndentedString(defaultCurrency)).append("\n");
    sb.append("    addressLine1: ").append(toIndentedString(addressLine1)).append("\n");
    sb.append("    addressLine2: ").append(toIndentedString(addressLine2)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    zipcode: ").append(toIndentedString(zipcode)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    legalName: ").append(toIndentedString(legalName)).append("\n");
    sb.append("    legalNumber: ").append(toIndentedString(legalNumber)).append("\n");
    sb.append("    netPaymentTerm: ").append(toIndentedString(netPaymentTerm)).append("\n");
    sb.append("    taxIdentificationNumber: ").append(toIndentedString(taxIdentificationNumber)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    emailSettings: ").append(toIndentedString(emailSettings)).append("\n");
    sb.append("    billingConfiguration: ").append(toIndentedString(billingConfiguration)).append("\n");
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

