package org.apache.fineract.client.services;

import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.models.AccountingRuleData;
import org.apache.fineract.client.models.DeleteAccountingRulesResponse;
import org.apache.fineract.client.models.GetAccountRulesResponse;
import org.apache.fineract.client.models.GetAccountRulesTemplateResponse;
import org.apache.fineract.client.models.PostAccountingRulesRequest;
import org.apache.fineract.client.models.PostAccountingRulesResponse;
import org.apache.fineract.client.models.PutAccountingRulesRequest;
import org.apache.fineract.client.models.PutAccountingRulesResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AccountingRulesApi
 */
public class AccountingRulesApiTest {

    private AccountingRulesApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(AccountingRulesApi.class);
    }


    /**
     * Create/Define a Accounting rule
     *
     * Define a new Accounting rule.  Mandatory Fields name, officeId, accountToDebit OR debitTags, accountToCredit OR creditTags.  Optional Fields description
     */
    @Test
    public void createAccountingRuleTest() {
        PostAccountingRulesRequest body = null;
        // PostAccountingRulesResponse response = api.createAccountingRule(body);

        // TODO: test validations
    }

    /**
     * Delete a Accounting Rule
     *
     * Deletes a Accounting rule.
     */
    @Test
    public void deleteAccountingRuleTest() {
        Long accountingRuleId = null;
        // DeleteAccountingRulesResponse response = api.deleteAccountingRule(accountingRuleId);

        // TODO: test validations
    }

    /**
     * Retrieve a Accounting rule
     *
     * Returns the details of a defined Accounting rule.  Example Requests:  accountingrules/1
     */
    @Test
    public void retreiveAccountingRuleTest() {
        Long accountingRuleId = null;
        // AccountingRuleData response = api.retreiveAccountingRule(accountingRuleId);

        // TODO: test validations
    }

    /**
     * Retrieve Accounting Rules
     *
     * Returns the list of defined accounting rules.  Example Requests:  accountingrules
     */
    @Test
    public void retrieveAllAccountingRulesTest() {
        // List<GetAccountRulesResponse> response = api.retrieveAllAccountingRules();

        // TODO: test validations
    }

    /**
     * Retrieve Accounting Rule Details Template
     *
     * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists Example Request:  accountingrules/template
     */
    @Test
    public void retrieveTemplate1Test() {
        // GetAccountRulesTemplateResponse response = api.retrieveTemplate1();

        // TODO: test validations
    }

    /**
     * Update a Accounting Rule
     *
     * Updates the details of a Accounting rule.
     */
    @Test
    public void updateAccountingRuleTest() {
        Long accountingRuleId = null;
        PutAccountingRulesRequest body = null;
        // PutAccountingRulesResponse response = api.updateAccountingRule(accountingRuleId, body);

        // TODO: test validations
    }
}
