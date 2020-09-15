package org.apache.fineract.client.services;

import org.apache.fineract.client.ApiClient;
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
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DefaultApi
 */
public class DefaultApiTest {

    private DefaultApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(DefaultApi.class);
    }


    /**
     * 
     *
     * 
     */
    @Test
    public void accountsTemplateTest() {
        Long loanId = null;
        Long clientId = null;
        // String response = api.accountsTemplate(loanId, clientId);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void activateTest() {
        Long resourceId = null;
        String body = null;
        String command = null;
        // String response = api.activate(resourceId, body, command);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void addAndDeleteDisbursementDetailTest() {
        Long loanId = null;
        String body = null;
        // String response = api.addAndDeleteDisbursementDetail(loanId, body);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void addClientFamilyMembersTest() {
        Long clientId = null;
        String body = null;
        // String response = api.addClientFamilyMembers(clientId, body);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void addNewClientImage1Test() {
        String entity = null;
        Long entityId = null;
        FormDataBodyPart file = null;
        Long contentLength = null;
        // String response = api.addNewClientImage1(entity, entityId, file, contentLength);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void addOrganisationCreditBureauTest() {
        Long organisationCreditBureauId = null;
        String body = null;
        // String response = api.addOrganisationCreditBureau(organisationCreditBureauId, body);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void adjustTransactionTest() {
        Long fixedDepositAccountId = null;
        Long transactionId = null;
        String body = null;
        String command = null;
        // String response = api.adjustTransaction(fixedDepositAccountId, transactionId, body, command);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void adjustTransaction1Test() {
        Long savingsId = null;
        Long transactionId = null;
        String body = null;
        String command = null;
        // String response = api.adjustTransaction1(savingsId, transactionId, body, command);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void create1Test() {
        String body = null;
        // String response = api.create1(body);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void create2Test() {
        String body = null;
        // String response = api.create2(body);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void createCalendarTest() {
        String entityType = null;
        Long entityId = null;
        String body = null;
        // String response = api.createCalendar(entityType, entityId, body);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void createCampaignTest() {
        String body = null;
        // String response = api.createCampaign(body);

        // TODO: test validations
    }

    /**
     * Create a SMS Campaign
     *
     * Mandatory Fields campaignName, campaignType, triggerType, providerId, runReportId, message  Mandatory Fields for Cash based on selected report id paramValue in json format
     */
    @Test
    public void createCampaign1Test() {
        CommandWrapper body = null;
        // CommandProcessingResult response = api.createCampaign1(body);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void createCreditBureauLoanProductMappingTest() {
        Long creditBureauId = null;
        String body = null;
        // String response = api.createCreditBureauLoanProductMapping(creditBureauId, body);

        // TODO: test validations
    }

    /**
     * Create an entry in the survey table
     *
     * Insert and entry in a survey table (full fill the survey).  Refer Link for sample Body:  [ https://demo.fineract.dev/fineract-provider/api-docs/apiLive.htm#survey_create ] 
     */
    @Test
    public void createDatatableEntry1Test() {
        PostSurveySurveyNameApptableIdRequest body = null;
        String surveyName = null;
        Long apptableId = null;
        // PostSurveySurveyNameApptableIdResponse response = api.createDatatableEntry1(body, surveyName, apptableId);

        // TODO: test validations
    }

    /**
     * Create a Fund
     *
     * Creates a Fund
     */
    @Test
    public void createFundTest() {
        PostFundsRequest body = null;
        // PostFundsResponse response = api.createFund(body);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void createGuarantorTest() {
        Long loanId = null;
        String body = null;
        // String response = api.createGuarantor(loanId, body);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void createLoanRescheduleRequestTest() {
        String body = null;
        // String response = api.createLoanRescheduleRequest(body);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void createMapTest() {
        Long relId = null;
        String body = null;
        // String response = api.createMap(relId, body);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void createMeetingTest() {
        String entityType = null;
        Long entityId = null;
        String body = null;
        // String response = api.createMeeting(entityType, entityId, body);

        // TODO: test validations
    }

    /**
     * Create a Share Product
     *
     * Creates a Share Product  Mandatory Fields: name, shortName, description, currencyCode, digitsAfterDecimal,inMultiplesOf, locale, totalShares, unitPrice, nominalShares,allowDividendCalculationForInactiveClients,accountingRule  Mandatory Fields for Cash based accounting (accountingRule &#x3D; 2): shareReferenceId, shareSuspenseId, shareEquityId, incomeFromFeeAccountId  Optional Fields: sharesIssued, minimumShares, maximumShares, minimumActivePeriodForDividends, minimumactiveperiodFrequencyType, lockinPeriodFrequency, lockinPeriodFrequencyType, marketPricePeriods, chargesSelected
     */
    @Test
    public void createProductTest() {
        PostProductsTypeRequest body = null;
        String type = null;
        // PostProductsTypeResponse response = api.createProduct(body, type);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void createProductMixTest() {
        Long productId = null;
        String body = null;
        // String response = api.createProductMix(productId, body);

        // TODO: test validations
    }

    /**
     * Calculate Interoperation Quote
     *
     * 
     */
    @Test
    public void createQuoteTest() {
        InteropQuoteRequestData body = null;
        // InteropQuoteResponseData response = api.createQuote(body);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void createRateTest() {
        String body = null;
        // String response = api.createRate(body);

        // TODO: test validations
    }

    /**
     * Allow Interoperation Transaction Request
     *
     * 
     */
    @Test
    public void createTransactionRequestTest() {
        InteropTransactionRequestData body = null;
        // InteropTransactionRequestResponseData response = api.createTransactionRequest(body);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void delete1Test() {
        Long resourceId = null;
        // String response = api.delete1(resourceId);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void delete2Test() {
        Long resourceId = null;
        // String response = api.delete2(resourceId);

        // TODO: test validations
    }

    /**
     * Delete a SMS Campaign
     *
     * Note: Only closed SMS Campaigns can be deleted
     */
    @Test
    public void delete3Test() {
        Long campaignId = null;
        // CommandProcessingResult response = api.delete3(campaignId);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void delete4Test() {
        Long mapId = null;
        // String response = api.delete4(mapId);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void delete5Test() {
        Long id = null;
        // String response = api.delete5(id);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void delete6Test() {
        Long resourceId = null;
        // String response = api.delete6(resourceId);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void delete8Test() {
        Long transactionId = null;
        // String response = api.delete8(transactionId);

        // TODO: test validations
    }

    /**
     * Allow Interoperation Identifier registration
     *
     * 
     */
    @Test
    public void deleteAccountIdentifierTest() {
        InteropIdentifierRequestData body = null;
        String idType = null;
        String idValue = null;
        // InteropIdentifierAccountResponseData response = api.deleteAccountIdentifier(body, idType, idValue);

        // TODO: test validations
    }

    /**
     * Allow Interoperation Identifier registration
     *
     * 
     */
    @Test
    public void deleteAccountIdentifier1Test() {
        InteropIdentifierRequestData body = null;
        String idType = null;
        String idValue = null;
        String subIdOrType = null;
        // InteropIdentifierAccountResponseData response = api.deleteAccountIdentifier1(body, idType, idValue, subIdOrType);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void deleteCalendarTest() {
        String entityType = null;
        Long entityId = null;
        Long calendarId = null;
        // String response = api.deleteCalendar(entityType, entityId, calendarId);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void deleteClientFamilyMembersTest() {
        Long familyMemberId = null;
        Long clientId = null;
        String body = null;
        // String response = api.deleteClientFamilyMembers(familyMemberId, clientId, body);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void deleteClientImageTest() {
        String entity = null;
        Long entityId = null;
        // String response = api.deleteClientImage(entity, entityId);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void deleteDatatableEntries2Test() {
        String surveyName = null;
        Long clientId = null;
        Long fulfilledId = null;
        // String response = api.deleteDatatableEntries2(surveyName, clientId, fulfilledId);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void deleteGuarantorTest() {
        Long loanId = null;
        Long guarantorId = null;
        Long guarantorFundingId = null;
        // String response = api.deleteGuarantor(loanId, guarantorId, guarantorFundingId);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void deleteMeetingTest() {
        String entityType = null;
        Long entityId = null;
        Long meetingId = null;
        // String response = api.deleteMeeting(entityType, entityId, meetingId);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void deleteProductMixTest() {
        Long productId = null;
        // String response = api.deleteProductMix(productId);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void downloadClientImageTest() {
        String entity = null;
        Long entityId = null;
        Integer maxWidth = null;
        Integer maxHeight = null;
        String output = null;
        // Void response = api.downloadClientImage(entity, entityId, maxWidth, maxHeight, output);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void fetchLoanProductsTest() {
        // String response = api.fetchLoanProducts();

        // TODO: test validations
    }

    /**
     * Generate Individual Collection Sheet | Save Collection Sheet
     *
     * Generate Individual Collection Sheet:  This Api retrieves repayment details of all individual loans under a office as on a specified meeting date.  Save Collection Sheet:  This Api allows the loan officer to perform bulk repayments of individual loans and deposit of mandatory savings on a given meeting date.
     */
    @Test
    public void generateCollectionSheetTest() {
        PostCollectionSheetRequest body = null;
        String command = null;
        // PostCollectionSheetResponse response = api.generateCollectionSheet(body, command);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void getTest() {
        // String response = api.get();

        // TODO: test validations
    }

    /**
     * Query Interoperation Account by secondary identifier
     *
     * 
     */
    @Test
    public void getAccountByIdentifierTest() {
        String idType = null;
        String idValue = null;
        // InteropIdentifierAccountResponseData response = api.getAccountByIdentifier(idType, idValue);

        // TODO: test validations
    }

    /**
     * Query Interoperation Account by secondary identifier
     *
     * 
     */
    @Test
    public void getAccountByIdentifier1Test() {
        String idType = null;
        String idValue = null;
        String subIdOrType = null;
        // InteropIdentifierAccountResponseData response = api.getAccountByIdentifier1(idType, idValue, subIdOrType);

        // TODO: test validations
    }

    /**
     * Query Interoperation Account details
     *
     * 
     */
    @Test
    public void getAccountDetailsTest() {
        String accountId = null;
        // InteropAccountData response = api.getAccountDetails(accountId);

        // TODO: test validations
    }

    /**
     * Query Interoperation secondary identifiers by Account Id
     *
     * 
     */
    @Test
    public void getAccountIdentifiersTest() {
        String accountId = null;
        // InteropIdentifiersResponseData response = api.getAccountIdentifiers(accountId);

        // TODO: test validations
    }

    /**
     * Query transactions by Account Id
     *
     * 
     */
    @Test
    public void getAccountTransactionsTest() {
        String accountId = null;
        Boolean debit = null;
        Boolean credit = null;
        String fromBookingDateTime = null;
        String toBookingDateTime = null;
        // InteropTransactionsData response = api.getAccountTransactions(accountId, debit, credit, fromBookingDateTime, toBookingDateTime);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void getAllRatesTest() {
        // String response = api.getAllRates();

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void getClientSurveyOverviewTest() {
        String surveyName = null;
        Long clientId = null;
        // String response = api.getClientSurveyOverview(surveyName, clientId);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void getConfigurationTest() {
        Long organisationCreditBureauId = null;
        // String response = api.getConfiguration(organisationCreditBureauId);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void getCreditBureauTest() {
        // String response = api.getCreditBureau();

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void getCreditBureauLoanProductMappingTest() {
        // String response = api.getCreditBureauLoanProductMapping();

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void getEntityToEntityMappingsTest() {
        Long mapId = null;
        Long fromId = null;
        Long toId = null;
        // String response = api.getEntityToEntityMappings(mapId, fromId, toId);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void getFamilyMemberTest() {
        Long familyMemberId = null;
        Long clientId = null;
        // String response = api.getFamilyMember(familyMemberId, clientId);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void getFamilyMembersTest() {
        Long clientId = null;
        // String response = api.getFamilyMembers(clientId);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void getGuarantorTemplateTest() {
        Long loanId = null;
        Long officeId = null;
        String dateFormat = null;
        // Void response = api.getGuarantorTemplate(loanId, officeId, dateFormat);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void getOTPDeliveryMethodsTest() {
        // String response = api.getOTPDeliveryMethods();

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void getOrganisationCreditBureauTest() {
        // String response = api.getOrganisationCreditBureau();

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void getOutputTemplateTest() {
        String importDocumentId = null;
        // Void response = api.getOutputTemplate(importDocumentId);

        // TODO: test validations
    }

    /**
     * Query Interoperation Quote
     *
     * 
     */
    @Test
    public void getQuoteTest() {
        String transactionCode = null;
        String quoteCode = null;
        // InteropQuoteResponseData response = api.getQuote(transactionCode, quoteCode);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void getSurveyEntryTest() {
        String surveyName = null;
        Long clientId = null;
        Long entryId = null;
        // String response = api.getSurveyEntry(surveyName, clientId, entryId);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void getTemplate1Test() {
        Long clientId = null;
        // String response = api.getTemplate1(clientId);

        // TODO: test validations
    }

    /**
     * Query Interoperation Transaction Request
     *
     * 
     */
    @Test
    public void getTransactionRequestTest() {
        String transactionCode = null;
        String requestCode = null;
        // InteropTransactionRequestResponseData response = api.getTransactionRequest(transactionCode, requestCode);

        // TODO: test validations
    }

    /**
     * Query Interoperation Transfer
     *
     * 
     */
    @Test
    public void getTransferTest() {
        String transactionCode = null;
        String transferCode = null;
        // InteropTransferResponseData response = api.getTransfer(transactionCode, transferCode);

        // TODO: test validations
    }

    /**
     * SMS Campaign
     *
     * Activates | Deactivates | Reactivates
     */
    @Test
    public void handleCommandsTest() {
        Long campaignId = null;
        String command = null;
        // CommandProcessingResult response = api.handleCommands(campaignId, command);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void handleCommands3Test() {
        String type = null;
        Long productId = null;
        String command = null;
        // String response = api.handleCommands3(type, productId, command);

        // TODO: test validations
    }

    /**
     * Query Interoperation Health Request
     *
     * 
     */
    @Test
    public void healthTest() {
        // Void response = api.health();

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void loanReassignmentTest() {
        String body = null;
        // String response = api.loanReassignment(body);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void loanReassignmentTemplateTest() {
        Long officeId = null;
        Long fromLoanOfficerId = null;
        // String response = api.loanReassignmentTemplate(officeId, fromLoanOfficerId);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void newGuarantorTemplateTest() {
        Long loanId = null;
        // String response = api.newGuarantorTemplate(loanId);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void newOfficeTransactionDetailsTest() {
        // String response = api.newOfficeTransactionDetails();

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void performMeetingCommandsTest() {
        String entityType = null;
        Long entityId = null;
        Long meetingId = null;
        String body = null;
        String command = null;
        // String response = api.performMeetingCommands(entityType, entityId, meetingId, body, command);

        // TODO: test validations
    }

    /**
     * Prepare Interoperation Transfer
     *
     * 
     */
    @Test
    public void performTransferTest() {
        InteropTransferRequestData body = null;
        String action = null;
        // InteropTransferResponseData response = api.performTransfer(body, action);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void postGuarantorTemplateTest() {
        Long loanId = null;
        FormDataContentDisposition file = null;
        String locale = null;
        String dateFormat = null;
        // String response = api.postGuarantorTemplate(loanId, file, locale, dateFormat);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void previewTest() {
        String body = null;
        // String response = api.preview(body);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void preview1Test() {
        String body = null;
        // String response = api.preview1(body);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void readLoanRescheduleRequestTest() {
        Long scheduleId = null;
        String command = null;
        // String response = api.readLoanRescheduleRequest(scheduleId, command);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void registerTest() {
        String surveyName = null;
        String apptable = null;
        String body = null;
        // String response = api.register(surveyName, apptable, body);

        // TODO: test validations
    }

    /**
     * Interoperation Identifier registration
     *
     * 
     */
    @Test
    public void registerAccountIdentifierTest() {
        InteropIdentifierRequestData body = null;
        String idType = null;
        String idValue = null;
        String subIdOrType = null;
        // InteropIdentifierAccountResponseData response = api.registerAccountIdentifier(body, idType, idValue, subIdOrType);

        // TODO: test validations
    }

    /**
     * Interoperation Identifier registration
     *
     * 
     */
    @Test
    public void registerAccountIdentifier1Test() {
        InteropIdentifierRequestData body = null;
        String idType = null;
        String idValue = null;
        // InteropIdentifierAccountResponseData response = api.registerAccountIdentifier1(body, idType, idValue);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void registerDeviceTest() {
        String body = null;
        // String response = api.registerDevice(body);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void requestTokenTest() {
        String deliveryMethod = null;
        Boolean extendedToken = null;
        // String response = api.requestToken(deliveryMethod, extendedToken);

        // TODO: test validations
    }

    /**
     * Retrieve a Fund
     *
     * Returns the details of a Fund.  Example Requests:  funds/1
     */
    @Test
    public void retreiveFundTest() {
        Long fundId = null;
        // GetFundsResponse response = api.retreiveFund(fundId);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void retrieveTest() {
        Long likelihoodId = null;
        String ppiName = null;
        // String response = api.retrieve(likelihoodId, ppiName);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void retrieveAll10Test() {
        // String response = api.retrieveAll10();

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void retrieveAll11Test() {
        String ppiName = null;
        // String response = api.retrieveAll11(ppiName);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void retrieveAll12Test() {
        String ppiName = null;
        // String response = api.retrieveAll12(ppiName);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void retrieveAll13Test() {
        String ppiName = null;
        Long likelihoodId = null;
        // String response = api.retrieveAll13(ppiName, likelihoodId);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void retrieveAll27Test() {
        Long savingsId = null;
        Long guarantorFundingId = null;
        Integer offset = null;
        Integer limit = null;
        String orderBy = null;
        String sortOrder = null;
        // String response = api.retrieveAll27(savingsId, guarantorFundingId, offset, limit, orderBy, sortOrder);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void retrieveAll37Test() {
        Long clientId = null;
        // String response = api.retrieveAll37(clientId);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void retrieveAll5Test() {
        // String response = api.retrieveAll5();

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void retrieveAll7Test() {
        // String response = api.retrieveAll7();

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void retrieveAll9Test() {
        // String response = api.retrieveAll9();

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void retrieveAllCampaignTest() {
        // String response = api.retrieveAllCampaign();

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void retrieveAllDeviceRegistrationsTest() {
        // String response = api.retrieveAllDeviceRegistrations();

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void retrieveAllEmailByStatusTest() {
        String sqlSearch = null;
        Integer offset = null;
        Integer limit = null;
        Integer status = null;
        String orderBy = null;
        String sortOrder = null;
        DateParam fromDate = null;
        DateParam toDate = null;
        String locale = null;
        String dateFormat = null;
        // String response = api.retrieveAllEmailByStatus(sqlSearch, offset, limit, status, orderBy, sortOrder, fromDate, toDate, locale, dateFormat);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void retrieveAllEmailsTest() {
        // String response = api.retrieveAllEmails();

        // TODO: test validations
    }

    /**
     * List SMS Campaigns
     *
     * Example Requests:  smscampaigns
     */
    @Test
    public void retrieveAllEmails1Test() {
        String sqlSearch = null;
        Integer offset = null;
        Integer limit = null;
        String orderBy = null;
        String sortOrder = null;
        // SmsCampaignData response = api.retrieveAllEmails1(sqlSearch, offset, limit, orderBy, sortOrder);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void retrieveAllGroupsTest() {
        // String response = api.retrieveAllGroups();

        // TODO: test validations
    }

    /**
     * List Share Products
     *
     * Lists Share Products  Mandatory Fields: limit, offset  Example Requests:  shareproducts
     */
    @Test
    public void retrieveAllProductsTest() {
        String type = null;
        Integer offset = null;
        Integer limit = null;
        // GetProductsTypeResponse response = api.retrieveAllProducts(type, offset, limit);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void retrieveAllProducts1Test() {
        Long clientId = null;
        Integer offset = null;
        Integer limit = null;
        // String response = api.retrieveAllProducts1(clientId, offset, limit);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void retrieveAllRescheduleRequestTest() {
        String command = null;
        // String response = api.retrieveAllRescheduleRequest(command);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void retrieveAllSmsByStatusTest() {
        Long campaignId = null;
        Long status = null;
        DateParam fromDate = null;
        DateParam toDate = null;
        String locale = null;
        String dateFormat = null;
        String sqlSearch = null;
        Integer offset = null;
        Integer limit = null;
        String orderBy = null;
        String sortOrder = null;
        // String response = api.retrieveAllSmsByStatus(campaignId, status, fromDate, toDate, locale, dateFormat, sqlSearch, offset, limit, orderBy, sortOrder);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void retrieveCalendarTest() {
        Long calendarId = null;
        String entityType = null;
        Long entityId = null;
        // String response = api.retrieveCalendar(calendarId, entityType, entityId);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void retrieveCalendarsByEntityTest() {
        String entityType = null;
        Long entityId = null;
        String calendarType = null;
        // String response = api.retrieveCalendarsByEntity(entityType, entityId, calendarType);

        // TODO: test validations
    }

    /**
     * Retrieve a SMS Campaign
     *
     * Example Requests:  smscampaigns/1 
     */
    @Test
    public void retrieveCampaignTest() {
        Long resourceId = null;
        // SmsCampaignData response = api.retrieveCampaign(resourceId);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void retrieveDeviceRegiistrationTest() {
        Long id = null;
        // String response = api.retrieveDeviceRegiistration(id);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void retrieveDeviceRegistrationByClientIdTest() {
        Long clientId = null;
        // String response = api.retrieveDeviceRegistrationByClientId(clientId);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void retrieveFailedEmailTest() {
        String sqlSearch = null;
        Integer offset = null;
        Integer limit = null;
        String orderBy = null;
        String sortOrder = null;
        // String response = api.retrieveFailedEmail(sqlSearch, offset, limit, orderBy, sortOrder);

        // TODO: test validations
    }

    /**
     * Retrieve Funds
     *
     * Returns the list of funds.  Example Requests:  funds
     */
    @Test
    public void retrieveFundsTest() {
        // List<GetFundsResponse> response = api.retrieveFunds();

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void retrieveGuarantorDetailsTest() {
        Long loanId = null;
        // String response = api.retrieveGuarantorDetails(loanId);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void retrieveGuarantorDetails1Test() {
        Long loanId = null;
        Long guarantorId = null;
        // String response = api.retrieveGuarantorDetails1(loanId, guarantorId);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void retrieveImportDocumentsTest() {
        String entityType = null;
        // String response = api.retrieveImportDocuments(entityType);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void retrieveMeetingTest() {
        Long meetingId = null;
        String entityType = null;
        Long entityId = null;
        // String response = api.retrieveMeeting(meetingId, entityType, entityId);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void retrieveMeetingsTest() {
        String entityType = null;
        Long entityId = null;
        Integer limit = null;
        // String response = api.retrieveMeetings(entityType, entityId, limit);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void retrieveNewCalendarDetailsTest() {
        String entityType = null;
        Long entityId = null;
        // String response = api.retrieveNewCalendarDetails(entityType, entityId);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void retrieveOfficeTransactionsTest() {
        // String response = api.retrieveOfficeTransactions();

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void retrieveOne1Test() {
        Long resourceId = null;
        // String response = api.retrieveOne1(resourceId);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void retrieveOne16Test() {
        Long fixedDepositAccountId = null;
        Long transactionId = null;
        // String response = api.retrieveOne16(fixedDepositAccountId, transactionId);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void retrieveOne22Test() {
        Long savingsId = null;
        Long transactionId = null;
        // String response = api.retrieveOne22(savingsId, transactionId);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void retrieveOne26Test() {
        Long productId = null;
        Long clientId = null;
        // String response = api.retrieveOne26(productId, clientId);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void retrieveOne4Test() {
        Long mapId = null;
        // String response = api.retrieveOne4(mapId);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void retrieveOne6Test() {
        Long resourceId = null;
        // String response = api.retrieveOne6(resourceId);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void retrieveOneCampaignTest() {
        Long resourceId = null;
        // String response = api.retrieveOneCampaign(resourceId);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void retrieveOneTemplateTest() {
        Long resourceId = null;
        // String response = api.retrieveOneTemplate(resourceId);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void retrievePendingEmailTest() {
        String sqlSearch = null;
        Integer offset = null;
        Integer limit = null;
        String orderBy = null;
        String sortOrder = null;
        // String response = api.retrievePendingEmail(sqlSearch, offset, limit, orderBy, sortOrder);

        // TODO: test validations
    }

    /**
     * Retrieve a Share Product
     *
     * Retrieves a Share Product  Example Requests:  products/share/1   products/share/1?template&#x3D;true
     */
    @Test
    public void retrieveProductTest() {
        Long productId = null;
        String type = null;
        // GetProductsTypeProductIdResponse response = api.retrieveProduct(productId, type);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void retrieveProduct1Test() {
        Long productId = null;
        String type = null;
        Long clientId = null;
        // String response = api.retrieveProduct1(productId, type, clientId);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void retrieveRateTest() {
        Long rateId = null;
        // String response = api.retrieveRate(rateId);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void retrieveSentEmailTest() {
        String sqlSearch = null;
        Integer offset = null;
        Integer limit = null;
        String orderBy = null;
        String sortOrder = null;
        // String response = api.retrieveSentEmail(sqlSearch, offset, limit, orderBy, sortOrder);

        // TODO: test validations
    }

    /**
     * Retrieve survey
     *
     * Lists a registered survey table details and the Apache Fineract Core application table they are registered to.
     */
    @Test
    public void retrieveSurveyTest() {
        String surveyName = null;
        // GetSurveyResponse response = api.retrieveSurvey(surveyName);

        // TODO: test validations
    }

    /**
     * Retrieve surveys
     *
     * Retrieve surveys. This allows to retrieve the list of survey tables registered .
     */
    @Test
    public void retrieveSurveysTest() {
        // List<GetSurveyResponse> response = api.retrieveSurveys();

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void retrieveTemplate11Test() {
        Long productId = null;
        // String response = api.retrieveTemplate11(productId);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void retrieveTemplate12Test() {
        String type = null;
        // String response = api.retrieveTemplate12(type);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void retrieveTemplate13Test() {
        Long fixedDepositAccountId = null;
        // String response = api.retrieveTemplate13(fixedDepositAccountId);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void retrieveTemplate18Test() {
        Long savingsId = null;
        // String response = api.retrieveTemplate18(savingsId);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void retrieveTemplate9Test() {
        // String response = api.retrieveTemplate9();

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void retriveDetailTest() {
        Long loanId = null;
        Long disbursementId = null;
        // String response = api.retriveDetail(loanId, disbursementId);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void retriveOutputTemplateLocationTest() {
        String importDocumentId = null;
        // String response = api.retriveOutputTemplateLocation(importDocumentId);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void template1Test() {
        // String response = api.template1();

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void template11Test() {
        String entityType = null;
        Long entityId = null;
        Long calendarId = null;
        // String response = api.template11(entityType, entityId, calendarId);

        // TODO: test validations
    }

    /**
     * Retrieve a SMS Campaign
     *
     * Example Requests:  smscampaigns/1   smscampaigns/1?template&#x3D;true   smscampaigns/template
     */
    @Test
    public void template2Test() {
        // SmsCampaignData response = api.template2();

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void transactionTest() {
        Long fixedDepositAccountId = null;
        String body = null;
        String command = null;
        // String response = api.transaction(fixedDepositAccountId, body, command);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void transaction2Test() {
        Long savingsId = null;
        String body = null;
        String command = null;
        // String response = api.transaction2(savingsId, body, command);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void transferMoneyFromTest() {
        String body = null;
        // String response = api.transferMoneyFrom(body);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void update2Test() {
        Long resourceId = null;
        String body = null;
        // String response = api.update2(resourceId, body);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void update3Test() {
        Long resourceId = null;
        String body = null;
        // String response = api.update3(resourceId, body);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void update4Test() {
        Long likelihoodId = null;
        String ppiName = null;
        String body = null;
        // String response = api.update4(likelihoodId, ppiName, body);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void updateCalendarTest() {
        String entityType = null;
        Long entityId = null;
        Long calendarId = null;
        String body = null;
        // String response = api.updateCalendar(entityType, entityId, calendarId, body);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void updateCampaignTest() {
        Long resourceId = null;
        String body = null;
        // String response = api.updateCampaign(resourceId, body);

        // TODO: test validations
    }

    /**
     * Update a Campaign
     *
     * 
     */
    @Test
    public void updateCampaign1Test() {
        CommandWrapper body = null;
        Long campaignId = null;
        // CommandProcessingResult response = api.updateCampaign1(body, campaignId);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void updateClientFamilyMembersTest() {
        Long familyMemberId = null;
        Long clientId = null;
        String body = null;
        // String response = api.updateClientFamilyMembers(familyMemberId, clientId, body);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void updateClientImage1Test() {
        String entity = null;
        Long entityId = null;
        FormDataBodyPart file = null;
        Long contentLength = null;
        // String response = api.updateClientImage1(entity, entityId, file, contentLength);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void updateConfigurationTest() {
        String body = null;
        // String response = api.updateConfiguration(body);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void updateConfiguration2Test() {
        String body = null;
        // String response = api.updateConfiguration2(body);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void updateConfiguration3Test() {
        String body = null;
        // String response = api.updateConfiguration3(body);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void updateCreditBureauTest() {
        String body = null;
        // String response = api.updateCreditBureau(body);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void updateCreditBureauLoanProductMappingTest() {
        String body = null;
        // String response = api.updateCreditBureauLoanProductMapping(body);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void updateDeviceRegistrationTest() {
        Long id = null;
        String body = null;
        // String response = api.updateDeviceRegistration(id, body);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void updateDisbursementDateTest() {
        Long loanId = null;
        Long disbursementId = null;
        String body = null;
        // String response = api.updateDisbursementDate(loanId, disbursementId, body);

        // TODO: test validations
    }

    /**
     * Update a Fund
     *
     * Updates the details of a fund.
     */
    @Test
    public void updateFundTest() {
        PutFundsFundIdRequest body = null;
        Long fundId = null;
        // PutFundsFundIdResponse response = api.updateFund(body, fundId);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void updateGuarantorTest() {
        Long loanId = null;
        Long guarantorId = null;
        String body = null;
        // String response = api.updateGuarantor(loanId, guarantorId, body);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void updateLoanRescheduleRequestTest() {
        Long scheduleId = null;
        String body = null;
        String command = null;
        // String response = api.updateLoanRescheduleRequest(scheduleId, body, command);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void updateMapTest() {
        Long mapId = null;
        String body = null;
        // String response = api.updateMap(mapId, body);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void updateMeetingTest() {
        String entityType = null;
        Long entityId = null;
        Long meetingId = null;
        String body = null;
        // String response = api.updateMeeting(entityType, entityId, meetingId, body);

        // TODO: test validations
    }

    /**
     * Update a Share Product
     *
     * Updates a Share Product
     */
    @Test
    public void updateProductTest() {
        PutProductsTypeProductIdRequest body = null;
        String type = null;
        Long productId = null;
        // PutProductsTypeProductIdResponse response = api.updateProduct(body, type, productId);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void updateProductMixTest() {
        Long productId = null;
        String body = null;
        // String response = api.updateProductMix(productId, body);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void updateRateTest() {
        Long rateId = null;
        String body = null;
        // String response = api.updateRate(rateId, body);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void validateTest() {
        String token = null;
        // String response = api.validate(token);

        // TODO: test validations
    }
}
