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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.test_gear.client.model.AutoTestChangeViewModel;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import io.test_gear.client.invoker.JSON;

/**
 * AutoTestChangeViewModelArrayWorkItemChangedFieldViewModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AutoTestChangeViewModelArrayWorkItemChangedFieldViewModel {
  public static final String SERIALIZED_NAME_OLD_VALUE = "oldValue";
  @SerializedName(SERIALIZED_NAME_OLD_VALUE)
  private List<AutoTestChangeViewModel> oldValue;

  public static final String SERIALIZED_NAME_NEW_VALUE = "newValue";
  @SerializedName(SERIALIZED_NAME_NEW_VALUE)
  private List<AutoTestChangeViewModel> newValue;

  public AutoTestChangeViewModelArrayWorkItemChangedFieldViewModel() {
  }

  public AutoTestChangeViewModelArrayWorkItemChangedFieldViewModel oldValue(List<AutoTestChangeViewModel> oldValue) {
    
    this.oldValue = oldValue;
    return this;
  }

  public AutoTestChangeViewModelArrayWorkItemChangedFieldViewModel addOldValueItem(AutoTestChangeViewModel oldValueItem) {
    this.oldValue.add(oldValueItem);
    return this;
  }

   /**
   * Get oldValue
   * @return oldValue
  **/
  @javax.annotation.Nullable

  public List<AutoTestChangeViewModel> getOldValue() {
    return oldValue;
  }


  public void setOldValue(List<AutoTestChangeViewModel> oldValue) {
    this.oldValue = oldValue;
  }


  public AutoTestChangeViewModelArrayWorkItemChangedFieldViewModel newValue(List<AutoTestChangeViewModel> newValue) {
    
    this.newValue = newValue;
    return this;
  }

  public AutoTestChangeViewModelArrayWorkItemChangedFieldViewModel addNewValueItem(AutoTestChangeViewModel newValueItem) {
    this.newValue.add(newValueItem);
    return this;
  }

   /**
   * Get newValue
   * @return newValue
  **/
  @javax.annotation.Nullable

  public List<AutoTestChangeViewModel> getNewValue() {
    return newValue;
  }


  public void setNewValue(List<AutoTestChangeViewModel> newValue) {
    this.newValue = newValue;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutoTestChangeViewModelArrayWorkItemChangedFieldViewModel autoTestChangeViewModelArrayWorkItemChangedFieldViewModel = (AutoTestChangeViewModelArrayWorkItemChangedFieldViewModel) o;
    return Objects.equals(this.oldValue, autoTestChangeViewModelArrayWorkItemChangedFieldViewModel.oldValue) &&
        Objects.equals(this.newValue, autoTestChangeViewModelArrayWorkItemChangedFieldViewModel.newValue);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(oldValue, newValue);
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
    sb.append("class AutoTestChangeViewModelArrayWorkItemChangedFieldViewModel {\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("oldValue");
    openapiFields.add("newValue");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AutoTestChangeViewModelArrayWorkItemChangedFieldViewModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AutoTestChangeViewModelArrayWorkItemChangedFieldViewModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AutoTestChangeViewModelArrayWorkItemChangedFieldViewModel is not found in the empty JSON string", AutoTestChangeViewModelArrayWorkItemChangedFieldViewModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AutoTestChangeViewModelArrayWorkItemChangedFieldViewModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AutoTestChangeViewModelArrayWorkItemChangedFieldViewModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("oldValue") != null && !jsonObj.get("oldValue").isJsonNull()) {
        JsonArray jsonArrayoldValue = jsonObj.getAsJsonArray("oldValue");
        if (jsonArrayoldValue != null) {
          // ensure the json data is an array
          if (!jsonObj.get("oldValue").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `oldValue` to be an array in the JSON string but got `%s`", jsonObj.get("oldValue").toString()));
          }

          // validate the optional field `oldValue` (array)
          for (int i = 0; i < jsonArrayoldValue.size(); i++) {
            AutoTestChangeViewModel.validateJsonObject(jsonArrayoldValue.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("newValue") != null && !jsonObj.get("newValue").isJsonNull()) {
        JsonArray jsonArraynewValue = jsonObj.getAsJsonArray("newValue");
        if (jsonArraynewValue != null) {
          // ensure the json data is an array
          if (!jsonObj.get("newValue").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `newValue` to be an array in the JSON string but got `%s`", jsonObj.get("newValue").toString()));
          }

          // validate the optional field `newValue` (array)
          for (int i = 0; i < jsonArraynewValue.size(); i++) {
            AutoTestChangeViewModel.validateJsonObject(jsonArraynewValue.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AutoTestChangeViewModelArrayWorkItemChangedFieldViewModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AutoTestChangeViewModelArrayWorkItemChangedFieldViewModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AutoTestChangeViewModelArrayWorkItemChangedFieldViewModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AutoTestChangeViewModelArrayWorkItemChangedFieldViewModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AutoTestChangeViewModelArrayWorkItemChangedFieldViewModel>() {
           @Override
           public void write(JsonWriter out, AutoTestChangeViewModelArrayWorkItemChangedFieldViewModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AutoTestChangeViewModelArrayWorkItemChangedFieldViewModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AutoTestChangeViewModelArrayWorkItemChangedFieldViewModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AutoTestChangeViewModelArrayWorkItemChangedFieldViewModel
  * @throws IOException if the JSON string is invalid with respect to AutoTestChangeViewModelArrayWorkItemChangedFieldViewModel
  */
  public static AutoTestChangeViewModelArrayWorkItemChangedFieldViewModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AutoTestChangeViewModelArrayWorkItemChangedFieldViewModel.class);
  }

 /**
  * Convert an instance of AutoTestChangeViewModelArrayWorkItemChangedFieldViewModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

