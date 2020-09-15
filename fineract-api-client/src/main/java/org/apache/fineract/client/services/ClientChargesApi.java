package org.apache.fineract.client.services;

import org.apache.fineract.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import org.apache.fineract.client.models.DeleteClientsClientIdChargesChargeIdResponse;
import org.apache.fineract.client.models.GetClientsChargesPageItems;
import org.apache.fineract.client.models.GetClientsClientIdChargesResponse;
import org.apache.fineract.client.models.PostClientsClientIdChargesChargeIdRequest;
import org.apache.fineract.client.models.PostClientsClientIdChargesChargeIdResponse;
import org.apache.fineract.client.models.PostClientsClientIdChargesRequest;
import org.apache.fineract.client.models.PostClientsClientIdChargesResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ClientChargesApi {
  /**
   * Add Client Charge
   *  This API associates a Client charge with an implicit Client account Mandatory Fields :  chargeId and dueDate   Optional Fields :  amount
   * @param body  (required)
   * @param clientId clientId (required)
   * @return Call&lt;PostClientsClientIdChargesResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("clients/{clientId}/charges")
  Call<PostClientsClientIdChargesResponse> applyClientCharge(
                    @retrofit2.http.Body PostClientsClientIdChargesRequest body    ,         @retrofit2.http.Path("clientId") Long clientId            
  );

  /**
   * Delete a Client Charge
   * Deletes a Client Charge on which no transactions have taken place (either payments or waivers). 
   * @param clientId clientId (required)
   * @param chargeId chargeId (required)
   * @return Call&lt;DeleteClientsClientIdChargesChargeIdResponse&gt;
   */
  @DELETE("clients/{clientId}/charges/{chargeId}")
  Call<DeleteClientsClientIdChargesChargeIdResponse> deleteClientCharge(
            @retrofit2.http.Path("clientId") Long clientId            ,         @retrofit2.http.Path("chargeId") Long chargeId            
  );

  /**
   * Pay a Client Charge | Waive a Client Charge
   * Pay a Client Charge:  Mandatory Fields:transactionDate and amount \&quot;Pay either a part of or the entire due amount for a charge.(command&#x3D;paycharge)  Waive a Client Charge:   This API provides the facility of waiving off the remaining amount on a client charge (command&#x3D;waive)  Showing request/response for &#x27;Pay a Client Charge&#x27;
   * @param body  (required)
   * @param clientId clientId (required)
   * @param chargeId chargeId (required)
   * @param command command (optional)
   * @return Call&lt;PostClientsClientIdChargesChargeIdResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("clients/{clientId}/charges/{chargeId}")
  Call<PostClientsClientIdChargesChargeIdResponse> payOrWaiveClientCharge(
                    @retrofit2.http.Body PostClientsClientIdChargesChargeIdRequest body    ,         @retrofit2.http.Path("clientId") Long clientId            ,         @retrofit2.http.Path("chargeId") Long chargeId            ,     @retrofit2.http.Query("command") String command                
  );

  /**
   * List Client Charges
   * The list capability of client charges supports pagination.Example Requests: clients/1/charges  clients/1/charges?offset&#x3D;0&amp;limit&#x3D;5
   * @param clientId clientId (required)
   * @param chargeStatus chargeStatus (optional, default to all)
   * @param pendingPayment pendingPayment (optional)
   * @param limit limit (optional)
   * @param offset offset (optional)
   * @return Call&lt;GetClientsClientIdChargesResponse&gt;
   */
  @GET("clients/{clientId}/charges")
  Call<GetClientsClientIdChargesResponse> retrieveAllClientCharges(
            @retrofit2.http.Path("clientId") Long clientId            ,     @retrofit2.http.Query("chargeStatus") String chargeStatus                ,     @retrofit2.http.Query("pendingPayment") Boolean pendingPayment                ,     @retrofit2.http.Query("limit") Integer limit                ,     @retrofit2.http.Query("offset") Integer offset                
  );

  /**
   * Retrieve a Client Charge
   * Example Requests: clients/1/charges/1   clients/1/charges/1?fields&#x3D;name,id
   * @param clientId clientId (required)
   * @param chargeId chargeId (required)
   * @return Call&lt;GetClientsChargesPageItems&gt;
   */
  @GET("clients/{clientId}/charges/{chargeId}")
  Call<GetClientsChargesPageItems> retrieveClientCharge(
            @retrofit2.http.Path("clientId") Long clientId            ,         @retrofit2.http.Path("chargeId") Long chargeId            
  );

  /**
   * 
   * 
   * @param clientId clientId (required)
   * @return Call&lt;String&gt;
   */
  @GET("clients/{clientId}/charges/template")
  Call<String> retrieveTemplate4(
            @retrofit2.http.Path("clientId") Long clientId            
  );

}
