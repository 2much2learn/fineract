# TaxGroupApi

All URIs are relative to *https://demo.fineract.dev/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTaxGroup**](TaxGroupApi.md#createTaxGroup) | **POST** taxes/group | Create a new Tax Group
[**retrieveAllTaxGroups**](TaxGroupApi.md#retrieveAllTaxGroups) | **GET** taxes/group | List Tax Group
[**retrieveTaxGroup**](TaxGroupApi.md#retrieveTaxGroup) | **GET** taxes/group/{taxGroupId} | Retrieve Tax Group
[**retrieveTemplate21**](TaxGroupApi.md#retrieveTemplate21) | **GET** taxes/group/template | 
[**updateTaxGroup**](TaxGroupApi.md#updateTaxGroup) | **PUT** taxes/group/{taxGroupId} | Update Tax Group

<a name="createTaxGroup"></a>
# **createTaxGroup**
> PostTaxesGroupResponse createTaxGroup(body)

Create a new Tax Group

Create a new Tax Group Mandatory Fields: name and taxComponents Mandatory Fields in taxComponents: taxComponentId Optional Fields in taxComponents: id, startDate and endDate

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

TaxGroupApi apiService = defaultClient.createService(TaxGroupApi.class);

// Initialize these parameters earlier.
Call<PostTaxesGroupResponse> call = apiService.createTaxGroup(body);
call.enqueue(new Callback<PostTaxesGroupResponse>() {
    @Override
    public void onResponse(Call<PostTaxesGroupResponse> call, Response<PostTaxesGroupResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PostTaxesGroupResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PostTaxesGroupRequest**](PostTaxesGroupRequest.md)|  |

### Return type

[**PostTaxesGroupResponse**](PostTaxesGroupResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveAllTaxGroups"></a>
# **retrieveAllTaxGroups**
> List&lt;GetTaxesGroupResponse&gt; retrieveAllTaxGroups()

List Tax Group

List Tax Group

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

TaxGroupApi apiService = defaultClient.createService(TaxGroupApi.class);

// Initialize these parameters earlier.
Call<List&lt;GetTaxesGroupResponse&gt;> call = apiService.retrieveAllTaxGroups();
call.enqueue(new Callback<List&lt;GetTaxesGroupResponse&gt;>() {
    @Override
    public void onResponse(Call<List&lt;GetTaxesGroupResponse&gt;> call, Response<List&lt;GetTaxesGroupResponse&gt;> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<List&lt;GetTaxesGroupResponse&gt;> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;GetTaxesGroupResponse&gt;**](GetTaxesGroupResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveTaxGroup"></a>
# **retrieveTaxGroup**
> GetTaxesGroupResponse retrieveTaxGroup(taxGroupId)

Retrieve Tax Group

Retrieve Tax Group

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

TaxGroupApi apiService = defaultClient.createService(TaxGroupApi.class);

// Initialize these parameters earlier.
Call<GetTaxesGroupResponse> call = apiService.retrieveTaxGroup(taxGroupId);
call.enqueue(new Callback<GetTaxesGroupResponse>() {
    @Override
    public void onResponse(Call<GetTaxesGroupResponse> call, Response<GetTaxesGroupResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetTaxesGroupResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taxGroupId** | **Long**| taxGroupId |

### Return type

[**GetTaxesGroupResponse**](GetTaxesGroupResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveTemplate21"></a>
# **retrieveTemplate21**
> String retrieveTemplate21()



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

TaxGroupApi apiService = defaultClient.createService(TaxGroupApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.retrieveTemplate21();
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

<a name="updateTaxGroup"></a>
# **updateTaxGroup**
> PutTaxesGroupTaxGroupIdResponse updateTaxGroup(body, taxGroupId)

Update Tax Group

Updates Tax Group. Only end date can be up-datable and can insert new tax components.

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

TaxGroupApi apiService = defaultClient.createService(TaxGroupApi.class);

// Initialize these parameters earlier.
Call<PutTaxesGroupTaxGroupIdResponse> call = apiService.updateTaxGroup(body, taxGroupId);
call.enqueue(new Callback<PutTaxesGroupTaxGroupIdResponse>() {
    @Override
    public void onResponse(Call<PutTaxesGroupTaxGroupIdResponse> call, Response<PutTaxesGroupTaxGroupIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PutTaxesGroupTaxGroupIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PutTaxesGroupTaxGroupIdRequest**](PutTaxesGroupTaxGroupIdRequest.md)|  |
 **taxGroupId** | **Long**| taxGroupId |

### Return type

[**PutTaxesGroupTaxGroupIdResponse**](PutTaxesGroupTaxGroupIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

