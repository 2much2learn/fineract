package com.toomuch2learn.fineract.data.populator;

import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.services.CodesApi;

public class ApiClientTest {

    public static void main(String[] args) throws Exception {

        ApiClient client
            = ApiClient.initializeApiClient(
                "https://localhost:8443/fineract-provider/api/v1",
                "mifos", "password");

        CodesApi codesApi = client.createService(CodesApi.class);

        System.out.println("====> "+codesApi.retrieveCodes().execute().body());
    }
}
