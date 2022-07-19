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
-gear.client.model.TestPointChangeViewModel;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * TestPointChangeViewModelTestPlanChangedFieldViewModel
 */
@JsonPropertyOrder({
  TestPointChangeViewModelTestPlanChangedFieldViewModel.JSON_PROPERTY_OLD_VALUE,
  TestPointChangeViewModelTestPlanChangedFieldViewModel.JSON_PROPERTY_NEW_VALUE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TestPointChangeViewModelTestPlanChangedFieldViewModel {
  public static final String JSON_PROPERTY_OLD_VALUE = "oldValue";
  private TestPointChangeViewModel oldValue;

  public static final String JSON_PROPERTY_NEW_VALUE = "newValue";
  private TestPointChangeViewModel newValue;

  public TestPointChangeViewModelTestPlanChangedFieldViewModel() { 
  }

  public TestPointChangeViewModelTestPlanChangedFieldViewModel oldValue(TestPointChangeViewModel oldValue) {
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

  public TestPointChangeViewModel getOldValue() {
    return oldValue;
  }


  @JsonProperty(JSON_PROPERTY_OLD_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOldValue(TestPointChangeViewModel oldValue) {
    this.oldValue = oldValue;
  }


  public TestPointChangeViewModelTestPlanChangedFieldViewModel newValue(TestPointChangeViewModel newValue) {
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

  public TestPointChangeViewModel getNewValue() {
    return newValue;
  }


  @JsonProperty(JSON_PROPERTY_NEW_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNewValue(TestPointChangeViewModel newValue) {
    this.newValue = newValue;
  }


  /**
   * Return true if this TestPointChangeViewModelTestPlanChangedFieldViewModel object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestPointChangeViewModelTestPlanChangedFieldViewModel testPointChangeViewModelTestPlanChangedFieldViewModel = (TestPointChangeViewModelTestPlanChangedFieldViewModel) o;
    return Objects.equals(this.oldValue, testPointChangeViewModelTestPlanChangedFieldViewModel.oldValue) &&
        Objects.equals(this.newValue, testPointChangeViewModelTestPlanChangedFieldViewModel.newValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oldValue, newValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestPointChangeViewModelTestPlanChangedFieldViewModel {\n");
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

