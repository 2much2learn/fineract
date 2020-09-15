# ExternalServicesApi

All URIs are relative to *https://demo.fineract.dev/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**retrieveOne2**](ExternalServicesApi.md#retrieveOne2) | **GET** externalservice/{servicename} | Retrieve External Services Configuration
[**updateExternalServiceProperties**](ExternalServicesApi.md#updateExternalServiceProperties) | **PUT** externalservice/{servicename} | Update External Service

<a name="retrieveOne2"></a>
# **retrieveOne2**
> ExternalServicesPropertiesData retrieveOne2(servicename)

Retrieve External Services Configuration

Returns a external Service configurations based on the Service Name.  Service Names supported are S3 and SMTP.  Example Requests:  externalservice/SMTP

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

ExternalServicesApi apiService = defaultClient.createService(ExternalServicesApi.class);

// Initialize these parameters earlier.
Call<ExternalServicesPropertiesData> call = apiService.retrieveOne2(servicename);
call.enqueue(new Callback<ExternalServicesPropertiesData>() {
    @Override
    public void onResponse(Call<ExternalServicesPropertiesData> call, Response<ExternalServicesPropertiesData> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<ExternalServicesPropertiesData> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **servicename** | **String**| servicename |

### Return type

[**ExternalServicesPropertiesData**](ExternalServicesPropertiesData.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateExternalServiceProperties"></a>
# **updateExternalServiceProperties**
> Void updateExternalServiceProperties(body, servicename)

Update External Service

Updates the external Service Configuration for a Service Name.  Example:   externalservice/S3

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

ExternalServicesApi apiService = defaultClient.createService(ExternalServicesApi.class);

// Initialize these parameters earlier.
Call<Void> call = apiService.updateExternalServiceProperties(body, servicename);
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
 **body** | [**PutExternalServiceRequest**](PutExternalServiceRequest.md)|  |
 **servicename** | **String**| servicename |

### Return type

[**Void**](.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

