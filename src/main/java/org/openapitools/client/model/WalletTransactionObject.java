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
import java.time.OffsetDateTime;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * WalletTransactionObject
 */
@JsonPropertyOrder({
  WalletTransactionObject.JSON_PROPERTY_LAGO_ID,
  WalletTransactionObject.JSON_PROPERTY_LAGO_WALLET_ID,
  WalletTransactionObject.JSON_PROPERTY_STATUS,
  WalletTransactionObject.JSON_PROPERTY_TRANSACTION_TYPE,
  WalletTransactionObject.JSON_PROPERTY_AMOUNT,
  WalletTransactionObject.JSON_PROPERTY_CREDIT_AMOUNT,
  WalletTransactionObject.JSON_PROPERTY_SETTLED_AT,
  WalletTransactionObject.JSON_PROPERTY_CREATED_AT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-24T14:46:07.416771019Z[Etc/UTC]")
public class WalletTransactionObject {
  public static final String JSON_PROPERTY_LAGO_ID = "lago_id";
  private UUID lagoId;

  public static final String JSON_PROPERTY_LAGO_WALLET_ID = "lago_wallet_id";
  private UUID lagoWalletId;

  /**
   * The status of the wallet transaction. Possible values are &#x60;pending&#x60; or &#x60;settled&#x60;.
   */
  public enum StatusEnum {
    PENDING("pending"),
    
    SETTLED("settled");

    private String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_STATUS = "status";
  private StatusEnum status;

  /**
   * The type of transaction. Possible values are &#x60;inbound&#x60; (increasing the balance) or &#x60;outbound&#x60; (decreasing the balance).
   */
  public enum TransactionTypeEnum {
    INBOUND("inbound"),
    
    OUTBOUND("outbound");

    private String value;

    TransactionTypeEnum(String value) {
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
    public static TransactionTypeEnum fromValue(String value) {
      for (TransactionTypeEnum b : TransactionTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TRANSACTION_TYPE = "transaction_type";
  private TransactionTypeEnum transactionType;

  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private String amount;

  public static final String JSON_PROPERTY_CREDIT_AMOUNT = "credit_amount";
  private String creditAmount;

  public static final String JSON_PROPERTY_SETTLED_AT = "settled_at";
  private OffsetDateTime settledAt;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public WalletTransactionObject() {
  }

  public WalletTransactionObject lagoId(UUID lagoId) {
    
    this.lagoId = lagoId;
    return this;
  }

   /**
   * Unique identifier assigned to the wallet transaction within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the wallet transaction’s record within the Lago system.
   * @return lagoId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LAGO_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UUID getLagoId() {
    return lagoId;
  }


  @JsonProperty(JSON_PROPERTY_LAGO_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLagoId(UUID lagoId) {
    this.lagoId = lagoId;
  }


  public WalletTransactionObject lagoWalletId(UUID lagoWalletId) {
    
    this.lagoWalletId = lagoWalletId;
    return this;
  }

   /**
   * Unique identifier assigned to the wallet within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the wallet’s record within the Lago system.
   * @return lagoWalletId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LAGO_WALLET_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UUID getLagoWalletId() {
    return lagoWalletId;
  }


  @JsonProperty(JSON_PROPERTY_LAGO_WALLET_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLagoWalletId(UUID lagoWalletId) {
    this.lagoWalletId = lagoWalletId;
  }


  public WalletTransactionObject status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * The status of the wallet transaction. Possible values are &#x60;pending&#x60; or &#x60;settled&#x60;.
   * @return status
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public StatusEnum getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public WalletTransactionObject transactionType(TransactionTypeEnum transactionType) {
    
    this.transactionType = transactionType;
    return this;
  }

   /**
   * The type of transaction. Possible values are &#x60;inbound&#x60; (increasing the balance) or &#x60;outbound&#x60; (decreasing the balance).
   * @return transactionType
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TRANSACTION_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public TransactionTypeEnum getTransactionType() {
    return transactionType;
  }


  @JsonProperty(JSON_PROPERTY_TRANSACTION_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTransactionType(TransactionTypeEnum transactionType) {
    this.transactionType = transactionType;
  }


  public WalletTransactionObject amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * The amount of credits based on the rate and the currency.
   * @return amount
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAmount() {
    return amount;
  }


  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAmount(String amount) {
    this.amount = amount;
  }


  public WalletTransactionObject creditAmount(String creditAmount) {
    
    this.creditAmount = creditAmount;
    return this;
  }

   /**
   * The number of credits used in the wallet transaction.
   * @return creditAmount
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CREDIT_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCreditAmount() {
    return creditAmount;
  }


  @JsonProperty(JSON_PROPERTY_CREDIT_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCreditAmount(String creditAmount) {
    this.creditAmount = creditAmount;
  }


  public WalletTransactionObject settledAt(OffsetDateTime settledAt) {
    
    this.settledAt = settledAt;
    return this;
  }

   /**
   * The date when wallet transaction is settled, represented in ISO 8601 datetime format and expressed in Coordinated Universal Time (UTC).
   * @return settledAt
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SETTLED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getSettledAt() {
    return settledAt;
  }


  @JsonProperty(JSON_PROPERTY_SETTLED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSettledAt(OffsetDateTime settledAt) {
    this.settledAt = settledAt;
  }


  public WalletTransactionObject createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The date of the wallet transaction creation, represented in ISO 8601 datetime format and expressed in Coordinated Universal Time (UTC).
   * @return createdAt
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WalletTransactionObject walletTransactionObject = (WalletTransactionObject) o;
    return Objects.equals(this.lagoId, walletTransactionObject.lagoId) &&
        Objects.equals(this.lagoWalletId, walletTransactionObject.lagoWalletId) &&
        Objects.equals(this.status, walletTransactionObject.status) &&
        Objects.equals(this.transactionType, walletTransactionObject.transactionType) &&
        Objects.equals(this.amount, walletTransactionObject.amount) &&
        Objects.equals(this.creditAmount, walletTransactionObject.creditAmount) &&
        Objects.equals(this.settledAt, walletTransactionObject.settledAt) &&
        Objects.equals(this.createdAt, walletTransactionObject.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lagoId, lagoWalletId, status, transactionType, amount, creditAmount, settledAt, createdAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WalletTransactionObject {\n");
    sb.append("    lagoId: ").append(toIndentedString(lagoId)).append("\n");
    sb.append("    lagoWalletId: ").append(toIndentedString(lagoWalletId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    creditAmount: ").append(toIndentedString(creditAmount)).append("\n");
    sb.append("    settledAt: ").append(toIndentedString(settledAt)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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

