package org.apache.fineract.client.services;

import org.apache.fineract.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import org.apache.fineract.client.models.DeleteRecurringDepositAccountsResponse;
import org.apache.fineract.client.models.FormDataContentDisposition;
import org.apache.fineract.client.models.GetRecurringDepositAccountsAccountIdResponse;
import org.apache.fineract.client.models.GetRecurringDepositAccountsResponse;
import org.apache.fineract.client.models.GetRecurringDepositAccountsTemplateResponse;
import org.apache.fineract.client.models.PostRecurringDepositAccountsAccountIdRequest;
import org.apache.fineract.client.models.PostRecurringDepositAccountsAccountIdResponse;
import org.apache.fineract.client.models.PostRecurringDepositAccountsRequest;
import org.apache.fineract.client.models.PostRecurringDepositAccountsResponse;
import org.apache.fineract.client.models.PutRecurringDepositAccountsAccountIdRequest;
import org.apache.fineract.client.models.PutRecurringDepositAccountsAccountIdResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface RecurringDepositAccountApi {
  /**
   * 
   * 
   * @param accountId accountId (required)
   * @param command command (optional)
   * @return Call&lt;String&gt;
   */
  @GET("recurringdepositaccounts/{accountId}/template")
  Call<String> accountClosureTemplate1(
            @retrofit2.http.Path("accountId") Long accountId            ,     @retrofit2.http.Query("command") String command                
  );

  /**
   * Delete a recurring deposit application
   * At present we support hard delete of recurring deposit application so long as its in &#x27;Submitted and pending approval&#x27; state. One the application is moves past this state, it is not possible to do a &#x27;hard&#x27; delete of the application or the account. An API endpoint will be added to close/de-activate the recurring deposit account.
   * @param accountId accountId (required)
   * @return Call&lt;DeleteRecurringDepositAccountsResponse&gt;
   */
  @DELETE("recurringdepositaccounts/{accountId}")
  Call<DeleteRecurringDepositAccountsResponse> delete16(
            @retrofit2.http.Path("accountId") Long accountId            
  );

  /**
   * 
   * 
   * @param officeId  (optional)
   * @param staffId  (optional)
   * @param dateFormat  (optional)
   * @return Call&lt;Void&gt;
   */
  @GET("recurringdepositaccounts/downloadtemplate")
  Call<Void> getRecurringDepositTemplate(
        @retrofit2.http.Query("officeId") Long officeId                ,     @retrofit2.http.Query("staffId") Long staffId                ,     @retrofit2.http.Query("dateFormat") String dateFormat                
  );

  /**
   * 
   * 
   * @param officeId  (optional)
   * @param dateFormat  (optional)
   * @return Call&lt;Void&gt;
   */
  @GET("recurringdepositaccounts/transactions/downloadtemplate")
  Call<Void> getRecurringDepositTransactionTemplate(
        @retrofit2.http.Query("officeId") Long officeId                ,     @retrofit2.http.Query("dateFormat") String dateFormat                
  );

  /**
   * Approve recurring deposit application | Undo approval recurring deposit application | Reject recurring deposit application | Withdraw recurring deposit application | Activate a recurring deposit account | Update the recommended deposit amount for a recurring deposit account | Close a recurring deposit account | Premature Close a recurring deposit account | Calculate Premature amount on Recurring deposit account | Calculate Interest on recurring Deposit Account | Post Interest on recurring Deposit Account
   * Approve recurring deposit application:  Approves recurring deposit application so long as its in &#x27;Submitted and pending approval&#x27; state.  Undo approval recurring deposit application:  Will move &#x27;approved&#x27; recurring deposit application back to &#x27;Submitted and pending approval&#x27; state.  Reject recurring deposit application  Rejects recurring deposit application so long as its in &#x27;Submitted and pending approval&#x27; state.  Withdraw recurring deposit application:  Used when an applicant withdraws from the recurring deposit application. It must be in &#x27;Submitted and pending approval&#x27; state.  Activate a recurring deposit account:  Results in an approved recurring deposit application being converted into an &#x27;active&#x27; recurring deposit account.  Update the recommended deposit amount for a recurring deposit account:  Updates the recommended deposit amount for a RD account as on the effective date.  Close a recurring deposit account  Results in a Matured recurring deposit account being converted into a &#x27;closed&#x27; recurring deposit account.  On account close allowed actions are.Premature Close a recurring deposit account:  Results in an Active recurring deposit account being converted into a &#x27;Premature Closed&#x27; recurring deposit account with options to withdraw prematured amount. (premature amount is calculated using interest rate chart applicable along with penal interest if any.)  On account premature closure allowed actions are.  Calculate Premature amount on Recurring deposit account:  Calculate premature amount on recurring deposit till premature close date. Premature amount is calculated based on interest chart and penal interest applicable if any.  Calculate Interest on recurring Deposit Account:  Calculates interest earned on a recurring deposit account based on todays date. It does not attempt to post or credit the interest on the account. That is responsibility of the Post Interest API that will likely be called by overnight process.  Post Interest on recurring Deposit Account:  Calculates and Posts interest earned on a recurring deposit account based on todays date and whether an interest posting or crediting event is due.  Showing request/response for &#x27;Post Interest on recurring Deposit Account&#x27;
   * @param body  (required)
   * @param accountId accountId (required)
   * @param command command (optional)
   * @return Call&lt;PostRecurringDepositAccountsAccountIdResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("recurringdepositaccounts/{accountId}")
  Call<PostRecurringDepositAccountsAccountIdResponse> handleCommands5(
                    @retrofit2.http.Body PostRecurringDepositAccountsAccountIdRequest body    ,         @retrofit2.http.Path("accountId") Long accountId            ,     @retrofit2.http.Query("command") String command                
  );

  /**
   * 
   * 
   * @param file  (optional)
   * @param locale  (optional)
   * @param dateFormat  (optional)
   * @return Call&lt;String&gt;
   */
  @retrofit2.http.Multipart
  @POST("recurringdepositaccounts/uploadtemplate")
  Call<String> postRecurringDepositTemplate(
                        @retrofit2.http.Part("file") FormDataContentDisposition file,                     @retrofit2.http.Part("locale") String locale,                     @retrofit2.http.Part("dateFormat") String dateFormat
  );

  /**
   * 
   * 
   * @param file  (optional)
   * @param locale  (optional)
   * @param dateFormat  (optional)
   * @return Call&lt;String&gt;
   */
  @retrofit2.http.Multipart
  @POST("recurringdepositaccounts/transactions/uploadtemplate")
  Call<String> postRecurringDepositTransactionsTemplate(
                        @retrofit2.http.Part("file") FormDataContentDisposition file,                     @retrofit2.http.Part("locale") String locale,                     @retrofit2.http.Part("dateFormat") String dateFormat
  );

  /**
   * List Recurring deposit applications/accounts
   * Lists Recurring deposit applications/accounts  Example Requests:  recurringdepositaccounts   recurringdepositaccounts?fields&#x3D;name
   * @param paged paged (optional)
   * @param offset offset (optional)
   * @param limit limit (optional)
   * @param orderBy orderBy (optional)
   * @param sortOrder sortOrder (optional)
   * @return Call&lt;List&lt;GetRecurringDepositAccountsResponse&gt;&gt;
   */
  @GET("recurringdepositaccounts")
  Call<List<GetRecurringDepositAccountsResponse>> retrieveAll30(
        @retrofit2.http.Query("paged") Boolean paged                ,     @retrofit2.http.Query("offset") Integer offset                ,     @retrofit2.http.Query("limit") Integer limit                ,     @retrofit2.http.Query("orderBy") String orderBy                ,     @retrofit2.http.Query("sortOrder") String sortOrder                
  );

  /**
   * Retrieve a recurring deposit application/account
   * Retrieves a recurring deposit application/account  Example Requests :  recurringdepositaccounts/1   recurringdepositaccounts/1?associations&#x3D;all
   * @param accountId accountId (required)
   * @param staffInSelectedOfficeOnly staffInSelectedOfficeOnly (optional, default to false)
   * @param chargeStatus chargeStatus (optional, default to all)
   * @return Call&lt;GetRecurringDepositAccountsAccountIdResponse&gt;
   */
  @GET("recurringdepositaccounts/{accountId}")
  Call<GetRecurringDepositAccountsAccountIdResponse> retrieveOne20(
            @retrofit2.http.Path("accountId") Long accountId            ,     @retrofit2.http.Query("staffInSelectedOfficeOnly") Boolean staffInSelectedOfficeOnly                ,     @retrofit2.http.Query("chargeStatus") String chargeStatus                
  );

  /**
   * Submit new recurring deposit application
   * Submits new recurring deposit application  Mandatory Fields: clientId or groupId, productId, submittedOnDate, depositAmount, depositPeriod, depositPeriodFrequencyId  Optional Fields: accountNo, externalId, fieldOfficerId,linkAccountId(if provided initial deposit amount will be collected from this account),transferInterestToSavings(By enabling this flag all interest postings will be transferred to linked saving account )  Inherited from Product (if not provided): interestCompoundingPeriodType, interestCalculationType, interestCalculationDaysInYearType, lockinPeriodFrequency, lockinPeriodFrequencyType, preClosurePenalApplicable, preClosurePenalInterest, preClosurePenalInterestOnTypeId, charts, withHoldTax
   * @param body  (required)
   * @return Call&lt;PostRecurringDepositAccountsResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("recurringdepositaccounts")
  Call<PostRecurringDepositAccountsResponse> submitApplication1(
                    @retrofit2.http.Body PostRecurringDepositAccountsRequest body    
  );

  /**
   * Retrieve recurring Deposit Account Template
   * This is a convenience resource. It can be useful when building maintenance user interface screens for recurring deposit applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists  Example Requests:  recurringdepositaccounts/template?clientId&#x3D;1   recurringdepositaccounts/template?clientId&#x3D;1&amp;productId&#x3D;1
   * @param clientId clientId (optional)
   * @param groupId groupId (optional)
   * @param productId productId (optional)
   * @param staffInSelectedOfficeOnly staffInSelectedOfficeOnly (optional, default to false)
   * @return Call&lt;GetRecurringDepositAccountsTemplateResponse&gt;
   */
  @GET("recurringdepositaccounts/template")
  Call<GetRecurringDepositAccountsTemplateResponse> template13(
        @retrofit2.http.Query("clientId") Long clientId                ,     @retrofit2.http.Query("groupId") Long groupId                ,     @retrofit2.http.Query("productId") Long productId                ,     @retrofit2.http.Query("staffInSelectedOfficeOnly") Boolean staffInSelectedOfficeOnly                
  );

  /**
   * Modify a recurring deposit application
   * Recurring deposit application can only be modified when in &#x27;Submitted and pending approval&#x27; state. Once the application is approved, the details cannot be changed using this method. Specific api endpoints will be created to allow change of interest detail such as rate, compounding period, posting period etc
   * @param body  (required)
   * @param accountId accountId (required)
   * @return Call&lt;PutRecurringDepositAccountsAccountIdResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("recurringdepositaccounts/{accountId}")
  Call<PutRecurringDepositAccountsAccountIdResponse> update16(
                    @retrofit2.http.Body PutRecurringDepositAccountsAccountIdRequest body    ,         @retrofit2.http.Path("accountId") Long accountId            
  );

}
