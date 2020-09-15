package org.apache.fineract.client.services;

import org.apache.fineract.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import org.apache.fineract.client.models.DeleteSelfBeneficiariesTPTBeneficiaryIdResponse;
import org.apache.fineract.client.models.GetSelfBeneficiariesTPTResponse;
import org.apache.fineract.client.models.GetSelfBeneficiariesTPTTemplateResponse;
import org.apache.fineract.client.models.PostSelfBeneficiariesTPTRequest;
import org.apache.fineract.client.models.PostSelfBeneficiariesTPTResponse;
import org.apache.fineract.client.models.PutSelfBeneficiariesTPTBeneficiaryIdRequest;
import org.apache.fineract.client.models.PutSelfBeneficiariesTPTBeneficiaryIdResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface SelfThirdPartyTransferApi {
  /**
   * Add TPT Beneficiary
   * Api to add third party beneficiary linked to current user.  Parameter Definitions  name : Nick name for beneficiary, should be unique for an self service user  officeName : Office Name of beneficiary(not id)  accountNumber : Account Number of beneficiary(not id)  transferLimit : Each transfer initiated to this account will not exceed this amount  Example Requests:  /self/beneficiaries/tpt  Mandatory Fields: name, officeName, accountNumber, accountType  Optional Fields: transferLimit
   * @param body  (required)
   * @return Call&lt;PostSelfBeneficiariesTPTResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("self/beneficiaries/tpt")
  Call<PostSelfBeneficiariesTPTResponse> add(
                    @retrofit2.http.Body PostSelfBeneficiariesTPTRequest body    
  );

  /**
   * Delete TPT Beneficiary
   * Api to delete third party beneficiary linked to current user.  Example Requests:  /self/beneficiaries/tpt/{beneficiaryId}
   * @param beneficiaryId  (required)
   * @return Call&lt;DeleteSelfBeneficiariesTPTBeneficiaryIdResponse&gt;
   */
  @DELETE("self/beneficiaries/tpt/{beneficiaryId}")
  Call<DeleteSelfBeneficiariesTPTBeneficiaryIdResponse> delete20(
            @retrofit2.http.Path("beneficiaryId") Long beneficiaryId            
  );

  /**
   * Get All TPT Beneficiary
   * Api to get all third party beneficiary linked to current user.  Example Requests:  /self/beneficiaries/tpt
   * @return Call&lt;List&lt;GetSelfBeneficiariesTPTResponse&gt;&gt;
   */
  @GET("self/beneficiaries/tpt")
  Call<List<GetSelfBeneficiariesTPTResponse>> retrieveAll34();
    

  /**
   * Beneficiary Third Party Transfer Template
   * Returns Account Type enumerations. Self User is expected to know office name and account number to be able to add beneficiary.  Example Requests:  /self/beneficiaries/tpt/template
   * @return Call&lt;GetSelfBeneficiariesTPTTemplateResponse&gt;
   */
  @GET("self/beneficiaries/tpt/template")
  Call<GetSelfBeneficiariesTPTTemplateResponse> template16();
    

  /**
   * Update TPT Beneficiary
   * Api to update third party beneficiary linked to current user.  Example Requests:  /self/beneficiaries/tpt/{beneficiaryId}  Optional Fields: name, transferLimit
   * @param body  (required)
   * @param beneficiaryId beneficiaryId (required)
   * @return Call&lt;PutSelfBeneficiariesTPTBeneficiaryIdResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("self/beneficiaries/tpt/{beneficiaryId}")
  Call<PutSelfBeneficiariesTPTBeneficiaryIdResponse> update20(
                    @retrofit2.http.Body PutSelfBeneficiariesTPTBeneficiaryIdRequest body    ,         @retrofit2.http.Path("beneficiaryId") Long beneficiaryId            
  );

}
