# SelfAuthenticationApi

All URIs are relative to *https://demo.fineract.dev/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**authenticate1**](SelfAuthenticationApi.md#authenticate1) | **POST** self/authentication | Verify authentication

<a name="authenticate1"></a>
# **authenticate1**
> PostSelfAuthenticationResponse authenticate1(body)

Verify authentication

Authenticates the credentials provided and returns the set roles and permissions allowed.  Please visit this link for more info - https://demo.fineract.dev/fineract-provider/api-docs/apiLive.htm#selfbasicauth

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

SelfAuthenticationApi apiService = defaultClient.createService(SelfAuthenticationApi.class);

// Initialize these parameters earlier.
Call<PostSelfAuthenticationResponse> call = apiService.authenticate1(body);
call.enqueue(new Callback<PostSelfAuthenticationResponse>() {
    @Override
    public void onResponse(Call<PostSelfAuthenticationResponse> call, Response<PostSelfAuthenticationResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PostSelfAuthenticationResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**String**](String.md)|  | [optional]

### Return type

[**PostSelfAuthenticationResponse**](PostSelfAuthenticationResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

