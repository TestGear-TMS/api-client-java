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
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * WorkItemChangedFieldsViewModel
 */
@JsonPropertyOrder({
  WorkItemChangedFieldsViewModel.JSON_PROPERTY_NAME,
  WorkItemChangedFieldsViewModel.JSON_PROPERTY_IS_DELETED,
  WorkItemChangedFieldsViewModel.JSON_PROPERTY_PROJECT_ID,
  WorkItemChangedFieldsViewModel.JSON_PROPERTY_IS_AUTOMATED,
  WorkItemChangedFieldsViewModel.JSON_PROPERTY_SECTION_ID,
  WorkItemChangedFieldsViewModel.JSON_PROPERTY_DESCRIPTION,
  WorkItemChangedFieldsViewModel.JSON_PROPERTY_STATE,
  WorkItemChangedFieldsViewModel.JSON_PROPERTY_PRIORITY,
  WorkItemChangedFieldsViewModel.JSON_PROPERTY_DURATION,
  WorkItemChangedFieldsViewModel.JSON_PROPERTY_ATTRIBUTES,
  WorkItemChangedFieldsViewModel.JSON_PROPERTY_STEPS,
  WorkItemChangedFieldsViewModel.JSON_PROPERTY_PRECONDITION_STEPS,
  WorkItemChangedFieldsViewModel.JSON_PROPERTY_POSTCONDITION_STEPS,
  WorkItemChangedFieldsViewModel.JSON_PROPERTY_AUTO_TESTS,
  WorkItemChangedFieldsViewModel.JSON_PROPERTY_ATTACHMENTS,
  WorkItemChangedFieldsViewModel.JSON_PROPERTY_TAGS,
  WorkItemChangedFieldsViewModel.JSON_PROPERTY_LINKS,
  WorkItemChangedFieldsViewModel.JSON_PROPERTY_GLOBAL_ID,
  WorkItemChangedFieldsViewModel.JSON_PROPERTY_VERSION_NUMBER,
  WorkItemChangedFieldsViewModel.JSON_PROPERTY_ENTITY_TYPE_NAME
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class WorkItemChangedFieldsViewModel {
  public static final String JSON_PROPERTY_NAME = "name";
  private StringWorkItemChangedFieldViewModel name;

  public static final String JSON_PROPERTY_IS_DELETED = "isDeleted";
  private BooleanWorkItemChangedFieldViewModel isDeleted;

  public static final String JSON_PROPERTY_PROJECT_ID = "projectId";
  private GuidWorkItemChangedFieldViewModel projectId;

  public static final String JSON_PROPERTY_IS_AUTOMATED = "isAutomated";
  private BooleanWorkItemChangedFieldViewModel isAutomated;

  public static final String JSON_PROPERTY_SECTION_ID = "sectionId";
  private GuidWorkItemChangedFieldViewModel sectionId;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private StringWorkItemChangedFieldViewModel description;

  public static final String JSON_PROPERTY_STATE = "state";
  private StringWorkItemChangedFieldViewModel state;

  public static final String JSON_PROPERTY_PRIORITY = "priority";
  private StringWorkItemChangedFieldViewModel priority;

  public static final String JSON_PROPERTY_DURATION = "duration";
  private Int32WorkItemChangedFieldViewModel duration;

  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private JsonNullable<Map<String, WorkItemChangedAttributeViewModel>> attributes = JsonNullable.<Map<String, WorkItemChangedAttributeViewModel>>undefined();

  public static final String JSON_PROPERTY_STEPS = "steps";
  private WorkItemStepChangeViewModelArrayWorkItemChangedFieldViewModel steps;

  public static final String JSON_PROPERTY_PRECONDITION_STEPS = "preconditionSteps";
  private WorkItemStepChangeViewModelArrayWorkItemChangedFieldViewModel preconditionSteps;

  public static final String JSON_PROPERTY_POSTCONDITION_STEPS = "postconditionSteps";
  private WorkItemStepChangeViewModelArrayWorkItemChangedFieldViewModel postconditionSteps;

  public static final String JSON_PROPERTY_AUTO_TESTS = "autoTests";
  private AutoTestChangeViewModelArrayWorkItemChangedFieldViewModel autoTests;

  public static final String JSON_PROPERTY_ATTACHMENTS = "attachments";
  private AttachmentChangeViewModelArrayWorkItemChangedFieldViewModel attachments;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private StringArrayWorkItemChangedFieldViewModel tags;

  public static final String JSON_PROPERTY_LINKS = "links";
  private WorkItemLinkChangeViewModelArrayWorkItemChangedFieldViewModel links;

  public static final String JSON_PROPERTY_GLOBAL_ID = "globalId";
  private Int64WorkItemChangedFieldViewModel globalId;

  public static final String JSON_PROPERTY_VERSION_NUMBER = "versionNumber";
  private Int32WorkItemChangedFieldViewModel versionNumber;

  public static final String JSON_PROPERTY_ENTITY_TYPE_NAME = "entityTypeName";
  private StringWorkItemChangedFieldViewModel entityTypeName;

  public WorkItemChangedFieldsViewModel() { 
  }

  public WorkItemChangedFieldsViewModel name(StringWorkItemChangedFieldViewModel name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StringWorkItemChangedFieldViewModel getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(StringWorkItemChangedFieldViewModel name) {
    this.name = name;
  }


  public WorkItemChangedFieldsViewModel isDeleted(BooleanWorkItemChangedFieldViewModel isDeleted) {
    this.isDeleted = isDeleted;
    return this;
  }

   /**
   * Get isDeleted
   * @return isDeleted
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_DELETED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BooleanWorkItemChangedFieldViewModel getIsDeleted() {
    return isDeleted;
  }


  @JsonProperty(JSON_PROPERTY_IS_DELETED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsDeleted(BooleanWorkItemChangedFieldViewModel isDeleted) {
    this.isDeleted = isDeleted;
  }


  public WorkItemChangedFieldsViewModel projectId(GuidWorkItemChangedFieldViewModel projectId) {
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

  public GuidWorkItemChangedFieldViewModel getProjectId() {
    return projectId;
  }


  @JsonProperty(JSON_PROPERTY_PROJECT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProjectId(GuidWorkItemChangedFieldViewModel projectId) {
    this.projectId = projectId;
  }


  public WorkItemChangedFieldsViewModel isAutomated(BooleanWorkItemChangedFieldViewModel isAutomated) {
    this.isAutomated = isAutomated;
    return this;
  }

   /**
   * Get isAutomated
   * @return isAutomated
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_AUTOMATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BooleanWorkItemChangedFieldViewModel getIsAutomated() {
    return isAutomated;
  }


  @JsonProperty(JSON_PROPERTY_IS_AUTOMATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsAutomated(BooleanWorkItemChangedFieldViewModel isAutomated) {
    this.isAutomated = isAutomated;
  }


  public WorkItemChangedFieldsViewModel sectionId(GuidWorkItemChangedFieldViewModel sectionId) {
    this.sectionId = sectionId;
    return this;
  }

   /**
   * Get sectionId
   * @return sectionId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SECTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GuidWorkItemChangedFieldViewModel getSectionId() {
    return sectionId;
  }


  @JsonProperty(JSON_PROPERTY_SECTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSectionId(GuidWorkItemChangedFieldViewModel sectionId) {
    this.sectionId = sectionId;
  }


  public WorkItemChangedFieldsViewModel description(StringWorkItemChangedFieldViewModel description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StringWorkItemChangedFieldViewModel getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(StringWorkItemChangedFieldViewModel description) {
    this.description = description;
  }


  public WorkItemChangedFieldsViewModel state(StringWorkItemChangedFieldViewModel state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StringWorkItemChangedFieldViewModel getState() {
    return state;
  }


  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setState(StringWorkItemChangedFieldViewModel state) {
    this.state = state;
  }


  public WorkItemChangedFieldsViewModel priority(StringWorkItemChangedFieldViewModel priority) {
    this.priority = priority;
    return this;
  }

   /**
   * Get priority
   * @return priority
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PRIORITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StringWorkItemChangedFieldViewModel getPriority() {
    return priority;
  }


  @JsonProperty(JSON_PROPERTY_PRIORITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPriority(StringWorkItemChangedFieldViewModel priority) {
    this.priority = priority;
  }


  public WorkItemChangedFieldsViewModel duration(Int32WorkItemChangedFieldViewModel duration) {
    this.duration = duration;
    return this;
  }

   /**
   * Get duration
   * @return duration
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Int32WorkItemChangedFieldViewModel getDuration() {
    return duration;
  }


  @JsonProperty(JSON_PROPERTY_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDuration(Int32WorkItemChangedFieldViewModel duration) {
    this.duration = duration;
  }


  public WorkItemChangedFieldsViewModel attributes(Map<String, WorkItemChangedAttributeViewModel> attributes) {
    this.attributes = JsonNullable.<Map<String, WorkItemChangedAttributeViewModel>>of(attributes);
    return this;
  }

  public WorkItemChangedFieldsViewModel putAttributesItem(String key, WorkItemChangedAttributeViewModel attributesItem) {
    if (this.attributes == null || !this.attributes.isPresent()) {
      this.attributes = JsonNullable.<Map<String, WorkItemChangedAttributeViewModel>>of(new HashMap<>());
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

  public Map<String, WorkItemChangedAttributeViewModel> getAttributes() {
        return attributes.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Map<String, WorkItemChangedAttributeViewModel>> getAttributes_JsonNullable() {
    return attributes;
  }
  
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  public void setAttributes_JsonNullable(JsonNullable<Map<String, WorkItemChangedAttributeViewModel>> attributes) {
    this.attributes = attributes;
  }

  public void setAttributes(Map<String, WorkItemChangedAttributeViewModel> attributes) {
    this.attributes = JsonNullable.<Map<String, WorkItemChangedAttributeViewModel>>of(attributes);
  }


  public WorkItemChangedFieldsViewModel steps(WorkItemStepChangeViewModelArrayWorkItemChangedFieldViewModel steps) {
    this.steps = steps;
    return this;
  }

   /**
   * Get steps
   * @return steps
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STEPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public WorkItemStepChangeViewModelArrayWorkItemChangedFieldViewModel getSteps() {
    return steps;
  }


  @JsonProperty(JSON_PROPERTY_STEPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSteps(WorkItemStepChangeViewModelArrayWorkItemChangedFieldViewModel steps) {
    this.steps = steps;
  }


  public WorkItemChangedFieldsViewModel preconditionSteps(WorkItemStepChangeViewModelArrayWorkItemChangedFieldViewModel preconditionSteps) {
    this.preconditionSteps = preconditionSteps;
    return this;
  }

   /**
   * Get preconditionSteps
   * @return preconditionSteps
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PRECONDITION_STEPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public WorkItemStepChangeViewModelArrayWorkItemChangedFieldViewModel getPreconditionSteps() {
    return preconditionSteps;
  }


  @JsonProperty(JSON_PROPERTY_PRECONDITION_STEPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPreconditionSteps(WorkItemStepChangeViewModelArrayWorkItemChangedFieldViewModel preconditionSteps) {
    this.preconditionSteps = preconditionSteps;
  }


  public WorkItemChangedFieldsViewModel postconditionSteps(WorkItemStepChangeViewModelArrayWorkItemChangedFieldViewModel postconditionSteps) {
    this.postconditionSteps = postconditionSteps;
    return this;
  }

   /**
   * Get postconditionSteps
   * @return postconditionSteps
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_POSTCONDITION_STEPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public WorkItemStepChangeViewModelArrayWorkItemChangedFieldViewModel getPostconditionSteps() {
    return postconditionSteps;
  }


  @JsonProperty(JSON_PROPERTY_POSTCONDITION_STEPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPostconditionSteps(WorkItemStepChangeViewModelArrayWorkItemChangedFieldViewModel postconditionSteps) {
    this.postconditionSteps = postconditionSteps;
  }


  public WorkItemChangedFieldsViewModel autoTests(AutoTestChangeViewModelArrayWorkItemChangedFieldViewModel autoTests) {
    this.autoTests = autoTests;
    return this;
  }

   /**
   * Get autoTests
   * @return autoTests
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AUTO_TESTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AutoTestChangeViewModelArrayWorkItemChangedFieldViewModel getAutoTests() {
    return autoTests;
  }


  @JsonProperty(JSON_PROPERTY_AUTO_TESTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAutoTests(AutoTestChangeViewModelArrayWorkItemChangedFieldViewModel autoTests) {
    this.autoTests = autoTests;
  }


  public WorkItemChangedFieldsViewModel attachments(AttachmentChangeViewModelArrayWorkItemChangedFieldViewModel attachments) {
    this.attachments = attachments;
    return this;
  }

   /**
   * Get attachments
   * @return attachments
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ATTACHMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AttachmentChangeViewModelArrayWorkItemChangedFieldViewModel getAttachments() {
    return attachments;
  }


  @JsonProperty(JSON_PROPERTY_ATTACHMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAttachments(AttachmentChangeViewModelArrayWorkItemChangedFieldViewModel attachments) {
    this.attachments = attachments;
  }


  public WorkItemChangedFieldsViewModel tags(StringArrayWorkItemChangedFieldViewModel tags) {
    this.tags = tags;
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StringArrayWorkItemChangedFieldViewModel getTags() {
    return tags;
  }


  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTags(StringArrayWorkItemChangedFieldViewModel tags) {
    this.tags = tags;
  }


  public WorkItemChangedFieldsViewModel links(WorkItemLinkChangeViewModelArrayWorkItemChangedFieldViewModel links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public WorkItemLinkChangeViewModelArrayWorkItemChangedFieldViewModel getLinks() {
    return links;
  }


  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinks(WorkItemLinkChangeViewModelArrayWorkItemChangedFieldViewModel links) {
    this.links = links;
  }


  public WorkItemChangedFieldsViewModel globalId(Int64WorkItemChangedFieldViewModel globalId) {
    this.globalId = globalId;
    return this;
  }

   /**
   * Get globalId
   * @return globalId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_GLOBAL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Int64WorkItemChangedFieldViewModel getGlobalId() {
    return globalId;
  }


  @JsonProperty(JSON_PROPERTY_GLOBAL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGlobalId(Int64WorkItemChangedFieldViewModel globalId) {
    this.globalId = globalId;
  }


  public WorkItemChangedFieldsViewModel versionNumber(Int32WorkItemChangedFieldViewModel versionNumber) {
    this.versionNumber = versionNumber;
    return this;
  }

   /**
   * Get versionNumber
   * @return versionNumber
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VERSION_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Int32WorkItemChangedFieldViewModel getVersionNumber() {
    return versionNumber;
  }


  @JsonProperty(JSON_PROPERTY_VERSION_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVersionNumber(Int32WorkItemChangedFieldViewModel versionNumber) {
    this.versionNumber = versionNumber;
  }


  public WorkItemChangedFieldsViewModel entityTypeName(StringWorkItemChangedFieldViewModel entityTypeName) {
    this.entityTypeName = entityTypeName;
    return this;
  }

   /**
   * Get entityTypeName
   * @return entityTypeName
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ENTITY_TYPE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StringWorkItemChangedFieldViewModel getEntityTypeName() {
    return entityTypeName;
  }


  @JsonProperty(JSON_PROPERTY_ENTITY_TYPE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEntityTypeName(StringWorkItemChangedFieldViewModel entityTypeName) {
    this.entityTypeName = entityTypeName;
  }


  /**
   * Return true if this WorkItemChangedFieldsViewModel object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkItemChangedFieldsViewModel workItemChangedFieldsViewModel = (WorkItemChangedFieldsViewModel) o;
    return Objects.equals(this.name, workItemChangedFieldsViewModel.name) &&
        Objects.equals(this.isDeleted, workItemChangedFieldsViewModel.isDeleted) &&
        Objects.equals(this.projectId, workItemChangedFieldsViewModel.projectId) &&
        Objects.equals(this.isAutomated, workItemChangedFieldsViewModel.isAutomated) &&
        Objects.equals(this.sectionId, workItemChangedFieldsViewModel.sectionId) &&
        Objects.equals(this.description, workItemChangedFieldsViewModel.description) &&
        Objects.equals(this.state, workItemChangedFieldsViewModel.state) &&
        Objects.equals(this.priority, workItemChangedFieldsViewModel.priority) &&
        Objects.equals(this.duration, workItemChangedFieldsViewModel.duration) &&
        equalsNullable(this.attributes, workItemChangedFieldsViewModel.attributes) &&
        Objects.equals(this.steps, workItemChangedFieldsViewModel.steps) &&
        Objects.equals(this.preconditionSteps, workItemChangedFieldsViewModel.preconditionSteps) &&
        Objects.equals(this.postconditionSteps, workItemChangedFieldsViewModel.postconditionSteps) &&
        Objects.equals(this.autoTests, workItemChangedFieldsViewModel.autoTests) &&
        Objects.equals(this.attachments, workItemChangedFieldsViewModel.attachments) &&
        Objects.equals(this.tags, workItemChangedFieldsViewModel.tags) &&
        Objects.equals(this.links, workItemChangedFieldsViewModel.links) &&
        Objects.equals(this.globalId, workItemChangedFieldsViewModel.globalId) &&
        Objects.equals(this.versionNumber, workItemChangedFieldsViewModel.versionNumber) &&
        Objects.equals(this.entityTypeName, workItemChangedFieldsViewModel.entityTypeName);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, isDeleted, projectId, isAutomated, sectionId, description, state, priority, duration, hashCodeNullable(attributes), steps, preconditionSteps, postconditionSteps, autoTests, attachments, tags, links, globalId, versionNumber, entityTypeName);
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
    sb.append("class WorkItemChangedFieldsViewModel {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    isAutomated: ").append(toIndentedString(isAutomated)).append("\n");
    sb.append("    sectionId: ").append(toIndentedString(sectionId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
    sb.append("    preconditionSteps: ").append(toIndentedString(preconditionSteps)).append("\n");
    sb.append("    postconditionSteps: ").append(toIndentedString(postconditionSteps)).append("\n");
    sb.append("    autoTests: ").append(toIndentedString(autoTests)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    globalId: ").append(toIndentedString(globalId)).append("\n");
    sb.append("    versionNumber: ").append(toIndentedString(versionNumber)).append("\n");
    sb.append("    entityTypeName: ").append(toIndentedString(entityTypeName)).append("\n");
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

