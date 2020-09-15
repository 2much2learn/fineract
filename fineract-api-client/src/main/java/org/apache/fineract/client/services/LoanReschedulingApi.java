package org.apache.fineract.client.services;

import org.apache.fineract.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import org.apache.fineract.client.models.PostLoansLoanIdScheduleRequest;
import org.apache.fineract.client.models.PostLoansLoanIdScheduleResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface LoanReschedulingApi {
  /**
   * Calculate loan repayment schedule based on Loan term variations | Updates loan repayment schedule based on Loan term variations | Updates loan repayment schedule by removing Loan term variations
   * Calculate loan repayment schedule based on Loan term variations:  Mandatory Fields: exceptions,locale,dateFormat  Updates loan repayment schedule based on Loan term variations:  Mandatory Fields: exceptions,locale,dateFormat  Updates loan repayment schedule by removing Loan term variations:  It updates the loan repayment schedule by removing Loan term variations  Showing request/response for &#x27;Updates loan repayment schedule by removing Loan term variations&#x27;
   * @param body  (required)
   * @param loanId loanId (required)
   * @param command command (optional)
   * @return Call&lt;PostLoansLoanIdScheduleResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("loans/{loanId}/schedule")
  Call<PostLoansLoanIdScheduleResponse> calculateLoanScheduleOrSubmitVariableSchedule(
                    @retrofit2.http.Body PostLoansLoanIdScheduleRequest body    ,         @retrofit2.http.Path("loanId") Long loanId            ,     @retrofit2.http.Query("command") String command                
  );

}
