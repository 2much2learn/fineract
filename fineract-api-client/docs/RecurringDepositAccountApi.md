# RecurringDepositAccountApi

All URIs are relative to *https://demo.fineract.dev/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**accountClosureTemplate1**](RecurringDepositAccountApi.md#accountClosureTemplate1) | **GET** recurringdepositaccounts/{accountId}/template | 
[**delete16**](RecurringDepositAccountApi.md#delete16) | **DELETE** recurringdepositaccounts/{accountId} | Delete a recurring deposit application
[**getRecurringDepositTemplate**](RecurringDepositAccountApi.md#getRecurringDepositTemplate) | **GET** recurringdepositaccounts/downloadtemplate | 
[**getRecurringDepositTransactionTemplate**](RecurringDepositAccountApi.md#getRecurringDepositTransactionTemplate) | **GET** recurringdepositaccounts/transactions/downloadtemplate | 
[**handleCommands5**](RecurringDepositAccountApi.md#handleCommands5) | **POST** recurringdepositaccounts/{accountId} | Approve recurring deposit application | Undo approval recurring deposit application | Reject recurring deposit application | Withdraw recurring deposit application | Activate a recurring deposit account | Update the recommended deposit amount for a recurring deposit account | Close a recurring deposit account | Premature Close a recurring deposit account | Calculate Premature amount on Recurring deposit account | Calculate Interest on recurring Deposit Account | Post Interest on recurring Deposit Account
[**postRecurringDepositTemplate**](RecurringDepositAccountApi.md#postRecurringDepositTemplate) | **POST** recurringdepositaccounts/uploadtemplate | 
[**postRecurringDepositTransactionsTemplate**](RecurringDepositAccountApi.md#postRecurringDepositTransactionsTemplate) | **POST** recurringdepositaccounts/transactions/uploadtemplate | 
[**retrieveAll30**](RecurringDepositAccountApi.md#retrieveAll30) | **GET** recurringdepositaccounts | List Recurring deposit applications/accounts
[**retrieveOne20**](RecurringDepositAccountApi.md#retrieveOne20) | **GET** recurringdepositaccounts/{accountId} | Retrieve a recurring deposit application/account
[**submitApplication1**](RecurringDepositAccountApi.md#submitApplication1) | **POST** recurringdepositaccounts | Submit new recurring deposit application
[**template13**](RecurringDepositAccountApi.md#template13) | **GET** recurringdepositaccounts/template | Retrieve recurring Deposit Account Template
[**update16**](RecurringDepositAccountApi.md#update16) | **PUT** recurringdepositaccounts/{accountId} | Modify a recurring deposit application

<a name="accountClosureTemplate1"></a>
# **accountClosureTemplate1**
> String accountClosureTemplate1(accountId, command)



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

RecurringDepositAccountApi apiService = defaultClient.createService(RecurringDepositAccountApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.accountClosureTemplate1(accountId, command);
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
 **accountId** | **Long**| accountId |
 **command** | **String**| command | [optional]

### Return type

**String**

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="delete16"></a>
# **delete16**
> DeleteRecurringDepositAccountsResponse delete16(accountId)

Delete a recurring deposit application

At present we support hard delete of recurring deposit application so long as its in &#x27;Submitted and pending approval&#x27; state. One the application is moves past this state, it is not possible to do a &#x27;hard&#x27; delete of the application or the account. An API endpoint will be added to close/de-activate the recurring deposit account.

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

RecurringDepositAccountApi apiService = defaultClient.createService(RecurringDepositAccountApi.class);

// Initialize these parameters earlier.
Call<DeleteRecurringDepositAccountsResponse> call = apiService.delete16(accountId);
call.enqueue(new Callback<DeleteRecurringDepositAccountsResponse>() {
    @Override
    public void onResponse(Call<DeleteRecurringDepositAccountsResponse> call, Response<DeleteRecurringDepositAccountsResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<DeleteRecurringDepositAccountsResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **Long**| accountId |

### Return type

[**DeleteRecurringDepositAccountsResponse**](DeleteRecurringDepositAccountsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getRecurringDepositTemplate"></a>
# **getRecurringDepositTemplate**
> Void getRecurringDepositTemplate(officeId, staffId, dateFormat)



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

RecurringDepositAccountApi apiService = defaultClient.createService(RecurringDepositAccountApi.class);

// Initialize these parameters earlier.
Call<Void> call = apiService.getRecurringDepositTemplate(officeId, staffId, dateFormat);
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
 **officeId** | **Long**|  | [optional]
 **staffId** | **Long**|  | [optional]
 **dateFormat** | **String**|  | [optional]

### Return type

[**Void**](.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.ms-excel

<a name="getRecurringDepositTransactionTemplate"></a>
# **getRecurringDepositTransactionTemplate**
> Void getRecurringDepositTransactionTemplate(officeId, dateFormat)



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

RecurringDepositAccountApi apiService = defaultClient.createService(RecurringDepositAccountApi.class);

// Initialize these parameters earlier.
Call<Void> call = apiService.getRecurringDepositTransactionTemplate(officeId, dateFormat);
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
 **officeId** | **Long**|  | [optional]
 **dateFormat** | **String**|  | [optional]

### Return type

[**Void**](.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.ms-excel

<a name="handleCommands5"></a>
# **handleCommands5**
> PostRecurringDepositAccountsAccountIdResponse handleCommands5(body, accountId, command)

Approve recurring deposit application | Undo approval recurring deposit application | Reject recurring deposit application | Withdraw recurring deposit application | Activate a recurring deposit account | Update the recommended deposit amount for a recurring deposit account | Close a recurring deposit account | Premature Close a recurring deposit account | Calculate Premature amount on Recurring deposit account | Calculate Interest on recurring Deposit Account | Post Interest on recurring Deposit Account

Approve recurring deposit application:  Approves recurring deposit application so long as its in &#x27;Submitted and pending approval&#x27; state.  Undo approval recurring deposit application:  Will move &#x27;approved&#x27; recurring deposit application back to &#x27;Submitted and pending approval&#x27; state.  Reject recurring deposit application  Rejects recurring deposit application so long as its in &#x27;Submitted and pending approval&#x27; state.  Withdraw recurring deposit application:  Used when an applicant withdraws from the recurring deposit application. It must be in &#x27;Submitted and pending approval&#x27; state.  Activate a recurring deposit account:  Results in an approved recurring deposit application being converted into an &#x27;active&#x27; recurring deposit account.  Update the recommended deposit amount for a recurring deposit account:  Updates the recommended deposit amount for a RD account as on the effective date.  Close a recurring deposit account  Results in a Matured recurring deposit account being converted into a &#x27;closed&#x27; recurring deposit account.  On account close allowed actions are.Premature Close a recurring deposit account:  Results in an Active recurring deposit account being converted into a &#x27;Premature Closed&#x27; recurring deposit account with options to withdraw prematured amount. (premature amount is calculated using interest rate chart applicable along with penal interest if any.)  On account premature closure allowed actions are.  Calculate Premature amount on Recurring deposit account:  Calculate premature amount on recurring deposit till premature close date. Premature amount is calculated based on interest chart and penal interest applicable if any.  Calculate Interest on recurring Deposit Account:  Calculates interest earned on a recurring deposit account based on todays date. It does not attempt to post or credit the interest on the account. That is responsibility of the Post Interest API that will likely be called by overnight process.  Post Interest on recurring Deposit Account:  Calculates and Posts interest earned on a recurring deposit account based on todays date and whether an interest posting or crediting event is due.  Showing request/response for &#x27;Post Interest on recurring Deposit Account&#x27;

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

RecurringDepositAccountApi apiService = defaultClient.createService(RecurringDepositAccountApi.class);

// Initialize these parameters earlier.
Call<PostRecurringDepositAccountsAccountIdResponse> call = apiService.handleCommands5(body, accountId, command);
call.enqueue(new Callback<PostRecurringDepositAccountsAccountIdResponse>() {
    @Override
    public void onResponse(Call<PostRecurringDepositAccountsAccountIdResponse> call, Response<PostRecurringDepositAccountsAccountIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PostRecurringDepositAccountsAccountIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PostRecurringDepositAccountsAccountIdRequest**](PostRecurringDepositAccountsAccountIdRequest.md)|  |
 **accountId** | **Long**| accountId |
 **command** | **String**| command | [optional]

### Return type

[**PostRecurringDepositAccountsAccountIdResponse**](PostRecurringDepositAccountsAccountIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postRecurringDepositTemplate"></a>
# **postRecurringDepositTemplate**
> String postRecurringDepositTemplate(file, locale, dateFormat)



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

RecurringDepositAccountApi apiService = defaultClient.createService(RecurringDepositAccountApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.postRecurringDepositTemplate(file, locale, dateFormat);
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
 **file** | [**FormDataContentDisposition**](.md)|  | [optional]
 **locale** | **String**|  | [optional]
 **dateFormat** | **String**|  | [optional]

### Return type

**String**

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: */*

<a name="postRecurringDepositTransactionsTemplate"></a>
# **postRecurringDepositTransactionsTemplate**
> String postRecurringDepositTransactionsTemplate(file, locale, dateFormat)



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

RecurringDepositAccountApi apiService = defaultClient.createService(RecurringDepositAccountApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.postRecurringDepositTransactionsTemplate(file, locale, dateFormat);
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
 **file** | [**FormDataContentDisposition**](.md)|  | [optional]
 **locale** | **String**|  | [optional]
 **dateFormat** | **String**|  | [optional]

### Return type

**String**

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: */*

<a name="retrieveAll30"></a>
# **retrieveAll30**
> List&lt;GetRecurringDepositAccountsResponse&gt; retrieveAll30(paged, offset, limit, orderBy, sortOrder)

List Recurring deposit applications/accounts

Lists Recurring deposit applications/accounts  Example Requests:  recurringdepositaccounts   recurringdepositaccounts?fields&#x3D;name

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

RecurringDepositAccountApi apiService = defaultClient.createService(RecurringDepositAccountApi.class);

// Initialize these parameters earlier.
Call<List&lt;GetRecurringDepositAccountsResponse&gt;> call = apiService.retrieveAll30(paged, offset, limit, orderBy, sortOrder);
call.enqueue(new Callback<List&lt;GetRecurringDepositAccountsResponse&gt;>() {
    @Override
    public void onResponse(Call<List&lt;GetRecurringDepositAccountsResponse&gt;> call, Response<List&lt;GetRecurringDepositAccountsResponse&gt;> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<List&lt;GetRecurringDepositAccountsResponse&gt;> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paged** | **Boolean**| paged | [optional]
 **offset** | **Integer**| offset | [optional]
 **limit** | **Integer**| limit | [optional]
 **orderBy** | **String**| orderBy | [optional]
 **sortOrder** | **String**| sortOrder | [optional]

### Return type

[**List&lt;GetRecurringDepositAccountsResponse&gt;**](GetRecurringDepositAccountsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveOne20"></a>
# **retrieveOne20**
> GetRecurringDepositAccountsAccountIdResponse retrieveOne20(accountId, staffInSelectedOfficeOnly, chargeStatus)

Retrieve a recurring deposit application/account

Retrieves a recurring deposit application/account  Example Requests :  recurringdepositaccounts/1   recurringdepositaccounts/1?associations&#x3D;all

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

RecurringDepositAccountApi apiService = defaultClient.createService(RecurringDepositAccountApi.class);

// Initialize these parameters earlier.
Call<GetRecurringDepositAccountsAccountIdResponse> call = apiService.retrieveOne20(accountId, staffInSelectedOfficeOnly, chargeStatus);
call.enqueue(new Callback<GetRecurringDepositAccountsAccountIdResponse>() {
    @Override
    public void onResponse(Call<GetRecurringDepositAccountsAccountIdResponse> call, Response<GetRecurringDepositAccountsAccountIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetRecurringDepositAccountsAccountIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **Long**| accountId |
 **staffInSelectedOfficeOnly** | **Boolean**| staffInSelectedOfficeOnly | [optional] [default to false]
 **chargeStatus** | **String**| chargeStatus | [optional] [default to all]

### Return type

[**GetRecurringDepositAccountsAccountIdResponse**](GetRecurringDepositAccountsAccountIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="submitApplication1"></a>
# **submitApplication1**
> PostRecurringDepositAccountsResponse submitApplication1(body)

Submit new recurring deposit application

Submits new recurring deposit application  Mandatory Fields: clientId or groupId, productId, submittedOnDate, depositAmount, depositPeriod, depositPeriodFrequencyId  Optional Fields: accountNo, externalId, fieldOfficerId,linkAccountId(if provided initial deposit amount will be collected from this account),transferInterestToSavings(By enabling this flag all interest postings will be transferred to linked saving account )  Inherited from Product (if not provided): interestCompoundingPeriodType, interestCalculationType, interestCalculationDaysInYearType, lockinPeriodFrequency, lockinPeriodFrequencyType, preClosurePenalApplicable, preClosurePenalInterest, preClosurePenalInterestOnTypeId, charts, withHoldTax

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

RecurringDepositAccountApi apiService = defaultClient.createService(RecurringDepositAccountApi.class);

// Initialize these parameters earlier.
Call<PostRecurringDepositAccountsResponse> call = apiService.submitApplication1(body);
call.enqueue(new Callback<PostRecurringDepositAccountsResponse>() {
    @Override
    public void onResponse(Call<PostRecurringDepositAccountsResponse> call, Response<PostRecurringDepositAccountsResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PostRecurringDepositAccountsResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PostRecurringDepositAccountsRequest**](PostRecurringDepositAccountsRequest.md)|  |

### Return type

[**PostRecurringDepositAccountsResponse**](PostRecurringDepositAccountsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="template13"></a>
# **template13**
> GetRecurringDepositAccountsTemplateResponse template13(clientId, groupId, productId, staffInSelectedOfficeOnly)

Retrieve recurring Deposit Account Template

This is a convenience resource. It can be useful when building maintenance user interface screens for recurring deposit applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists  Example Requests:  recurringdepositaccounts/template?clientId&#x3D;1   recurringdepositaccounts/template?clientId&#x3D;1&amp;productId&#x3D;1

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

RecurringDepositAccountApi apiService = defaultClient.createService(RecurringDepositAccountApi.class);

// Initialize these parameters earlier.
Call<GetRecurringDepositAccountsTemplateResponse> call = apiService.template13(clientId, groupId, productId, staffInSelectedOfficeOnly);
call.enqueue(new Callback<GetRecurringDepositAccountsTemplateResponse>() {
    @Override
    public void onResponse(Call<GetRecurringDepositAccountsTemplateResponse> call, Response<GetRecurringDepositAccountsTemplateResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetRecurringDepositAccountsTemplateResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **Long**| clientId | [optional]
 **groupId** | **Long**| groupId | [optional]
 **productId** | **Long**| productId | [optional]
 **staffInSelectedOfficeOnly** | **Boolean**| staffInSelectedOfficeOnly | [optional] [default to false]

### Return type

[**GetRecurringDepositAccountsTemplateResponse**](GetRecurringDepositAccountsTemplateResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="update16"></a>
# **update16**
> PutRecurringDepositAccountsAccountIdResponse update16(body, accountId)

Modify a recurring deposit application

Recurring deposit application can only be modified when in &#x27;Submitted and pending approval&#x27; state. Once the application is approved, the details cannot be changed using this method. Specific api endpoints will be created to allow change of interest detail such as rate, compounding period, posting period etc

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

RecurringDepositAccountApi apiService = defaultClient.createService(RecurringDepositAccountApi.class);

// Initialize these parameters earlier.
Call<PutRecurringDepositAccountsAccountIdResponse> call = apiService.update16(body, accountId);
call.enqueue(new Callback<PutRecurringDepositAccountsAccountIdResponse>() {
    @Override
    public void onResponse(Call<PutRecurringDepositAccountsAccountIdResponse> call, Response<PutRecurringDepositAccountsAccountIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PutRecurringDepositAccountsAccountIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PutRecurringDepositAccountsAccountIdRequest**](PutRecurringDepositAccountsAccountIdRequest.md)|  |
 **accountId** | **Long**| accountId |

### Return type

[**PutRecurringDepositAccountsAccountIdResponse**](PutRecurringDepositAccountsAccountIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

