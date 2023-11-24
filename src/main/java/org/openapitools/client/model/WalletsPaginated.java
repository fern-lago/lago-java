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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.PaginationMeta;
import org.openapitools.client.model.WalletObject;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * WalletsPaginated
 */
@JsonPropertyOrder({
  WalletsPaginated.JSON_PROPERTY_WALLETS,
  WalletsPaginated.JSON_PROPERTY_META
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-24T14:41:05.749099654Z[Etc/UTC]")
public class WalletsPaginated {
  public static final String JSON_PROPERTY_WALLETS = "wallets";
  private List<WalletObject> wallets = new ArrayList<>();

  public static final String JSON_PROPERTY_META = "meta";
  private PaginationMeta meta;

  public WalletsPaginated() {
  }

  public WalletsPaginated wallets(List<WalletObject> wallets) {
    
    this.wallets = wallets;
    return this;
  }

  public WalletsPaginated addWalletsItem(WalletObject walletsItem) {
    if (this.wallets == null) {
      this.wallets = new ArrayList<>();
    }
    this.wallets.add(walletsItem);
    return this;
  }

   /**
   * Get wallets
   * @return wallets
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_WALLETS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<WalletObject> getWallets() {
    return wallets;
  }


  @JsonProperty(JSON_PROPERTY_WALLETS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setWallets(List<WalletObject> wallets) {
    this.wallets = wallets;
  }


  public WalletsPaginated meta(PaginationMeta meta) {
    
    this.meta = meta;
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public PaginationMeta getMeta() {
    return meta;
  }


  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMeta(PaginationMeta meta) {
    this.meta = meta;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WalletsPaginated walletsPaginated = (WalletsPaginated) o;
    return Objects.equals(this.wallets, walletsPaginated.wallets) &&
        Objects.equals(this.meta, walletsPaginated.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(wallets, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WalletsPaginated {\n");
    sb.append("    wallets: ").append(toIndentedString(wallets)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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

