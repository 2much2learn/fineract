package org.apache.fineract.client.services;

import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.models.GetAccountsLinkedToPocketResponse;
import org.apache.fineract.client.models.PostLinkDelinkAccountsToFromPocketResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PocketApi
 */
public class PocketApiTest {

    private PocketApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(PocketApi.class);
    }


    /**
     * Link/delink accounts to/from pocket
     *
     * Pockets behave as favourites. An user can link his/her Loan, Savings and Share accounts to pocket for faster access. In a similar way linked accounts can be delinked from the pocket.  Example Requests:  self/pockets?command&#x3D;linkAccounts  self/pockets?command&#x3D;delinkAccounts
     */
    @Test
    public void handleCommands7Test() {
        String body = null;
        String command = null;
        // PostLinkDelinkAccountsToFromPocketResponse response = api.handleCommands7(body, command);

        // TODO: test validations
    }

    /**
     * Retrieve accounts linked to pocket
     *
     * All linked loan  Example Requests:   self/pockets
     */
    @Test
    public void retrieveAll36Test() {
        // GetAccountsLinkedToPocketResponse response = api.retrieveAll36();

        // TODO: test validations
    }
}
