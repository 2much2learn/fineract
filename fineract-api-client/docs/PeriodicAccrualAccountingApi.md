# PeriodicAccrualAccountingApi

All URIs are relative to *https://demo.fineract.dev/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**executePeriodicAccrualAccounting**](PeriodicAccrualAccountingApi.md#executePeriodicAccrualAccounting) | **POST** runaccruals | Executes Periodic Accrual Accounting

<a name="executePeriodicAccrualAccounting"></a>
# **executePeriodicAccrualAccounting**
> Void executePeriodicAccrualAccounting(body)

Executes Periodic Accrual Accounting

Mandatory Fields  tillDate 

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

PeriodicAccrualAccountingApi apiService = defaultClient.createService(PeriodicAccrualAccountingApi.class);

// Initialize these parameters earlier.
Call<Void> call = apiService.executePeriodicAccrualAccounting(body);
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
 **body** | [**PostRunaccrualsRequest**](PostRunaccrualsRequest.md)|  |

### Return type

[**Void**](.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

