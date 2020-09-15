# InterestRateSlabAKAInterestBandsApi

All URIs are relative to *https://demo.fineract.dev/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create8**](InterestRateSlabAKAInterestBandsApi.md#create8) | **POST** interestratecharts/{chartId}/chartslabs | Create a Slab
[**delete12**](InterestRateSlabAKAInterestBandsApi.md#delete12) | **DELETE** interestratecharts/{chartId}/chartslabs/{chartSlabId} | Delete a Slab
[**retrieveAll24**](InterestRateSlabAKAInterestBandsApi.md#retrieveAll24) | **GET** interestratecharts/{chartId}/chartslabs | Retrieve all Slabs
[**retrieveOne14**](InterestRateSlabAKAInterestBandsApi.md#retrieveOne14) | **GET** interestratecharts/{chartId}/chartslabs/{chartSlabId} | Retrieve a Slab
[**template8**](InterestRateSlabAKAInterestBandsApi.md#template8) | **GET** interestratecharts/{chartId}/chartslabs/template | 
[**update12**](InterestRateSlabAKAInterestBandsApi.md#update12) | **PUT** interestratecharts/{chartId}/chartslabs/{chartSlabId} | Update a Slab

<a name="create8"></a>
# **create8**
> PostInterestRateChartsChartIdChartSlabsResponse create8(body, chartId)

Create a Slab

Creates a new interest rate slab for an interest rate chart. Mandatory Fields periodType, fromPeriod, annualInterestRate Optional Fields toPeriod and description Example Requests:  interestratecharts/1/chartslabs

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

InterestRateSlabAKAInterestBandsApi apiService = defaultClient.createService(InterestRateSlabAKAInterestBandsApi.class);

// Initialize these parameters earlier.
Call<PostInterestRateChartsChartIdChartSlabsResponse> call = apiService.create8(body, chartId);
call.enqueue(new Callback<PostInterestRateChartsChartIdChartSlabsResponse>() {
    @Override
    public void onResponse(Call<PostInterestRateChartsChartIdChartSlabsResponse> call, Response<PostInterestRateChartsChartIdChartSlabsResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PostInterestRateChartsChartIdChartSlabsResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PostInterestRateChartsChartIdChartSlabsRequest**](PostInterestRateChartsChartIdChartSlabsRequest.md)|  |
 **chartId** | **Long**| chartId |

### Return type

[**PostInterestRateChartsChartIdChartSlabsResponse**](PostInterestRateChartsChartIdChartSlabsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="delete12"></a>
# **delete12**
> DeleteInterestRateChartsChartIdChartSlabsResponse delete12(chartId, chartSlabId)

Delete a Slab

Delete a Slab from a chart

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

InterestRateSlabAKAInterestBandsApi apiService = defaultClient.createService(InterestRateSlabAKAInterestBandsApi.class);

// Initialize these parameters earlier.
Call<DeleteInterestRateChartsChartIdChartSlabsResponse> call = apiService.delete12(chartId, chartSlabId);
call.enqueue(new Callback<DeleteInterestRateChartsChartIdChartSlabsResponse>() {
    @Override
    public void onResponse(Call<DeleteInterestRateChartsChartIdChartSlabsResponse> call, Response<DeleteInterestRateChartsChartIdChartSlabsResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<DeleteInterestRateChartsChartIdChartSlabsResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chartId** | **Long**| chartId |
 **chartSlabId** | **Long**| chartSlabId |

### Return type

[**DeleteInterestRateChartsChartIdChartSlabsResponse**](DeleteInterestRateChartsChartIdChartSlabsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveAll24"></a>
# **retrieveAll24**
> List&lt;GetInterestRateChartsChartIdChartSlabsResponse&gt; retrieveAll24(chartId)

Retrieve all Slabs

Retrieve list of slabs associated with a chart  Example Requests:  interestratecharts/1/chartslabs

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

InterestRateSlabAKAInterestBandsApi apiService = defaultClient.createService(InterestRateSlabAKAInterestBandsApi.class);

// Initialize these parameters earlier.
Call<List&lt;GetInterestRateChartsChartIdChartSlabsResponse&gt;> call = apiService.retrieveAll24(chartId);
call.enqueue(new Callback<List&lt;GetInterestRateChartsChartIdChartSlabsResponse&gt;>() {
    @Override
    public void onResponse(Call<List&lt;GetInterestRateChartsChartIdChartSlabsResponse&gt;> call, Response<List&lt;GetInterestRateChartsChartIdChartSlabsResponse&gt;> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<List&lt;GetInterestRateChartsChartIdChartSlabsResponse&gt;> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chartId** | **Long**| chartId |

### Return type

[**List&lt;GetInterestRateChartsChartIdChartSlabsResponse&gt;**](GetInterestRateChartsChartIdChartSlabsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveOne14"></a>
# **retrieveOne14**
> GetInterestRateChartsChartIdChartSlabsResponse retrieveOne14(chartId, chartSlabId)

Retrieve a Slab

Retrieve a slab associated with an Interest rate chart  Example Requests:  interestratecharts/1/chartslabs/1 

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

InterestRateSlabAKAInterestBandsApi apiService = defaultClient.createService(InterestRateSlabAKAInterestBandsApi.class);

// Initialize these parameters earlier.
Call<GetInterestRateChartsChartIdChartSlabsResponse> call = apiService.retrieveOne14(chartId, chartSlabId);
call.enqueue(new Callback<GetInterestRateChartsChartIdChartSlabsResponse>() {
    @Override
    public void onResponse(Call<GetInterestRateChartsChartIdChartSlabsResponse> call, Response<GetInterestRateChartsChartIdChartSlabsResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetInterestRateChartsChartIdChartSlabsResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chartId** | **Long**| chartId |
 **chartSlabId** | **Long**| chartSlabId |

### Return type

[**GetInterestRateChartsChartIdChartSlabsResponse**](GetInterestRateChartsChartIdChartSlabsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="template8"></a>
# **template8**
> String template8(chartId)



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

InterestRateSlabAKAInterestBandsApi apiService = defaultClient.createService(InterestRateSlabAKAInterestBandsApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.template8(chartId);
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
 **chartId** | **Long**| chartId |

### Return type

**String**

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="update12"></a>
# **update12**
> PutInterestRateChartsChartIdChartSlabsChartSlabIdResponse update12(body, chartId, chartSlabId)

Update a Slab

It updates the Slab from chart

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

InterestRateSlabAKAInterestBandsApi apiService = defaultClient.createService(InterestRateSlabAKAInterestBandsApi.class);

// Initialize these parameters earlier.
Call<PutInterestRateChartsChartIdChartSlabsChartSlabIdResponse> call = apiService.update12(body, chartId, chartSlabId);
call.enqueue(new Callback<PutInterestRateChartsChartIdChartSlabsChartSlabIdResponse>() {
    @Override
    public void onResponse(Call<PutInterestRateChartsChartIdChartSlabsChartSlabIdResponse> call, Response<PutInterestRateChartsChartIdChartSlabsChartSlabIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PutInterestRateChartsChartIdChartSlabsChartSlabIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PutInterestRateChartsChartIdChartSlabsChartSlabIdRequest**](PutInterestRateChartsChartIdChartSlabsChartSlabIdRequest.md)|  |
 **chartId** | **Long**| chartId |
 **chartSlabId** | **Long**| chartSlabId |

### Return type

[**PutInterestRateChartsChartIdChartSlabsChartSlabIdResponse**](PutInterestRateChartsChartIdChartSlabsChartSlabIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

