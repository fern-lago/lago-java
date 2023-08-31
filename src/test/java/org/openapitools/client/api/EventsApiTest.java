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
import org.openapitools.client.model.ApiResponseNotFound;
import org.openapitools.client.model.ApiResponseUnauthorized;
import org.openapitools.client.model.ApiResponseUnprocessableEntity;
import org.openapitools.client.model.BatchEventInput;
import org.openapitools.client.model.Event;
import org.openapitools.client.model.EventEstimateFeesInput;
import org.openapitools.client.model.EventInput;
import org.openapitools.client.model.Fees;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EventsApi
 */
@Disabled
public class EventsApiTest {

    private final EventsApi api = new EventsApi();

    /**
     * Create batch events
     *
     * Create batch events
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createBatchEventsTest() throws ApiException {
        BatchEventInput batchEventInput = null;
        api.createBatchEvents(batchEventInput);
        // TODO: test validations
    }

    /**
     * Create a new event
     *
     * Create a new event
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createEventTest() throws ApiException {
        EventInput eventInput = null;
        api.createEvent(eventInput);
        // TODO: test validations
    }

    /**
     * Estimate fees for an instant charge
     *
     * Estimate the fees that would be created after reception of an event for a billable metric attached to one or multiple instant charges
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void eventEstimateFeesTest() throws ApiException {
        EventEstimateFeesInput eventEstimateFeesInput = null;
        Fees response = api.eventEstimateFees(eventEstimateFeesInput);
        // TODO: test validations
    }

    /**
     * Find event by transaction ID
     *
     * Return a single event
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void findEventTest() throws ApiException {
        String id = null;
        Event response = api.findEvent(id);
        // TODO: test validations
    }

}