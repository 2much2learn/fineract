package org.apache.fineract.client.services;

import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.models.DateParam;
import org.apache.fineract.client.models.GetStandingInstructionRunHistoryResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for StandingInstructionsHistoryApi
 */
public class StandingInstructionsHistoryApiTest {

    private StandingInstructionsHistoryApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(StandingInstructionsHistoryApi.class);
    }


    /**
     * Standing Instructions Logged History
     *
     * The list capability of history can support pagination and sorting   Example Requests :  standinginstructionrunhistory  standinginstructionrunhistory?orderBy&#x3D;name&amp;sortOrder&#x3D;DESC  standinginstructionrunhistory?offset&#x3D;10&amp;limit&#x3D;50
     */
    @Test
    public void retrieveAll19Test() {
        String sqlSearch = null;
        String externalId = null;
        Integer offset = null;
        Integer limit = null;
        String orderBy = null;
        String sortOrder = null;
        Integer transferType = null;
        String clientName = null;
        Long clientId = null;
        Long fromAccountId = null;
        Integer fromAccountType = null;
        String locale = null;
        String dateFormat = null;
        DateParam fromDate = null;
        DateParam toDate = null;
        // GetStandingInstructionRunHistoryResponse response = api.retrieveAll19(sqlSearch, externalId, offset, limit, orderBy, sortOrder, transferType, clientName, clientId, fromAccountId, fromAccountType, locale, dateFormat, fromDate, toDate);

        // TODO: test validations
    }
}
