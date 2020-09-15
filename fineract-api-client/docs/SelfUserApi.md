# SelfUserApi

All URIs are relative to *https://demo.fineract.dev/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**update21**](SelfUserApi.md#update21) | **PUT** self/user | Update User

<a name="update21"></a>
# **update21**
> PutSelfUserResponse update21(body)

Update User

This API can be used by Self Service user to update their own user information. Currently, \&quot;password\&quot; and \&quot;repeatPassword\&quot; are the only parameters accepted.

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

SelfUserApi apiService = defaultClient.createService(SelfUserApi.class);

// Initialize these parameters earlier.
Call<PutSelfUserResponse> call = apiService.update21(body);
call.enqueue(new Callback<PutSelfUserResponse>() {
    @Override
    public void onResponse(Call<PutSelfUserResponse> call, Response<PutSelfUserResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PutSelfUserResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PutSelfUserRequest**](PutSelfUserRequest.md)|  |

### Return type

[**PutSelfUserResponse**](PutSelfUserResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

