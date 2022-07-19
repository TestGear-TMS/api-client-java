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
-gear.client.model.BooleanNullableTestPlanChangedFieldViewModel;
-gear.client.model.BooleanTestPlanChangedFieldViewModel;
-gear.client.model.CustomAttributeChangeModel;
-gear.client.model.PeriodViewModelTestPlanChangedFieldViewModel;
-gear.client.model.StringArrayTestPlanChangedFieldViewModel;
-gear.client.model.StringTestPlanChangedFieldViewModel;
-gear.client.model.TestResultChangeViewModelTestPlanChangedFieldViewModel;
-gear.client.model.TestSuiteChangeViewModelTestPlanChangedFieldViewModel;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;-gear.client.invoker.JSON;


/**
 * TestPlanChangedFieldsViewModel
 */
@JsonPropertyOrder({
  TestPlanChangedFieldsViewModel.JSON_PROPERTY_NAME,
  TestPlanChangedFieldsViewModel.JSON_PROPERTY_DESCRIPTION,
  TestPlanChangedFieldsViewModel.JSON_PROPERTY_PRODUCT_NAME,
  TestPlanChangedFieldsViewModel.JSON_PROPERTY_BUILD,
  TestPlanChangedFieldsViewModel.JSON_PROPERTY_PERIOD,
  TestPlanChangedFieldsViewModel.JSON_PROPERTY_STATUS,
  TestPlanChangedFieldsViewModel.JSON_PROPERTY_TAGS,
  TestPlanChangedFieldsViewModel.JSON_PROPERTY_TEST_SUITE,
  TestPlanChangedFieldsViewModel.JSON_PROPERTY_TEST_POINTS,
  TestPlanChangedFieldsViewModel.JSON_PROPERTY_TEST_RESULTS,
  TestPlanChangedFieldsViewModel.JSON_PROPERTY_LOCKING,
  TestPlanChangedFieldsViewModel.JSON_PROPERTY_HAS_AUTOMATIC_DURATION_TIMER,
  TestPlanChangedFieldsViewModel.JSON_PROPERTY_ATTRIBUTES
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TestPlanChangedFieldsViewModel {
  public static final String JSON_PROPERTY_NAME = "name";
  private StringTestPlanChangedFieldViewModel name;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private StringTestPlanChangedFieldViewModel description;

  public static final String JSON_PROPERTY_PRODUCT_NAME = "productName";
  private StringTestPlanChangedFieldViewModel productName;

  public static final String JSON_PROPERTY_BUILD = "build";
  private StringTestPlanChangedFieldViewModel build;

  public static final String JSON_PROPERTY_PERIOD = "period";
  private PeriodViewModelTestPlanChangedFieldViewModel period;

  public static final String JSON_PROPERTY_STATUS = "status";
  private StringTestPlanChangedFieldViewModel status;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private StringArrayTestPlanChangedFieldViewModel tags;

  public static final String JSON_PROPERTY_TEST_SUITE = "testSuite";
  private TestSuiteChangeViewModelTestPlanChangedFieldViewModel testSuite;

  public static final String JSON_PROPERTY_TEST_POINTS = "testPoints";
  private TestPointChangeViewModelTestPlanChangedFieldViewModel testPoints;

  public static final String JSON_PROPERTY_TEST_RESULTS = "testResults";
  private TestResultChangeViewModelTestPlanChangedFieldViewModel testResults;

  public static final String JSON_PROPERTY_LOCKING = "locking";
  private BooleanTestPlanChangedFieldViewModel locking;

  public static final String JSON_PROPERTY_HAS_AUTOMATIC_DURATION_TIMER = "hasAutomaticDurationTimer";
  private BooleanNullableTestPlanChangedFieldViewModel hasAutomaticDurationTimer;

  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private JsonNullable<Map<String, CustomAttributeChangeModel>> attributes = JsonNullable.<Map<String, CustomAttributeChangeModel>>undefined();

  public TestPlanChangedFieldsViewModel() { 
  }

  public TestPlanChangedFieldsViewModel name(StringTestPlanChangedFieldViewModel name) {
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

  public StringTestPlanChangedFieldViewModel getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(StringTestPlanChangedFieldViewModel name) {
    this.name = name;
  }


  public TestPlanChangedFieldsViewModel description(StringTestPlanChangedFieldViewModel description) {
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

  public StringTestPlanChangedFieldViewModel getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(StringTestPlanChangedFieldViewModel description) {
    this.description = description;
  }


  public TestPlanChangedFieldsViewModel productName(StringTestPlanChangedFieldViewModel productName) {
    this.productName = productName;
    return this;
  }

   /**
   * Get productName
   * @return productName
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PRODUCT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StringTestPlanChangedFieldViewModel getProductName() {
    return productName;
  }


  @JsonProperty(JSON_PROPERTY_PRODUCT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProductName(StringTestPlanChangedFieldViewModel productName) {
    this.productName = productName;
  }


  public TestPlanChangedFieldsViewModel build(StringTestPlanChangedFieldViewModel build) {
    this.build = build;
    return this;
  }

   /**
   * Get build
   * @return build
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BUILD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StringTestPlanChangedFieldViewModel getBuild() {
    return build;
  }


  @JsonProperty(JSON_PROPERTY_BUILD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBuild(StringTestPlanChangedFieldViewModel build) {
    this.build = build;
  }


  public TestPlanChangedFieldsViewModel period(PeriodViewModelTestPlanChangedFieldViewModel period) {
    this.period = period;
    return this;
  }

   /**
   * Get period
   * @return period
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PERIOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PeriodViewModelTestPlanChangedFieldViewModel getPeriod() {
    return period;
  }


  @JsonProperty(JSON_PROPERTY_PERIOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPeriod(PeriodViewModelTestPlanChangedFieldViewModel period) {
    this.period = period;
  }


  public TestPlanChangedFieldsViewModel status(StringTestPlanChangedFieldViewModel status) {
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

  public StringTestPlanChangedFieldViewModel getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(StringTestPlanChangedFieldViewModel status) {
    this.status = status;
  }


  public TestPlanChangedFieldsViewModel tags(StringArrayTestPlanChangedFieldViewModel tags) {
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

  public StringArrayTestPlanChangedFieldViewModel getTags() {
    return tags;
  }


  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTags(StringArrayTestPlanChangedFieldViewModel tags) {
    this.tags = tags;
  }


  public TestPlanChangedFieldsViewModel testSuite(TestSuiteChangeViewModelTestPlanChangedFieldViewModel testSuite) {
    this.testSuite = testSuite;
    return this;
  }

   /**
   * Get testSuite
   * @return testSuite
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TEST_SUITE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TestSuiteChangeViewModelTestPlanChangedFieldViewModel getTestSuite() {
    return testSuite;
  }


  @JsonProperty(JSON_PROPERTY_TEST_SUITE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTestSuite(TestSuiteChangeViewModelTestPlanChangedFieldViewModel testSuite) {
    this.testSuite = testSuite;
  }


  public TestPlanChangedFieldsViewModel testPoints(TestPointChangeViewModelTestPlanChangedFieldViewModel testPoints) {
    this.testPoints = testPoints;
    return this;
  }

   /**
   * Get testPoints
   * @return testPoints
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TEST_POINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TestPointChangeViewModelTestPlanChangedFieldViewModel getTestPoints() {
    return testPoints;
  }


  @JsonProperty(JSON_PROPERTY_TEST_POINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTestPoints(TestPointChangeViewModelTestPlanChangedFieldViewModel testPoints) {
    this.testPoints = testPoints;
  }


  public TestPlanChangedFieldsViewModel testResults(TestResultChangeViewModelTestPlanChangedFieldViewModel testResults) {
    this.testResults = testResults;
    return this;
  }

   /**
   * Get testResults
   * @return testResults
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TEST_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TestResultChangeViewModelTestPlanChangedFieldViewModel getTestResults() {
    return testResults;
  }


  @JsonProperty(JSON_PROPERTY_TEST_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTestResults(TestResultChangeViewModelTestPlanChangedFieldViewModel testResults) {
    this.testResults = testResults;
  }


  public TestPlanChangedFieldsViewModel locking(BooleanTestPlanChangedFieldViewModel locking) {
    this.locking = locking;
    return this;
  }

   /**
   * Get locking
   * @return locking
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LOCKING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BooleanTestPlanChangedFieldViewModel getLocking() {
    return locking;
  }


  @JsonProperty(JSON_PROPERTY_LOCKING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLocking(BooleanTestPlanChangedFieldViewModel locking) {
    this.locking = locking;
  }


  public TestPlanChangedFieldsViewModel hasAutomaticDurationTimer(BooleanNullableTestPlanChangedFieldViewModel hasAutomaticDurationTimer) {
    this.hasAutomaticDurationTimer = hasAutomaticDurationTimer;
    return this;
  }

   /**
   * Get hasAutomaticDurationTimer
   * @return hasAutomaticDurationTimer
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_HAS_AUTOMATIC_DURATION_TIMER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BooleanNullableTestPlanChangedFieldViewModel getHasAutomaticDurationTimer() {
    return hasAutomaticDurationTimer;
  }


  @JsonProperty(JSON_PROPERTY_HAS_AUTOMATIC_DURATION_TIMER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHasAutomaticDurationTimer(BooleanNullableTestPlanChangedFieldViewModel hasAutomaticDurationTimer) {
    this.hasAutomaticDurationTimer = hasAutomaticDurationTimer;
  }


  public TestPlanChangedFieldsViewModel attributes(Map<String, CustomAttributeChangeModel> attributes) {
    this.attributes = JsonNullable.<Map<String, CustomAttributeChangeModel>>of(attributes);
    return this;
  }

  public TestPlanChangedFieldsViewModel putAttributesItem(String key, CustomAttributeChangeModel attributesItem) {
    if (this.attributes == null || !this.attributes.isPresent()) {
      this.attributes = JsonNullable.<Map<String, CustomAttributeChangeModel>>of(new HashMap<>());
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

  public Map<String, CustomAttributeChangeModel> getAttributes() {
        return attributes.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Map<String, CustomAttributeChangeModel>> getAttributes_JsonNullable() {
    return attributes;
  }
  
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  public void setAttributes_JsonNullable(JsonNullable<Map<String, CustomAttributeChangeModel>> attributes) {
    this.attributes = attributes;
  }

  public void setAttributes(Map<String, CustomAttributeChangeModel> attributes) {
    this.attributes = JsonNullable.<Map<String, CustomAttributeChangeModel>>of(attributes);
  }


  /**
   * Return true if this TestPlanChangedFieldsViewModel object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestPlanChangedFieldsViewModel testPlanChangedFieldsViewModel = (TestPlanChangedFieldsViewModel) o;
    return Objects.equals(this.name, testPlanChangedFieldsViewModel.name) &&
        Objects.equals(this.description, testPlanChangedFieldsViewModel.description) &&
        Objects.equals(this.productName, testPlanChangedFieldsViewModel.productName) &&
        Objects.equals(this.build, testPlanChangedFieldsViewModel.build) &&
        Objects.equals(this.period, testPlanChangedFieldsViewModel.period) &&
        Objects.equals(this.status, testPlanChangedFieldsViewModel.status) &&
        Objects.equals(this.tags, testPlanChangedFieldsViewModel.tags) &&
        Objects.equals(this.testSuite, testPlanChangedFieldsViewModel.testSuite) &&
        Objects.equals(this.testPoints, testPlanChangedFieldsViewModel.testPoints) &&
        Objects.equals(this.testResults, testPlanChangedFieldsViewModel.testResults) &&
        Objects.equals(this.locking, testPlanChangedFieldsViewModel.locking) &&
        Objects.equals(this.hasAutomaticDurationTimer, testPlanChangedFieldsViewModel.hasAutomaticDurationTimer) &&
        equalsNullable(this.attributes, testPlanChangedFieldsViewModel.attributes);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, productName, build, period, status, tags, testSuite, testPoints, testResults, locking, hasAutomaticDurationTimer, hashCodeNullable(attributes));
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
    sb.append("class TestPlanChangedFieldsViewModel {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    build: ").append(toIndentedString(build)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    testSuite: ").append(toIndentedString(testSuite)).append("\n");
    sb.append("    testPoints: ").append(toIndentedString(testPoints)).append("\n");
    sb.append("    testResults: ").append(toIndentedString(testResults)).append("\n");
    sb.append("    locking: ").append(toIndentedString(locking)).append("\n");
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

