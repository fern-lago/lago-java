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
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * PaginationMeta
 */
@JsonPropertyOrder({
  PaginationMeta.JSON_PROPERTY_CURRENT_PAGE,
  PaginationMeta.JSON_PROPERTY_NEXT_PAGE,
  PaginationMeta.JSON_PROPERTY_PREV_PAGE,
  PaginationMeta.JSON_PROPERTY_TOTAL_PAGES,
  PaginationMeta.JSON_PROPERTY_TOTAL_COUNT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-07T15:52:17.625211Z[Etc/UTC]")
public class PaginationMeta {
  public static final String JSON_PROPERTY_CURRENT_PAGE = "current_page";
  private Integer currentPage;

  public static final String JSON_PROPERTY_NEXT_PAGE = "next_page";
  private JsonNullable<Integer> nextPage = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_PREV_PAGE = "prev_page";
  private JsonNullable<Integer> prevPage = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_TOTAL_PAGES = "total_pages";
  private Integer totalPages;

  public static final String JSON_PROPERTY_TOTAL_COUNT = "total_count";
  private Integer totalCount;

  public PaginationMeta() {
  }

  public PaginationMeta currentPage(Integer currentPage) {
    
    this.currentPage = currentPage;
    return this;
  }

   /**
   * Current page.
   * @return currentPage
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CURRENT_PAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getCurrentPage() {
    return currentPage;
  }


  @JsonProperty(JSON_PROPERTY_CURRENT_PAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCurrentPage(Integer currentPage) {
    this.currentPage = currentPage;
  }


  public PaginationMeta nextPage(Integer nextPage) {
    this.nextPage = JsonNullable.<Integer>of(nextPage);
    
    return this;
  }

   /**
   * Next page.
   * @return nextPage
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Integer getNextPage() {
        return nextPage.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NEXT_PAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getNextPage_JsonNullable() {
    return nextPage;
  }
  
  @JsonProperty(JSON_PROPERTY_NEXT_PAGE)
  public void setNextPage_JsonNullable(JsonNullable<Integer> nextPage) {
    this.nextPage = nextPage;
  }

  public void setNextPage(Integer nextPage) {
    this.nextPage = JsonNullable.<Integer>of(nextPage);
  }


  public PaginationMeta prevPage(Integer prevPage) {
    this.prevPage = JsonNullable.<Integer>of(prevPage);
    
    return this;
  }

   /**
   * Previous page.
   * @return prevPage
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Integer getPrevPage() {
        return prevPage.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PREV_PAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getPrevPage_JsonNullable() {
    return prevPage;
  }
  
  @JsonProperty(JSON_PROPERTY_PREV_PAGE)
  public void setPrevPage_JsonNullable(JsonNullable<Integer> prevPage) {
    this.prevPage = prevPage;
  }

  public void setPrevPage(Integer prevPage) {
    this.prevPage = JsonNullable.<Integer>of(prevPage);
  }


  public PaginationMeta totalPages(Integer totalPages) {
    
    this.totalPages = totalPages;
    return this;
  }

   /**
   * Total number of pages.
   * @return totalPages
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TOTAL_PAGES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getTotalPages() {
    return totalPages;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_PAGES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTotalPages(Integer totalPages) {
    this.totalPages = totalPages;
  }


  public PaginationMeta totalCount(Integer totalCount) {
    
    this.totalCount = totalCount;
    return this;
  }

   /**
   * Total number of records.
   * @return totalCount
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TOTAL_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getTotalCount() {
    return totalCount;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaginationMeta paginationMeta = (PaginationMeta) o;
    return Objects.equals(this.currentPage, paginationMeta.currentPage) &&
        equalsNullable(this.nextPage, paginationMeta.nextPage) &&
        equalsNullable(this.prevPage, paginationMeta.prevPage) &&
        Objects.equals(this.totalPages, paginationMeta.totalPages) &&
        Objects.equals(this.totalCount, paginationMeta.totalCount);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentPage, hashCodeNullable(nextPage), hashCodeNullable(prevPage), totalPages, totalCount);
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
    sb.append("class PaginationMeta {\n");
    sb.append("    currentPage: ").append(toIndentedString(currentPage)).append("\n");
    sb.append("    nextPage: ").append(toIndentedString(nextPage)).append("\n");
    sb.append("    prevPage: ").append(toIndentedString(prevPage)).append("\n");
    sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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

