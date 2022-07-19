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
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * TestResultV2GetModel
 */
@JsonPropertyOrder({
  TestResultV2GetModel.JSON_PROPERTY_CONFIGURATION,
  TestResultV2GetModel.JSON_PROPERTY_AUTO_TEST,
  TestResultV2GetModel.JSON_PROPERTY_ID,
  TestResultV2GetModel.JSON_PROPERTY_CONFIGURATION_ID,
  TestResultV2GetModel.JSON_PROPERTY_WORK_ITEM_VERSION_ID,
  TestResultV2GetModel.JSON_PROPERTY_AUTO_TEST_ID,
  TestResultV2GetModel.JSON_PROPERTY_MESSAGE,
  TestResultV2GetModel.JSON_PROPERTY_TRACES,
  TestResultV2GetModel.JSON_PROPERTY_STARTED_ON,
  TestResultV2GetModel.JSON_PROPERTY_COMPLETED_ON,
  TestResultV2GetModel.JSON_PROPERTY_RUN_BY_USER_ID,
  TestResultV2GetModel.JSON_PROPERTY_STOPPED_BY_USER_ID,
  TestResultV2GetModel.JSON_PROPERTY_TEST_POINT_ID,
  TestResultV2GetModel.JSON_PROPERTY_TEST_POINT,
  TestResultV2GetModel.JSON_PROPERTY_TEST_RUN_ID,
  TestResultV2GetModel.JSON_PROPERTY_OUTCOME,
  TestResultV2GetModel.JSON_PROPERTY_COMMENT,
  TestResultV2GetModel.JSON_PROPERTY_LINKS,
  TestResultV2GetModel.JSON_PROPERTY_ATTACHMENTS,
  TestResultV2GetModel.JSON_PROPERTY_PARAMETERS,
  TestResultV2GetModel.JSON_PROPERTY_PROPERTIES
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TestResultV2GetModel {
  public static final String JSON_PROPERTY_CONFIGURATION = "configuration";
  private ConfigurationModel _configuration;

  public static final String JSON_PROPERTY_AUTO_TEST = "autoTest";
  private AutoTestModelV2GetModel autoTest;

  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_CONFIGURATION_ID = "configurationId";
  private UUID configurationId;

  public static final String JSON_PROPERTY_WORK_ITEM_VERSION_ID = "workItemVersionId";
  private UUID workItemVersionId;

  public static final String JSON_PROPERTY_AUTO_TEST_ID = "autoTestId";
  private JsonNullable<UUID> autoTestId = JsonNullable.<UUID>undefined();

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private JsonNullable<String> message = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TRACES = "traces";
  private JsonNullable<String> traces = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_STARTED_ON = "startedOn";
  private JsonNullable<OffsetDateTime> startedOn = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_COMPLETED_ON = "completedOn";
  private JsonNullable<OffsetDateTime> completedOn = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_RUN_BY_USER_ID = "runByUserId";
  private JsonNullable<UUID> runByUserId = JsonNullable.<UUID>undefined();

  public static final String JSON_PROPERTY_STOPPED_BY_USER_ID = "stoppedByUserId";
  private JsonNullable<UUID> stoppedByUserId = JsonNullable.<UUID>undefined();

  public static final String JSON_PROPERTY_TEST_POINT_ID = "testPointId";
  private JsonNullable<UUID> testPointId = JsonNullable.<UUID>undefined();

  public static final String JSON_PROPERTY_TEST_POINT = "testPoint";
  private TestPointShortModel testPoint;

  public static final String JSON_PROPERTY_TEST_RUN_ID = "testRunId";
  private UUID testRunId;

  public static final String JSON_PROPERTY_OUTCOME = "outcome";
  private JsonNullable<String> outcome = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_COMMENT = "comment";
  private JsonNullable<String> comment = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_LINKS = "links";
  private JsonNullable<List<LinkModel>> links = JsonNullable.<List<LinkModel>>undefined();

  public static final String JSON_PROPERTY_ATTACHMENTS = "attachments";
  private JsonNullable<List<AttachmentModel>> attachments = JsonNullable.<List<AttachmentModel>>undefined();

  public static final String JSON_PROPERTY_PARAMETERS = "parameters";
  private JsonNullable<Map<String, String>> parameters = JsonNullable.<Map<String, String>>undefined();

  public static final String JSON_PROPERTY_PROPERTIES = "properties";
  private JsonNullable<Map<String, String>> properties = JsonNullable.<Map<String, String>>undefined();

  public TestResultV2GetModel() { 
  }

  public TestResultV2GetModel _configuration(ConfigurationModel _configuration) {
    this._configuration = _configuration;
    return this;
  }

   /**
   * Get _configuration
   * @return _configuration
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONFIGURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ConfigurationModel getConfiguration() {
    return _configuration;
  }


  @JsonProperty(JSON_PROPERTY_CONFIGURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConfiguration(ConfigurationModel _configuration) {
    this._configuration = _configuration;
  }


  public TestResultV2GetModel autoTest(AutoTestModelV2GetModel autoTest) {
    this.autoTest = autoTest;
    return this;
  }

   /**
   * Get autoTest
   * @return autoTest
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AUTO_TEST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AutoTestModelV2GetModel getAutoTest() {
    return autoTest;
  }


  @JsonProperty(JSON_PROPERTY_AUTO_TEST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAutoTest(AutoTestModelV2GetModel autoTest) {
    this.autoTest = autoTest;
  }


  public TestResultV2GetModel id(UUID id) {
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


  public TestResultV2GetModel configurationId(UUID configurationId) {
    this.configurationId = configurationId;
    return this;
  }

   /**
   * Get configurationId
   * @return configurationId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "ceab5447-3791-4566-954f-8f2f7347a854", value = "")
  @JsonProperty(JSON_PROPERTY_CONFIGURATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getConfigurationId() {
    return configurationId;
  }


  @JsonProperty(JSON_PROPERTY_CONFIGURATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConfigurationId(UUID configurationId) {
    this.configurationId = configurationId;
  }


  public TestResultV2GetModel workItemVersionId(UUID workItemVersionId) {
    this.workItemVersionId = workItemVersionId;
    return this;
  }

   /**
   * Get workItemVersionId
   * @return workItemVersionId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "ceab5447-3791-4566-954f-8f2f7347a854", value = "")
  @JsonProperty(JSON_PROPERTY_WORK_ITEM_VERSION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getWorkItemVersionId() {
    return workItemVersionId;
  }


  @JsonProperty(JSON_PROPERTY_WORK_ITEM_VERSION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWorkItemVersionId(UUID workItemVersionId) {
    this.workItemVersionId = workItemVersionId;
  }


  public TestResultV2GetModel autoTestId(UUID autoTestId) {
    this.autoTestId = JsonNullable.<UUID>of(autoTestId);
    return this;
  }

   /**
   * Get autoTestId
   * @return autoTestId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "ceab5447-3791-4566-954f-8f2f7347a854", value = "")
  @JsonIgnore

  public UUID getAutoTestId() {
        return autoTestId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_AUTO_TEST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<UUID> getAutoTestId_JsonNullable() {
    return autoTestId;
  }
  
  @JsonProperty(JSON_PROPERTY_AUTO_TEST_ID)
  public void setAutoTestId_JsonNullable(JsonNullable<UUID> autoTestId) {
    this.autoTestId = autoTestId;
  }

  public void setAutoTestId(UUID autoTestId) {
    this.autoTestId = JsonNullable.<UUID>of(autoTestId);
  }


  public TestResultV2GetModel message(String message) {
    this.message = JsonNullable.<String>of(message);
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "ceab5447-3791-4566-954f-8f2f7347a854", value = "")
  @JsonIgnore

  public String getMessage() {
        return message.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getMessage_JsonNullable() {
    return message;
  }
  
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  public void setMessage_JsonNullable(JsonNullable<String> message) {
    this.message = message;
  }

  public void setMessage(String message) {
    this.message = JsonNullable.<String>of(message);
  }


  public TestResultV2GetModel traces(String traces) {
    this.traces = JsonNullable.<String>of(traces);
    return this;
  }

   /**
   * Get traces
   * @return traces
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Exception in thread main java.lang.NullPointerException at com.example.myproject.MyTest.HealtCheck()", value = "")
  @JsonIgnore

  public String getTraces() {
        return traces.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TRACES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getTraces_JsonNullable() {
    return traces;
  }
  
  @JsonProperty(JSON_PROPERTY_TRACES)
  public void setTraces_JsonNullable(JsonNullable<String> traces) {
    this.traces = traces;
  }

  public void setTraces(String traces) {
    this.traces = JsonNullable.<String>of(traces);
  }


  public TestResultV2GetModel startedOn(OffsetDateTime startedOn) {
    this.startedOn = JsonNullable.<OffsetDateTime>of(startedOn);
    return this;
  }

   /**
   * Get startedOn
   * @return startedOn
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "2022-07-14T09:52:35.620427900Z", value = "")
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


  public TestResultV2GetModel completedOn(OffsetDateTime completedOn) {
    this.completedOn = JsonNullable.<OffsetDateTime>of(completedOn);
    return this;
  }

   /**
   * Get completedOn
   * @return completedOn
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "2022-07-14T09:52:35.620427900Z", value = "")
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


  public TestResultV2GetModel runByUserId(UUID runByUserId) {
    this.runByUserId = JsonNullable.<UUID>of(runByUserId);
    return this;
  }

   /**
   * Get runByUserId
   * @return runByUserId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "ceab5447-3791-4566-954f-8f2f7347a854", value = "")
  @JsonIgnore

  public UUID getRunByUserId() {
        return runByUserId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_RUN_BY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<UUID> getRunByUserId_JsonNullable() {
    return runByUserId;
  }
  
  @JsonProperty(JSON_PROPERTY_RUN_BY_USER_ID)
  public void setRunByUserId_JsonNullable(JsonNullable<UUID> runByUserId) {
    this.runByUserId = runByUserId;
  }

  public void setRunByUserId(UUID runByUserId) {
    this.runByUserId = JsonNullable.<UUID>of(runByUserId);
  }


  public TestResultV2GetModel stoppedByUserId(UUID stoppedByUserId) {
    this.stoppedByUserId = JsonNullable.<UUID>of(stoppedByUserId);
    return this;
  }

   /**
   * Get stoppedByUserId
   * @return stoppedByUserId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "ceab5447-3791-4566-954f-8f2f7347a854", value = "")
  @JsonIgnore

  public UUID getStoppedByUserId() {
        return stoppedByUserId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_STOPPED_BY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<UUID> getStoppedByUserId_JsonNullable() {
    return stoppedByUserId;
  }
  
  @JsonProperty(JSON_PROPERTY_STOPPED_BY_USER_ID)
  public void setStoppedByUserId_JsonNullable(JsonNullable<UUID> stoppedByUserId) {
    this.stoppedByUserId = stoppedByUserId;
  }

  public void setStoppedByUserId(UUID stoppedByUserId) {
    this.stoppedByUserId = JsonNullable.<UUID>of(stoppedByUserId);
  }


  public TestResultV2GetModel testPointId(UUID testPointId) {
    this.testPointId = JsonNullable.<UUID>of(testPointId);
    return this;
  }

   /**
   * Get testPointId
   * @return testPointId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "ceab5447-3791-4566-954f-8f2f7347a854", value = "")
  @JsonIgnore

  public UUID getTestPointId() {
        return testPointId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TEST_POINT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<UUID> getTestPointId_JsonNullable() {
    return testPointId;
  }
  
  @JsonProperty(JSON_PROPERTY_TEST_POINT_ID)
  public void setTestPointId_JsonNullable(JsonNullable<UUID> testPointId) {
    this.testPointId = testPointId;
  }

  public void setTestPointId(UUID testPointId) {
    this.testPointId = JsonNullable.<UUID>of(testPointId);
  }


  public TestResultV2GetModel testPoint(TestPointShortModel testPoint) {
    this.testPoint = testPoint;
    return this;
  }

   /**
   * Get testPoint
   * @return testPoint
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TEST_POINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TestPointShortModel getTestPoint() {
    return testPoint;
  }


  @JsonProperty(JSON_PROPERTY_TEST_POINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTestPoint(TestPointShortModel testPoint) {
    this.testPoint = testPoint;
  }


  public TestResultV2GetModel testRunId(UUID testRunId) {
    this.testRunId = testRunId;
    return this;
  }

   /**
   * Get testRunId
   * @return testRunId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "ceab5447-3791-4566-954f-8f2f7347a854", value = "")
  @JsonProperty(JSON_PROPERTY_TEST_RUN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getTestRunId() {
    return testRunId;
  }


  @JsonProperty(JSON_PROPERTY_TEST_RUN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTestRunId(UUID testRunId) {
    this.testRunId = testRunId;
  }


  public TestResultV2GetModel outcome(String outcome) {
    this.outcome = JsonNullable.<String>of(outcome);
    return this;
  }

   /**
   * Property can contain one of these values: Passed, Failed, InProgress, Blocked, Skipped
   * @return outcome
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Passed", value = "Property can contain one of these values: Passed, Failed, InProgress, Blocked, Skipped")
  @JsonIgnore

  public String getOutcome() {
        return outcome.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_OUTCOME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getOutcome_JsonNullable() {
    return outcome;
  }
  
  @JsonProperty(JSON_PROPERTY_OUTCOME)
  public void setOutcome_JsonNullable(JsonNullable<String> outcome) {
    this.outcome = outcome;
  }

  public void setOutcome(String outcome) {
    this.outcome = JsonNullable.<String>of(outcome);
  }


  public TestResultV2GetModel comment(String comment) {
    this.comment = JsonNullable.<String>of(comment);
    return this;
  }

   /**
   * Get comment
   * @return comment
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "my first comment", value = "")
  @JsonIgnore

  public String getComment() {
        return comment.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_COMMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getComment_JsonNullable() {
    return comment;
  }
  
  @JsonProperty(JSON_PROPERTY_COMMENT)
  public void setComment_JsonNullable(JsonNullable<String> comment) {
    this.comment = comment;
  }

  public void setComment(String comment) {
    this.comment = JsonNullable.<String>of(comment);
  }


  public TestResultV2GetModel links(List<LinkModel> links) {
    this.links = JsonNullable.<List<LinkModel>>of(links);
    return this;
  }

  public TestResultV2GetModel addLinksItem(LinkModel linksItem) {
    if (this.links == null || !this.links.isPresent()) {
      this.links = JsonNullable.<List<LinkModel>>of(new ArrayList<>());
    }
    try {
      this.links.get().add(linksItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public List<LinkModel> getLinks() {
        return links.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<LinkModel>> getLinks_JsonNullable() {
    return links;
  }
  
  @JsonProperty(JSON_PROPERTY_LINKS)
  public void setLinks_JsonNullable(JsonNullable<List<LinkModel>> links) {
    this.links = links;
  }

  public void setLinks(List<LinkModel> links) {
    this.links = JsonNullable.<List<LinkModel>>of(links);
  }


  public TestResultV2GetModel attachments(List<AttachmentModel> attachments) {
    this.attachments = JsonNullable.<List<AttachmentModel>>of(attachments);
    return this;
  }

  public TestResultV2GetModel addAttachmentsItem(AttachmentModel attachmentsItem) {
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


  public TestResultV2GetModel parameters(Map<String, String> parameters) {
    this.parameters = JsonNullable.<Map<String, String>>of(parameters);
    return this;
  }

  public TestResultV2GetModel putParametersItem(String key, String parametersItem) {
    if (this.parameters == null || !this.parameters.isPresent()) {
      this.parameters = JsonNullable.<Map<String, String>>of(new HashMap<>());
    }
    try {
      this.parameters.get().put(key, parametersItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get parameters
   * @return parameters
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public Map<String, String> getParameters() {
        return parameters.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PARAMETERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Map<String, String>> getParameters_JsonNullable() {
    return parameters;
  }
  
  @JsonProperty(JSON_PROPERTY_PARAMETERS)
  public void setParameters_JsonNullable(JsonNullable<Map<String, String>> parameters) {
    this.parameters = parameters;
  }

  public void setParameters(Map<String, String> parameters) {
    this.parameters = JsonNullable.<Map<String, String>>of(parameters);
  }


  public TestResultV2GetModel properties(Map<String, String> properties) {
    this.properties = JsonNullable.<Map<String, String>>of(properties);
    return this;
  }

  public TestResultV2GetModel putPropertiesItem(String key, String propertiesItem) {
    if (this.properties == null || !this.properties.isPresent()) {
      this.properties = JsonNullable.<Map<String, String>>of(new HashMap<>());
    }
    try {
      this.properties.get().put(key, propertiesItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get properties
   * @return properties
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public Map<String, String> getProperties() {
        return properties.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PROPERTIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Map<String, String>> getProperties_JsonNullable() {
    return properties;
  }
  
  @JsonProperty(JSON_PROPERTY_PROPERTIES)
  public void setProperties_JsonNullable(JsonNullable<Map<String, String>> properties) {
    this.properties = properties;
  }

  public void setProperties(Map<String, String> properties) {
    this.properties = JsonNullable.<Map<String, String>>of(properties);
  }


  /**
   * Return true if this TestResultV2GetModel object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestResultV2GetModel testResultV2GetModel = (TestResultV2GetModel) o;
    return Objects.equals(this._configuration, testResultV2GetModel._configuration) &&
        Objects.equals(this.autoTest, testResultV2GetModel.autoTest) &&
        Objects.equals(this.id, testResultV2GetModel.id) &&
        Objects.equals(this.configurationId, testResultV2GetModel.configurationId) &&
        Objects.equals(this.workItemVersionId, testResultV2GetModel.workItemVersionId) &&
        equalsNullable(this.autoTestId, testResultV2GetModel.autoTestId) &&
        equalsNullable(this.message, testResultV2GetModel.message) &&
        equalsNullable(this.traces, testResultV2GetModel.traces) &&
        equalsNullable(this.startedOn, testResultV2GetModel.startedOn) &&
        equalsNullable(this.completedOn, testResultV2GetModel.completedOn) &&
        equalsNullable(this.runByUserId, testResultV2GetModel.runByUserId) &&
        equalsNullable(this.stoppedByUserId, testResultV2GetModel.stoppedByUserId) &&
        equalsNullable(this.testPointId, testResultV2GetModel.testPointId) &&
        Objects.equals(this.testPoint, testResultV2GetModel.testPoint) &&
        Objects.equals(this.testRunId, testResultV2GetModel.testRunId) &&
        equalsNullable(this.outcome, testResultV2GetModel.outcome) &&
        equalsNullable(this.comment, testResultV2GetModel.comment) &&
        equalsNullable(this.links, testResultV2GetModel.links) &&
        equalsNullable(this.attachments, testResultV2GetModel.attachments) &&
        equalsNullable(this.parameters, testResultV2GetModel.parameters) &&
        equalsNullable(this.properties, testResultV2GetModel.properties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(_configuration, autoTest, id, configurationId, workItemVersionId, hashCodeNullable(autoTestId), hashCodeNullable(message), hashCodeNullable(traces), hashCodeNullable(startedOn), hashCodeNullable(completedOn), hashCodeNullable(runByUserId), hashCodeNullable(stoppedByUserId), hashCodeNullable(testPointId), testPoint, testRunId, hashCodeNullable(outcome), hashCodeNullable(comment), hashCodeNullable(links), hashCodeNullable(attachments), hashCodeNullable(parameters), hashCodeNullable(properties));
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
    sb.append("class TestResultV2GetModel {\n");
    sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
    sb.append("    autoTest: ").append(toIndentedString(autoTest)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    configurationId: ").append(toIndentedString(configurationId)).append("\n");
    sb.append("    workItemVersionId: ").append(toIndentedString(workItemVersionId)).append("\n");
    sb.append("    autoTestId: ").append(toIndentedString(autoTestId)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    traces: ").append(toIndentedString(traces)).append("\n");
    sb.append("    startedOn: ").append(toIndentedString(startedOn)).append("\n");
    sb.append("    completedOn: ").append(toIndentedString(completedOn)).append("\n");
    sb.append("    runByUserId: ").append(toIndentedString(runByUserId)).append("\n");
    sb.append("    stoppedByUserId: ").append(toIndentedString(stoppedByUserId)).append("\n");
    sb.append("    testPointId: ").append(toIndentedString(testPointId)).append("\n");
    sb.append("    testPoint: ").append(toIndentedString(testPoint)).append("\n");
    sb.append("    testRunId: ").append(toIndentedString(testRunId)).append("\n");
    sb.append("    outcome: ").append(toIndentedString(outcome)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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

