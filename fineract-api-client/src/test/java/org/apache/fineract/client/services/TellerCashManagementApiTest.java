package org.apache.fineract.client.services;

import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.models.DeleteTellersTellerIdCashiersCashierIdResponse;
import org.apache.fineract.client.models.GetTellersResponse;
import org.apache.fineract.client.models.GetTellersTellerIdCashiersCashierIdResponse;
import org.apache.fineract.client.models.GetTellersTellerIdCashiersCashiersIdSummaryAndTransactionsResponse;
import org.apache.fineract.client.models.GetTellersTellerIdCashiersCashiersIdTransactionsResponse;
import org.apache.fineract.client.models.GetTellersTellerIdCashiersCashiersIdTransactionsTemplateResponse;
import org.apache.fineract.client.models.GetTellersTellerIdCashiersResponse;
import org.apache.fineract.client.models.GetTellersTellerIdCashiersTemplateResponse;
import org.apache.fineract.client.models.PostTellersRequest;
import org.apache.fineract.client.models.PostTellersResponse;
import org.apache.fineract.client.models.PostTellersTellerIdCashiersCashierIdAllocateRequest;
import org.apache.fineract.client.models.PostTellersTellerIdCashiersCashierIdAllocateResponse;
import org.apache.fineract.client.models.PostTellersTellerIdCashiersCashierIdSettleRequest;
import org.apache.fineract.client.models.PostTellersTellerIdCashiersCashierIdSettleResponse;
import org.apache.fineract.client.models.PostTellersTellerIdCashiersRequest;
import org.apache.fineract.client.models.PostTellersTellerIdCashiersResponse;
import org.apache.fineract.client.models.PutTellersRequest;
import org.apache.fineract.client.models.PutTellersResponse;
import org.apache.fineract.client.models.PutTellersTellerIdCashiersCashierIdRequest;
import org.apache.fineract.client.models.PutTellersTellerIdCashiersCashierIdResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TellerCashManagementApi
 */
public class TellerCashManagementApiTest {

