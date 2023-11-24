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
import org.openapitools.client.model.WalletTransactionCreateInputWalletTransaction;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * WalletTransactionCreateInput
 */
@JsonPropertyOrder({
  WalletTransactionCreateInput.JSON_PROPERTY_WALLET_TRANSACTION
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-24T14:41:05.749099654Z[Etc/UTC]")
public class WalletTransactionCreateInput {
  public static final String JSON_PROPERTY_WALLET_TRANSACTION = "wallet_transaction";
  private WalletTransactionCreateInputWalletTransaction walletTransaction;

  public WalletTransactionCreateInput() {
  }

  public WalletTransactionCreateInput walletTransaction(WalletTransactionCreateInputWalletTransaction walletTransaction) {
    
    this.walletTransaction = walletTransaction;
    return this;
  }

   /**
   * Get walletTransaction
   * @return walletTransaction
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_WALLET_TRANSACTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public WalletTransactionCreateInputWalletTransaction getWalletTransaction() {
    return walletTransaction;
  }


  @JsonProperty(JSON_PROPERTY_WALLET_TRANSACTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setWalletTransaction(WalletTransactionCreateInputWalletTransaction walletTransaction) {
    this.walletTransaction = walletTransaction;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WalletTransactionCreateInput walletTransactionCreateInput = (WalletTransactionCreateInput) o;
    return Objects.equals(this.walletTransaction, walletTransactionCreateInput.walletTransaction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(walletTransaction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WalletTransactionCreateInput {\n");
    sb.append("    walletTransaction: ").append(toIndentedString(walletTransaction)).append("\n");
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

