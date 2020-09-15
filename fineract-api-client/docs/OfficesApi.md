# OfficesApi

All URIs are relative to *https://demo.fineract.dev/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createOffice**](OfficesApi.md#createOffice) | **POST** offices | Create an Office
[**getOfficeTemplate**](OfficesApi.md#getOfficeTemplate) | **GET** offices/downloadtemplate | 
[**postOfficeTemplate**](OfficesApi.md#postOfficeTemplate) | **POST** offices/uploadtemplate | 
[**retreiveOffice**](OfficesApi.md#retreiveOffice) | **GET** offices/{officeId} | Retrieve an Office
[**retrieveOfficeTemplate1**](OfficesApi.md#retrieveOfficeTemplate1) | **GET** offices/template | Retrieve Office Details Template
[**retrieveOffices**](OfficesApi.md#retrieveOffices) | **GET** offices | List Offices
[**updateOffice**](OfficesApi.md#updateOffice) | **PUT** offices/{officeId} | Update Office

<a name="createOffice"></a>
# **createOffice**
> PostOfficesResponse createOffice(body)

Create an Office

Mandatory Fields name, openingDate, parentId

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

OfficesApi apiService = defaultClient.createService(OfficesApi.class);

// Initialize these parameters earlier.
Call<PostOfficesResponse> call = apiService.createOffice(body);
call.enqueue(new Callback<PostOfficesResponse>() {
    @Override
    public void onResponse(Call<PostOfficesResponse> call, Response<PostOfficesResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PostOfficesResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PostOfficesRequest**](PostOfficesRequest.md)|  |

### Return type

[**PostOfficesResponse**](PostOfficesResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getOfficeTemplate"></a>
# **getOfficeTemplate**
> Void getOfficeTemplate(dateFormat)



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

OfficesApi apiService = defaultClient.createService(OfficesApi.class);

// Initialize these parameters earlier.
Call<Void> call = apiService.getOfficeTemplate(dateFormat);
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

<a name="postOfficeTemplate"></a>
# **postOfficeTemplate**
> String postOfficeTemplate(file, locale, dateFormat)



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

OfficesApi apiService = defaultClient.createService(OfficesApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.postOfficeTemplate(file, locale, dateFormat);
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

<a name="retreiveOffice"></a>
# **retreiveOffice**
> GetOfficesResponse retreiveOffice(officeId)

Retrieve an Office

Example Requests:  offices/1   offices/1?template&#x3D;true   offices/1?fields&#x3D;id,name,parentName

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

OfficesApi apiService = defaultClient.createService(OfficesApi.class);

// Initialize these parameters earlier.
Call<GetOfficesResponse> call = apiService.retreiveOffice(officeId);
call.enqueue(new Callback<GetOfficesResponse>() {
    @Override
    public void onResponse(Call<GetOfficesResponse> call, Response<GetOfficesResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetOfficesResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **officeId** | **Long**| officeId |

### Return type

[**GetOfficesResponse**](GetOfficesResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveOfficeTemplate1"></a>
# **retrieveOfficeTemplate1**
> GetOfficesTemplateResponse retrieveOfficeTemplate1()

Retrieve Office Details Template

This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed description Lists Example Request:  offices/template

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

OfficesApi apiService = defaultClient.createService(OfficesApi.class);

// Initialize these parameters earlier.
Call<GetOfficesTemplateResponse> call = apiService.retrieveOfficeTemplate1();
call.enqueue(new Callback<GetOfficesTemplateResponse>() {
    @Override
    public void onResponse(Call<GetOfficesTemplateResponse> call, Response<GetOfficesTemplateResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetOfficesTemplateResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetOfficesTemplateResponse**](GetOfficesTemplateResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveOffices"></a>
# **retrieveOffices**
> List&lt;GetOfficesResponse&gt; retrieveOffices(includeAllOffices, orderBy, sortOrder)

List Offices

Example Requests:  offices   offices?fields&#x3D;id,name,openingDate

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

OfficesApi apiService = defaultClient.createService(OfficesApi.class);

// Initialize these parameters earlier.
Call<List&lt;GetOfficesResponse&gt;> call = apiService.retrieveOffices(includeAllOffices, orderBy, sortOrder);
call.enqueue(new Callback<List&lt;GetOfficesResponse&gt;>() {
    @Override
    public void onResponse(Call<List&lt;GetOfficesResponse&gt;> call, Response<List&lt;GetOfficesResponse&gt;> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<List&lt;GetOfficesResponse&gt;> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **includeAllOffices** | **Boolean**| includeAllOffices | [optional] [default to false]
 **orderBy** | **String**| orderBy | [optional]
 **sortOrder** | **String**| sortOrder | [optional]

### Return type

[**List&lt;GetOfficesResponse&gt;**](GetOfficesResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateOffice"></a>
# **updateOffice**
> PutOfficesOfficeIdResponse updateOffice(body, officeId)

Update Office

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

OfficesApi apiService = defaultClient.createService(OfficesApi.class);

// Initialize these parameters earlier.
Call<PutOfficesOfficeIdResponse> call = apiService.updateOffice(body, officeId);
call.enqueue(new Callback<PutOfficesOfficeIdResponse>() {
    @Override
    public void onResponse(Call<PutOfficesOfficeIdResponse> call, Response<PutOfficesOfficeIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PutOfficesOfficeIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PutOfficesOfficeIdRequest**](PutOfficesOfficeIdRequest.md)|  |
 **officeId** | **Long**| officeId |

### Return type

[**PutOfficesOfficeIdResponse**](PutOfficesOfficeIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

