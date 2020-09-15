# ShareAccountApi

All URIs are relative to *https://demo.fineract.dev/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAccount**](ShareAccountApi.md#createAccount) | **POST** accounts/{type} | Submit new share application
[**getSharedAccountsTemplate**](ShareAccountApi.md#getSharedAccountsTemplate) | **GET** accounts/{type}/downloadtemplate | 
[**handleCommands2**](ShareAccountApi.md#handleCommands2) | **POST** accounts/{type}/{accountId} | Approve share application | Undo approval share application | Reject share application | Activate a share account | Close a share account | Apply additional shares on a share account | Approve additional shares request on a share account | Reject additional shares request on a share account | Redeem shares on a share account
[**postSharedAccountsTemplate**](ShareAccountApi.md#postSharedAccountsTemplate) | **POST** accounts/{type}/uploadtemplate | 
[**retrieveAccount**](ShareAccountApi.md#retrieveAccount) | **GET** accounts/{type}/{accountId} | Retrieve a share application/account
[**retrieveAllAccounts1**](ShareAccountApi.md#retrieveAllAccounts1) | **GET** accounts/{type} | List share applications/accounts
[**template7**](ShareAccountApi.md#template7) | **GET** accounts/{type}/template | Retrieve Share Account Template
[**updateAccount**](ShareAccountApi.md#updateAccount) | **PUT** accounts/{type}/{accountId} | Modify a share application

<a name="createAccount"></a>
# **createAccount**
> PostAccountsTypeResponse createAccount(body, type)

Submit new share application

Submits new share application  Mandatory Fields: clientId, productId, submittedDate, savingsAccountId, requestedShares, applicationDate  Optional Fields: accountNo, externalId  Inherited from Product (if not provided): minimumActivePeriod, minimumActivePeriodFrequencyType, lockinPeriodFrequency, lockinPeriodFrequencyType

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

ShareAccountApi apiService = defaultClient.createService(ShareAccountApi.class);

// Initialize these parameters earlier.
Call<PostAccountsTypeResponse> call = apiService.createAccount(body, type);
call.enqueue(new Callback<PostAccountsTypeResponse>() {
    @Override
    public void onResponse(Call<PostAccountsTypeResponse> call, Response<PostAccountsTypeResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PostAccountsTypeResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PostAccountsTypeRequest**](PostAccountsTypeRequest.md)|  |
 **type** | **String**| type |

### Return type

[**PostAccountsTypeResponse**](PostAccountsTypeResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSharedAccountsTemplate"></a>
# **getSharedAccountsTemplate**
> Void getSharedAccountsTemplate(type, officeId, dateFormat)



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

ShareAccountApi apiService = defaultClient.createService(ShareAccountApi.class);

// Initialize these parameters earlier.
Call<Void> call = apiService.getSharedAccountsTemplate(type, officeId, dateFormat);
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
 **type** | **String**| type |
 **officeId** | **Long**|  | [optional]
 **dateFormat** | **String**|  | [optional]

### Return type

[**Void**](.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.ms-excel

<a name="handleCommands2"></a>
# **handleCommands2**
> PostAccountsTypeAccountIdResponse handleCommands2(body, type, accountId, command)

Approve share application | Undo approval share application | Reject share application | Activate a share account | Close a share account | Apply additional shares on a share account | Approve additional shares request on a share account | Reject additional shares request on a share account | Redeem shares on a share account

Approve share application:  Approves share application so long as its in &#x27;Submitted and pending approval&#x27; state.  Undo approval share application:  Will move &#x27;approved&#x27; share application back to &#x27;Submitted and pending approval&#x27; state.  Reject share application:  Rejects share application so long as its in &#x27;Submitted and pending approval&#x27; state.  Activate a share account:  Results in an approved share application being converted into an &#x27;active&#x27; share account.  Close a share account:  Results in an Activated share application being converted into an &#x27;closed&#x27; share account.  closedDate is closure date of share account  Mandatory Fields: dateFormat,locale,closedDate  Apply additional shares on a share account:  requestedDate is requsted date of share purchase  requestedShares is number of shares to be purchase  Mandatory Fields: dateFormat,locale,requestedDate, requestedShares  Approve additional shares request on a share account  requestedShares is Share purchase transaction ids  Mandatory Fields: requestedShares  Reject additional shares request on a share account:  requestedShares is Share purchase transaction ids  Mandatory Fields: requestedShares  Redeem shares on a share account:  Results redeem some/all shares from share account.  requestedDate is requsted date of shares redeem  requestedShares is number of shares to be redeemed  Mandatory Fields: dateFormat,locale,requestedDate,requestedShares  Showing request/response for &#x27;Reject additional shares request on a share account&#x27;  For more info visit this link - https://demo.fineract.dev/fineract-provider/api-docs/apiLive.htm#shareaccounts

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

ShareAccountApi apiService = defaultClient.createService(ShareAccountApi.class);

// Initialize these parameters earlier.
Call<PostAccountsTypeAccountIdResponse> call = apiService.handleCommands2(body, type, accountId, command);
call.enqueue(new Callback<PostAccountsTypeAccountIdResponse>() {
    @Override
    public void onResponse(Call<PostAccountsTypeAccountIdResponse> call, Response<PostAccountsTypeAccountIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PostAccountsTypeAccountIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PostAccountsTypeAccountIdRequest**](PostAccountsTypeAccountIdRequest.md)|  |
 **type** | **String**| type |
 **accountId** | **Long**| accountId |
 **command** | **String**| command | [optional]

### Return type

[**PostAccountsTypeAccountIdResponse**](PostAccountsTypeAccountIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postSharedAccountsTemplate"></a>
# **postSharedAccountsTemplate**
> String postSharedAccountsTemplate(type, file, locale, dateFormat)



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

ShareAccountApi apiService = defaultClient.createService(ShareAccountApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.postSharedAccountsTemplate(type, file, locale, dateFormat);
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
 **type** | **String**| type |
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

<a name="retrieveAccount"></a>
# **retrieveAccount**
> GetAccountsTypeAccountIdResponse retrieveAccount(accountId, type)

Retrieve a share application/account

Retrieves a share application/account  Example Requests :  shareaccount/1

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

ShareAccountApi apiService = defaultClient.createService(ShareAccountApi.class);

// Initialize these parameters earlier.
Call<GetAccountsTypeAccountIdResponse> call = apiService.retrieveAccount(accountId, type);
call.enqueue(new Callback<GetAccountsTypeAccountIdResponse>() {
    @Override
    public void onResponse(Call<GetAccountsTypeAccountIdResponse> call, Response<GetAccountsTypeAccountIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetAccountsTypeAccountIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **Long**| accountId |
 **type** | **String**| type |

### Return type

[**GetAccountsTypeAccountIdResponse**](GetAccountsTypeAccountIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveAllAccounts1"></a>
# **retrieveAllAccounts1**
> GetAccountsTypeResponse retrieveAllAccounts1(type, offset, limit)

List share applications/accounts

Lists share applications/accounts  Example Requests:  shareaccount

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

ShareAccountApi apiService = defaultClient.createService(ShareAccountApi.class);

// Initialize these parameters earlier.
Call<GetAccountsTypeResponse> call = apiService.retrieveAllAccounts1(type, offset, limit);
call.enqueue(new Callback<GetAccountsTypeResponse>() {
    @Override
    public void onResponse(Call<GetAccountsTypeResponse> call, Response<GetAccountsTypeResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetAccountsTypeResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **String**| type |
 **offset** | **Integer**| offset | [optional]
 **limit** | **Integer**| limit | [optional]

### Return type

[**GetAccountsTypeResponse**](GetAccountsTypeResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="template7"></a>
# **template7**
> GetAccountsTypeTemplateResponse template7(type, clientId, productId)

Retrieve Share Account Template

This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists  Example Requests:  accounts/share/template?clientId&#x3D;1   accounts/share/template?clientId&#x3D;1&amp;productId&#x3D;1

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

ShareAccountApi apiService = defaultClient.createService(ShareAccountApi.class);

// Initialize these parameters earlier.
Call<GetAccountsTypeTemplateResponse> call = apiService.template7(type, clientId, productId);
call.enqueue(new Callback<GetAccountsTypeTemplateResponse>() {
    @Override
    public void onResponse(Call<GetAccountsTypeTemplateResponse> call, Response<GetAccountsTypeTemplateResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetAccountsTypeTemplateResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **String**| type |
 **clientId** | **Long**| clientId | [optional]
 **productId** | **Long**| productId | [optional]

### Return type

[**GetAccountsTypeTemplateResponse**](GetAccountsTypeTemplateResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateAccount"></a>
# **updateAccount**
> PutAccountsTypeAccountIdResponse updateAccount(body, type, accountId)

Modify a share application

Share application can only be modified when in &#x27;Submitted and pending approval&#x27; state. Once the application is approved, the details cannot be changed using this method. Specific api endpoints will be created to allow change of interest detail such as rate, compounding period, posting period etc

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

ShareAccountApi apiService = defaultClient.createService(ShareAccountApi.class);

// Initialize these parameters earlier.
Call<PutAccountsTypeAccountIdResponse> call = apiService.updateAccount(body, type, accountId);
call.enqueue(new Callback<PutAccountsTypeAccountIdResponse>() {
    @Override
    public void onResponse(Call<PutAccountsTypeAccountIdResponse> call, Response<PutAccountsTypeAccountIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PutAccountsTypeAccountIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PutAccountsTypeAccountIdRequest**](PutAccountsTypeAccountIdRequest.md)|  |
 **type** | **String**| type |
 **accountId** | **Long**| accountId |

### Return type

[**PutAccountsTypeAccountIdResponse**](PutAccountsTypeAccountIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

