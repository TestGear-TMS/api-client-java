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
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * TestRunFillByConfigurationsPostModel
 */
@JsonPropertyOrder({
  TestRunFillByConfigurationsPostModel.JSON_PROPERTY_TEST_POINT_SELECTORS,
  TestRunFillByConfigurationsPostModel.JSON_PROPERTY_PROJECT_ID,
  TestRunFillByConfigurationsPostModel.JSON_PROPERTY_TEST_PLAN_ID,
  TestRunFillByConfigurationsPostModel.JSON_PROPERTY_NAME,
  TestRunFillByConfigurationsPostModel.JSON_PROPERTY_DESCRIPTION,
  TestRunFillByConfigurationsPostModel.JSON_PROPERTY_LAUNCH_SOURCE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TestRunFillByConfigurationsPostModel {
  public static final String JSON_PROPERTY_TEST_POINT_SELECTORS = "testPointSelectors";
  private List<TestPointSelector> testPointSelectors = new ArrayList<>();

  public static final String JSON_PROPERTY_PROJECT_ID = "projectId";
  private UUID projectId;

  public static final String JSON_PROPERTY_TEST_PLAN_ID = "testPlanId";
  private UUID testPlanId;

  public static final String JSON_PROPERTY_NAME = "name";
  private JsonNullable<String> name = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private JsonNullable<String> description = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_LAUNCH_SOURCE = "launchSource";
  private JsonNullable<String> launchSource = JsonNullable.<String>undefined();

  public TestRunFillByConfigurationsPostModel() { 
  }

  public TestRunFillByConfigurationsPostModel testPointSelectors(List<TestPointSelector> testPointSelectors) {
    this.testPointSelectors = testPointSelectors;
    return this;
  }

  public TestRunFillByConfigurationsPostModel addTestPointSelectorsItem(TestPointSelector testPointSelectorsItem) {
    this.testPointSelectors.add(testPointSelectorsItem);
    return this;
  }

   /**
   * Specifies an array of work items and configuration to create a test run for.
   * @return testPointSelectors
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies an array of work items and configuration to create a test run for.")
  @JsonProperty(JSON_PROPERTY_TEST_POINT_SELECTORS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<TestPointSelector> getTestPointSelectors() {
    return testPointSelectors;
  }


  @JsonProperty(JSON_PROPERTY_TEST_POINT_SELECTORS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTestPointSelectors(List<TestPointSelector> testPointSelectors) {
    this.testPointSelectors = testPointSelectors;
  }


  public TestRunFillByConfigurationsPostModel projectId(UUID projectId) {
    this.projectId = projectId;
    return this;
  }

   /**
   * Specifies the GUID of the project, in which a test run will be created.
   * @return projectId
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the GUID of the project, in which a test run will be created.")
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


  public TestRunFillByConfigurationsPostModel testPlanId(UUID testPlanId) {
    this.testPlanId = testPlanId;
    return this;
  }

   /**
   * Specifies the GUID of the test plan, within which the test run will be created.
   * @return testPlanId
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Specifies the GUID of the test plan, within which the test run will be created.")
  @JsonProperty(JSON_PROPERTY_TEST_PLAN_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UUID getTestPlanId() {
    return testPlanId;
  }


  @JsonProperty(JSON_PROPERTY_TEST_PLAN_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTestPlanId(UUID testPlanId) {
    this.testPlanId = testPlanId;
  }


  public TestRunFillByConfigurationsPostModel name(String name) {
    this.name = JsonNullable.<String>of(name);
    return this;
  }

   /**
   * Specifies the name of the test run.
   * @return name
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Specifies the name of the test run.")
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


  public TestRunFillByConfigurationsPostModel description(String description) {
    this.description = JsonNullable.<String>of(description);
    return this;
  }

   /**
   * Specifies the test run description.
   * @return description
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Specifies the test run description.")
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


  public TestRunFillByConfigurationsPostModel launchSource(String launchSource) {
    this.launchSource = JsonNullable.<String>of(launchSource);
    return this;
  }

   /**
   * Specifies the test run launch source.
   * @return launchSource
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Specifies the test run launch source.")
  @JsonIgnore

  public String getLaunchSource() {
        return launchSource.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LAUNCH_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getLaunchSource_JsonNullable() {
    return launchSource;
  }
  
  @JsonProperty(JSON_PROPERTY_LAUNCH_SOURCE)
  public void setLaunchSource_JsonNullable(JsonNullable<String> launchSource) {
    this.launchSource = launchSource;
  }

  public void setLaunchSource(String launchSource) {
    this.launchSource = JsonNullable.<String>of(launchSource);
  }


  /**
   * Return true if this TestRunFillByConfigurationsPostModel object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestRunFillByConfigurationsPostModel testRunFillByConfigurationsPostModel = (TestRunFillByConfigurationsPostModel) o;
    return Objects.equals(this.testPointSelectors, testRunFillByConfigurationsPostModel.testPointSelectors) &&
        Objects.equals(this.projectId, testRunFillByConfigurationsPostModel.projectId) &&
        Objects.equals(this.testPlanId, testRunFillByConfigurationsPostModel.testPlanId) &&
        equalsNullable(this.name, testRunFillByConfigurationsPostModel.name) &&
        equalsNullable(this.description, testRunFillByConfigurationsPostModel.description) &&
        equalsNullable(this.launchSource, testRunFillByConfigurationsPostModel.launchSource);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(testPointSelectors, projectId, testPlanId, hashCodeNullable(name), hashCodeNullable(description), hashCodeNullable(launchSource));
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
    sb.append("class TestRunFillByConfigurationsPostModel {\n");
    sb.append("    testPointSelectors: ").append(toIndentedString(testPointSelectors)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    testPlanId: ").append(toIndentedString(testPlanId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    launchSource: ").append(toIndentedString(launchSource)).append("\n");
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

