package org.apache.fineract.client.services;

import org.apache.fineract.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import org.apache.fineract.client.models.DeleteSavingsAccountsAccountIdResponse;
import org.apache.fineract.client.models.FormDataContentDisposition;
import org.apache.fineract.client.models.GetSavingsAccountsAccountIdResponse;
import org.apache.fineract.client.models.GetSavingsAccountsResponse;
import org.apache.fineract.client.models.GetSavingsAccountsTemplateResponse;
import org.apache.fineract.client.models.PostSavingsAccountsAccountIdRequest;
import org.apache.fineract.client.models.PostSavingsAccountsAccountIdResponse;
import org.apache.fineract.client.models.PostSavingsAccountsRequest;
import org.apache.fineract.client.models.PostSavingsAccountsResponse;
import org.apache.fineract.client.models.PutSavingsAccountsAccountIdRequest;
import org.apache.fineract.client.models.PutSavingsAccountsAccountIdResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface SavingsAccountApi {
  /**
   * Delete a savings application
   * At present we support hard delete of savings application so long as its in &#x27;Submitted and pending approval&#x27; state. One the application is moves past this state, it is not possible to do a &#x27;hard&#x27; delete of the application or the account. An API endpoint will be added to close/de-activate the savings account.
   * @param accountId accountId (required)
   * @return Call&lt;DeleteSavingsAccountsAccountIdResponse&gt;
   */
  @DELETE("savingsaccounts/{accountId}")
  Call<DeleteSavingsAccountsAccountIdResponse> delete18(
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
  @GET("savingsaccounts/downloadtemplate")
  Call<Void> getSavingsTemplate(
        @retrofit2.http.Query("officeId") Long officeId                ,     @retrofit2.http.Query("staffId") Long staffId                ,     @retrofit2.http.Query("dateFormat") String dateFormat                
  );

  /**
   * 
   * 
   * @param officeId  (optional)
   * @param dateFormat  (optional)
   * @return Call&lt;Void&gt;
   */
  @GET("savingsaccounts/transactions/downloadtemplate")
  Call<Void> getSavingsTransactionTemplate(
        @retrofit2.http.Query("officeId") Long officeId                ,     @retrofit2.http.Query("dateFormat") String dateFormat                
  );

  /**
   * Approve savings application | Undo approval savings application | Assign Savings Officer | Unassign Savings Officer | Reject savings application | Withdraw savings application | Activate a savings account | Close a savings account | Calculate Interest on Savings Account | Post Interest on Savings Account | Block Savings Account | Unblock Savings Account | Block Savings Account Credit transactions | Unblock Savings Account Credit transactions | Block Savings Account Debit transactions | Unblock Savings Account debit transactions
   * Approve savings application:  Approves savings application so long as its in &#x27;Submitted and pending approval&#x27; state.  Undo approval savings application:  Will move &#x27;approved&#x27; savings application back to &#x27;Submitted and pending approval&#x27; state.  Assign Savings Officer:  Allows you to assign Savings Officer for existing Savings Account.  Unassign Savings Officer:  Allows you to unassign the Savings Officer.  Reject savings application:  Rejects savings application so long as its in &#x27;Submitted and pending approval&#x27; state.  Withdraw savings application:  Used when an applicant withdraws from the savings application. It must be in &#x27;Submitted and pending approval&#x27; state.  Activate a savings account:  Results in an approved savings application being converted into an &#x27;active&#x27; savings account.  Close a savings account:  Results in an Activated savings application being converted into an &#x27;closed&#x27; savings account.  closedOnDate is closure date of savings account  withdrawBalance is a boolean description, true value of this field performs a withdrawal transaction with account&#x27;s running balance.  Mandatory Fields: dateFormat,locale,closedOnDate  Optional Fields: note, withdrawBalance, paymentTypeId, accountNumber, checkNumber, routingCode, receiptNumber, bankNumber  Calculate Interest on Savings Account:  Calculates interest earned on a savings account based on todays date. It does not attempt to post or credit the interest on the account. That is responsibility of the Post Interest API that will likely be called by overnight process.  Post Interest on Savings Account:  Calculates and Posts interest earned on a savings account based on today&#x27;s date and whether an interest posting or crediting event is due.  Block Savings Account:  Blocks Savings account from all types of credit and debit transactions  Unblock Savings Account:  Unblock a blocked account. On unblocking account, user can perform debit and credit transactions  Block Savings Account Credit transactions:  Savings account will be blocked from all types of credit transactions.  Unblock Savings Account Credit transactions:  It unblocks the Saving account&#x27;s credit operations. Now all types of credits can be transacted to Savings account  Block Savings Account Debit transactions:  All types of debit operations from Savings account wil be blocked  Unblock Savings Account debit transactions:  It unblocks the Saving account&#x27;s debit operations. Now all types of debits can be transacted from Savings account  Showing request/response for &#x27;Unassign Savings Officer&#x27;
   * @param body  (required)
   * @param accountId accountId (required)
   * @param command command (optional)
   * @return Call&lt;PostSavingsAccountsAccountIdResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("savingsaccounts/{accountId}")
  Call<PostSavingsAccountsAccountIdResponse> handleCommands6(
                    @retrofit2.http.Body PostSavingsAccountsAccountIdRequest body    ,         @retrofit2.http.Path("accountId") Long accountId            ,     @retrofit2.http.Query("command") String command                
  );

  /**
   * 
   * 
   * @param parentAccountId  (required)
   * @param body  (optional)
   * @param command  (optional)
   * @return Call&lt;String&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("savingsaccounts/gsimcommands/{parentAccountId}")
  Call<String> handleGSIMCommands(
            @retrofit2.http.Path("parentAccountId") Long parentAccountId            ,                 @retrofit2.http.Body String body    ,     @retrofit2.http.Query("command") String command                
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
  @POST("savingsaccounts/uploadtemplate")
  Call<String> postSavingsTemplate(
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
  @POST("savingsaccounts/transactions/uploadtemplate")
  Call<String> postSavingsTransactionTemplate(
                        @retrofit2.http.Part("file") FormDataContentDisposition file,                     @retrofit2.http.Part("locale") String locale,                     @retrofit2.http.Part("dateFormat") String dateFormat
  );

  /**
   * List savings applications/accounts
   * Lists savings applications/accounts  Example Requests:  savingsaccounts   savingsaccounts?fields&#x3D;name
   * @param sqlSearch sqlSearch (optional)
   * @param externalId externalId (optional)
   * @param offset offset (optional)
   * @param limit limit (optional)
   * @param orderBy orderBy (optional)
   * @param sortOrder sortOrder (optional)
   * @return Call&lt;GetSavingsAccountsResponse&gt;
   */
  @GET("savingsaccounts")
  Call<GetSavingsAccountsResponse> retrieveAll32(
        @retrofit2.http.Query("sqlSearch") String sqlSearch                ,     @retrofit2.http.Query("externalId") String externalId                ,     @retrofit2.http.Query("offset") Integer offset                ,     @retrofit2.http.Query("limit") Integer limit                ,     @retrofit2.http.Query("orderBy") String orderBy                ,     @retrofit2.http.Query("sortOrder") String sortOrder                
  );

  /**
   * Retrieve a savings application/account
   * Retrieves a savings application/account  Example Requests :  savingsaccounts/1   savingsaccounts/1?associations&#x3D;all
   * @param accountId accountId (required)
   * @param staffInSelectedOfficeOnly staffInSelectedOfficeOnly (optional, default to false)
   * @param chargeStatus chargeStatus (optional, default to all)
   * @return Call&lt;GetSavingsAccountsAccountIdResponse&gt;
   */
  @GET("savingsaccounts/{accountId}")
  Call<GetSavingsAccountsAccountIdResponse> retrieveOne23(
            @retrofit2.http.Path("accountId") Long accountId            ,     @retrofit2.http.Query("staffInSelectedOfficeOnly") Boolean staffInSelectedOfficeOnly                ,     @retrofit2.http.Query("chargeStatus") String chargeStatus                
  );

  /**
   * Submit new savings application
   * Submits new savings application  Mandatory Fields: clientId or groupId, productId, submittedOnDate  Optional Fields: accountNo, externalId, fieldOfficerId  Inherited from Product (if not provided): nominalAnnualInterestRate, interestCompoundingPeriodType, interestCalculationType, interestCalculationDaysInYearType, minRequiredOpeningBalance, lockinPeriodFrequency, lockinPeriodFrequencyType, withdrawalFeeForTransfers, allowOverdraft, overdraftLimit, withHoldTax  Additional Mandatory Field if Entity-Datatable Check is enabled for the entity of type Savings: datatables
   * @param body  (required)
   * @return Call&lt;PostSavingsAccountsResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("savingsaccounts")
  Call<PostSavingsAccountsResponse> submitApplication2(
                    @retrofit2.http.Body PostSavingsAccountsRequest body    
  );

  /**
   * 
   * 
   * @param body  (optional)
   * @return Call&lt;String&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("savingsaccounts/gsim")
  Call<String> submitGSIMApplication(
                    @retrofit2.http.Body String body    
  );

  /**
   * Retrieve Savings Account Template
   * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists  Example Requests:  savingsaccounts/template?clientId&#x3D;1   savingsaccounts/template?clientId&#x3D;1&amp;productId&#x3D;1
   * @param clientId clientId (optional)
   * @param groupId groupId (optional)
   * @param productId productId (optional)
   * @param staffInSelectedOfficeOnly staffInSelectedOfficeOnly (optional, default to false)
   * @return Call&lt;GetSavingsAccountsTemplateResponse&gt;
   */
  @GET("savingsaccounts/template")
  Call<GetSavingsAccountsTemplateResponse> template14(
        @retrofit2.http.Query("clientId") Long clientId                ,     @retrofit2.http.Query("groupId") Long groupId                ,     @retrofit2.http.Query("productId") Long productId                ,     @retrofit2.http.Query("staffInSelectedOfficeOnly") Boolean staffInSelectedOfficeOnly                
  );

  /**
   * Modify a savings application | Modify savings account withhold tax applicability
   * Modify a savings application:  Savings application can only be modified when in &#x27;Submitted and pending approval&#x27; state. Once the application is approved, the details cannot be changed using this method. Specific api endpoints will be created to allow change of interest detail such as rate, compounding period, posting period etc  Modify savings account withhold tax applicability:  Savings application&#x27;s withhold tax can be modified when in &#x27;Active&#x27; state. Once the application is activated, can modify the account withhold tax to post tax or vice-versaShowing request/response for &#x27;Modify a savings application&#x27;
   * @param body  (required)
   * @param accountId accountId (required)
   * @param command command (optional)
   * @return Call&lt;PutSavingsAccountsAccountIdResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("savingsaccounts/{accountId}")
  Call<PutSavingsAccountsAccountIdResponse> update18(
                    @retrofit2.http.Body PutSavingsAccountsAccountIdRequest body    ,         @retrofit2.http.Path("accountId") Long accountId            ,     @retrofit2.http.Query("command") String command                
  );

  /**
   * 
   * 
   * @param parentAccountId  (required)
   * @param body  (optional)
   * @return Call&lt;String&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("savingsaccounts/gsim/{parentAccountId}")
  Call<String> updateGsim(
            @retrofit2.http.Path("parentAccountId") Long parentAccountId            ,                 @retrofit2.http.Body String body    
  );

}
