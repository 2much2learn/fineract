package org.apache.fineract.client.services;

import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.models.DeletePaymentTypesPaymentTypeIdResponse;
import org.apache.fineract.client.models.GetPaymentTypesPaymentTypeIdResponse;
import org.apache.fineract.client.models.GetPaymentTypesResponse;
import org.apache.fineract.client.models.PostPaymentTypesRequest;
import org.apache.fineract.client.models.PostPaymentTypesResponse;
import org.apache.fineract.client.models.PutPaymentTypesPaymentTypeIdRequest;
import org.apache.fineract.client.models.PutPaymentTypesPaymentTypeIdResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PaymentTypeApi
 */
public class PaymentTypeApiTest {

    private PaymentTypeApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(PaymentTypeApi.class);
    }


    /**
     * Create a Payment Type
     *
     * Creates a new Payment type  Mandatory Fields: name  Optional Fields: Description, isCashPayment,Position
     */
    @Test
    public void createPaymentTypeTest() {
        PostPaymentTypesRequest body = null;
        // PostPaymentTypesResponse response = api.createPaymentType(body);

        // TODO: test validations
    }

    /**
     * Delete a Payment Type
     *
     * Deletes payment type
     */
    @Test
    public void deleteCode1Test() {
        Long paymentTypeId = null;
        // DeletePaymentTypesPaymentTypeIdResponse response = api.deleteCode1(paymentTypeId);

        // TODO: test validations
    }

    /**
     * Retrieve all Payment Types
     *
     * Retrieve list of payment types
     */
    @Test
    public void getAllPaymentTypesTest() {
        // List<GetPaymentTypesResponse> response = api.getAllPaymentTypes();

        // TODO: test validations
    }

    /**
     * Retrieve a Payment Type
     *
     * Retrieves a payment type
     */
    @Test
    public void retrieveOnePaymentTypeTest() {
        Long paymentTypeId = null;
        // GetPaymentTypesPaymentTypeIdResponse response = api.retrieveOnePaymentType(paymentTypeId);

        // TODO: test validations
    }

    /**
     * Update a Payment Type
     *
     * Updates a Payment Type
     */
    @Test
    public void updatePaymentTypeTest() {
        PutPaymentTypesPaymentTypeIdRequest body = null;
        Long paymentTypeId = null;
        // PutPaymentTypesPaymentTypeIdResponse response = api.updatePaymentType(body, paymentTypeId);

        // TODO: test validations
    }
}
