# CodesApi

All URIs are relative to *https://demo.fineract.dev/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCode**](CodesApi.md#createCode) | **POST** codes | Create a Code
[**deleteCode**](CodesApi.md#deleteCode) | **DELETE** codes/{codeId} | Delete a Code
[**retrieveCode**](CodesApi.md#retrieveCode) | **GET** codes/{codeId} | Retrieve a Code
[**retrieveCodes**](CodesApi.md#retrieveCodes) | **GET** codes | Retrieve Codes
[**updateCode**](CodesApi.md#updateCode) | **PUT** codes/{codeId} | Update a Code

<a name="createCode"></a>
# **createCode**
> PostCodesResponse createCode(body)

Create a Code

Creates a code. Codes created through api are always &#x27;user defined&#x27; and so system defined is marked as false.

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

CodesApi apiService = defaultClient.createService(CodesApi.class);

// Initialize these parameters earlier.
Call<PostCodesResponse> call = apiService.createCode(body);
call.enqueue(new Callback<PostCodesResponse>() {
    @Override
    public void onResponse(Call<PostCodesResponse> call, Response<PostCodesResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PostCodesResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PostCodesRequest**](PostCodesRequest.md)|  |

### Return type

[**PostCodesResponse**](PostCodesResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteCode"></a>
# **deleteCode**
> DeleteCodesResponse deleteCode(codeId)

Delete a Code

Deletes a code if it is not system defined.

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

CodesApi apiService = defaultClient.createService(CodesApi.class);

// Initialize these parameters earlier.
Call<DeleteCodesResponse> call = apiService.deleteCode(codeId);
call.enqueue(new Callback<DeleteCodesResponse>() {
    @Override
    public void onResponse(Call<DeleteCodesResponse> call, Response<DeleteCodesResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<DeleteCodesResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **codeId** | **Long**| codeId |

### Return type

[**DeleteCodesResponse**](DeleteCodesResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveCode"></a>
# **retrieveCode**
> GetCodesResponse retrieveCode(codeId)

Retrieve a Code

Returns the details of a Code.  Example Requests:  codes/1

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

CodesApi apiService = defaultClient.createService(CodesApi.class);

// Initialize these parameters earlier.
Call<GetCodesResponse> call = apiService.retrieveCode(codeId);
call.enqueue(new Callback<GetCodesResponse>() {
    @Override
    public void onResponse(Call<GetCodesResponse> call, Response<GetCodesResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetCodesResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **codeId** | **Long**| codeId |

### Return type

[**GetCodesResponse**](GetCodesResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveCodes"></a>
# **retrieveCodes**
> List&lt;GetCodesResponse&gt; retrieveCodes()

Retrieve Codes

Returns the list of codes.  Example Requests:  codes

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

CodesApi apiService = defaultClient.createService(CodesApi.class);

// Initialize these parameters earlier.
Call<List&lt;GetCodesResponse&gt;> call = apiService.retrieveCodes();
call.enqueue(new Callback<List&lt;GetCodesResponse&gt;>() {
    @Override
    public void onResponse(Call<List&lt;GetCodesResponse&gt;> call, Response<List&lt;GetCodesResponse&gt;> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<List&lt;GetCodesResponse&gt;> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;GetCodesResponse&gt;**](GetCodesResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateCode"></a>
# **updateCode**
> PutCodesResponse updateCode(body, codeId)

Update a Code

Updates the details of a code if it is not system defined.

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

CodesApi apiService = defaultClient.createService(CodesApi.class);

// Initialize these parameters earlier.
Call<PutCodesResponse> call = apiService.updateCode(body, codeId);
call.enqueue(new Callback<PutCodesResponse>() {
    @Override
    public void onResponse(Call<PutCodesResponse> call, Response<PutCodesResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PutCodesResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PutCodesRequest**](PutCodesRequest.md)|  |
 **codeId** | **Long**| codeId |

### Return type

[**PutCodesResponse**](PutCodesResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

