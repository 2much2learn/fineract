# SelfUserDetailsApi

All URIs are relative to *https://demo.fineract.dev/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**fetchAuthenticatedUserData1**](SelfUserDetailsApi.md#fetchAuthenticatedUserData1) | **GET** self/userdetails | Fetch authenticated user details

<a name="fetchAuthenticatedUserData1"></a>
# **fetchAuthenticatedUserData1**
> GetSelfUserDetailsResponse fetchAuthenticatedUserData1(accessToken)

Fetch authenticated user details

Checks the Authentication and returns the set roles and permissions allowed  For more info visit this link - https://demo.fineract.dev/fineract-provider/api-docs/apiLive.htm#selfoauth

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

SelfUserDetailsApi apiService = defaultClient.createService(SelfUserDetailsApi.class);

// Initialize these parameters earlier.
Call<GetSelfUserDetailsResponse> call = apiService.fetchAuthenticatedUserData1(accessToken);
call.enqueue(new Callback<GetSelfUserDetailsResponse>() {
    @Override
    public void onResponse(Call<GetSelfUserDetailsResponse> call, Response<GetSelfUserDetailsResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetSelfUserDetailsResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| äccess_token | [optional]

### Return type

[**GetSelfUserDetailsResponse**](GetSelfUserDetailsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

