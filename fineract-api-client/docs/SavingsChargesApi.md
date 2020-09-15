# SavingsChargesApi

All URIs are relative to *https://demo.fineract.dev/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addSavingsAccountCharge**](SavingsChargesApi.md#addSavingsAccountCharge) | **POST** savingsaccounts/{savingsAccountId}/charges | Create a Savings account Charge
[**deleteSavingsAccountCharge**](SavingsChargesApi.md#deleteSavingsAccountCharge) | **DELETE** savingsaccounts/{savingsAccountId}/charges/{savingsAccountChargeId} | Delete a Savings account Charge
[**payOrWaiveSavingsAccountCharge**](SavingsChargesApi.md#payOrWaiveSavingsAccountCharge) | **POST** savingsaccounts/{savingsAccountId}/charges/{savingsAccountChargeId} | Pay a Savings account Charge | Waive off a Savings account Charge | Inactivate a Savings account Charge
[**retrieveAllSavingsAccountCharges**](SavingsChargesApi.md#retrieveAllSavingsAccountCharges) | **GET** savingsaccounts/{savingsAccountId}/charges | List Savings Charges
[**retrieveSavingsAccountCharge**](SavingsChargesApi.md#retrieveSavingsAccountCharge) | **GET** savingsaccounts/{savingsAccountId}/charges/{savingsAccountChargeId} | Retrieve a Savings account Charge
[**retrieveTemplate17**](SavingsChargesApi.md#retrieveTemplate17) | **GET** savingsaccounts/{savingsAccountId}/charges/template | Retrieve Savings Charges Template
[**updateSavingsAccountCharge**](SavingsChargesApi.md#updateSavingsAccountCharge) | **PUT** savingsaccounts/{savingsAccountId}/charges/{savingsAccountChargeId} | Update a Savings account Charge

<a name="addSavingsAccountCharge"></a>
# **addSavingsAccountCharge**
> PostSavingsAccountsSavingsAccountIdChargesResponse addSavingsAccountCharge(body, savingsAccountId)

Create a Savings account Charge

Creates a Savings account Charge  Mandatory Fields for Savings account Charges: chargeId, amount  chargeId, amount, dueDate, dateFormat, locale  chargeId, amount, feeOnMonthDay, monthDayFormat, locale

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

SavingsChargesApi apiService = defaultClient.createService(SavingsChargesApi.class);

// Initialize these parameters earlier.
Call<PostSavingsAccountsSavingsAccountIdChargesResponse> call = apiService.addSavingsAccountCharge(body, savingsAccountId);
call.enqueue(new Callback<PostSavingsAccountsSavingsAccountIdChargesResponse>() {
    @Override
    public void onResponse(Call<PostSavingsAccountsSavingsAccountIdChargesResponse> call, Response<PostSavingsAccountsSavingsAccountIdChargesResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PostSavingsAccountsSavingsAccountIdChargesResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PostSavingsAccountsSavingsAccountIdChargesRequest**](PostSavingsAccountsSavingsAccountIdChargesRequest.md)|  |
 **savingsAccountId** | **Long**| savingsAccountId |

### Return type

[**PostSavingsAccountsSavingsAccountIdChargesResponse**](PostSavingsAccountsSavingsAccountIdChargesResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteSavingsAccountCharge"></a>
# **deleteSavingsAccountCharge**
> DeleteSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse deleteSavingsAccountCharge(savingsAccountId, savingsAccountChargeId)

Delete a Savings account Charge

Note: Currently, A Savings account Charge may only be removed from Savings that are not yet approved.

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

SavingsChargesApi apiService = defaultClient.createService(SavingsChargesApi.class);

// Initialize these parameters earlier.
Call<DeleteSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse> call = apiService.deleteSavingsAccountCharge(savingsAccountId, savingsAccountChargeId);
call.enqueue(new Callback<DeleteSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse>() {
    @Override
    public void onResponse(Call<DeleteSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse> call, Response<DeleteSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<DeleteSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **savingsAccountId** | **Long**| savingsAccountId |
 **savingsAccountChargeId** | **Long**| savingsAccountChargeId |

### Return type

[**DeleteSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse**](DeleteSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="payOrWaiveSavingsAccountCharge"></a>
# **payOrWaiveSavingsAccountCharge**
> PostSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse payOrWaiveSavingsAccountCharge(body, savingsAccountId, savingsAccountChargeId, command)

Pay a Savings account Charge | Waive off a Savings account Charge | Inactivate a Savings account Charge

Pay a Savings account Charge:  An active charge will be paid when savings account is active and having sufficient balance.  Waive off a Savings account Charge:  Outstanding charge amount will be waived off.  Inactivate a Savings account Charge:  A charge will be allowed to inactivate when savings account is active and not having any dues as of today. If charge is overpaid, corresponding charge payment transactions will be reversed.  Showing request/response for &#x27;Pay a Savings account Charge&#x27;

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

SavingsChargesApi apiService = defaultClient.createService(SavingsChargesApi.class);

// Initialize these parameters earlier.
Call<PostSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse> call = apiService.payOrWaiveSavingsAccountCharge(body, savingsAccountId, savingsAccountChargeId, command);
call.enqueue(new Callback<PostSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse>() {
    @Override
    public void onResponse(Call<PostSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse> call, Response<PostSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PostSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PostSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdRequest**](PostSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdRequest.md)|  |
 **savingsAccountId** | **Long**| savingsAccountId |
 **savingsAccountChargeId** | **Long**| savingsAccountChargeId |
 **command** | **String**| command | [optional]

### Return type

[**PostSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse**](PostSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveAllSavingsAccountCharges"></a>
# **retrieveAllSavingsAccountCharges**
> List&lt;GetSavingsAccountsSavingsAccountIdChargesResponse&gt; retrieveAllSavingsAccountCharges(savingsAccountId, chargeStatus)

List Savings Charges

Lists Savings Charges  Example Requests:  savingsaccounts/1/charges  savingsaccounts/1/charges?chargeStatus&#x3D;all  savingsaccounts/1/charges?chargeStatus&#x3D;inactive  savingsaccounts/1/charges?chargeStatus&#x3D;active  savingsaccounts/1/charges?fields&#x3D;name,amountOrPercentage

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

SavingsChargesApi apiService = defaultClient.createService(SavingsChargesApi.class);

// Initialize these parameters earlier.
Call<List&lt;GetSavingsAccountsSavingsAccountIdChargesResponse&gt;> call = apiService.retrieveAllSavingsAccountCharges(savingsAccountId, chargeStatus);
call.enqueue(new Callback<List&lt;GetSavingsAccountsSavingsAccountIdChargesResponse&gt;>() {
    @Override
    public void onResponse(Call<List&lt;GetSavingsAccountsSavingsAccountIdChargesResponse&gt;> call, Response<List&lt;GetSavingsAccountsSavingsAccountIdChargesResponse&gt;> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<List&lt;GetSavingsAccountsSavingsAccountIdChargesResponse&gt;> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **savingsAccountId** | **Long**| savingsAccountId |
 **chargeStatus** | **String**| chargeStatus | [optional] [default to all]

### Return type

[**List&lt;GetSavingsAccountsSavingsAccountIdChargesResponse&gt;**](GetSavingsAccountsSavingsAccountIdChargesResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveSavingsAccountCharge"></a>
# **retrieveSavingsAccountCharge**
> GetSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse retrieveSavingsAccountCharge(savingsAccountId, savingsAccountChargeId)

Retrieve a Savings account Charge

Retrieves a Savings account Charge  Example Requests:  /savingsaccounts/1/charges/5   /savingsaccounts/1/charges/5?fields&#x3D;name,amountOrPercentage

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

SavingsChargesApi apiService = defaultClient.createService(SavingsChargesApi.class);

// Initialize these parameters earlier.
Call<GetSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse> call = apiService.retrieveSavingsAccountCharge(savingsAccountId, savingsAccountChargeId);
call.enqueue(new Callback<GetSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse>() {
    @Override
    public void onResponse(Call<GetSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse> call, Response<GetSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **savingsAccountId** | **Long**| savingsAccountId |
 **savingsAccountChargeId** | **Long**| savingsAccountChargeId |

### Return type

[**GetSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse**](GetSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveTemplate17"></a>
# **retrieveTemplate17**
> GetSavingsAccountsSavingsAccountIdChargesTemplateResponse retrieveTemplate17(savingsAccountId)

Retrieve Savings Charges Template

This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed description Lists Example Request:  savingsaccounts/1/charges/template

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

SavingsChargesApi apiService = defaultClient.createService(SavingsChargesApi.class);

// Initialize these parameters earlier.
Call<GetSavingsAccountsSavingsAccountIdChargesTemplateResponse> call = apiService.retrieveTemplate17(savingsAccountId);
call.enqueue(new Callback<GetSavingsAccountsSavingsAccountIdChargesTemplateResponse>() {
    @Override
    public void onResponse(Call<GetSavingsAccountsSavingsAccountIdChargesTemplateResponse> call, Response<GetSavingsAccountsSavingsAccountIdChargesTemplateResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetSavingsAccountsSavingsAccountIdChargesTemplateResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **savingsAccountId** | **Long**| savingsAccountId |

### Return type

[**GetSavingsAccountsSavingsAccountIdChargesTemplateResponse**](GetSavingsAccountsSavingsAccountIdChargesTemplateResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateSavingsAccountCharge"></a>
# **updateSavingsAccountCharge**
> PutSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse updateSavingsAccountCharge(body, savingsAccountId, savingsAccountChargeId)

Update a Savings account Charge

Currently Savings account Charges may be updated only if the Savings account is not yet approved.

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

SavingsChargesApi apiService = defaultClient.createService(SavingsChargesApi.class);

// Initialize these parameters earlier.
Call<PutSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse> call = apiService.updateSavingsAccountCharge(body, savingsAccountId, savingsAccountChargeId);
call.enqueue(new Callback<PutSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse>() {
    @Override
    public void onResponse(Call<PutSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse> call, Response<PutSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PutSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PutSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdRequest**](PutSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdRequest.md)|  |
 **savingsAccountId** | **Long**| savingsAccountId |
 **savingsAccountChargeId** | **Long**| savingsAccountChargeId |

### Return type

[**PutSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse**](PutSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

