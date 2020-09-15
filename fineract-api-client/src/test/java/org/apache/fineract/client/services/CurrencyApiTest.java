package org.apache.fineract.client.services;

import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.models.GetCurrenciesResponse;
import org.apache.fineract.client.models.PutCurrenciesRequest;
import org.apache.fineract.client.models.PutCurrenciesResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CurrencyApi
 */
public class CurrencyApiTest {

    private CurrencyApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(CurrencyApi.class);
    }


    /**
     * Retrieve Currency Configuration
     *
     * Returns the list of currencies permitted for use AND the list of currencies not selected (but available for selection).  Example Requests:  currencies   currencies?fields&#x3D;selectedCurrencyOptions
     */
    @Test
    public void retrieveCurrenciesTest() {
        // GetCurrenciesResponse response = api.retrieveCurrencies();

        // TODO: test validations
    }

    /**
     * Update Currency Configuration
     *
     * Updates the list of currencies permitted for use.
     */
    @Test
    public void updateCurrenciesTest() {
        PutCurrenciesRequest body = null;
        // PutCurrenciesResponse response = api.updateCurrencies(body);

        // TODO: test validations
    }
}
