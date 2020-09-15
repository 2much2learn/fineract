package org.apache.fineract.client.services;

import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.models.DeleteLoansLoanIdResponse;
import org.apache.fineract.client.models.FormDataContentDisposition;
import org.apache.fineract.client.models.GetLoansLoanIdResponse;
import org.apache.fineract.client.models.GetLoansResponse;
import org.apache.fineract.client.models.GetLoansTemplateResponse;
import org.apache.fineract.client.models.PostLoansLoanIdRequest;
import org.apache.fineract.client.models.PostLoansLoanIdResponse;
import org.apache.fineract.client.models.PostLoansRequest;
import org.apache.fineract.client.models.PostLoansResponse;
import org.apache.fineract.client.models.PutLoansLoanIdRequest;
import org.apache.fineract.client.models.PutLoansLoanIdResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LoansApi
 */
public class LoansApiTest {

    private LoansApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(LoansApi.class);
    }


    /**
     * Calculate loan repayment schedule | Submit a new Loan Application
     *
     * It calculates the loan repayment Schedule Submits a new loan application Mandatory Fields: clientId, productId, principal, loanTermFrequency, loanTermFrequencyType, loanType, numberOfRepayments, repaymentEvery, repaymentFrequencyType, interestRatePerPeriod, amortizationType, interestType, interestCalculationPeriodType, transactionProcessingStrategyId, expectedDisbursementDate, submittedOnDate, loanType Optional Fields: graceOnPrincipalPayment, graceOnInterestPayment, graceOnInterestCharged, linkAccountId, allowPartialPeriodInterestCalcualtion, fixedEmiAmount, maxOutstandingLoanBalance, disbursementData, graceOnArrearsAgeing, createStandingInstructionAtDisbursement (requires linkedAccountId if set to true) Additional Mandatory Fields if interest recalculation is enabled for product and Rest frequency not same as repayment period: recalculationRestFrequencyDate Additional Mandatory Fields if interest recalculation with interest/fee compounding is enabled for product and compounding frequency not same as repayment period: recalculationCompoundingFrequencyDate Additional Mandatory Field if Entity-Datatable Check is enabled for the entity of type loan: datatables
     */
    @Test
    public void calculateLoanScheduleOrSubmitLoanApplicationTest() {
        PostLoansRequest body = null;
        String command = null;
        // PostLoansResponse response = api.calculateLoanScheduleOrSubmitLoanApplication(body, command);

        // TODO: test validations
    }

    /**
     * Delete a Loan Application
     *
     * Note: Only loans in \&quot;Submitted and awaiting approval\&quot; status can be deleted.
     */
    @Test
    public void deleteLoanApplicationTest() {
        Long loanId = null;
        // DeleteLoansLoanIdResponse response = api.deleteLoanApplication(loanId);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void getGlimRepaymentTemplateTest() {
        Long glimId = null;
        // String response = api.getGlimRepaymentTemplate(glimId);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void getLoanRepaymentTemplateTest() {
        Long officeId = null;
        String dateFormat = null;
        // Void response = api.getLoanRepaymentTemplate(officeId, dateFormat);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void getLoansTemplateTest() {
        Long officeId = null;
        Long staffId = null;
        String dateFormat = null;
        // Void response = api.getLoansTemplate(officeId, staffId, dateFormat);

        // TODO: test validations
    }

    /**
     * Approve GLIM Application | Undo GLIM Application Approval | Reject GLIM Application | Disburse Loan Disburse Loan To Savings Account | Undo Loan Disbursal
     *
     * Approve GLIM Application: Mandatory Fields: approvedOnDate Optional Fields: approvedLoanAmount and expectedDisbursementDate Approves the GLIM application  Undo GLIM Application Approval: Undoes the GLIM Application Approval  Reject GLIM Application: Mandatory Fields: rejectedOnDate Allows you to reject the GLIM application  Disburse Loan: Mandatory Fields: actualDisbursementDate Optional Fields: transactionAmount and fixedEmiAmount Disburses the Loan  Disburse Loan To Savings Account: Mandatory Fields: actualDisbursementDate Optional Fields: transactionAmount and fixedEmiAmount Disburses the loan to Saving Account  Undo Loan Disbursal: Undoes the Loan Disbursal 
     */
    @Test
    public void glimStateTransitionsTest() {
        PostLoansLoanIdRequest body = null;
        Long glimId = null;
        String command = null;
        // PostLoansLoanIdResponse response = api.glimStateTransitions(body, glimId, command);

        // TODO: test validations
    }

    /**
     * Modify a loan application
     *
     * Loan application can only be modified when in &#x27;Submitted and pending approval&#x27; state. Once the application is approved, the details cannot be changed using this method.
     */
    @Test
    public void modifyLoanApplicationTest() {
        PutLoansLoanIdRequest body = null;
        Long loanId = null;
        // PutLoansLoanIdResponse response = api.modifyLoanApplication(body, loanId);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void postLoanRepaymentTemplateTest() {
        FormDataContentDisposition file = null;
        String locale = null;
        String dateFormat = null;
        // String response = api.postLoanRepaymentTemplate(file, locale, dateFormat);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void postLoanTemplateTest() {
        FormDataContentDisposition file = null;
        String locale = null;
        String dateFormat = null;
        // String response = api.postLoanTemplate(file, locale, dateFormat);

        // TODO: test validations
    }

    /**
     * List Loans
     *
     * The list capability of loans can support pagination and sorting. Example Requests:  loans  loans?fields&#x3D;accountNo  loans?offset&#x3D;10&amp;limit&#x3D;50  loans?orderBy&#x3D;accountNo&amp;sortOrder&#x3D;DESC
     */
    @Test
    public void retrieveAll26Test() {
        String sqlSearch = null;
        String externalId = null;
        Integer offset = null;
        Integer limit = null;
        String orderBy = null;
        String sortOrder = null;
        String accountNo = null;
        // GetLoansResponse response = api.retrieveAll26(sqlSearch, externalId, offset, limit, orderBy, sortOrder, accountNo);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void retrieveApprovalTemplateTest() {
        Long loanId = null;
        String templateType = null;
        // String response = api.retrieveApprovalTemplate(loanId, templateType);

        // TODO: test validations
    }

    /**
     * Retrieve a Loan
     *
     * Note: template&#x3D;true parameter doesn&#x27;t apply to this resource.Example Requests:  loans/1   loans/1?fields&#x3D;id,principal,annualInterestRate   loans/1?associations&#x3D;all  loans/1?associations&#x3D;all&amp;exclude&#x3D;guarantors   loans/1?fields&#x3D;id,principal,annualInterestRate&amp;associations&#x3D;repaymentSchedule,transactions
     */
    @Test
    public void retrieveLoanTest() {
        Long loanId = null;
        Boolean staffInSelectedOfficeOnly = null;
        // GetLoansLoanIdResponse response = api.retrieveLoan(loanId, staffInSelectedOfficeOnly);

        // TODO: test validations
    }

    /**
     * Approve Loan Application | Recover Loan Guarantee | Undo Loan Application Approval | Assign a Loan Officer | Unassign a Loan Officer | Reject Loan Application | Applicant Withdraws from Loan Application | Disburse Loan Disburse Loan To Savings Account | Undo Loan Disbursal
     *
     * Approve Loan Application: Mandatory Fields: approvedOnDate Optional Fields: approvedLoanAmount and expectedDisbursementDate Approves the loan application  Recover Loan Guarantee: Recovers the loan guarantee  Undo Loan Application Approval: Undoes the Loan Application Approval  Assign a Loan Officer: Allows you to assign Loan Officer for existing Loan.  Unassign a Loan Officer: Allows you to unassign the Loan Officer.  Reject Loan Application: Mandatory Fields: rejectedOnDate Allows you to reject the loan application  Applicant Withdraws from Loan Application: Mandatory Fields: withdrawnOnDate Allows the applicant to withdraw the loan application  Disburse Loan: Mandatory Fields: actualDisbursementDate Optional Fields: transactionAmount and fixedEmiAmount Disburses the Loan  Disburse Loan To Savings Account: Mandatory Fields: actualDisbursementDate Optional Fields: transactionAmount and fixedEmiAmount Disburses the loan to Saving Account  Undo Loan Disbursal: Undoes the Loan Disbursal Showing request and response for Assign a Loan Officer
     */
    @Test
    public void stateTransitionsTest() {
        PostLoansLoanIdRequest body = null;
        Long loanId = null;
        String command = null;
        // PostLoansLoanIdResponse response = api.stateTransitions(body, loanId, command);

        // TODO: test validations
    }

    /**
     * Retrieve Loan Details Template
     *
     * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed description Lists Example Requests:  loans/template?templateType&#x3D;individual&amp;clientId&#x3D;1   loans/template?templateType&#x3D;individual&amp;clientId&#x3D;1&amp;productId&#x3D;1
     */
    @Test
    public void template10Test() {
        Long clientId = null;
        Long groupId = null;
        Long productId = null;
        String templateType = null;
        Boolean staffInSelectedOfficeOnly = null;
        Boolean activeOnly = null;
        // GetLoansTemplateResponse response = api.template10(clientId, groupId, productId, templateType, staffInSelectedOfficeOnly, activeOnly);

        // TODO: test validations
    }
}
