# CentersApi

All URIs are relative to *https://demo.fineract.dev/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**activate2**](CentersApi.md#activate2) | **POST** centers/{centerId} | Activate a Center | Generate Collection Sheet | Save Collection Sheet | Close a Center | Associate Groups | Disassociate Groups
[**create6**](CentersApi.md#create6) | **POST** centers | Create a Center
[**delete10**](CentersApi.md#delete10) | **DELETE** centers/{centerId} | Delete a Center
[**getCentersTemplate**](CentersApi.md#getCentersTemplate) | **GET** centers/downloadtemplate | 
[**postCentersTemplate**](CentersApi.md#postCentersTemplate) | **POST** centers/uploadtemplate | 
[**retrieveAll22**](CentersApi.md#retrieveAll22) | **GET** centers | List Centers
[**retrieveGroupAccount**](CentersApi.md#retrieveGroupAccount) | **GET** centers/{centerId}/accounts | Retrieve Center accounts overview
[**retrieveOne12**](CentersApi.md#retrieveOne12) | **GET** centers/{centerId} | Retrieve a Center
[**retrieveTemplate6**](CentersApi.md#retrieveTemplate6) | **GET** centers/template | Retrieve a Center Template
[**update10**](CentersApi.md#update10) | **PUT** centers/{centerId} | Update a Center

<a name="activate2"></a>
# **activate2**
> PostCentersCenterIdResponse activate2(body, centerId, command)

Activate a Center | Generate Collection Sheet | Save Collection Sheet | Close a Center | Associate Groups | Disassociate Groups

Activate a Center:  Centers can be created in a Pending state. This API exists to enable center activation. If the center happens to be already active, this API will result in an error.  Close a Center:  Centers can be closed if they don&#x27;t have any non-closed groups or saving accounts. If the Center has any active groups or savings accounts, this API will result in an error.  Associate Groups:  This API allows associating existing groups to a center. The groups are listed from the office to which the center is associated. If group(s) is already associated with a center, this API will result in an error.  Disassociate Groups:  This API allows to disassociate groups from a center.  Generate Collection Sheet:  This Api retrieves repayment details of all jlg loans under a center as on a specified meeting date.  Save Collection Sheet:  This Api allows the loan officer to perform bulk repayments of JLG loans for a center on a given meeting date.  Showing Request/Response for Close a Center

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

CentersApi apiService = defaultClient.createService(CentersApi.class);

// Initialize these parameters earlier.
Call<PostCentersCenterIdResponse> call = apiService.activate2(body, centerId, command);
call.enqueue(new Callback<PostCentersCenterIdResponse>() {
    @Override
    public void onResponse(Call<PostCentersCenterIdResponse> call, Response<PostCentersCenterIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PostCentersCenterIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PostCentersCenterIdRequest**](PostCentersCenterIdRequest.md)|  |
 **centerId** | **Long**| centerId |
 **command** | **String**| command | [optional]

### Return type

[**PostCentersCenterIdResponse**](PostCentersCenterIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="create6"></a>
# **create6**
> PostCentersResponse create6(body)

Create a Center

Creates a Center  Mandatory Fields: name, officeId, active, activationDate (if active&#x3D;true)  Optional Fields: externalId, staffId, groupMembers

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

CentersApi apiService = defaultClient.createService(CentersApi.class);

// Initialize these parameters earlier.
Call<PostCentersResponse> call = apiService.create6(body);
call.enqueue(new Callback<PostCentersResponse>() {
    @Override
    public void onResponse(Call<PostCentersResponse> call, Response<PostCentersResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PostCentersResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PostCentersRequest**](PostCentersRequest.md)|  |

### Return type

[**PostCentersResponse**](PostCentersResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="delete10"></a>
# **delete10**
> DeleteCentersCenterIdResponse delete10(centerId)

Delete a Center

A Center can be deleted if it is in pending state and has no association - groups, loans or savings

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

CentersApi apiService = defaultClient.createService(CentersApi.class);

// Initialize these parameters earlier.
Call<DeleteCentersCenterIdResponse> call = apiService.delete10(centerId);
call.enqueue(new Callback<DeleteCentersCenterIdResponse>() {
    @Override
    public void onResponse(Call<DeleteCentersCenterIdResponse> call, Response<DeleteCentersCenterIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<DeleteCentersCenterIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **centerId** | **Long**| centerId |

### Return type

[**DeleteCentersCenterIdResponse**](DeleteCentersCenterIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCentersTemplate"></a>
# **getCentersTemplate**
> Void getCentersTemplate(officeId, staffId, dateFormat)



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

CentersApi apiService = defaultClient.createService(CentersApi.class);

// Initialize these parameters earlier.
Call<Void> call = apiService.getCentersTemplate(officeId, staffId, dateFormat);
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
 **officeId** | **Long**|  | [optional]
 **staffId** | **Long**|  | [optional]
 **dateFormat** | **String**|  | [optional]

### Return type

[**Void**](.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.ms-excel

<a name="postCentersTemplate"></a>
# **postCentersTemplate**
> String postCentersTemplate(file, locale, dateFormat)



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

CentersApi apiService = defaultClient.createService(CentersApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.postCentersTemplate(file, locale, dateFormat);
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

<a name="retrieveAll22"></a>
# **retrieveAll22**
> GetCentersResponse retrieveAll22(officeId, staffId, externalId, name, underHierarchy, paged, offset, limit, orderBy, sortOrder, meetingDate, dateFormat, locale)

List Centers

The default implementation supports pagination and sorting with the default pagination size set to 200 records. The parameter limit with description -1 will return all entries.  Example Requests:    centers    centers?fields&#x3D;name,officeName,joinedDate    centers?offset&#x3D;10&amp;limit&#x3D;50    centers?orderBy&#x3D;name&amp;sortOrder&#x3D;DESC

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

CentersApi apiService = defaultClient.createService(CentersApi.class);

// Initialize these parameters earlier.
Call<GetCentersResponse> call = apiService.retrieveAll22(officeId, staffId, externalId, name, underHierarchy, paged, offset, limit, orderBy, sortOrder, meetingDate, dateFormat, locale);
call.enqueue(new Callback<GetCentersResponse>() {
    @Override
    public void onResponse(Call<GetCentersResponse> call, Response<GetCentersResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetCentersResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **officeId** | **Long**| officeId | [optional]
 **staffId** | **Long**| staffId | [optional]
 **externalId** | **String**| externalId | [optional]
 **name** | **String**| name | [optional]
 **underHierarchy** | **String**| underHierarchy | [optional]
 **paged** | **Boolean**| paged | [optional]
 **offset** | **Integer**| offset | [optional]
 **limit** | **Integer**| limit | [optional]
 **orderBy** | **String**| orderBy | [optional]
 **sortOrder** | **String**| sortOrder | [optional]
 **meetingDate** | [**DateParam**](.md)| meetingDate | [optional]
 **dateFormat** | **String**| dateFormat | [optional]
 **locale** | **String**| locale | [optional]

### Return type

[**GetCentersResponse**](GetCentersResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveGroupAccount"></a>
# **retrieveGroupAccount**
> GetCentersCenterIdAccountsResponse retrieveGroupAccount(centerId)

Retrieve Center accounts overview

An example of how a savings summary for a Center can be provided. This is requested in a specific use case of the reference application.  It is quite reasonable to add resources like this to simplify User Interface development.    Example Requests:    centers/9/accounts

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

CentersApi apiService = defaultClient.createService(CentersApi.class);

// Initialize these parameters earlier.
Call<GetCentersCenterIdAccountsResponse> call = apiService.retrieveGroupAccount(centerId);
call.enqueue(new Callback<GetCentersCenterIdAccountsResponse>() {
    @Override
    public void onResponse(Call<GetCentersCenterIdAccountsResponse> call, Response<GetCentersCenterIdAccountsResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetCentersCenterIdAccountsResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **centerId** | **Long**| centerId |

### Return type

[**GetCentersCenterIdAccountsResponse**](GetCentersCenterIdAccountsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveOne12"></a>
# **retrieveOne12**
> GetCentersCenterIdResponse retrieveOne12(centerId, staffInSelectedOfficeOnly)

Retrieve a Center

Retrieves a Center  Example Requests:    centers/1    centers/1?associations&#x3D;groupMembers

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

CentersApi apiService = defaultClient.createService(CentersApi.class);

// Initialize these parameters earlier.
Call<GetCentersCenterIdResponse> call = apiService.retrieveOne12(centerId, staffInSelectedOfficeOnly);
call.enqueue(new Callback<GetCentersCenterIdResponse>() {
    @Override
    public void onResponse(Call<GetCentersCenterIdResponse> call, Response<GetCentersCenterIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetCentersCenterIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **centerId** | **Long**| centerId |
 **staffInSelectedOfficeOnly** | **Boolean**| staffInSelectedOfficeOnly | [optional] [default to false]

### Return type

[**GetCentersCenterIdResponse**](GetCentersCenterIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveTemplate6"></a>
# **retrieveTemplate6**
> GetCentersTemplateResponse retrieveTemplate6(command, officeId, staffInSelectedOfficeOnly)

Retrieve a Center Template

Retrieves a Center Template  Example Requests:    centers/template    centers/template?officeId&#x3D;2

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

CentersApi apiService = defaultClient.createService(CentersApi.class);

// Initialize these parameters earlier.
Call<GetCentersTemplateResponse> call = apiService.retrieveTemplate6(command, officeId, staffInSelectedOfficeOnly);
call.enqueue(new Callback<GetCentersTemplateResponse>() {
    @Override
    public void onResponse(Call<GetCentersTemplateResponse> call, Response<GetCentersTemplateResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetCentersTemplateResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **command** | **String**| command | [optional]
 **officeId** | **Long**| officeId | [optional]
 **staffInSelectedOfficeOnly** | **Boolean**| staffInSelectedOfficeOnly | [optional] [default to false]

### Return type

[**GetCentersTemplateResponse**](GetCentersTemplateResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="update10"></a>
# **update10**
> PutCentersCenterIdResponse update10(body, centerId)

Update a Center

Updates a Center

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

CentersApi apiService = defaultClient.createService(CentersApi.class);

// Initialize these parameters earlier.
Call<PutCentersCenterIdResponse> call = apiService.update10(body, centerId);
call.enqueue(new Callback<PutCentersCenterIdResponse>() {
    @Override
    public void onResponse(Call<PutCentersCenterIdResponse> call, Response<PutCentersCenterIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PutCentersCenterIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PutCentersCenterIdRequest**](PutCentersCenterIdRequest.md)|  |
 **centerId** | **Long**| centerId |

### Return type

[**PutCentersCenterIdResponse**](PutCentersCenterIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

