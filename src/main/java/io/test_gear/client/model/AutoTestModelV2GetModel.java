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
import io.test_gear.client.model.AutoTestStepModel;
import io.test_gear.client.model.LabelShortModel;
import io.test_gear.client.model.LinkModel;
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
 * AutoTestModelV2GetModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AutoTestModelV2GetModel {
  public static final String SERIALIZED_NAME_EXTERNAL_ID = "externalId";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ID)
  private String externalId;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<LinkModel> links;

  public static final String SERIALIZED_NAME_PROJECT_ID = "projectId";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID)
  private UUID projectId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NAMESPACE = "namespace";
  @SerializedName(SERIALIZED_NAME_NAMESPACE)
  private String namespace;

  public static final String SERIALIZED_NAME_CLASSNAME = "classname";
  @SerializedName(SERIALIZED_NAME_CLASSNAME)
  private String classname;

  public static final String SERIALIZED_NAME_STEPS = "steps";
  @SerializedName(SERIALIZED_NAME_STEPS)
  private List<AutoTestStepModel> steps;

  public static final String SERIALIZED_NAME_SETUP = "setup";
  @SerializedName(SERIALIZED_NAME_SETUP)
  private List<AutoTestStepModel> setup;

  public static final String SERIALIZED_NAME_TEARDOWN = "teardown";
  @SerializedName(SERIALIZED_NAME_TEARDOWN)
  private List<AutoTestStepModel> teardown;

  public static final String SERIALIZED_NAME_GLOBAL_ID = "globalId";
  @SerializedName(SERIALIZED_NAME_GLOBAL_ID)
  private Long globalId;

  public static final String SERIALIZED_NAME_CREATED_DATE = "createdDate";
  @SerializedName(SERIALIZED_NAME_CREATED_DATE)
  private OffsetDateTime createdDate;

  public static final String SERIALIZED_NAME_MODIFIED_DATE = "modifiedDate";
  @SerializedName(SERIALIZED_NAME_MODIFIED_DATE)
  private OffsetDateTime modifiedDate;

  public static final String SERIALIZED_NAME_CREATED_BY_ID = "createdById";
  @SerializedName(SERIALIZED_NAME_CREATED_BY_ID)
  private UUID createdById;

  public static final String SERIALIZED_NAME_MODIFIED_BY_ID = "modifiedById";
  @SerializedName(SERIALIZED_NAME_MODIFIED_BY_ID)
  private UUID modifiedById;

  public static final String SERIALIZED_NAME_LABELS = "labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private List<LabelShortModel> labels;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_IS_DELETED = "isDeleted";
  @SerializedName(SERIALIZED_NAME_IS_DELETED)
  private Boolean isDeleted;

  public AutoTestModelV2GetModel() {
  }

  public AutoTestModelV2GetModel externalId(String externalId) {
    
    this.externalId = externalId;
    return this;
  }

   /**
   * This property is used to set autotest identifier from client system
   * @return externalId
  **/
  @javax.annotation.Nullable

  public String getExternalId() {
    return externalId;
  }


  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }


  public AutoTestModelV2GetModel links(List<LinkModel> links) {
    
    this.links = links;
    return this;
  }

  public AutoTestModelV2GetModel addLinksItem(LinkModel linksItem) {
    this.links.add(linksItem);
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nullable

  public List<LinkModel> getLinks() {
    return links;
  }


  public void setLinks(List<LinkModel> links) {
    this.links = links;
  }


  public AutoTestModelV2GetModel projectId(UUID projectId) {
    
    this.projectId = projectId;
    return this;
  }

   /**
   * This property is used to link autotest with project
   * @return projectId
  **/
  @javax.annotation.Nullable

  public UUID getProjectId() {
    return projectId;
  }


  public void setProjectId(UUID projectId) {
    this.projectId = projectId;
  }


  public AutoTestModelV2GetModel name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public AutoTestModelV2GetModel namespace(String namespace) {
    
    this.namespace = namespace;
    return this;
  }

   /**
   * Get namespace
   * @return namespace
  **/
  @javax.annotation.Nullable

  public String getNamespace() {
    return namespace;
  }


  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }


  public AutoTestModelV2GetModel classname(String classname) {
    
    this.classname = classname;
    return this;
  }

   /**
   * Get classname
   * @return classname
  **/
  @javax.annotation.Nullable

  public String getClassname() {
    return classname;
  }


  public void setClassname(String classname) {
    this.classname = classname;
  }


  public AutoTestModelV2GetModel steps(List<AutoTestStepModel> steps) {
    
    this.steps = steps;
    return this;
  }

  public AutoTestModelV2GetModel addStepsItem(AutoTestStepModel stepsItem) {
    this.steps.add(stepsItem);
    return this;
  }

   /**
   * Get steps
   * @return steps
  **/
  @javax.annotation.Nullable

  public List<AutoTestStepModel> getSteps() {
    return steps;
  }


  public void setSteps(List<AutoTestStepModel> steps) {
    this.steps = steps;
  }


  public AutoTestModelV2GetModel setup(List<AutoTestStepModel> setup) {
    
    this.setup = setup;
    return this;
  }

  public AutoTestModelV2GetModel addSetupItem(AutoTestStepModel setupItem) {
    this.setup.add(setupItem);
    return this;
  }

   /**
   * Get setup
   * @return setup
  **/
  @javax.annotation.Nullable

  public List<AutoTestStepModel> getSetup() {
    return setup;
  }


  public void setSetup(List<AutoTestStepModel> setup) {
    this.setup = setup;
  }


  public AutoTestModelV2GetModel teardown(List<AutoTestStepModel> teardown) {
    
    this.teardown = teardown;
    return this;
  }

  public AutoTestModelV2GetModel addTeardownItem(AutoTestStepModel teardownItem) {
    this.teardown.add(teardownItem);
    return this;
  }

   /**
   * Get teardown
   * @return teardown
  **/
  @javax.annotation.Nullable

  public List<AutoTestStepModel> getTeardown() {
    return teardown;
  }


  public void setTeardown(List<AutoTestStepModel> teardown) {
    this.teardown = teardown;
  }


  public AutoTestModelV2GetModel globalId(Long globalId) {
    
    this.globalId = globalId;
    return this;
  }

   /**
   * Get globalId
   * @return globalId
  **/
  @javax.annotation.Nullable

  public Long getGlobalId() {
    return globalId;
  }


  public void setGlobalId(Long globalId) {
    this.globalId = globalId;
  }


  public AutoTestModelV2GetModel createdDate(OffsetDateTime createdDate) {
    
    this.createdDate = createdDate;
    return this;
  }

   /**
   * Get createdDate
   * @return createdDate
  **/
  @javax.annotation.Nullable

  public OffsetDateTime getCreatedDate() {
    return createdDate;
  }


  public void setCreatedDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
  }


  public AutoTestModelV2GetModel modifiedDate(OffsetDateTime modifiedDate) {
    
    this.modifiedDate = modifiedDate;
    return this;
  }

   /**
   * Get modifiedDate
   * @return modifiedDate
  **/
  @javax.annotation.Nullable

  public OffsetDateTime getModifiedDate() {
    return modifiedDate;
  }


  public void setModifiedDate(OffsetDateTime modifiedDate) {
    this.modifiedDate = modifiedDate;
  }


  public AutoTestModelV2GetModel createdById(UUID createdById) {
    
    this.createdById = createdById;
    return this;
  }

   /**
   * Get createdById
   * @return createdById
  **/
  @javax.annotation.Nullable

  public UUID getCreatedById() {
    return createdById;
  }


  public void setCreatedById(UUID createdById) {
    this.createdById = createdById;
  }


  public AutoTestModelV2GetModel modifiedById(UUID modifiedById) {
    
    this.modifiedById = modifiedById;
    return this;
  }

   /**
   * Get modifiedById
   * @return modifiedById
  **/
  @javax.annotation.Nullable

  public UUID getModifiedById() {
    return modifiedById;
  }


  public void setModifiedById(UUID modifiedById) {
    this.modifiedById = modifiedById;
  }


  public AutoTestModelV2GetModel labels(List<LabelShortModel> labels) {
    
    this.labels = labels;
    return this;
  }

  public AutoTestModelV2GetModel addLabelsItem(LabelShortModel labelsItem) {
    this.labels.add(labelsItem);
    return this;
  }

   /**
   * Get labels
   * @return labels
  **/
  @javax.annotation.Nullable

  public List<LabelShortModel> getLabels() {
    return labels;
  }


  public void setLabels(List<LabelShortModel> labels) {
    this.labels = labels;
  }


  public AutoTestModelV2GetModel id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * Unique ID of the entity
   * @return id
  **/
  @javax.annotation.Nullable

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public AutoTestModelV2GetModel isDeleted(Boolean isDeleted) {
    
    this.isDeleted = isDeleted;
    return this;
  }

   /**
   * Indicates if the entity is deleted
   * @return isDeleted
  **/
  @javax.annotation.Nullable

  public Boolean getIsDeleted() {
    return isDeleted;
  }


  public void setIsDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutoTestModelV2GetModel autoTestModelV2GetModel = (AutoTestModelV2GetModel) o;
    return Objects.equals(this.externalId, autoTestModelV2GetModel.externalId) &&
        Objects.equals(this.links, autoTestModelV2GetModel.links) &&
        Objects.equals(this.projectId, autoTestModelV2GetModel.projectId) &&
        Objects.equals(this.name, autoTestModelV2GetModel.name) &&
        Objects.equals(this.namespace, autoTestModelV2GetModel.namespace) &&
        Objects.equals(this.classname, autoTestModelV2GetModel.classname) &&
        Objects.equals(this.steps, autoTestModelV2GetModel.steps) &&
        Objects.equals(this.setup, autoTestModelV2GetModel.setup) &&
        Objects.equals(this.teardown, autoTestModelV2GetModel.teardown) &&
        Objects.equals(this.globalId, autoTestModelV2GetModel.globalId) &&
        Objects.equals(this.createdDate, autoTestModelV2GetModel.createdDate) &&
        Objects.equals(this.modifiedDate, autoTestModelV2GetModel.modifiedDate) &&
        Objects.equals(this.createdById, autoTestModelV2GetModel.createdById) &&
        Objects.equals(this.modifiedById, autoTestModelV2GetModel.modifiedById) &&
        Objects.equals(this.labels, autoTestModelV2GetModel.labels) &&
        Objects.equals(this.id, autoTestModelV2GetModel.id) &&
        Objects.equals(this.isDeleted, autoTestModelV2GetModel.isDeleted);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalId, links, projectId, name, namespace, classname, steps, setup, teardown, globalId, createdDate, modifiedDate, createdById, modifiedById, labels, id, isDeleted);
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
    sb.append("class AutoTestModelV2GetModel {\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    classname: ").append(toIndentedString(classname)).append("\n");
    sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
    sb.append("    setup: ").append(toIndentedString(setup)).append("\n");
    sb.append("    teardown: ").append(toIndentedString(teardown)).append("\n");
    sb.append("    globalId: ").append(toIndentedString(globalId)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
    sb.append("    createdById: ").append(toIndentedString(createdById)).append("\n");
    sb.append("    modifiedById: ").append(toIndentedString(modifiedById)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
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
    openapiFields.add("externalId");
    openapiFields.add("links");
    openapiFields.add("projectId");
    openapiFields.add("name");
    openapiFields.add("namespace");
    openapiFields.add("classname");
    openapiFields.add("steps");
    openapiFields.add("setup");
    openapiFields.add("teardown");
    openapiFields.add("globalId");
    openapiFields.add("createdDate");
    openapiFields.add("modifiedDate");
    openapiFields.add("createdById");
    openapiFields.add("modifiedById");
    openapiFields.add("labels");
    openapiFields.add("id");
    openapiFields.add("isDeleted");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AutoTestModelV2GetModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AutoTestModelV2GetModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AutoTestModelV2GetModel is not found in the empty JSON string", AutoTestModelV2GetModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AutoTestModelV2GetModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AutoTestModelV2GetModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("externalId") != null && !jsonObj.get("externalId").isJsonNull()) && !jsonObj.get("externalId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `externalId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("externalId").toString()));
      }
      if (jsonObj.get("links") != null && !jsonObj.get("links").isJsonNull()) {
        JsonArray jsonArraylinks = jsonObj.getAsJsonArray("links");
        if (jsonArraylinks != null) {
          // ensure the json data is an array
          if (!jsonObj.get("links").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `links` to be an array in the JSON string but got `%s`", jsonObj.get("links").toString()));
          }

          // validate the optional field `links` (array)
          for (int i = 0; i < jsonArraylinks.size(); i++) {
            LinkModel.validateJsonObject(jsonArraylinks.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("projectId") != null && !jsonObj.get("projectId").isJsonNull()) && !jsonObj.get("projectId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `projectId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("projectId").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("namespace") != null && !jsonObj.get("namespace").isJsonNull()) && !jsonObj.get("namespace").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `namespace` to be a primitive type in the JSON string but got `%s`", jsonObj.get("namespace").toString()));
      }
      if ((jsonObj.get("classname") != null && !jsonObj.get("classname").isJsonNull()) && !jsonObj.get("classname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `classname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("classname").toString()));
      }
      if (jsonObj.get("steps") != null && !jsonObj.get("steps").isJsonNull()) {
        JsonArray jsonArraysteps = jsonObj.getAsJsonArray("steps");
        if (jsonArraysteps != null) {
          // ensure the json data is an array
          if (!jsonObj.get("steps").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `steps` to be an array in the JSON string but got `%s`", jsonObj.get("steps").toString()));
          }

          // validate the optional field `steps` (array)
          for (int i = 0; i < jsonArraysteps.size(); i++) {
            AutoTestStepModel.validateJsonObject(jsonArraysteps.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("setup") != null && !jsonObj.get("setup").isJsonNull()) {
        JsonArray jsonArraysetup = jsonObj.getAsJsonArray("setup");
        if (jsonArraysetup != null) {
          // ensure the json data is an array
          if (!jsonObj.get("setup").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `setup` to be an array in the JSON string but got `%s`", jsonObj.get("setup").toString()));
          }

          // validate the optional field `setup` (array)
          for (int i = 0; i < jsonArraysetup.size(); i++) {
            AutoTestStepModel.validateJsonObject(jsonArraysetup.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("teardown") != null && !jsonObj.get("teardown").isJsonNull()) {
        JsonArray jsonArrayteardown = jsonObj.getAsJsonArray("teardown");
        if (jsonArrayteardown != null) {
          // ensure the json data is an array
          if (!jsonObj.get("teardown").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `teardown` to be an array in the JSON string but got `%s`", jsonObj.get("teardown").toString()));
          }

          // validate the optional field `teardown` (array)
          for (int i = 0; i < jsonArrayteardown.size(); i++) {
            AutoTestStepModel.validateJsonObject(jsonArrayteardown.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("createdById") != null && !jsonObj.get("createdById").isJsonNull()) && !jsonObj.get("createdById").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `createdById` to be a primitive type in the JSON string but got `%s`", jsonObj.get("createdById").toString()));
      }
      if ((jsonObj.get("modifiedById") != null && !jsonObj.get("modifiedById").isJsonNull()) && !jsonObj.get("modifiedById").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `modifiedById` to be a primitive type in the JSON string but got `%s`", jsonObj.get("modifiedById").toString()));
      }
      if (jsonObj.get("labels") != null && !jsonObj.get("labels").isJsonNull()) {
        JsonArray jsonArraylabels = jsonObj.getAsJsonArray("labels");
        if (jsonArraylabels != null) {
          // ensure the json data is an array
          if (!jsonObj.get("labels").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `labels` to be an array in the JSON string but got `%s`", jsonObj.get("labels").toString()));
          }

          // validate the optional field `labels` (array)
          for (int i = 0; i < jsonArraylabels.size(); i++) {
            LabelShortModel.validateJsonObject(jsonArraylabels.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AutoTestModelV2GetModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AutoTestModelV2GetModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AutoTestModelV2GetModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AutoTestModelV2GetModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AutoTestModelV2GetModel>() {
           @Override
           public void write(JsonWriter out, AutoTestModelV2GetModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AutoTestModelV2GetModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AutoTestModelV2GetModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AutoTestModelV2GetModel
  * @throws IOException if the JSON string is invalid with respect to AutoTestModelV2GetModel
  */
  public static AutoTestModelV2GetModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AutoTestModelV2GetModel.class);
  }

 /**
  * Convert an instance of AutoTestModelV2GetModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

