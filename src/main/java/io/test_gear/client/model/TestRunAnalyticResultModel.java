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
import org.openapitools.jackson.nullable.JsonNullable;
-gear.client.model.TestRunGroupByFailureClassModel;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;-gear.client.invoker.JSON;


/**
 * TestRunAnalyticResultModel
 */
@JsonPropertyOrder({
  TestRunAnalyticResultModel.JSON_PROPERTY_COUNT_GROUP_BY_STATUS,
  TestRunAnalyticResultModel.JSON_PROPERTY_COUNT_GROUP_BY_FAILURE_CLASS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TestRunAnalyticResultModel {
  public static final String JSON_PROPERTY_COUNT_GROUP_BY_STATUS = "countGroupByStatus";
  private JsonNullable<List<TestRunGroupByStatusModel>> countGroupByStatus = JsonNullable.<List<TestRunGroupByStatusModel>>undefined();

  public static final String JSON_PROPERTY_COUNT_GROUP_BY_FAILURE_CLASS = "countGroupByFailureClass";
  private JsonNullable<List<TestRunGroupByFailureClassModel>> countGroupByFailureClass = JsonNullable.<List<TestRunGroupByFailureClassModel>>undefined();

  public TestRunAnalyticResultModel() { 
  }

  public TestRunAnalyticResultModel countGroupByStatus(List<TestRunGroupByStatusModel> countGroupByStatus) {
    this.countGroupByStatus = JsonNullable.<List<TestRunGroupByStatusModel>>of(countGroupByStatus);
    return this;
  }

  public TestRunAnalyticResultModel addCountGroupByStatusItem(TestRunGroupByStatusModel countGroupByStatusItem) {
    if (this.countGroupByStatus == null || !this.countGroupByStatus.isPresent()) {
      this.countGroupByStatus = JsonNullable.<List<TestRunGroupByStatusModel>>of(new ArrayList<>());
    }
    try {
      this.countGroupByStatus.get().add(countGroupByStatusItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get countGroupByStatus
   * @return countGroupByStatus
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public List<TestRunGroupByStatusModel> getCountGroupByStatus() {
        return countGroupByStatus.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_COUNT_GROUP_BY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<TestRunGroupByStatusModel>> getCountGroupByStatus_JsonNullable() {
    return countGroupByStatus;
  }
  
  @JsonProperty(JSON_PROPERTY_COUNT_GROUP_BY_STATUS)
  public void setCountGroupByStatus_JsonNullable(JsonNullable<List<TestRunGroupByStatusModel>> countGroupByStatus) {
    this.countGroupByStatus = countGroupByStatus;
  }

  public void setCountGroupByStatus(List<TestRunGroupByStatusModel> countGroupByStatus) {
    this.countGroupByStatus = JsonNullable.<List<TestRunGroupByStatusModel>>of(countGroupByStatus);
  }


  public TestRunAnalyticResultModel countGroupByFailureClass(List<TestRunGroupByFailureClassModel> countGroupByFailureClass) {
    this.countGroupByFailureClass = JsonNullable.<List<TestRunGroupByFailureClassModel>>of(countGroupByFailureClass);
    return this;
  }

  public TestRunAnalyticResultModel addCountGroupByFailureClassItem(TestRunGroupByFailureClassModel countGroupByFailureClassItem) {
    if (this.countGroupByFailureClass == null || !this.countGroupByFailureClass.isPresent()) {
      this.countGroupByFailureClass = JsonNullable.<List<TestRunGroupByFailureClassModel>>of(new ArrayList<>());
    }
    try {
      this.countGroupByFailureClass.get().add(countGroupByFailureClassItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get countGroupByFailureClass
   * @return countGroupByFailureClass
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public List<TestRunGroupByFailureClassModel> getCountGroupByFailureClass() {
        return countGroupByFailureClass.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_COUNT_GROUP_BY_FAILURE_CLASS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<TestRunGroupByFailureClassModel>> getCountGroupByFailureClass_JsonNullable() {
    return countGroupByFailureClass;
  }
  
  @JsonProperty(JSON_PROPERTY_COUNT_GROUP_BY_FAILURE_CLASS)
  public void setCountGroupByFailureClass_JsonNullable(JsonNullable<List<TestRunGroupByFailureClassModel>> countGroupByFailureClass) {
    this.countGroupByFailureClass = countGroupByFailureClass;
  }

  public void setCountGroupByFailureClass(List<TestRunGroupByFailureClassModel> countGroupByFailureClass) {
    this.countGroupByFailureClass = JsonNullable.<List<TestRunGroupByFailureClassModel>>of(countGroupByFailureClass);
  }


  /**
   * Return true if this TestRunAnalyticResultModel object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestRunAnalyticResultModel testRunAnalyticResultModel = (TestRunAnalyticResultModel) o;
    return equalsNullable(this.countGroupByStatus, testRunAnalyticResultModel.countGroupByStatus) &&
        equalsNullable(this.countGroupByFailureClass, testRunAnalyticResultModel.countGroupByFailureClass);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(countGroupByStatus), hashCodeNullable(countGroupByFailureClass));
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
    sb.append("class TestRunAnalyticResultModel {\n");
    sb.append("    countGroupByStatus: ").append(toIndentedString(countGroupByStatus)).append("\n");
    sb.append("    countGroupByFailureClass: ").append(toIndentedString(countGroupByFailureClass)).append("\n");
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

