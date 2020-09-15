# PocketApi

All URIs are relative to *https://demo.fineract.dev/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**handleCommands7**](PocketApi.md#handleCommands7) | **POST** self/pockets | Link/delink accounts to/from pocket
[**retrieveAll36**](PocketApi.md#retrieveAll36) | **GET** self/pockets | Retrieve accounts linked to pocket

<a name="handleCommands7"></a>
# **handleCommands7**
> PostLinkDelinkAccountsToFromPocketResponse handleCommands7(body, command)

Link/delink accounts to/from pocket

Pockets behave as favourites. An user can link his/her Loan, Savings and Share accounts to pocket for faster access. In a similar way linked accounts can be delinked from the pocket.  Example Requests:  self/pockets?command&#x3D;linkAccounts  self/pockets?command&#x3D;delinkAccounts

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

PocketApi apiService = defaultClient.createService(PocketApi.class);

// Initialize these parameters earlier.
Call<PostLinkDelinkAccountsToFromPocketResponse> call = apiService.handleCommands7(body, command);
call.enqueue(new Callback<PostLinkDelinkAccountsToFromPocketResponse>() {
    @Override
    public void onResponse(Call<PostLinkDelinkAccountsToFromPocketResponse> call, Response<PostLinkDelinkAccountsToFromPocketResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PostLinkDelinkAccountsToFromPocketResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**String**](String.md)|  | [optional]
 **command** | **String**| command | [optional]

### Return type

[**PostLinkDelinkAccountsToFromPocketResponse**](PostLinkDelinkAccountsToFromPocketResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveAll36"></a>
# **retrieveAll36**
> GetAccountsLinkedToPocketResponse retrieveAll36()

Retrieve accounts linked to pocket

All linked loan  Example Requests:   self/pockets

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

PocketApi apiService = defaultClient.createService(PocketApi.class);

// Initialize these parameters earlier.
Call<GetAccountsLinkedToPocketResponse> call = apiService.retrieveAll36();
call.enqueue(new Callback<GetAccountsLinkedToPocketResponse>() {
    @Override
    public void onResponse(Call<GetAccountsLinkedToPocketResponse> call, Response<GetAccountsLinkedToPocketResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetAccountsLinkedToPocketResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetAccountsLinkedToPocketResponse**](GetAccountsLinkedToPocketResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

