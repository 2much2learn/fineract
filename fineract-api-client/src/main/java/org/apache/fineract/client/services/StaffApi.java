package org.apache.fineract.client.services;

import org.apache.fineract.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import org.apache.fineract.client.models.FormDataContentDisposition;
import org.apache.fineract.client.models.GetStaffResponse;
import org.apache.fineract.client.models.PostStaffRequest;
import org.apache.fineract.client.models.PostStaffResponse;
import org.apache.fineract.client.models.PutStaffRequest;
import org.apache.fineract.client.models.PutStaffResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface StaffApi {
  /**
   * Create a staff member
   * Creates a staff member.  Mandatory Fields:  officeId, firstname, lastname  Optional Fields:  isLoanOfficer, isActive
   * @param body  (required)
   * @return Call&lt;PostStaffResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("staff")
  Call<PostStaffResponse> createStaff(
                    @retrofit2.http.Body PostStaffRequest body    
  );

  /**
   * 
   * 
   * @param officeId  (optional)
   * @param dateFormat  (optional)
   * @return Call&lt;Void&gt;
   */
  @GET("staff/downloadtemplate")
  Call<Void> getStaffTemplate(
        @retrofit2.http.Query("officeId") Long officeId                ,     @retrofit2.http.Query("dateFormat") String dateFormat                
  );

  /**
   * 
   * 
   * @param file  (optional)
   * @param locale  (optional)
   * @param dateFormat  (optional)
   * @return Call&lt;String&gt;
   */
  @retrofit2.http.Multipart
  @POST("staff/uploadtemplate")
  Call<String> postStaffTemplate(
                        @retrofit2.http.Part("file") FormDataContentDisposition file,                     @retrofit2.http.Part("locale") String locale,                     @retrofit2.http.Part("dateFormat") String dateFormat
  );

  /**
   * Retrieve a Staff Member
   * Returns the details of a Staff Member.  Example Requests:  staff/1
   * @param staffId staffId (required)
   * @return Call&lt;GetStaffResponse&gt;
   */
  @GET("staff/{staffId}")
  Call<GetStaffResponse> retreiveStaff(
            @retrofit2.http.Path("staffId") Long staffId            
  );

  /**
   * Retrieve Staff
   * Returns the list of staff members.  Example Requests:  staff     Retrieve a Staff by status  Returns the details of a Staff based on status.  By default it Returns all the ACTIVE Staff.  If status&#x3D;INACTIVE, then it returns all INACTIVE Staff.  and for status&#x3D;ALL, it Returns both ACTIVE and INACTIVE Staff.  Example Requests:  staff?status&#x3D;active
   * @param officeId officeId (optional)
   * @param staffInOfficeHierarchy staffInOfficeHierarchy (optional, default to false)
   * @param loanOfficersOnly loanOfficersOnly (optional, default to false)
   * @param status status (optional, default to active)
   * @return Call&lt;GetStaffResponse&gt;
   */
  @GET("staff")
  Call<GetStaffResponse> retrieveStaff(
        @retrofit2.http.Query("officeId") Long officeId                ,     @retrofit2.http.Query("staffInOfficeHierarchy") Boolean staffInOfficeHierarchy                ,     @retrofit2.http.Query("loanOfficersOnly") Boolean loanOfficersOnly                ,     @retrofit2.http.Query("status") String status                
  );

  /**
   * Update a Staff Member
   * Updates the details of a staff member.
   * @param body  (required)
   * @param staffId staffId (required)
   * @return Call&lt;PutStaffResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("staff/{staffId}")
  Call<PutStaffResponse> updateStaff(
                    @retrofit2.http.Body PutStaffRequest body    ,         @retrofit2.http.Path("staffId") Long staffId            
  );

}
