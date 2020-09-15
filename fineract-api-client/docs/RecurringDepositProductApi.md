# RecurringDepositProductApi

All URIs are relative to *https://demo.fineract.dev/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create11**](RecurringDepositProductApi.md#create11) | **POST** recurringdepositproducts | Create a Recurring Deposit Product
[**delete17**](RecurringDepositProductApi.md#delete17) | **DELETE** recurringdepositproducts/{productId} | Delete a Recurring Deposit Product
[**retrieveAll31**](RecurringDepositProductApi.md#retrieveAll31) | **GET** recurringdepositproducts | List Recuring Deposit Products
[**retrieveOne21**](RecurringDepositProductApi.md#retrieveOne21) | **GET** recurringdepositproducts/{productId} | Retrieve a Recurring Deposit Product
[**retrieveTemplate16**](RecurringDepositProductApi.md#retrieveTemplate16) | **GET** recurringdepositproducts/template | 
[**update17**](RecurringDepositProductApi.md#update17) | **PUT** recurringdepositproducts/{productId} | Update a Recurring Deposit Product

<a name="create11"></a>
# **create11**
> PostRecurringDepositProductsResponse create11(body)

Create a Recurring Deposit Product

Creates a Recurring Deposit Product  Mandatory Fields: name, shortName, description, currencyCode, digitsAfterDecimal,inMultiplesOf, interestCompoundingPeriodType, interestCalculationType, interestCalculationDaysInYearType, minDepositTerm, minDepositTermTypeId, recurringDepositFrequency, recurringDepositFrequencyTypeId, accountingRule, depositAmount  Mandatory Fields for Cash based accounting (accountingRule &#x3D; 2): savingsReferenceAccountId, savingsControlAccountId, interestOnSavingsAccountId, incomeFromFeeAccountId, transfersInSuspenseAccountId, incomeFromPenaltyAccountId  Optional Fields: lockinPeriodFrequency, lockinPeriodFrequencyType, maxDepositTerm, maxDepositTermTypeId, inMultiplesOfDepositTerm, inMultiplesOfDepositTermTypeId, preClosurePenalApplicable, preClosurePenalInterest, preClosurePenalInterestOnTypeId, feeToIncomeAccountMappings, penaltyToIncomeAccountMappings, charges, charts, minDepositAmount, maxDepositAmount, withHoldTax, taxGroupId

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

RecurringDepositProductApi apiService = defaultClient.createService(RecurringDepositProductApi.class);

// Initialize these parameters earlier.
Call<PostRecurringDepositProductsResponse> call = apiService.create11(body);
call.enqueue(new Callback<PostRecurringDepositProductsResponse>() {
    @Override
    public void onResponse(Call<PostRecurringDepositProductsResponse> call, Response<PostRecurringDepositProductsResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PostRecurringDepositProductsResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PostRecurringDepositProductsRequest**](PostRecurringDepositProductsRequest.md)|  |

### Return type

[**PostRecurringDepositProductsResponse**](PostRecurringDepositProductsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="delete17"></a>
# **delete17**
> DeleteRecurringDepositProductsProductIdResponse delete17(productId)

Delete a Recurring Deposit Product

Deletes a Recurring Deposit Product

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

RecurringDepositProductApi apiService = defaultClient.createService(RecurringDepositProductApi.class);

// Initialize these parameters earlier.
Call<DeleteRecurringDepositProductsProductIdResponse> call = apiService.delete17(productId);
call.enqueue(new Callback<DeleteRecurringDepositProductsProductIdResponse>() {
    @Override
    public void onResponse(Call<DeleteRecurringDepositProductsProductIdResponse> call, Response<DeleteRecurringDepositProductsProductIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<DeleteRecurringDepositProductsProductIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productId** | **Long**| productId |

### Return type

[**DeleteRecurringDepositProductsProductIdResponse**](DeleteRecurringDepositProductsProductIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveAll31"></a>
# **retrieveAll31**
> List&lt;GetRecurringDepositProductsResponse&gt; retrieveAll31()

List Recuring Deposit Products

Lists Recuring Deposit Products  Example Requests:  recurringdepositproducts   recurringdepositproducts?fields&#x3D;name

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

RecurringDepositProductApi apiService = defaultClient.createService(RecurringDepositProductApi.class);

// Initialize these parameters earlier.
Call<List&lt;GetRecurringDepositProductsResponse&gt;> call = apiService.retrieveAll31();
call.enqueue(new Callback<List&lt;GetRecurringDepositProductsResponse&gt;>() {
    @Override
    public void onResponse(Call<List&lt;GetRecurringDepositProductsResponse&gt;> call, Response<List&lt;GetRecurringDepositProductsResponse&gt;> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<List&lt;GetRecurringDepositProductsResponse&gt;> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;GetRecurringDepositProductsResponse&gt;**](GetRecurringDepositProductsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveOne21"></a>
# **retrieveOne21**
> GetRecurringDepositProductsProductIdResponse retrieveOne21(productId)

Retrieve a Recurring Deposit Product

Retrieves a Recurring Deposit Product  Example Requests:  recurringdepositproducts/1   recurringdepositproducts/1?template&#x3D;true   recurringdepositproducts/1?fields&#x3D;name,description

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

RecurringDepositProductApi apiService = defaultClient.createService(RecurringDepositProductApi.class);

// Initialize these parameters earlier.
Call<GetRecurringDepositProductsProductIdResponse> call = apiService.retrieveOne21(productId);
call.enqueue(new Callback<GetRecurringDepositProductsProductIdResponse>() {
    @Override
    public void onResponse(Call<GetRecurringDepositProductsProductIdResponse> call, Response<GetRecurringDepositProductsProductIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetRecurringDepositProductsProductIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productId** | **Long**| productId |

### Return type

[**GetRecurringDepositProductsProductIdResponse**](GetRecurringDepositProductsProductIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveTemplate16"></a>
# **retrieveTemplate16**
> String retrieveTemplate16()



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

RecurringDepositProductApi apiService = defaultClient.createService(RecurringDepositProductApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.retrieveTemplate16();
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
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="update17"></a>
# **update17**
> PutRecurringDepositProductsResponse update17(body, productId)

Update a Recurring Deposit Product

Updates a Recurring Deposit Product

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

RecurringDepositProductApi apiService = defaultClient.createService(RecurringDepositProductApi.class);

// Initialize these parameters earlier.
Call<PutRecurringDepositProductsResponse> call = apiService.update17(body, productId);
call.enqueue(new Callback<PutRecurringDepositProductsResponse>() {
    @Override
    public void onResponse(Call<PutRecurringDepositProductsResponse> call, Response<PutRecurringDepositProductsResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PutRecurringDepositProductsResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PutRecurringDepositProductsRequest**](PutRecurringDepositProductsRequest.md)|  |
 **productId** | **Long**| productId |

### Return type

[**PutRecurringDepositProductsResponse**](PutRecurringDepositProductsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

