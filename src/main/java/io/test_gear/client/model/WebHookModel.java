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
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
-gear.client.model.WebHookEventTypeModel;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;-gear.client.invoker.JSON;


/**
 * WebHookModel
 */
@JsonPropertyOrder({
  WebHookModel.JSON_PROPERTY_NAME,
  WebHookModel.JSON_PROPERTY_EVENT_TYPE,
  WebHookModel.JSON_PROPERTY_DESCRIPTION,
  WebHookModel.JSON_PROPERTY_URL,
  WebHookModel.JSON_PROPERTY_REQUEST_TYPE,
  WebHookModel.JSON_PROPERTY_SHOULD_SEND_BODY,
  WebHookModel.JSON_PROPERTY_HEADERS,
  WebHookModel.JSON_PROPERTY_QUERY_PARAMETERS,
  WebHookModel.JSON_PROPERTY_IS_ENABLED,
  WebHookModel.JSON_PROPERTY_SHOULD_SEND_CUSTOM_BODY,
  WebHookModel.JSON_PROPERTY_CUSTOM_BODY,
  WebHookModel.JSON_PROPERTY_CUSTOM_BODY_MEDIA_TYPE,
  WebHookModel.JSON_PROPERTY_SHOULD_REPLACE_PARAMETERS,
  WebHookModel.JSON_PROPERTY_SHOULD_ESCAPE_PARAMETERS,
  WebHookModel.JSON_PROPERTY_CREATED_DATE,
  WebHookModel.JSON_PROPERTY_MODIFIED_DATE,
  WebHookModel.JSON_PROPERTY_CREATED_BY_ID,
  WebHookModel.JSON_PROPERTY_MODIFIED_BY_ID,
  WebHookModel.JSON_PROPERTY_PROJECT_ID,
  WebHookModel.JSON_PROPERTY_ID,
  WebHookModel.JSON_PROPERTY_IS_DELETED
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class WebHookModel {
  public static final String JSON_PROPERTY_NAME = "name";
  private JsonNullable<String> name = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_EVENT_TYPE = "eventType";
  private WebHookEventTypeModel eventType;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private JsonNullable<String> description = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_URL = "url";
  private JsonNullable<String> url = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_REQUEST_TYPE = "requestType";
  private RequestTypeModel requestType;

  public static final String JSON_PROPERTY_SHOULD_SEND_BODY = "shouldSendBody";
  private Boolean shouldSendBody;

  public static final String JSON_PROPERTY_HEADERS = "headers";
  private JsonNullable<Map<String, String>> headers = JsonNullable.<Map<String, String>>undefined();

  public static final String JSON_PROPERTY_QUERY_PARAMETERS = "queryParameters";
  private JsonNullable<Map<String, String>> queryParameters = JsonNullable.<Map<String, String>>undefined();

  public static final String JSON_PROPERTY_IS_ENABLED = "isEnabled";
  private Boolean isEnabled;

  public static final String JSON_PROPERTY_SHOULD_SEND_CUSTOM_BODY = "shouldSendCustomBody";
  private Boolean shouldSendCustomBody;

  public static final String JSON_PROPERTY_CUSTOM_BODY = "customBody";
  private JsonNullable<String> customBody = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CUSTOM_BODY_MEDIA_TYPE = "customBodyMediaType";
  private JsonNullable<String> customBodyMediaType = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SHOULD_REPLACE_PARAMETERS = "shouldReplaceParameters";
  private Boolean shouldReplaceParameters;

  public static final String JSON_PROPERTY_SHOULD_ESCAPE_PARAMETERS = "shouldEscapeParameters";
  private Boolean shouldEscapeParameters;

  public static final String JSON_PROPERTY_CREATED_DATE = "createdDate";
  private JsonNullable<OffsetDateTime> createdDate = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_MODIFIED_DATE = "modifiedDate";
  private JsonNullable<OffsetDateTime> modifiedDate = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_CREATED_BY_ID = "createdById";
  private UUID createdById;

  public static final String JSON_PROPERTY_MODIFIED_BY_ID = "modifiedById";
  private JsonNullable<UUID> modifiedById = JsonNullable.<UUID>undefined();

  public static final String JSON_PROPERTY_PROJECT_ID = "projectId";
  private UUID projectId;

  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_IS_DELETED = "isDeleted";
  private Boolean isDeleted;

  public WebHookModel() { 
  }

  public WebHookModel name(String name) {
    this.name = JsonNullable.<String>of(name);
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getName() {
        return name.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getName_JsonNullable() {
    return name;
  }
  
  @JsonProperty(JSON_PROPERTY_NAME)
  public void setName_JsonNullable(JsonNullable<String> name) {
    this.name = name;
  }

  public void setName(String name) {
    this.name = JsonNullable.<String>of(name);
  }


  public WebHookModel eventType(WebHookEventTypeModel eventType) {
    this.eventType = eventType;
    return this;
  }

   /**
   * Get eventType
   * @return eventType
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EVENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public WebHookEventTypeModel getEventType() {
    return eventType;
  }


  @JsonProperty(JSON_PROPERTY_EVENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEventType(WebHookEventTypeModel eventType) {
    this.eventType = eventType;
  }


  public WebHookModel description(String description) {
    this.description = JsonNullable.<String>of(description);
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getDescription() {
        return description.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getDescription_JsonNullable() {
    return description;
  }
  
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  public void setDescription_JsonNullable(JsonNullable<String> description) {
    this.description = description;
  }

  public void setDescription(String description) {
    this.description = JsonNullable.<String>of(description);
  }


  public WebHookModel url(String url) {
    this.url = JsonNullable.<String>of(url);
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getUrl() {
        return url.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getUrl_JsonNullable() {
    return url;
  }
  
  @JsonProperty(JSON_PROPERTY_URL)
  public void setUrl_JsonNullable(JsonNullable<String> url) {
    this.url = url;
  }

  public void setUrl(String url) {
    this.url = JsonNullable.<String>of(url);
  }


  public WebHookModel requestType(RequestTypeModel requestType) {
    this.requestType = requestType;
    return this;
  }

   /**
   * Get requestType
   * @return requestType
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REQUEST_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RequestTypeModel getRequestType() {
    return requestType;
  }


  @JsonProperty(JSON_PROPERTY_REQUEST_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRequestType(RequestTypeModel requestType) {
    this.requestType = requestType;
  }


  public WebHookModel shouldSendBody(Boolean shouldSendBody) {
    this.shouldSendBody = shouldSendBody;
    return this;
  }

   /**
   * Get shouldSendBody
   * @return shouldSendBody
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SHOULD_SEND_BODY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getShouldSendBody() {
    return shouldSendBody;
  }


  @JsonProperty(JSON_PROPERTY_SHOULD_SEND_BODY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShouldSendBody(Boolean shouldSendBody) {
    this.shouldSendBody = shouldSendBody;
  }


  public WebHookModel headers(Map<String, String> headers) {
    this.headers = JsonNullable.<Map<String, String>>of(headers);
    return this;
  }

  public WebHookModel putHeadersItem(String key, String headersItem) {
    if (this.headers == null || !this.headers.isPresent()) {
      this.headers = JsonNullable.<Map<String, String>>of(new HashMap<>());
    }
    try {
      this.headers.get().put(key, headersItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get headers
   * @return headers
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public Map<String, String> getHeaders() {
        return headers.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_HEADERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Map<String, String>> getHeaders_JsonNullable() {
    return headers;
  }
  
  @JsonProperty(JSON_PROPERTY_HEADERS)
  public void setHeaders_JsonNullable(JsonNullable<Map<String, String>> headers) {
    this.headers = headers;
  }

  public void setHeaders(Map<String, String> headers) {
    this.headers = JsonNullable.<Map<String, String>>of(headers);
  }


  public WebHookModel queryParameters(Map<String, String> queryParameters) {
    this.queryParameters = JsonNullable.<Map<String, String>>of(queryParameters);
    return this;
  }

  public WebHookModel putQueryParametersItem(String key, String queryParametersItem) {
    if (this.queryParameters == null || !this.queryParameters.isPresent()) {
      this.queryParameters = JsonNullable.<Map<String, String>>of(new HashMap<>());
    }
    try {
      this.queryParameters.get().put(key, queryParametersItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get queryParameters
   * @return queryParameters
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public Map<String, String> getQueryParameters() {
        return queryParameters.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_QUERY_PARAMETERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Map<String, String>> getQueryParameters_JsonNullable() {
    return queryParameters;
  }
  
  @JsonProperty(JSON_PROPERTY_QUERY_PARAMETERS)
  public void setQueryParameters_JsonNullable(JsonNullable<Map<String, String>> queryParameters) {
    this.queryParameters = queryParameters;
  }

  public void setQueryParameters(Map<String, String> queryParameters) {
    this.queryParameters = JsonNullable.<Map<String, String>>of(queryParameters);
  }


  public WebHookModel isEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }

   /**
   * Get isEnabled
   * @return isEnabled
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsEnabled() {
    return isEnabled;
  }


  @JsonProperty(JSON_PROPERTY_IS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }


  public WebHookModel shouldSendCustomBody(Boolean shouldSendCustomBody) {
    this.shouldSendCustomBody = shouldSendCustomBody;
    return this;
  }

   /**
   * Get shouldSendCustomBody
   * @return shouldSendCustomBody
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SHOULD_SEND_CUSTOM_BODY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getShouldSendCustomBody() {
    return shouldSendCustomBody;
  }


  @JsonProperty(JSON_PROPERTY_SHOULD_SEND_CUSTOM_BODY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShouldSendCustomBody(Boolean shouldSendCustomBody) {
    this.shouldSendCustomBody = shouldSendCustomBody;
  }


  public WebHookModel customBody(String customBody) {
    this.customBody = JsonNullable.<String>of(customBody);
    return this;
  }

   /**
   * Get customBody
   * @return customBody
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getCustomBody() {
        return customBody.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CUSTOM_BODY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCustomBody_JsonNullable() {
    return customBody;
  }
  
  @JsonProperty(JSON_PROPERTY_CUSTOM_BODY)
  public void setCustomBody_JsonNullable(JsonNullable<String> customBody) {
    this.customBody = customBody;
  }

  public void setCustomBody(String customBody) {
    this.customBody = JsonNullable.<String>of(customBody);
  }


  public WebHookModel customBodyMediaType(String customBodyMediaType) {
    this.customBodyMediaType = JsonNullable.<String>of(customBodyMediaType);
    return this;
  }

   /**
   * Get customBodyMediaType
   * @return customBodyMediaType
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getCustomBodyMediaType() {
        return customBodyMediaType.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CUSTOM_BODY_MEDIA_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCustomBodyMediaType_JsonNullable() {
    return customBodyMediaType;
  }
  
  @JsonProperty(JSON_PROPERTY_CUSTOM_BODY_MEDIA_TYPE)
  public void setCustomBodyMediaType_JsonNullable(JsonNullable<String> customBodyMediaType) {
    this.customBodyMediaType = customBodyMediaType;
  }

  public void setCustomBodyMediaType(String customBodyMediaType) {
    this.customBodyMediaType = JsonNullable.<String>of(customBodyMediaType);
  }


  public WebHookModel shouldReplaceParameters(Boolean shouldReplaceParameters) {
    this.shouldReplaceParameters = shouldReplaceParameters;
    return this;
  }

   /**
   * Get shouldReplaceParameters
   * @return shouldReplaceParameters
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SHOULD_REPLACE_PARAMETERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getShouldReplaceParameters() {
    return shouldReplaceParameters;
  }


  @JsonProperty(JSON_PROPERTY_SHOULD_REPLACE_PARAMETERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShouldReplaceParameters(Boolean shouldReplaceParameters) {
    this.shouldReplaceParameters = shouldReplaceParameters;
  }


  public WebHookModel shouldEscapeParameters(Boolean shouldEscapeParameters) {
    this.shouldEscapeParameters = shouldEscapeParameters;
    return this;
  }

   /**
   * Get shouldEscapeParameters
   * @return shouldEscapeParameters
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SHOULD_ESCAPE_PARAMETERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getShouldEscapeParameters() {
    return shouldEscapeParameters;
  }


  @JsonProperty(JSON_PROPERTY_SHOULD_ESCAPE_PARAMETERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShouldEscapeParameters(Boolean shouldEscapeParameters) {
    this.shouldEscapeParameters = shouldEscapeParameters;
  }


  public WebHookModel createdDate(OffsetDateTime createdDate) {
    this.createdDate = JsonNullable.<OffsetDateTime>of(createdDate);
    return this;
  }

   /**
   * Get createdDate
   * @return createdDate
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public OffsetDateTime getCreatedDate() {
        return createdDate.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CREATED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<OffsetDateTime> getCreatedDate_JsonNullable() {
    return createdDate;
  }
  
  @JsonProperty(JSON_PROPERTY_CREATED_DATE)
  public void setCreatedDate_JsonNullable(JsonNullable<OffsetDateTime> createdDate) {
    this.createdDate = createdDate;
  }

  public void setCreatedDate(OffsetDateTime createdDate) {
    this.createdDate = JsonNullable.<OffsetDateTime>of(createdDate);
  }


  public WebHookModel modifiedDate(OffsetDateTime modifiedDate) {
    this.modifiedDate = JsonNullable.<OffsetDateTime>of(modifiedDate);
    return this;
  }

   /**
   * Get modifiedDate
   * @return modifiedDate
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public OffsetDateTime getModifiedDate() {
        return modifiedDate.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MODIFIED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<OffsetDateTime> getModifiedDate_JsonNullable() {
    return modifiedDate;
  }
  
  @JsonProperty(JSON_PROPERTY_MODIFIED_DATE)
  public void setModifiedDate_JsonNullable(JsonNullable<OffsetDateTime> modifiedDate) {
    this.modifiedDate = modifiedDate;
  }

  public void setModifiedDate(OffsetDateTime modifiedDate) {
    this.modifiedDate = JsonNullable.<OffsetDateTime>of(modifiedDate);
  }


  public WebHookModel createdById(UUID createdById) {
    this.createdById = createdById;
    return this;
  }

   /**
   * Get createdById
   * @return createdById
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREATED_BY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getCreatedById() {
    return createdById;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_BY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedById(UUID createdById) {
    this.createdById = createdById;
  }


  public WebHookModel modifiedById(UUID modifiedById) {
    this.modifiedById = JsonNullable.<UUID>of(modifiedById);
    return this;
  }

   /**
   * Get modifiedById
   * @return modifiedById
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public UUID getModifiedById() {
        return modifiedById.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MODIFIED_BY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<UUID> getModifiedById_JsonNullable() {
    return modifiedById;
  }
  
  @JsonProperty(JSON_PROPERTY_MODIFIED_BY_ID)
  public void setModifiedById_JsonNullable(JsonNullable<UUID> modifiedById) {
    this.modifiedById = modifiedById;
  }

  public void setModifiedById(UUID modifiedById) {
    this.modifiedById = JsonNullable.<UUID>of(modifiedById);
  }


  public WebHookModel projectId(UUID projectId) {
    this.projectId = projectId;
    return this;
  }

   /**
   * Get projectId
   * @return projectId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PROJECT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getProjectId() {
    return projectId;
  }


  @JsonProperty(JSON_PROPERTY_PROJECT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProjectId(UUID projectId) {
    this.projectId = projectId;
  }


  public WebHookModel id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "ceab5447-3791-4566-954f-8f2f7347a854", value = "")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(UUID id) {
    this.id = id;
  }


  public WebHookModel isDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
    return this;
  }

   /**
   * Get isDeleted
   * @return isDeleted
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")
  @JsonProperty(JSON_PROPERTY_IS_DELETED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsDeleted() {
    return isDeleted;
  }


  @JsonProperty(JSON_PROPERTY_IS_DELETED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
  }


  /**
   * Return true if this WebHookModel object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebHookModel webHookModel = (WebHookModel) o;
    return equalsNullable(this.name, webHookModel.name) &&
        Objects.equals(this.eventType, webHookModel.eventType) &&
        equalsNullable(this.description, webHookModel.description) &&
        equalsNullable(this.url, webHookModel.url) &&
        Objects.equals(this.requestType, webHookModel.requestType) &&
        Objects.equals(this.shouldSendBody, webHookModel.shouldSendBody) &&
        equalsNullable(this.headers, webHookModel.headers) &&
        equalsNullable(this.queryParameters, webHookModel.queryParameters) &&
        Objects.equals(this.isEnabled, webHookModel.isEnabled) &&
        Objects.equals(this.shouldSendCustomBody, webHookModel.shouldSendCustomBody) &&
        equalsNullable(this.customBody, webHookModel.customBody) &&
        equalsNullable(this.customBodyMediaType, webHookModel.customBodyMediaType) &&
        Objects.equals(this.shouldReplaceParameters, webHookModel.shouldReplaceParameters) &&
        Objects.equals(this.shouldEscapeParameters, webHookModel.shouldEscapeParameters) &&
        equalsNullable(this.createdDate, webHookModel.createdDate) &&
        equalsNullable(this.modifiedDate, webHookModel.modifiedDate) &&
        Objects.equals(this.createdById, webHookModel.createdById) &&
        equalsNullable(this.modifiedById, webHookModel.modifiedById) &&
        Objects.equals(this.projectId, webHookModel.projectId) &&
        Objects.equals(this.id, webHookModel.id) &&
        Objects.equals(this.isDeleted, webHookModel.isDeleted);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(name), eventType, hashCodeNullable(description), hashCodeNullable(url), requestType, shouldSendBody, hashCodeNullable(headers), hashCodeNullable(queryParameters), isEnabled, shouldSendCustomBody, hashCodeNullable(customBody), hashCodeNullable(customBodyMediaType), shouldReplaceParameters, shouldEscapeParameters, hashCodeNullable(createdDate), hashCodeNullable(modifiedDate), createdById, hashCodeNullable(modifiedById), projectId, id, isDeleted);
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
    sb.append("class WebHookModel {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    requestType: ").append(toIndentedString(requestType)).append("\n");
    sb.append("    shouldSendBody: ").append(toIndentedString(shouldSendBody)).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
    sb.append("    queryParameters: ").append(toIndentedString(queryParameters)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    shouldSendCustomBody: ").append(toIndentedString(shouldSendCustomBody)).append("\n");
    sb.append("    customBody: ").append(toIndentedString(customBody)).append("\n");
    sb.append("    customBodyMediaType: ").append(toIndentedString(customBodyMediaType)).append("\n");
    sb.append("    shouldReplaceParameters: ").append(toIndentedString(shouldReplaceParameters)).append("\n");
    sb.append("    shouldEscapeParameters: ").append(toIndentedString(shouldEscapeParameters)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
    sb.append("    createdById: ").append(toIndentedString(createdById)).append("\n");
    sb.append("    modifiedById: ").append(toIndentedString(modifiedById)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
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

}

