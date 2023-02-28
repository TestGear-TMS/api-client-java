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
import io.test_gear.client.model.AttachmentModel;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
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
 * StepCommentModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class StepCommentModel {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_TEXT = "text";
  @SerializedName(SERIALIZED_NAME_TEXT)
  private String text;

  public static final String SERIALIZED_NAME_STEP_ID = "stepId";
  @SerializedName(SERIALIZED_NAME_STEP_ID)
  private UUID stepId;

  public static final String SERIALIZED_NAME_PARENT_STEP_ID = "parentStepId";
  @SerializedName(SERIALIZED_NAME_PARENT_STEP_ID)
  private UUID parentStepId;

  public static final String SERIALIZED_NAME_ATTACHMENTS = "attachments";
  @SerializedName(SERIALIZED_NAME_ATTACHMENTS)
  private List<AttachmentModel> attachments = null;

  public static final String SERIALIZED_NAME_TEST_RESULT_ID = "testResultId";
  @SerializedName(SERIALIZED_NAME_TEST_RESULT_ID)
  private UUID testResultId;

  public static final String SERIALIZED_NAME_CREATED_BY_ID = "createdById";
  @SerializedName(SERIALIZED_NAME_CREATED_BY_ID)
  private UUID createdById;

  public static final String SERIALIZED_NAME_MODIFIED_BY_ID = "modifiedById";
  @SerializedName(SERIALIZED_NAME_MODIFIED_BY_ID)
  private UUID modifiedById;

  public static final String SERIALIZED_NAME_CREATED_DATE = "createdDate";
  @SerializedName(SERIALIZED_NAME_CREATED_DATE)
  private OffsetDateTime createdDate;

  public static final String SERIALIZED_NAME_MODIFIED_DATE = "modifiedDate";
  @SerializedName(SERIALIZED_NAME_MODIFIED_DATE)
  private OffsetDateTime modifiedDate;

  public StepCommentModel() {
  }

  public StepCommentModel id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ab0f4e0e-441c-40a0-8c59-4e5cd37bcc16", value = "")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public StepCommentModel text(String text) {
    
    this.text = text;
    return this;
  }

   /**
   * Get text
   * @return text
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getText() {
    return text;
  }


  public void setText(String text) {
    this.text = text;
  }


  public StepCommentModel stepId(UUID stepId) {
    
    this.stepId = stepId;
    return this;
  }

   /**
   * Get stepId
   * @return stepId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public UUID getStepId() {
    return stepId;
  }


  public void setStepId(UUID stepId) {
    this.stepId = stepId;
  }


  public StepCommentModel parentStepId(UUID parentStepId) {
    
    this.parentStepId = parentStepId;
    return this;
  }

   /**
   * Get parentStepId
   * @return parentStepId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getParentStepId() {
    return parentStepId;
  }


  public void setParentStepId(UUID parentStepId) {
    this.parentStepId = parentStepId;
  }


  public StepCommentModel attachments(List<AttachmentModel> attachments) {
    
    this.attachments = attachments;
    return this;
  }

  public StepCommentModel addAttachmentsItem(AttachmentModel attachmentsItem) {
    if (this.attachments == null) {
      this.attachments = new ArrayList<>();
    }
    this.attachments.add(attachmentsItem);
    return this;
  }

   /**
   * Get attachments
   * @return attachments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<AttachmentModel> getAttachments() {
    return attachments;
  }


  public void setAttachments(List<AttachmentModel> attachments) {
    this.attachments = attachments;
  }


  public StepCommentModel testResultId(UUID testResultId) {
    
    this.testResultId = testResultId;
    return this;
  }

   /**
   * Get testResultId
   * @return testResultId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public UUID getTestResultId() {
    return testResultId;
  }


  public void setTestResultId(UUID testResultId) {
    this.testResultId = testResultId;
  }


  public StepCommentModel createdById(UUID createdById) {
    
    this.createdById = createdById;
    return this;
  }

   /**
   * Get createdById
   * @return createdById
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getCreatedById() {
    return createdById;
  }


  public void setCreatedById(UUID createdById) {
    this.createdById = createdById;
  }


  public StepCommentModel modifiedById(UUID modifiedById) {
    
    this.modifiedById = modifiedById;
    return this;
  }

   /**
   * Get modifiedById
   * @return modifiedById
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getModifiedById() {
    return modifiedById;
  }


  public void setModifiedById(UUID modifiedById) {
    this.modifiedById = modifiedById;
  }


  public StepCommentModel createdDate(OffsetDateTime createdDate) {
    
    this.createdDate = createdDate;
    return this;
  }

   /**
   * Get createdDate
   * @return createdDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getCreatedDate() {
    return createdDate;
  }


  public void setCreatedDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
  }


  public StepCommentModel modifiedDate(OffsetDateTime modifiedDate) {
    
    this.modifiedDate = modifiedDate;
    return this;
  }

   /**
   * Get modifiedDate
   * @return modifiedDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getModifiedDate() {
    return modifiedDate;
  }


  public void setModifiedDate(OffsetDateTime modifiedDate) {
    this.modifiedDate = modifiedDate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StepCommentModel stepCommentModel = (StepCommentModel) o;
    return Objects.equals(this.id, stepCommentModel.id) &&
        Objects.equals(this.text, stepCommentModel.text) &&
        Objects.equals(this.stepId, stepCommentModel.stepId) &&
        Objects.equals(this.parentStepId, stepCommentModel.parentStepId) &&
        Objects.equals(this.attachments, stepCommentModel.attachments) &&
        Objects.equals(this.testResultId, stepCommentModel.testResultId) &&
        Objects.equals(this.createdById, stepCommentModel.createdById) &&
        Objects.equals(this.modifiedById, stepCommentModel.modifiedById) &&
        Objects.equals(this.createdDate, stepCommentModel.createdDate) &&
        Objects.equals(this.modifiedDate, stepCommentModel.modifiedDate);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, text, stepId, parentStepId, attachments, testResultId, createdById, modifiedById, createdDate, modifiedDate);
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
    sb.append("class StepCommentModel {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    stepId: ").append(toIndentedString(stepId)).append("\n");
    sb.append("    parentStepId: ").append(toIndentedString(parentStepId)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("    testResultId: ").append(toIndentedString(testResultId)).append("\n");
    sb.append("    createdById: ").append(toIndentedString(createdById)).append("\n");
    sb.append("    modifiedById: ").append(toIndentedString(modifiedById)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("text");
    openapiFields.add("stepId");
    openapiFields.add("parentStepId");
    openapiFields.add("attachments");
    openapiFields.add("testResultId");
    openapiFields.add("createdById");
    openapiFields.add("modifiedById");
    openapiFields.add("createdDate");
    openapiFields.add("modifiedDate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("stepId");
    openapiRequiredFields.add("testResultId");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to StepCommentModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!StepCommentModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in StepCommentModel is not found in the empty JSON string", StepCommentModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!StepCommentModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `StepCommentModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : StepCommentModel.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("text") != null && !jsonObj.get("text").isJsonNull()) && !jsonObj.get("text").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `text` to be a primitive type in the JSON string but got `%s`", jsonObj.get("text").toString()));
      }
      if (!jsonObj.get("stepId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `stepId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("stepId").toString()));
      }
      if ((jsonObj.get("parentStepId") != null && !jsonObj.get("parentStepId").isJsonNull()) && !jsonObj.get("parentStepId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `parentStepId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parentStepId").toString()));
      }
      if (jsonObj.get("attachments") != null && !jsonObj.get("attachments").isJsonNull()) {
        JsonArray jsonArrayattachments = jsonObj.getAsJsonArray("attachments");
        if (jsonArrayattachments != null) {
          // ensure the json data is an array
          if (!jsonObj.get("attachments").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `attachments` to be an array in the JSON string but got `%s`", jsonObj.get("attachments").toString()));
          }

          // validate the optional field `attachments` (array)
          for (int i = 0; i < jsonArrayattachments.size(); i++) {
            AttachmentModel.validateJsonObject(jsonArrayattachments.get(i).getAsJsonObject());
          };
        }
      }
      if (!jsonObj.get("testResultId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `testResultId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("testResultId").toString()));
      }
      if ((jsonObj.get("createdById") != null && !jsonObj.get("createdById").isJsonNull()) && !jsonObj.get("createdById").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `createdById` to be a primitive type in the JSON string but got `%s`", jsonObj.get("createdById").toString()));
      }
      if ((jsonObj.get("modifiedById") != null && !jsonObj.get("modifiedById").isJsonNull()) && !jsonObj.get("modifiedById").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `modifiedById` to be a primitive type in the JSON string but got `%s`", jsonObj.get("modifiedById").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StepCommentModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StepCommentModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StepCommentModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StepCommentModel.class));

       return (TypeAdapter<T>) new TypeAdapter<StepCommentModel>() {
           @Override
           public void write(JsonWriter out, StepCommentModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StepCommentModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StepCommentModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StepCommentModel
  * @throws IOException if the JSON string is invalid with respect to StepCommentModel
  */
  public static StepCommentModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StepCommentModel.class);
  }

 /**
  * Convert an instance of StepCommentModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

