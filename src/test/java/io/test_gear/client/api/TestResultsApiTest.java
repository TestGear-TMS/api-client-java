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


package io.test_gear.client.api;

import io.test_gear.client.invoker.*;

import org.junit.jupiter.api.Test;

/**
 * API tests for TestResultsApi
 */
public class TestResultsApiTest {

    private final TestResultsApi api = new TestResultsApi();

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2TestResultsIdAggregatedGetTest() throws ApiException {
        //UUID id = null;
        //TestResultModel response = api.apiV2TestResultsIdAggregatedGet(id);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2TestResultsIdAttachmentsAttachmentIdPutTest() throws ApiException {
        //UUID id = null;
        //UUID attachmentId = null;
        //api.apiV2TestResultsIdAttachmentsAttachmentIdPut(id, attachmentId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2TestResultsIdAttachmentsInfoGetTest() throws ApiException {
        //UUID id = null;
        //List<AttachmentModel> response = api.apiV2TestResultsIdAttachmentsInfoGet(id);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2TestResultsIdExternalProjectsExternalProjectIdDefectPostTest() throws ApiException {
        //UUID id = null;
        //UUID externalProjectId = null;
        //Object body = null;
        //String response = api.apiV2TestResultsIdExternalProjectsExternalProjectIdDefectPost(id, externalProjectId, body);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2TestResultsIdExternalProjectsExternalProjectIdFormGetTest() throws ApiException {
        //UUID id = null;
        //UUID externalProjectId = null;
        //Object response = api.apiV2TestResultsIdExternalProjectsExternalProjectIdFormGet(id, externalProjectId);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2TestResultsIdGetTest() throws ApiException {
        //UUID id = null;
        //TestResultModel response = api.apiV2TestResultsIdGet(id);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2TestResultsIdLinkRequestsPostTest() throws ApiException {
        //UUID id = null;
        //TestResultLinkRequestPostModel testResultLinkRequestPostModel = null;
        //UUID response = api.apiV2TestResultsIdLinkRequestsPost(id, testResultLinkRequestPostModel);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2TestResultsIdPutTest() throws ApiException {
        //UUID id = null;
        //TestResultCreateModel testResultCreateModel = null;
        //api.apiV2TestResultsIdPut(id, testResultCreateModel);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2TestResultsLinkRequestsLinkRequestIdUsePostTest() throws ApiException {
        //UUID linkRequestId = null;
        //UseTestResultLinkRequestPostModel useTestResultLinkRequestPostModel = null;
        //LinkModel response = api.apiV2TestResultsLinkRequestsLinkRequestIdUsePost(linkRequestId, useTestResultLinkRequestPostModel);
        // TODO: test validations
    }

    /**
     * Upload and link attachment to TestResult
     *
     * &lt;br&gt;Use case  &lt;br&gt;User sets testResultId  &lt;br&gt;User attaches a file  &lt;br&gt;System creates attachment and links it to the test result  &lt;br&gt;System returns attachment identifier
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createAttachmentTest() throws ApiException {
        //UUID id = null;
        //File _file = null;
        //UUID response = api.createAttachment(id, _file);
        // TODO: test validations
    }

    /**
     * Remove attachment and unlink from TestResult
     *
     * &lt;br&gt;Use case  &lt;br&gt;User sets testResultId and attachmentId  &lt;br&gt;User attaches a file  &lt;br&gt;User runs method execution  &lt;br&gt;System deletes attachment and unlinks it from the test result  &lt;br&gt;System returns attachment identifier
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteAttachmentTest() throws ApiException {
        //UUID id = null;
        //UUID attachmentId = null;
        //api.deleteAttachment(id, attachmentId);
        // TODO: test validations
    }

    /**
     * Get attachment of TestResult
     *
     * &lt;br&gt;Use case  &lt;br&gt;User sets attachmentId and testResultId  &lt;br&gt;[Optional] User sets resize configuration  &lt;br&gt;User runs method execution  &lt;br&gt;System search attachments by the attachmentId and the testResultId  &lt;br&gt;                      [Optional] If resize configuration is set, System resizes the attachment according to the resize                      configuration                    &lt;br&gt;[Optional] Otherwise, System does not resize the attachment  &lt;br&gt;System returns attachment as a file
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void downloadAttachmentTest() throws ApiException {
        //UUID attachmentId = null;
        //UUID id = null;
        //Integer width = null;
        //Integer height = null;
        //ImageResizeType resizeType = null;
        //String backgroundColor = null;
        //Boolean preview = null;
        //api.downloadAttachment(attachmentId, id, width, height, resizeType, backgroundColor, preview);
        // TODO: test validations
    }

    /**
     * Get Metadata of TestResult&#39;s attachment
     *
     * &lt;br&gt;Use case  &lt;br&gt;User sets attachmentId and testResultId  &lt;br&gt;User runs method execution  &lt;br&gt;System search attachment by the attachmentId and the testResultId  &lt;br&gt;System returns attachment data
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAttachmentTest() throws ApiException {
        //UUID id = null;
        //UUID attachmentId = null;
        //AttachmentModel response = api.getAttachment(id, attachmentId);
        // TODO: test validations
    }

    /**
     * Get all attachments of TestResult
     *
     * &lt;br&gt;Use case  &lt;br&gt;User sets testResultId  &lt;br&gt;User runs method execution  &lt;br&gt;System search all attachments of the test result  &lt;br&gt;System returns attachments enumeration
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAttachmentsTest() throws ApiException {
        //UUID id = null;
        //List<AttachmentModel> response = api.getAttachments(id);
        // TODO: test validations
    }

}
