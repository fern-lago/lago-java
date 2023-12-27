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
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Object that represents rule for wallet recurring transactions.
 */
@JsonPropertyOrder({
  WalletUpdateInputWalletRecurringTransactionRulesInner.JSON_PROPERTY_LAGO_ID,
  WalletUpdateInputWalletRecurringTransactionRulesInner.JSON_PROPERTY_RULE_TYPE,
  WalletUpdateInputWalletRecurringTransactionRulesInner.JSON_PROPERTY_INTERVAL,
  WalletUpdateInputWalletRecurringTransactionRulesInner.JSON_PROPERTY_THRESHOLD_CREDITS,
  WalletUpdateInputWalletRecurringTransactionRulesInner.JSON_PROPERTY_PAID_CREDITS,
  WalletUpdateInputWalletRecurringTransactionRulesInner.JSON_PROPERTY_GRANTED_CREDITS
})
@JsonTypeName("WalletUpdateInput_wallet_recurring_transaction_rules_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-27T14:12:55.372025191Z[Etc/UTC]")
public class WalletUpdateInputWalletRecurringTransactionRulesInner {
  public static final String JSON_PROPERTY_LAGO_ID = "lago_id";
  private UUID lagoId;

  /**
   * The rule type. Possible values are &#x60;interval&#x60; or &#x60;threshold&#x60;.
   */
  public enum RuleTypeEnum {
    INTERVAL("interval"),
    
    THRESHOLD("threshold");

    private String value;

