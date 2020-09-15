package org.apache.fineract.client.services;

import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.models.DeleteSelfBeneficiariesTPTBeneficiaryIdResponse;
import org.apache.fineract.client.models.GetSelfBeneficiariesTPTResponse;
import org.apache.fineract.client.models.GetSelfBeneficiariesTPTTemplateResponse;
import org.apache.fineract.client.models.PostSelfBeneficiariesTPTRequest;
import org.apache.fineract.client.models.PostSelfBeneficiariesTPTResponse;
import org.apache.fineract.client.models.PutSelfBeneficiariesTPTBeneficiaryIdRequest;
import org.apache.fineract.client.models.PutSelfBeneficiariesTPTBeneficiaryIdResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SelfThirdPartyTransferApi
 */
public class SelfThirdPartyTransferApiTest {

    private SelfThirdPartyTransferApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(SelfThirdPartyTransferApi.class);
    }


    /**
     * Add TPT Beneficiary
     *
     * Api to add third party beneficiary linked to current user.  Parameter Definitions  name : Nick name for beneficiary, should be unique for an self service user  officeName : Office Name of beneficiary(not id)  accountNumber : Account Number of beneficiary(not id)  transferLimit : Each transfer initiated to this account will not exceed this amount  Example Requests:  /self/beneficiaries/tpt  Mandatory Fields: name, officeName, accountNumber, accountType  Optional Fields: transferLimit
     */
    @Test
    public void addTest() {
        PostSelfBeneficiariesTPTRequest body = null;
        // PostSelfBeneficiariesTPTResponse response = api.add(body);

        // TODO: test validations
    }

    /**
     * Delete TPT Beneficiary
     *
     * Api to delete third party beneficiary linked to current user.  Example Requests:  /self/beneficiaries/tpt/{beneficiaryId}
     */
    @Test
    public void delete20Test() {
        Long beneficiaryId = null;
        // DeleteSelfBeneficiariesTPTBeneficiaryIdResponse response = api.delete20(beneficiaryId);

        // TODO: test validations
    }

    /**
     * Get All TPT Beneficiary
     *
     * Api to get all third party beneficiary linked to current user.  Example Requests:  /self/beneficiaries/tpt
     */
    @Test
    public void retrieveAll34Test() {
        // List<GetSelfBeneficiariesTPTResponse> response = api.retrieveAll34();

        // TODO: test validations
    }

    /**
     * Beneficiary Third Party Transfer Template
     *
     * Returns Account Type enumerations. Self User is expected to know office name and account number to be able to add beneficiary.  Example Requests:  /self/beneficiaries/tpt/template
     */
    @Test
    public void template16Test() {
        // GetSelfBeneficiariesTPTTemplateResponse response = api.template16();

        // TODO: test validations
    }

    /**
     * Update TPT Beneficiary
     *
     * Api to update third party beneficiary linked to current user.  Example Requests:  /self/beneficiaries/tpt/{beneficiaryId}  Optional Fields: name, transferLimit
     */
    @Test
    public void update20Test() {
        PutSelfBeneficiariesTPTBeneficiaryIdRequest body = null;
        Long beneficiaryId = null;
        // PutSelfBeneficiariesTPTBeneficiaryIdResponse response = api.update20(body, beneficiaryId);

        // TODO: test validations
    }
}
