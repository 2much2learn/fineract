# FetchAuthenticatedUserDetailsApi

All URIs are relative to *https://demo.fineract.dev/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**fetchAuthenticatedUserData**](FetchAuthenticatedUserDetailsApi.md#fetchAuthenticatedUserData) | **GET** userdetails | Fetch authenticated user details 

<a name="fetchAuthenticatedUserData"></a>
# **fetchAuthenticatedUserData**
> GetUserDetailsResponse fetchAuthenticatedUserData(accessToken)

Fetch authenticated user details 

checks the Authentication and returns the set roles and permissions allowed.

### Example
```java
ApiClient defaultClient = new ApiClient();

// Uncomment this if you want to use HTTP basic authorization: "basicAuth"
//defaultClient = new ApiClient("basicAuth");
//defaultClient.setCredentials("YOUR USERNAME", "YOUR PASSWORD");


// API Key Authorization: "tenantid"
// USE THIS IF YOU ARE TESTING THE LIBRARY
defaultClient = new ApiClient("tenantid");
defaultClient.setApiKey("default");

// Uncomment this if you are using OAuth2 access token for authorization: "tenantid"
//OAuth tenantid = (OAuth) defaultClient.getAuthentication("tenantid");
//tenantid.setAccessToken("YOUR ACCESS TOKEN");

FetchAuthenticatedUserDetailsApi apiService = defaultClient.createService(FetchAuthenticatedUserDetailsApi.class);

// Initialize these parameters earlier.
Call<GetUserDetailsResponse> call = apiService.fetchAuthenticatedUserData(accessToken);
call.enqueue(new Callback<GetUserDetailsResponse>() {
    @Override
    public void onResponse(Call<GetUserDetailsResponse> call, Response<GetUserDetailsResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetUserDetailsResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| access_token | [optional]

### Return type

[**GetUserDetailsResponse**](GetUserDetailsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

