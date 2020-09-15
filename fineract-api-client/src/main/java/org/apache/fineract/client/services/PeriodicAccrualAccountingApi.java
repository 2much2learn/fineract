package org.apache.fineract.client.services;

import org.apache.fineract.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import org.apache.fineract.client.models.PostRunaccrualsRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface PeriodicAccrualAccountingApi {
  /**
   * Executes Periodic Accrual Accounting
   * Mandatory Fields  tillDate 
   * @param body  (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("runaccruals")
  Call<Void> executePeriodicAccrualAccounting(
                    @retrofit2.http.Body PostRunaccrualsRequest body    
  );

}
