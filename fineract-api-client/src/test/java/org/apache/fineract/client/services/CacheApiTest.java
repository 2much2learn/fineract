package org.apache.fineract.client.services;

import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.models.GetCachesResponse;
import org.apache.fineract.client.models.PutCachesRequest;
import org.apache.fineract.client.models.PutCachesResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CacheApi
 */
public class CacheApiTest {

    private CacheApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(CacheApi.class);
    }


    /**
     * Retrieve Cache Types
     *
     * Returns the list of caches.  Example Requests:  caches
     */
    @Test
    public void retrieveAll4Test() {
        // List<GetCachesResponse> response = api.retrieveAll4();

        // TODO: test validations
    }

    /**
     * Switch Cache
     *
     * Switches the cache to chosen one.
     */
    @Test
    public void switchCacheTest() {
        PutCachesRequest body = null;
        // PutCachesResponse response = api.switchCache(body);

        // TODO: test validations
    }
}
