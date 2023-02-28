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
import io.test_gear.client.model.TestResultsStatisticsGetModel;
import io.test_gear.client.model.TestRunState;
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
 * TestRunShortGetModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TestRunShortGetModel {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PROJECT_ID = "projectId";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID)
  private UUID projectId;

  public static final String SERIALIZED_NAME_CREATED_DATE = "createdDate";
  @SerializedName(SERIALIZED_NAME_CREATED_DATE)
  private OffsetDateTime createdDate;

  public static final String SERIALIZED_NAME_CREATED_BY_ID = "createdById";
  @SerializedName(SERIALIZED_NAME_CREATED_BY_ID)
  private UUID createdById;

  public static final String SERIALIZED_NAME_MODIFIED_DATE = "modifiedDate";
  @SerializedName(SERIALIZED_NAME_MODIFIED_DATE)
  private OffsetDateTime modifiedDate;

  public static final String SERIALIZED_NAME_MODIFIED_BY_ID = "modifiedById";
  @SerializedName(SERIALIZED_NAME_MODIFIED_BY_ID)
  private UUID modifiedById;

  public static final String SERIALIZED_NAME_IS_DELETED = "isDeleted";
  @SerializedName(SERIALIZED_NAME_IS_DELETED)
  private Boolean isDeleted;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private TestRunState state;

  public static final String SERIALIZED_NAME_STARTED_DATE = "startedDate";
  @SerializedName(SERIALIZED_NAME_STARTED_DATE)
  private OffsetDateTime startedDate;

  public static final String SERIALIZED_NAME_AUTOTESTS_COUNT = "autotestsCount";
  @SerializedName(SERIALIZED_NAME_AUTOTESTS_COUNT)
  private Integer autotestsCount;

  public static final String SERIALIZED_NAME_STATISTICS = "statistics";
  @SerializedName(SERIALIZED_NAME_STATISTICS)
  private TestResultsStatisticsGetModel statistics;

  public TestRunShortGetModel() {
  }

  public TestRunShortGetModel id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * Unique ID of the test run
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique ID of the test run")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public TestRunShortGetModel name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the test run
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the test run")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public TestRunShortGetModel projectId(UUID projectId) {
    
    this.projectId = projectId;
    return this;
  }

   /**
   * Unique ID of project where test run is located
   * @return projectId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique ID of project where test run is located")

  public UUID getProjectId() {
    return projectId;
  }


  public void setProjectId(UUID projectId) {
    this.projectId = projectId;
  }


  public TestRunShortGetModel createdDate(OffsetDateTime createdDate) {
    
    this.createdDate = createdDate;
    return this;
  }

   /**
   * Date when the test run was created
   * @return createdDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date when the test run was created")

  public OffsetDateTime getCreatedDate() {
    return createdDate;
  }


  public void setCreatedDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
  }


  public TestRunShortGetModel createdById(UUID createdById) {
    
    this.createdById = createdById;
    return this;
  }

   /**
   * Unique ID of user who created the test run
   * @return createdById
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique ID of user who created the test run")

  public UUID getCreatedById() {
    return createdById;
  }


  public void setCreatedById(UUID createdById) {
    this.createdById = createdById;
  }


  public TestRunShortGetModel modifiedDate(OffsetDateTime modifiedDate) {
    
    this.modifiedDate = modifiedDate;
    return this;
  }

   /**
   * Date when the test run was modified last time
   * @return modifiedDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date when the test run was modified last time")

  public OffsetDateTime getModifiedDate() {
    return modifiedDate;
  }


  public void setModifiedDate(OffsetDateTime modifiedDate) {
    this.modifiedDate = modifiedDate;
  }


  public TestRunShortGetModel modifiedById(UUID modifiedById) {
    
    this.modifiedById = modifiedById;
    return this;
  }

   /**
   * Unique ID of user who modified the test run last time
   * @return modifiedById
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique ID of user who modified the test run last time")

  public UUID getModifiedById() {
    return modifiedById;
  }


  public void setModifiedById(UUID modifiedById) {
    this.modifiedById = modifiedById;
  }


  public TestRunShortGetModel isDeleted(Boolean isDeleted) {
    
    this.isDeleted = isDeleted;
    return this;
  }

   /**
   * Is the test run is deleted
   * @return isDeleted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Is the test run is deleted")

  public Boolean getIsDeleted() {
    return isDeleted;
  }


  public void setIsDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
  }


  public TestRunShortGetModel state(TestRunState state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TestRunState getState() {
    return state;
  }


  public void setState(TestRunState state) {
    this.state = state;
  }


  public TestRunShortGetModel startedDate(OffsetDateTime startedDate) {
    
    this.startedDate = startedDate;
    return this;
  }

   /**
   * Date when the test run was started
   * @return startedDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date when the test run was started")

  public OffsetDateTime getStartedDate() {
    return startedDate;
  }


  public void setStartedDate(OffsetDateTime startedDate) {
    this.startedDate = startedDate;
  }


  public TestRunShortGetModel autotestsCount(Integer autotestsCount) {
    
    this.autotestsCount = autotestsCount;
    return this;
  }

   /**
   * Number of autotests run in the test run
   * @return autotestsCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of autotests run in the test run")

  public Integer getAutotestsCount() {
    return autotestsCount;
  }


  public void setAutotestsCount(Integer autotestsCount) {
    this.autotestsCount = autotestsCount;
  }


  public TestRunShortGetModel statistics(TestResultsStatisticsGetModel statistics) {
    
    this.statistics = statistics;
    return this;
  }

   /**
   * Get statistics
   * @return statistics
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TestResultsStatisticsGetModel getStatistics() {
    return statistics;
  }


  public void setStatistics(TestResultsStatisticsGetModel statistics) {
    this.statistics = statistics;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestRunShortGetModel testRunShortGetModel = (TestRunShortGetModel) o;
    return Objects.equals(this.id, testRunShortGetModel.id) &&
        Objects.equals(this.name, testRunShortGetModel.name) &&
        Objects.equals(this.projectId, testRunShortGetModel.projectId) &&
        Objects.equals(this.createdDate, testRunShortGetModel.createdDate) &&
        Objects.equals(this.createdById, testRunShortGetModel.createdById) &&
        Objects.equals(this.modifiedDate, testRunShortGetModel.modifiedDate) &&
        Objects.equals(this.modifiedById, testRunShortGetModel.modifiedById) &&
        Objects.equals(this.isDeleted, testRunShortGetModel.isDeleted) &&
        Objects.equals(this.state, testRunShortGetModel.state) &&
        Objects.equals(this.startedDate, testRunShortGetModel.startedDate) &&
        Objects.equals(this.autotestsCount, testRunShortGetModel.autotestsCount) &&
        Objects.equals(this.statistics, testRunShortGetModel.statistics);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, projectId, createdDate, createdById, modifiedDate, modifiedById, isDeleted, state, startedDate, autotestsCount, statistics);
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
    sb.append("class TestRunShortGetModel {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    createdById: ").append(toIndentedString(createdById)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
    sb.append("    modifiedById: ").append(toIndentedString(modifiedById)).append("\n");
    sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    startedDate: ").append(toIndentedString(startedDate)).append("\n");
    sb.append("    autotestsCount: ").append(toIndentedString(autotestsCount)).append("\n");
    sb.append("    statistics: ").append(toIndentedString(statistics)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("projectId");
    openapiFields.add("createdDate");
    openapiFields.add("createdById");
    openapiFields.add("modifiedDate");
    openapiFields.add("modifiedById");
    openapiFields.add("isDeleted");
    openapiFields.add("state");
    openapiFields.add("startedDate");
    openapiFields.add("autotestsCount");
    openapiFields.add("statistics");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TestRunShortGetModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TestRunShortGetModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TestRunShortGetModel is not found in the empty JSON string", TestRunShortGetModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TestRunShortGetModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TestRunShortGetModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("projectId") != null && !jsonObj.get("projectId").isJsonNull()) && !jsonObj.get("projectId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `projectId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("projectId").toString()));
      }
      if ((jsonObj.get("createdById") != null && !jsonObj.get("createdById").isJsonNull()) && !jsonObj.get("createdById").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `createdById` to be a primitive type in the JSON string but got `%s`", jsonObj.get("createdById").toString()));
      }
      if ((jsonObj.get("modifiedById") != null && !jsonObj.get("modifiedById").isJsonNull()) && !jsonObj.get("modifiedById").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `modifiedById` to be a primitive type in the JSON string but got `%s`", jsonObj.get("modifiedById").toString()));
      }
      // validate the optional field `statistics`
      if (jsonObj.get("statistics") != null && !jsonObj.get("statistics").isJsonNull()) {
        TestResultsStatisticsGetModel.validateJsonObject(jsonObj.getAsJsonObject("statistics"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TestRunShortGetModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TestRunShortGetModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TestRunShortGetModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TestRunShortGetModel.class));

       return (TypeAdapter<T>) new TypeAdapter<TestRunShortGetModel>() {
           @Override
           public void write(JsonWriter out, TestRunShortGetModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TestRunShortGetModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TestRunShortGetModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TestRunShortGetModel
  * @throws IOException if the JSON string is invalid with respect to TestRunShortGetModel
  */
  public static TestRunShortGetModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TestRunShortGetModel.class);
  }

 /**
  * Convert an instance of TestRunShortGetModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

