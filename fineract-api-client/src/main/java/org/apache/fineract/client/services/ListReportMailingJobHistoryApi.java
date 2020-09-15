package org.apache.fineract.client.services;

import org.apache.fineract.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import org.apache.fineract.client.models.ReportMailingJobRunHistoryData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ListReportMailingJobHistoryApi {
  /**
   * List Report Mailing Job History
   * The list capability of report mailing job history can support pagination and sorting.  Example Requests:  reportmailingjobrunhistory/1
   * @param reportMailingJobId reportMailingJobId (optional)
   * @param offset offset (optional)
   * @param limit limit (optional)
   * @param orderBy orderBy (optional)
   * @param sortOrder sortOrder (optional)
   * @return Call&lt;ReportMailingJobRunHistoryData&gt;
   */
  @GET("reportmailingjobrunhistory")
  Call<ReportMailingJobRunHistoryData> retrieveAllByReportMailingJobId(
        @retrofit2.http.Query("reportMailingJobId") Long reportMailingJobId                ,     @retrofit2.http.Query("offset") Integer offset                ,     @retrofit2.http.Query("limit") Integer limit                ,     @retrofit2.http.Query("orderBy") String orderBy                ,     @retrofit2.http.Query("sortOrder") String sortOrder                
  );

}
