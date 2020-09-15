package org.apache.fineract.client.services;

import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.models.GetSelfLoansLoanIdChargesResponse;
import org.apache.fineract.client.models.GetSelfLoansLoanIdResponse;
import org.apache.fineract.client.models.GetSelfLoansLoanIdTransactionsTransactionIdResponse;
import org.apache.fineract.client.models.GetSelfLoansTemplateResponse;
import org.apache.fineract.client.models.PostSelfLoansLoanIdRequest;
import org.apache.fineract.client.models.PostSelfLoansLoanIdResponse;
import org.apache.fineract.client.models.PostSelfLoansRequest;
import org.apache.fineract.client.models.PostSelfLoansResponse;
import org.apache.fineract.client.models.PutSelfLoansLoanIdRequest;
import org.apache.fineract.client.models.PutSelfLoansLoanIdResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SelfLoansApi
 */
public class SelfLoansApiTest {

    private SelfLoansApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(SelfLoansApi.class);
    }


    /**
     * Calculate Loan Repayment Schedule | Submit a new Loan Application
     *
     * Calculate Loan Repayment Schedule:  Calculates Loan Repayment Schedule  Mandatory Fields: productId, principal, loanTermFrequency, loanTermFrequencyType, numberOfRepayments, repaymentEvery, repaymentFrequencyType, interestRatePerPeriod, amortizationType, interestType, interestCalculationPeriodType, expectedDisbursementDate, transactionProcessingStrategyId  Submit a new Loan Application:  Mandatory Fields: clientId, productId, principal, loanTermFrequency, loanTermFrequencyType, loanType, numberOfRepayments, repaymentEvery, repaymentFrequencyType, interestRatePerPeriod, amortizationType, interestType, interestCalculationPeriodType, transactionProcessingStrategyId, expectedDisbursementDate, submittedOnDate, loanType  Additional Mandatory Fields if interest recalculation is enabled for product and Rest frequency not same as repayment period: recalculationRestFrequencyDate  Additional Mandatory Fields if interest recalculation with interest/fee compounding is enabled for product and compounding frequency not same as repayment period: recalculationCompoundingFrequencyDate  Additional Mandatory Field if Entity-Datatable Check is enabled for the entity of type loan: datatables  Optional Fields: graceOnPrincipalPayment, graceOnInterestPayment, graceOnInterestCharged, linkAccountId, allowPartialPeriodInterestCalcualtion, fixedEmiAmount, maxOutstandingLoanBalance, disbursementData, graceOnArrearsAgeing, createStandingInstructionAtDisbursement (requires linkedAccountId if set to true)  Showing request/response for &#x27;Submit a new Loan Application&#x27;
     */
    @Test
    public void calculateLoanScheduleOrSubmitLoanApplication1Test() {
        PostSelfLoansRequest body = null;
        String command = null;
        // PostSelfLoansResponse response = api.calculateLoanScheduleOrSubmitLoanApplication1(body, command);

        // TODO: test validations
    }

    /**
     * Update a Loan Application
     *
     * Loan application can only be modified when in &#x27;Submitted and pending approval&#x27; state. Once the application is approved, the details cannot be changed using this method.
     */
    @Test
    public void modifyLoanApplication1Test() {
        PutSelfLoansLoanIdRequest body = null;
        Long loanId = null;
        // PutSelfLoansLoanIdResponse response = api.modifyLoanApplication1(body, loanId);

        // TODO: test validations
    }

    /**
     * List Loan Charges
     *
     * Lists loan Charges  Example Requests:  self/loans/1/charges   self/loans/1/charges?fields&#x3D;name,amountOrPercentage
     */
    @Test
    public void retrieveAllLoanCharges1Test() {
        Long loanId = null;
        // List<GetSelfLoansLoanIdChargesResponse> response = api.retrieveAllLoanCharges1(loanId);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void retrieveGuarantorDetails2Test() {
        Long loanId = null;
        // String response = api.retrieveGuarantorDetails2(loanId);

        // TODO: test validations
    }

    /**
     * Retrieve a Loan
     *
     * Retrieves a Loan  Example Requests:  self/loans/1   self/loans/1?fields&#x3D;id,principal,annualInterestRate   self/loans/1?fields&#x3D;id,principal,annualInterestRate&amp;associations&#x3D;repaymentSchedule,transactions
     */
    @Test
    public void retrieveLoan1Test() {
        Long loanId = null;
        // GetSelfLoansLoanIdResponse response = api.retrieveLoan1(loanId);

        // TODO: test validations
    }

    /**
     * Retrieve a Loan Charge
     *
     * Retrieves a Loan Charge  Example Requests:  self/loans/1/charges/1   self/loans/1/charges/1?fields&#x3D;name,amountOrPercentage
     */
    @Test
    public void retrieveLoanCharge1Test() {
        Long loanId = null;
        Long chargeId = null;
        // GetSelfLoansLoanIdChargesResponse response = api.retrieveLoanCharge1(loanId, chargeId);

        // TODO: test validations
    }

    /**
     * Retrieve a Loan Transaction Details
     *
     * Retrieves a Loan Transaction DetailsExample Request:  self/loans/5/transactions/3
     */
    @Test
    public void retrieveTransaction1Test() {
        Long loanId = null;
        Long transactionId = null;
        // GetSelfLoansLoanIdTransactionsTransactionIdResponse response = api.retrieveTransaction1(loanId, transactionId);

        // TODO: test validations
    }

    /**
     * Applicant Withdraws from Loan Application
     *
     * Applicant Withdraws from Loan Application  Mandatory Fields: withdrawnOnDate
     */
    @Test
    public void stateTransitions1Test() {
        PostSelfLoansLoanIdRequest body = null;
        Long loanId = null;
        String command = null;
        // PostSelfLoansLoanIdResponse response = api.stateTransitions1(body, loanId, command);

        // TODO: test validations
    }

    /**
     * Retrieve Loan Details Template
     *
     * Retrieves Loan Details Template  This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed description Lists  Example Requests:  self/loans/template?templateType&#x3D;individual&amp;clientId&#x3D;1   self/loans/template?templateType&#x3D;individual&amp;clientId&#x3D;1&amp;productId&#x3D;1
     */
    @Test
    public void template17Test() {
        Long clientId = null;
        Long productId = null;
        String templateType = null;
        // GetSelfLoansTemplateResponse response = api.template17(clientId, productId, templateType);

        // TODO: test validations
    }
}
