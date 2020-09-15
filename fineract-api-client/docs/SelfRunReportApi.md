# SelfRunReportApi

All URIs are relative to *https://demo.fineract.dev/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**runReport1**](SelfRunReportApi.md#runReport1) | **GET** self/runreports/{reportName} | Running A Report

<a name="runReport1"></a>
# **runReport1**
> GetRunReportResponse runReport1(reportName)

Running A Report

Example Requests:   self/runreports/Client%20Details?R_officeId&#x3D;1   self/runreports/Client%20Details?R_officeId&#x3D;1&amp;exportCSV&#x3D;true

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

SelfRunReportApi apiService = defaultClient.createService(SelfRunReportApi.class);

// Initialize these parameters earlier.
Call<GetRunReportResponse> call = apiService.runReport1(reportName);
call.enqueue(new Callback<GetRunReportResponse>() {
    @Override
    public void onResponse(Call<GetRunReportResponse> call, Response<GetRunReportResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetRunReportResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportName** | **String**| reportName |

### Return type

[**GetRunReportResponse**](GetRunReportResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/csv, application/vnd.ms-excel, application/pdf, text/html

