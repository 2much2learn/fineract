package org.apache.fineract.client.services;

import org.apache.fineract.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import org.apache.fineract.client.models.PutSelfUserRequest;
import org.apache.fineract.client.models.PutSelfUserResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface SelfUserApi {
  /**
   * Update User
   * This API can be used by Self Service user to update their own user information. Currently, \&quot;password\&quot; and \&quot;repeatPassword\&quot; are the only parameters accepted.
   * @param body  (required)
   * @return Call&lt;PutSelfUserResponse&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @PUT("self/user")
  Call<PutSelfUserResponse> update21(
                    @retrofit2.http.Body PutSelfUserRequest body    
  );

}
