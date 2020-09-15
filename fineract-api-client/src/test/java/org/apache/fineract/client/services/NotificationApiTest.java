package org.apache.fineract.client.services;

import org.apache.fineract.client.ApiClient;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for NotificationApi
 */
public class NotificationApiTest {

    private NotificationApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(NotificationApi.class);
    }


    /**
     * 
     *
     * 
     */
    @Test
    public void getAllNotificationsTest() {
        String orderBy = null;
        Integer limit = null;
        Integer offset = null;
        String sortOrder = null;
        Boolean isRead = null;
        // String response = api.getAllNotifications(orderBy, limit, offset, sortOrder, isRead);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void update5Test() {
        // Void response = api.update5();

        // TODO: test validations
    }
}
