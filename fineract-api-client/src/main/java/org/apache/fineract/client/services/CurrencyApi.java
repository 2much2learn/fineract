package org.apache.fineract.client.services;

import org.apache.fineract.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import org.apache.fineract.client.models.GetCurrenciesResponse;
import org.apache.fineract.client.models.PutCurrenciesRequest;
import org.apache.fineract.client.models.PutCurrenciesResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface CurrencyApi {
  /**
   * Retrieve Currency Configuration
   * Returns the list of currencies permitted for use AND the list of currencies not selected (but available for selection).  Example Requests:  currencies   currencies?fields&#x3D;selectedCurrencyOptions
   * @return Call&lt;GetCurrenciesResponse&gt;
   */
  @GET("currencies")
  Call<GetCurrenciesResponse> retrieveCurrencies();
    

  /**
   * Update Currency Configuration
   * Updates the list of currencies permitted for use.
   * @param body  (required)
   * @return Call&lt;PutCurrenciesResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("currencies")
  Call<PutCurrenciesResponse> updateCurrencies(
                    @retrofit2.http.Body PutCurrenciesRequest body    
  );

}
