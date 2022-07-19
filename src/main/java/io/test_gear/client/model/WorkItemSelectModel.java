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

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
-gear.client.model.WorkItemFilterModel;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;-gear.client.invoker.JSON;


/**
 * Model containing options to filter work items
 */
@ApiModel(description = "Model containing options to filter work items")
@JsonPropertyOrder({
  WorkItemSelectModel.JSON_PROPERTY_FILTER,
  WorkItemSelectModel.JSON_PROPERTY_EXTRACTION_MODEL
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class WorkItemSelectModel {
  public static final String JSON_PROPERTY_FILTER = "filter";
  private WorkItemFilterModel filter;

  public static final String JSON_PROPERTY_EXTRACTION_MODEL = "extractionModel";
  private WorkItemExtractionModel extractionModel;

  public WorkItemSelectModel() { 
  }

  public WorkItemSelectModel filter(WorkItemFilterModel filter) {
    this.filter = filter;
    return this;
  }

   /**
   * Get filter
   * @return filter
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FILTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public WorkItemFilterModel getFilter() {
    return filter;
  }


  @JsonProperty(JSON_PROPERTY_FILTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFilter(WorkItemFilterModel filter) {
    this.filter = filter;
  }


  public WorkItemSelectModel extractionModel(WorkItemExtractionModel extractionModel) {
    this.extractionModel = extractionModel;
    return this;
  }

   /**
   * Get extractionModel
   * @return extractionModel
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EXTRACTION_MODEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public WorkItemExtractionModel getExtractionModel() {
    return extractionModel;
  }


  @JsonProperty(JSON_PROPERTY_EXTRACTION_MODEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExtractionModel(WorkItemExtractionModel extractionModel) {
    this.extractionModel = extractionModel;
  }


  /**
   * Return true if this WorkItemSelectModel object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkItemSelectModel workItemSelectModel = (WorkItemSelectModel) o;
    return Objects.equals(this.filter, workItemSelectModel.filter) &&
        Objects.equals(this.extractionModel, workItemSelectModel.extractionModel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filter, extractionModel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkItemSelectModel {\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    extractionModel: ").append(toIndentedString(extractionModel)).append("\n");
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

