package org.apache.fineract.client.services;

import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.models.DateParam;
import org.apache.fineract.client.models.FormDataContentDisposition;
import org.apache.fineract.client.models.JournalEntryCommand;
import org.apache.fineract.client.models.JournalEntryData;
import org.apache.fineract.client.models.PostJournalEntriesResponse;
import org.apache.fineract.client.models.PostJournalEntriesTransactionIdRequest;
import org.apache.fineract.client.models.PostJournalEntriesTransactionIdResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for JournalEntriesApi
 */
public class JournalEntriesApiTest {

    private JournalEntriesApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(JournalEntriesApi.class);
    }


    /**
     * Create \&quot;Balanced\&quot; Journal Entries
     *
     * Note: A Balanced (simple) Journal entry would have atleast one \&quot;Debit\&quot; and one \&quot;Credit\&quot; entry whose amounts are equal  Compound Journal entries may have \&quot;n\&quot; debits and \&quot;m\&quot; credits where both \&quot;m\&quot; and \&quot;n\&quot; are greater than 0 and the net sum or all debits and credits are equal    Mandatory Fields officeId, transactionDate   credits- glAccountId, amount, comments    debits-  glAccountId, amount, comments    Optional Fields paymentTypeId, accountNumber, checkNumber, routingCode, receiptNumber, bankNumber
     */
    @Test
    public void createGLJournalEntryTest() {
        JournalEntryCommand body = null;
        String command = null;
        // PostJournalEntriesResponse response = api.createGLJournalEntry(body, command);

        // TODO: test validations
    }

    /**
     * Update Running balances for Journal Entries
     *
     * This API calculates the running balances for office. If office ID not provided this API calculates running balances for all offices.  Mandatory Fields officeId
     */
    @Test
    public void createReversalJournalEntryTest() {
        String transactionId = null;
        PostJournalEntriesTransactionIdRequest body = null;
        String command = null;
        // PostJournalEntriesTransactionIdResponse response = api.createReversalJournalEntry(transactionId, body, command);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void getJournalEntriesTemplateTest() {
        Long officeId = null;
        String dateFormat = null;
        // Void response = api.getJournalEntriesTemplate(officeId, dateFormat);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void postJournalEntriesTemplateTest() {
        FormDataContentDisposition file = null;
        String locale = null;
        String dateFormat = null;
        // String response = api.postJournalEntriesTemplate(file, locale, dateFormat);

        // TODO: test validations
    }

    /**
     * Retrieve a single Entry
     *
     * Example Requests:  journalentries/1    journalentries/1?fields&#x3D;officeName,glAccountId,entryType,amount  journalentries/1?runningBalance&#x3D;true  journalentries/1?transactionDetails&#x3D;true
     */
    @Test
    public void retreiveJournalEntryByIdTest() {
        Long journalEntryId = null;
        Boolean runningBalance = null;
        Boolean transactionDetails = null;
        // JournalEntryData response = api.retreiveJournalEntryById(journalEntryId, runningBalance, transactionDetails);

        // TODO: test validations
    }

    /**
     * List Journal Entries
     *
     * The list capability of journal entries can support pagination and sorting.  Example Requests:  journalentries  journalentries?transactionId&#x3D;PB37X8Y21EQUY4S  journalentries?officeId&#x3D;1&amp;manualEntriesOnly&#x3D;true&amp;fromDate&#x3D;1 July 2013&amp;toDate&#x3D;15 July 2013&amp;dateFormat&#x3D;dd MMMM yyyy&amp;locale&#x3D;en  journalentries?fields&#x3D;officeName,glAccountName,transactionDate  journalentries?offset&#x3D;10&amp;limit&#x3D;50  journalentries?orderBy&#x3D;transactionId&amp;sortOrder&#x3D;DESC  journalentries?runningBalance&#x3D;true  journalentries?transactionDetails&#x3D;true  journalentries?loanId&#x3D;12  journalentries?savingsId&#x3D;24
     */
    @Test
    public void retrieveAll1Test() {
        Long officeId = null;
        Long glAccountId = null;
        Boolean manualEntriesOnly = null;
        DateParam fromDate = null;
        DateParam toDate = null;
        String transactionId = null;
        Integer entityType = null;
        Integer offset = null;
        Integer limit = null;
        String orderBy = null;
        String sortOrder = null;
        String locale = null;
        String dateFormat = null;
        Long loanId = null;
        Long savingsId = null;
        Boolean runningBalance = null;
        Boolean transactionDetails = null;
        // List<JournalEntryData> response = api.retrieveAll1(officeId, glAccountId, manualEntriesOnly, fromDate, toDate, transactionId, entityType, offset, limit, orderBy, sortOrder, locale, dateFormat, loanId, savingsId, runningBalance, transactionDetails);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void retrieveJournalEntriesTest() {
        Integer offset = null;
        Integer limit = null;
        Long entryId = null;
        // String response = api.retrieveJournalEntries(offset, limit, entryId);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void retrieveOpeningBalanceTest() {
        Long officeId = null;
        String currencyCode = null;
        // String response = api.retrieveOpeningBalance(officeId, currencyCode);

        // TODO: test validations
    }
}
