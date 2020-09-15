# SavingsProductApi

All URIs are relative to *https://demo.fineract.dev/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create12**](SavingsProductApi.md#create12) | **POST** savingsproducts | Create a Savings Product
[**delete19**](SavingsProductApi.md#delete19) | **DELETE** savingsproducts/{productId} | Delete a Savings Product
[**retrieveAll33**](SavingsProductApi.md#retrieveAll33) | **GET** savingsproducts | List Savings Products
[**retrieveOne24**](SavingsProductApi.md#retrieveOne24) | **GET** savingsproducts/{productId} | Retrieve a Savings Product
[**retrieveTemplate19**](SavingsProductApi.md#retrieveTemplate19) | **GET** savingsproducts/template | Retrieve Savings Product Template
[**update19**](SavingsProductApi.md#update19) | **PUT** savingsproducts/{productId} | Update a Savings Product

<a name="create12"></a>
# **create12**
> PostSavingsProductsResponse create12(body)

Create a Savings Product

Creates a Savings Product  Mandatory Fields: name, shortName, description, currencyCode, digitsAfterDecimal,inMultiplesOf, nominalAnnualInterestRate, interestCompoundingPeriodType, interestCalculationType, interestCalculationDaysInYearType,accountingRule  Mandatory Fields for Cash based accounting (accountingRule &#x3D; 2): savingsReferenceAccountId, savingsControlAccountId, interestOnSavingsAccountId, incomeFromFeeAccountId, transfersInSuspenseAccountId, incomeFromPenaltyAccountId  Optional Fields: minRequiredOpeningBalance, lockinPeriodFrequency, lockinPeriodFrequencyType, withdrawalFeeForTransfers, paymentChannelToFundSourceMappings, feeToIncomeAccountMappings, penaltyToIncomeAccountMappings, charges, allowOverdraft, overdraftLimit, minBalanceForInterestCalculation,withHoldTax,taxGroupId

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

SavingsProductApi apiService = defaultClient.createService(SavingsProductApi.class);

// Initialize these parameters earlier.
Call<PostSavingsProductsResponse> call = apiService.create12(body);
call.enqueue(new Callback<PostSavingsProductsResponse>() {
    @Override
    public void onResponse(Call<PostSavingsProductsResponse> call, Response<PostSavingsProductsResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PostSavingsProductsResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PostSavingsProductsRequest**](PostSavingsProductsRequest.md)|  |

### Return type

[**PostSavingsProductsResponse**](PostSavingsProductsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="delete19"></a>
# **delete19**
> DeleteSavingsProductsProductIdResponse delete19(productId)

Delete a Savings Product

Deletes a Savings Product

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

SavingsProductApi apiService = defaultClient.createService(SavingsProductApi.class);

// Initialize these parameters earlier.
Call<DeleteSavingsProductsProductIdResponse> call = apiService.delete19(productId);
call.enqueue(new Callback<DeleteSavingsProductsProductIdResponse>() {
    @Override
    public void onResponse(Call<DeleteSavingsProductsProductIdResponse> call, Response<DeleteSavingsProductsProductIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<DeleteSavingsProductsProductIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productId** | **Long**| productId |

### Return type

[**DeleteSavingsProductsProductIdResponse**](DeleteSavingsProductsProductIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveAll33"></a>
# **retrieveAll33**
> List&lt;GetSavingsProductsResponse&gt; retrieveAll33()

List Savings Products

Lists Savings Products  Example Requests:  savingsproducts  savingsproducts?fields&#x3D;name

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

SavingsProductApi apiService = defaultClient.createService(SavingsProductApi.class);

// Initialize these parameters earlier.
Call<List&lt;GetSavingsProductsResponse&gt;> call = apiService.retrieveAll33();
call.enqueue(new Callback<List&lt;GetSavingsProductsResponse&gt;>() {
    @Override
    public void onResponse(Call<List&lt;GetSavingsProductsResponse&gt;> call, Response<List&lt;GetSavingsProductsResponse&gt;> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<List&lt;GetSavingsProductsResponse&gt;> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;GetSavingsProductsResponse&gt;**](GetSavingsProductsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveOne24"></a>
# **retrieveOne24**
> GetSavingsProductsProductIdResponse retrieveOne24(productId)

Retrieve a Savings Product

Retrieves a Savings Product  Example Requests:  savingsproducts/1  savingsproducts/1?template&#x3D;true  savingsproducts/1?fields&#x3D;name,description

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

SavingsProductApi apiService = defaultClient.createService(SavingsProductApi.class);

// Initialize these parameters earlier.
Call<GetSavingsProductsProductIdResponse> call = apiService.retrieveOne24(productId);
call.enqueue(new Callback<GetSavingsProductsProductIdResponse>() {
    @Override
    public void onResponse(Call<GetSavingsProductsProductIdResponse> call, Response<GetSavingsProductsProductIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetSavingsProductsProductIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productId** | **Long**| productId |

### Return type

[**GetSavingsProductsProductIdResponse**](GetSavingsProductsProductIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveTemplate19"></a>
# **retrieveTemplate19**
> GetSavingsProductsTemplateResponse retrieveTemplate19()

Retrieve Savings Product Template

This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed description Lists Example Request:  savingsproducts/template

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

SavingsProductApi apiService = defaultClient.createService(SavingsProductApi.class);

// Initialize these parameters earlier.
Call<GetSavingsProductsTemplateResponse> call = apiService.retrieveTemplate19();
call.enqueue(new Callback<GetSavingsProductsTemplateResponse>() {
    @Override
    public void onResponse(Call<GetSavingsProductsTemplateResponse> call, Response<GetSavingsProductsTemplateResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetSavingsProductsTemplateResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetSavingsProductsTemplateResponse**](GetSavingsProductsTemplateResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="update19"></a>
# **update19**
> PutSavingsProductsProductIdResponse update19(body, productId)

Update a Savings Product

Updates a Savings Product

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

SavingsProductApi apiService = defaultClient.createService(SavingsProductApi.class);

// Initialize these parameters earlier.
Call<PutSavingsProductsProductIdResponse> call = apiService.update19(body, productId);
call.enqueue(new Callback<PutSavingsProductsProductIdResponse>() {
    @Override
    public void onResponse(Call<PutSavingsProductsProductIdResponse> call, Response<PutSavingsProductsProductIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PutSavingsProductsProductIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PutSavingsProductsProductIdRequest**](PutSavingsProductsProductIdRequest.md)|  |
 **productId** | **Long**| productId |

### Return type

[**PutSavingsProductsProductIdResponse**](PutSavingsProductsProductIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

