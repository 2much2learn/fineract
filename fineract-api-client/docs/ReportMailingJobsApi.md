# ReportMailingJobsApi

All URIs are relative to *https://demo.fineract.dev/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createReportMailingJob**](ReportMailingJobsApi.md#createReportMailingJob) | **POST** reportmailingjobs | Create a Report Mailing Job
[**deleteReportMailingJob**](ReportMailingJobsApi.md#deleteReportMailingJob) | **DELETE** reportmailingjobs/{entityId} | Delete a Report Mailing Job
[**retrieveAllReportMailingJobs**](ReportMailingJobsApi.md#retrieveAllReportMailingJobs) | **GET** reportmailingjobs | List Report Mailing Jobs
[**retrieveReportMailingJob**](ReportMailingJobsApi.md#retrieveReportMailingJob) | **GET** reportmailingjobs/{entityId} | Retrieve a Report Mailing Job
[**retrieveReportMailingJobTemplate**](ReportMailingJobsApi.md#retrieveReportMailingJobTemplate) | **GET** reportmailingjobs/template | Retrieve Report Mailing Job Details Template
[**updateReportMailingJob**](ReportMailingJobsApi.md#updateReportMailingJob) | **PUT** reportmailingjobs/{entityId} | Update a Report Mailing Job 

<a name="createReportMailingJob"></a>
# **createReportMailingJob**
> PostReportMailingJobsResponse createReportMailingJob(body)

Create a Report Mailing Job

Mandatory Fields: name, startDateTime, stretchyReportId, emailRecipients, emailSubject, emailMessage, emailAttachmentFileFormatId, recurrence, isActive  Optional Fields: description, stretchyReportParamMap

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

ReportMailingJobsApi apiService = defaultClient.createService(ReportMailingJobsApi.class);

// Initialize these parameters earlier.
Call<PostReportMailingJobsResponse> call = apiService.createReportMailingJob(body);
call.enqueue(new Callback<PostReportMailingJobsResponse>() {
    @Override
    public void onResponse(Call<PostReportMailingJobsResponse> call, Response<PostReportMailingJobsResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PostReportMailingJobsResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PostReportMailingJobsRequest**](PostReportMailingJobsRequest.md)|  |

### Return type

[**PostReportMailingJobsResponse**](PostReportMailingJobsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteReportMailingJob"></a>
# **deleteReportMailingJob**
> DeleteReportMailingJobsResponse deleteReportMailingJob(body, entityId)

Delete a Report Mailing Job

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

ReportMailingJobsApi apiService = defaultClient.createService(ReportMailingJobsApi.class);

// Initialize these parameters earlier.
Call<DeleteReportMailingJobsResponse> call = apiService.deleteReportMailingJob(body, entityId);
call.enqueue(new Callback<DeleteReportMailingJobsResponse>() {
    @Override
    public void onResponse(Call<DeleteReportMailingJobsResponse> call, Response<DeleteReportMailingJobsResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<DeleteReportMailingJobsResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DeleteReportMailingJobsRequest**](DeleteReportMailingJobsRequest.md)|  |
 **entityId** | **Long**| entityId |

### Return type

[**DeleteReportMailingJobsResponse**](DeleteReportMailingJobsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveAllReportMailingJobs"></a>
# **retrieveAllReportMailingJobs**
> List&lt;GetReportMailingJobsResponse&gt; retrieveAllReportMailingJobs(offset, limit, orderBy, sortOrder)

List Report Mailing Jobs

Example Requests:  reportmailingjobs

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

ReportMailingJobsApi apiService = defaultClient.createService(ReportMailingJobsApi.class);

// Initialize these parameters earlier.
Call<List&lt;GetReportMailingJobsResponse&gt;> call = apiService.retrieveAllReportMailingJobs(offset, limit, orderBy, sortOrder);
call.enqueue(new Callback<List&lt;GetReportMailingJobsResponse&gt;>() {
    @Override
    public void onResponse(Call<List&lt;GetReportMailingJobsResponse&gt;> call, Response<List&lt;GetReportMailingJobsResponse&gt;> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<List&lt;GetReportMailingJobsResponse&gt;> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offset** | **Integer**| offset | [optional]
 **limit** | **Integer**| limit | [optional]
 **orderBy** | **String**| orderBy | [optional]
 **sortOrder** | **String**| sortOrder | [optional]

### Return type

[**List&lt;GetReportMailingJobsResponse&gt;**](GetReportMailingJobsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveReportMailingJob"></a>
# **retrieveReportMailingJob**
> GetReportMailingJobsResponse retrieveReportMailingJob(entityId)

Retrieve a Report Mailing Job

Example Requests:  reportmailingjobs/1   reportmailingjobs/1?template&#x3D;true

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

ReportMailingJobsApi apiService = defaultClient.createService(ReportMailingJobsApi.class);

// Initialize these parameters earlier.
Call<GetReportMailingJobsResponse> call = apiService.retrieveReportMailingJob(entityId);
call.enqueue(new Callback<GetReportMailingJobsResponse>() {
    @Override
    public void onResponse(Call<GetReportMailingJobsResponse> call, Response<GetReportMailingJobsResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetReportMailingJobsResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entityId** | **Long**| entityId |

### Return type

[**GetReportMailingJobsResponse**](GetReportMailingJobsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveReportMailingJobTemplate"></a>
# **retrieveReportMailingJobTemplate**
> GetReportMailingJobsTemplate retrieveReportMailingJobTemplate()

Retrieve Report Mailing Job Details Template

This is a convenience resource. It can be useful when building maintenance user interface screens for report mailing job applications. The template data returned consists of any or all of:  Field Defaults Allowed description Lists Example Request:  reportmailingjobs/template

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

ReportMailingJobsApi apiService = defaultClient.createService(ReportMailingJobsApi.class);

// Initialize these parameters earlier.
Call<GetReportMailingJobsTemplate> call = apiService.retrieveReportMailingJobTemplate();
call.enqueue(new Callback<GetReportMailingJobsTemplate>() {
    @Override
    public void onResponse(Call<GetReportMailingJobsTemplate> call, Response<GetReportMailingJobsTemplate> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetReportMailingJobsTemplate> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetReportMailingJobsTemplate**](GetReportMailingJobsTemplate.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateReportMailingJob"></a>
# **updateReportMailingJob**
> PutReportMailingJobsResponse updateReportMailingJob(body, entityId)

Update a Report Mailing Job 

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

ReportMailingJobsApi apiService = defaultClient.createService(ReportMailingJobsApi.class);

// Initialize these parameters earlier.
Call<PutReportMailingJobsResponse> call = apiService.updateReportMailingJob(body, entityId);
call.enqueue(new Callback<PutReportMailingJobsResponse>() {
    @Override
    public void onResponse(Call<PutReportMailingJobsResponse> call, Response<PutReportMailingJobsResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PutReportMailingJobsResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PutReportMailingJobsRequest**](PutReportMailingJobsRequest.md)|  |
 **entityId** | **Long**| entityId |

### Return type

[**PutReportMailingJobsResponse**](PutReportMailingJobsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

