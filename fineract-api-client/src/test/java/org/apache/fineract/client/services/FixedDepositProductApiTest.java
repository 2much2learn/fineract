package org.apache.fineract.client.services;

import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.models.DeleteFixedDepositProductsProductIdResponse;
import org.apache.fineract.client.models.GetFixedDepositProductsProductIdResponse;
import org.apache.fineract.client.models.GetFixedDepositProductsResponse;
import org.apache.fineract.client.models.PostFixedDepositProductsRequest;
import org.apache.fineract.client.models.PostFixedDepositProductsResponse;
import org.apache.fineract.client.models.PutFixedDepositProductsProductIdRequest;
import org.apache.fineract.client.models.PutFixedDepositProductsProductIdResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FixedDepositProductApi
 */
public class FixedDepositProductApiTest {

    private FixedDepositProductApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(FixedDepositProductApi.class);
    }


    /**
     * Create a Fixed Deposit Product
     *
     * Creates a Fixed Deposit Product  Mandatory Fields: name, shortName, description, currencyCode, digitsAfterDecimal,inMultiplesOf, interestCompoundingPeriodType, interestCalculationType, interestCalculationDaysInYearType, minDepositTerm, minDepositTermTypeId, accountingRule  Optional Fields: lockinPeriodFrequency, lockinPeriodFrequencyType, maxDepositTerm, maxDepositTermTypeId, inMultiplesOfDepositTerm, inMultiplesOfDepositTermTypeId, preClosurePenalApplicable, preClosurePenalInterest, preClosurePenalInterestOnTypeId, feeToIncomeAccountMappings, penaltyToIncomeAccountMappings, charges, charts, , withHoldTax, taxGroupId   Mandatory Fields for Cash based accounting (accountingRule &#x3D; 2): savingsReferenceAccountId, savingsControlAccountId, interestOnSavingsAccountId, incomeFromFeeAccountId, transfersInSuspenseAccountId, incomeFromPenaltyAccountId
     */
    @Test
    public void create10Test() {
        PostFixedDepositProductsRequest body = null;
        // PostFixedDepositProductsResponse response = api.create10(body);

        // TODO: test validations
    }

    /**
     * Delete a Fixed Deposit Product
     *
     * Deletes a Fixed Deposit Product
     */
    @Test
    public void delete15Test() {
        Long productId = null;
        // DeleteFixedDepositProductsProductIdResponse response = api.delete15(productId);

        // TODO: test validations
    }

    /**
     * List Fixed Deposit Products
     *
     * Lists Fixed Deposit Products  Example Requests:  fixeddepositproducts   fixeddepositproducts?fields&#x3D;name
     */
    @Test
    public void retrieveAll29Test() {
        // List<GetFixedDepositProductsResponse> response = api.retrieveAll29();

        // TODO: test validations
    }

    /**
     * Retrieve a Fixed Deposit Product
     *
     * Retrieves a Fixed Deposit Product  Example Requests:  fixeddepositproducts/1   fixeddepositproducts/1?template&#x3D;true   fixeddepositproducts/1?fields&#x3D;name,description
     */
    @Test
    public void retrieveOne18Test() {
        Long productId = null;
        // GetFixedDepositProductsProductIdResponse response = api.retrieveOne18(productId);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void retrieveTemplate14Test() {
        // String response = api.retrieveTemplate14();

        // TODO: test validations
    }

    /**
     * Update a Fixed Deposit Product
     *
     * Updates a Fixed Deposit Product
     */
    @Test
    public void update15Test() {
        PutFixedDepositProductsProductIdRequest body = null;
        Long productId = null;
        // PutFixedDepositProductsProductIdResponse response = api.update15(body, productId);

        // TODO: test validations
    }
}