    RuleTypeEnum(String value) {
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
    public static RuleTypeEnum fromValue(String value) {
      for (RuleTypeEnum b : RuleTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_RULE_TYPE = "rule_type";
  private RuleTypeEnum ruleType;

  /**
   * The interval used for recurring top-up. It represents the frequency at which automatic top-up occurs. The interval can be one of the following values: &#x60;weekly&#x60;, &#x60;monthly&#x60;, &#x60;quarterly&#x60; or &#x60;yearly&#x60;. Required only when rule type is set to &#x60;interval&#x60;.
   */
  public enum IntervalEnum {
    WEEKLY("weekly"),
    
    MONTHLY("monthly"),
    
    QUARTERLY("quarterly"),
    
    YEARLY("yearly");

    private String value;

    IntervalEnum(String value) {
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
    public static IntervalEnum fromValue(String value) {
      for (IntervalEnum b : IntervalEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_INTERVAL = "interval";
  private IntervalEnum interval;

  public static final String JSON_PROPERTY_THRESHOLD_CREDITS = "threshold_credits";
  private String thresholdCredits;

  public static final String JSON_PROPERTY_PAID_CREDITS = "paid_credits";
  private String paidCredits;

  public static final String JSON_PROPERTY_GRANTED_CREDITS = "granted_credits";
  private String grantedCredits;

  public WalletUpdateInputWalletRecurringTransactionRulesInner() {
  }

  public WalletUpdateInputWalletRecurringTransactionRulesInner lagoId(UUID lagoId) {
    
    this.lagoId = lagoId;
    return this;
  }

   /**
   * A unique identifier for the recurring transaction rule in the Lago application. Can be used to update a recurring transaction rule.
   * @return lagoId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAGO_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getLagoId() {
    return lagoId;
  }


  @JsonProperty(JSON_PROPERTY_LAGO_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLagoId(UUID lagoId) {
    this.lagoId = lagoId;
  }


  public WalletUpdateInputWalletRecurringTransactionRulesInner ruleType(RuleTypeEnum ruleType) {
    
    this.ruleType = ruleType;
    return this;
  }

   /**
   * The rule type. Possible values are &#x60;interval&#x60; or &#x60;threshold&#x60;.
   * @return ruleType
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RULE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RuleTypeEnum getRuleType() {
    return ruleType;
  }


  @JsonProperty(JSON_PROPERTY_RULE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRuleType(RuleTypeEnum ruleType) {
    this.ruleType = ruleType;
  }


  public WalletUpdateInputWalletRecurringTransactionRulesInner interval(IntervalEnum interval) {
    
    this.interval = interval;
    return this;
  }

   /**
   * The interval used for recurring top-up. It represents the frequency at which automatic top-up occurs. The interval can be one of the following values: &#x60;weekly&#x60;, &#x60;monthly&#x60;, &#x60;quarterly&#x60; or &#x60;yearly&#x60;. Required only when rule type is set to &#x60;interval&#x60;.
   * @return interval
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INTERVAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public IntervalEnum getInterval() {
    return interval;
  }


  @JsonProperty(JSON_PROPERTY_INTERVAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInterval(IntervalEnum interval) {
    this.interval = interval;
  }


  public WalletUpdateInputWalletRecurringTransactionRulesInner thresholdCredits(String thresholdCredits) {
    
    this.thresholdCredits = thresholdCredits;
    return this;
  }

   /**
   * The threshold for recurring top-ups is the value at which an automatic top-up is triggered. For example, if this threshold is set at 10 credits, an automatic top-up will occur whenever the wallet balance falls to or below 10 credits. Required only when rule type is set to &#x60;threshold&#x60;.
   * @return thresholdCredits
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_THRESHOLD_CREDITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getThresholdCredits() {
    return thresholdCredits;
  }


  @JsonProperty(JSON_PROPERTY_THRESHOLD_CREDITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setThresholdCredits(String thresholdCredits) {
    this.thresholdCredits = thresholdCredits;
  }


  public WalletUpdateInputWalletRecurringTransactionRulesInner paidCredits(String paidCredits) {
    
    this.paidCredits = paidCredits;
    return this;
  }

   /**
   * The number of paid credits. Required only if there is no granted credits.
   * @return paidCredits
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAID_CREDITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPaidCredits() {
    return paidCredits;
  }


  @JsonProperty(JSON_PROPERTY_PAID_CREDITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaidCredits(String paidCredits) {
    this.paidCredits = paidCredits;
  }


  public WalletUpdateInputWalletRecurringTransactionRulesInner grantedCredits(String grantedCredits) {
    
    this.grantedCredits = grantedCredits;
    return this;
  }

   /**
   * The number of free granted credits. Required only if there is no paid credits.
   * @return grantedCredits
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GRANTED_CREDITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGrantedCredits() {
    return grantedCredits;
  }


  @JsonProperty(JSON_PROPERTY_GRANTED_CREDITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGrantedCredits(String grantedCredits) {
    this.grantedCredits = grantedCredits;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WalletUpdateInputWalletRecurringTransactionRulesInner walletUpdateInputWalletRecurringTransactionRulesInner = (WalletUpdateInputWalletRecurringTransactionRulesInner) o;
    return Objects.equals(this.lagoId, walletUpdateInputWalletRecurringTransactionRulesInner.lagoId) &&
        Objects.equals(this.ruleType, walletUpdateInputWalletRecurringTransactionRulesInner.ruleType) &&
        Objects.equals(this.interval, walletUpdateInputWalletRecurringTransactionRulesInner.interval) &&
        Objects.equals(this.thresholdCredits, walletUpdateInputWalletRecurringTransactionRulesInner.thresholdCredits) &&
        Objects.equals(this.paidCredits, walletUpdateInputWalletRecurringTransactionRulesInner.paidCredits) &&
        Objects.equals(this.grantedCredits, walletUpdateInputWalletRecurringTransactionRulesInner.grantedCredits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lagoId, ruleType, interval, thresholdCredits, paidCredits, grantedCredits);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WalletUpdateInputWalletRecurringTransactionRulesInner {\n");
    sb.append("    lagoId: ").append(toIndentedString(lagoId)).append("\n");
    sb.append("    ruleType: ").append(toIndentedString(ruleType)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    thresholdCredits: ").append(toIndentedString(thresholdCredits)).append("\n");
    sb.append("    paidCredits: ").append(toIndentedString(paidCredits)).append("\n");
    sb.append("    grantedCredits: ").append(toIndentedString(grantedCredits)).append("\n");
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
