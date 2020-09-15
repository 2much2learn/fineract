package org.apache.fineract.client.services;

import org.apache.fineract.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import org.apache.fineract.client.models.GetRunReportResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface SelfRunReportApi {
  /**
   * Running A Report
   * Example Requests:   self/runreports/Client%20Details?R_officeId&#x3D;1   self/runreports/Client%20Details?R_officeId&#x3D;1&amp;exportCSV&#x3D;true
   * @param reportName reportName (required)
   * @return Call&lt;GetRunReportResponse&gt;
   */
  @GET("self/runreports/{reportName}")
  Call<GetRunReportResponse> runReport1(
            @retrofit2.http.Path("reportName") String reportName            
  );

}
