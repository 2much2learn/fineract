package org.apache.fineract.client.services;

import org.apache.fineract.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface MixTaxonomyApi {
  /**
   * 
   * 
   * @return Call&lt;String&gt;
   */
  @GET("mixtaxonomy")
  Call<String> retrieveAll14();
    

}
