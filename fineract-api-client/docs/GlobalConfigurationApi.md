# GlobalConfigurationApi

All URIs are relative to *https://demo.fineract.dev/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**retrieveConfiguration**](GlobalConfigurationApi.md#retrieveConfiguration) | **GET** configurations | Retrieve Global Configuration | Retrieve Global Configuration for surveys
[**retrieveOne3**](GlobalConfigurationApi.md#retrieveOne3) | **GET** configurations/{configId} | Retrieve Global Configuration
[**updateConfiguration1**](GlobalConfigurationApi.md#updateConfiguration1) | **PUT** configurations/{configId} | Update Global Configuration

<a name="retrieveConfiguration"></a>
# **retrieveConfiguration**
> List&lt;GetGlobalConfigurationsResponse&gt; retrieveConfiguration(survey)

Retrieve Global Configuration | Retrieve Global Configuration for surveys

Returns the list global enable/disable configurations.  Example Requests:  configurations   Returns the list global enable/disable survey configurations.  Example Requests:  configurations/survey

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

GlobalConfigurationApi apiService = defaultClient.createService(GlobalConfigurationApi.class);

// Initialize these parameters earlier.
Call<List&lt;GetGlobalConfigurationsResponse&gt;> call = apiService.retrieveConfiguration(survey);
call.enqueue(new Callback<List&lt;GetGlobalConfigurationsResponse&gt;>() {
    @Override
    public void onResponse(Call<List&lt;GetGlobalConfigurationsResponse&gt;> call, Response<List&lt;GetGlobalConfigurationsResponse&gt;> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<List&lt;GetGlobalConfigurationsResponse&gt;> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **survey** | **Boolean**| survey | [optional] [default to false]

### Return type

[**List&lt;GetGlobalConfigurationsResponse&gt;**](GetGlobalConfigurationsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveOne3"></a>
# **retrieveOne3**
> GetGlobalConfigurationsResponse retrieveOne3(configId)

Retrieve Global Configuration

Returns a global enable/disable configurations.  Example Requests:  configurations/1

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

GlobalConfigurationApi apiService = defaultClient.createService(GlobalConfigurationApi.class);

// Initialize these parameters earlier.
Call<GetGlobalConfigurationsResponse> call = apiService.retrieveOne3(configId);
call.enqueue(new Callback<GetGlobalConfigurationsResponse>() {
    @Override
    public void onResponse(Call<GetGlobalConfigurationsResponse> call, Response<GetGlobalConfigurationsResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetGlobalConfigurationsResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **configId** | **Long**| configId |

### Return type

[**GetGlobalConfigurationsResponse**](GetGlobalConfigurationsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateConfiguration1"></a>
# **updateConfiguration1**
> PutGlobalConfigurationsResponse updateConfiguration1(body, configId)

Update Global Configuration

Updates an enable/disable global configuration item.

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

GlobalConfigurationApi apiService = defaultClient.createService(GlobalConfigurationApi.class);

// Initialize these parameters earlier.
Call<PutGlobalConfigurationsResponse> call = apiService.updateConfiguration1(body, configId);
call.enqueue(new Callback<PutGlobalConfigurationsResponse>() {
    @Override
    public void onResponse(Call<PutGlobalConfigurationsResponse> call, Response<PutGlobalConfigurationsResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PutGlobalConfigurationsResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PutGlobalConfigurationsRequest**](PutGlobalConfigurationsRequest.md)|  |
 **configId** | **Long**| configId |

### Return type

[**PutGlobalConfigurationsResponse**](PutGlobalConfigurationsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

