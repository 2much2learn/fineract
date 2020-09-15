# ListReportMailingJobHistoryApi

All URIs are relative to *https://demo.fineract.dev/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**retrieveAllByReportMailingJobId**](ListReportMailingJobHistoryApi.md#retrieveAllByReportMailingJobId) | **GET** reportmailingjobrunhistory | List Report Mailing Job History

<a name="retrieveAllByReportMailingJobId"></a>
# **retrieveAllByReportMailingJobId**
> ReportMailingJobRunHistoryData retrieveAllByReportMailingJobId(reportMailingJobId, offset, limit, orderBy, sortOrder)

List Report Mailing Job History

The list capability of report mailing job history can support pagination and sorting.  Example Requests:  reportmailingjobrunhistory/1

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

ListReportMailingJobHistoryApi apiService = defaultClient.createService(ListReportMailingJobHistoryApi.class);

// Initialize these parameters earlier.
Call<ReportMailingJobRunHistoryData> call = apiService.retrieveAllByReportMailingJobId(reportMailingJobId, offset, limit, orderBy, sortOrder);
call.enqueue(new Callback<ReportMailingJobRunHistoryData>() {
    @Override
    public void onResponse(Call<ReportMailingJobRunHistoryData> call, Response<ReportMailingJobRunHistoryData> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<ReportMailingJobRunHistoryData> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportMailingJobId** | **Long**| reportMailingJobId | [optional]
 **offset** | **Integer**| offset | [optional]
 **limit** | **Integer**| limit | [optional]
 **orderBy** | **String**| orderBy | [optional]
 **sortOrder** | **String**| sortOrder | [optional]

### Return type

[**ReportMailingJobRunHistoryData**](ReportMailingJobRunHistoryData.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

