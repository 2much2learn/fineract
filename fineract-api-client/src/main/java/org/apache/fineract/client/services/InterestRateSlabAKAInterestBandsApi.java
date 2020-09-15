package org.apache.fineract.client.services;

import org.apache.fineract.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import org.apache.fineract.client.models.DeleteInterestRateChartsChartIdChartSlabsResponse;
import org.apache.fineract.client.models.GetInterestRateChartsChartIdChartSlabsResponse;
import org.apache.fineract.client.models.PostInterestRateChartsChartIdChartSlabsRequest;
import org.apache.fineract.client.models.PostInterestRateChartsChartIdChartSlabsResponse;
import org.apache.fineract.client.models.PutInterestRateChartsChartIdChartSlabsChartSlabIdRequest;
import org.apache.fineract.client.models.PutInterestRateChartsChartIdChartSlabsChartSlabIdResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface InterestRateSlabAKAInterestBandsApi {
  /**
   * Create a Slab
   * Creates a new interest rate slab for an interest rate chart. Mandatory Fields periodType, fromPeriod, annualInterestRate Optional Fields toPeriod and description Example Requests:  interestratecharts/1/chartslabs
   * @param body  (required)
   * @param chartId chartId (required)
   * @return Call&lt;PostInterestRateChartsChartIdChartSlabsResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("interestratecharts/{chartId}/chartslabs")
  Call<PostInterestRateChartsChartIdChartSlabsResponse> create8(
                    @retrofit2.http.Body PostInterestRateChartsChartIdChartSlabsRequest body    ,         @retrofit2.http.Path("chartId") Long chartId            
  );

  /**
   * Delete a Slab
   * Delete a Slab from a chart
   * @param chartId chartId (required)
   * @param chartSlabId chartSlabId (required)
   * @return Call&lt;DeleteInterestRateChartsChartIdChartSlabsResponse&gt;
   */
  @DELETE("interestratecharts/{chartId}/chartslabs/{chartSlabId}")
  Call<DeleteInterestRateChartsChartIdChartSlabsResponse> delete12(
            @retrofit2.http.Path("chartId") Long chartId            ,         @retrofit2.http.Path("chartSlabId") Long chartSlabId            
  );

  /**
   * Retrieve all Slabs
   * Retrieve list of slabs associated with a chart  Example Requests:  interestratecharts/1/chartslabs
   * @param chartId chartId (required)
   * @return Call&lt;List&lt;GetInterestRateChartsChartIdChartSlabsResponse&gt;&gt;
   */
  @GET("interestratecharts/{chartId}/chartslabs")
  Call<List<GetInterestRateChartsChartIdChartSlabsResponse>> retrieveAll24(
            @retrofit2.http.Path("chartId") Long chartId            
  );

  /**
   * Retrieve a Slab
   * Retrieve a slab associated with an Interest rate chart  Example Requests:  interestratecharts/1/chartslabs/1 
   * @param chartId chartId (required)
   * @param chartSlabId chartSlabId (required)
   * @return Call&lt;GetInterestRateChartsChartIdChartSlabsResponse&gt;
   */
  @GET("interestratecharts/{chartId}/chartslabs/{chartSlabId}")
  Call<GetInterestRateChartsChartIdChartSlabsResponse> retrieveOne14(
            @retrofit2.http.Path("chartId") Long chartId            ,         @retrofit2.http.Path("chartSlabId") Long chartSlabId            
  );

  /**
   * 
   * 
   * @param chartId chartId (required)
   * @return Call&lt;String&gt;
   */
  @GET("interestratecharts/{chartId}/chartslabs/template")
  Call<String> template8(
            @retrofit2.http.Path("chartId") Long chartId            
  );

  /**
   * Update a Slab
   * It updates the Slab from chart
   * @param body  (required)
   * @param chartId chartId (required)
   * @param chartSlabId chartSlabId (required)
   * @return Call&lt;PutInterestRateChartsChartIdChartSlabsChartSlabIdResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("interestratecharts/{chartId}/chartslabs/{chartSlabId}")
  Call<PutInterestRateChartsChartIdChartSlabsChartSlabIdResponse> update12(
                    @retrofit2.http.Body PutInterestRateChartsChartIdChartSlabsChartSlabIdRequest body    ,         @retrofit2.http.Path("chartId") Long chartId            ,         @retrofit2.http.Path("chartSlabId") Long chartSlabId            
  );

}
