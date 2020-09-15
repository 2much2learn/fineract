package org.apache.fineract.client.services;

import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.models.DeleteInterestRateChartsChartIdResponse;
import org.apache.fineract.client.models.GetInterestRateChartsResponse;
import org.apache.fineract.client.models.GetInterestRateChartsTemplateResponse;
import org.apache.fineract.client.models.PostInterestRateChartsRequest;
import org.apache.fineract.client.models.PostInterestRateChartsResponse;
import org.apache.fineract.client.models.PutInterestRateChartsChartIdRequest;
import org.apache.fineract.client.models.PutInterestRateChartsChartIdResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for InterestRateChartApi
 */
public class InterestRateChartApiTest {

    private InterestRateChartApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(InterestRateChartApi.class);
    }


    /**
     * Create a Chart
     *
     * Creates a new chart which can be attached to a term deposit products (FD or RD).
     */
    @Test
    public void create9Test() {
        PostInterestRateChartsRequest body = null;
        // PostInterestRateChartsResponse response = api.create9(body);

        // TODO: test validations
    }

    /**
     * Delete a Chart
     *
     * It deletes the chart
     */
    @Test
    public void delete13Test() {
        Long chartId = null;
        // DeleteInterestRateChartsChartIdResponse response = api.delete13(chartId);

        // TODO: test validations
    }

    /**
     * Retrieve all Charts
     *
     * Retrieve list of charts associated with a term deposit product(FD or RD). Example Requests:  interestratecharts?productId&#x3D;1
     */
    @Test
    public void retrieveAll25Test() {
        Long productId = null;
        // List<GetInterestRateChartsResponse> response = api.retrieveAll25(productId);

        // TODO: test validations
    }

    /**
     * Retrieve a Chart
     *
     * It retrieves the Interest Rate Chart Example Requests:  interestratecharts/1
     */
    @Test
    public void retrieveOne15Test() {
        Long chartId = null;
        // GetInterestRateChartsResponse response = api.retrieveOne15(chartId);

        // TODO: test validations
    }

    /**
     * Retrieve Chart Details Template
     *
     * This is a convenience resource. It can be useful when building maintenance user interface screens for creating a chart. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists Example Request:  interestratecharts/template
     */
    @Test
    public void template9Test() {
        // GetInterestRateChartsTemplateResponse response = api.template9();

        // TODO: test validations
    }

    /**
     * Update a Chart
     *
     * It updates the chart
     */
    @Test
    public void update13Test() {
        PutInterestRateChartsChartIdRequest body = null;
        Long chartId = null;
        // PutInterestRateChartsChartIdResponse response = api.update13(body, chartId);

        // TODO: test validations
    }
}
