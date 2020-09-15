# AccountingClosureApi

All URIs are relative to *https://demo.fineract.dev/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createGLClosure**](AccountingClosureApi.md#createGLClosure) | **POST** glclosures | Create an Accounting Closure
[**deleteGLClosure**](AccountingClosureApi.md#deleteGLClosure) | **DELETE** glclosures/{glClosureId} | Delete an accounting closure
[**retreiveClosure**](AccountingClosureApi.md#retreiveClosure) | **GET** glclosures/{glClosureId} | Retrieve an Accounting Closure
[**retrieveAllClosures**](AccountingClosureApi.md#retrieveAllClosures) | **GET** glclosures | List Accounting closures
[**updateGLClosure**](AccountingClosureApi.md#updateGLClosure) | **PUT** glclosures/{glClosureId} | Update an Accounting closure

<a name="createGLClosure"></a>
# **createGLClosure**
> PostGlClosuresResponse createGLClosure(body)

Create an Accounting Closure

Mandatory Fields officeId,closingDate

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

AccountingClosureApi apiService = defaultClient.createService(AccountingClosureApi.class);

// Initialize these parameters earlier.
Call<PostGlClosuresResponse> call = apiService.createGLClosure(body);
call.enqueue(new Callback<PostGlClosuresResponse>() {
    @Override
    public void onResponse(Call<PostGlClosuresResponse> call, Response<PostGlClosuresResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PostGlClosuresResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PostGlClosuresRequest**](PostGlClosuresRequest.md)|  |

### Return type

[**PostGlClosuresResponse**](PostGlClosuresResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteGLClosure"></a>
# **deleteGLClosure**
> DeleteGlClosuresResponse deleteGLClosure(glClosureId)

Delete an accounting closure

Note: Only the latest accounting closure associated with a branch may be deleted.

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

AccountingClosureApi apiService = defaultClient.createService(AccountingClosureApi.class);

// Initialize these parameters earlier.
Call<DeleteGlClosuresResponse> call = apiService.deleteGLClosure(glClosureId);
call.enqueue(new Callback<DeleteGlClosuresResponse>() {
    @Override
    public void onResponse(Call<DeleteGlClosuresResponse> call, Response<DeleteGlClosuresResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<DeleteGlClosuresResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **glClosureId** | **Long**| glclosureId |

### Return type

[**DeleteGlClosuresResponse**](DeleteGlClosuresResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retreiveClosure"></a>
# **retreiveClosure**
> GetGlClosureResponse retreiveClosure(glClosureId)

Retrieve an Accounting Closure

Example Requests:  glclosures/1   /glclosures/1?fields&#x3D;officeName,closingDate

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

AccountingClosureApi apiService = defaultClient.createService(AccountingClosureApi.class);

// Initialize these parameters earlier.
Call<GetGlClosureResponse> call = apiService.retreiveClosure(glClosureId);
call.enqueue(new Callback<GetGlClosureResponse>() {
    @Override
    public void onResponse(Call<GetGlClosureResponse> call, Response<GetGlClosureResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetGlClosureResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **glClosureId** | **Long**| glClosureId |

### Return type

[**GetGlClosureResponse**](GetGlClosureResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveAllClosures"></a>
# **retrieveAllClosures**
> List&lt;GetGlClosureResponse&gt; retrieveAllClosures(officeId)

List Accounting closures

Example Requests:  glclosures

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

AccountingClosureApi apiService = defaultClient.createService(AccountingClosureApi.class);

// Initialize these parameters earlier.
Call<List&lt;GetGlClosureResponse&gt;> call = apiService.retrieveAllClosures(officeId);
call.enqueue(new Callback<List&lt;GetGlClosureResponse&gt;>() {
    @Override
    public void onResponse(Call<List&lt;GetGlClosureResponse&gt;> call, Response<List&lt;GetGlClosureResponse&gt;> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<List&lt;GetGlClosureResponse&gt;> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **officeId** | **Long**|  | [optional]

### Return type

[**List&lt;GetGlClosureResponse&gt;**](GetGlClosureResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateGLClosure"></a>
# **updateGLClosure**
> PutGlClosuresResponse updateGLClosure(glClosureId, body)

Update an Accounting closure

Once an accounting closure is created, only the comments associated with it may be edited

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

AccountingClosureApi apiService = defaultClient.createService(AccountingClosureApi.class);

// Initialize these parameters earlier.
Call<PutGlClosuresResponse> call = apiService.updateGLClosure(glClosureId, body);
call.enqueue(new Callback<PutGlClosuresResponse>() {
    @Override
    public void onResponse(Call<PutGlClosuresResponse> call, Response<PutGlClosuresResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PutGlClosuresResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **glClosureId** | **Long**| glClosureId |
 **body** | [**PutGlClosuresRequest**](PutGlClosuresRequest.md)|  | [optional]

### Return type

[**PutGlClosuresResponse**](PutGlClosuresResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