    private TellerCashManagementApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(TellerCashManagementApi.class);
    }


    /**
     * Allocate Cash To Cashier
     *
     * Mandatory Fields:  Date, Amount, Currency, Notes/Comments
     */
    @Test
    public void allocateCashToCashierTest() {
        PostTellersTellerIdCashiersCashierIdAllocateRequest body = null;
        Long tellerId = null;
        Long cashierId = null;
        // PostTellersTellerIdCashiersCashierIdAllocateResponse response = api.allocateCashToCashier(body, tellerId, cashierId);

        // TODO: test validations
    }

    /**
     * Create Cashiers
     *
     * Mandatory Fields:  Cashier/staff, Fromm Date, To Date, Full Day or From time and To time    Optional Fields:  Description/Notes
     */
    @Test
    public void createCashierTest() {
        PostTellersTellerIdCashiersRequest body = null;
        Long tellerId = null;
        // PostTellersTellerIdCashiersResponse response = api.createCashier(body, tellerId);

        // TODO: test validations
    }

    /**
     * Create teller
     *
     * Mandatory Fields Teller name, OfficeId, Description, Start Date, Status Optional Fields End Date
     */
    @Test
    public void createTellerTest() {
        PostTellersRequest body = null;
        // PostTellersResponse response = api.createTeller(body);

        // TODO: test validations
    }

    /**
     * Delete Cashier
     *
     * 
     */
    @Test
    public void deleteCashierTest() {
        Long tellerId = null;
        Long cashierId = null;
        // DeleteTellersTellerIdCashiersCashierIdResponse response = api.deleteCashier(tellerId, cashierId);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void deleteTellerTest() {
        Long tellerId = null;
        // String response = api.deleteTeller(tellerId);

        // TODO: test validations
    }

    /**
     * Retrieve a cashier
     *
     * 
     */
    @Test
    public void findCashierDataTest() {
        Long tellerId = null;
        Long cashierId = null;
        // GetTellersTellerIdCashiersCashierIdResponse response = api.findCashierData(tellerId, cashierId);

        // TODO: test validations
    }

    /**
     * Retrieve tellers
     *
     * 
     */
    @Test
    public void findTellerTest() {
        Long tellerId = null;
        // GetTellersResponse response = api.findTeller(tellerId);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void findTransactionDataTest() {
        Long tellerId = null;
        Long transactionId = null;
        // String response = api.findTransactionData(tellerId, transactionId);

        // TODO: test validations
    }

    /**
     * List Cashiers
     *
     * 
     */
    @Test
    public void getCashierData1Test() {
        Long tellerId = null;
        String fromdate = null;
        String todate = null;
        // GetTellersTellerIdCashiersResponse response = api.getCashierData1(tellerId, fromdate, todate);

        // TODO: test validations
    }

    /**
     * Find Cashiers
     *
     * 
     */
    @Test
    public void getCashierTemplateTest() {
        Long tellerId = null;
        // GetTellersTellerIdCashiersTemplateResponse response = api.getCashierTemplate(tellerId);

        // TODO: test validations
    }

    /**
     * Retrieve Cashier Transaction Template
     *
     * 
     */
    @Test
    public void getCashierTxnTemplateTest() {
        Long tellerId = null;
        Long cashierId = null;
        // GetTellersTellerIdCashiersCashiersIdTransactionsTemplateResponse response = api.getCashierTxnTemplate(tellerId, cashierId);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void getJournalDataTest() {
        Long tellerId = null;
        Long cashierId = null;
        String dateRange = null;
        // String response = api.getJournalData(tellerId, cashierId, dateRange);

        // TODO: test validations
    }

    /**
     * List all tellers
     *
     * Retrieves list tellers
     */
    @Test
    public void getTellerDataTest() {
        Long officeId = null;
        // List<GetTellersResponse> response = api.getTellerData(officeId);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void getTransactionDataTest() {
        Long tellerId = null;
        String dateRange = null;
        // String response = api.getTransactionData(tellerId, dateRange);

        // TODO: test validations
    }

    /**
     * Retrieve Cashier Transaction
     *
     * 
     */
    @Test
    public void getTransactionsForCashierTest() {
        Long tellerId = null;
        Long cashierId = null;
        String currencyCode = null;
        Integer offset = null;
        Integer limit = null;
        String orderBy = null;
        String sortOrder = null;
        // List<GetTellersTellerIdCashiersCashiersIdTransactionsResponse> response = api.getTransactionsForCashier(tellerId, cashierId, currencyCode, offset, limit, orderBy, sortOrder);

        // TODO: test validations
    }

    /**
     * Transactions Wtih Summary For Cashier
     *
     * 
     */
    @Test
    public void getTransactionsWtihSummaryForCashierTest() {
        Long tellerId = null;
        Long cashierId = null;
        String currencyCode = null;
        Integer offset = null;
        Integer limit = null;
        String orderBy = null;
        String sortOrder = null;
        // GetTellersTellerIdCashiersCashiersIdSummaryAndTransactionsResponse response = api.getTransactionsWtihSummaryForCashier(tellerId, cashierId, currencyCode, offset, limit, orderBy, sortOrder);

        // TODO: test validations
    }

    /**
     * Settle Cash From Cashier
     *
     * Mandatory Fields Date, Amount, Currency, Notes/Comments
     */
    @Test
    public void settleCashFromCashierTest() {
        PostTellersTellerIdCashiersCashierIdSettleRequest body = null;
        Long tellerId = null;
        Long cashierId = null;
        // PostTellersTellerIdCashiersCashierIdSettleResponse response = api.settleCashFromCashier(body, tellerId, cashierId);

        // TODO: test validations
    }

    /**
     * Update Cashier
     *
     * 
     */
    @Test
    public void updateCashierTest() {
        PutTellersTellerIdCashiersCashierIdRequest body = null;
        Long tellerId = null;
        Long cashierId = null;
        // PutTellersTellerIdCashiersCashierIdResponse response = api.updateCashier(body, tellerId, cashierId);

        // TODO: test validations
    }

    /**
     * Update teller
     *
     * 
     */
    @Test
    public void updateTellerTest() {
        PutTellersRequest body = null;
        Long tellerId = null;
        // PutTellersResponse response = api.updateTeller(body, tellerId);

        // TODO: test validations
    }
}
