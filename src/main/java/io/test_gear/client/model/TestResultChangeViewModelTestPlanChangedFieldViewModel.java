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
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;-gear.client.invoker.JSON;


/**
 * TestResultChangeViewModelTestPlanChangedFieldViewModel
 */
@JsonPropertyOrder({
  TestResultChangeViewModelTestPlanChangedFieldViewModel.JSON_PROPERTY_OLD_VALUE,
  TestResultChangeViewModelTestPlanChangedFieldViewModel.JSON_PROPERTY_NEW_VALUE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TestResultChangeViewModelTestPlanChangedFieldViewModel {
  public static final String JSON_PROPERTY_OLD_VALUE = "oldValue";
  private TestResultChangeViewModel oldValue;

  public static final String JSON_PROPERTY_NEW_VALUE = "newValue";
  private TestResultChangeViewModel newValue;

  public TestResultChangeViewModelTestPlanChangedFieldViewModel() { 
  }

  public TestResultChangeViewModelTestPlanChangedFieldViewModel oldValue(TestResultChangeViewModel oldValue) {
    this.oldValue = oldValue;
    return this;
  }

   /**
   * Get oldValue
   * @return oldValue
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OLD_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TestResultChangeViewModel getOldValue() {
    return oldValue;
  }


  @JsonProperty(JSON_PROPERTY_OLD_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOldValue(TestResultChangeViewModel oldValue) {
    this.oldValue = oldValue;
  }


  public TestResultChangeViewModelTestPlanChangedFieldViewModel newValue(TestResultChangeViewModel newValue) {
    this.newValue = newValue;
    return this;
  }

   /**
   * Get newValue
   * @return newValue
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NEW_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TestResultChangeViewModel getNewValue() {
    return newValue;
  }


  @JsonProperty(JSON_PROPERTY_NEW_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNewValue(TestResultChangeViewModel newValue) {
    this.newValue = newValue;
  }


  /**
   * Return true if this TestResultChangeViewModelTestPlanChangedFieldViewModel object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestResultChangeViewModelTestPlanChangedFieldViewModel testResultChangeViewModelTestPlanChangedFieldViewModel = (TestResultChangeViewModelTestPlanChangedFieldViewModel) o;
    return Objects.equals(this.oldValue, testResultChangeViewModelTestPlanChangedFieldViewModel.oldValue) &&
        Objects.equals(this.newValue, testResultChangeViewModelTestPlanChangedFieldViewModel.newValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oldValue, newValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestResultChangeViewModelTestPlanChangedFieldViewModel {\n");
    sb.append("    oldValue: ").append(toIndentedString(oldValue)).append("\n");
    sb.append("    newValue: ").append(toIndentedString(newValue)).append("\n");
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

