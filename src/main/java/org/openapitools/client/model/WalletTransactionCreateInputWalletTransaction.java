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
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * WalletTransactionCreateInputWalletTransaction
 */
@JsonPropertyOrder({
  WalletTransactionCreateInputWalletTransaction.JSON_PROPERTY_WALLET_ID,
  WalletTransactionCreateInputWalletTransaction.JSON_PROPERTY_PAID_CREDITS,
  WalletTransactionCreateInputWalletTransaction.JSON_PROPERTY_GRANTED_CREDITS
})
@JsonTypeName("WalletTransactionCreateInput_wallet_transaction")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-07T15:52:17.625211Z[Etc/UTC]")
public class WalletTransactionCreateInputWalletTransaction {
  public static final String JSON_PROPERTY_WALLET_ID = "wallet_id";
  private UUID walletId;

  public static final String JSON_PROPERTY_PAID_CREDITS = "paid_credits";
  private String paidCredits;

  public static final String JSON_PROPERTY_GRANTED_CREDITS = "granted_credits";
  private String grantedCredits;

  public WalletTransactionCreateInputWalletTransaction() {
  }

  public WalletTransactionCreateInputWalletTransaction walletId(UUID walletId) {
    
    this.walletId = walletId;
    return this;
  }

   /**
   * Unique identifier assigned to the wallet within the Lago application. This ID is exclusively created by Lago and serves as a unique identifier for the wallet’s record within the Lago system.
   * @return walletId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_WALLET_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UUID getWalletId() {
    return walletId;
  }


  @JsonProperty(JSON_PROPERTY_WALLET_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setWalletId(UUID walletId) {
    this.walletId = walletId;
  }


  public WalletTransactionCreateInputWalletTransaction paidCredits(String paidCredits) {
    
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


  public WalletTransactionCreateInputWalletTransaction grantedCredits(String grantedCredits) {
    
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
    WalletTransactionCreateInputWalletTransaction walletTransactionCreateInputWalletTransaction = (WalletTransactionCreateInputWalletTransaction) o;
    return Objects.equals(this.walletId, walletTransactionCreateInputWalletTransaction.walletId) &&
        Objects.equals(this.paidCredits, walletTransactionCreateInputWalletTransaction.paidCredits) &&
        Objects.equals(this.grantedCredits, walletTransactionCreateInputWalletTransaction.grantedCredits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(walletId, paidCredits, grantedCredits);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WalletTransactionCreateInputWalletTransaction {\n");
    sb.append("    walletId: ").append(toIndentedString(walletId)).append("\n");
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

