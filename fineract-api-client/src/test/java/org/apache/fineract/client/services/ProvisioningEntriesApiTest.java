package org.apache.fineract.client.services;

import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.models.LoanProductProvisioningEntryData;
import org.apache.fineract.client.models.PostProvisioningEntriesRequest;
import org.apache.fineract.client.models.PostProvisioningEntriesResponse;
import org.apache.fineract.client.models.ProvisioningEntryData;
import org.apache.fineract.client.models.PutProvisioningEntriesRequest;
import org.apache.fineract.client.models.PutProvisioningEntriesResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ProvisioningEntriesApi
 */
public class ProvisioningEntriesApiTest {

    private ProvisioningEntriesApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(ProvisioningEntriesApi.class);
    }


    /**
     * Create new Provisioning Entries
     *
     * Creates a new Provisioning Entries  Mandatory Fields date dateFormat locale Optional Fields createjournalentries
     */
    @Test
    public void createProvisioningEntriesTest() {
        PostProvisioningEntriesRequest body = null;
        // PostProvisioningEntriesResponse response = api.createProvisioningEntries(body);

        // TODO: test validations
    }

    /**
     * Recreates Provisioning Entry
     *
     * Recreates Provisioning Entry | createjournalentry.
     */
    @Test
    public void modifyProvisioningEntryTest() {
        Long entryId = null;
        PutProvisioningEntriesRequest body = null;
        String command = null;
        // PutProvisioningEntriesResponse response = api.modifyProvisioningEntry(entryId, body, command);

        // TODO: test validations
    }

    /**
     * List all Provisioning Entries
     *
     * 
     */
    @Test
    public void retrieveAllProvisioningEntriesTest() {
        Integer offset = null;
        Integer limit = null;
        // List<ProvisioningEntryData> response = api.retrieveAllProvisioningEntries(offset, limit);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void retrieveProviioningEntriesTest() {
        Long entryId = null;
        Integer offset = null;
        Integer limit = null;
        Long officeId = null;
        Long productId = null;
        Long categoryId = null;
        // LoanProductProvisioningEntryData response = api.retrieveProviioningEntries(entryId, offset, limit, officeId, productId, categoryId);

        // TODO: test validations
    }

    /**
     * Retrieves a Provisioning Entry
     *
     * Returns the details of a generated Provisioning Entry.
     */
    @Test
    public void retrieveProvisioningEntryTest() {
        Long entryId = null;
        // ProvisioningEntryData response = api.retrieveProvisioningEntry(entryId);

        // TODO: test validations
    }
}
