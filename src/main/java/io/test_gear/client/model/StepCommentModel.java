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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * StepCommentModel
 */
@JsonPropertyOrder({
  StepCommentModel.JSON_PROPERTY_ID,
  StepCommentModel.JSON_PROPERTY_TEXT,
  StepCommentModel.JSON_PROPERTY_STEP_ID,
  StepCommentModel.JSON_PROPERTY_PARENT_STEP_ID,
  StepCommentModel.JSON_PROPERTY_ATTACHMENTS,
  StepCommentModel.JSON_PROPERTY_TEST_RESULT_ID,
  StepCommentModel.JSON_PROPERTY_CREATED_BY_ID,
  StepCommentModel.JSON_PROPERTY_MODIFIED_BY_ID,
  StepCommentModel.JSON_PROPERTY_CREATED_DATE,
  StepCommentModel.JSON_PROPERTY_MODIFIED_DATE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class StepCommentModel {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_TEXT = "text";
  private JsonNullable<String> text = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_STEP_ID = "stepId";
  private UUID stepId;

  public static final String JSON_PROPERTY_PARENT_STEP_ID = "parentStepId";
  private JsonNullable<UUID> parentStepId = JsonNullable.<UUID>undefined();

  public static final String JSON_PROPERTY_ATTACHMENTS = "attachments";
  private JsonNullable<List<AttachmentModel>> attachments = JsonNullable.<List<AttachmentModel>>undefined();

  public static final String JSON_PROPERTY_TEST_RESULT_ID = "testResultId";
  private UUID testResultId;

  public static final String JSON_PROPERTY_CREATED_BY_ID = "createdById";
  private UUID createdById;

  public static final String JSON_PROPERTY_MODIFIED_BY_ID = "modifiedById";
  private JsonNullable<UUID> modifiedById = JsonNullable.<UUID>undefined();

  public static final String JSON_PROPERTY_CREATED_DATE = "createdDate";
  private JsonNullable<OffsetDateTime> createdDate = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_MODIFIED_DATE = "modifiedDate";
  private JsonNullable<OffsetDateTime> modifiedDate = JsonNullable.<OffsetDateTime>undefined();

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


  public StepCommentModel text(String text) {
    this.text = JsonNullable.<String>of(text);
    return this;
  }

   /**
   * Get text
   * @return text
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getText() {
        return text.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getText_JsonNullable() {
    return text;
  }
  
  @JsonProperty(JSON_PROPERTY_TEXT)
  public void setText_JsonNullable(JsonNullable<String> text) {
    this.text = text;
  }

  public void setText(String text) {
    this.text = JsonNullable.<String>of(text);
  }


  public StepCommentModel stepId(UUID stepId) {
    this.stepId = stepId;
    return this;
  }

   /**
   * Get stepId
   * @return stepId
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_STEP_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UUID getStepId() {
    return stepId;
  }


  @JsonProperty(JSON_PROPERTY_STEP_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStepId(UUID stepId) {
    this.stepId = stepId;
  }


  public StepCommentModel parentStepId(UUID parentStepId) {
    this.parentStepId = JsonNullable.<UUID>of(parentStepId);
    return this;
  }

   /**
   * Get parentStepId
   * @return parentStepId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public UUID getParentStepId() {
        return parentStepId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PARENT_STEP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<UUID> getParentStepId_JsonNullable() {
    return parentStepId;
  }
  
  @JsonProperty(JSON_PROPERTY_PARENT_STEP_ID)
  public void setParentStepId_JsonNullable(JsonNullable<UUID> parentStepId) {
    this.parentStepId = parentStepId;
  }

  public void setParentStepId(UUID parentStepId) {
    this.parentStepId = JsonNullable.<UUID>of(parentStepId);
  }


  public StepCommentModel attachments(List<AttachmentModel> attachments) {
    this.attachments = JsonNullable.<List<AttachmentModel>>of(attachments);
    return this;
  }

  public StepCommentModel addAttachmentsItem(AttachmentModel attachmentsItem) {
    if (this.attachments == null || !this.attachments.isPresent()) {
      this.attachments = JsonNullable.<List<AttachmentModel>>of(new ArrayList<>());
    }
    try {
      this.attachments.get().add(attachmentsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get attachments
   * @return attachments
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public List<AttachmentModel> getAttachments() {
        return attachments.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ATTACHMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<AttachmentModel>> getAttachments_JsonNullable() {
    return attachments;
  }
  
  @JsonProperty(JSON_PROPERTY_ATTACHMENTS)
  public void setAttachments_JsonNullable(JsonNullable<List<AttachmentModel>> attachments) {
    this.attachments = attachments;
  }

  public void setAttachments(List<AttachmentModel> attachments) {
    this.attachments = JsonNullable.<List<AttachmentModel>>of(attachments);
  }


  public StepCommentModel testResultId(UUID testResultId) {
    this.testResultId = testResultId;
    return this;
  }

   /**
   * Get testResultId
   * @return testResultId
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TEST_RESULT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UUID getTestResultId() {
    return testResultId;
  }


  @JsonProperty(JSON_PROPERTY_TEST_RESULT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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


  public StepCommentModel modifiedById(UUID modifiedById) {
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


  public StepCommentModel createdDate(OffsetDateTime createdDate) {
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


  public StepCommentModel modifiedDate(OffsetDateTime modifiedDate) {
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


  /**
   * Return true if this StepCommentModel object is equal to o.
   */
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
        equalsNullable(this.text, stepCommentModel.text) &&
        Objects.equals(this.stepId, stepCommentModel.stepId) &&
        equalsNullable(this.parentStepId, stepCommentModel.parentStepId) &&
        equalsNullable(this.attachments, stepCommentModel.attachments) &&
        Objects.equals(this.testResultId, stepCommentModel.testResultId) &&
        Objects.equals(this.createdById, stepCommentModel.createdById) &&
        equalsNullable(this.modifiedById, stepCommentModel.modifiedById) &&
        equalsNullable(this.createdDate, stepCommentModel.createdDate) &&
        equalsNullable(this.modifiedDate, stepCommentModel.modifiedDate);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, hashCodeNullable(text), stepId, hashCodeNullable(parentStepId), hashCodeNullable(attachments), testResultId, createdById, hashCodeNullable(modifiedById), hashCodeNullable(createdDate), hashCodeNullable(modifiedDate));
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

}

