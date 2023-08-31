/*
 * Lago API documentation
 * Lago API allows your application to push customer information and metrics (events) from your application to the billing application.
 *
 * The version of the OpenAPI document: 0.32.0-beta
 * Contact: tech@getlago.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.ApiResponseBadRequest;
import org.openapitools.client.model.ApiResponseUnauthorized;
import org.openapitools.client.model.ApiResponseUnprocessableEntity;
import org.openapitools.client.model.Organization;
import org.openapitools.client.model.OrganizationInput;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for OrganizationsApi
 */
@Disabled
public class OrganizationsApiTest {

    private final OrganizationsApi api = new OrganizationsApi();

    /**
     * Update an existing Organization
     *
     * Update an existing organization
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateOrganizationTest() throws ApiException {
        OrganizationInput organizationInput = null;
        Organization response = api.updateOrganization(organizationInput);
        // TODO: test validations
    }

}