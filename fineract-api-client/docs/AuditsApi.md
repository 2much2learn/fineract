# AuditsApi

All URIs are relative to *https://demo.fineract.dev/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**retrieveAuditEntries**](AuditsApi.md#retrieveAuditEntries) | **GET** audits | List Audits
[**retrieveAuditEntry**](AuditsApi.md#retrieveAuditEntry) | **GET** audits/{auditId} | Retrieve an Audit Entry
[**retrieveAuditSearchTemplate**](AuditsApi.md#retrieveAuditSearchTemplate) | **GET** audits/searchtemplate | Audit Search Template

<a name="retrieveAuditEntries"></a>
# **retrieveAuditEntries**
> List&lt;GetMakerCheckerResponse&gt; retrieveAuditEntries(actionName, entityName, resourceId, makerId, makerDateTimeFrom, makerDateTimeTo, checkerId, checkerDateTimeFrom, checkerDateTimeTo, processingResult, officeId, groupId, clientId, loanid, savingsAccountId, paged, offset, limit, orderBy, sortOrder)

List Audits

Get a 200 list of audits that match the criteria supplied and sorted by audit id in descending order, and are within the requestors&#x27; data scope. Also it supports pagination and sorting  Example Requests:  audits  audits?fields&#x3D;madeOnDate,maker,processingResult  audits?makerDateTimeFrom&#x3D;2013-03-25 08:00:00&amp;makerDateTimeTo&#x3D;2013-04-04 18:00:00  audits?officeId&#x3D;1  audits?officeId&#x3D;1&amp;includeJson&#x3D;true

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

AuditsApi apiService = defaultClient.createService(AuditsApi.class);

// Initialize these parameters earlier.
Call<List&lt;GetMakerCheckerResponse&gt;> call = apiService.retrieveAuditEntries(actionName, entityName, resourceId, makerId, makerDateTimeFrom, makerDateTimeTo, checkerId, checkerDateTimeFrom, checkerDateTimeTo, processingResult, officeId, groupId, clientId, loanid, savingsAccountId, paged, offset, limit, orderBy, sortOrder);
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
 **checkerId** | **Long**| checkerId | [optional]
 **checkerDateTimeFrom** | **String**| checkerDateTimeFrom | [optional]
 **checkerDateTimeTo** | **String**| checkerDateTimeTo | [optional]
 **processingResult** | **Integer**| processingResult | [optional]
 **officeId** | **Integer**| officeId | [optional]
 **groupId** | **Integer**| groupId | [optional]
 **clientId** | **Integer**| clientId | [optional]
 **loanid** | **Integer**| loanid | [optional]
 **savingsAccountId** | **Integer**| savingsAccountId | [optional]
 **paged** | **Boolean**| paged | [optional]
 **offset** | **Integer**| offset | [optional]
 **limit** | **Integer**| limit | [optional]
 **orderBy** | **String**| orderBy | [optional]
 **sortOrder** | **String**| sortOrder | [optional]

### Return type

[**List&lt;GetMakerCheckerResponse&gt;**](GetMakerCheckerResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveAuditEntry"></a>
# **retrieveAuditEntry**
> GetMakerCheckerResponse retrieveAuditEntry(auditId)

Retrieve an Audit Entry

Example Requests:  audits/20 audits/20?fields&#x3D;madeOnDate,maker,processingResult

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

AuditsApi apiService = defaultClient.createService(AuditsApi.class);

// Initialize these parameters earlier.
Call<GetMakerCheckerResponse> call = apiService.retrieveAuditEntry(auditId);
call.enqueue(new Callback<GetMakerCheckerResponse>() {
    @Override
    public void onResponse(Call<GetMakerCheckerResponse> call, Response<GetMakerCheckerResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetMakerCheckerResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **auditId** | **Long**| auditId |

### Return type

[**GetMakerCheckerResponse**](GetMakerCheckerResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveAuditSearchTemplate"></a>
# **retrieveAuditSearchTemplate**
> GetMakerCheckersSearchTemplateResponse retrieveAuditSearchTemplate()

Audit Search Template

This is a convenience resource. It can be useful when building an Audit Search UI. \&quot;appUsers\&quot; are data scoped to the office/branch the requestor is associated with.  Example Requests:  audits/searchtemplate audits/searchtemplate?fields&#x3D;actionNames

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

AuditsApi apiService = defaultClient.createService(AuditsApi.class);

// Initialize these parameters earlier.
Call<GetMakerCheckersSearchTemplateResponse> call = apiService.retrieveAuditSearchTemplate();
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

