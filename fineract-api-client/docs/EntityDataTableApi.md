# EntityDataTableApi

All URIs are relative to *https://demo.fineract.dev/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createEntityDatatableCheck**](EntityDataTableApi.md#createEntityDatatableCheck) | **POST** entityDatatableChecks | Create Entity-Datatable Checks
[**deleteDatatable1**](EntityDataTableApi.md#deleteDatatable1) | **DELETE** entityDatatableChecks/{entityDatatableCheckId} | Delete Entity-Datatable Checks
[**getTemplate**](EntityDataTableApi.md#getTemplate) | **GET** entityDatatableChecks/template | Retrieve Entity-Datatable Checks Template
[**retrieveAll6**](EntityDataTableApi.md#retrieveAll6) | **GET** entityDatatableChecks | List Entity-Datatable Checks

<a name="createEntityDatatableCheck"></a>
# **createEntityDatatableCheck**
> PostEntityDatatableChecksTemplateResponse createEntityDatatableCheck(body)

Create Entity-Datatable Checks

Mandatory Fields :  entity, status, datatableName  Non-Mandatory Fields :  productId

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

EntityDataTableApi apiService = defaultClient.createService(EntityDataTableApi.class);

// Initialize these parameters earlier.
Call<PostEntityDatatableChecksTemplateResponse> call = apiService.createEntityDatatableCheck(body);
call.enqueue(new Callback<PostEntityDatatableChecksTemplateResponse>() {
    @Override
    public void onResponse(Call<PostEntityDatatableChecksTemplateResponse> call, Response<PostEntityDatatableChecksTemplateResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PostEntityDatatableChecksTemplateResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PostEntityDatatableChecksTemplateRequest**](PostEntityDatatableChecksTemplateRequest.md)|  |

### Return type

[**PostEntityDatatableChecksTemplateResponse**](PostEntityDatatableChecksTemplateResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteDatatable1"></a>
# **deleteDatatable1**
> DeleteEntityDatatableChecksTemplateResponse deleteDatatable1(entityDatatableCheckId, body)

Delete Entity-Datatable Checks

Deletes an existing Entity-Datatable Check

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

EntityDataTableApi apiService = defaultClient.createService(EntityDataTableApi.class);

// Initialize these parameters earlier.
Call<DeleteEntityDatatableChecksTemplateResponse> call = apiService.deleteDatatable1(entityDatatableCheckId, body);
call.enqueue(new Callback<DeleteEntityDatatableChecksTemplateResponse>() {
    @Override
    public void onResponse(Call<DeleteEntityDatatableChecksTemplateResponse> call, Response<DeleteEntityDatatableChecksTemplateResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<DeleteEntityDatatableChecksTemplateResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entityDatatableCheckId** | **Long**| entityDatatableCheckId |
 **body** | [**String**](String.md)|  | [optional]

### Return type

[**DeleteEntityDatatableChecksTemplateResponse**](DeleteEntityDatatableChecksTemplateResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTemplate"></a>
# **getTemplate**
> GetEntityDatatableChecksTemplateResponse getTemplate()

Retrieve Entity-Datatable Checks Template

This is a convenience resource useful for building maintenance user interface screens for Entity-Datatable Checks applications. The template data returned consists of:  Allowed description Lists Example Request:  entityDatatableChecks/template

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

EntityDataTableApi apiService = defaultClient.createService(EntityDataTableApi.class);

// Initialize these parameters earlier.
Call<GetEntityDatatableChecksTemplateResponse> call = apiService.getTemplate();
call.enqueue(new Callback<GetEntityDatatableChecksTemplateResponse>() {
    @Override
    public void onResponse(Call<GetEntityDatatableChecksTemplateResponse> call, Response<GetEntityDatatableChecksTemplateResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetEntityDatatableChecksTemplateResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetEntityDatatableChecksTemplateResponse**](GetEntityDatatableChecksTemplateResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveAll6"></a>
# **retrieveAll6**
> List&lt;GetEntityDatatableChecksResponse&gt; retrieveAll6(status, entity, productId, offset, limit)

List Entity-Datatable Checks

The list capability of Entity-Datatable Checks can support pagination.  OPTIONAL ARGUMENTS offset Integer optional, defaults to 0 Indicates the result from which pagination startslimit Integer optional, defaults to 200 Restricts the size of results returned. To override the default and return all entries you must explicitly pass a non-positive integer value for limit e.g. limit&#x3D;0, or limit&#x3D;-1 Example Request:  entityDatatableChecks?offset&#x3D;0&amp;limit&#x3D;15

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

EntityDataTableApi apiService = defaultClient.createService(EntityDataTableApi.class);

// Initialize these parameters earlier.
Call<List&lt;GetEntityDatatableChecksResponse&gt;> call = apiService.retrieveAll6(status, entity, productId, offset, limit);
call.enqueue(new Callback<List&lt;GetEntityDatatableChecksResponse&gt;>() {
    @Override
    public void onResponse(Call<List&lt;GetEntityDatatableChecksResponse&gt;> call, Response<List&lt;GetEntityDatatableChecksResponse&gt;> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<List&lt;GetEntityDatatableChecksResponse&gt;> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **status** | **Long**| status | [optional]
 **entity** | **String**| entity | [optional]
 **productId** | **Long**| productId | [optional]
 **offset** | **Integer**| offset | [optional]
 **limit** | **Integer**| limit | [optional]

### Return type

[**List&lt;GetEntityDatatableChecksResponse&gt;**](GetEntityDatatableChecksResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

