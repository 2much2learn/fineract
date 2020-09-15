# CodeValuesApi

All URIs are relative to *https://demo.fineract.dev/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCodeValue**](CodeValuesApi.md#createCodeValue) | **POST** codes/{codeId}/codevalues | Create a Code description
[**deleteCodeValue**](CodeValuesApi.md#deleteCodeValue) | **DELETE** codes/{codeId}/codevalues/{codeValueId} | Delete a Code description
[**retrieveAllCodeValues**](CodeValuesApi.md#retrieveAllCodeValues) | **GET** codes/{codeId}/codevalues | List Code Values
[**retrieveCodeValue**](CodeValuesApi.md#retrieveCodeValue) | **GET** codes/{codeId}/codevalues/{codeValueId} | Retrieve a Code description
[**updateCodeValue**](CodeValuesApi.md#updateCodeValue) | **PUT** codes/{codeId}/codevalues/{codeValueId} | Update a Code description

<a name="createCodeValue"></a>
# **createCodeValue**
> PostCodeValueDataResponse createCodeValue(body, codeId)

Create a Code description

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

CodeValuesApi apiService = defaultClient.createService(CodeValuesApi.class);

// Initialize these parameters earlier.
Call<PostCodeValueDataResponse> call = apiService.createCodeValue(body, codeId);
call.enqueue(new Callback<PostCodeValueDataResponse>() {
    @Override
    public void onResponse(Call<PostCodeValueDataResponse> call, Response<PostCodeValueDataResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PostCodeValueDataResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PostCodeValuesDataRequest**](PostCodeValuesDataRequest.md)|  |
 **codeId** | **Long**| codeId |

### Return type

[**PostCodeValueDataResponse**](PostCodeValueDataResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteCodeValue"></a>
# **deleteCodeValue**
> DeleteCodeValueDataResponse deleteCodeValue(codeId, codeValueId)

Delete a Code description

Deletes a code description

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

CodeValuesApi apiService = defaultClient.createService(CodeValuesApi.class);

// Initialize these parameters earlier.
Call<DeleteCodeValueDataResponse> call = apiService.deleteCodeValue(codeId, codeValueId);
call.enqueue(new Callback<DeleteCodeValueDataResponse>() {
    @Override
    public void onResponse(Call<DeleteCodeValueDataResponse> call, Response<DeleteCodeValueDataResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<DeleteCodeValueDataResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **codeId** | **Long**| codeId |
 **codeValueId** | **Long**| codeValueId |

### Return type

[**DeleteCodeValueDataResponse**](DeleteCodeValueDataResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveAllCodeValues"></a>
# **retrieveAllCodeValues**
> List&lt;GetCodeValuesDataResponse&gt; retrieveAllCodeValues(codeId)

List Code Values

Returns the list of Code Values for a given Code  Example Requests:  codes/1/codevalues

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

CodeValuesApi apiService = defaultClient.createService(CodeValuesApi.class);

// Initialize these parameters earlier.
Call<List&lt;GetCodeValuesDataResponse&gt;> call = apiService.retrieveAllCodeValues(codeId);
call.enqueue(new Callback<List&lt;GetCodeValuesDataResponse&gt;>() {
    @Override
    public void onResponse(Call<List&lt;GetCodeValuesDataResponse&gt;> call, Response<List&lt;GetCodeValuesDataResponse&gt;> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<List&lt;GetCodeValuesDataResponse&gt;> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **codeId** | **Long**| codeId |

### Return type

[**List&lt;GetCodeValuesDataResponse&gt;**](GetCodeValuesDataResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveCodeValue"></a>
# **retrieveCodeValue**
> GetCodeValuesDataResponse retrieveCodeValue(codeValueId, codeId)

Retrieve a Code description

Returns the details of a Code Value  Example Requests:  codes/1/codevalues/1

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

CodeValuesApi apiService = defaultClient.createService(CodeValuesApi.class);

// Initialize these parameters earlier.
Call<GetCodeValuesDataResponse> call = apiService.retrieveCodeValue(codeValueId, codeId);
call.enqueue(new Callback<GetCodeValuesDataResponse>() {
    @Override
    public void onResponse(Call<GetCodeValuesDataResponse> call, Response<GetCodeValuesDataResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetCodeValuesDataResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **codeValueId** | **Long**| codeValueId |
 **codeId** | **Long**| codeId |

### Return type

[**GetCodeValuesDataResponse**](GetCodeValuesDataResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateCodeValue"></a>
# **updateCodeValue**
> PutCodeValueDataResponse updateCodeValue(body, codeId, codeValueId)

Update a Code description

Updates the details of a code description.

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

CodeValuesApi apiService = defaultClient.createService(CodeValuesApi.class);

// Initialize these parameters earlier.
Call<PutCodeValueDataResponse> call = apiService.updateCodeValue(body, codeId, codeValueId);
call.enqueue(new Callback<PutCodeValueDataResponse>() {
    @Override
    public void onResponse(Call<PutCodeValueDataResponse> call, Response<PutCodeValueDataResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PutCodeValueDataResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PutCodeValuesDataRequest**](PutCodeValuesDataRequest.md)|  |
 **codeId** | **Long**| codeId |
 **codeValueId** | **Long**| codeValueId |

### Return type

[**PutCodeValueDataResponse**](PutCodeValueDataResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

