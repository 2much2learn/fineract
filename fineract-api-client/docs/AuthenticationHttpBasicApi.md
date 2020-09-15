# AuthenticationHttpBasicApi

All URIs are relative to *https://demo.fineract.dev/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**authenticate**](AuthenticationHttpBasicApi.md#authenticate) | **POST** authentication | Verify authentication

<a name="authenticate"></a>
# **authenticate**
> PostAuthenticationResponse authenticate(body)

Verify authentication

Authenticates the credentials provided and returns the set roles and permissions allowed.

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

AuthenticationHttpBasicApi apiService = defaultClient.createService(AuthenticationHttpBasicApi.class);

// Initialize these parameters earlier.
Call<PostAuthenticationResponse> call = apiService.authenticate(body);
call.enqueue(new Callback<PostAuthenticationResponse>() {
    @Override
    public void onResponse(Call<PostAuthenticationResponse> call, Response<PostAuthenticationResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PostAuthenticationResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**String**](String.md)|  | [optional]

### Return type

[**PostAuthenticationResponse**](PostAuthenticationResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

