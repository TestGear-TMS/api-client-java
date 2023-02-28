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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets FailureCategoryModel
 */
@JsonAdapter(FailureCategoryModel.Adapter.class)
public enum FailureCategoryModel {
  
  INFRASTRUCTUREDEFECT("InfrastructureDefect"),
  
  PRODUCTDEFECT("ProductDefect"),
  
  TESTDEFECT("TestDefect"),
  
  NODEFECT("NoDefect");

  private String value;

  FailureCategoryModel(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static FailureCategoryModel fromValue(String value) {
    for (FailureCategoryModel b : FailureCategoryModel.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<FailureCategoryModel> {
    @Override
    public void write(final JsonWriter jsonWriter, final FailureCategoryModel enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public FailureCategoryModel read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return FailureCategoryModel.fromValue(value);
    }
  }
}

