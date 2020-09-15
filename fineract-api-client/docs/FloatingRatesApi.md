# FloatingRatesApi

All URIs are relative to *https://demo.fineract.dev/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createFloatingRate**](FloatingRatesApi.md#createFloatingRate) | **POST** floatingrates | Create a new Floating Rate
[**retrieveAll21**](FloatingRatesApi.md#retrieveAll21) | **GET** floatingrates | List Floating Rates
[**retrieveOne11**](FloatingRatesApi.md#retrieveOne11) | **GET** floatingrates/{floatingRateId} | Retrieve Floating Rate
[**updateFloatingRate**](FloatingRatesApi.md#updateFloatingRate) | **PUT** floatingrates/{floatingRateId} | Update Floating Rate

<a name="createFloatingRate"></a>
# **createFloatingRate**
> PostFloatingRatesResponse createFloatingRate(body)

Create a new Floating Rate

Creates a new Floating Rate Mandatory Fields: name Optional Fields: isBaseLendingRate, isActive, ratePeriods

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

FloatingRatesApi apiService = defaultClient.createService(FloatingRatesApi.class);

// Initialize these parameters earlier.
Call<PostFloatingRatesResponse> call = apiService.createFloatingRate(body);
call.enqueue(new Callback<PostFloatingRatesResponse>() {
    @Override
    public void onResponse(Call<PostFloatingRatesResponse> call, Response<PostFloatingRatesResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PostFloatingRatesResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PostFloatingRatesRequest**](PostFloatingRatesRequest.md)|  |

### Return type

[**PostFloatingRatesResponse**](PostFloatingRatesResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveAll21"></a>
# **retrieveAll21**
> List&lt;GetFloatingRatesResponse&gt; retrieveAll21()

List Floating Rates

Lists Floating Rates

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

FloatingRatesApi apiService = defaultClient.createService(FloatingRatesApi.class);

// Initialize these parameters earlier.
Call<List&lt;GetFloatingRatesResponse&gt;> call = apiService.retrieveAll21();
call.enqueue(new Callback<List&lt;GetFloatingRatesResponse&gt;>() {
    @Override
    public void onResponse(Call<List&lt;GetFloatingRatesResponse&gt;> call, Response<List&lt;GetFloatingRatesResponse&gt;> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<List&lt;GetFloatingRatesResponse&gt;> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;GetFloatingRatesResponse&gt;**](GetFloatingRatesResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveOne11"></a>
# **retrieveOne11**
> GetFloatingRatesFloatingRateIdResponse retrieveOne11(floatingRateId)

Retrieve Floating Rate

Retrieves Floating Rate

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

FloatingRatesApi apiService = defaultClient.createService(FloatingRatesApi.class);

// Initialize these parameters earlier.
Call<GetFloatingRatesFloatingRateIdResponse> call = apiService.retrieveOne11(floatingRateId);
call.enqueue(new Callback<GetFloatingRatesFloatingRateIdResponse>() {
    @Override
    public void onResponse(Call<GetFloatingRatesFloatingRateIdResponse> call, Response<GetFloatingRatesFloatingRateIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetFloatingRatesFloatingRateIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **floatingRateId** | **Long**| floatingRateId |

### Return type

[**GetFloatingRatesFloatingRateIdResponse**](GetFloatingRatesFloatingRateIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateFloatingRate"></a>
# **updateFloatingRate**
> PutFloatingRatesFloatingRateIdResponse updateFloatingRate(body, floatingRateId)

Update Floating Rate

Updates new Floating Rate. Rate Periods in the past cannot be modified. All the future rateperiods would be replaced with the new ratePeriods data sent.

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

FloatingRatesApi apiService = defaultClient.createService(FloatingRatesApi.class);

// Initialize these parameters earlier.
Call<PutFloatingRatesFloatingRateIdResponse> call = apiService.updateFloatingRate(body, floatingRateId);
call.enqueue(new Callback<PutFloatingRatesFloatingRateIdResponse>() {
    @Override
    public void onResponse(Call<PutFloatingRatesFloatingRateIdResponse> call, Response<PutFloatingRatesFloatingRateIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PutFloatingRatesFloatingRateIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PutFloatingRatesFloatingRateIdRequest**](PutFloatingRatesFloatingRateIdRequest.md)|  |
 **floatingRateId** | **Long**| floatingRateId |

### Return type

[**PutFloatingRatesFloatingRateIdResponse**](PutFloatingRatesFloatingRateIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

