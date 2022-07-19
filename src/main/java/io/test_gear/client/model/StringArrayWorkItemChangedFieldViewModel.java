/*
 * API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v2.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.test_gear.client.model;

import java.util.Objects;
import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * StringArrayWorkItemChangedFieldViewModel
 */
@JsonPropertyOrder({
  StringArrayWorkItemChangedFieldViewModel.JSON_PROPERTY_OLD_VALUE,
  StringArrayWorkItemChangedFieldViewModel.JSON_PROPERTY_NEW_VALUE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class StringArrayWorkItemChangedFieldViewModel {
  public static final String JSON_PROPERTY_OLD_VALUE = "oldValue";
  private JsonNullable<List<String>> oldValue = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_NEW_VALUE = "newValue";
  private JsonNullable<List<String>> newValue = JsonNullable.<List<String>>undefined();

  public StringArrayWorkItemChangedFieldViewModel() { 
  }

  public StringArrayWorkItemChangedFieldViewModel oldValue(List<String> oldValue) {
    this.oldValue = JsonNullable.<List<String>>of(oldValue);
    return this;
  }

  public StringArrayWorkItemChangedFieldViewModel addOldValueItem(String oldValueItem) {
    if (this.oldValue == null || !this.oldValue.isPresent()) {
      this.oldValue = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.oldValue.get().add(oldValueItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get oldValue
   * @return oldValue
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public List<String> getOldValue() {
        return oldValue.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_OLD_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<String>> getOldValue_JsonNullable() {
    return oldValue;
  }
  
  @JsonProperty(JSON_PROPERTY_OLD_VALUE)
  public void setOldValue_JsonNullable(JsonNullable<List<String>> oldValue) {
    this.oldValue = oldValue;
  }

  public void setOldValue(List<String> oldValue) {
    this.oldValue = JsonNullable.<List<String>>of(oldValue);
  }


  public StringArrayWorkItemChangedFieldViewModel newValue(List<String> newValue) {
    this.newValue = JsonNullable.<List<String>>of(newValue);
    return this;
  }

  public StringArrayWorkItemChangedFieldViewModel addNewValueItem(String newValueItem) {
    if (this.newValue == null || !this.newValue.isPresent()) {
      this.newValue = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.newValue.get().add(newValueItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get newValue
   * @return newValue
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public List<String> getNewValue() {
        return newValue.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NEW_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<String>> getNewValue_JsonNullable() {
    return newValue;
  }
  
  @JsonProperty(JSON_PROPERTY_NEW_VALUE)
  public void setNewValue_JsonNullable(JsonNullable<List<String>> newValue) {
    this.newValue = newValue;
  }

  public void setNewValue(List<String> newValue) {
    this.newValue = JsonNullable.<List<String>>of(newValue);
  }


  /**
   * Return true if this StringArrayWorkItemChangedFieldViewModel object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StringArrayWorkItemChangedFieldViewModel stringArrayWorkItemChangedFieldViewModel = (StringArrayWorkItemChangedFieldViewModel) o;
    return equalsNullable(this.oldValue, stringArrayWorkItemChangedFieldViewModel.oldValue) &&
        equalsNullable(this.newValue, stringArrayWorkItemChangedFieldViewModel.newValue);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(oldValue), hashCodeNullable(newValue));
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
    sb.append("class StringArrayWorkItemChangedFieldViewModel {\n");
    sb.append("    oldValue: ").append(toIndentedString(oldValue)).append("\n");
    sb.append("    newValue: ").append(toIndentedString(newValue)).append("\n");
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

