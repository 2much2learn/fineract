package org.apache.fineract.client.services;

import org.apache.fineract.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import org.apache.fineract.client.models.CommandProcessingResult;
import org.apache.fineract.client.models.CommandWrapper;
import org.apache.fineract.client.models.DateParam;
import org.apache.fineract.client.models.FormDataBodyPart;
import org.apache.fineract.client.models.FormDataContentDisposition;
import org.apache.fineract.client.models.GetFundsResponse;
import org.apache.fineract.client.models.GetProductsTypeProductIdResponse;
import org.apache.fineract.client.models.GetProductsTypeResponse;
import org.apache.fineract.client.models.GetSurveyResponse;
import org.apache.fineract.client.models.InteropAccountData;
import org.apache.fineract.client.models.InteropIdentifierAccountResponseData;
import org.apache.fineract.client.models.InteropIdentifierRequestData;
import org.apache.fineract.client.models.InteropIdentifiersResponseData;
import org.apache.fineract.client.models.InteropQuoteRequestData;
import org.apache.fineract.client.models.InteropQuoteResponseData;
import org.apache.fineract.client.models.InteropTransactionRequestData;
import org.apache.fineract.client.models.InteropTransactionRequestResponseData;
import org.apache.fineract.client.models.InteropTransactionsData;
import org.apache.fineract.client.models.InteropTransferRequestData;
import org.apache.fineract.client.models.InteropTransferResponseData;
import org.apache.fineract.client.models.PostCollectionSheetRequest;
import org.apache.fineract.client.models.PostCollectionSheetResponse;
import org.apache.fineract.client.models.PostFundsRequest;
import org.apache.fineract.client.models.PostFundsResponse;
import org.apache.fineract.client.models.PostProductsTypeRequest;
import org.apache.fineract.client.models.PostProductsTypeResponse;
import org.apache.fineract.client.models.PostSurveySurveyNameApptableIdRequest;
import org.apache.fineract.client.models.PostSurveySurveyNameApptableIdResponse;
import org.apache.fineract.client.models.PutFundsFundIdRequest;
import org.apache.fineract.client.models.PutFundsFundIdResponse;
import org.apache.fineract.client.models.PutProductsTypeProductIdRequest;
import org.apache.fineract.client.models.PutProductsTypeProductIdResponse;
import org.apache.fineract.client.models.SmsCampaignData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface DefaultApi {
  /**
   * 
   * 
   * @param loanId  (required)
   * @param clientId  (optional)
   * @return Call&lt;String&gt;
   */
  @GET("loans/{loanId}/guarantors/accounts/template")
  Call<String> accountsTemplate(
            @retrofit2.http.Path("loanId") Long loanId            ,     @retrofit2.http.Query("clientId") Long clientId                
  );

  /**
   * 
   * 
   * @param resourceId  (required)
   * @param body  (optional)
   * @param command  (optional)
   * @return Call&lt;String&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("email/campaign/{resourceId}")
  Call<String> activate(
            @retrofit2.http.Path("resourceId") Long resourceId            ,                 @retrofit2.http.Body String body    ,     @retrofit2.http.Query("command") String command                
  );

  /**
   * 
   * 
   * @param loanId  (required)
   * @param body  (optional)
   * @return Call&lt;String&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("loans/{loanId}/disbursements/editDisbursements")
  Call<String> addAndDeleteDisbursementDetail(
            @retrofit2.http.Path("loanId") Long loanId            ,                 @retrofit2.http.Body String body    
  );

  /**
   * 
   * 
   * @param clientId  (required)
   * @param body  (optional)
   * @return Call&lt;String&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("clients/{clientId}/familymembers")
  Call<String> addClientFamilyMembers(
            @retrofit2.http.Path("clientId") Long clientId            ,                 @retrofit2.http.Body String body    
  );

  /**
   * 
   * 
   * @param entity  (required)
   * @param entityId  (required)
   * @param file  (optional)
   * @param contentLength  (optional)
   * @return Call&lt;String&gt;
   */
  @retrofit2.http.Multipart
  @POST("{entity}/{entityId}/images")
  Call<String> addNewClientImage1(
            @retrofit2.http.Path("entity") String entity            ,         @retrofit2.http.Path("entityId") Long entityId            ,                     @retrofit2.http.Part("file") FormDataBodyPart file,             @retrofit2.http.Header("Content-Length") Long contentLength        
  );

  /**
   * 
   * 
   * @param organisationCreditBureauId  (required)
   * @param body  (optional)
   * @return Call&lt;String&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("CreditBureauConfiguration/organisationCreditBureau/{organisationCreditBureauId}")
  Call<String> addOrganisationCreditBureau(
            @retrofit2.http.Path("organisationCreditBureauId") Long organisationCreditBureauId            ,                 @retrofit2.http.Body String body    
  );

  /**
   * 
   * 
   * @param fixedDepositAccountId  (required)
   * @param transactionId  (required)
   * @param body  (optional)
   * @param command  (optional)
   * @return Call&lt;String&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("fixeddepositaccounts/{fixedDepositAccountId}/transactions/{transactionId}")
  Call<String> adjustTransaction(
            @retrofit2.http.Path("fixedDepositAccountId") Long fixedDepositAccountId            ,         @retrofit2.http.Path("transactionId") Long transactionId            ,                 @retrofit2.http.Body String body    ,     @retrofit2.http.Query("command") String command                
  );

  /**
   * 
   * 
   * @param savingsId  (required)
   * @param transactionId  (required)
   * @param body  (optional)
   * @param command  (optional)
   * @return Call&lt;String&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("savingsaccounts/{savingsId}/transactions/{transactionId}")
  Call<String> adjustTransaction1(
            @retrofit2.http.Path("savingsId") Long savingsId            ,         @retrofit2.http.Path("transactionId") Long transactionId            ,                 @retrofit2.http.Body String body    ,     @retrofit2.http.Query("command") String command                
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
  @POST("email")
  Call<String> create1(
                    @retrofit2.http.Body String body    
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
  @POST("sms")
  Call<String> create2(
                    @retrofit2.http.Body String body    
  );

  /**
   * 
   * 
   * @param entityType  (required)
   * @param entityId  (required)
   * @param body  (optional)
   * @return Call&lt;String&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("{entityType}/{entityId}/calendars")
  Call<String> createCalendar(
            @retrofit2.http.Path("entityType") String entityType            ,         @retrofit2.http.Path("entityId") Long entityId            ,                 @retrofit2.http.Body String body    
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
  @POST("email/campaign")
  Call<String> createCampaign(
                    @retrofit2.http.Body String body    
  );

  /**
   * Create a SMS Campaign
   * Mandatory Fields campaignName, campaignType, triggerType, providerId, runReportId, message  Mandatory Fields for Cash based on selected report id paramValue in json format
   * @param body  (required)
   * @return Call&lt;CommandProcessingResult&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("smscampaigns")
  Call<CommandProcessingResult> createCampaign1(
                    @retrofit2.http.Body CommandWrapper body    
  );

  /**
   * 
   * 
   * @param creditBureauId  (required)
   * @param body  (optional)
   * @return Call&lt;String&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("CreditBureauConfiguration/mappings/{CreditBureauId}")
  Call<String> createCreditBureauLoanProductMapping(
            @retrofit2.http.Path("CreditBureauId") Long creditBureauId            ,                 @retrofit2.http.Body String body    
  );

  /**
   * Create an entry in the survey table
   * Insert and entry in a survey table (full fill the survey).  Refer Link for sample Body:  [ https://demo.fineract.dev/fineract-provider/api-docs/apiLive.htm#survey_create ] 
   * @param body  (required)
   * @param surveyName surveyName (required)
   * @param apptableId apptableId (required)
   * @return Call&lt;PostSurveySurveyNameApptableIdResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("survey/{surveyName}/{apptableId}")
  Call<PostSurveySurveyNameApptableIdResponse> createDatatableEntry1(
                    @retrofit2.http.Body PostSurveySurveyNameApptableIdRequest body    ,         @retrofit2.http.Path("surveyName") String surveyName            ,         @retrofit2.http.Path("apptableId") Long apptableId            
  );

  /**
   * Create a Fund
   * Creates a Fund
   * @param body  (required)
   * @return Call&lt;PostFundsResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("funds")
  Call<PostFundsResponse> createFund(
                    @retrofit2.http.Body PostFundsRequest body    
  );

  /**
   * 
   * 
   * @param loanId  (required)
   * @param body  (optional)
   * @return Call&lt;String&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("loans/{loanId}/guarantors")
  Call<String> createGuarantor(
            @retrofit2.http.Path("loanId") Long loanId            ,                 @retrofit2.http.Body String body    
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
  @POST("rescheduleloans")
  Call<String> createLoanRescheduleRequest(
                    @retrofit2.http.Body String body    
  );

  /**
   * 
   * 
   * @param relId  (required)
   * @param body  (optional)
   * @return Call&lt;String&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("entitytoentitymapping/{relId}")
  Call<String> createMap(
            @retrofit2.http.Path("relId") Long relId            ,                 @retrofit2.http.Body String body    
  );

  /**
   * 
   * 
   * @param entityType  (required)
   * @param entityId  (required)
   * @param body  (optional)
   * @return Call&lt;String&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("{entityType}/{entityId}/meetings")
  Call<String> createMeeting(
            @retrofit2.http.Path("entityType") String entityType            ,         @retrofit2.http.Path("entityId") Long entityId            ,                 @retrofit2.http.Body String body    
  );

  /**
   * Create a Share Product
   * Creates a Share Product  Mandatory Fields: name, shortName, description, currencyCode, digitsAfterDecimal,inMultiplesOf, locale, totalShares, unitPrice, nominalShares,allowDividendCalculationForInactiveClients,accountingRule  Mandatory Fields for Cash based accounting (accountingRule &#x3D; 2): shareReferenceId, shareSuspenseId, shareEquityId, incomeFromFeeAccountId  Optional Fields: sharesIssued, minimumShares, maximumShares, minimumActivePeriodForDividends, minimumactiveperiodFrequencyType, lockinPeriodFrequency, lockinPeriodFrequencyType, marketPricePeriods, chargesSelected
   * @param body  (required)
   * @param type type (required)
   * @return Call&lt;PostProductsTypeResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("products/{type}")
  Call<PostProductsTypeResponse> createProduct(
                    @retrofit2.http.Body PostProductsTypeRequest body    ,         @retrofit2.http.Path("type") String type            
  );

  /**
   * 
   * 
   * @param productId  (required)
   * @param body  (optional)
   * @return Call&lt;String&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("loanproducts/{productId}/productmix")
  Call<String> createProductMix(
            @retrofit2.http.Path("productId") Long productId            ,                 @retrofit2.http.Body String body    
  );

  /**
   * Calculate Interoperation Quote
   * 
   * @param body  (required)
   * @return Call&lt;InteropQuoteResponseData&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("interoperation/quotes")
  Call<InteropQuoteResponseData> createQuote(
                    @retrofit2.http.Body InteropQuoteRequestData body    
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
  @POST("rates")
  Call<String> createRate(
                    @retrofit2.http.Body String body    
  );

  /**
   * Allow Interoperation Transaction Request
   * 
   * @param body  (required)
   * @return Call&lt;InteropTransactionRequestResponseData&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("interoperation/requests")
  Call<InteropTransactionRequestResponseData> createTransactionRequest(
                    @retrofit2.http.Body InteropTransactionRequestData body    
  );

  /**
   * 
   * 
   * @param resourceId  (required)
   * @return Call&lt;String&gt;
   */
  @DELETE("email/{resourceId}")
  Call<String> delete1(
            @retrofit2.http.Path("resourceId") Long resourceId            
  );

  /**
   * 
   * 
   * @param resourceId  (required)
   * @return Call&lt;String&gt;
   */
  @DELETE("email/campaign/{resourceId}")
  Call<String> delete2(
            @retrofit2.http.Path("resourceId") Long resourceId            
  );

  /**
   * Delete a SMS Campaign
   * Note: Only closed SMS Campaigns can be deleted
   * @param campaignId  (required)
   * @return Call&lt;CommandProcessingResult&gt;
   */
  @DELETE("smscampaigns/{campaignId}")
  Call<CommandProcessingResult> delete3(
            @retrofit2.http.Path("campaignId") Long campaignId            
  );

  /**
   * 
   * 
   * @param mapId  (required)
   * @return Call&lt;String&gt;
   */
  @DELETE("entitytoentitymapping/{mapId}")
  Call<String> delete4(
            @retrofit2.http.Path("mapId") Long mapId            
  );

  /**
   * 
   * 
   * @param id  (required)
   * @return Call&lt;String&gt;
   */
  @DELETE("self/device/registration/{id}")
  Call<String> delete5(
            @retrofit2.http.Path("id") Long id            
  );

  /**
   * 
   * 
   * @param resourceId  (required)
   * @return Call&lt;String&gt;
   */
  @DELETE("sms/{resourceId}")
  Call<String> delete6(
            @retrofit2.http.Path("resourceId") Long resourceId            
  );

  /**
   * 
   * 
   * @param transactionId  (required)
   * @return Call&lt;String&gt;
   */
  @DELETE("officetransactions/{transactionId}")
  Call<String> delete8(
            @retrofit2.http.Path("transactionId") Long transactionId            
  );

  /**
   * Allow Interoperation Identifier registration
   * 
   * @param body  (required)
   * @param idType idType (required)
   * @param idValue idValue (required)
   * @return Call&lt;InteropIdentifierAccountResponseData&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @DELETE("interoperation/parties/{idType}/{idValue}")
  Call<InteropIdentifierAccountResponseData> deleteAccountIdentifier(
                    @retrofit2.http.Body InteropIdentifierRequestData body    ,         @retrofit2.http.Path("idType") String idType            ,         @retrofit2.http.Path("idValue") String idValue            
  );

  /**
   * Allow Interoperation Identifier registration
   * 
   * @param body  (required)
   * @param idType idType (required)
   * @param idValue idValue (required)
   * @param subIdOrType subIdOrType (required)
   * @return Call&lt;InteropIdentifierAccountResponseData&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @DELETE("interoperation/parties/{idType}/{idValue}/{subIdOrType}")
  Call<InteropIdentifierAccountResponseData> deleteAccountIdentifier1(
                    @retrofit2.http.Body InteropIdentifierRequestData body    ,         @retrofit2.http.Path("idType") String idType            ,         @retrofit2.http.Path("idValue") String idValue            ,         @retrofit2.http.Path("subIdOrType") String subIdOrType            
  );

  /**
   * 
   * 
   * @param entityType  (required)
   * @param entityId  (required)
   * @param calendarId  (required)
   * @return Call&lt;String&gt;
   */
  @DELETE("{entityType}/{entityId}/calendars/{calendarId}")
  Call<String> deleteCalendar(
            @retrofit2.http.Path("entityType") String entityType            ,         @retrofit2.http.Path("entityId") Long entityId            ,         @retrofit2.http.Path("calendarId") Long calendarId            
  );

  /**
   * 
   * 
   * @param familyMemberId  (required)
   * @param clientId clientId (required)
   * @param body  (optional)
   * @return Call&lt;String&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @DELETE("clients/{clientId}/familymembers/{familyMemberId}")
  Call<String> deleteClientFamilyMembers(
            @retrofit2.http.Path("familyMemberId") Long familyMemberId            ,         @retrofit2.http.Path("clientId") Long clientId            ,                 @retrofit2.http.Body String body    
  );

  /**
   * 
   * 
   * @param entity  (required)
   * @param entityId  (required)
   * @return Call&lt;String&gt;
   */
  @DELETE("{entity}/{entityId}/images")
  Call<String> deleteClientImage(
            @retrofit2.http.Path("entity") String entity            ,         @retrofit2.http.Path("entityId") Long entityId            
  );

  /**
   * 
   * 
   * @param surveyName  (required)
   * @param clientId  (required)
   * @param fulfilledId  (required)
   * @return Call&lt;String&gt;
   */
  @DELETE("survey/{surveyName}/{clientId}/{fulfilledId}")
  Call<String> deleteDatatableEntries2(
            @retrofit2.http.Path("surveyName") String surveyName            ,         @retrofit2.http.Path("clientId") Long clientId            ,         @retrofit2.http.Path("fulfilledId") Long fulfilledId            
  );

  /**
   * 
   * 
   * @param loanId  (required)
   * @param guarantorId  (required)
   * @param guarantorFundingId  (optional)
   * @return Call&lt;String&gt;
   */
  @DELETE("loans/{loanId}/guarantors/{guarantorId}")
  Call<String> deleteGuarantor(
            @retrofit2.http.Path("loanId") Long loanId            ,         @retrofit2.http.Path("guarantorId") Long guarantorId            ,     @retrofit2.http.Query("guarantorFundingId") Long guarantorFundingId                
  );

  /**
   * 
   * 
   * @param entityType  (required)
   * @param entityId  (required)
   * @param meetingId  (required)
   * @return Call&lt;String&gt;
   */
  @DELETE("{entityType}/{entityId}/meetings/{meetingId}")
  Call<String> deleteMeeting(
            @retrofit2.http.Path("entityType") String entityType            ,         @retrofit2.http.Path("entityId") Long entityId            ,         @retrofit2.http.Path("meetingId") Long meetingId            
  );

  /**
   * 
   * 
   * @param productId  (required)
   * @return Call&lt;String&gt;
   */
  @DELETE("loanproducts/{productId}/productmix")
  Call<String> deleteProductMix(
            @retrofit2.http.Path("productId") Long productId            
  );

  /**
   * 
   * 
   * @param entity  (required)
   * @param entityId  (required)
   * @param maxWidth  (optional)
   * @param maxHeight  (optional)
   * @param output  (optional)
   * @return Call&lt;Void&gt;
   */
  @GET("{entity}/{entityId}/images")
  Call<Void> downloadClientImage(
            @retrofit2.http.Path("entity") String entity            ,         @retrofit2.http.Path("entityId") Long entityId            ,     @retrofit2.http.Query("maxWidth") Integer maxWidth                ,     @retrofit2.http.Query("maxHeight") Integer maxHeight                ,     @retrofit2.http.Query("output") String output                
  );

  /**
   * 
   * 
   * @return Call&lt;String&gt;
   */
  @GET("CreditBureauConfiguration/loanProduct")
  Call<String> fetchLoanProducts();
    

  /**
   * Generate Individual Collection Sheet | Save Collection Sheet
   * Generate Individual Collection Sheet:  This Api retrieves repayment details of all individual loans under a office as on a specified meeting date.  Save Collection Sheet:  This Api allows the loan officer to perform bulk repayments of individual loans and deposit of mandatory savings on a given meeting date.
   * @param body  (required)
   * @param command command (optional)
   * @return Call&lt;PostCollectionSheetResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("collectionsheet")
  Call<PostCollectionSheetResponse> generateCollectionSheet(
                    @retrofit2.http.Body PostCollectionSheetRequest body    ,     @retrofit2.http.Query("command") String command                
  );

  /**
   * 
   * 
   * @return Call&lt;String&gt;
   */
  @GET("echo")
  Call<String> get();
    

  /**
   * Query Interoperation Account by secondary identifier
   * 
   * @param idType idType (required)
   * @param idValue idValue (required)
   * @return Call&lt;InteropIdentifierAccountResponseData&gt;
   */
  @GET("interoperation/parties/{idType}/{idValue}")
  Call<InteropIdentifierAccountResponseData> getAccountByIdentifier(
            @retrofit2.http.Path("idType") String idType            ,         @retrofit2.http.Path("idValue") String idValue            
  );

  /**
   * Query Interoperation Account by secondary identifier
   * 
   * @param idType idType (required)
   * @param idValue idValue (required)
   * @param subIdOrType subIdOrType (required)
   * @return Call&lt;InteropIdentifierAccountResponseData&gt;
   */
  @GET("interoperation/parties/{idType}/{idValue}/{subIdOrType}")
  Call<InteropIdentifierAccountResponseData> getAccountByIdentifier1(
            @retrofit2.http.Path("idType") String idType            ,         @retrofit2.http.Path("idValue") String idValue            ,         @retrofit2.http.Path("subIdOrType") String subIdOrType            
  );

  /**
   * Query Interoperation Account details
   * 
   * @param accountId accountId (required)
   * @return Call&lt;InteropAccountData&gt;
   */
  @GET("interoperation/accounts/{accountId}")
  Call<InteropAccountData> getAccountDetails(
            @retrofit2.http.Path("accountId") String accountId            
  );

  /**
   * Query Interoperation secondary identifiers by Account Id
   * 
   * @param accountId accountId (required)
   * @return Call&lt;InteropIdentifiersResponseData&gt;
   */
  @GET("interoperation/accounts/{accountId}/identifiers")
  Call<InteropIdentifiersResponseData> getAccountIdentifiers(
            @retrofit2.http.Path("accountId") String accountId            
  );

  /**
   * Query transactions by Account Id
   * 
   * @param accountId accountId (required)
   * @param debit debit (optional, default to true)
   * @param credit credit (optional, default to false)
   * @param fromBookingDateTime fromBookingDateTime (optional)
   * @param toBookingDateTime toBookingDateTime (optional)
   * @return Call&lt;InteropTransactionsData&gt;
   */
  @GET("interoperation/accounts/{accountId}/transactions")
  Call<InteropTransactionsData> getAccountTransactions(
            @retrofit2.http.Path("accountId") String accountId            ,     @retrofit2.http.Query("debit") Boolean debit                ,     @retrofit2.http.Query("credit") Boolean credit                ,     @retrofit2.http.Query("fromBookingDateTime") String fromBookingDateTime                ,     @retrofit2.http.Query("toBookingDateTime") String toBookingDateTime                
  );

  /**
   * 
   * 
   * @return Call&lt;String&gt;
   */
  @GET("rates")
  Call<String> getAllRates();
    

  /**
   * 
   * 
   * @param surveyName  (required)
   * @param clientId  (required)
   * @return Call&lt;String&gt;
   */
  @GET("survey/{surveyName}/{clientId}")
  Call<String> getClientSurveyOverview(
            @retrofit2.http.Path("surveyName") String surveyName            ,         @retrofit2.http.Path("clientId") Long clientId            
  );

  /**
   * 
   * 
   * @param organisationCreditBureauId  (required)
   * @return Call&lt;String&gt;
   */
  @GET("CreditBureauConfiguration/config/{organisationCreditBureauId}")
  Call<String> getConfiguration(
            @retrofit2.http.Path("organisationCreditBureauId") Long organisationCreditBureauId            
  );

  /**
   * 
   * 
   * @return Call&lt;String&gt;
   */
  @GET("CreditBureauConfiguration")
  Call<String> getCreditBureau();
    

  /**
   * 
   * 
   * @return Call&lt;String&gt;
   */
  @GET("CreditBureauConfiguration/mappings")
  Call<String> getCreditBureauLoanProductMapping();
    

  /**
   * 
   * 
   * @param mapId  (required)
   * @param fromId  (required)
   * @param toId  (required)
   * @return Call&lt;String&gt;
   */
  @GET("entitytoentitymapping/{mapId}/{fromId}/{toId}")
  Call<String> getEntityToEntityMappings(
            @retrofit2.http.Path("mapId") Long mapId            ,         @retrofit2.http.Path("fromId") Long fromId            ,         @retrofit2.http.Path("toId") Long toId            
  );

  /**
   * 
   * 
   * @param familyMemberId  (required)
   * @param clientId clientId (required)
   * @return Call&lt;String&gt;
   */
  @GET("clients/{clientId}/familymembers/{familyMemberId}")
  Call<String> getFamilyMember(
            @retrofit2.http.Path("familyMemberId") Long familyMemberId            ,         @retrofit2.http.Path("clientId") Long clientId            
  );

  /**
   * 
   * 
   * @param clientId  (required)
   * @return Call&lt;String&gt;
   */
  @GET("clients/{clientId}/familymembers")
  Call<String> getFamilyMembers(
            @retrofit2.http.Path("clientId") Long clientId            
  );

  /**
   * 
   * 
   * @param loanId  (required)
   * @param officeId  (optional)
   * @param dateFormat  (optional)
   * @return Call&lt;Void&gt;
   */
  @GET("loans/{loanId}/guarantors/downloadtemplate")
  Call<Void> getGuarantorTemplate(
            @retrofit2.http.Path("loanId") Long loanId            ,     @retrofit2.http.Query("officeId") Long officeId                ,     @retrofit2.http.Query("dateFormat") String dateFormat                
  );

  /**
   * 
   * 
   * @return Call&lt;String&gt;
   */
  @GET("twofactor")
  Call<String> getOTPDeliveryMethods();
    

  /**
   * 
   * 
   * @return Call&lt;String&gt;
   */
  @GET("CreditBureauConfiguration/organisationCreditBureau")
  Call<String> getOrganisationCreditBureau();
    

  /**
   * 
   * 
   * @param importDocumentId  (optional)
   * @return Call&lt;Void&gt;
   */
  @GET("imports/downloadOutputTemplate")
  Call<Void> getOutputTemplate(
        @retrofit2.http.Query("importDocumentId") String importDocumentId                
  );

  /**
   * Query Interoperation Quote
   * 
   * @param transactionCode transactionCode (required)
   * @param quoteCode quoteCode (required)
   * @return Call&lt;InteropQuoteResponseData&gt;
   */
  @GET("interoperation/transactions/{transactionCode}/quotes/{quoteCode}")
  Call<InteropQuoteResponseData> getQuote(
            @retrofit2.http.Path("transactionCode") String transactionCode            ,         @retrofit2.http.Path("quoteCode") String quoteCode            
  );

  /**
   * 
   * 
   * @param surveyName  (required)
   * @param clientId  (required)
   * @param entryId  (required)
   * @return Call&lt;String&gt;
   */
  @GET("survey/{surveyName}/{clientId}/{entryId}")
  Call<String> getSurveyEntry(
            @retrofit2.http.Path("surveyName") String surveyName            ,         @retrofit2.http.Path("clientId") Long clientId            ,         @retrofit2.http.Path("entryId") Long entryId            
  );

  /**
   * 
   * 
   * @param clientId  (required)
   * @return Call&lt;String&gt;
   */
  @GET("clients/{clientId}/familymembers/template")
  Call<String> getTemplate1(
            @retrofit2.http.Path("clientId") Long clientId            
  );

  /**
   * Query Interoperation Transaction Request
   * 
   * @param transactionCode transactionCode (required)
   * @param requestCode requestCode (required)
   * @return Call&lt;InteropTransactionRequestResponseData&gt;
   */
  @GET("interoperation/transactions/{transactionCode}/requests/{requestCode}")
  Call<InteropTransactionRequestResponseData> getTransactionRequest(
            @retrofit2.http.Path("transactionCode") String transactionCode            ,         @retrofit2.http.Path("requestCode") String requestCode            
  );

  /**
   * Query Interoperation Transfer
   * 
   * @param transactionCode transactionCode (required)
   * @param transferCode transferCode (required)
   * @return Call&lt;InteropTransferResponseData&gt;
   */
  @GET("interoperation/transactions/{transactionCode}/transfers/{transferCode}")
  Call<InteropTransferResponseData> getTransfer(
            @retrofit2.http.Path("transactionCode") String transactionCode            ,         @retrofit2.http.Path("transferCode") String transferCode            
  );

  /**
   * SMS Campaign
   * Activates | Deactivates | Reactivates
   * @param campaignId  (required)
   * @param command  (optional)
   * @return Call&lt;CommandProcessingResult&gt;
   */
  @POST("smscampaigns/{campaignId}")
  Call<CommandProcessingResult> handleCommands(
            @retrofit2.http.Path("campaignId") Long campaignId            ,     @retrofit2.http.Query("command") String command                
  );

  /**
   * 
   * 
   * @param type type (required)
   * @param productId productId (required)
   * @param command command (optional)
   * @return Call&lt;String&gt;
   */
  @POST("products/{type}/{productId}")
  Call<String> handleCommands3(
            @retrofit2.http.Path("type") String type            ,         @retrofit2.http.Path("productId") Long productId            ,     @retrofit2.http.Query("command") String command                
  );

  /**
   * Query Interoperation Health Request
   * 
   * @return Call&lt;Void&gt;
   */
  @GET("interoperation/health")
  Call<Void> health();
    

  /**
   * 
   * 
   * @param body  (optional)
   * @return Call&lt;String&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("loans/loanreassignment")
  Call<String> loanReassignment(
                    @retrofit2.http.Body String body    
  );

  /**
   * 
   * 
   * @param officeId  (optional)
   * @param fromLoanOfficerId  (optional)
   * @return Call&lt;String&gt;
   */
  @GET("loans/loanreassignment/template")
  Call<String> loanReassignmentTemplate(
        @retrofit2.http.Query("officeId") Long officeId                ,     @retrofit2.http.Query("fromLoanOfficerId") Long fromLoanOfficerId                
  );

  /**
   * 
   * 
   * @param loanId  (required)
   * @return Call&lt;String&gt;
   */
  @GET("loans/{loanId}/guarantors/template")
  Call<String> newGuarantorTemplate(
            @retrofit2.http.Path("loanId") Long loanId            
  );

  /**
   * 
   * 
   * @return Call&lt;String&gt;
   */
  @GET("officetransactions/template")
  Call<String> newOfficeTransactionDetails();
    

  /**
   * 
   * 
   * @param entityType  (required)
   * @param entityId  (required)
   * @param meetingId  (required)
   * @param body  (optional)
   * @param command  (optional)
   * @return Call&lt;String&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("{entityType}/{entityId}/meetings/{meetingId}")
  Call<String> performMeetingCommands(
            @retrofit2.http.Path("entityType") String entityType            ,         @retrofit2.http.Path("entityId") Long entityId            ,         @retrofit2.http.Path("meetingId") Long meetingId            ,                 @retrofit2.http.Body String body    ,     @retrofit2.http.Query("command") String command                
  );

  /**
   * Prepare Interoperation Transfer
   * 
   * @param body  (required)
   * @param action action (optional)
   * @return Call&lt;InteropTransferResponseData&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("interoperation/transfers")
  Call<InteropTransferResponseData> performTransfer(
                    @retrofit2.http.Body InteropTransferRequestData body    ,     @retrofit2.http.Query("action") String action                
  );

  /**
   * 
   * 
   * @param loanId  (required)
   * @param file  (optional)
   * @param locale  (optional)
   * @param dateFormat  (optional)
   * @return Call&lt;String&gt;
   */
  @retrofit2.http.Multipart
  @POST("loans/{loanId}/guarantors/uploadtemplate")
  Call<String> postGuarantorTemplate(
            @retrofit2.http.Path("loanId") Long loanId            ,                     @retrofit2.http.Part("file") FormDataContentDisposition file,                     @retrofit2.http.Part("locale") String locale,                     @retrofit2.http.Part("dateFormat") String dateFormat
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
  @POST("email/campaign/preview")
  Call<String> preview(
                    @retrofit2.http.Body String body    
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
  @POST("smscampaigns/preview")
  Call<String> preview1(
                    @retrofit2.http.Body String body    
  );

  /**
   * 
   * 
   * @param scheduleId  (required)
   * @param command  (optional)
   * @return Call&lt;String&gt;
   */
  @GET("rescheduleloans/{scheduleId}")
  Call<String> readLoanRescheduleRequest(
            @retrofit2.http.Path("scheduleId") Long scheduleId            ,     @retrofit2.http.Query("command") String command                
  );

  /**
   * 
   * 
   * @param surveyName  (required)
   * @param apptable  (required)
   * @param body  (optional)
   * @return Call&lt;String&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("survey/register/{surveyName}/{apptable}")
  Call<String> register(
            @retrofit2.http.Path("surveyName") String surveyName            ,         @retrofit2.http.Path("apptable") String apptable            ,                 @retrofit2.http.Body String body    
  );

  /**
   * Interoperation Identifier registration
   * 
   * @param body  (required)
   * @param idType idType (required)
   * @param idValue idValue (required)
   * @param subIdOrType subIdOrType (required)
   * @return Call&lt;InteropIdentifierAccountResponseData&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("interoperation/parties/{idType}/{idValue}/{subIdOrType}")
  Call<InteropIdentifierAccountResponseData> registerAccountIdentifier(
                    @retrofit2.http.Body InteropIdentifierRequestData body    ,         @retrofit2.http.Path("idType") String idType            ,         @retrofit2.http.Path("idValue") String idValue            ,         @retrofit2.http.Path("subIdOrType") String subIdOrType            
  );

  /**
   * Interoperation Identifier registration
   * 
   * @param body  (required)
   * @param idType idType (required)
   * @param idValue idValue (required)
   * @return Call&lt;InteropIdentifierAccountResponseData&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("interoperation/parties/{idType}/{idValue}")
  Call<InteropIdentifierAccountResponseData> registerAccountIdentifier1(
                    @retrofit2.http.Body InteropIdentifierRequestData body    ,         @retrofit2.http.Path("idType") String idType            ,         @retrofit2.http.Path("idValue") String idValue            
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
  @POST("self/device/registration")
  Call<String> registerDevice(
                    @retrofit2.http.Body String body    
  );

  /**
   * 
   * 
   * @param deliveryMethod  (optional)
   * @param extendedToken  (optional, default to false)
   * @return Call&lt;String&gt;
   */
  @POST("twofactor")
  Call<String> requestToken(
        @retrofit2.http.Query("deliveryMethod") String deliveryMethod                ,     @retrofit2.http.Query("extendedToken") Boolean extendedToken                
  );

  /**
   * Retrieve a Fund
   * Returns the details of a Fund.  Example Requests:  funds/1
   * @param fundId fundId (required)
   * @return Call&lt;GetFundsResponse&gt;
   */
  @GET("funds/{fundId}")
  Call<GetFundsResponse> retreiveFund(
            @retrofit2.http.Path("fundId") Long fundId            
  );

  /**
   * 
   * 
   * @param likelihoodId  (required)
   * @param ppiName  (required)
   * @return Call&lt;String&gt;
   */
  @GET("likelihood/{ppiName}/{likelihoodId}")
  Call<String> retrieve(
            @retrofit2.http.Path("likelihoodId") Long likelihoodId            ,         @retrofit2.http.Path("ppiName") String ppiName            
  );

  /**
   * 
   * 
   * @return Call&lt;String&gt;
   */
  @GET("sms")
  Call<String> retrieveAll10();
    

  /**
   * 
   * 
   * @param ppiName  (required)
   * @return Call&lt;String&gt;
   */
  @GET("likelihood/{ppiName}")
  Call<String> retrieveAll11(
            @retrofit2.http.Path("ppiName") String ppiName            
  );

  /**
   * 
   * 
   * @param ppiName  (required)
   * @return Call&lt;String&gt;
   */
  @GET("povertyLine/{ppiName}")
  Call<String> retrieveAll12(
            @retrofit2.http.Path("ppiName") String ppiName            
  );

  /**
   * 
   * 
   * @param ppiName  (required)
   * @param likelihoodId  (required)
   * @return Call&lt;String&gt;
   */
  @GET("povertyLine/{ppiName}/{likelihoodId}")
  Call<String> retrieveAll13(
            @retrofit2.http.Path("ppiName") String ppiName            ,         @retrofit2.http.Path("likelihoodId") Long likelihoodId            
  );

  /**
   * 
   * 
   * @param savingsId  (required)
   * @param guarantorFundingId  (optional)
   * @param offset  (optional)
   * @param limit  (optional)
   * @param orderBy  (optional)
   * @param sortOrder  (optional)
   * @return Call&lt;String&gt;
   */
  @GET("savingsaccounts/{savingsId}/onholdtransactions")
  Call<String> retrieveAll27(
            @retrofit2.http.Path("savingsId") Long savingsId            ,     @retrofit2.http.Query("guarantorFundingId") Long guarantorFundingId                ,     @retrofit2.http.Query("offset") Integer offset                ,     @retrofit2.http.Query("limit") Integer limit                ,     @retrofit2.http.Query("orderBy") String orderBy                ,     @retrofit2.http.Query("sortOrder") String sortOrder                
  );

  /**
   * 
   * 
   * @param clientId  (optional)
   * @return Call&lt;String&gt;
   */
  @GET("self/savingsproducts")
  Call<String> retrieveAll37(
        @retrofit2.http.Query("clientId") Long clientId                
  );

  /**
   * 
   * 
   * @return Call&lt;String&gt;
   */
  @GET("email/configuration")
  Call<String> retrieveAll5();
    

  /**
   * 
   * 
   * @return Call&lt;String&gt;
   */
  @GET("entitytoentitymapping")
  Call<String> retrieveAll7();
    

  /**
   * 
   * 
   * @return Call&lt;String&gt;
   */
  @GET("twofactor/configure")
  Call<String> retrieveAll9();
    

  /**
   * 
   * 
   * @return Call&lt;String&gt;
   */
  @GET("email/campaign")
  Call<String> retrieveAllCampaign();
    

  /**
   * 
   * 
   * @return Call&lt;String&gt;
   */
  @GET("self/device/registration")
  Call<String> retrieveAllDeviceRegistrations();
    

  /**
   * 
   * 
   * @param sqlSearch  (optional)
   * @param offset  (optional)
   * @param limit  (optional)
   * @param status  (optional)
   * @param orderBy  (optional)
   * @param sortOrder  (optional)
   * @param fromDate  (optional)
   * @param toDate  (optional)
   * @param locale  (optional)
   * @param dateFormat  (optional)
   * @return Call&lt;String&gt;
   */
  @GET("email/messageByStatus")
  Call<String> retrieveAllEmailByStatus(
        @retrofit2.http.Query("sqlSearch") String sqlSearch                ,     @retrofit2.http.Query("offset") Integer offset                ,     @retrofit2.http.Query("limit") Integer limit                ,     @retrofit2.http.Query("status") Integer status                ,     @retrofit2.http.Query("orderBy") String orderBy                ,     @retrofit2.http.Query("sortOrder") String sortOrder                ,     @retrofit2.http.Query("fromDate") DateParam fromDate                ,     @retrofit2.http.Query("toDate") DateParam toDate                ,     @retrofit2.http.Query("locale") String locale                ,     @retrofit2.http.Query("dateFormat") String dateFormat                
  );

  /**
   * 
   * 
   * @return Call&lt;String&gt;
   */
  @GET("email")
  Call<String> retrieveAllEmails();
    

  /**
   * List SMS Campaigns
   * Example Requests:  smscampaigns
   * @param sqlSearch  (optional)
   * @param offset  (optional)
   * @param limit  (optional)
   * @param orderBy  (optional)
   * @param sortOrder  (optional)
   * @return Call&lt;SmsCampaignData&gt;
   */
  @GET("smscampaigns")
  Call<SmsCampaignData> retrieveAllEmails1(
        @retrofit2.http.Query("sqlSearch") String sqlSearch                ,     @retrofit2.http.Query("offset") Integer offset                ,     @retrofit2.http.Query("limit") Integer limit                ,     @retrofit2.http.Query("orderBy") String orderBy                ,     @retrofit2.http.Query("sortOrder") String sortOrder                
  );

  /**
   * 
   * 
   * @return Call&lt;String&gt;
   */
  @GET("grouplevels")
  Call<String> retrieveAllGroups();
    

  /**
   * List Share Products
   * Lists Share Products  Mandatory Fields: limit, offset  Example Requests:  shareproducts
   * @param type type (required)
   * @param offset offset (optional)
   * @param limit limit (optional)
   * @return Call&lt;GetProductsTypeResponse&gt;
   */
  @GET("products/{type}")
  Call<GetProductsTypeResponse> retrieveAllProducts(
            @retrofit2.http.Path("type") String type            ,     @retrofit2.http.Query("offset") Integer offset                ,     @retrofit2.http.Query("limit") Integer limit                
  );

  /**
   * 
   * 
   * @param clientId  (optional)
   * @param offset  (optional)
   * @param limit  (optional)
   * @return Call&lt;String&gt;
   */
  @GET("self/products/share")
  Call<String> retrieveAllProducts1(
        @retrofit2.http.Query("clientId") Long clientId                ,     @retrofit2.http.Query("offset") Integer offset                ,     @retrofit2.http.Query("limit") Integer limit                
  );

  /**
   * 
   * 
   * @param command  (optional)
   * @return Call&lt;String&gt;
   */
  @GET("rescheduleloans")
  Call<String> retrieveAllRescheduleRequest(
        @retrofit2.http.Query("command") String command                
  );

  /**
   * 
   * 
   * @param campaignId  (required)
   * @param status  (optional)
   * @param fromDate  (optional)
   * @param toDate  (optional)
   * @param locale  (optional)
   * @param dateFormat  (optional)
   * @param sqlSearch  (optional)
   * @param offset  (optional)
   * @param limit  (optional)
   * @param orderBy  (optional)
   * @param sortOrder  (optional)
   * @return Call&lt;String&gt;
   */
  @GET("sms/{campaignId}/messageByStatus")
  Call<String> retrieveAllSmsByStatus(
            @retrofit2.http.Path("campaignId") Long campaignId            ,     @retrofit2.http.Query("status") Long status                ,     @retrofit2.http.Query("fromDate") DateParam fromDate                ,     @retrofit2.http.Query("toDate") DateParam toDate                ,     @retrofit2.http.Query("locale") String locale                ,     @retrofit2.http.Query("dateFormat") String dateFormat                ,     @retrofit2.http.Query("sqlSearch") String sqlSearch                ,     @retrofit2.http.Query("offset") Integer offset                ,     @retrofit2.http.Query("limit") Integer limit                ,     @retrofit2.http.Query("orderBy") String orderBy                ,     @retrofit2.http.Query("sortOrder") String sortOrder                
  );

  /**
   * 
   * 
   * @param calendarId  (required)
   * @param entityType  (required)
   * @param entityId  (required)
   * @return Call&lt;String&gt;
   */
  @GET("{entityType}/{entityId}/calendars/{calendarId}")
  Call<String> retrieveCalendar(
            @retrofit2.http.Path("calendarId") Long calendarId            ,         @retrofit2.http.Path("entityType") String entityType            ,         @retrofit2.http.Path("entityId") Long entityId            
  );

  /**
   * 
   * 
   * @param entityType  (required)
   * @param entityId  (required)
   * @param calendarType  (optional, default to all)
   * @return Call&lt;String&gt;
   */
  @GET("{entityType}/{entityId}/calendars")
  Call<String> retrieveCalendarsByEntity(
            @retrofit2.http.Path("entityType") String entityType            ,         @retrofit2.http.Path("entityId") Long entityId            ,     @retrofit2.http.Query("calendarType") String calendarType                
  );

  /**
   * Retrieve a SMS Campaign
   * Example Requests:  smscampaigns/1 
   * @param resourceId  (required)
   * @return Call&lt;SmsCampaignData&gt;
   */
  @GET("smscampaigns/{resourceId}")
  Call<SmsCampaignData> retrieveCampaign(
            @retrofit2.http.Path("resourceId") Long resourceId            
  );

  /**
   * 
   * 
   * @param id  (required)
   * @return Call&lt;String&gt;
   */
  @GET("self/device/registration/{id}")
  Call<String> retrieveDeviceRegiistration(
            @retrofit2.http.Path("id") Long id            
  );

  /**
   * 
   * 
   * @param clientId  (required)
   * @return Call&lt;String&gt;
   */
  @GET("self/device/registration/client/{clientId}")
  Call<String> retrieveDeviceRegistrationByClientId(
            @retrofit2.http.Path("clientId") Long clientId            
  );

  /**
   * 
   * 
   * @param sqlSearch  (optional)
   * @param offset  (optional)
   * @param limit  (optional)
   * @param orderBy  (optional)
   * @param sortOrder  (optional)
   * @return Call&lt;String&gt;
   */
  @GET("email/failedEmail")
  Call<String> retrieveFailedEmail(
        @retrofit2.http.Query("sqlSearch") String sqlSearch                ,     @retrofit2.http.Query("offset") Integer offset                ,     @retrofit2.http.Query("limit") Integer limit                ,     @retrofit2.http.Query("orderBy") String orderBy                ,     @retrofit2.http.Query("sortOrder") String sortOrder                
  );

  /**
   * Retrieve Funds
   * Returns the list of funds.  Example Requests:  funds
   * @return Call&lt;List&lt;GetFundsResponse&gt;&gt;
   */
  @GET("funds")
  Call<List<GetFundsResponse>> retrieveFunds();
    

  /**
   * 
   * 
   * @param loanId  (required)
   * @return Call&lt;String&gt;
   */
  @GET("loans/{loanId}/guarantors")
  Call<String> retrieveGuarantorDetails(
            @retrofit2.http.Path("loanId") Long loanId            
  );

  /**
   * 
   * 
   * @param loanId  (required)
   * @param guarantorId  (required)
   * @return Call&lt;String&gt;
   */
  @GET("loans/{loanId}/guarantors/{guarantorId}")
  Call<String> retrieveGuarantorDetails1(
            @retrofit2.http.Path("loanId") Long loanId            ,         @retrofit2.http.Path("guarantorId") Long guarantorId            
  );

  /**
   * 
   * 
   * @param entityType  (optional)
   * @return Call&lt;String&gt;
   */
  @GET("imports")
  Call<String> retrieveImportDocuments(
        @retrofit2.http.Query("entityType") String entityType                
  );

  /**
   * 
   * 
   * @param meetingId  (required)
   * @param entityType  (required)
   * @param entityId  (required)
   * @return Call&lt;String&gt;
   */
  @GET("{entityType}/{entityId}/meetings/{meetingId}")
  Call<String> retrieveMeeting(
            @retrofit2.http.Path("meetingId") Long meetingId            ,         @retrofit2.http.Path("entityType") String entityType            ,         @retrofit2.http.Path("entityId") Long entityId            
  );

  /**
   * 
   * 
   * @param entityType  (required)
   * @param entityId  (required)
   * @param limit  (optional)
   * @return Call&lt;String&gt;
   */
  @GET("{entityType}/{entityId}/meetings")
  Call<String> retrieveMeetings(
            @retrofit2.http.Path("entityType") String entityType            ,         @retrofit2.http.Path("entityId") Long entityId            ,     @retrofit2.http.Query("limit") Integer limit                
  );

  /**
   * 
   * 
   * @param entityType  (required)
   * @param entityId  (required)
   * @return Call&lt;String&gt;
   */
  @GET("{entityType}/{entityId}/calendars/template")
  Call<String> retrieveNewCalendarDetails(
            @retrofit2.http.Path("entityType") String entityType            ,         @retrofit2.http.Path("entityId") Long entityId            
  );

  /**
   * 
   * 
   * @return Call&lt;String&gt;
   */
  @GET("officetransactions")
  Call<String> retrieveOfficeTransactions();
    

  /**
   * 
   * 
   * @param resourceId  (required)
   * @return Call&lt;String&gt;
   */
  @GET("email/{resourceId}")
  Call<String> retrieveOne1(
            @retrofit2.http.Path("resourceId") Long resourceId            
  );

  /**
   * 
   * 
   * @param fixedDepositAccountId  (required)
   * @param transactionId  (required)
   * @return Call&lt;String&gt;
   */
  @GET("fixeddepositaccounts/{fixedDepositAccountId}/transactions/{transactionId}")
  Call<String> retrieveOne16(
            @retrofit2.http.Path("fixedDepositAccountId") Long fixedDepositAccountId            ,         @retrofit2.http.Path("transactionId") Long transactionId            
  );

  /**
   * 
   * 
   * @param savingsId  (required)
   * @param transactionId  (required)
   * @return Call&lt;String&gt;
   */
  @GET("savingsaccounts/{savingsId}/transactions/{transactionId}")
  Call<String> retrieveOne22(
            @retrofit2.http.Path("savingsId") Long savingsId            ,         @retrofit2.http.Path("transactionId") Long transactionId            
  );

  /**
   * 
   * 
   * @param productId  (required)
   * @param clientId  (optional)
   * @return Call&lt;String&gt;
   */
  @GET("self/savingsproducts/{productId}")
  Call<String> retrieveOne26(
            @retrofit2.http.Path("productId") Long productId            ,     @retrofit2.http.Query("clientId") Long clientId                
  );

  /**
   * 
   * 
   * @param mapId  (required)
   * @return Call&lt;String&gt;
   */
  @GET("entitytoentitymapping/{mapId}")
  Call<String> retrieveOne4(
            @retrofit2.http.Path("mapId") Long mapId            
  );

  /**
   * 
   * 
   * @param resourceId  (required)
   * @return Call&lt;String&gt;
   */
  @GET("sms/{resourceId}")
  Call<String> retrieveOne6(
            @retrofit2.http.Path("resourceId") Long resourceId            
  );

  /**
   * 
   * 
   * @param resourceId  (required)
   * @return Call&lt;String&gt;
   */
  @GET("email/campaign/{resourceId}")
  Call<String> retrieveOneCampaign(
            @retrofit2.http.Path("resourceId") Long resourceId            
  );

  /**
   * 
   * 
   * @param resourceId  (required)
   * @return Call&lt;String&gt;
   */
  @GET("email/campaign/template/{resourceId}")
  Call<String> retrieveOneTemplate(
            @retrofit2.http.Path("resourceId") Long resourceId            
  );

  /**
   * 
   * 
   * @param sqlSearch  (optional)
   * @param offset  (optional)
   * @param limit  (optional)
   * @param orderBy  (optional)
   * @param sortOrder  (optional)
   * @return Call&lt;String&gt;
   */
  @GET("email/pendingEmail")
  Call<String> retrievePendingEmail(
        @retrofit2.http.Query("sqlSearch") String sqlSearch                ,     @retrofit2.http.Query("offset") Integer offset                ,     @retrofit2.http.Query("limit") Integer limit                ,     @retrofit2.http.Query("orderBy") String orderBy                ,     @retrofit2.http.Query("sortOrder") String sortOrder                
  );

  /**
   * Retrieve a Share Product
   * Retrieves a Share Product  Example Requests:  products/share/1   products/share/1?template&#x3D;true
   * @param productId productId (required)
   * @param type type (required)
   * @return Call&lt;GetProductsTypeProductIdResponse&gt;
   */
  @GET("products/{type}/{productId}")
  Call<GetProductsTypeProductIdResponse> retrieveProduct(
            @retrofit2.http.Path("productId") Long productId            ,         @retrofit2.http.Path("type") String type            
  );

  /**
   * 
   * 
   * @param productId  (required)
   * @param type  (required)
   * @param clientId  (optional)
   * @return Call&lt;String&gt;
   */
  @GET("self/products/share/{productId}")
  Call<String> retrieveProduct1(
            @retrofit2.http.Path("productId") Long productId            ,         @retrofit2.http.Path("type") String type            ,     @retrofit2.http.Query("clientId") Long clientId                
  );

  /**
   * 
   * 
   * @param rateId  (required)
   * @return Call&lt;String&gt;
   */
  @GET("rates/{rateId}")
  Call<String> retrieveRate(
            @retrofit2.http.Path("rateId") Long rateId            
  );

  /**
   * 
   * 
   * @param sqlSearch  (optional)
   * @param offset  (optional)
   * @param limit  (optional)
   * @param orderBy  (optional)
   * @param sortOrder  (optional)
   * @return Call&lt;String&gt;
   */
  @GET("email/sentEmail")
  Call<String> retrieveSentEmail(
        @retrofit2.http.Query("sqlSearch") String sqlSearch                ,     @retrofit2.http.Query("offset") Integer offset                ,     @retrofit2.http.Query("limit") Integer limit                ,     @retrofit2.http.Query("orderBy") String orderBy                ,     @retrofit2.http.Query("sortOrder") String sortOrder                
  );

  /**
   * Retrieve survey
   * Lists a registered survey table details and the Apache Fineract Core application table they are registered to.
   * @param surveyName surveyName (required)
   * @return Call&lt;GetSurveyResponse&gt;
   */
  @GET("survey/{surveyName}")
  Call<GetSurveyResponse> retrieveSurvey(
            @retrofit2.http.Path("surveyName") String surveyName            
  );

  /**
   * Retrieve surveys
   * Retrieve surveys. This allows to retrieve the list of survey tables registered .
   * @return Call&lt;List&lt;GetSurveyResponse&gt;&gt;
   */
  @GET("survey")
  Call<List<GetSurveyResponse>> retrieveSurveys();
    

  /**
   * 
   * 
   * @param productId  (required)
   * @return Call&lt;String&gt;
   */
  @GET("loanproducts/{productId}/productmix")
  Call<String> retrieveTemplate11(
            @retrofit2.http.Path("productId") Long productId            
  );

  /**
   * 
   * 
   * @param type type (required)
   * @return Call&lt;String&gt;
   */
  @GET("products/{type}/template")
  Call<String> retrieveTemplate12(
            @retrofit2.http.Path("type") String type            
  );

  /**
   * 
   * 
   * @param fixedDepositAccountId  (required)
   * @return Call&lt;String&gt;
   */
  @GET("fixeddepositaccounts/{fixedDepositAccountId}/transactions/template")
  Call<String> retrieveTemplate13(
            @retrofit2.http.Path("fixedDepositAccountId") Long fixedDepositAccountId            
  );

  /**
   * 
   * 
   * @param savingsId  (required)
   * @return Call&lt;String&gt;
   */
  @GET("savingsaccounts/{savingsId}/transactions/template")
  Call<String> retrieveTemplate18(
            @retrofit2.http.Path("savingsId") Long savingsId            
  );

  /**
   * 
   * 
   * @return Call&lt;String&gt;
   */
  @GET("rescheduleloans/template")
  Call<String> retrieveTemplate9();
    

  /**
   * 
   * 
   * @param loanId  (required)
   * @param disbursementId  (required)
   * @return Call&lt;String&gt;
   */
  @GET("loans/{loanId}/disbursements/{disbursementId}")
  Call<String> retriveDetail(
            @retrofit2.http.Path("loanId") Long loanId            ,         @retrofit2.http.Path("disbursementId") Long disbursementId            
  );

  /**
   * 
   * 
   * @param importDocumentId  (optional)
   * @return Call&lt;String&gt;
   */
  @GET("imports/getOutputTemplateLocation")
  Call<String> retriveOutputTemplateLocation(
        @retrofit2.http.Query("importDocumentId") String importDocumentId                
  );

  /**
   * 
   * 
   * @return Call&lt;String&gt;
   */
  @GET("email/campaign/template")
  Call<String> template1();
    

  /**
   * 
   * 
   * @param entityType  (required)
   * @param entityId  (required)
   * @param calendarId  (optional)
   * @return Call&lt;String&gt;
   */
  @GET("{entityType}/{entityId}/meetings/template")
  Call<String> template11(
            @retrofit2.http.Path("entityType") String entityType            ,         @retrofit2.http.Path("entityId") Long entityId            ,     @retrofit2.http.Query("calendarId") Long calendarId                
  );

  /**
   * Retrieve a SMS Campaign
   * Example Requests:  smscampaigns/1   smscampaigns/1?template&#x3D;true   smscampaigns/template
   * @return Call&lt;SmsCampaignData&gt;
   */
  @GET("smscampaigns/template")
  Call<SmsCampaignData> template2();
    

  /**
   * 
   * 
   * @param fixedDepositAccountId  (required)
   * @param body  (optional)
   * @param command  (optional)
   * @return Call&lt;String&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("fixeddepositaccounts/{fixedDepositAccountId}/transactions")
  Call<String> transaction(
            @retrofit2.http.Path("fixedDepositAccountId") Long fixedDepositAccountId            ,                 @retrofit2.http.Body String body    ,     @retrofit2.http.Query("command") String command                
  );

  /**
   * 
   * 
   * @param savingsId  (required)
   * @param body  (optional)
   * @param command  (optional)
   * @return Call&lt;String&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("savingsaccounts/{savingsId}/transactions")
  Call<String> transaction2(
            @retrofit2.http.Path("savingsId") Long savingsId            ,                 @retrofit2.http.Body String body    ,     @retrofit2.http.Query("command") String command                
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
  @POST("officetransactions")
  Call<String> transferMoneyFrom(
                    @retrofit2.http.Body String body    
  );

  /**
   * 
   * 
   * @param resourceId  (required)
   * @param body  (optional)
   * @return Call&lt;String&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("email/{resourceId}")
  Call<String> update2(
            @retrofit2.http.Path("resourceId") Long resourceId            ,                 @retrofit2.http.Body String body    
  );

  /**
   * 
   * 
   * @param resourceId  (required)
   * @param body  (optional)
   * @return Call&lt;String&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("sms/{resourceId}")
  Call<String> update3(
            @retrofit2.http.Path("resourceId") Long resourceId            ,                 @retrofit2.http.Body String body    
  );

  /**
   * 
   * 
   * @param likelihoodId  (required)
   * @param ppiName  (required)
   * @param body  (optional)
   * @return Call&lt;String&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("likelihood/{ppiName}/{likelihoodId}")
  Call<String> update4(
            @retrofit2.http.Path("likelihoodId") Long likelihoodId            ,         @retrofit2.http.Path("ppiName") String ppiName            ,                 @retrofit2.http.Body String body    
  );

  /**
   * 
   * 
   * @param entityType  (required)
   * @param entityId  (required)
   * @param calendarId  (required)
   * @param body  (optional)
   * @return Call&lt;String&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("{entityType}/{entityId}/calendars/{calendarId}")
  Call<String> updateCalendar(
            @retrofit2.http.Path("entityType") String entityType            ,         @retrofit2.http.Path("entityId") Long entityId            ,         @retrofit2.http.Path("calendarId") Long calendarId            ,                 @retrofit2.http.Body String body    
  );

  /**
   * 
   * 
   * @param resourceId  (required)
   * @param body  (optional)
   * @return Call&lt;String&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("email/campaign/{resourceId}")
  Call<String> updateCampaign(
            @retrofit2.http.Path("resourceId") Long resourceId            ,                 @retrofit2.http.Body String body    
  );

  /**
   * Update a Campaign
   * 
   * @param body  (required)
   * @param campaignId  (required)
   * @return Call&lt;CommandProcessingResult&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("smscampaigns/{campaignId}")
  Call<CommandProcessingResult> updateCampaign1(
                    @retrofit2.http.Body CommandWrapper body    ,         @retrofit2.http.Path("campaignId") Long campaignId            
  );

  /**
   * 
   * 
   * @param familyMemberId  (required)
   * @param clientId clientId (required)
   * @param body  (optional)
   * @return Call&lt;String&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("clients/{clientId}/familymembers/{familyMemberId}")
  Call<String> updateClientFamilyMembers(
            @retrofit2.http.Path("familyMemberId") Long familyMemberId            ,         @retrofit2.http.Path("clientId") Long clientId            ,                 @retrofit2.http.Body String body    
  );

  /**
   * 
   * 
   * @param entity  (required)
   * @param entityId  (required)
   * @param file  (optional)
   * @param contentLength  (optional)
   * @return Call&lt;String&gt;
   */
  @retrofit2.http.Multipart
  @PUT("{entity}/{entityId}/images")
  Call<String> updateClientImage1(
            @retrofit2.http.Path("entity") String entity            ,         @retrofit2.http.Path("entityId") Long entityId            ,                     @retrofit2.http.Part("file") FormDataBodyPart file,             @retrofit2.http.Header("Content-Length") Long contentLength        
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
  @PUT("email/configuration")
  Call<String> updateConfiguration(
                    @retrofit2.http.Body String body    
  );

  /**
   * 
   * 
   * @param body  (optional)
   * @return Call&lt;String&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @POST("twofactor/invalidate")
  Call<String> updateConfiguration2(
                    @retrofit2.http.Body String body    
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
  @PUT("twofactor/configure")
  Call<String> updateConfiguration3(
                    @retrofit2.http.Body String body    
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
  @PUT("CreditBureauConfiguration/organisationCreditBureau")
  Call<String> updateCreditBureau(
                    @retrofit2.http.Body String body    
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
  @PUT("CreditBureauConfiguration/mappings")
  Call<String> updateCreditBureauLoanProductMapping(
                    @retrofit2.http.Body String body    
  );

  /**
   * 
   * 
   * @param id  (required)
   * @param body  (optional)
   * @return Call&lt;String&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("self/device/registration/{id}")
  Call<String> updateDeviceRegistration(
            @retrofit2.http.Path("id") Long id            ,                 @retrofit2.http.Body String body    
  );

  /**
   * 
   * 
   * @param loanId  (required)
   * @param disbursementId  (required)
   * @param body  (optional)
   * @return Call&lt;String&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("loans/{loanId}/disbursements/{disbursementId}")
  Call<String> updateDisbursementDate(
            @retrofit2.http.Path("loanId") Long loanId            ,         @retrofit2.http.Path("disbursementId") Long disbursementId            ,                 @retrofit2.http.Body String body    
  );

  /**
   * Update a Fund
   * Updates the details of a fund.
   * @param body  (required)
   * @param fundId fundId (required)
   * @return Call&lt;PutFundsFundIdResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("funds/{fundId}")
  Call<PutFundsFundIdResponse> updateFund(
                    @retrofit2.http.Body PutFundsFundIdRequest body    ,         @retrofit2.http.Path("fundId") Long fundId            
  );

  /**
   * 
   * 
   * @param loanId  (required)
   * @param guarantorId  (required)
   * @param body  (optional)
   * @return Call&lt;String&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("loans/{loanId}/guarantors/{guarantorId}")
  Call<String> updateGuarantor(
            @retrofit2.http.Path("loanId") Long loanId            ,         @retrofit2.http.Path("guarantorId") Long guarantorId            ,                 @retrofit2.http.Body String body    
  );

  /**
   * 
   * 
   * @param scheduleId  (required)
   * @param body  (optional)
   * @param command  (optional)
   * @return Call&lt;String&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("rescheduleloans/{scheduleId}")
  Call<String> updateLoanRescheduleRequest(
            @retrofit2.http.Path("scheduleId") Long scheduleId            ,                 @retrofit2.http.Body String body    ,     @retrofit2.http.Query("command") String command                
  );

  /**
   * 
   * 
   * @param mapId  (required)
   * @param body  (optional)
   * @return Call&lt;String&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("entitytoentitymapping/{mapId}")
  Call<String> updateMap(
            @retrofit2.http.Path("mapId") Long mapId            ,                 @retrofit2.http.Body String body    
  );

  /**
   * 
   * 
   * @param entityType  (required)
   * @param entityId  (required)
   * @param meetingId  (required)
   * @param body  (optional)
   * @return Call&lt;String&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("{entityType}/{entityId}/meetings/{meetingId}")
  Call<String> updateMeeting(
            @retrofit2.http.Path("entityType") String entityType            ,         @retrofit2.http.Path("entityId") Long entityId            ,         @retrofit2.http.Path("meetingId") Long meetingId            ,                 @retrofit2.http.Body String body    
  );

  /**
   * Update a Share Product
   * Updates a Share Product
   * @param body  (required)
   * @param type type (required)
   * @param productId productId (required)
   * @return Call&lt;PutProductsTypeProductIdResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("products/{type}/{productId}")
  Call<PutProductsTypeProductIdResponse> updateProduct(
                    @retrofit2.http.Body PutProductsTypeProductIdRequest body    ,         @retrofit2.http.Path("type") String type            ,         @retrofit2.http.Path("productId") Long productId            
  );

  /**
   * 
   * 
   * @param productId  (required)
   * @param body  (optional)
   * @return Call&lt;String&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("loanproducts/{productId}/productmix")
  Call<String> updateProductMix(
            @retrofit2.http.Path("productId") Long productId            ,                 @retrofit2.http.Body String body    
  );

  /**
   * 
   * 
   * @param rateId  (required)
   * @param body  (optional)
   * @return Call&lt;String&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("rates/{rateId}")
  Call<String> updateRate(
            @retrofit2.http.Path("rateId") Long rateId            ,                 @retrofit2.http.Body String body    
  );

  /**
   * 
   * 
   * @param token  (optional)
   * @return Call&lt;String&gt;
   */
  @POST("twofactor/validate")
  Call<String> validate(
        @retrofit2.http.Query("token") String token                
  );

}
