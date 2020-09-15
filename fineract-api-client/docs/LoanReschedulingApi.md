# LoanReschedulingApi

All URIs are relative to *https://demo.fineract.dev/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**calculateLoanScheduleOrSubmitVariableSchedule**](LoanReschedulingApi.md#calculateLoanScheduleOrSubmitVariableSchedule) | **POST** loans/{loanId}/schedule | Calculate loan repayment schedule based on Loan term variations | Updates loan repayment schedule based on Loan term variations | Updates loan repayment schedule by removing Loan term variations

<a name="calculateLoanScheduleOrSubmitVariableSchedule"></a>
# **calculateLoanScheduleOrSubmitVariableSchedule**
> PostLoansLoanIdScheduleResponse calculateLoanScheduleOrSubmitVariableSchedule(body, loanId, command)

Calculate loan repayment schedule based on Loan term variations | Updates loan repayment schedule based on Loan term variations | Updates loan repayment schedule by removing Loan term variations

Calculate loan repayment schedule based on Loan term variations:  Mandatory Fields: exceptions,locale,dateFormat  Updates loan repayment schedule based on Loan term variations:  Mandatory Fields: exceptions,locale,dateFormat  Updates loan repayment schedule by removing Loan term variations:  It updates the loan repayment schedule by removing Loan term variations  Showing request/response for &#x27;Updates loan repayment schedule by removing Loan term variations&#x27;

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

LoanReschedulingApi apiService = defaultClient.createService(LoanReschedulingApi.class);

// Initialize these parameters earlier.
Call<PostLoansLoanIdScheduleResponse> call = apiService.calculateLoanScheduleOrSubmitVariableSchedule(body, loanId, command);
call.enqueue(new Callback<PostLoansLoanIdScheduleResponse>() {
    @Override
    public void onResponse(Call<PostLoansLoanIdScheduleResponse> call, Response<PostLoansLoanIdScheduleResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PostLoansLoanIdScheduleResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PostLoansLoanIdScheduleRequest**](PostLoansLoanIdScheduleRequest.md)|  |
 **loanId** | **Long**| loanId |
 **command** | **String**| command | [optional]

### Return type

[**PostLoansLoanIdScheduleResponse**](PostLoansLoanIdScheduleResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

