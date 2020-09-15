package org.apache.fineract.client.services;

import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.models.DeleteRecurringDepositProductsProductIdResponse;
import org.apache.fineract.client.models.GetRecurringDepositProductsProductIdResponse;
import org.apache.fineract.client.models.GetRecurringDepositProductsResponse;
import org.apache.fineract.client.models.PostRecurringDepositProductsRequest;
import org.apache.fineract.client.models.PostRecurringDepositProductsResponse;
import org.apache.fineract.client.models.PutRecurringDepositProductsRequest;
import org.apache.fineract.client.models.PutRecurringDepositProductsResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RecurringDepositProductApi
 */
public class RecurringDepositProductApiTest {

    private RecurringDepositProductApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(RecurringDepositProductApi.class);
    }


    /**
     * Create a Recurring Deposit Product
     *
     * Creates a Recurring Deposit Product  Mandatory Fields: name, shortName, description, currencyCode, digitsAfterDecimal,inMultiplesOf, interestCompoundingPeriodType, interestCalculationType, interestCalculationDaysInYearType, minDepositTerm, minDepositTermTypeId, recurringDepositFrequency, recurringDepositFrequencyTypeId, accountingRule, depositAmount  Mandatory Fields for Cash based accounting (accountingRule &#x3D; 2): savingsReferenceAccountId, savingsControlAccountId, interestOnSavingsAccountId, incomeFromFeeAccountId, transfersInSuspenseAccountId, incomeFromPenaltyAccountId  Optional Fields: lockinPeriodFrequency, lockinPeriodFrequencyType, maxDepositTerm, maxDepositTermTypeId, inMultiplesOfDepositTerm, inMultiplesOfDepositTermTypeId, preClosurePenalApplicable, preClosurePenalInterest, preClosurePenalInterestOnTypeId, feeToIncomeAccountMappings, penaltyToIncomeAccountMappings, charges, charts, minDepositAmount, maxDepositAmount, withHoldTax, taxGroupId
     */
    @Test
    public void create11Test() {
        PostRecurringDepositProductsRequest body = null;
        // PostRecurringDepositProductsResponse response = api.create11(body);

        // TODO: test validations
    }

    /**
     * Delete a Recurring Deposit Product
     *
     * Deletes a Recurring Deposit Product
     */
    @Test
    public void delete17Test() {
        Long productId = null;
        // DeleteRecurringDepositProductsProductIdResponse response = api.delete17(productId);

        // TODO: test validations
    }

    /**
     * List Recuring Deposit Products
     *
     * Lists Recuring Deposit Products  Example Requests:  recurringdepositproducts   recurringdepositproducts?fields&#x3D;name
     */
    @Test
    public void retrieveAll31Test() {
        // List<GetRecurringDepositProductsResponse> response = api.retrieveAll31();

        // TODO: test validations
    }

    /**
     * Retrieve a Recurring Deposit Product
     *
     * Retrieves a Recurring Deposit Product  Example Requests:  recurringdepositproducts/1   recurringdepositproducts/1?template&#x3D;true   recurringdepositproducts/1?fields&#x3D;name,description
     */
    @Test
    public void retrieveOne21Test() {
        Long productId = null;
        // GetRecurringDepositProductsProductIdResponse response = api.retrieveOne21(productId);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void retrieveTemplate16Test() {
        // String response = api.retrieveTemplate16();

        // TODO: test validations
    }

    /**
     * Update a Recurring Deposit Product
     *
     * Updates a Recurring Deposit Product
     */
    @Test
    public void update17Test() {
        PutRecurringDepositProductsRequest body = null;
        Long productId = null;
        // PutRecurringDepositProductsResponse response = api.update17(body, productId);

        // TODO: test validations
    }
}
