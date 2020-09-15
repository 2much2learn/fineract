# RecurringDepositAccountTransactionsApi

All URIs are relative to *https://demo.fineract.dev/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**handleTransactionCommands**](RecurringDepositAccountTransactionsApi.md#handleTransactionCommands) | **POST** recurringdepositaccounts/{recurringDepositAccountId}/transactions/{transactionId} | Adjust Transaction | Undo transaction
[**retrieveOne19**](RecurringDepositAccountTransactionsApi.md#retrieveOne19) | **GET** recurringdepositaccounts/{recurringDepositAccountId}/transactions/{transactionId} | Retrieve Recurring Deposit Account Transaction
[**retrieveTemplate15**](RecurringDepositAccountTransactionsApi.md#retrieveTemplate15) | **GET** recurringdepositaccounts/{recurringDepositAccountId}/transactions/template | Retrieve Recurring Deposit Account Transaction Template
[**transaction1**](RecurringDepositAccountTransactionsApi.md#transaction1) | **POST** recurringdepositaccounts/{recurringDepositAccountId}/transactions | Deposit Transaction | Withdrawal Transaction

<a name="handleTransactionCommands"></a>
# **handleTransactionCommands**
> PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse handleTransactionCommands(body, recurringDepositAccountId, transactionId, command)

Adjust Transaction | Undo transaction

Adjust Transaction:  This command modifies the given transaction.  Undo transaction:  This command reverses the given transaction.  Showing request/response for &#x27;Adjust Transaction&#x27;

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

RecurringDepositAccountTransactionsApi apiService = defaultClient.createService(RecurringDepositAccountTransactionsApi.class);

// Initialize these parameters earlier.
Call<PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse> call = apiService.handleTransactionCommands(body, recurringDepositAccountId, transactionId, command);
call.enqueue(new Callback<PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse>() {
    @Override
    public void onResponse(Call<PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse> call, Response<PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsRequest**](PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsRequest.md)|  |
 **recurringDepositAccountId** | **Long**| recurringDepositAccountId |
 **transactionId** | **Long**| transactionId |
 **command** | **String**| command | [optional]

### Return type

[**PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse**](PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveOne19"></a>
# **retrieveOne19**
> GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse retrieveOne19(recurringDepositAccountId, transactionId)

Retrieve Recurring Deposit Account Transaction

Retrieves Recurring Deposit Account Transaction  Example Requests:  recurringdepositaccounts/1/transactions/1

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

RecurringDepositAccountTransactionsApi apiService = defaultClient.createService(RecurringDepositAccountTransactionsApi.class);

// Initialize these parameters earlier.
Call<GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse> call = apiService.retrieveOne19(recurringDepositAccountId, transactionId);
call.enqueue(new Callback<GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse>() {
    @Override
    public void onResponse(Call<GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse> call, Response<GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **recurringDepositAccountId** | **Long**| recurringDepositAccountId |
 **transactionId** | **Long**| transactionId |

### Return type

[**GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse**](GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveTemplate15"></a>
# **retrieveTemplate15**
> GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTemplateResponse retrieveTemplate15(recurringDepositAccountId, command)

Retrieve Recurring Deposit Account Transaction Template

This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists Example Requests:  recurringdepositaccounts/1/transactions/template?command&#x3D;deposit  recurringdepositaccounts/1/transactions/template?command&#x3D;withdrawal

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

RecurringDepositAccountTransactionsApi apiService = defaultClient.createService(RecurringDepositAccountTransactionsApi.class);

// Initialize these parameters earlier.
Call<GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTemplateResponse> call = apiService.retrieveTemplate15(recurringDepositAccountId, command);
call.enqueue(new Callback<GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTemplateResponse>() {
    @Override
    public void onResponse(Call<GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTemplateResponse> call, Response<GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTemplateResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTemplateResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **recurringDepositAccountId** | **Long**| recurringDepositAccountId |
 **command** | **String**| command | [optional]

### Return type

[**GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTemplateResponse**](GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTemplateResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="transaction1"></a>
# **transaction1**
> PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsResponse transaction1(body, recurringDepositAccountId, command)

Deposit Transaction | Withdrawal Transaction

Deposit Transaction:  Used for a deposit transaction  Withdrawal Transaction:  Used for a Withdrawal Transaction  Showing request/response for Deposit Transaction

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

RecurringDepositAccountTransactionsApi apiService = defaultClient.createService(RecurringDepositAccountTransactionsApi.class);

// Initialize these parameters earlier.
Call<PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsResponse> call = apiService.transaction1(body, recurringDepositAccountId, command);
call.enqueue(new Callback<PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsResponse>() {
    @Override
    public void onResponse(Call<PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsResponse> call, Response<PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsRequest**](PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsRequest.md)|  |
 **recurringDepositAccountId** | **Long**| recurringDepositAccountId |
 **command** | **String**| command | [optional]

### Return type

[**PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsResponse**](PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

