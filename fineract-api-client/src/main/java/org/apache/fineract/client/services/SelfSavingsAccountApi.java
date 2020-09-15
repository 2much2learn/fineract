package org.apache.fineract.client.services;

import org.apache.fineract.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import org.apache.fineract.client.models.GetSelfSavingsAccountsAccountIdChargesResponse;
import org.apache.fineract.client.models.GetSelfSavingsAccountsAccountIdChargesSavingsAccountChargeIdResponse;
import org.apache.fineract.client.models.GetSelfSavingsAccountsAccountIdTransactionsTransactionIdResponse;
import org.apache.fineract.client.models.GetSelfSavingsAccountsResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface SelfSavingsAccountApi {
  /**
   * 
   * 
   * @param accountId  (required)
   * @param body  (optional)
   * @param command  (optional)
   * @return Call&lt;String&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("self/savingsaccounts/{accountId}")
  Call<String> modifySavingsAccountApplication(
            @retrofit2.http.Path("accountId") Long accountId            ,                 @retrofit2.http.Body String body    ,     @retrofit2.http.Query("command") String command                
  );

  /**
   * List Savings Charges
   * Lists Savings Charges  Example Requests:  self/savingsaccounts/1/charges  self/savingsaccounts/1/charges?chargeStatus&#x3D;inactive  self/savingsaccounts/1/charges?fields&#x3D;name,amountOrPercentage
   * @param accountId accountId (required)
   * @param chargeStatus chargeStatus (optional, default to all)
   * @return Call&lt;List&lt;GetSelfSavingsAccountsAccountIdChargesResponse&gt;&gt;
   */
  @GET("self/savingsaccounts/{accountId}/charges")
  Call<List<GetSelfSavingsAccountsAccountIdChargesResponse>> retrieveAllSavingsAccountCharges1(
            @retrofit2.http.Path("accountId") Long accountId            ,     @retrofit2.http.Query("chargeStatus") String chargeStatus                
  );

  /**
   * Retrieve a savings account
   * Retrieves a savings account  Example Requests :  self/savingsaccounts/1   self/savingsaccounts/1?associations&#x3D;transactions
   * @param accountId accountId (required)
   * @param chargeStatus chargeStatus (optional, default to all)
   * @return Call&lt;GetSelfSavingsAccountsResponse&gt;
   */
  @GET("self/savingsaccounts/{accountId}")
  Call<GetSelfSavingsAccountsResponse> retrieveSavings(
            @retrofit2.http.Path("accountId") Long accountId            ,     @retrofit2.http.Query("chargeStatus") String chargeStatus                
  );

  /**
   * Retrieve a Savings account Charge
   * Retrieves a Savings account Charge  Example Requests:  self/savingsaccounts/1/charges/5   self/savingsaccounts/1/charges/5?fields&#x3D;name,amountOrPercentage
   * @param accountId accountId (required)
   * @param savingsAccountChargeId savingsAccountChargeId (required)
   * @return Call&lt;GetSelfSavingsAccountsAccountIdChargesSavingsAccountChargeIdResponse&gt;
   */
  @GET("self/savingsaccounts/{accountId}/charges/{savingsAccountChargeId}")
  Call<GetSelfSavingsAccountsAccountIdChargesSavingsAccountChargeIdResponse> retrieveSavingsAccountCharge1(
            @retrofit2.http.Path("accountId") Long accountId            ,         @retrofit2.http.Path("savingsAccountChargeId") Long savingsAccountChargeId            
  );

  /**
   * Retrieve Savings Account Transaction
   * Retrieves Savings Account Transaction  Example Requests:  self/savingsaccounts/1/transactions/1
   * @param accountId accountId (required)
   * @param transactionId transactionId (required)
   * @return Call&lt;GetSelfSavingsAccountsAccountIdTransactionsTransactionIdResponse&gt;
   */
  @GET("self/savingsaccounts/{accountId}/transactions/{transactionId}")
  Call<GetSelfSavingsAccountsAccountIdTransactionsTransactionIdResponse> retrieveSavingsTransaction(
            @retrofit2.http.Path("accountId") Long accountId            ,         @retrofit2.http.Path("transactionId") Long transactionId            
  );

  /**
   * 
   * 
   * @param body  (optional)
   * @param command  (optional)
   * @return Call&lt;String&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("self/savingsaccounts")
  Call<String> submitSavingsAccountApplication(
                    @retrofit2.http.Body String body    ,     @retrofit2.http.Query("command") String command                
  );

  /**
   * 
   * 
   * @param clientId  (optional)
   * @param productId  (optional)
   * @return Call&lt;String&gt;
   */
  @GET("self/savingsaccounts/template")
  Call<String> template18(
        @retrofit2.http.Query("clientId") Long clientId                ,     @retrofit2.http.Query("productId") Long productId                
  );

}
