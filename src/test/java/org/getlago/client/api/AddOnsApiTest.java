/*
 * Lago API documentation
 * Lago API allows your application to push customer information and metrics (events) from your application to the billing application.
 *
 * The version of the OpenAPI document: 0.52.2-beta
 * Contact: tech@getlago.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.getlago.client.api;

import org.openapitools.client.model.AddOn;
import org.openapitools.client.model.AddOnCreateInput;
import org.openapitools.client.model.AddOnUpdateInput;
import org.openapitools.client.model.AddOnsPaginated;
import org.openapitools.client.model.ApiErrorBadRequest;
import org.openapitools.client.model.ApiErrorNotFound;
import org.openapitools.client.model.ApiErrorUnauthorized;
import org.openapitools.client.model.ApiErrorUnprocessableEntity;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * API tests for AddOnsApi
 */
@Ignore
public class AddOnsApiTest {

    private final AddOnsApi api = new AddOnsApi();

    
    /**
     * Create an add-on
     *
     * This endpoint is used to create an add-on that can be then attached to a one-off invoice.
     */
    @Test
    public void createAddOnTest()  {
        AddOnCreateInput addOnCreateInput = null;
        AddOn response = api.createAddOn(addOnCreateInput).block();

        // TODO: test validations
    }
    
    /**
     * Delete an add-on
     *
     * This endpoint is used to delete an existing add-on.
     */
    @Test
    public void destroyAddOnTest()  {
        String code = null;
        AddOn response = api.destroyAddOn(code).block();

        // TODO: test validations
    }
    
    /**
     * Retrieve an add-on
     *
     * This endpoint is used to retrieve a specific add-on.
     */
    @Test
    public void findAddOnTest()  {
        String code = null;
        AddOn response = api.findAddOn(code).block();

        // TODO: test validations
    }
    
    /**
     * List all add-ons
     *
     * This endpoint is used to list all existing add-ons.
     */
    @Test
    public void findAllAddOnsTest()  {
        Integer page = null;
        Integer perPage = null;
        AddOnsPaginated response = api.findAllAddOns(page, perPage).block();

        // TODO: test validations
    }
    
    /**
     * Update an add-on
     *
     * This endpoint is used to update an existing add-on.
     */
    @Test
    public void updateAddOnTest()  {
        String code = null;
        AddOnUpdateInput addOnUpdateInput = null;
        AddOn response = api.updateAddOn(code, addOnUpdateInput).block();

        // TODO: test validations
    }
    
}
