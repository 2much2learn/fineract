# SelfSpmApi

All URIs are relative to *https://demo.fineract.dev/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**fetchAllSurveys**](SelfSpmApi.md#fetchAllSurveys) | **GET** self/surveys | 

<a name="fetchAllSurveys"></a>
# **fetchAllSurveys**
> List&lt;SurveyData&gt; fetchAllSurveys()



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

SelfSpmApi apiService = defaultClient.createService(SelfSpmApi.class);

// Initialize these parameters earlier.
Call<List&lt;SurveyData&gt;> call = apiService.fetchAllSurveys();
call.enqueue(new Callback<List&lt;SurveyData&gt;>() {
    @Override
    public void onResponse(Call<List&lt;SurveyData&gt;> call, Response<List&lt;SurveyData&gt;> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<List&lt;SurveyData&gt;> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;SurveyData&gt;**](SurveyData.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

