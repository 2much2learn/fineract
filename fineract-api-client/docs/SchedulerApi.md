# SchedulerApi

All URIs are relative to *https://demo.fineract.dev/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**changeSchedulerStatus**](SchedulerApi.md#changeSchedulerStatus) | **POST** scheduler | Activate Scheduler Jobs | Suspend Scheduler Jobs
[**retrieveStatus**](SchedulerApi.md#retrieveStatus) | **GET** scheduler | Retrieve Scheduler Status

<a name="changeSchedulerStatus"></a>
# **changeSchedulerStatus**
> Void changeSchedulerStatus(command)

Activate Scheduler Jobs | Suspend Scheduler Jobs

Activates the scheduler job service. | Suspends the scheduler job service.

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

SchedulerApi apiService = defaultClient.createService(SchedulerApi.class);

// Initialize these parameters earlier.
Call<Void> call = apiService.changeSchedulerStatus(command);
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
 **command** | **String**| command | [optional]

### Return type

[**Void**](.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="retrieveStatus"></a>
# **retrieveStatus**
> GetSchedulerResponse retrieveStatus()

Retrieve Scheduler Status

Returns the scheduler status.  Example Requests:  scheduler

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

SchedulerApi apiService = defaultClient.createService(SchedulerApi.class);

// Initialize these parameters earlier.
Call<GetSchedulerResponse> call = apiService.retrieveStatus();
call.enqueue(new Callback<GetSchedulerResponse>() {
    @Override
    public void onResponse(Call<GetSchedulerResponse> call, Response<GetSchedulerResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetSchedulerResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetSchedulerResponse**](GetSchedulerResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

