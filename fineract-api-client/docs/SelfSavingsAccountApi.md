# SelfSavingsAccountApi

All URIs are relative to *https://demo.fineract.dev/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**modifySavingsAccountApplication**](SelfSavingsAccountApi.md#modifySavingsAccountApplication) | **PUT** self/savingsaccounts/{accountId} | 
[**retrieveAllSavingsAccountCharges1**](SelfSavingsAccountApi.md#retrieveAllSavingsAccountCharges1) | **GET** self/savingsaccounts/{accountId}/charges | List Savings Charges
[**retrieveSavings**](SelfSavingsAccountApi.md#retrieveSavings) | **GET** self/savingsaccounts/{accountId} | Retrieve a savings account
[**retrieveSavingsAccountCharge1**](SelfSavingsAccountApi.md#retrieveSavingsAccountCharge1) | **GET** self/savingsaccounts/{accountId}/charges/{savingsAccountChargeId} | Retrieve a Savings account Charge
[**retrieveSavingsTransaction**](SelfSavingsAccountApi.md#retrieveSavingsTransaction) | **GET** self/savingsaccounts/{accountId}/transactions/{transactionId} | Retrieve Savings Account Transaction
[**submitSavingsAccountApplication**](SelfSavingsAccountApi.md#submitSavingsAccountApplication) | **POST** self/savingsaccounts | 
[**template18**](SelfSavingsAccountApi.md#template18) | **GET** self/savingsaccounts/template | 

<a name="modifySavingsAccountApplication"></a>
# **modifySavingsAccountApplication**
> String modifySavingsAccountApplication(accountId, body, command)



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

SelfSavingsAccountApi apiService = defaultClient.createService(SelfSavingsAccountApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.modifySavingsAccountApplication(accountId, body, command);
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
 **body** | [**String**](String.md)|  | [optional]
 **command** | **String**|  | [optional]

### Return type

**String**

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveAllSavingsAccountCharges1"></a>
# **retrieveAllSavingsAccountCharges1**
> List&lt;GetSelfSavingsAccountsAccountIdChargesResponse&gt; retrieveAllSavingsAccountCharges1(accountId, chargeStatus)

List Savings Charges

Lists Savings Charges  Example Requests:  self/savingsaccounts/1/charges  self/savingsaccounts/1/charges?chargeStatus&#x3D;inactive  self/savingsaccounts/1/charges?fields&#x3D;name,amountOrPercentage

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

SelfSavingsAccountApi apiService = defaultClient.createService(SelfSavingsAccountApi.class);

// Initialize these parameters earlier.
Call<List&lt;GetSelfSavingsAccountsAccountIdChargesResponse&gt;> call = apiService.retrieveAllSavingsAccountCharges1(accountId, chargeStatus);
call.enqueue(new Callback<List&lt;GetSelfSavingsAccountsAccountIdChargesResponse&gt;>() {
    @Override
    public void onResponse(Call<List&lt;GetSelfSavingsAccountsAccountIdChargesResponse&gt;> call, Response<List&lt;GetSelfSavingsAccountsAccountIdChargesResponse&gt;> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<List&lt;GetSelfSavingsAccountsAccountIdChargesResponse&gt;> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **Long**| accountId |
 **chargeStatus** | **String**| chargeStatus | [optional] [default to all]

### Return type

[**List&lt;GetSelfSavingsAccountsAccountIdChargesResponse&gt;**](GetSelfSavingsAccountsAccountIdChargesResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveSavings"></a>
# **retrieveSavings**
> GetSelfSavingsAccountsResponse retrieveSavings(accountId, chargeStatus)

Retrieve a savings account

Retrieves a savings account  Example Requests :  self/savingsaccounts/1   self/savingsaccounts/1?associations&#x3D;transactions

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

SelfSavingsAccountApi apiService = defaultClient.createService(SelfSavingsAccountApi.class);

// Initialize these parameters earlier.
Call<GetSelfSavingsAccountsResponse> call = apiService.retrieveSavings(accountId, chargeStatus);
call.enqueue(new Callback<GetSelfSavingsAccountsResponse>() {
    @Override
    public void onResponse(Call<GetSelfSavingsAccountsResponse> call, Response<GetSelfSavingsAccountsResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetSelfSavingsAccountsResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **Long**| accountId |
 **chargeStatus** | **String**| chargeStatus | [optional] [default to all]

### Return type

[**GetSelfSavingsAccountsResponse**](GetSelfSavingsAccountsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveSavingsAccountCharge1"></a>
# **retrieveSavingsAccountCharge1**
> GetSelfSavingsAccountsAccountIdChargesSavingsAccountChargeIdResponse retrieveSavingsAccountCharge1(accountId, savingsAccountChargeId)

Retrieve a Savings account Charge

Retrieves a Savings account Charge  Example Requests:  self/savingsaccounts/1/charges/5   self/savingsaccounts/1/charges/5?fields&#x3D;name,amountOrPercentage

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

SelfSavingsAccountApi apiService = defaultClient.createService(SelfSavingsAccountApi.class);

// Initialize these parameters earlier.
Call<GetSelfSavingsAccountsAccountIdChargesSavingsAccountChargeIdResponse> call = apiService.retrieveSavingsAccountCharge1(accountId, savingsAccountChargeId);
call.enqueue(new Callback<GetSelfSavingsAccountsAccountIdChargesSavingsAccountChargeIdResponse>() {
    @Override
    public void onResponse(Call<GetSelfSavingsAccountsAccountIdChargesSavingsAccountChargeIdResponse> call, Response<GetSelfSavingsAccountsAccountIdChargesSavingsAccountChargeIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetSelfSavingsAccountsAccountIdChargesSavingsAccountChargeIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **Long**| accountId |
 **savingsAccountChargeId** | **Long**| savingsAccountChargeId |

### Return type

[**GetSelfSavingsAccountsAccountIdChargesSavingsAccountChargeIdResponse**](GetSelfSavingsAccountsAccountIdChargesSavingsAccountChargeIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveSavingsTransaction"></a>
# **retrieveSavingsTransaction**
> GetSelfSavingsAccountsAccountIdTransactionsTransactionIdResponse retrieveSavingsTransaction(accountId, transactionId)

Retrieve Savings Account Transaction

Retrieves Savings Account Transaction  Example Requests:  self/savingsaccounts/1/transactions/1

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

SelfSavingsAccountApi apiService = defaultClient.createService(SelfSavingsAccountApi.class);

// Initialize these parameters earlier.
Call<GetSelfSavingsAccountsAccountIdTransactionsTransactionIdResponse> call = apiService.retrieveSavingsTransaction(accountId, transactionId);
call.enqueue(new Callback<GetSelfSavingsAccountsAccountIdTransactionsTransactionIdResponse>() {
    @Override
    public void onResponse(Call<GetSelfSavingsAccountsAccountIdTransactionsTransactionIdResponse> call, Response<GetSelfSavingsAccountsAccountIdTransactionsTransactionIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetSelfSavingsAccountsAccountIdTransactionsTransactionIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **Long**| accountId |
 **transactionId** | **Long**| transactionId |

### Return type

[**GetSelfSavingsAccountsAccountIdTransactionsTransactionIdResponse**](GetSelfSavingsAccountsAccountIdTransactionsTransactionIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="submitSavingsAccountApplication"></a>
# **submitSavingsAccountApplication**
> String submitSavingsAccountApplication(body, command)



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

SelfSavingsAccountApi apiService = defaultClient.createService(SelfSavingsAccountApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.submitSavingsAccountApplication(body, command);
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
 **body** | [**String**](String.md)|  | [optional]
 **command** | **String**|  | [optional]

### Return type

**String**

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="template18"></a>
# **template18**
> String template18(clientId, productId)



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

SelfSavingsAccountApi apiService = defaultClient.createService(SelfSavingsAccountApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.template18(clientId, productId);
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
 **clientId** | **Long**|  | [optional]
 **productId** | **Long**|  | [optional]

### Return type

**String**

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

