package org.apache.fineract.client.services;

import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.models.GetAccountTransfersPageItems;
import org.apache.fineract.client.models.GetAccountTransfersResponse;
import org.apache.fineract.client.models.GetAccountTransfersTemplateRefundByTransferResponse;
import org.apache.fineract.client.models.GetAccountTransfersTemplateResponse;
import org.apache.fineract.client.models.PostAccountTransfersRefundByTransferRequest;
import org.apache.fineract.client.models.PostAccountTransfersRefundByTransferResponse;
import org.apache.fineract.client.models.PostAccountTransfersRequest;
import org.apache.fineract.client.models.PostAccountTransfersResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AccountTransfersApi
 */
public class AccountTransfersApiTest {

    private AccountTransfersApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(AccountTransfersApi.class);
    }


    /**
     * Create new Transfer
     *
     * Ability to create new transfer of monetary funds from one account to another.
     */
    @Test
    public void create3Test() {
        PostAccountTransfersRequest body = null;
        // PostAccountTransfersResponse response = api.create3(body);

        // TODO: test validations
    }

    /**
     * List account transfers
     *
     * Lists account&#x27;s transfers  Example Requests:    accounttransfers
     */
    @Test
    public void retrieveAll17Test() {
        String sqlSearch = null;
        String externalId = null;
        Integer offset = null;
        Integer limit = null;
        String orderBy = null;
        String sortOrder = null;
        Long accountDetailId = null;
        // GetAccountTransfersResponse response = api.retrieveAll17(sqlSearch, externalId, offset, limit, orderBy, sortOrder, accountDetailId);

        // TODO: test validations
    }

    /**
     * Retrieve account transfer
     *
     * Retrieves account transfer  Example Requests :    accounttransfers/1
     */
    @Test
    public void retrieveOne8Test() {
        Long transferId = null;
        // GetAccountTransfersPageItems response = api.retrieveOne8(transferId);

        // TODO: test validations
    }

    /**
     * Retrieve Account Transfer Template
     *
     * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:    Field Defaults  Allowed Value Lists  Example Requests:    accounttransfers/template?fromAccountType&#x3D;2&amp;fromOfficeId&#x3D;1    accounttransfers/template?fromAccountType&#x3D;2&amp;fromOfficeId&#x3D;1&amp;fromClientId&#x3D;1    accounttransfers/template?fromClientId&#x3D;1&amp;fromAccountType&#x3D;2&amp;fromAccountId&#x3D;1
     */
    @Test
    public void template5Test() {
        Long fromOfficeId = null;
        Long fromClientId = null;
        Long fromAccountId = null;
        Integer fromAccountType = null;
        Long toOfficeId = null;
        Long toClientId = null;
        Long toAccountId = null;
        Integer toAccountType = null;
        // GetAccountTransfersTemplateResponse response = api.template5(fromOfficeId, fromClientId, fromAccountId, fromAccountType, toOfficeId, toClientId, toAccountId, toAccountType);

        // TODO: test validations
    }

    /**
     * Retrieve Refund of an Active Loan by Transfer Template
     *
     * Retrieves Refund of an Active Loan by Transfer TemplateExample Requests :    accounttransfers/templateRefundByTransfer?fromAccountId&#x3D;2&amp;fromAccountType&#x3D;1&amp; toAccountId&#x3D;1&amp;toAccountType&#x3D;2&amp;toClientId&#x3D;1&amp;toOfficeId&#x3D;1
     */
    @Test
    public void templateRefundByTransferTest() {
        Long fromOfficeId = null;
        Long fromClientId = null;
        Long fromAccountId = null;
        Integer fromAccountType = null;
        Long toOfficeId = null;
        Long toClientId = null;
        Long toAccountId = null;
        Integer toAccountType = null;
        // GetAccountTransfersTemplateRefundByTransferResponse response = api.templateRefundByTransfer(fromOfficeId, fromClientId, fromAccountId, fromAccountType, toOfficeId, toClientId, toAccountId, toAccountType);

        // TODO: test validations
    }

    /**
     * Refund of an Active Loan by Transfer
     *
     * Ability to refund an active loan by transferring to a savings account.
     */
    @Test
    public void templateRefundByTransferPostTest() {
        PostAccountTransfersRefundByTransferRequest body = null;
        // PostAccountTransfersRefundByTransferResponse response = api.templateRefundByTransferPost(body);

        // TODO: test validations
    }
}
