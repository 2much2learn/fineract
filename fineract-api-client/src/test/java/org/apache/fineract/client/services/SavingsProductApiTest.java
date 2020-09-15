package org.apache.fineract.client.services;

import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.models.DeleteSavingsProductsProductIdResponse;
import org.apache.fineract.client.models.GetSavingsProductsProductIdResponse;
import org.apache.fineract.client.models.GetSavingsProductsResponse;
import org.apache.fineract.client.models.GetSavingsProductsTemplateResponse;
import org.apache.fineract.client.models.PostSavingsProductsRequest;
import org.apache.fineract.client.models.PostSavingsProductsResponse;
import org.apache.fineract.client.models.PutSavingsProductsProductIdRequest;
import org.apache.fineract.client.models.PutSavingsProductsProductIdResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SavingsProductApi
 */
public class SavingsProductApiTest {

    private SavingsProductApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(SavingsProductApi.class);
    }


    /**
     * Create a Savings Product
     *
     * Creates a Savings Product  Mandatory Fields: name, shortName, description, currencyCode, digitsAfterDecimal,inMultiplesOf, nominalAnnualInterestRate, interestCompoundingPeriodType, interestCalculationType, interestCalculationDaysInYearType,accountingRule  Mandatory Fields for Cash based accounting (accountingRule &#x3D; 2): savingsReferenceAccountId, savingsControlAccountId, interestOnSavingsAccountId, incomeFromFeeAccountId, transfersInSuspenseAccountId, incomeFromPenaltyAccountId  Optional Fields: minRequiredOpeningBalance, lockinPeriodFrequency, lockinPeriodFrequencyType, withdrawalFeeForTransfers, paymentChannelToFundSourceMappings, feeToIncomeAccountMappings, penaltyToIncomeAccountMappings, charges, allowOverdraft, overdraftLimit, minBalanceForInterestCalculation,withHoldTax,taxGroupId
     */
    @Test
    public void create12Test() {
        PostSavingsProductsRequest body = null;
        // PostSavingsProductsResponse response = api.create12(body);

        // TODO: test validations
    }

    /**
     * Delete a Savings Product
     *
     * Deletes a Savings Product
     */
    @Test
    public void delete19Test() {
        Long productId = null;
        // DeleteSavingsProductsProductIdResponse response = api.delete19(productId);

        // TODO: test validations
    }

    /**
     * List Savings Products
     *
     * Lists Savings Products  Example Requests:  savingsproducts  savingsproducts?fields&#x3D;name
     */
    @Test
    public void retrieveAll33Test() {
        // List<GetSavingsProductsResponse> response = api.retrieveAll33();

        // TODO: test validations
    }

    /**
     * Retrieve a Savings Product
     *
     * Retrieves a Savings Product  Example Requests:  savingsproducts/1  savingsproducts/1?template&#x3D;true  savingsproducts/1?fields&#x3D;name,description
     */
    @Test
    public void retrieveOne24Test() {
        Long productId = null;
        // GetSavingsProductsProductIdResponse response = api.retrieveOne24(productId);

        // TODO: test validations
    }

    /**
     * Retrieve Savings Product Template
     *
     * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed description Lists Example Request:  savingsproducts/template
     */
    @Test
    public void retrieveTemplate19Test() {
        // GetSavingsProductsTemplateResponse response = api.retrieveTemplate19();

        // TODO: test validations
    }

    /**
     * Update a Savings Product
     *
     * Updates a Savings Product
     */
    @Test
    public void update19Test() {
        PutSavingsProductsProductIdRequest body = null;
        Long productId = null;
        // PutSavingsProductsProductIdResponse response = api.update19(body, productId);

        // TODO: test validations
    }
}
