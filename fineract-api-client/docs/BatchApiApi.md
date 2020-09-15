# BatchApiApi

All URIs are relative to *https://demo.fineract.dev/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**handleBatchRequests**](BatchApiApi.md#handleBatchRequests) | **POST** batches | Batch requests in a single transaction

<a name="handleBatchRequests"></a>
# **handleBatchRequests**
> BatchResponse handleBatchRequests(body, enclosingTransaction)

Batch requests in a single transaction

The Apache Fineract Batch API is also capable of executing all the requests in a single transaction, by setting a Query Parameter, \&quot;enclosingTransaction&#x3D;true\&quot;. So, if one or more of the requests in a batch returns an erroneous response all of the Data base transactions made by other successful requests will be rolled back.  If there has been a rollback in a transaction then a single response will be provided, with a &#x27;400&#x27; status code and a body consisting of the error details of the first failed request.

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

BatchApiApi apiService = defaultClient.createService(BatchApiApi.class);

// Initialize these parameters earlier.
Call<BatchResponse> call = apiService.handleBatchRequests(body, enclosingTransaction);
call.enqueue(new Callback<BatchResponse>() {
    @Override
    public void onResponse(Call<BatchResponse> call, Response<BatchResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<BatchResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PostBatchesRequest**](PostBatchesRequest.md)|  |
 **enclosingTransaction** | **Boolean**| enclosingTransaction | [optional] [default to false]

### Return type

[**BatchResponse**](BatchResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

