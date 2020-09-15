# SelfShareAccountsApi

All URIs are relative to *https://demo.fineract.dev/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAccount1**](SelfShareAccountsApi.md#createAccount1) | **POST** self/shareaccounts | Submit new share application
[**retrieveShareAccount**](SelfShareAccountsApi.md#retrieveShareAccount) | **GET** self/shareaccounts/{accountId} | Retrieve a share application/account
[**template19**](SelfShareAccountsApi.md#template19) | **GET** self/shareaccounts/template | Retrieve Share Account Template

<a name="createAccount1"></a>
# **createAccount1**
> List&lt;PostNewShareApplicationResponse&gt; createAccount1(body)

Submit new share application

Mandatory fields:  clientId, productId, submittedDate, savingsAccountId, requestedShares, applicationDate   Optional Fields  accountNo, externalId   Inherited from Product (if not provided)  minimumActivePeriod, minimumActivePeriodFrequencyType, lockinPeriodFrequency, lockinPeriodFrequencyType.

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

SelfShareAccountsApi apiService = defaultClient.createService(SelfShareAccountsApi.class);

// Initialize these parameters earlier.
Call<List&lt;PostNewShareApplicationResponse&gt;> call = apiService.createAccount1(body);
call.enqueue(new Callback<List&lt;PostNewShareApplicationResponse&gt;>() {
    @Override
    public void onResponse(Call<List&lt;PostNewShareApplicationResponse&gt;> call, Response<List&lt;PostNewShareApplicationResponse&gt;> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<List&lt;PostNewShareApplicationResponse&gt;> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**String**](String.md)|  | [optional]

### Return type

[**List&lt;PostNewShareApplicationResponse&gt;**](PostNewShareApplicationResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveShareAccount"></a>
# **retrieveShareAccount**
> String retrieveShareAccount(accountId)

Retrieve a share application/account

   Example Requests:  self/shareaccounts/12 

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

SelfShareAccountsApi apiService = defaultClient.createService(SelfShareAccountsApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.retrieveShareAccount(accountId);
call.enqueue(new Callback<String>() {
    @Override
    public void onResponse(Call<String> call, Response<String> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<String> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **Long**|  |

### Return type

**String**

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="template19"></a>
# **template19**
> List&lt;GetShareAccountsClientIdProductIdResponse&gt; template19(clientId, productId)

Retrieve Share Account Template

This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of: Field Defaults  Allowed Value Lists   Arguments  clientId:Integer mandatory productId:Integer optionalIf entered, productId, productName and selectedProduct fields are returned. Example Requests:  self/shareaccounts/template?clientId&#x3D;14  self/shareaccounts/template?clientId&#x3D;14&amp;productId&#x3D;3 

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

SelfShareAccountsApi apiService = defaultClient.createService(SelfShareAccountsApi.class);

// Initialize these parameters earlier.
Call<List&lt;GetShareAccountsClientIdProductIdResponse&gt;> call = apiService.template19(clientId, productId);
call.enqueue(new Callback<List&lt;GetShareAccountsClientIdProductIdResponse&gt;>() {
    @Override
    public void onResponse(Call<List&lt;GetShareAccountsClientIdProductIdResponse&gt;> call, Response<List&lt;GetShareAccountsClientIdProductIdResponse&gt;> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<List&lt;GetShareAccountsClientIdProductIdResponse&gt;> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **Long**|  | [optional]
 **productId** | **Long**|  | [optional]

### Return type

[**List&lt;GetShareAccountsClientIdProductIdResponse&gt;**](GetShareAccountsClientIdProductIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

