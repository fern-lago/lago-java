/*
 * Lago API documentation
 * Lago API allows your application to push customer information and metrics (events) from your application to the billing application.
 *
 * The version of the OpenAPI document: 0.52.0-beta
 * Contact: tech@getlago.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.getlago.client.api;

import org.openapitools.client.model.ApiErrorBadRequest;
import org.openapitools.client.model.ApiErrorUnauthorized;
import org.openapitools.client.model.ApiErrorUnprocessableEntity;
import org.openapitools.client.model.Organization;
import org.openapitools.client.model.OrganizationUpdateInput;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * API tests for OrganizationsApi
 */
@Ignore
public class OrganizationsApiTest {

    private final OrganizationsApi api = new OrganizationsApi();

    
    /**
     * Update your organization
     *
     * This endpoint is used to update your own organization&#39;s settings.
     */
    @Test
    public void updateOrganizationTest()  {
        OrganizationUpdateInput organizationUpdateInput = null;
        Organization response = api.updateOrganization(organizationUpdateInput).block();

        // TODO: test validations
    }
    
}
