# MifosxBatchJobsApi

All URIs are relative to *https://demo.fineract.dev/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**executeJob**](MifosxBatchJobsApi.md#executeJob) | **POST** jobs/{jobId} | Run a Job
[**retrieveAll8**](MifosxBatchJobsApi.md#retrieveAll8) | **GET** jobs | Retrieve Scheduler Jobs
[**retrieveHistory**](MifosxBatchJobsApi.md#retrieveHistory) | **GET** jobs/{jobId}/runhistory | Retrieve Job Run History
[**retrieveOne5**](MifosxBatchJobsApi.md#retrieveOne5) | **GET** jobs/{jobId} | Retrieve a Job
[**updateJobDetail**](MifosxBatchJobsApi.md#updateJobDetail) | **PUT** jobs/{jobId} | Update a Job

<a name="executeJob"></a>
# **executeJob**
> Void executeJob(jobId, command)

Run a Job

Manually Execute Specific Job.

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

MifosxBatchJobsApi apiService = defaultClient.createService(MifosxBatchJobsApi.class);

// Initialize these parameters earlier.
Call<Void> call = apiService.executeJob(jobId, command);
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
 **jobId** | **Long**| jobId |
 **command** | **String**| command | [optional]

### Return type

[**Void**](.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="retrieveAll8"></a>
# **retrieveAll8**
> List&lt;GetJobsResponse&gt; retrieveAll8()

Retrieve Scheduler Jobs

Returns the list of jobs.  Example Requests:  jobs

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

MifosxBatchJobsApi apiService = defaultClient.createService(MifosxBatchJobsApi.class);

// Initialize these parameters earlier.
Call<List&lt;GetJobsResponse&gt;> call = apiService.retrieveAll8();
call.enqueue(new Callback<List&lt;GetJobsResponse&gt;>() {
    @Override
    public void onResponse(Call<List&lt;GetJobsResponse&gt;> call, Response<List&lt;GetJobsResponse&gt;> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<List&lt;GetJobsResponse&gt;> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;GetJobsResponse&gt;**](GetJobsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveHistory"></a>
# **retrieveHistory**
> GetJobsJobIDJobRunHistoryResponse retrieveHistory(jobId, offset, limit, orderBy, sortOrder)

Retrieve Job Run History

Example Requests:  jobs/5/runhistory?offset&#x3D;0&amp;limit&#x3D;200

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

MifosxBatchJobsApi apiService = defaultClient.createService(MifosxBatchJobsApi.class);

// Initialize these parameters earlier.
Call<GetJobsJobIDJobRunHistoryResponse> call = apiService.retrieveHistory(jobId, offset, limit, orderBy, sortOrder);
call.enqueue(new Callback<GetJobsJobIDJobRunHistoryResponse>() {
    @Override
    public void onResponse(Call<GetJobsJobIDJobRunHistoryResponse> call, Response<GetJobsJobIDJobRunHistoryResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetJobsJobIDJobRunHistoryResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **Long**| jobId |
 **offset** | **Integer**| offset | [optional]
 **limit** | **Integer**| limit | [optional]
 **orderBy** | **String**| orderBy | [optional]
 **sortOrder** | **String**| sortOrder | [optional]

### Return type

[**GetJobsJobIDJobRunHistoryResponse**](GetJobsJobIDJobRunHistoryResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveOne5"></a>
# **retrieveOne5**
> GetJobsResponse retrieveOne5(jobId)

Retrieve a Job

Returns the details of a Job.  Example Requests:  jobs/5

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

MifosxBatchJobsApi apiService = defaultClient.createService(MifosxBatchJobsApi.class);

// Initialize these parameters earlier.
Call<GetJobsResponse> call = apiService.retrieveOne5(jobId);
call.enqueue(new Callback<GetJobsResponse>() {
    @Override
    public void onResponse(Call<GetJobsResponse> call, Response<GetJobsResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetJobsResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **Long**| jobId |

### Return type

[**GetJobsResponse**](GetJobsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateJobDetail"></a>
# **updateJobDetail**
> Void updateJobDetail(body, jobId)

Update a Job

Updates the details of a job.

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

MifosxBatchJobsApi apiService = defaultClient.createService(MifosxBatchJobsApi.class);

// Initialize these parameters earlier.
Call<Void> call = apiService.updateJobDetail(body, jobId);
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
 **body** | [**PutJobsJobIDRequest**](PutJobsJobIDRequest.md)|  |
 **jobId** | **Long**| jobId |

### Return type

[**Void**](.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

