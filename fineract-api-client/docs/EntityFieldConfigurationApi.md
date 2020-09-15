# EntityFieldConfigurationApi

All URIs are relative to *https://demo.fineract.dev/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAddresses**](EntityFieldConfigurationApi.md#getAddresses) | **GET** fieldconfiguration/{entity} | Retrieves the Entity Field Configuration

<a name="getAddresses"></a>
# **getAddresses**
> List&lt;GetFieldConfigurationEntityResponse&gt; getAddresses(entity)

Retrieves the Entity Field Configuration

It retrieves all the Entity Field Configuration

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

EntityFieldConfigurationApi apiService = defaultClient.createService(EntityFieldConfigurationApi.class);

// Initialize these parameters earlier.
Call<List&lt;GetFieldConfigurationEntityResponse&gt;> call = apiService.getAddresses(entity);
call.enqueue(new Callback<List&lt;GetFieldConfigurationEntityResponse&gt;>() {
    @Override
    public void onResponse(Call<List&lt;GetFieldConfigurationEntityResponse&gt;> call, Response<List&lt;GetFieldConfigurationEntityResponse&gt;> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<List&lt;GetFieldConfigurationEntityResponse&gt;> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entity** | **String**| entity |

### Return type

[**List&lt;GetFieldConfigurationEntityResponse&gt;**](GetFieldConfigurationEntityResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

