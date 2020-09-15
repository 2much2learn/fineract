# InterestRateChartApi

All URIs are relative to *https://demo.fineract.dev/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create9**](InterestRateChartApi.md#create9) | **POST** interestratecharts | Create a Chart
[**delete13**](InterestRateChartApi.md#delete13) | **DELETE** interestratecharts/{chartId} | Delete a Chart
[**retrieveAll25**](InterestRateChartApi.md#retrieveAll25) | **GET** interestratecharts | Retrieve all Charts
[**retrieveOne15**](InterestRateChartApi.md#retrieveOne15) | **GET** interestratecharts/{chartId} | Retrieve a Chart
[**template9**](InterestRateChartApi.md#template9) | **GET** interestratecharts/template | Retrieve Chart Details Template
[**update13**](InterestRateChartApi.md#update13) | **PUT** interestratecharts/{chartId} | Update a Chart

<a name="create9"></a>
# **create9**
> PostInterestRateChartsResponse create9(body)

Create a Chart

Creates a new chart which can be attached to a term deposit products (FD or RD).

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

InterestRateChartApi apiService = defaultClient.createService(InterestRateChartApi.class);

// Initialize these parameters earlier.
Call<PostInterestRateChartsResponse> call = apiService.create9(body);
call.enqueue(new Callback<PostInterestRateChartsResponse>() {
    @Override
    public void onResponse(Call<PostInterestRateChartsResponse> call, Response<PostInterestRateChartsResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PostInterestRateChartsResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PostInterestRateChartsRequest**](PostInterestRateChartsRequest.md)|  |

### Return type

[**PostInterestRateChartsResponse**](PostInterestRateChartsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="delete13"></a>
# **delete13**
> DeleteInterestRateChartsChartIdResponse delete13(chartId)

Delete a Chart

It deletes the chart

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

InterestRateChartApi apiService = defaultClient.createService(InterestRateChartApi.class);

// Initialize these parameters earlier.
Call<DeleteInterestRateChartsChartIdResponse> call = apiService.delete13(chartId);
call.enqueue(new Callback<DeleteInterestRateChartsChartIdResponse>() {
    @Override
    public void onResponse(Call<DeleteInterestRateChartsChartIdResponse> call, Response<DeleteInterestRateChartsChartIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<DeleteInterestRateChartsChartIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chartId** | **Long**| chartId |

### Return type

[**DeleteInterestRateChartsChartIdResponse**](DeleteInterestRateChartsChartIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveAll25"></a>
# **retrieveAll25**
> List&lt;GetInterestRateChartsResponse&gt; retrieveAll25(productId)

Retrieve all Charts

Retrieve list of charts associated with a term deposit product(FD or RD). Example Requests:  interestratecharts?productId&#x3D;1

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

InterestRateChartApi apiService = defaultClient.createService(InterestRateChartApi.class);

// Initialize these parameters earlier.
Call<List&lt;GetInterestRateChartsResponse&gt;> call = apiService.retrieveAll25(productId);
call.enqueue(new Callback<List&lt;GetInterestRateChartsResponse&gt;>() {
    @Override
    public void onResponse(Call<List&lt;GetInterestRateChartsResponse&gt;> call, Response<List&lt;GetInterestRateChartsResponse&gt;> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<List&lt;GetInterestRateChartsResponse&gt;> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productId** | **Long**| productId | [optional]

### Return type

[**List&lt;GetInterestRateChartsResponse&gt;**](GetInterestRateChartsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveOne15"></a>
# **retrieveOne15**
> GetInterestRateChartsResponse retrieveOne15(chartId)

Retrieve a Chart

It retrieves the Interest Rate Chart Example Requests:  interestratecharts/1

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

InterestRateChartApi apiService = defaultClient.createService(InterestRateChartApi.class);

// Initialize these parameters earlier.
Call<GetInterestRateChartsResponse> call = apiService.retrieveOne15(chartId);
call.enqueue(new Callback<GetInterestRateChartsResponse>() {
    @Override
    public void onResponse(Call<GetInterestRateChartsResponse> call, Response<GetInterestRateChartsResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetInterestRateChartsResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chartId** | **Long**| chartId |

### Return type

[**GetInterestRateChartsResponse**](GetInterestRateChartsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="template9"></a>
# **template9**
> GetInterestRateChartsTemplateResponse template9()

Retrieve Chart Details Template

This is a convenience resource. It can be useful when building maintenance user interface screens for creating a chart. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists Example Request:  interestratecharts/template

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

InterestRateChartApi apiService = defaultClient.createService(InterestRateChartApi.class);

// Initialize these parameters earlier.
Call<GetInterestRateChartsTemplateResponse> call = apiService.template9();
call.enqueue(new Callback<GetInterestRateChartsTemplateResponse>() {
    @Override
    public void onResponse(Call<GetInterestRateChartsTemplateResponse> call, Response<GetInterestRateChartsTemplateResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetInterestRateChartsTemplateResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetInterestRateChartsTemplateResponse**](GetInterestRateChartsTemplateResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="update13"></a>
# **update13**
> PutInterestRateChartsChartIdResponse update13(body, chartId)

Update a Chart

It updates the chart

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

InterestRateChartApi apiService = defaultClient.createService(InterestRateChartApi.class);

// Initialize these parameters earlier.
Call<PutInterestRateChartsChartIdResponse> call = apiService.update13(body, chartId);
call.enqueue(new Callback<PutInterestRateChartsChartIdResponse>() {
    @Override
    public void onResponse(Call<PutInterestRateChartsChartIdResponse> call, Response<PutInterestRateChartsChartIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PutInterestRateChartsChartIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PutInterestRateChartsChartIdRequest**](PutInterestRateChartsChartIdRequest.md)|  |
 **chartId** | **Long**| chartId |

### Return type

[**PutInterestRateChartsChartIdResponse**](PutInterestRateChartsChartIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

