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

import io.test_gear.client.invoker.ApiCallback;
import io.test_gear.client.invoker.ApiClient;
import io.test_gear.client.invoker.ApiException;
import io.test_gear.client.invoker.ApiResponse;
import io.test_gear.client.invoker.Configuration;
import io.test_gear.client.invoker.Pair;
import io.test_gear.client.invoker.ProgressRequestBody;
import io.test_gear.client.invoker.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.test_gear.client.model.ProblemDetails;
import io.test_gear.client.model.TestPointFilterModel;
import io.test_gear.client.model.TestPointShortGetModel;
import io.test_gear.client.model.TestRunModel;
import java.util.UUID;
import io.test_gear.client.model.WorkItemModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class TestPointsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public TestPointsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public TestPointsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for apiV2TestPointsIdTestRunsGet
     * @param id Test point unique ID (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Read permission for test points is required </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV2TestPointsIdTestRunsGetCall(UUID id, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v2/testPoints/{id}/testRuns"
            .replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "Bearer or PrivateToken" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call apiV2TestPointsIdTestRunsGetValidateBeforeCall(UUID id, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling apiV2TestPointsIdTestRunsGet(Async)");
        }

        return apiV2TestPointsIdTestRunsGetCall(id, _callback);

    }

    /**
     * Get all test runs which use test point
     * 
     * @param id Test point unique ID (required)
     * @return List&lt;TestRunModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Read permission for test points is required </td><td>  -  </td></tr>
     </table>
     */
    public List<TestRunModel> apiV2TestPointsIdTestRunsGet(UUID id) throws ApiException {
        ApiResponse<List<TestRunModel>> localVarResp = apiV2TestPointsIdTestRunsGetWithHttpInfo(id);
        return localVarResp.getData();
    }

    /**
     * Get all test runs which use test point
     * 
     * @param id Test point unique ID (required)
     * @return ApiResponse&lt;List&lt;TestRunModel&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Read permission for test points is required </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<TestRunModel>> apiV2TestPointsIdTestRunsGetWithHttpInfo(UUID id) throws ApiException {
        okhttp3.Call localVarCall = apiV2TestPointsIdTestRunsGetValidateBeforeCall(id, null);
        Type localVarReturnType = new TypeToken<List<TestRunModel>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get all test runs which use test point (asynchronously)
     * 
     * @param id Test point unique ID (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Read permission for test points is required </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV2TestPointsIdTestRunsGetAsync(UUID id, final ApiCallback<List<TestRunModel>> _callback) throws ApiException {

        okhttp3.Call localVarCall = apiV2TestPointsIdTestRunsGetValidateBeforeCall(id, _callback);
        Type localVarReturnType = new TypeToken<List<TestRunModel>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for apiV2TestPointsIdWorkItemGet
     * @param id Test point unique ID (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 403 </td><td> Read permission for test points is required </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV2TestPointsIdWorkItemGetCall(UUID id, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v2/testPoints/{id}/workItem"
            .replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "Bearer or PrivateToken" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call apiV2TestPointsIdWorkItemGetValidateBeforeCall(UUID id, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling apiV2TestPointsIdWorkItemGet(Async)");
        }

        return apiV2TestPointsIdWorkItemGetCall(id, _callback);

    }

    /**
     * Get work item represented by test point
     * 
     * @param id Test point unique ID (required)
     * @return WorkItemModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 403 </td><td> Read permission for test points is required </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public WorkItemModel apiV2TestPointsIdWorkItemGet(UUID id) throws ApiException {
        ApiResponse<WorkItemModel> localVarResp = apiV2TestPointsIdWorkItemGetWithHttpInfo(id);
        return localVarResp.getData();
    }

    /**
     * Get work item represented by test point
     * 
     * @param id Test point unique ID (required)
     * @return ApiResponse&lt;WorkItemModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 403 </td><td> Read permission for test points is required </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<WorkItemModel> apiV2TestPointsIdWorkItemGetWithHttpInfo(UUID id) throws ApiException {
        okhttp3.Call localVarCall = apiV2TestPointsIdWorkItemGetValidateBeforeCall(id, null);
        Type localVarReturnType = new TypeToken<WorkItemModel>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get work item represented by test point (asynchronously)
     * 
     * @param id Test point unique ID (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 403 </td><td> Read permission for test points is required </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV2TestPointsIdWorkItemGetAsync(UUID id, final ApiCallback<WorkItemModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = apiV2TestPointsIdWorkItemGetValidateBeforeCall(id, _callback);
        Type localVarReturnType = new TypeToken<WorkItemModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for apiV2TestPointsSearchIdPost
     * @param skip Amount of items to be skipped (offset) (optional)
     * @param take Amount of items to be taken (limit) (optional)
     * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
     * @param searchField Property name for searching (optional)
     * @param searchValue Value for searching (optional)
     * @param testPointFilterModel  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 403 </td><td> Read permission for all requested test plans is required </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
     </table>
     */
    public okhttp3.Call apiV2TestPointsSearchIdPostCall(Integer skip, Integer take, String orderBy, String searchField, String searchValue, TestPointFilterModel testPointFilterModel, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = testPointFilterModel;

        // create path and map variables
        String localVarPath = "/api/v2/testPoints/search/id";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (skip != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("Skip", skip));
        }

        if (take != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("Take", take));
        }

        if (orderBy != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("OrderBy", orderBy));
        }

        if (searchField != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("SearchField", searchField));
        }

        if (searchValue != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("SearchValue", searchValue));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "Bearer or PrivateToken" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call apiV2TestPointsSearchIdPostValidateBeforeCall(Integer skip, Integer take, String orderBy, String searchField, String searchValue, TestPointFilterModel testPointFilterModel, final ApiCallback _callback) throws ApiException {
        return apiV2TestPointsSearchIdPostCall(skip, take, orderBy, searchField, searchValue, testPointFilterModel, _callback);

    }

    /**
     * Search for test points and extract IDs only
     * 
     * @param skip Amount of items to be skipped (offset) (optional)
     * @param take Amount of items to be taken (limit) (optional)
     * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
     * @param searchField Property name for searching (optional)
     * @param searchValue Value for searching (optional)
     * @param testPointFilterModel  (optional)
     * @return List&lt;UUID&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 403 </td><td> Read permission for all requested test plans is required </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
     </table>
     */
    public List<UUID> apiV2TestPointsSearchIdPost(Integer skip, Integer take, String orderBy, String searchField, String searchValue, TestPointFilterModel testPointFilterModel) throws ApiException {
        ApiResponse<List<UUID>> localVarResp = apiV2TestPointsSearchIdPostWithHttpInfo(skip, take, orderBy, searchField, searchValue, testPointFilterModel);
        return localVarResp.getData();
    }

    /**
     * Search for test points and extract IDs only
     * 
     * @param skip Amount of items to be skipped (offset) (optional)
     * @param take Amount of items to be taken (limit) (optional)
     * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
     * @param searchField Property name for searching (optional)
     * @param searchValue Value for searching (optional)
     * @param testPointFilterModel  (optional)
     * @return ApiResponse&lt;List&lt;UUID&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 403 </td><td> Read permission for all requested test plans is required </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
     </table>
     */
    public ApiResponse<List<UUID>> apiV2TestPointsSearchIdPostWithHttpInfo(Integer skip, Integer take, String orderBy, String searchField, String searchValue, TestPointFilterModel testPointFilterModel) throws ApiException {
        okhttp3.Call localVarCall = apiV2TestPointsSearchIdPostValidateBeforeCall(skip, take, orderBy, searchField, searchValue, testPointFilterModel, null);
        Type localVarReturnType = new TypeToken<List<UUID>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Search for test points and extract IDs only (asynchronously)
     * 
     * @param skip Amount of items to be skipped (offset) (optional)
     * @param take Amount of items to be taken (limit) (optional)
     * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
     * @param searchField Property name for searching (optional)
     * @param searchValue Value for searching (optional)
     * @param testPointFilterModel  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 403 </td><td> Read permission for all requested test plans is required </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
     </table>
     */
    public okhttp3.Call apiV2TestPointsSearchIdPostAsync(Integer skip, Integer take, String orderBy, String searchField, String searchValue, TestPointFilterModel testPointFilterModel, final ApiCallback<List<UUID>> _callback) throws ApiException {

        okhttp3.Call localVarCall = apiV2TestPointsSearchIdPostValidateBeforeCall(skip, take, orderBy, searchField, searchValue, testPointFilterModel, _callback);
        Type localVarReturnType = new TypeToken<List<UUID>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for apiV2TestPointsSearchPost
     * @param skip Amount of items to be skipped (offset) (optional)
     * @param take Amount of items to be taken (limit) (optional)
     * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
     * @param searchField Property name for searching (optional)
     * @param searchValue Value for searching (optional)
     * @param testPointFilterModel  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
        <tr><td> 403 </td><td> Read permission for all requested test plans is required </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV2TestPointsSearchPostCall(Integer skip, Integer take, String orderBy, String searchField, String searchValue, TestPointFilterModel testPointFilterModel, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = testPointFilterModel;

        // create path and map variables
        String localVarPath = "/api/v2/testPoints/search";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (skip != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("Skip", skip));
        }

        if (take != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("Take", take));
        }

        if (orderBy != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("OrderBy", orderBy));
        }

        if (searchField != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("SearchField", searchField));
        }

        if (searchValue != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("SearchValue", searchValue));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "Bearer or PrivateToken" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call apiV2TestPointsSearchPostValidateBeforeCall(Integer skip, Integer take, String orderBy, String searchField, String searchValue, TestPointFilterModel testPointFilterModel, final ApiCallback _callback) throws ApiException {
        return apiV2TestPointsSearchPostCall(skip, take, orderBy, searchField, searchValue, testPointFilterModel, _callback);

    }

    /**
     * Search for test points
     * 
     * @param skip Amount of items to be skipped (offset) (optional)
     * @param take Amount of items to be taken (limit) (optional)
     * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
     * @param searchField Property name for searching (optional)
     * @param searchValue Value for searching (optional)
     * @param testPointFilterModel  (optional)
     * @return List&lt;TestPointShortGetModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
        <tr><td> 403 </td><td> Read permission for all requested test plans is required </td><td>  -  </td></tr>
     </table>
     */
    public List<TestPointShortGetModel> apiV2TestPointsSearchPost(Integer skip, Integer take, String orderBy, String searchField, String searchValue, TestPointFilterModel testPointFilterModel) throws ApiException {
        ApiResponse<List<TestPointShortGetModel>> localVarResp = apiV2TestPointsSearchPostWithHttpInfo(skip, take, orderBy, searchField, searchValue, testPointFilterModel);
        return localVarResp.getData();
    }

    /**
     * Search for test points
     * 
     * @param skip Amount of items to be skipped (offset) (optional)
     * @param take Amount of items to be taken (limit) (optional)
     * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
     * @param searchField Property name for searching (optional)
     * @param searchValue Value for searching (optional)
     * @param testPointFilterModel  (optional)
     * @return ApiResponse&lt;List&lt;TestPointShortGetModel&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
        <tr><td> 403 </td><td> Read permission for all requested test plans is required </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<TestPointShortGetModel>> apiV2TestPointsSearchPostWithHttpInfo(Integer skip, Integer take, String orderBy, String searchField, String searchValue, TestPointFilterModel testPointFilterModel) throws ApiException {
        okhttp3.Call localVarCall = apiV2TestPointsSearchPostValidateBeforeCall(skip, take, orderBy, searchField, searchValue, testPointFilterModel, null);
        Type localVarReturnType = new TypeToken<List<TestPointShortGetModel>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Search for test points (asynchronously)
     * 
     * @param skip Amount of items to be skipped (offset) (optional)
     * @param take Amount of items to be taken (limit) (optional)
     * @param orderBy SQL-like  ORDER BY statement (column1 ASC|DESC , column2 ASC|DESC) (optional)
     * @param searchField Property name for searching (optional)
     * @param searchValue Value for searching (optional)
     * @param testPointFilterModel  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  * Pagination-Skip - Skipped amount of items <br>  * Pagination-Take - Taken items <br>  * Pagination-Pages - Expected number of pages <br>  * Pagination-Total-Items - Total count of items <br>  </td></tr>
        <tr><td> 403 </td><td> Read permission for all requested test plans is required </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call apiV2TestPointsSearchPostAsync(Integer skip, Integer take, String orderBy, String searchField, String searchValue, TestPointFilterModel testPointFilterModel, final ApiCallback<List<TestPointShortGetModel>> _callback) throws ApiException {

        okhttp3.Call localVarCall = apiV2TestPointsSearchPostValidateBeforeCall(skip, take, orderBy, searchField, searchValue, testPointFilterModel, _callback);
        Type localVarReturnType = new TypeToken<List<TestPointShortGetModel>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
