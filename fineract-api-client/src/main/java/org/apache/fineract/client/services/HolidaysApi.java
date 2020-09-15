package org.apache.fineract.client.services;

import org.apache.fineract.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import org.apache.fineract.client.models.DateParam;
import org.apache.fineract.client.models.DeleteHolidaysHolidayIdResponse;
import org.apache.fineract.client.models.GetHolidaysResponse;
import org.apache.fineract.client.models.PostHolidaysHolidayIdRequest;
import org.apache.fineract.client.models.PostHolidaysHolidayIdResponse;
import org.apache.fineract.client.models.PostHolidaysRequest;
import org.apache.fineract.client.models.PostHolidaysResponse;
import org.apache.fineract.client.models.PutHolidaysHolidayIdRequest;
import org.apache.fineract.client.models.PutHolidaysHolidayIdResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface HolidaysApi {
  /**
   * Create a Holiday
   * Mandatory Fields: name, description, fromDate, toDate, repaymentsRescheduledTo, offices
   * @param body  (required)
   * @return Call&lt;PostHolidaysResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("holidays")
  Call<PostHolidaysResponse> createNewHoliday(
                    @retrofit2.http.Body PostHolidaysRequest body    
  );

  /**
   * Delete a Holiday
   * This API allows to delete a holiday. This is a soft delete the deleted holiday status is marked as deleted.
   * @param holidayId holidayId (required)
   * @return Call&lt;DeleteHolidaysHolidayIdResponse&gt;
   */
  @DELETE("holidays/{holidayId}")
  Call<DeleteHolidaysHolidayIdResponse> delete7(
            @retrofit2.http.Path("holidayId") Long holidayId            
  );

  /**
   * Activate a Holiday
   * Always Holidays are created in pending state. This API allows to activate a holiday.  Only the active holidays are considered for rescheduling the loan repayment.
   * @param body  (required)
   * @param holidayId holidayId (required)
   * @param command command (optional)
   * @return Call&lt;PostHolidaysHolidayIdResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("holidays/{holidayId}")
  Call<PostHolidaysHolidayIdResponse> handleCommands1(
                    @retrofit2.http.Body PostHolidaysHolidayIdRequest body    ,         @retrofit2.http.Path("holidayId") Long holidayId            ,     @retrofit2.http.Query("command") String command                
  );

  /**
   * List Holidays
   * Example Requests:  holidays?officeId&#x3D;1
   * @param officeId officeId (optional)
   * @param fromDate fromDate (optional)
   * @param toDate toDate (optional)
   * @param locale locale (optional)
   * @param dateFormat dateFormat (optional)
   * @return Call&lt;List&lt;GetHolidaysResponse&gt;&gt;
   */
  @GET("holidays")
  Call<List<GetHolidaysResponse>> retrieveAllHolidays(
        @retrofit2.http.Query("officeId") Long officeId                ,     @retrofit2.http.Query("fromDate") DateParam fromDate                ,     @retrofit2.http.Query("toDate") DateParam toDate                ,     @retrofit2.http.Query("locale") String locale                ,     @retrofit2.http.Query("dateFormat") String dateFormat                
  );

  /**
   * Retrieve a Holiday
   * Example Requests:  holidays/1
   * @param holidayId holidayId (required)
   * @return Call&lt;GetHolidaysResponse&gt;
   */
  @GET("holidays/{holidayId}")
  Call<GetHolidaysResponse> retrieveOne7(
            @retrofit2.http.Path("holidayId") Long holidayId            
  );

  /**
   * 
   * 
   * @return Call&lt;String&gt;
   */
  @GET("holidays/template")
  Call<String> retrieveRepaymentScheduleUpdationTyeOptions();
    

  /**
   * Update a Holiday
   * If a holiday is in pending state (created and not activated) then all fields are allowed to modify. Once holidays become active only name and descriptions are allowed to modify.
   * @param body  (required)
   * @param holidayId holidayId (required)
   * @return Call&lt;PutHolidaysHolidayIdResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("holidays/{holidayId}")
  Call<PutHolidaysHolidayIdResponse> update6(
                    @retrofit2.http.Body PutHolidaysHolidayIdRequest body    ,         @retrofit2.http.Path("holidayId") Long holidayId            
  );

}
