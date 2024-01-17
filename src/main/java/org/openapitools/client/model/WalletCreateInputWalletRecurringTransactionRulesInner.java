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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Object that represents rule for wallet recurring transactions.
 */
@JsonPropertyOrder({
  WalletCreateInputWalletRecurringTransactionRulesInner.JSON_PROPERTY_RULE_TYPE,
  WalletCreateInputWalletRecurringTransactionRulesInner.JSON_PROPERTY_INTERVAL,
  WalletCreateInputWalletRecurringTransactionRulesInner.JSON_PROPERTY_THRESHOLD_CREDITS
})
@JsonTypeName("WalletCreateInput_wallet_recurring_transaction_rules_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-27T14:12:55.372025191Z[Etc/UTC]")
public class WalletCreateInputWalletRecurringTransactionRulesInner {
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
   * The interval used for recurring top-up. It represents the frequency at which automatic top-up occurs. The interval can be one of the following values: &#x60;weekly&#x60;, &#x60;monthly&#x60;, &#x60;quarterly&#x60; or &#x60;yearly&#x60;. Required only when rule type is &#x60;interval&#x60;.
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

  public WalletCreateInputWalletRecurringTransactionRulesInner() {
  }

  public WalletCreateInputWalletRecurringTransactionRulesInner ruleType(RuleTypeEnum ruleType) {
    
    this.ruleType = ruleType;
    return this;
  }

   /**
   * The rule type. Possible values are &#x60;interval&#x60; or &#x60;threshold&#x60;.
   * @return ruleType
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_RULE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public RuleTypeEnum getRuleType() {
    return ruleType;
  }


  @JsonProperty(JSON_PROPERTY_RULE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRuleType(RuleTypeEnum ruleType) {
    this.ruleType = ruleType;
  }


  public WalletCreateInputWalletRecurringTransactionRulesInner interval(IntervalEnum interval) {
    
    this.interval = interval;
    return this;
  }

   /**
   * The interval used for recurring top-up. It represents the frequency at which automatic top-up occurs. The interval can be one of the following values: &#x60;weekly&#x60;, &#x60;monthly&#x60;, &#x60;quarterly&#x60; or &#x60;yearly&#x60;. Required only when rule type is &#x60;interval&#x60;.
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


  public WalletCreateInputWalletRecurringTransactionRulesInner thresholdCredits(String thresholdCredits) {
    
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WalletCreateInputWalletRecurringTransactionRulesInner walletCreateInputWalletRecurringTransactionRulesInner = (WalletCreateInputWalletRecurringTransactionRulesInner) o;
    return Objects.equals(this.ruleType, walletCreateInputWalletRecurringTransactionRulesInner.ruleType) &&
        Objects.equals(this.interval, walletCreateInputWalletRecurringTransactionRulesInner.interval) &&
        Objects.equals(this.thresholdCredits, walletCreateInputWalletRecurringTransactionRulesInner.thresholdCredits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ruleType, interval, thresholdCredits);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WalletCreateInputWalletRecurringTransactionRulesInner {\n");
    sb.append("    ruleType: ").append(toIndentedString(ruleType)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    thresholdCredits: ").append(toIndentedString(thresholdCredits)).append("\n");
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

