# MappingFinancialActivitiesToAccountsApi

All URIs are relative to *https://demo.fineract.dev/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createGLAccount**](MappingFinancialActivitiesToAccountsApi.md#createGLAccount) | **POST** financialactivityaccounts | Create a new Financial Activity to Accounts Mapping
[**deleteGLAccount**](MappingFinancialActivitiesToAccountsApi.md#deleteGLAccount) | **DELETE** financialactivityaccounts/{mappingId} | Delete a Financial Activity to Account Mapping
[**retreive**](MappingFinancialActivitiesToAccountsApi.md#retreive) | **GET** financialactivityaccounts/{mappingId} | Retrieve a Financial Activity to Account Mapping 
[**retrieveAll**](MappingFinancialActivitiesToAccountsApi.md#retrieveAll) | **GET** financialactivityaccounts | List Financial Activities to Accounts Mappings
[**retrieveTemplate**](MappingFinancialActivitiesToAccountsApi.md#retrieveTemplate) | **GET** financialactivityaccounts/template | 
[**updateGLAccount**](MappingFinancialActivitiesToAccountsApi.md#updateGLAccount) | **PUT** financialactivityaccounts/{mappingId} | Update a Financial Activity to Account Mapping

<a name="createGLAccount"></a>
# **createGLAccount**
> PostFinancialActivityAccountsResponse createGLAccount(body)

Create a new Financial Activity to Accounts Mapping

Mandatory Fields financialActivityId, glAccountId

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

MappingFinancialActivitiesToAccountsApi apiService = defaultClient.createService(MappingFinancialActivitiesToAccountsApi.class);

// Initialize these parameters earlier.
Call<PostFinancialActivityAccountsResponse> call = apiService.createGLAccount(body);
call.enqueue(new Callback<PostFinancialActivityAccountsResponse>() {
    @Override
    public void onResponse(Call<PostFinancialActivityAccountsResponse> call, Response<PostFinancialActivityAccountsResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PostFinancialActivityAccountsResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PostFinancialActivityAccountsRequest**](PostFinancialActivityAccountsRequest.md)|  | [optional]

### Return type

[**PostFinancialActivityAccountsResponse**](PostFinancialActivityAccountsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteGLAccount"></a>
# **deleteGLAccount**
> DeleteFinancialActivityAccountsResponse deleteGLAccount(mappingId)

Delete a Financial Activity to Account Mapping

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

MappingFinancialActivitiesToAccountsApi apiService = defaultClient.createService(MappingFinancialActivitiesToAccountsApi.class);

// Initialize these parameters earlier.
Call<DeleteFinancialActivityAccountsResponse> call = apiService.deleteGLAccount(mappingId);
call.enqueue(new Callback<DeleteFinancialActivityAccountsResponse>() {
    @Override
    public void onResponse(Call<DeleteFinancialActivityAccountsResponse> call, Response<DeleteFinancialActivityAccountsResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<DeleteFinancialActivityAccountsResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mappingId** | **Long**| mappingId |

### Return type

[**DeleteFinancialActivityAccountsResponse**](DeleteFinancialActivityAccountsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retreive"></a>
# **retreive**
> GetFinancialActivityAccountsResponse retreive(mappingId)

Retrieve a Financial Activity to Account Mapping 

Example Requests:  financialactivityaccounts/1

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

MappingFinancialActivitiesToAccountsApi apiService = defaultClient.createService(MappingFinancialActivitiesToAccountsApi.class);

// Initialize these parameters earlier.
Call<GetFinancialActivityAccountsResponse> call = apiService.retreive(mappingId);
call.enqueue(new Callback<GetFinancialActivityAccountsResponse>() {
    @Override
    public void onResponse(Call<GetFinancialActivityAccountsResponse> call, Response<GetFinancialActivityAccountsResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetFinancialActivityAccountsResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mappingId** | **Long**| mappingId |

### Return type

[**GetFinancialActivityAccountsResponse**](GetFinancialActivityAccountsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveAll"></a>
# **retrieveAll**
> List&lt;GetFinancialActivityAccountsResponse&gt; retrieveAll()

List Financial Activities to Accounts Mappings

Example Requests:  financialactivityaccounts

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

MappingFinancialActivitiesToAccountsApi apiService = defaultClient.createService(MappingFinancialActivitiesToAccountsApi.class);

// Initialize these parameters earlier.
Call<List&lt;GetFinancialActivityAccountsResponse&gt;> call = apiService.retrieveAll();
call.enqueue(new Callback<List&lt;GetFinancialActivityAccountsResponse&gt;>() {
    @Override
    public void onResponse(Call<List&lt;GetFinancialActivityAccountsResponse&gt;> call, Response<List&lt;GetFinancialActivityAccountsResponse&gt;> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<List&lt;GetFinancialActivityAccountsResponse&gt;> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;GetFinancialActivityAccountsResponse&gt;**](GetFinancialActivityAccountsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveTemplate"></a>
# **retrieveTemplate**
> String retrieveTemplate()



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

MappingFinancialActivitiesToAccountsApi apiService = defaultClient.createService(MappingFinancialActivitiesToAccountsApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.retrieveTemplate();
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
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateGLAccount"></a>
# **updateGLAccount**
> PutFinancialActivityAccountsResponse updateGLAccount(mappingId, body)

Update a Financial Activity to Account Mapping

the API updates the Ledger account linked to a Financial Activity  

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

MappingFinancialActivitiesToAccountsApi apiService = defaultClient.createService(MappingFinancialActivitiesToAccountsApi.class);

// Initialize these parameters earlier.
Call<PutFinancialActivityAccountsResponse> call = apiService.updateGLAccount(mappingId, body);
call.enqueue(new Callback<PutFinancialActivityAccountsResponse>() {
    @Override
    public void onResponse(Call<PutFinancialActivityAccountsResponse> call, Response<PutFinancialActivityAccountsResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PutFinancialActivityAccountsResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mappingId** | **Long**| mappingId |
 **body** | [**PostFinancialActivityAccountsRequest**](PostFinancialActivityAccountsRequest.md)|  | [optional]

### Return type

[**PutFinancialActivityAccountsResponse**](PutFinancialActivityAccountsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

