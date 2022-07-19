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
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
-gear.client.model.TagShortModel;
-gear.client.model.TestPlanStatusModel;
-gear.client.model.TestPointAnalyticResult;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * TestPlanWithAnalyticModel
 */
@JsonPropertyOrder({
  TestPlanWithAnalyticModel.JSON_PROPERTY_ANALYTIC,
  TestPlanWithAnalyticModel.JSON_PROPERTY_STATUS,
  TestPlanWithAnalyticModel.JSON_PROPERTY_STARTED_ON,
  TestPlanWithAnalyticModel.JSON_PROPERTY_COMPLETED_ON,
  TestPlanWithAnalyticModel.JSON_PROPERTY_CREATED_DATE,
  TestPlanWithAnalyticModel.JSON_PROPERTY_MODIFIED_DATE,
  TestPlanWithAnalyticModel.JSON_PROPERTY_CREATED_BY_ID,
  TestPlanWithAnalyticModel.JSON_PROPERTY_MODIFIED_BY_ID,
  TestPlanWithAnalyticModel.JSON_PROPERTY_GLOBAL_ID,
  TestPlanWithAnalyticModel.JSON_PROPERTY_IS_DELETED,
  TestPlanWithAnalyticModel.JSON_PROPERTY_LOCKED_DATE,
  TestPlanWithAnalyticModel.JSON_PROPERTY_ID,
  TestPlanWithAnalyticModel.JSON_PROPERTY_LOCKED_BY_ID,
  TestPlanWithAnalyticModel.JSON_PROPERTY_TAGS,
  TestPlanWithAnalyticModel.JSON_PROPERTY_NAME,
  TestPlanWithAnalyticModel.JSON_PROPERTY_START_DATE,
  TestPlanWithAnalyticModel.JSON_PROPERTY_END_DATE,
  TestPlanWithAnalyticModel.JSON_PROPERTY_DESCRIPTION,
  TestPlanWithAnalyticModel.JSON_PROPERTY_BUILD,
  TestPlanWithAnalyticModel.JSON_PROPERTY_PROJECT_ID,
  TestPlanWithAnalyticModel.JSON_PROPERTY_PRODUCT_NAME,
  TestPlanWithAnalyticModel.JSON_PROPERTY_HAS_AUTOMATIC_DURATION_TIMER,
  TestPlanWithAnalyticModel.JSON_PROPERTY_ATTRIBUTES
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TestPlanWithAnalyticModel {
  public static final String JSON_PROPERTY_ANALYTIC = "analytic";
  private TestPointAnalyticResult analytic;

  public static final String JSON_PROPERTY_STATUS = "status";
  private TestPlanStatusModel status;

  public static final String JSON_PROPERTY_STARTED_ON = "startedOn";
  private JsonNullable<OffsetDateTime> startedOn = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_COMPLETED_ON = "completedOn";
  private JsonNullable<OffsetDateTime> completedOn = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_CREATED_DATE = "createdDate";
  private JsonNullable<OffsetDateTime> createdDate = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_MODIFIED_DATE = "modifiedDate";
  private JsonNullable<OffsetDateTime> modifiedDate = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_CREATED_BY_ID = "createdById";
  private UUID createdById;

  public static final String JSON_PROPERTY_MODIFIED_BY_ID = "modifiedById";
  private JsonNullable<UUID> modifiedById = JsonNullable.<UUID>undefined();

  public static final String JSON_PROPERTY_GLOBAL_ID = "globalId";
  private Long globalId;

  public static final String JSON_PROPERTY_IS_DELETED = "isDeleted";
  private Boolean isDeleted;

  public static final String JSON_PROPERTY_LOCKED_DATE = "lockedDate";
  private JsonNullable<OffsetDateTime> lockedDate = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_LOCKED_BY_ID = "lockedById";
  private JsonNullable<UUID> lockedById = JsonNullable.<UUID>undefined();

  public static final String JSON_PROPERTY_TAGS = "tags";
  private JsonNullable<List<TagShortModel>> tags = JsonNullable.<List<TagShortModel>>undefined();

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_START_DATE = "startDate";
  private JsonNullable<OffsetDateTime> startDate = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_END_DATE = "endDate";
  private JsonNullable<OffsetDateTime> endDate = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private JsonNullable<String> description = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_BUILD = "build";
  private JsonNullable<String> build = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PROJECT_ID = "projectId";
  private UUID projectId;

  public static final String JSON_PROPERTY_PRODUCT_NAME = "productName";
  private JsonNullable<String> productName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_HAS_AUTOMATIC_DURATION_TIMER = "hasAutomaticDurationTimer";
  private JsonNullable<Boolean> hasAutomaticDurationTimer = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private JsonNullable<Map<String, Object>> attributes = JsonNullable.<Map<String, Object>>undefined();

  public TestPlanWithAnalyticModel() { 
  }

  public TestPlanWithAnalyticModel analytic(TestPointAnalyticResult analytic) {
    this.analytic = analytic;
    return this;
  }

   /**
   * Get analytic
   * @return analytic
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ANALYTIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TestPointAnalyticResult getAnalytic() {
    return analytic;
  }


  @JsonProperty(JSON_PROPERTY_ANALYTIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAnalytic(TestPointAnalyticResult analytic) {
    this.analytic = analytic;
  }


  public TestPlanWithAnalyticModel status(TestPlanStatusModel status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TestPlanStatusModel getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(TestPlanStatusModel status) {
    this.status = status;
  }


  public TestPlanWithAnalyticModel startedOn(OffsetDateTime startedOn) {
    this.startedOn = JsonNullable.<OffsetDateTime>of(startedOn);
    return this;
  }

   /**
   * Set when test plan is starter (status changed to: In Progress)
   * @return startedOn
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "2022-07-14T09:52:35.620427900Z", value = "Set when test plan is starter (status changed to: In Progress)")
  @JsonIgnore

  public OffsetDateTime getStartedOn() {
        return startedOn.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_STARTED_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<OffsetDateTime> getStartedOn_JsonNullable() {
    return startedOn;
  }
  
  @JsonProperty(JSON_PROPERTY_STARTED_ON)
  public void setStartedOn_JsonNullable(JsonNullable<OffsetDateTime> startedOn) {
    this.startedOn = startedOn;
  }

  public void setStartedOn(OffsetDateTime startedOn) {
    this.startedOn = JsonNullable.<OffsetDateTime>of(startedOn);
  }


  public TestPlanWithAnalyticModel completedOn(OffsetDateTime completedOn) {
    this.completedOn = JsonNullable.<OffsetDateTime>of(completedOn);
    return this;
  }

   /**
   * set when test plan status is completed (status changed to: Completed)
   * @return completedOn
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "2022-07-14T09:52:35.620427900Z", value = "set when test plan status is completed (status changed to: Completed)")
  @JsonIgnore

  public OffsetDateTime getCompletedOn() {
        return completedOn.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_COMPLETED_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<OffsetDateTime> getCompletedOn_JsonNullable() {
    return completedOn;
  }
  
  @JsonProperty(JSON_PROPERTY_COMPLETED_ON)
  public void setCompletedOn_JsonNullable(JsonNullable<OffsetDateTime> completedOn) {
    this.completedOn = completedOn;
  }

  public void setCompletedOn(OffsetDateTime completedOn) {
    this.completedOn = JsonNullable.<OffsetDateTime>of(completedOn);
  }


  public TestPlanWithAnalyticModel createdDate(OffsetDateTime createdDate) {
    this.createdDate = JsonNullable.<OffsetDateTime>of(createdDate);
    return this;
  }

   /**
   * Get createdDate
   * @return createdDate
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "2022-07-14T09:52:35.620427900Z", value = "")
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


  public TestPlanWithAnalyticModel modifiedDate(OffsetDateTime modifiedDate) {
    this.modifiedDate = JsonNullable.<OffsetDateTime>of(modifiedDate);
    return this;
  }

   /**
   * Get modifiedDate
   * @return modifiedDate
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "2022-07-14T09:52:35.620427900Z", value = "")
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


  public TestPlanWithAnalyticModel createdById(UUID createdById) {
    this.createdById = createdById;
    return this;
  }

   /**
   * Get createdById
   * @return createdById
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "ceab5447-3791-4566-954f-8f2f7347a854", value = "")
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


  public TestPlanWithAnalyticModel modifiedById(UUID modifiedById) {
    this.modifiedById = JsonNullable.<UUID>of(modifiedById);
    return this;
  }

   /**
   * Get modifiedById
   * @return modifiedById
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "ceab5447-3791-4566-954f-8f2f7347a854", value = "")
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


  public TestPlanWithAnalyticModel globalId(Long globalId) {
    this.globalId = globalId;
    return this;
  }

   /**
   * Used for search Test plan
   * @return globalId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "100000", value = "Used for search Test plan")
  @JsonProperty(JSON_PROPERTY_GLOBAL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getGlobalId() {
    return globalId;
  }


  @JsonProperty(JSON_PROPERTY_GLOBAL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGlobalId(Long globalId) {
    this.globalId = globalId;
  }


  public TestPlanWithAnalyticModel isDeleted(Boolean isDeleted) {
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


  public TestPlanWithAnalyticModel lockedDate(OffsetDateTime lockedDate) {
    this.lockedDate = JsonNullable.<OffsetDateTime>of(lockedDate);
    return this;
  }

   /**
   * Get lockedDate
   * @return lockedDate
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "2022-07-14T09:52:35.620427900Z", value = "")
  @JsonIgnore

  public OffsetDateTime getLockedDate() {
        return lockedDate.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LOCKED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<OffsetDateTime> getLockedDate_JsonNullable() {
    return lockedDate;
  }
  
  @JsonProperty(JSON_PROPERTY_LOCKED_DATE)
  public void setLockedDate_JsonNullable(JsonNullable<OffsetDateTime> lockedDate) {
    this.lockedDate = lockedDate;
  }

  public void setLockedDate(OffsetDateTime lockedDate) {
    this.lockedDate = JsonNullable.<OffsetDateTime>of(lockedDate);
  }


  public TestPlanWithAnalyticModel id(UUID id) {
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


  public TestPlanWithAnalyticModel lockedById(UUID lockedById) {
    this.lockedById = JsonNullable.<UUID>of(lockedById);
    return this;
  }

   /**
   * Get lockedById
   * @return lockedById
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public UUID getLockedById() {
        return lockedById.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LOCKED_BY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<UUID> getLockedById_JsonNullable() {
    return lockedById;
  }
  
  @JsonProperty(JSON_PROPERTY_LOCKED_BY_ID)
  public void setLockedById_JsonNullable(JsonNullable<UUID> lockedById) {
    this.lockedById = lockedById;
  }

  public void setLockedById(UUID lockedById) {
    this.lockedById = JsonNullable.<UUID>of(lockedById);
  }


  public TestPlanWithAnalyticModel tags(List<TagShortModel> tags) {
    this.tags = JsonNullable.<List<TagShortModel>>of(tags);
    return this;
  }

  public TestPlanWithAnalyticModel addTagsItem(TagShortModel tagsItem) {
    if (this.tags == null || !this.tags.isPresent()) {
      this.tags = JsonNullable.<List<TagShortModel>>of(new ArrayList<>());
    }
    try {
      this.tags.get().add(tagsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public List<TagShortModel> getTags() {
        return tags.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<TagShortModel>> getTags_JsonNullable() {
    return tags;
  }
  
  @JsonProperty(JSON_PROPERTY_TAGS)
  public void setTags_JsonNullable(JsonNullable<List<TagShortModel>> tags) {
    this.tags = tags;
  }

  public void setTags(List<TagShortModel> tags) {
    this.tags = JsonNullable.<List<TagShortModel>>of(tags);
  }


  public TestPlanWithAnalyticModel name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "Base test plan", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  public TestPlanWithAnalyticModel startDate(OffsetDateTime startDate) {
    this.startDate = JsonNullable.<OffsetDateTime>of(startDate);
    return this;
  }

   /**
   * Used for analytics
   * @return startDate
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "2022-07-14T09:52:35.620427900Z", value = "Used for analytics")
  @JsonIgnore

  public OffsetDateTime getStartDate() {
        return startDate.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<OffsetDateTime> getStartDate_JsonNullable() {
    return startDate;
  }
  
  @JsonProperty(JSON_PROPERTY_START_DATE)
  public void setStartDate_JsonNullable(JsonNullable<OffsetDateTime> startDate) {
    this.startDate = startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = JsonNullable.<OffsetDateTime>of(startDate);
  }


  public TestPlanWithAnalyticModel endDate(OffsetDateTime endDate) {
    this.endDate = JsonNullable.<OffsetDateTime>of(endDate);
    return this;
  }

   /**
   * Used for analytics
   * @return endDate
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "2022-07-14T09:52:35.620427900Z", value = "Used for analytics")
  @JsonIgnore

  public OffsetDateTime getEndDate() {
        return endDate.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<OffsetDateTime> getEndDate_JsonNullable() {
    return endDate;
  }
  
  @JsonProperty(JSON_PROPERTY_END_DATE)
  public void setEndDate_JsonNullable(JsonNullable<OffsetDateTime> endDate) {
    this.endDate = endDate;
  }

  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = JsonNullable.<OffsetDateTime>of(endDate);
  }


  public TestPlanWithAnalyticModel description(String description) {
    this.description = JsonNullable.<String>of(description);
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "This is a base test plan", value = "")
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


  public TestPlanWithAnalyticModel build(String build) {
    this.build = JsonNullable.<String>of(build);
    return this;
  }

   /**
   * Get build
   * @return build
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "v.3.0.0-b94f3055", value = "")
  @JsonIgnore

  public String getBuild() {
        return build.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_BUILD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getBuild_JsonNullable() {
    return build;
  }
  
  @JsonProperty(JSON_PROPERTY_BUILD)
  public void setBuild_JsonNullable(JsonNullable<String> build) {
    this.build = build;
  }

  public void setBuild(String build) {
    this.build = JsonNullable.<String>of(build);
  }


  public TestPlanWithAnalyticModel projectId(UUID projectId) {
    this.projectId = projectId;
    return this;
  }

   /**
   * Get projectId
   * @return projectId
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "ceab5447-3791-4566-954f-8f2f7347a854", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_PROJECT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UUID getProjectId() {
    return projectId;
  }


  @JsonProperty(JSON_PROPERTY_PROJECT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setProjectId(UUID projectId) {
    this.projectId = projectId;
  }


  public TestPlanWithAnalyticModel productName(String productName) {
    this.productName = JsonNullable.<String>of(productName);
    return this;
  }

   /**
   * Get productName
   * @return productName
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Billing service", value = "")
  @JsonIgnore

  public String getProductName() {
        return productName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PRODUCT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getProductName_JsonNullable() {
    return productName;
  }
  
  @JsonProperty(JSON_PROPERTY_PRODUCT_NAME)
  public void setProductName_JsonNullable(JsonNullable<String> productName) {
    this.productName = productName;
  }

  public void setProductName(String productName) {
    this.productName = JsonNullable.<String>of(productName);
  }


  public TestPlanWithAnalyticModel hasAutomaticDurationTimer(Boolean hasAutomaticDurationTimer) {
    this.hasAutomaticDurationTimer = JsonNullable.<Boolean>of(hasAutomaticDurationTimer);
    return this;
  }

   /**
   * Get hasAutomaticDurationTimer
   * @return hasAutomaticDurationTimer
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")
  @JsonIgnore

  public Boolean getHasAutomaticDurationTimer() {
        return hasAutomaticDurationTimer.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_HAS_AUTOMATIC_DURATION_TIMER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Boolean> getHasAutomaticDurationTimer_JsonNullable() {
    return hasAutomaticDurationTimer;
  }
  
  @JsonProperty(JSON_PROPERTY_HAS_AUTOMATIC_DURATION_TIMER)
  public void setHasAutomaticDurationTimer_JsonNullable(JsonNullable<Boolean> hasAutomaticDurationTimer) {
    this.hasAutomaticDurationTimer = hasAutomaticDurationTimer;
  }

  public void setHasAutomaticDurationTimer(Boolean hasAutomaticDurationTimer) {
    this.hasAutomaticDurationTimer = JsonNullable.<Boolean>of(hasAutomaticDurationTimer);
  }


  public TestPlanWithAnalyticModel attributes(Map<String, Object> attributes) {
    this.attributes = JsonNullable.<Map<String, Object>>of(attributes);
    return this;
  }

  public TestPlanWithAnalyticModel putAttributesItem(String key, Object attributesItem) {
    if (this.attributes == null || !this.attributes.isPresent()) {
      this.attributes = JsonNullable.<Map<String, Object>>of(new HashMap<>());
    }
    try {
      this.attributes.get().put(key, attributesItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public Map<String, Object> getAttributes() {
        return attributes.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Map<String, Object>> getAttributes_JsonNullable() {
    return attributes;
  }
  
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  public void setAttributes_JsonNullable(JsonNullable<Map<String, Object>> attributes) {
    this.attributes = attributes;
  }

  public void setAttributes(Map<String, Object> attributes) {
    this.attributes = JsonNullable.<Map<String, Object>>of(attributes);
  }


  /**
   * Return true if this TestPlanWithAnalyticModel object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestPlanWithAnalyticModel testPlanWithAnalyticModel = (TestPlanWithAnalyticModel) o;
    return Objects.equals(this.analytic, testPlanWithAnalyticModel.analytic) &&
        Objects.equals(this.status, testPlanWithAnalyticModel.status) &&
        equalsNullable(this.startedOn, testPlanWithAnalyticModel.startedOn) &&
        equalsNullable(this.completedOn, testPlanWithAnalyticModel.completedOn) &&
        equalsNullable(this.createdDate, testPlanWithAnalyticModel.createdDate) &&
        equalsNullable(this.modifiedDate, testPlanWithAnalyticModel.modifiedDate) &&
        Objects.equals(this.createdById, testPlanWithAnalyticModel.createdById) &&
        equalsNullable(this.modifiedById, testPlanWithAnalyticModel.modifiedById) &&
        Objects.equals(this.globalId, testPlanWithAnalyticModel.globalId) &&
        Objects.equals(this.isDeleted, testPlanWithAnalyticModel.isDeleted) &&
        equalsNullable(this.lockedDate, testPlanWithAnalyticModel.lockedDate) &&
        Objects.equals(this.id, testPlanWithAnalyticModel.id) &&
        equalsNullable(this.lockedById, testPlanWithAnalyticModel.lockedById) &&
        equalsNullable(this.tags, testPlanWithAnalyticModel.tags) &&
        Objects.equals(this.name, testPlanWithAnalyticModel.name) &&
        equalsNullable(this.startDate, testPlanWithAnalyticModel.startDate) &&
        equalsNullable(this.endDate, testPlanWithAnalyticModel.endDate) &&
        equalsNullable(this.description, testPlanWithAnalyticModel.description) &&
        equalsNullable(this.build, testPlanWithAnalyticModel.build) &&
        Objects.equals(this.projectId, testPlanWithAnalyticModel.projectId) &&
        equalsNullable(this.productName, testPlanWithAnalyticModel.productName) &&
        equalsNullable(this.hasAutomaticDurationTimer, testPlanWithAnalyticModel.hasAutomaticDurationTimer) &&
        equalsNullable(this.attributes, testPlanWithAnalyticModel.attributes);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(analytic, status, hashCodeNullable(startedOn), hashCodeNullable(completedOn), hashCodeNullable(createdDate), hashCodeNullable(modifiedDate), createdById, hashCodeNullable(modifiedById), globalId, isDeleted, hashCodeNullable(lockedDate), id, hashCodeNullable(lockedById), hashCodeNullable(tags), name, hashCodeNullable(startDate), hashCodeNullable(endDate), hashCodeNullable(description), hashCodeNullable(build), projectId, hashCodeNullable(productName), hashCodeNullable(hasAutomaticDurationTimer), hashCodeNullable(attributes));
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
    sb.append("class TestPlanWithAnalyticModel {\n");
    sb.append("    analytic: ").append(toIndentedString(analytic)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    startedOn: ").append(toIndentedString(startedOn)).append("\n");
    sb.append("    completedOn: ").append(toIndentedString(completedOn)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
    sb.append("    createdById: ").append(toIndentedString(createdById)).append("\n");
    sb.append("    modifiedById: ").append(toIndentedString(modifiedById)).append("\n");
    sb.append("    globalId: ").append(toIndentedString(globalId)).append("\n");
    sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
    sb.append("    lockedDate: ").append(toIndentedString(lockedDate)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lockedById: ").append(toIndentedString(lockedById)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    build: ").append(toIndentedString(build)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    hasAutomaticDurationTimer: ").append(toIndentedString(hasAutomaticDurationTimer)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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

