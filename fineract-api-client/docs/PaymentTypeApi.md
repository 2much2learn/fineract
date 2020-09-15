# PaymentTypeApi

All URIs are relative to *https://demo.fineract.dev/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPaymentType**](PaymentTypeApi.md#createPaymentType) | **POST** paymenttypes | Create a Payment Type
[**deleteCode1**](PaymentTypeApi.md#deleteCode1) | **DELETE** paymenttypes/{paymentTypeId} | Delete a Payment Type
[**getAllPaymentTypes**](PaymentTypeApi.md#getAllPaymentTypes) | **GET** paymenttypes | Retrieve all Payment Types
[**retrieveOnePaymentType**](PaymentTypeApi.md#retrieveOnePaymentType) | **GET** paymenttypes/{paymentTypeId} | Retrieve a Payment Type
[**updatePaymentType**](PaymentTypeApi.md#updatePaymentType) | **PUT** paymenttypes/{paymentTypeId} | Update a Payment Type

<a name="createPaymentType"></a>
# **createPaymentType**
> PostPaymentTypesResponse createPaymentType(body)

Create a Payment Type

Creates a new Payment type  Mandatory Fields: name  Optional Fields: Description, isCashPayment,Position

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

PaymentTypeApi apiService = defaultClient.createService(PaymentTypeApi.class);

// Initialize these parameters earlier.
Call<PostPaymentTypesResponse> call = apiService.createPaymentType(body);
call.enqueue(new Callback<PostPaymentTypesResponse>() {
    @Override
    public void onResponse(Call<PostPaymentTypesResponse> call, Response<PostPaymentTypesResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PostPaymentTypesResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PostPaymentTypesRequest**](PostPaymentTypesRequest.md)|  |

### Return type

[**PostPaymentTypesResponse**](PostPaymentTypesResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteCode1"></a>
# **deleteCode1**
> DeletePaymentTypesPaymentTypeIdResponse deleteCode1(paymentTypeId)

Delete a Payment Type

Deletes payment type

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

PaymentTypeApi apiService = defaultClient.createService(PaymentTypeApi.class);

// Initialize these parameters earlier.
Call<DeletePaymentTypesPaymentTypeIdResponse> call = apiService.deleteCode1(paymentTypeId);
call.enqueue(new Callback<DeletePaymentTypesPaymentTypeIdResponse>() {
    @Override
    public void onResponse(Call<DeletePaymentTypesPaymentTypeIdResponse> call, Response<DeletePaymentTypesPaymentTypeIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<DeletePaymentTypesPaymentTypeIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paymentTypeId** | **Long**| paymentTypeId |

### Return type

[**DeletePaymentTypesPaymentTypeIdResponse**](DeletePaymentTypesPaymentTypeIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAllPaymentTypes"></a>
# **getAllPaymentTypes**
> List&lt;GetPaymentTypesResponse&gt; getAllPaymentTypes()

Retrieve all Payment Types

Retrieve list of payment types

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

PaymentTypeApi apiService = defaultClient.createService(PaymentTypeApi.class);

// Initialize these parameters earlier.
Call<List&lt;GetPaymentTypesResponse&gt;> call = apiService.getAllPaymentTypes();
call.enqueue(new Callback<List&lt;GetPaymentTypesResponse&gt;>() {
    @Override
    public void onResponse(Call<List&lt;GetPaymentTypesResponse&gt;> call, Response<List&lt;GetPaymentTypesResponse&gt;> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<List&lt;GetPaymentTypesResponse&gt;> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;GetPaymentTypesResponse&gt;**](GetPaymentTypesResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveOnePaymentType"></a>
# **retrieveOnePaymentType**
> GetPaymentTypesPaymentTypeIdResponse retrieveOnePaymentType(paymentTypeId)

Retrieve a Payment Type

Retrieves a payment type

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

PaymentTypeApi apiService = defaultClient.createService(PaymentTypeApi.class);

// Initialize these parameters earlier.
Call<GetPaymentTypesPaymentTypeIdResponse> call = apiService.retrieveOnePaymentType(paymentTypeId);
call.enqueue(new Callback<GetPaymentTypesPaymentTypeIdResponse>() {
    @Override
    public void onResponse(Call<GetPaymentTypesPaymentTypeIdResponse> call, Response<GetPaymentTypesPaymentTypeIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetPaymentTypesPaymentTypeIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paymentTypeId** | **Long**| paymentTypeId |

### Return type

[**GetPaymentTypesPaymentTypeIdResponse**](GetPaymentTypesPaymentTypeIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updatePaymentType"></a>
# **updatePaymentType**
> PutPaymentTypesPaymentTypeIdResponse updatePaymentType(body, paymentTypeId)

Update a Payment Type

Updates a Payment Type

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

PaymentTypeApi apiService = defaultClient.createService(PaymentTypeApi.class);

// Initialize these parameters earlier.
Call<PutPaymentTypesPaymentTypeIdResponse> call = apiService.updatePaymentType(body, paymentTypeId);
call.enqueue(new Callback<PutPaymentTypesPaymentTypeIdResponse>() {
    @Override
    public void onResponse(Call<PutPaymentTypesPaymentTypeIdResponse> call, Response<PutPaymentTypesPaymentTypeIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PutPaymentTypesPaymentTypeIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PutPaymentTypesPaymentTypeIdRequest**](PutPaymentTypesPaymentTypeIdRequest.md)|  |
 **paymentTypeId** | **Long**| paymentTypeId |

### Return type

[**PutPaymentTypesPaymentTypeIdResponse**](PutPaymentTypesPaymentTypeIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

