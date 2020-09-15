# MakerCheckerOr4EyeFunctionalityApi

All URIs are relative to *https://demo.fineract.dev/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**approveMakerCheckerEntry**](MakerCheckerOr4EyeFunctionalityApi.md#approveMakerCheckerEntry) | **POST** makercheckers/{auditId} | Approve Maker Checker Entry | Reject Maker Checker Entry
[**deleteMakerCheckerEntry**](MakerCheckerOr4EyeFunctionalityApi.md#deleteMakerCheckerEntry) | **DELETE** makercheckers/{auditId} | Delete Maker Checker Entry
[**retrieveAuditSearchTemplate1**](MakerCheckerOr4EyeFunctionalityApi.md#retrieveAuditSearchTemplate1) | **GET** makercheckers/searchtemplate | Maker Checker Search Template
[**retrieveCommands**](MakerCheckerOr4EyeFunctionalityApi.md#retrieveCommands) | **GET** makercheckers | List Maker Checker Entries

<a name="approveMakerCheckerEntry"></a>
# **approveMakerCheckerEntry**
> PostMakerCheckersResponse approveMakerCheckerEntry(auditId, command)

Approve Maker Checker Entry | Reject Maker Checker Entry

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

MakerCheckerOr4EyeFunctionalityApi apiService = defaultClient.createService(MakerCheckerOr4EyeFunctionalityApi.class);

// Initialize these parameters earlier.
Call<PostMakerCheckersResponse> call = apiService.approveMakerCheckerEntry(auditId, command);
call.enqueue(new Callback<PostMakerCheckersResponse>() {
    @Override
    public void onResponse(Call<PostMakerCheckersResponse> call, Response<PostMakerCheckersResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PostMakerCheckersResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **auditId** | **Long**| auditId |
 **command** | **String**| command | [optional]

### Return type

[**PostMakerCheckersResponse**](PostMakerCheckersResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteMakerCheckerEntry"></a>
# **deleteMakerCheckerEntry**
> PostMakerCheckersResponse deleteMakerCheckerEntry(auditId)

Delete Maker Checker Entry

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

MakerCheckerOr4EyeFunctionalityApi apiService = defaultClient.createService(MakerCheckerOr4EyeFunctionalityApi.class);

// Initialize these parameters earlier.
Call<PostMakerCheckersResponse> call = apiService.deleteMakerCheckerEntry(auditId);
call.enqueue(new Callback<PostMakerCheckersResponse>() {
    @Override
    public void onResponse(Call<PostMakerCheckersResponse> call, Response<PostMakerCheckersResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PostMakerCheckersResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **auditId** | **Long**| auditId |

### Return type

[**PostMakerCheckersResponse**](PostMakerCheckersResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveAuditSearchTemplate1"></a>
# **retrieveAuditSearchTemplate1**
> GetMakerCheckersSearchTemplateResponse retrieveAuditSearchTemplate1()

Maker Checker Search Template

This is a convenience resource. It can be useful when building a Checker Inbox UI. \&quot;appUsers\&quot; are data scoped to the office/branch the requestor is associated with. \&quot;actionNames\&quot; and \&quot;entityNames\&quot; returned are those that the requestor has Checker approval permissions for.  Example Requests:  makercheckers/searchtemplate makercheckers/searchtemplate?fields&#x3D;entityNames

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

MakerCheckerOr4EyeFunctionalityApi apiService = defaultClient.createService(MakerCheckerOr4EyeFunctionalityApi.class);

// Initialize these parameters earlier.
Call<GetMakerCheckersSearchTemplateResponse> call = apiService.retrieveAuditSearchTemplate1();
call.enqueue(new Callback<GetMakerCheckersSearchTemplateResponse>() {
    @Override
    public void onResponse(Call<GetMakerCheckersSearchTemplateResponse> call, Response<GetMakerCheckersSearchTemplateResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetMakerCheckersSearchTemplateResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetMakerCheckersSearchTemplateResponse**](GetMakerCheckersSearchTemplateResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveCommands"></a>
# **retrieveCommands**
> List&lt;GetMakerCheckerResponse&gt; retrieveCommands(actionName, entityName, resourceId, makerId, makerDateTimeFrom, makerDateTimeTo, officeId, groupId, clientId, loanid, savingsAccountId)

List Maker Checker Entries

Get a list of entries that can be checked by the requestor that match the criteria supplied.  Example Requests:  makercheckers  makercheckers?fields&#x3D;madeOnDate,maker,processingResult  makercheckers?makerDateTimeFrom&#x3D;2013-03-25 08:00:00&amp;makerDateTimeTo&#x3D;2013-04-04 18:00:00  makercheckers?officeId&#x3D;1  makercheckers?officeId&#x3D;1&amp;includeJson&#x3D;true

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

MakerCheckerOr4EyeFunctionalityApi apiService = defaultClient.createService(MakerCheckerOr4EyeFunctionalityApi.class);

// Initialize these parameters earlier.
Call<List&lt;GetMakerCheckerResponse&gt;> call = apiService.retrieveCommands(actionName, entityName, resourceId, makerId, makerDateTimeFrom, makerDateTimeTo, officeId, groupId, clientId, loanid, savingsAccountId);
call.enqueue(new Callback<List&lt;GetMakerCheckerResponse&gt;>() {
    @Override
    public void onResponse(Call<List&lt;GetMakerCheckerResponse&gt;> call, Response<List&lt;GetMakerCheckerResponse&gt;> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<List&lt;GetMakerCheckerResponse&gt;> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **actionName** | **String**| actionName | [optional]
 **entityName** | **String**| entityName | [optional]
 **resourceId** | **Long**| resourceId | [optional]
 **makerId** | **Long**| makerId | [optional]
 **makerDateTimeFrom** | **String**| makerDateTimeFrom | [optional]
 **makerDateTimeTo** | **String**| makerDateTimeTo | [optional]
 **officeId** | **Integer**| officeId | [optional]
 **groupId** | **Integer**| groupId | [optional]
 **clientId** | **Integer**| clientId | [optional]
 **loanid** | **Integer**| loanid | [optional]
 **savingsAccountId** | **Integer**| savingsAccountId | [optional]

### Return type

[**List&lt;GetMakerCheckerResponse&gt;**](GetMakerCheckerResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

