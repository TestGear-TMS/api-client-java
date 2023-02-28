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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.UUID;
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
 * WorkItemVersionModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class WorkItemVersionModel {
  public static final String SERIALIZED_NAME_VERSION_ID = "versionId";
  @SerializedName(SERIALIZED_NAME_VERSION_ID)
  private UUID versionId;

  public static final String SERIALIZED_NAME_VERSION_NUMBER = "versionNumber";
  @SerializedName(SERIALIZED_NAME_VERSION_NUMBER)
  private Integer versionNumber;

  public static final String SERIALIZED_NAME_MODIFIED_DATE = "modifiedDate";
  @SerializedName(SERIALIZED_NAME_MODIFIED_DATE)
  private OffsetDateTime modifiedDate;

  public static final String SERIALIZED_NAME_MODIFIED_BY_ID = "modifiedById";
  @SerializedName(SERIALIZED_NAME_MODIFIED_BY_ID)
  private UUID modifiedById;

  public WorkItemVersionModel() {
  }

  public WorkItemVersionModel versionId(UUID versionId) {
    
    this.versionId = versionId;
    return this;
  }

   /**
   * used for versioning changes in workitem
   * @return versionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ab0f4e0e-441c-40a0-8c59-4e5cd37bcc16", value = "used for versioning changes in workitem")

  public UUID getVersionId() {
    return versionId;
  }


  public void setVersionId(UUID versionId) {
    this.versionId = versionId;
  }


  public WorkItemVersionModel versionNumber(Integer versionNumber) {
    
    this.versionNumber = versionNumber;
    return this;
  }

   /**
   * used for define chronology of workitem state in each version
   * @return versionNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10", value = "used for define chronology of workitem state in each version")

  public Integer getVersionNumber() {
    return versionNumber;
  }


  public void setVersionNumber(Integer versionNumber) {
    this.versionNumber = versionNumber;
  }


  public WorkItemVersionModel modifiedDate(OffsetDateTime modifiedDate) {
    
    this.modifiedDate = modifiedDate;
    return this;
  }

   /**
   * Get modifiedDate
   * @return modifiedDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2023-02-28T08:43:24.744582300Z", value = "")

  public OffsetDateTime getModifiedDate() {
    return modifiedDate;
  }


  public void setModifiedDate(OffsetDateTime modifiedDate) {
    this.modifiedDate = modifiedDate;
  }


  public WorkItemVersionModel modifiedById(UUID modifiedById) {
    
    this.modifiedById = modifiedById;
    return this;
  }

   /**
   * Get modifiedById
   * @return modifiedById
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ab0f4e0e-441c-40a0-8c59-4e5cd37bcc16", value = "")

  public UUID getModifiedById() {
    return modifiedById;
  }


  public void setModifiedById(UUID modifiedById) {
    this.modifiedById = modifiedById;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkItemVersionModel workItemVersionModel = (WorkItemVersionModel) o;
    return Objects.equals(this.versionId, workItemVersionModel.versionId) &&
        Objects.equals(this.versionNumber, workItemVersionModel.versionNumber) &&
        Objects.equals(this.modifiedDate, workItemVersionModel.modifiedDate) &&
        Objects.equals(this.modifiedById, workItemVersionModel.modifiedById);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(versionId, versionNumber, modifiedDate, modifiedById);
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
    sb.append("class WorkItemVersionModel {\n");
    sb.append("    versionId: ").append(toIndentedString(versionId)).append("\n");
    sb.append("    versionNumber: ").append(toIndentedString(versionNumber)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
    sb.append("    modifiedById: ").append(toIndentedString(modifiedById)).append("\n");
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
    openapiFields.add("versionId");
    openapiFields.add("versionNumber");
    openapiFields.add("modifiedDate");
    openapiFields.add("modifiedById");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WorkItemVersionModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!WorkItemVersionModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WorkItemVersionModel is not found in the empty JSON string", WorkItemVersionModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!WorkItemVersionModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WorkItemVersionModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("versionId") != null && !jsonObj.get("versionId").isJsonNull()) && !jsonObj.get("versionId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `versionId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("versionId").toString()));
      }
      if ((jsonObj.get("modifiedById") != null && !jsonObj.get("modifiedById").isJsonNull()) && !jsonObj.get("modifiedById").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `modifiedById` to be a primitive type in the JSON string but got `%s`", jsonObj.get("modifiedById").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WorkItemVersionModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WorkItemVersionModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WorkItemVersionModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WorkItemVersionModel.class));

       return (TypeAdapter<T>) new TypeAdapter<WorkItemVersionModel>() {
           @Override
           public void write(JsonWriter out, WorkItemVersionModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WorkItemVersionModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WorkItemVersionModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WorkItemVersionModel
  * @throws IOException if the JSON string is invalid with respect to WorkItemVersionModel
  */
  public static WorkItemVersionModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WorkItemVersionModel.class);
  }

 /**
  * Convert an instance of WorkItemVersionModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

