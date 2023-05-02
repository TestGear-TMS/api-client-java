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
import java.io.IOException;
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
 * ExternalLinkModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ExternalLinkModel {
  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_ISSUE_TYPE_NAME = "issueTypeName";
  @SerializedName(SERIALIZED_NAME_ISSUE_TYPE_NAME)
  private String issueTypeName;

  public static final String SERIALIZED_NAME_ISSUE_TYPE_ICON_URL = "issueTypeIconUrl";
  @SerializedName(SERIALIZED_NAME_ISSUE_TYPE_ICON_URL)
  private String issueTypeIconUrl;

  public static final String SERIALIZED_NAME_PRIORITY_NAME = "priorityName";
  @SerializedName(SERIALIZED_NAME_PRIORITY_NAME)
  private String priorityName;

  public static final String SERIALIZED_NAME_PRIORITY_ICON_URL = "priorityIconUrl";
  @SerializedName(SERIALIZED_NAME_PRIORITY_ICON_URL)
  private String priorityIconUrl;

  public static final String SERIALIZED_NAME_STATUS_NAME = "statusName";
  @SerializedName(SERIALIZED_NAME_STATUS_NAME)
  private String statusName;

  public static final String SERIALIZED_NAME_ASSIGNEE_DISPLAY_NAME = "assigneeDisplayName";
  @SerializedName(SERIALIZED_NAME_ASSIGNEE_DISPLAY_NAME)
  private String assigneeDisplayName;

  public ExternalLinkModel() {
  }

  public ExternalLinkModel url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @javax.annotation.Nullable

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public ExternalLinkModel title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @javax.annotation.Nullable

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public ExternalLinkModel issueTypeName(String issueTypeName) {
    
    this.issueTypeName = issueTypeName;
    return this;
  }

   /**
   * Get issueTypeName
   * @return issueTypeName
  **/
  @javax.annotation.Nullable

  public String getIssueTypeName() {
    return issueTypeName;
  }


  public void setIssueTypeName(String issueTypeName) {
    this.issueTypeName = issueTypeName;
  }


  public ExternalLinkModel issueTypeIconUrl(String issueTypeIconUrl) {
    
    this.issueTypeIconUrl = issueTypeIconUrl;
    return this;
  }

   /**
   * Get issueTypeIconUrl
   * @return issueTypeIconUrl
  **/
  @javax.annotation.Nullable

  public String getIssueTypeIconUrl() {
    return issueTypeIconUrl;
  }


  public void setIssueTypeIconUrl(String issueTypeIconUrl) {
    this.issueTypeIconUrl = issueTypeIconUrl;
  }


  public ExternalLinkModel priorityName(String priorityName) {
    
    this.priorityName = priorityName;
    return this;
  }

   /**
   * Get priorityName
   * @return priorityName
  **/
  @javax.annotation.Nullable

  public String getPriorityName() {
    return priorityName;
  }


  public void setPriorityName(String priorityName) {
    this.priorityName = priorityName;
  }


  public ExternalLinkModel priorityIconUrl(String priorityIconUrl) {
    
    this.priorityIconUrl = priorityIconUrl;
    return this;
  }

   /**
   * Get priorityIconUrl
   * @return priorityIconUrl
  **/
  @javax.annotation.Nullable

  public String getPriorityIconUrl() {
    return priorityIconUrl;
  }


  public void setPriorityIconUrl(String priorityIconUrl) {
    this.priorityIconUrl = priorityIconUrl;
  }


  public ExternalLinkModel statusName(String statusName) {
    
    this.statusName = statusName;
    return this;
  }

   /**
   * Get statusName
   * @return statusName
  **/
  @javax.annotation.Nullable

  public String getStatusName() {
    return statusName;
  }


  public void setStatusName(String statusName) {
    this.statusName = statusName;
  }


  public ExternalLinkModel assigneeDisplayName(String assigneeDisplayName) {
    
    this.assigneeDisplayName = assigneeDisplayName;
    return this;
  }

   /**
   * Get assigneeDisplayName
   * @return assigneeDisplayName
  **/
  @javax.annotation.Nullable

  public String getAssigneeDisplayName() {
    return assigneeDisplayName;
  }


  public void setAssigneeDisplayName(String assigneeDisplayName) {
    this.assigneeDisplayName = assigneeDisplayName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalLinkModel externalLinkModel = (ExternalLinkModel) o;
    return Objects.equals(this.url, externalLinkModel.url) &&
        Objects.equals(this.title, externalLinkModel.title) &&
        Objects.equals(this.issueTypeName, externalLinkModel.issueTypeName) &&
        Objects.equals(this.issueTypeIconUrl, externalLinkModel.issueTypeIconUrl) &&
        Objects.equals(this.priorityName, externalLinkModel.priorityName) &&
        Objects.equals(this.priorityIconUrl, externalLinkModel.priorityIconUrl) &&
        Objects.equals(this.statusName, externalLinkModel.statusName) &&
        Objects.equals(this.assigneeDisplayName, externalLinkModel.assigneeDisplayName);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, title, issueTypeName, issueTypeIconUrl, priorityName, priorityIconUrl, statusName, assigneeDisplayName);
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
    sb.append("class ExternalLinkModel {\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    issueTypeName: ").append(toIndentedString(issueTypeName)).append("\n");
    sb.append("    issueTypeIconUrl: ").append(toIndentedString(issueTypeIconUrl)).append("\n");
    sb.append("    priorityName: ").append(toIndentedString(priorityName)).append("\n");
    sb.append("    priorityIconUrl: ").append(toIndentedString(priorityIconUrl)).append("\n");
    sb.append("    statusName: ").append(toIndentedString(statusName)).append("\n");
    sb.append("    assigneeDisplayName: ").append(toIndentedString(assigneeDisplayName)).append("\n");
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
    openapiFields.add("url");
    openapiFields.add("title");
    openapiFields.add("issueTypeName");
    openapiFields.add("issueTypeIconUrl");
    openapiFields.add("priorityName");
    openapiFields.add("priorityIconUrl");
    openapiFields.add("statusName");
    openapiFields.add("assigneeDisplayName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ExternalLinkModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ExternalLinkModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ExternalLinkModel is not found in the empty JSON string", ExternalLinkModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ExternalLinkModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ExternalLinkModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull()) && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      if ((jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if ((jsonObj.get("issueTypeName") != null && !jsonObj.get("issueTypeName").isJsonNull()) && !jsonObj.get("issueTypeName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `issueTypeName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("issueTypeName").toString()));
      }
      if ((jsonObj.get("issueTypeIconUrl") != null && !jsonObj.get("issueTypeIconUrl").isJsonNull()) && !jsonObj.get("issueTypeIconUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `issueTypeIconUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("issueTypeIconUrl").toString()));
      }
      if ((jsonObj.get("priorityName") != null && !jsonObj.get("priorityName").isJsonNull()) && !jsonObj.get("priorityName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `priorityName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("priorityName").toString()));
      }
      if ((jsonObj.get("priorityIconUrl") != null && !jsonObj.get("priorityIconUrl").isJsonNull()) && !jsonObj.get("priorityIconUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `priorityIconUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("priorityIconUrl").toString()));
      }
      if ((jsonObj.get("statusName") != null && !jsonObj.get("statusName").isJsonNull()) && !jsonObj.get("statusName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `statusName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("statusName").toString()));
      }
      if ((jsonObj.get("assigneeDisplayName") != null && !jsonObj.get("assigneeDisplayName").isJsonNull()) && !jsonObj.get("assigneeDisplayName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `assigneeDisplayName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("assigneeDisplayName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ExternalLinkModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ExternalLinkModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ExternalLinkModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ExternalLinkModel.class));

       return (TypeAdapter<T>) new TypeAdapter<ExternalLinkModel>() {
           @Override
           public void write(JsonWriter out, ExternalLinkModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ExternalLinkModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ExternalLinkModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ExternalLinkModel
  * @throws IOException if the JSON string is invalid with respect to ExternalLinkModel
  */
  public static ExternalLinkModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ExternalLinkModel.class);
  }

 /**
  * Convert an instance of ExternalLinkModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

