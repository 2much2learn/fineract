package org.apache.fineract.client.services;

import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.models.LookupTableData;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SpmApiLookUpTableApi
 */
public class SpmApiLookUpTableApiTest {

    private SpmApiLookUpTableApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(SpmApiLookUpTableApi.class);
    }


    /**
     * Create a Lookup Table entry
     *
     * Add a new entry to a survey.  Mandatory Fields key, score, validFrom, validTo
     */
    @Test
    public void createLookupTableTest() {
        Long surveyId = null;
        LookupTableData body = null;
        // Void response = api.createLookupTable(surveyId, body);

        // TODO: test validations
    }

    /**
     * List all Lookup Table entries
     *
     * List all Lookup Table entries for a survey.
     */
    @Test
    public void fetchLookupTablesTest() {
        Long surveyId = null;
        // List<LookupTableData> response = api.fetchLookupTables(surveyId);

        // TODO: test validations
    }

    /**
     * Retrieve a Lookup Table entry
     *
     * Retrieve a Lookup Table entry for a survey.
     */
    @Test
    public void findLookupTableTest() {
        Long surveyId = null;
        String key = null;
        // LookupTableData response = api.findLookupTable(surveyId, key);

        // TODO: test validations
    }
}
