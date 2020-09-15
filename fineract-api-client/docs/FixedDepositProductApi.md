# FixedDepositProductApi

All URIs are relative to *https://demo.fineract.dev/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create10**](FixedDepositProductApi.md#create10) | **POST** fixeddepositproducts | Create a Fixed Deposit Product
[**delete15**](FixedDepositProductApi.md#delete15) | **DELETE** fixeddepositproducts/{productId} | Delete a Fixed Deposit Product
[**retrieveAll29**](FixedDepositProductApi.md#retrieveAll29) | **GET** fixeddepositproducts | List Fixed Deposit Products
[**retrieveOne18**](FixedDepositProductApi.md#retrieveOne18) | **GET** fixeddepositproducts/{productId} | Retrieve a Fixed Deposit Product
[**retrieveTemplate14**](FixedDepositProductApi.md#retrieveTemplate14) | **GET** fixeddepositproducts/template | 
[**update15**](FixedDepositProductApi.md#update15) | **PUT** fixeddepositproducts/{productId} | Update a Fixed Deposit Product

<a name="create10"></a>
# **create10**
> PostFixedDepositProductsResponse create10(body)

Create a Fixed Deposit Product

Creates a Fixed Deposit Product  Mandatory Fields: name, shortName, description, currencyCode, digitsAfterDecimal,inMultiplesOf, interestCompoundingPeriodType, interestCalculationType, interestCalculationDaysInYearType, minDepositTerm, minDepositTermTypeId, accountingRule  Optional Fields: lockinPeriodFrequency, lockinPeriodFrequencyType, maxDepositTerm, maxDepositTermTypeId, inMultiplesOfDepositTerm, inMultiplesOfDepositTermTypeId, preClosurePenalApplicable, preClosurePenalInterest, preClosurePenalInterestOnTypeId, feeToIncomeAccountMappings, penaltyToIncomeAccountMappings, charges, charts, , withHoldTax, taxGroupId   Mandatory Fields for Cash based accounting (accountingRule &#x3D; 2): savingsReferenceAccountId, savingsControlAccountId, interestOnSavingsAccountId, incomeFromFeeAccountId, transfersInSuspenseAccountId, incomeFromPenaltyAccountId

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

FixedDepositProductApi apiService = defaultClient.createService(FixedDepositProductApi.class);

// Initialize these parameters earlier.
Call<PostFixedDepositProductsResponse> call = apiService.create10(body);
call.enqueue(new Callback<PostFixedDepositProductsResponse>() {
    @Override
    public void onResponse(Call<PostFixedDepositProductsResponse> call, Response<PostFixedDepositProductsResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PostFixedDepositProductsResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PostFixedDepositProductsRequest**](PostFixedDepositProductsRequest.md)|  |

### Return type

[**PostFixedDepositProductsResponse**](PostFixedDepositProductsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="delete15"></a>
# **delete15**
> DeleteFixedDepositProductsProductIdResponse delete15(productId)

Delete a Fixed Deposit Product

Deletes a Fixed Deposit Product

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

FixedDepositProductApi apiService = defaultClient.createService(FixedDepositProductApi.class);

// Initialize these parameters earlier.
Call<DeleteFixedDepositProductsProductIdResponse> call = apiService.delete15(productId);
call.enqueue(new Callback<DeleteFixedDepositProductsProductIdResponse>() {
    @Override
    public void onResponse(Call<DeleteFixedDepositProductsProductIdResponse> call, Response<DeleteFixedDepositProductsProductIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<DeleteFixedDepositProductsProductIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productId** | **Long**| productId |

### Return type

[**DeleteFixedDepositProductsProductIdResponse**](DeleteFixedDepositProductsProductIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveAll29"></a>
# **retrieveAll29**
> List&lt;GetFixedDepositProductsResponse&gt; retrieveAll29()

List Fixed Deposit Products

Lists Fixed Deposit Products  Example Requests:  fixeddepositproducts   fixeddepositproducts?fields&#x3D;name

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

FixedDepositProductApi apiService = defaultClient.createService(FixedDepositProductApi.class);

// Initialize these parameters earlier.
Call<List&lt;GetFixedDepositProductsResponse&gt;> call = apiService.retrieveAll29();
call.enqueue(new Callback<List&lt;GetFixedDepositProductsResponse&gt;>() {
    @Override
    public void onResponse(Call<List&lt;GetFixedDepositProductsResponse&gt;> call, Response<List&lt;GetFixedDepositProductsResponse&gt;> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<List&lt;GetFixedDepositProductsResponse&gt;> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;GetFixedDepositProductsResponse&gt;**](GetFixedDepositProductsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveOne18"></a>
# **retrieveOne18**
> GetFixedDepositProductsProductIdResponse retrieveOne18(productId)

Retrieve a Fixed Deposit Product

Retrieves a Fixed Deposit Product  Example Requests:  fixeddepositproducts/1   fixeddepositproducts/1?template&#x3D;true   fixeddepositproducts/1?fields&#x3D;name,description

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

FixedDepositProductApi apiService = defaultClient.createService(FixedDepositProductApi.class);

// Initialize these parameters earlier.
Call<GetFixedDepositProductsProductIdResponse> call = apiService.retrieveOne18(productId);
call.enqueue(new Callback<GetFixedDepositProductsProductIdResponse>() {
    @Override
    public void onResponse(Call<GetFixedDepositProductsProductIdResponse> call, Response<GetFixedDepositProductsProductIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetFixedDepositProductsProductIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productId** | **Long**| productId |

### Return type

[**GetFixedDepositProductsProductIdResponse**](GetFixedDepositProductsProductIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveTemplate14"></a>
# **retrieveTemplate14**
> String retrieveTemplate14()



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

FixedDepositProductApi apiService = defaultClient.createService(FixedDepositProductApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.retrieveTemplate14();
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

<a name="update15"></a>
# **update15**
> PutFixedDepositProductsProductIdResponse update15(body, productId)

Update a Fixed Deposit Product

Updates a Fixed Deposit Product

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

FixedDepositProductApi apiService = defaultClient.createService(FixedDepositProductApi.class);

// Initialize these parameters earlier.
Call<PutFixedDepositProductsProductIdResponse> call = apiService.update15(body, productId);
call.enqueue(new Callback<PutFixedDepositProductsProductIdResponse>() {
    @Override
    public void onResponse(Call<PutFixedDepositProductsProductIdResponse> call, Response<PutFixedDepositProductsProductIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PutFixedDepositProductsProductIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PutFixedDepositProductsProductIdRequest**](PutFixedDepositProductsProductIdRequest.md)|  |
 **productId** | **Long**| productId |

### Return type

[**PutFixedDepositProductsProductIdResponse**](PutFixedDepositProductsProductIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

