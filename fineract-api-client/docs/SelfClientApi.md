# SelfClientApi

All URIs are relative to *https://demo.fineract.dev/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addNewClientImage2**](SelfClientApi.md#addNewClientImage2) | **POST** self/clients/{clientId}/images | 
[**deleteClientImage1**](SelfClientApi.md#deleteClientImage1) | **DELETE** self/clients/{clientId}/images | 
[**retrieveAll35**](SelfClientApi.md#retrieveAll35) | **GET** self/clients | List Clients associated to the user
[**retrieveAllClientCharges1**](SelfClientApi.md#retrieveAllClientCharges1) | **GET** self/clients/{clientId}/charges | List Client Charges
[**retrieveAllClientTransactions1**](SelfClientApi.md#retrieveAllClientTransactions1) | **GET** self/clients/{clientId}/transactions | List Client Transactions
[**retrieveAssociatedAccounts1**](SelfClientApi.md#retrieveAssociatedAccounts1) | **GET** self/clients/{clientId}/accounts | Retrieve client accounts overview
[**retrieveClientCharge1**](SelfClientApi.md#retrieveClientCharge1) | **GET** self/clients/{clientId}/charges/{chargeId} | Retrieve a Client Charge
[**retrieveClientTransaction1**](SelfClientApi.md#retrieveClientTransaction1) | **GET** self/clients/{clientId}/transactions/{transactionId} | Retrieve a Client Transaction
[**retrieveImage**](SelfClientApi.md#retrieveImage) | **GET** self/clients/{clientId}/images | Retrieve Client Image
[**retrieveObligeeDetails1**](SelfClientApi.md#retrieveObligeeDetails1) | **GET** self/clients/{clientId}/obligeedetails | 
[**retrieveOne25**](SelfClientApi.md#retrieveOne25) | **GET** self/clients/{clientId} | Retrieve a Client

<a name="addNewClientImage2"></a>
# **addNewClientImage2**
> String addNewClientImage2(entity, clientId, body)



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

SelfClientApi apiService = defaultClient.createService(SelfClientApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.addNewClientImage2(entity, clientId, body);
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
 **entity** | **String**|  |
 **clientId** | **Long**|  |
 **body** | [**String**](String.md)|  | [optional]

### Return type

**String**

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: text/plain, text/htmlapplication/json, 
 - **Accept**: application/json

<a name="deleteClientImage1"></a>
# **deleteClientImage1**
> String deleteClientImage1(clientId)



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

SelfClientApi apiService = defaultClient.createService(SelfClientApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.deleteClientImage1(clientId);
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
 **clientId** | **Long**|  |

### Return type

**String**

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveAll35"></a>
# **retrieveAll35**
> GetSelfClientsResponse retrieveAll35(displayName, firstName, lastName, offset, status, limit, orderBy, sortOrder)

List Clients associated to the user

The list capability of clients can support pagination and sorting.  Example Requests:  self/clients  self/clients?fields&#x3D;displayName,officeName  self/clients?offset&#x3D;10&amp;limit&#x3D;50  self/clients?orderBy&#x3D;displayName&amp;sortOrder&#x3D;DESC

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

SelfClientApi apiService = defaultClient.createService(SelfClientApi.class);

// Initialize these parameters earlier.
Call<GetSelfClientsResponse> call = apiService.retrieveAll35(displayName, firstName, lastName, offset, status, limit, orderBy, sortOrder);
call.enqueue(new Callback<GetSelfClientsResponse>() {
    @Override
    public void onResponse(Call<GetSelfClientsResponse> call, Response<GetSelfClientsResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetSelfClientsResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **displayName** | **String**| displayName | [optional]
 **firstName** | **String**| firstName | [optional]
 **lastName** | **String**| lastName | [optional]
 **offset** | **Integer**| offset | [optional]
 **status** | **String**| status | [optional]
 **limit** | **Integer**| limit | [optional]
 **orderBy** | **String**| orderBy | [optional]
 **sortOrder** | **String**| sortOrder | [optional]

### Return type

[**GetSelfClientsResponse**](GetSelfClientsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveAllClientCharges1"></a>
# **retrieveAllClientCharges1**
> GetSelfClientsClientIdChargesResponse retrieveAllClientCharges1(clientId, chargeStatus, pendingPayment, limit, offset)

List Client Charges

The list capability of client charges supports pagination.  Example Requests:  self/clients/1/charges  self/clients/1/charges?offset&#x3D;0&amp;limit&#x3D;5

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

SelfClientApi apiService = defaultClient.createService(SelfClientApi.class);

// Initialize these parameters earlier.
Call<GetSelfClientsClientIdChargesResponse> call = apiService.retrieveAllClientCharges1(clientId, chargeStatus, pendingPayment, limit, offset);
call.enqueue(new Callback<GetSelfClientsClientIdChargesResponse>() {
    @Override
    public void onResponse(Call<GetSelfClientsClientIdChargesResponse> call, Response<GetSelfClientsClientIdChargesResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetSelfClientsClientIdChargesResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **Long**| clientId |
 **chargeStatus** | **String**| chargeStatus | [optional] [default to all]
 **pendingPayment** | **Boolean**| pendingPayment | [optional]
 **limit** | **Integer**| limit | [optional]
 **offset** | **Integer**| offset | [optional]

### Return type

[**GetSelfClientsClientIdChargesResponse**](GetSelfClientsClientIdChargesResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveAllClientTransactions1"></a>
# **retrieveAllClientTransactions1**
> GetSelfClientsClientIdTransactionsResponse retrieveAllClientTransactions1(clientId, offset, limit)

List Client Transactions

The list capability of client transaction can support pagination.  Example Requests:  self/clients/189/transactions  self/clients/189/transactions?offset&#x3D;10&amp;limit&#x3D;50

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

SelfClientApi apiService = defaultClient.createService(SelfClientApi.class);

// Initialize these parameters earlier.
Call<GetSelfClientsClientIdTransactionsResponse> call = apiService.retrieveAllClientTransactions1(clientId, offset, limit);
call.enqueue(new Callback<GetSelfClientsClientIdTransactionsResponse>() {
    @Override
    public void onResponse(Call<GetSelfClientsClientIdTransactionsResponse> call, Response<GetSelfClientsClientIdTransactionsResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetSelfClientsClientIdTransactionsResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **Long**| clientId |
 **offset** | **Integer**| offset | [optional]
 **limit** | **Integer**| limit | [optional]

### Return type

[**GetSelfClientsClientIdTransactionsResponse**](GetSelfClientsClientIdTransactionsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveAssociatedAccounts1"></a>
# **retrieveAssociatedAccounts1**
> GetSelfClientsClientIdAccountsResponse retrieveAssociatedAccounts1(clientId)

Retrieve client accounts overview

An example of how a loan portfolio summary can be provided. This is requested in a specific use case of the community application. It is quite reasonable to add resources like this to simplify User Interface development.  Example Requests:  self/clients/1/accounts   self/clients/1/accounts?fields&#x3D;loanAccounts,savingsAccounts

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

SelfClientApi apiService = defaultClient.createService(SelfClientApi.class);

// Initialize these parameters earlier.
Call<GetSelfClientsClientIdAccountsResponse> call = apiService.retrieveAssociatedAccounts1(clientId);
call.enqueue(new Callback<GetSelfClientsClientIdAccountsResponse>() {
    @Override
    public void onResponse(Call<GetSelfClientsClientIdAccountsResponse> call, Response<GetSelfClientsClientIdAccountsResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetSelfClientsClientIdAccountsResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **Long**| clientId |

### Return type

[**GetSelfClientsClientIdAccountsResponse**](GetSelfClientsClientIdAccountsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveClientCharge1"></a>
# **retrieveClientCharge1**
> GetSelfClientsClientIdChargesChargeIdResponse retrieveClientCharge1(clientId, chargeId)

Retrieve a Client Charge

Retrieves a Client Charge  Example Requests:  self/clients/1/charges/1   self/clients/1/charges/1?fields&#x3D;name,id

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

SelfClientApi apiService = defaultClient.createService(SelfClientApi.class);

// Initialize these parameters earlier.
Call<GetSelfClientsClientIdChargesChargeIdResponse> call = apiService.retrieveClientCharge1(clientId, chargeId);
call.enqueue(new Callback<GetSelfClientsClientIdChargesChargeIdResponse>() {
    @Override
    public void onResponse(Call<GetSelfClientsClientIdChargesChargeIdResponse> call, Response<GetSelfClientsClientIdChargesChargeIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetSelfClientsClientIdChargesChargeIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **Long**| clientId |
 **chargeId** | **Long**| chargeId |

### Return type

[**GetSelfClientsClientIdChargesChargeIdResponse**](GetSelfClientsClientIdChargesChargeIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveClientTransaction1"></a>
# **retrieveClientTransaction1**
> GetSelfClientsClientIdTransactionsTransactionIdResponse retrieveClientTransaction1(clientId, transactionId)

Retrieve a Client Transaction

Retrieves a Client TransactionExample Requests:  self/clients/1/transactions/1   self/clients/1/transactions/1?fields&#x3D;id,officeName

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

SelfClientApi apiService = defaultClient.createService(SelfClientApi.class);

// Initialize these parameters earlier.
Call<GetSelfClientsClientIdTransactionsTransactionIdResponse> call = apiService.retrieveClientTransaction1(clientId, transactionId);
call.enqueue(new Callback<GetSelfClientsClientIdTransactionsTransactionIdResponse>() {
    @Override
    public void onResponse(Call<GetSelfClientsClientIdTransactionsTransactionIdResponse> call, Response<GetSelfClientsClientIdTransactionsTransactionIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetSelfClientsClientIdTransactionsTransactionIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **Long**| clientId |
 **transactionId** | **Long**| transactionId |

### Return type

[**GetSelfClientsClientIdTransactionsTransactionIdResponse**](GetSelfClientsClientIdTransactionsTransactionIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveImage"></a>
# **retrieveImage**
> Void retrieveImage(clientId, maxWidth, maxHeight, output)

Retrieve Client Image

Optional arguments are identical to those of Get Image associated with an Entity (Binary file)  Example Requests:  self/clients/1/images

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

SelfClientApi apiService = defaultClient.createService(SelfClientApi.class);

// Initialize these parameters earlier.
Call<Void> call = apiService.retrieveImage(clientId, maxWidth, maxHeight, output);
call.enqueue(new Callback<Void>() {
    @Override
    public void onResponse(Call<Void> call, Response<Void> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<Void> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **Long**| clientId |
 **maxWidth** | **Integer**|  | [optional]
 **maxHeight** | **Integer**|  | [optional]
 **output** | **String**|  | [optional]

### Return type

[**Void**](.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="retrieveObligeeDetails1"></a>
# **retrieveObligeeDetails1**
> String retrieveObligeeDetails1(clientId)



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

SelfClientApi apiService = defaultClient.createService(SelfClientApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.retrieveObligeeDetails1(clientId);
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
 **clientId** | **Long**|  |

### Return type

**String**

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveOne25"></a>
# **retrieveOne25**
> GetSelfClientsClientIdResponse retrieveOne25(clientId)

Retrieve a Client

Retrieves a Client  Example Requests:  self/clients/1  self/clients/1?fields&#x3D;id,displayName,officeName

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

SelfClientApi apiService = defaultClient.createService(SelfClientApi.class);

// Initialize these parameters earlier.
Call<GetSelfClientsClientIdResponse> call = apiService.retrieveOne25(clientId);
call.enqueue(new Callback<GetSelfClientsClientIdResponse>() {
    @Override
    public void onResponse(Call<GetSelfClientsClientIdResponse> call, Response<GetSelfClientsClientIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetSelfClientsClientIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **Long**| clientId |

### Return type

[**GetSelfClientsClientIdResponse**](GetSelfClientsClientIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

