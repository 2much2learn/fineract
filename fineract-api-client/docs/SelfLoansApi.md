# SelfLoansApi

All URIs are relative to *https://demo.fineract.dev/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**calculateLoanScheduleOrSubmitLoanApplication1**](SelfLoansApi.md#calculateLoanScheduleOrSubmitLoanApplication1) | **POST** self/loans | Calculate Loan Repayment Schedule | Submit a new Loan Application
[**modifyLoanApplication1**](SelfLoansApi.md#modifyLoanApplication1) | **PUT** self/loans/{loanId} | Update a Loan Application
[**retrieveAllLoanCharges1**](SelfLoansApi.md#retrieveAllLoanCharges1) | **GET** self/loans/{loanId}/charges | List Loan Charges
[**retrieveGuarantorDetails2**](SelfLoansApi.md#retrieveGuarantorDetails2) | **GET** self/loans/{loanId}/guarantors | 
[**retrieveLoan1**](SelfLoansApi.md#retrieveLoan1) | **GET** self/loans/{loanId} | Retrieve a Loan
[**retrieveLoanCharge1**](SelfLoansApi.md#retrieveLoanCharge1) | **GET** self/loans/{loanId}/charges/{chargeId} | Retrieve a Loan Charge
[**retrieveTransaction1**](SelfLoansApi.md#retrieveTransaction1) | **GET** self/loans/{loanId}/transactions/{transactionId} | Retrieve a Loan Transaction Details
[**stateTransitions1**](SelfLoansApi.md#stateTransitions1) | **POST** self/loans/{loanId} | Applicant Withdraws from Loan Application
[**template17**](SelfLoansApi.md#template17) | **GET** self/loans/template | Retrieve Loan Details Template

<a name="calculateLoanScheduleOrSubmitLoanApplication1"></a>
# **calculateLoanScheduleOrSubmitLoanApplication1**
> PostSelfLoansResponse calculateLoanScheduleOrSubmitLoanApplication1(body, command)

Calculate Loan Repayment Schedule | Submit a new Loan Application

Calculate Loan Repayment Schedule:  Calculates Loan Repayment Schedule  Mandatory Fields: productId, principal, loanTermFrequency, loanTermFrequencyType, numberOfRepayments, repaymentEvery, repaymentFrequencyType, interestRatePerPeriod, amortizationType, interestType, interestCalculationPeriodType, expectedDisbursementDate, transactionProcessingStrategyId  Submit a new Loan Application:  Mandatory Fields: clientId, productId, principal, loanTermFrequency, loanTermFrequencyType, loanType, numberOfRepayments, repaymentEvery, repaymentFrequencyType, interestRatePerPeriod, amortizationType, interestType, interestCalculationPeriodType, transactionProcessingStrategyId, expectedDisbursementDate, submittedOnDate, loanType  Additional Mandatory Fields if interest recalculation is enabled for product and Rest frequency not same as repayment period: recalculationRestFrequencyDate  Additional Mandatory Fields if interest recalculation with interest/fee compounding is enabled for product and compounding frequency not same as repayment period: recalculationCompoundingFrequencyDate  Additional Mandatory Field if Entity-Datatable Check is enabled for the entity of type loan: datatables  Optional Fields: graceOnPrincipalPayment, graceOnInterestPayment, graceOnInterestCharged, linkAccountId, allowPartialPeriodInterestCalcualtion, fixedEmiAmount, maxOutstandingLoanBalance, disbursementData, graceOnArrearsAgeing, createStandingInstructionAtDisbursement (requires linkedAccountId if set to true)  Showing request/response for &#x27;Submit a new Loan Application&#x27;

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

SelfLoansApi apiService = defaultClient.createService(SelfLoansApi.class);

// Initialize these parameters earlier.
Call<PostSelfLoansResponse> call = apiService.calculateLoanScheduleOrSubmitLoanApplication1(body, command);
call.enqueue(new Callback<PostSelfLoansResponse>() {
    @Override
    public void onResponse(Call<PostSelfLoansResponse> call, Response<PostSelfLoansResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PostSelfLoansResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PostSelfLoansRequest**](PostSelfLoansRequest.md)|  |
 **command** | **String**| command | [optional]

### Return type

[**PostSelfLoansResponse**](PostSelfLoansResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="modifyLoanApplication1"></a>
# **modifyLoanApplication1**
> PutSelfLoansLoanIdResponse modifyLoanApplication1(body, loanId)

Update a Loan Application

Loan application can only be modified when in &#x27;Submitted and pending approval&#x27; state. Once the application is approved, the details cannot be changed using this method.

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

SelfLoansApi apiService = defaultClient.createService(SelfLoansApi.class);

// Initialize these parameters earlier.
Call<PutSelfLoansLoanIdResponse> call = apiService.modifyLoanApplication1(body, loanId);
call.enqueue(new Callback<PutSelfLoansLoanIdResponse>() {
    @Override
    public void onResponse(Call<PutSelfLoansLoanIdResponse> call, Response<PutSelfLoansLoanIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PutSelfLoansLoanIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PutSelfLoansLoanIdRequest**](PutSelfLoansLoanIdRequest.md)|  |
 **loanId** | **Long**| loanId |

### Return type

[**PutSelfLoansLoanIdResponse**](PutSelfLoansLoanIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveAllLoanCharges1"></a>
# **retrieveAllLoanCharges1**
> List&lt;GetSelfLoansLoanIdChargesResponse&gt; retrieveAllLoanCharges1(loanId)

List Loan Charges

Lists loan Charges  Example Requests:  self/loans/1/charges   self/loans/1/charges?fields&#x3D;name,amountOrPercentage

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

SelfLoansApi apiService = defaultClient.createService(SelfLoansApi.class);

// Initialize these parameters earlier.
Call<List&lt;GetSelfLoansLoanIdChargesResponse&gt;> call = apiService.retrieveAllLoanCharges1(loanId);
call.enqueue(new Callback<List&lt;GetSelfLoansLoanIdChargesResponse&gt;>() {
    @Override
    public void onResponse(Call<List&lt;GetSelfLoansLoanIdChargesResponse&gt;> call, Response<List&lt;GetSelfLoansLoanIdChargesResponse&gt;> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<List&lt;GetSelfLoansLoanIdChargesResponse&gt;> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loanId** | **Long**| loanId |

### Return type

[**List&lt;GetSelfLoansLoanIdChargesResponse&gt;**](GetSelfLoansLoanIdChargesResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveGuarantorDetails2"></a>
# **retrieveGuarantorDetails2**
> String retrieveGuarantorDetails2(loanId)



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

SelfLoansApi apiService = defaultClient.createService(SelfLoansApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.retrieveGuarantorDetails2(loanId);
call.enqueue(new Callback<String>() {
    @Override
    public void onResponse(Call<String> call, Response<String> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<String> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loanId** | **Long**|  |

### Return type

**String**

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveLoan1"></a>
# **retrieveLoan1**
> GetSelfLoansLoanIdResponse retrieveLoan1(loanId)

Retrieve a Loan

Retrieves a Loan  Example Requests:  self/loans/1   self/loans/1?fields&#x3D;id,principal,annualInterestRate   self/loans/1?fields&#x3D;id,principal,annualInterestRate&amp;associations&#x3D;repaymentSchedule,transactions

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

SelfLoansApi apiService = defaultClient.createService(SelfLoansApi.class);

// Initialize these parameters earlier.
Call<GetSelfLoansLoanIdResponse> call = apiService.retrieveLoan1(loanId);
call.enqueue(new Callback<GetSelfLoansLoanIdResponse>() {
    @Override
    public void onResponse(Call<GetSelfLoansLoanIdResponse> call, Response<GetSelfLoansLoanIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetSelfLoansLoanIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loanId** | **Long**| loanId |

### Return type

[**GetSelfLoansLoanIdResponse**](GetSelfLoansLoanIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveLoanCharge1"></a>
# **retrieveLoanCharge1**
> GetSelfLoansLoanIdChargesResponse retrieveLoanCharge1(loanId, chargeId)

Retrieve a Loan Charge

Retrieves a Loan Charge  Example Requests:  self/loans/1/charges/1   self/loans/1/charges/1?fields&#x3D;name,amountOrPercentage

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

SelfLoansApi apiService = defaultClient.createService(SelfLoansApi.class);

// Initialize these parameters earlier.
Call<GetSelfLoansLoanIdChargesResponse> call = apiService.retrieveLoanCharge1(loanId, chargeId);
call.enqueue(new Callback<GetSelfLoansLoanIdChargesResponse>() {
    @Override
    public void onResponse(Call<GetSelfLoansLoanIdChargesResponse> call, Response<GetSelfLoansLoanIdChargesResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetSelfLoansLoanIdChargesResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loanId** | **Long**| loanId |
 **chargeId** | **Long**| chargeId |

### Return type

[**GetSelfLoansLoanIdChargesResponse**](GetSelfLoansLoanIdChargesResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveTransaction1"></a>
# **retrieveTransaction1**
> GetSelfLoansLoanIdTransactionsTransactionIdResponse retrieveTransaction1(loanId, transactionId)

Retrieve a Loan Transaction Details

Retrieves a Loan Transaction DetailsExample Request:  self/loans/5/transactions/3

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

SelfLoansApi apiService = defaultClient.createService(SelfLoansApi.class);

// Initialize these parameters earlier.
Call<GetSelfLoansLoanIdTransactionsTransactionIdResponse> call = apiService.retrieveTransaction1(loanId, transactionId);
call.enqueue(new Callback<GetSelfLoansLoanIdTransactionsTransactionIdResponse>() {
    @Override
    public void onResponse(Call<GetSelfLoansLoanIdTransactionsTransactionIdResponse> call, Response<GetSelfLoansLoanIdTransactionsTransactionIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetSelfLoansLoanIdTransactionsTransactionIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loanId** | **Long**| loanId |
 **transactionId** | **Long**| transactionId |

### Return type

[**GetSelfLoansLoanIdTransactionsTransactionIdResponse**](GetSelfLoansLoanIdTransactionsTransactionIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="stateTransitions1"></a>
# **stateTransitions1**
> PostSelfLoansLoanIdResponse stateTransitions1(body, loanId, command)

Applicant Withdraws from Loan Application

Applicant Withdraws from Loan Application  Mandatory Fields: withdrawnOnDate

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

SelfLoansApi apiService = defaultClient.createService(SelfLoansApi.class);

// Initialize these parameters earlier.
Call<PostSelfLoansLoanIdResponse> call = apiService.stateTransitions1(body, loanId, command);
call.enqueue(new Callback<PostSelfLoansLoanIdResponse>() {
    @Override
    public void onResponse(Call<PostSelfLoansLoanIdResponse> call, Response<PostSelfLoansLoanIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PostSelfLoansLoanIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PostSelfLoansLoanIdRequest**](PostSelfLoansLoanIdRequest.md)|  |
 **loanId** | **Long**| loanId |
 **command** | **String**| command | [optional]

### Return type

[**PostSelfLoansLoanIdResponse**](PostSelfLoansLoanIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="template17"></a>
# **template17**
> GetSelfLoansTemplateResponse template17(clientId, productId, templateType)

Retrieve Loan Details Template

Retrieves Loan Details Template  This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed description Lists  Example Requests:  self/loans/template?templateType&#x3D;individual&amp;clientId&#x3D;1   self/loans/template?templateType&#x3D;individual&amp;clientId&#x3D;1&amp;productId&#x3D;1

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

SelfLoansApi apiService = defaultClient.createService(SelfLoansApi.class);

// Initialize these parameters earlier.
Call<GetSelfLoansTemplateResponse> call = apiService.template17(clientId, productId, templateType);
call.enqueue(new Callback<GetSelfLoansTemplateResponse>() {
    @Override
    public void onResponse(Call<GetSelfLoansTemplateResponse> call, Response<GetSelfLoansTemplateResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetSelfLoansTemplateResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **Long**| clientId | [optional]
 **productId** | **Long**| productId | [optional]
 **templateType** | **String**| templateType | [optional]

### Return type

[**GetSelfLoansTemplateResponse**](GetSelfLoansTemplateResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

