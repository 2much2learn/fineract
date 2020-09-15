# WorkingDaysApi

All URIs are relative to *https://demo.fineract.dev/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**retrieveAll16**](WorkingDaysApi.md#retrieveAll16) | **GET** workingdays | List Working days
[**template4**](WorkingDaysApi.md#template4) | **GET** workingdays/template | Working Days Template
[**update7**](WorkingDaysApi.md#update7) | **PUT** workingdays | Update a Working Day

<a name="retrieveAll16"></a>
# **retrieveAll16**
> List&lt;GetWorkingDaysResponse&gt; retrieveAll16()

List Working days

Example Requests:  workingdays

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

WorkingDaysApi apiService = defaultClient.createService(WorkingDaysApi.class);

// Initialize these parameters earlier.
Call<List&lt;GetWorkingDaysResponse&gt;> call = apiService.retrieveAll16();
call.enqueue(new Callback<List&lt;GetWorkingDaysResponse&gt;>() {
    @Override
    public void onResponse(Call<List&lt;GetWorkingDaysResponse&gt;> call, Response<List&lt;GetWorkingDaysResponse&gt;> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<List&lt;GetWorkingDaysResponse&gt;> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;GetWorkingDaysResponse&gt;**](GetWorkingDaysResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="template4"></a>
# **template4**
> GetWorkingDaysTemplateResponse template4()

Working Days Template

This is a convenience resource. It can be useful when building maintenance user interface screens for working days.  Example Request:  workingdays/template

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

WorkingDaysApi apiService = defaultClient.createService(WorkingDaysApi.class);

// Initialize these parameters earlier.
Call<GetWorkingDaysTemplateResponse> call = apiService.template4();
call.enqueue(new Callback<GetWorkingDaysTemplateResponse>() {
    @Override
    public void onResponse(Call<GetWorkingDaysTemplateResponse> call, Response<GetWorkingDaysTemplateResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetWorkingDaysTemplateResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetWorkingDaysTemplateResponse**](GetWorkingDaysTemplateResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="update7"></a>
# **update7**
> PutWorkingDaysResponse update7(body)

Update a Working Day

Mandatory Fields recurrence,repaymentRescheduleType,extendTermForDailyRepayments,locale

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

WorkingDaysApi apiService = defaultClient.createService(WorkingDaysApi.class);

// Initialize these parameters earlier.
Call<PutWorkingDaysResponse> call = apiService.update7(body);
call.enqueue(new Callback<PutWorkingDaysResponse>() {
    @Override
    public void onResponse(Call<PutWorkingDaysResponse> call, Response<PutWorkingDaysResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PutWorkingDaysResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PutWorkingDaysRequest**](PutWorkingDaysRequest.md)|  |

### Return type

[**PutWorkingDaysResponse**](PutWorkingDaysResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

