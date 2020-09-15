# ReportsApi

All URIs are relative to *https://demo.fineract.dev/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createReport**](ReportsApi.md#createReport) | **POST** reports | Create a Report
[**deleteReport**](ReportsApi.md#deleteReport) | **DELETE** reports/{id} | Delete a Report
[**retrieveOfficeTemplate**](ReportsApi.md#retrieveOfficeTemplate) | **GET** reports/template | Retrieve Report Template
[**retrieveReport**](ReportsApi.md#retrieveReport) | **GET** reports/{id} | Retrieve a Report 
[**retrieveReportList**](ReportsApi.md#retrieveReportList) | **GET** reports | List Reports
[**updateReport**](ReportsApi.md#updateReport) | **PUT** reports/{id} | Update a Report

<a name="createReport"></a>
# **createReport**
> PostReportsResponse createReport(body)

Create a Report

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

ReportsApi apiService = defaultClient.createService(ReportsApi.class);

// Initialize these parameters earlier.
Call<PostReportsResponse> call = apiService.createReport(body);
call.enqueue(new Callback<PostReportsResponse>() {
    @Override
    public void onResponse(Call<PostReportsResponse> call, Response<PostReportsResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PostReportsResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PostRepostRequest**](PostRepostRequest.md)|  |

### Return type

[**PostReportsResponse**](PostReportsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteReport"></a>
# **deleteReport**
> DeleteReportsResponse deleteReport(id)

Delete a Report

Only non-core reports can be deleted.

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

ReportsApi apiService = defaultClient.createService(ReportsApi.class);

// Initialize these parameters earlier.
Call<DeleteReportsResponse> call = apiService.deleteReport(id);
call.enqueue(new Callback<DeleteReportsResponse>() {
    @Override
    public void onResponse(Call<DeleteReportsResponse> call, Response<DeleteReportsResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<DeleteReportsResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |

### Return type

[**DeleteReportsResponse**](DeleteReportsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveOfficeTemplate"></a>
# **retrieveOfficeTemplate**
> GetReportsTemplateResponse retrieveOfficeTemplate()

Retrieve Report Template

This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed description Lists  Example Request :   reports/template

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

ReportsApi apiService = defaultClient.createService(ReportsApi.class);

// Initialize these parameters earlier.
Call<GetReportsTemplateResponse> call = apiService.retrieveOfficeTemplate();
call.enqueue(new Callback<GetReportsTemplateResponse>() {
    @Override
    public void onResponse(Call<GetReportsTemplateResponse> call, Response<GetReportsTemplateResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetReportsTemplateResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetReportsTemplateResponse**](GetReportsTemplateResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveReport"></a>
# **retrieveReport**
> GetReportsResponse retrieveReport(id)

Retrieve a Report 

Example Requests:  reports/1   reports/1?template&#x3D;true

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

ReportsApi apiService = defaultClient.createService(ReportsApi.class);

// Initialize these parameters earlier.
Call<GetReportsResponse> call = apiService.retrieveReport(id);
call.enqueue(new Callback<GetReportsResponse>() {
    @Override
    public void onResponse(Call<GetReportsResponse> call, Response<GetReportsResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetReportsResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |

### Return type

[**GetReportsResponse**](GetReportsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveReportList"></a>
# **retrieveReportList**
> List&lt;GetReportsResponse&gt; retrieveReportList()

List Reports

Lists all reports and their parameters.  Example Request:  reports

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

ReportsApi apiService = defaultClient.createService(ReportsApi.class);

// Initialize these parameters earlier.
Call<List&lt;GetReportsResponse&gt;> call = apiService.retrieveReportList();
call.enqueue(new Callback<List&lt;GetReportsResponse&gt;>() {
    @Override
    public void onResponse(Call<List&lt;GetReportsResponse&gt;> call, Response<List&lt;GetReportsResponse&gt;> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<List&lt;GetReportsResponse&gt;> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;GetReportsResponse&gt;**](GetReportsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateReport"></a>
# **updateReport**
> PutReportResponse updateReport(body, id)

Update a Report

Only the useReport description can be updated for core reports.

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

ReportsApi apiService = defaultClient.createService(ReportsApi.class);

// Initialize these parameters earlier.
Call<PutReportResponse> call = apiService.updateReport(body, id);
call.enqueue(new Callback<PutReportResponse>() {
    @Override
    public void onResponse(Call<PutReportResponse> call, Response<PutReportResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PutReportResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PutReportRequest**](PutReportRequest.md)|  |
 **id** | **Long**| id |

### Return type

[**PutReportResponse**](PutReportResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

