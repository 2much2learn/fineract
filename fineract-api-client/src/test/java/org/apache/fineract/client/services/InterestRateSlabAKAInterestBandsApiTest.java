package org.apache.fineract.client.services;

import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.models.DeleteInterestRateChartsChartIdChartSlabsResponse;
import org.apache.fineract.client.models.GetInterestRateChartsChartIdChartSlabsResponse;
import org.apache.fineract.client.models.PostInterestRateChartsChartIdChartSlabsRequest;
import org.apache.fineract.client.models.PostInterestRateChartsChartIdChartSlabsResponse;
import org.apache.fineract.client.models.PutInterestRateChartsChartIdChartSlabsChartSlabIdRequest;
import org.apache.fineract.client.models.PutInterestRateChartsChartIdChartSlabsChartSlabIdResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for InterestRateSlabAKAInterestBandsApi
 */
public class InterestRateSlabAKAInterestBandsApiTest {

    private InterestRateSlabAKAInterestBandsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(InterestRateSlabAKAInterestBandsApi.class);
    }


    /**
     * Create a Slab
     *
     * Creates a new interest rate slab for an interest rate chart. Mandatory Fields periodType, fromPeriod, annualInterestRate Optional Fields toPeriod and description Example Requests:  interestratecharts/1/chartslabs
     */
    @Test
    public void create8Test() {
        PostInterestRateChartsChartIdChartSlabsRequest body = null;
        Long chartId = null;
        // PostInterestRateChartsChartIdChartSlabsResponse response = api.create8(body, chartId);

        // TODO: test validations
    }

    /**
     * Delete a Slab
     *
     * Delete a Slab from a chart
     */
    @Test
    public void delete12Test() {
        Long chartId = null;
        Long chartSlabId = null;
        // DeleteInterestRateChartsChartIdChartSlabsResponse response = api.delete12(chartId, chartSlabId);

        // TODO: test validations
    }

    /**
     * Retrieve all Slabs
     *
     * Retrieve list of slabs associated with a chart  Example Requests:  interestratecharts/1/chartslabs
     */
    @Test
    public void retrieveAll24Test() {
        Long chartId = null;
        // List<GetInterestRateChartsChartIdChartSlabsResponse> response = api.retrieveAll24(chartId);

        // TODO: test validations
    }

    /**
     * Retrieve a Slab
     *
     * Retrieve a slab associated with an Interest rate chart  Example Requests:  interestratecharts/1/chartslabs/1 
     */
    @Test
    public void retrieveOne14Test() {
        Long chartId = null;
        Long chartSlabId = null;
        // GetInterestRateChartsChartIdChartSlabsResponse response = api.retrieveOne14(chartId, chartSlabId);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void template8Test() {
        Long chartId = null;
        // String response = api.template8(chartId);

        // TODO: test validations
    }

    /**
     * Update a Slab
     *
     * It updates the Slab from chart
     */
    @Test
    public void update12Test() {
        PutInterestRateChartsChartIdChartSlabsChartSlabIdRequest body = null;
        Long chartId = null;
        Long chartSlabId = null;
        // PutInterestRateChartsChartIdChartSlabsChartSlabIdResponse response = api.update12(body, chartId, chartSlabId);

        // TODO: test validations
    }
}
