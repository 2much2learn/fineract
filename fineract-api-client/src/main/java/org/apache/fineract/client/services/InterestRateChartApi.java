package org.apache.fineract.client.services;

import org.apache.fineract.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import org.apache.fineract.client.models.DeleteInterestRateChartsChartIdResponse;
import org.apache.fineract.client.models.GetInterestRateChartsResponse;
import org.apache.fineract.client.models.GetInterestRateChartsTemplateResponse;
import org.apache.fineract.client.models.PostInterestRateChartsRequest;
import org.apache.fineract.client.models.PostInterestRateChartsResponse;
import org.apache.fineract.client.models.PutInterestRateChartsChartIdRequest;
import org.apache.fineract.client.models.PutInterestRateChartsChartIdResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface InterestRateChartApi {
  /**
   * Create a Chart
   * Creates a new chart which can be attached to a term deposit products (FD or RD).
   * @param body  (required)
   * @return Call&lt;PostInterestRateChartsResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("interestratecharts")
  Call<PostInterestRateChartsResponse> create9(
                    @retrofit2.http.Body PostInterestRateChartsRequest body    
  );

  /**
   * Delete a Chart
   * It deletes the chart
   * @param chartId chartId (required)
   * @return Call&lt;DeleteInterestRateChartsChartIdResponse&gt;
   */
  @DELETE("interestratecharts/{chartId}")
  Call<DeleteInterestRateChartsChartIdResponse> delete13(
            @retrofit2.http.Path("chartId") Long chartId            
  );

  /**
   * Retrieve all Charts
   * Retrieve list of charts associated with a term deposit product(FD or RD). Example Requests:  interestratecharts?productId&#x3D;1
   * @param productId productId (optional)
   * @return Call&lt;List&lt;GetInterestRateChartsResponse&gt;&gt;
   */
  @GET("interestratecharts")
  Call<List<GetInterestRateChartsResponse>> retrieveAll25(
        @retrofit2.http.Query("productId") Long productId                
  );

  /**
   * Retrieve a Chart
   * It retrieves the Interest Rate Chart Example Requests:  interestratecharts/1
   * @param chartId chartId (required)
   * @return Call&lt;GetInterestRateChartsResponse&gt;
   */
  @GET("interestratecharts/{chartId}")
  Call<GetInterestRateChartsResponse> retrieveOne15(
            @retrofit2.http.Path("chartId") Long chartId            
  );

  /**
   * Retrieve Chart Details Template
   * This is a convenience resource. It can be useful when building maintenance user interface screens for creating a chart. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists Example Request:  interestratecharts/template
   * @return Call&lt;GetInterestRateChartsTemplateResponse&gt;
   */
  @GET("interestratecharts/template")
  Call<GetInterestRateChartsTemplateResponse> template9();
    

  /**
   * Update a Chart
   * It updates the chart
   * @param body  (required)
   * @param chartId chartId (required)
   * @return Call&lt;PutInterestRateChartsChartIdResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("interestratecharts/{chartId}")
  Call<PutInterestRateChartsChartIdResponse> update13(
                    @retrofit2.http.Body PutInterestRateChartsChartIdRequest body    ,         @retrofit2.http.Path("chartId") Long chartId            
  );

}
