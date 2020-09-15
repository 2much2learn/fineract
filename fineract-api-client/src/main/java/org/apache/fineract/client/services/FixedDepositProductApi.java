package org.apache.fineract.client.services;

import org.apache.fineract.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import org.apache.fineract.client.models.DeleteFixedDepositProductsProductIdResponse;
import org.apache.fineract.client.models.GetFixedDepositProductsProductIdResponse;
import org.apache.fineract.client.models.GetFixedDepositProductsResponse;
import org.apache.fineract.client.models.PostFixedDepositProductsRequest;
import org.apache.fineract.client.models.PostFixedDepositProductsResponse;
import org.apache.fineract.client.models.PutFixedDepositProductsProductIdRequest;
import org.apache.fineract.client.models.PutFixedDepositProductsProductIdResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface FixedDepositProductApi {
  /**
   * Create a Fixed Deposit Product
   * Creates a Fixed Deposit Product  Mandatory Fields: name, shortName, description, currencyCode, digitsAfterDecimal,inMultiplesOf, interestCompoundingPeriodType, interestCalculationType, interestCalculationDaysInYearType, minDepositTerm, minDepositTermTypeId, accountingRule  Optional Fields: lockinPeriodFrequency, lockinPeriodFrequencyType, maxDepositTerm, maxDepositTermTypeId, inMultiplesOfDepositTerm, inMultiplesOfDepositTermTypeId, preClosurePenalApplicable, preClosurePenalInterest, preClosurePenalInterestOnTypeId, feeToIncomeAccountMappings, penaltyToIncomeAccountMappings, charges, charts, , withHoldTax, taxGroupId   Mandatory Fields for Cash based accounting (accountingRule &#x3D; 2): savingsReferenceAccountId, savingsControlAccountId, interestOnSavingsAccountId, incomeFromFeeAccountId, transfersInSuspenseAccountId, incomeFromPenaltyAccountId
   * @param body  (required)
   * @return Call&lt;PostFixedDepositProductsResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("fixeddepositproducts")
  Call<PostFixedDepositProductsResponse> create10(
                    @retrofit2.http.Body PostFixedDepositProductsRequest body    
  );

  /**
   * Delete a Fixed Deposit Product
   * Deletes a Fixed Deposit Product
   * @param productId productId (required)
   * @return Call&lt;DeleteFixedDepositProductsProductIdResponse&gt;
   */
  @DELETE("fixeddepositproducts/{productId}")
  Call<DeleteFixedDepositProductsProductIdResponse> delete15(
            @retrofit2.http.Path("productId") Long productId            
  );

  /**
   * List Fixed Deposit Products
   * Lists Fixed Deposit Products  Example Requests:  fixeddepositproducts   fixeddepositproducts?fields&#x3D;name
   * @return Call&lt;List&lt;GetFixedDepositProductsResponse&gt;&gt;
   */
  @GET("fixeddepositproducts")
  Call<List<GetFixedDepositProductsResponse>> retrieveAll29();
    

  /**
   * Retrieve a Fixed Deposit Product
   * Retrieves a Fixed Deposit Product  Example Requests:  fixeddepositproducts/1   fixeddepositproducts/1?template&#x3D;true   fixeddepositproducts/1?fields&#x3D;name,description
   * @param productId productId (required)
   * @return Call&lt;GetFixedDepositProductsProductIdResponse&gt;
   */
  @GET("fixeddepositproducts/{productId}")
  Call<GetFixedDepositProductsProductIdResponse> retrieveOne18(
            @retrofit2.http.Path("productId") Long productId            
  );

  /**
   * 
   * 
   * @return Call&lt;String&gt;
   */
  @GET("fixeddepositproducts/template")
  Call<String> retrieveTemplate14();
    

  /**
   * Update a Fixed Deposit Product
   * Updates a Fixed Deposit Product
   * @param body  (required)
   * @param productId productId (required)
   * @return Call&lt;PutFixedDepositProductsProductIdResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("fixeddepositproducts/{productId}")
  Call<PutFixedDepositProductsProductIdResponse> update15(
                    @retrofit2.http.Body PutFixedDepositProductsProductIdRequest body    ,         @retrofit2.http.Path("productId") Long productId            
  );

}
