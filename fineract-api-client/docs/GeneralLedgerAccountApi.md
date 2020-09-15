# GeneralLedgerAccountApi

All URIs are relative to *https://demo.fineract.dev/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createGLAccount1**](GeneralLedgerAccountApi.md#createGLAccount1) | **POST** glaccounts | Create a General Ledger Account
[**deleteGLAccount1**](GeneralLedgerAccountApi.md#deleteGLAccount1) | **DELETE** glaccounts/{glAccountId} | Delete an accounting closure
[**getGlAccountsTemplate**](GeneralLedgerAccountApi.md#getGlAccountsTemplate) | **GET** glaccounts/downloadtemplate | 
[**postGlAccountsTemplate**](GeneralLedgerAccountApi.md#postGlAccountsTemplate) | **POST** glaccounts/uploadtemplate | 
[**retreiveAccount**](GeneralLedgerAccountApi.md#retreiveAccount) | **GET** glaccounts/{glAccountId} | Retrieve a General Ledger Account
[**retrieveAllAccounts**](GeneralLedgerAccountApi.md#retrieveAllAccounts) | **GET** glaccounts | List General Ledger Accounts
[**retrieveNewAccountDetails**](GeneralLedgerAccountApi.md#retrieveNewAccountDetails) | **GET** glaccounts/template | Retrieve GL Accounts Template
[**updateGLAccount1**](GeneralLedgerAccountApi.md#updateGLAccount1) | **PUT** glaccounts/{glAccountId} | Update an Accounting closure

<a name="createGLAccount1"></a>
# **createGLAccount1**
> PostGLAccountsResponse createGLAccount1(body)

Create a General Ledger Account

Note: You may optionally create Hierarchical Chart of Accounts by using the \&quot;parentId\&quot; property of an Account Mandatory Fields:  name, glCode, type, usage and manualEntriesAllowed

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

GeneralLedgerAccountApi apiService = defaultClient.createService(GeneralLedgerAccountApi.class);

// Initialize these parameters earlier.
Call<PostGLAccountsResponse> call = apiService.createGLAccount1(body);
call.enqueue(new Callback<PostGLAccountsResponse>() {
    @Override
    public void onResponse(Call<PostGLAccountsResponse> call, Response<PostGLAccountsResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PostGLAccountsResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PostGLAccountsRequest**](PostGLAccountsRequest.md)|  | [optional]

### Return type

[**PostGLAccountsResponse**](PostGLAccountsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteGLAccount1"></a>
# **deleteGLAccount1**
> DeleteGLAccountsRequest deleteGLAccount1(glAccountId)

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

GeneralLedgerAccountApi apiService = defaultClient.createService(GeneralLedgerAccountApi.class);

// Initialize these parameters earlier.
Call<DeleteGLAccountsRequest> call = apiService.deleteGLAccount1(glAccountId);
call.enqueue(new Callback<DeleteGLAccountsRequest>() {
    @Override
    public void onResponse(Call<DeleteGLAccountsRequest> call, Response<DeleteGLAccountsRequest> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<DeleteGLAccountsRequest> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **glAccountId** | **Long**| glAccountId |

### Return type

[**DeleteGLAccountsRequest**](DeleteGLAccountsRequest.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getGlAccountsTemplate"></a>
# **getGlAccountsTemplate**
> Void getGlAccountsTemplate(dateFormat)



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

GeneralLedgerAccountApi apiService = defaultClient.createService(GeneralLedgerAccountApi.class);

// Initialize these parameters earlier.
Call<Void> call = apiService.getGlAccountsTemplate(dateFormat);
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
 **dateFormat** | **String**|  | [optional]

### Return type

[**Void**](.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.ms-excel

<a name="postGlAccountsTemplate"></a>
# **postGlAccountsTemplate**
> String postGlAccountsTemplate(file, locale, dateFormat)



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

GeneralLedgerAccountApi apiService = defaultClient.createService(GeneralLedgerAccountApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.postGlAccountsTemplate(file, locale, dateFormat);
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | [**FormDataContentDisposition**](.md)|  | [optional]
 **locale** | **String**|  | [optional]
 **dateFormat** | **String**|  | [optional]

### Return type

**String**

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: */*

<a name="retreiveAccount"></a>
# **retreiveAccount**
> GetGLAccountsResponse retreiveAccount(glAccountId, fetchRunningBalance)

Retrieve a General Ledger Account

Example Requests:  glaccounts/1   glaccounts/1?template&#x3D;true   glaccounts/1?fields&#x3D;name,glCode   glaccounts/1?fetchRunningBalance&#x3D;true

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

GeneralLedgerAccountApi apiService = defaultClient.createService(GeneralLedgerAccountApi.class);

// Initialize these parameters earlier.
Call<GetGLAccountsResponse> call = apiService.retreiveAccount(glAccountId, fetchRunningBalance);
call.enqueue(new Callback<GetGLAccountsResponse>() {
    @Override
    public void onResponse(Call<GetGLAccountsResponse> call, Response<GetGLAccountsResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetGLAccountsResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **glAccountId** | **Long**| glAccountId |
 **fetchRunningBalance** | **Boolean**| fetchRunningBalance | [optional]

### Return type

[**GetGLAccountsResponse**](GetGLAccountsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveAllAccounts"></a>
# **retrieveAllAccounts**
> List&lt;GetGLAccountsResponse&gt; retrieveAllAccounts(type, searchParam, usage, manualEntriesAllowed, disabled, fetchRunningBalance)

List General Ledger Accounts

ARGUMENTS type Integer optional manualEntriesAllowed boolean optional usage Integer optional disabled boolean optional parentId Long optional tagId Long optional Example Requests:  glaccounts   glaccounts?type&#x3D;1&amp;manualEntriesAllowed&#x3D;true&amp;usage&#x3D;1&amp;disabled&#x3D;false  glaccounts?fetchRunningBalance&#x3D;true

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

GeneralLedgerAccountApi apiService = defaultClient.createService(GeneralLedgerAccountApi.class);

// Initialize these parameters earlier.
Call<List&lt;GetGLAccountsResponse&gt;> call = apiService.retrieveAllAccounts(type, searchParam, usage, manualEntriesAllowed, disabled, fetchRunningBalance);
call.enqueue(new Callback<List&lt;GetGLAccountsResponse&gt;>() {
    @Override
    public void onResponse(Call<List&lt;GetGLAccountsResponse&gt;> call, Response<List&lt;GetGLAccountsResponse&gt;> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<List&lt;GetGLAccountsResponse&gt;> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **Integer**| type | [optional]
 **searchParam** | **String**| searchParam | [optional]
 **usage** | **Integer**| usage | [optional]
 **manualEntriesAllowed** | **Boolean**| manualEntriesAllowed | [optional]
 **disabled** | **Boolean**| disabled | [optional]
 **fetchRunningBalance** | **Boolean**| fetchRunningBalance | [optional]

### Return type

[**List&lt;GetGLAccountsResponse&gt;**](GetGLAccountsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveNewAccountDetails"></a>
# **retrieveNewAccountDetails**
> GetGLAccountsTemplateResponse retrieveNewAccountDetails(type)

Retrieve GL Accounts Template

This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists Example Request:  glaccounts/template glaccounts/template?type&#x3D;1  type is optional and integer value from 1 to 5.  1.Assets  2.Liabilities  3.Equity  4.Income  5.Expenses

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

GeneralLedgerAccountApi apiService = defaultClient.createService(GeneralLedgerAccountApi.class);

// Initialize these parameters earlier.
Call<GetGLAccountsTemplateResponse> call = apiService.retrieveNewAccountDetails(type);
call.enqueue(new Callback<GetGLAccountsTemplateResponse>() {
    @Override
    public void onResponse(Call<GetGLAccountsTemplateResponse> call, Response<GetGLAccountsTemplateResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetGLAccountsTemplateResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **Integer**| type | [optional]

### Return type

[**GetGLAccountsTemplateResponse**](GetGLAccountsTemplateResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateGLAccount1"></a>
# **updateGLAccount1**
> PutGLAccountsResponse updateGLAccount1(glAccountId, body)

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

GeneralLedgerAccountApi apiService = defaultClient.createService(GeneralLedgerAccountApi.class);

// Initialize these parameters earlier.
Call<PutGLAccountsResponse> call = apiService.updateGLAccount1(glAccountId, body);
call.enqueue(new Callback<PutGLAccountsResponse>() {
    @Override
    public void onResponse(Call<PutGLAccountsResponse> call, Response<PutGLAccountsResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PutGLAccountsResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **glAccountId** | **Long**| glAccountId |
 **body** | [**PutGLAccountsRequest**](PutGLAccountsRequest.md)|  | [optional]

### Return type

[**PutGLAccountsResponse**](PutGLAccountsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

