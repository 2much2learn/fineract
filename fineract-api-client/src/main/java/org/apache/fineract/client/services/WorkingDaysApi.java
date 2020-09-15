package org.apache.fineract.client.services;

import org.apache.fineract.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import org.apache.fineract.client.models.GetWorkingDaysResponse;
import org.apache.fineract.client.models.GetWorkingDaysTemplateResponse;
import org.apache.fineract.client.models.PutWorkingDaysRequest;
import org.apache.fineract.client.models.PutWorkingDaysResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface WorkingDaysApi {
  /**
   * List Working days
   * Example Requests:  workingdays
   * @return Call&lt;List&lt;GetWorkingDaysResponse&gt;&gt;
   */
  @GET("workingdays")
  Call<List<GetWorkingDaysResponse>> retrieveAll16();
    

  /**
   * Working Days Template
   * This is a convenience resource. It can be useful when building maintenance user interface screens for working days.  Example Request:  workingdays/template
   * @return Call&lt;GetWorkingDaysTemplateResponse&gt;
   */
  @GET("workingdays/template")
  Call<GetWorkingDaysTemplateResponse> template4();
    

  /**
   * Update a Working Day
   * Mandatory Fields recurrence,repaymentRescheduleType,extendTermForDailyRepayments,locale
   * @param body  (required)
   * @return Call&lt;PutWorkingDaysResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("workingdays")
  Call<PutWorkingDaysResponse> update7(
                    @retrofit2.http.Body PutWorkingDaysRequest body    
  );

}
