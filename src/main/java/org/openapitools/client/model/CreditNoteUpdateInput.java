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
import org.openapitools.client.model.CreditNoteUpdateInputCreditNote;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * CreditNoteUpdateInput
 */
@JsonPropertyOrder({
  CreditNoteUpdateInput.JSON_PROPERTY_CREDIT_NOTE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-24T14:46:07.416771019Z[Etc/UTC]")
public class CreditNoteUpdateInput {
  public static final String JSON_PROPERTY_CREDIT_NOTE = "credit_note";
  private CreditNoteUpdateInputCreditNote creditNote;

  public CreditNoteUpdateInput() {
  }

  public CreditNoteUpdateInput creditNote(CreditNoteUpdateInputCreditNote creditNote) {
    
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

  public CreditNoteUpdateInputCreditNote getCreditNote() {
    return creditNote;
  }


  @JsonProperty(JSON_PROPERTY_CREDIT_NOTE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCreditNote(CreditNoteUpdateInputCreditNote creditNote) {
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
    CreditNoteUpdateInput creditNoteUpdateInput = (CreditNoteUpdateInput) o;
    return Objects.equals(this.creditNote, creditNoteUpdateInput.creditNote);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creditNote);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditNoteUpdateInput {\n");
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

