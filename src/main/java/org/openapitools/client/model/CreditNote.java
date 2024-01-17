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
import org.openapitools.client.model.CreditNoteObject;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * CreditNote
 */
@JsonPropertyOrder({
  CreditNote.JSON_PROPERTY_CREDIT_NOTE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-27T14:12:55.372025191Z[Etc/UTC]")
public class CreditNote {
  public static final String JSON_PROPERTY_CREDIT_NOTE = "credit_note";
  private CreditNoteObject creditNote;

  public CreditNote() {
  }

  public CreditNote creditNote(CreditNoteObject creditNote) {
    
    this.creditNote = creditNote;
    return this;
  }

   /**
   * Get creditNote
   * @return creditNote
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CREDIT_NOTE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public CreditNoteObject getCreditNote() {
    return creditNote;
  }


  @JsonProperty(JSON_PROPERTY_CREDIT_NOTE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCreditNote(CreditNoteObject creditNote) {
    this.creditNote = creditNote;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditNote creditNote = (CreditNote) o;
    return Objects.equals(this.creditNote, creditNote.creditNote);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creditNote);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditNote {\n");
    sb.append("    creditNote: ").append(toIndentedString(creditNote)).append("\n");
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

