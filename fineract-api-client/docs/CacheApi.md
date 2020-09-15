# CacheApi

All URIs are relative to *https://demo.fineract.dev/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**retrieveAll4**](CacheApi.md#retrieveAll4) | **GET** caches | Retrieve Cache Types
[**switchCache**](CacheApi.md#switchCache) | **PUT** caches | Switch Cache

<a name="retrieveAll4"></a>
# **retrieveAll4**
> List&lt;GetCachesResponse&gt; retrieveAll4()

Retrieve Cache Types

Returns the list of caches.  Example Requests:  caches

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

CacheApi apiService = defaultClient.createService(CacheApi.class);

// Initialize these parameters earlier.
Call<List&lt;GetCachesResponse&gt;> call = apiService.retrieveAll4();
call.enqueue(new Callback<List&lt;GetCachesResponse&gt;>() {
    @Override
    public void onResponse(Call<List&lt;GetCachesResponse&gt;> call, Response<List&lt;GetCachesResponse&gt;> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<List&lt;GetCachesResponse&gt;> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;GetCachesResponse&gt;**](GetCachesResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="switchCache"></a>
# **switchCache**
> PutCachesResponse switchCache(body)

Switch Cache

Switches the cache to chosen one.

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

CacheApi apiService = defaultClient.createService(CacheApi.class);

// Initialize these parameters earlier.
Call<PutCachesResponse> call = apiService.switchCache(body);
call.enqueue(new Callback<PutCachesResponse>() {
    @Override
    public void onResponse(Call<PutCachesResponse> call, Response<PutCachesResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PutCachesResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PutCachesRequest**](PutCachesRequest.md)|  |

### Return type

[**PutCachesResponse**](PutCachesResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

