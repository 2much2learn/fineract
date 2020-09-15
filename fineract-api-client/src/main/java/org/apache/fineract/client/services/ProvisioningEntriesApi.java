package org.apache.fineract.client.services;

import org.apache.fineract.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import org.apache.fineract.client.models.LoanProductProvisioningEntryData;
import org.apache.fineract.client.models.PostProvisioningEntriesRequest;
import org.apache.fineract.client.models.PostProvisioningEntriesResponse;
import org.apache.fineract.client.models.ProvisioningEntryData;
import org.apache.fineract.client.models.PutProvisioningEntriesRequest;
import org.apache.fineract.client.models.PutProvisioningEntriesResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ProvisioningEntriesApi {
  /**
   * Create new Provisioning Entries
   * Creates a new Provisioning Entries  Mandatory Fields date dateFormat locale Optional Fields createjournalentries
   * @param body  (optional)
   * @return Call&lt;PostProvisioningEntriesResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("provisioningentries")
  Call<PostProvisioningEntriesResponse> createProvisioningEntries(
                    @retrofit2.http.Body PostProvisioningEntriesRequest body    
  );

  /**
   * Recreates Provisioning Entry
   * Recreates Provisioning Entry | createjournalentry.
   * @param entryId entryId (required)
   * @param body  (optional)
   * @param command command&#x3D;createjournalentry command&#x3D;recreateprovisioningentry (optional)
   * @return Call&lt;PutProvisioningEntriesResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("provisioningentries/{entryId}")
  Call<PutProvisioningEntriesResponse> modifyProvisioningEntry(
            @retrofit2.http.Path("entryId") Long entryId            ,                 @retrofit2.http.Body PutProvisioningEntriesRequest body    ,     @retrofit2.http.Query("command") String command                
  );

  /**
   * List all Provisioning Entries
   * 
   * @param offset offset (optional)
   * @param limit limit (optional)
   * @return Call&lt;List&lt;ProvisioningEntryData&gt;&gt;
   */
  @GET("provisioningentries")
  Call<List<ProvisioningEntryData>> retrieveAllProvisioningEntries(
        @retrofit2.http.Query("offset") Integer offset                ,     @retrofit2.http.Query("limit") Integer limit                
  );

  /**
   * 
   * 
   * @param entryId  (optional)
   * @param offset  (optional)
   * @param limit  (optional)
   * @param officeId  (optional)
   * @param productId  (optional)
   * @param categoryId  (optional)
   * @return Call&lt;LoanProductProvisioningEntryData&gt;
   */
  @GET("provisioningentries/entries")
  Call<LoanProductProvisioningEntryData> retrieveProviioningEntries(
        @retrofit2.http.Query("entryId") Long entryId                ,     @retrofit2.http.Query("offset") Integer offset                ,     @retrofit2.http.Query("limit") Integer limit                ,     @retrofit2.http.Query("officeId") Long officeId                ,     @retrofit2.http.Query("productId") Long productId                ,     @retrofit2.http.Query("categoryId") Long categoryId                
  );

  /**
   * Retrieves a Provisioning Entry
   * Returns the details of a generated Provisioning Entry.
   * @param entryId entryId (required)
   * @return Call&lt;ProvisioningEntryData&gt;
   */
  @GET("provisioningentries/{entryId}")
  Call<ProvisioningEntryData> retrieveProvisioningEntry(
            @retrofit2.http.Path("entryId") Long entryId            
  );

}
