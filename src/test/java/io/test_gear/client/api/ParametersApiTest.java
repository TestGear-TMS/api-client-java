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
 * API tests for ParametersApi
 */
public class ParametersApiTest {

    private final ParametersApi api = new ParametersApi();

    /**
     * Create multiple parameters
     *
     * &lt;br&gt;Use case  &lt;br&gt;User sets list of parameter model (listed in the request example)  &lt;br&gt;User runs method execution  &lt;br&gt;System creates parameters  &lt;br&gt;System returns list of parameter model (listed in the response example)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2ParametersBulkPostTest() throws ApiException {
        //List<ParameterPostModel> parameterPostModel = null;
        //List<ParameterModel> response = api.apiV2ParametersBulkPost(parameterPostModel);
        // TODO: test validations
    }

    /**
     * Update multiple parameters
     *
     * &lt;br&gt;Use case  &lt;br&gt;User sets list of parameter model (listed in the request example)  &lt;br&gt;User runs method execution  &lt;br&gt;System updates parameters
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2ParametersBulkPutTest() throws ApiException {
        //List<ParameterPutModel> parameterPutModel = null;
        //api.apiV2ParametersBulkPut(parameterPutModel);
        // TODO: test validations
    }

    /**
     * Get parameters as group
     *
     * &lt;br&gt;Use case  &lt;br&gt;User runs method execution  &lt;br&gt;System search parameters  &lt;br&gt;System returns parameters models as groups (listed in the response example)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2ParametersGroupsGetTest() throws ApiException {
        //Boolean isDeleted = null;
        //Set<UUID> parameterKeyIds = null;
        //Integer skip = null;
        //Integer take = null;
        //String orderBy = null;
        //String searchField = null;
        //String searchValue = null;
        //List<ParameterGroupModel> response = api.apiV2ParametersGroupsGet(isDeleted, parameterKeyIds, skip, take, orderBy, searchField, searchValue);
        // TODO: test validations
    }

    /**
     * Check existence parameter key in system
     *
     * &lt;br&gt;Use case  &lt;br&gt;User sets name of parameter key  &lt;br&gt;User runs method execution  &lt;br&gt;System search parameter key  &lt;br&gt;System returns the flag for the existence of the parameter key in the system
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2ParametersKeyNameNameExistsGetTest() throws ApiException {
        //String name = null;
        //Boolean response = api.apiV2ParametersKeyNameNameExistsGet(name);
        // TODO: test validations
    }

    /**
     * Get all parameter key values
     *
     * &lt;br&gt;Use case  &lt;br&gt;User sets parameter key (string format)  &lt;br&gt;User runs method execution  &lt;br&gt;System search parameter values using the key  &lt;br&gt;System returns parameter
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2ParametersKeyValuesGetTest() throws ApiException {
        //String key = null;
        //List<String> response = api.apiV2ParametersKeyValuesGet(key);
        // TODO: test validations
    }

    /**
     * Get all parameter keys
     *
     * &lt;br&gt;Use case  &lt;br&gt;User runs method execution  &lt;br&gt;System search all parameter keys  &lt;br&gt;System returns parameter keys
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void apiV2ParametersKeysGetTest() throws ApiException {
        //List<String> response = api.apiV2ParametersKeysGet();
        // TODO: test validations
    }

    /**
     * Create parameter
     *
     * &lt;br&gt;Use case  &lt;br&gt;User sets parameter model (listed in the request example)  &lt;br&gt;User runs method execution  &lt;br&gt;System creates parameter  &lt;br&gt;System returns parameter model
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createParameterTest() throws ApiException {
        //ParameterPostModel parameterPostModel = null;
        //ParameterModel response = api.createParameter(parameterPostModel);
        // TODO: test validations
    }

    /**
     * Delete parameter by name
     *
     * Deletes parameter and all it&#39;s values
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteByNameTest() throws ApiException {
        //String name = null;
        //api.deleteByName(name);
        // TODO: test validations
    }

    /**
     * Delete parameters by parameter key identifier
     *
     * Deletes parameter and all it&#39;s values by parameter key identifier
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteByParameterKeyIdTest() throws ApiException {
        //UUID keyId = null;
        //api.deleteByParameterKeyId(keyId);
        // TODO: test validations
    }

    /**
     * Delete parameter
     *
     * &lt;br&gt;Use case  &lt;br&gt;User sets parameter internal (guid format) identifier  &lt;br&gt;System search and delete parameter  &lt;br&gt;System returns deleted parameter
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteParameterTest() throws ApiException {
        //UUID id = null;
        //ParameterModel response = api.deleteParameter(id);
        // TODO: test validations
    }

    /**
     * Get all parameters
     *
     * &lt;br&gt;Use case  &lt;br&gt;[Optional] User sets isDeleted field value  &lt;br&gt;[Optional] If User sets isDeleted field value as true, System search all deleted parameters  &lt;br&gt;[Optional] If User sets isDeleted field value as false, System search all parameters which are not deleted  &lt;br&gt;If User did not set isDeleted field value, System search all parameters  &lt;br&gt;System returns array of all found parameters(listed in response model)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllParametersTest() throws ApiException {
        //Boolean isDeleted = null;
        //Integer skip = null;
        //Integer take = null;
        //String orderBy = null;
        //String searchField = null;
        //String searchValue = null;
        //ParameterModel response = api.getAllParameters(isDeleted, skip, take, orderBy, searchField, searchValue);
        // TODO: test validations
    }

    /**
     * Get parameter by ID
     *
     * &lt;br&gt;Use case  &lt;br&gt;User sets parameter internal (guid format) identifier  &lt;br&gt;User runs method execution  &lt;br&gt;System search parameter using the identifier  &lt;br&gt;System returns parameter
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getParameterByIdTest() throws ApiException {
        //UUID id = null;
        //ParameterModel response = api.getParameterById(id);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void obsoleteDeleteByNameTest() throws ApiException {
        //String name = null;
        //api.obsoleteDeleteByName(name);
        // TODO: test validations
    }

    /**
     * Update parameter
     *
     * &lt;br&gt;Use case  &lt;br&gt;User sets parameter updated properties(listed in the request example)  &lt;br&gt;User runs method execution  &lt;br&gt;System updated parameter using updated properties  &lt;br&gt;System returns no content response
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateParameterTest() throws ApiException {
        //ParameterPutModel parameterPutModel = null;
        //api.updateParameter(parameterPutModel);
        // TODO: test validations
    }

}
