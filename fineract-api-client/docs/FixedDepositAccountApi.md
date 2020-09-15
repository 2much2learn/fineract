# FixedDepositAccountApi

All URIs are relative to *https://demo.fineract.dev/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**accountClosureTemplate**](FixedDepositAccountApi.md#accountClosureTemplate) | **GET** fixeddepositaccounts/{accountId}/template | 
[**delete14**](FixedDepositAccountApi.md#delete14) | **DELETE** fixeddepositaccounts/{accountId} | Delete a fixed deposit application
[**getFixedDepositTemplate**](FixedDepositAccountApi.md#getFixedDepositTemplate) | **GET** fixeddepositaccounts/downloadtemplate | 
[**getFixedDepositTransactionTemplate**](FixedDepositAccountApi.md#getFixedDepositTransactionTemplate) | **GET** fixeddepositaccounts/transaction/downloadtemplate | 
[**handleCommands4**](FixedDepositAccountApi.md#handleCommands4) | **POST** fixeddepositaccounts/{accountId} | Approve fixed deposit application | Undo approval fixed deposit application | Reject fixed deposit application | Withdraw fixed deposit application | Activate a fixed deposit account | Close a fixed deposit account | Premature Close a fixed deposit account | Calculate Premature amount on Fixed deposit account | Calculate Interest on Fixed Deposit Account | Post Interest on Fixed Deposit Account
[**postFixedDepositTemplate**](FixedDepositAccountApi.md#postFixedDepositTemplate) | **POST** fixeddepositaccounts/uploadtemplate | 
[**postFixedDepositTransactionTemplate**](FixedDepositAccountApi.md#postFixedDepositTransactionTemplate) | **POST** fixeddepositaccounts/transaction/uploadtemplate | 
[**retrieveAll28**](FixedDepositAccountApi.md#retrieveAll28) | **GET** fixeddepositaccounts | List Fixed deposit applications/accounts
[**retrieveOne17**](FixedDepositAccountApi.md#retrieveOne17) | **GET** fixeddepositaccounts/{accountId} | Retrieve a fixed deposit application/account
[**submitApplication**](FixedDepositAccountApi.md#submitApplication) | **POST** fixeddepositaccounts | Submit new fixed deposit application
[**template12**](FixedDepositAccountApi.md#template12) | **GET** fixeddepositaccounts/template | Retrieve Fixed Deposit Account Template
[**update14**](FixedDepositAccountApi.md#update14) | **PUT** fixeddepositaccounts/{accountId} | Modify a fixed deposit application

<a name="accountClosureTemplate"></a>
# **accountClosureTemplate**
> String accountClosureTemplate(accountId, command)



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

FixedDepositAccountApi apiService = defaultClient.createService(FixedDepositAccountApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.accountClosureTemplate(accountId, command);
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

<a name="delete14"></a>
# **delete14**
> DeleteFixedDepositAccountsAccountIdResponse delete14(accountId)

Delete a fixed deposit application

At present we support hard delete of fixed deposit application so long as its in &#x27;Submitted and pending approval&#x27; state. One the application is moves past this state, it is not possible to do a &#x27;hard&#x27; delete of the application or the account. An API endpoint will be added to close/de-activate the fixed deposit account.

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

FixedDepositAccountApi apiService = defaultClient.createService(FixedDepositAccountApi.class);

// Initialize these parameters earlier.
Call<DeleteFixedDepositAccountsAccountIdResponse> call = apiService.delete14(accountId);
call.enqueue(new Callback<DeleteFixedDepositAccountsAccountIdResponse>() {
    @Override
    public void onResponse(Call<DeleteFixedDepositAccountsAccountIdResponse> call, Response<DeleteFixedDepositAccountsAccountIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<DeleteFixedDepositAccountsAccountIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **Long**| accountId |

### Return type

[**DeleteFixedDepositAccountsAccountIdResponse**](DeleteFixedDepositAccountsAccountIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFixedDepositTemplate"></a>
# **getFixedDepositTemplate**
> Void getFixedDepositTemplate(officeId, staffId, dateFormat)



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

FixedDepositAccountApi apiService = defaultClient.createService(FixedDepositAccountApi.class);

// Initialize these parameters earlier.
Call<Void> call = apiService.getFixedDepositTemplate(officeId, staffId, dateFormat);
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

<a name="getFixedDepositTransactionTemplate"></a>
# **getFixedDepositTransactionTemplate**
> Void getFixedDepositTransactionTemplate(officeId, dateFormat)



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

FixedDepositAccountApi apiService = defaultClient.createService(FixedDepositAccountApi.class);

// Initialize these parameters earlier.
Call<Void> call = apiService.getFixedDepositTransactionTemplate(officeId, dateFormat);
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

<a name="handleCommands4"></a>
# **handleCommands4**
> PostFixedDepositAccountsAccountIdResponse handleCommands4(body, accountId, command)

Approve fixed deposit application | Undo approval fixed deposit application | Reject fixed deposit application | Withdraw fixed deposit application | Activate a fixed deposit account | Close a fixed deposit account | Premature Close a fixed deposit account | Calculate Premature amount on Fixed deposit account | Calculate Interest on Fixed Deposit Account | Post Interest on Fixed Deposit Account

Approve fixed deposit application:  Approves fixed deposit application so long as its in &#x27;Submitted and pending approval&#x27; state.  Undo approval fixed deposit application:  Will move &#x27;approved&#x27; fixed deposit application back to &#x27;Submitted and pending approval&#x27; state.  Reject fixed deposit application:  Rejects fixed deposit application so long as its in &#x27;Submitted and pending approval&#x27; state.  Withdraw fixed deposit application:  Used when an applicant withdraws from the fixed deposit application. It must be in &#x27;Submitted and pending approval&#x27; state.  Close a fixed deposit account:  Results in a Matured fixed deposit account being converted into a &#x27;closed&#x27; fixed deposit account.  Premature Close a fixed deposit account:  Results in an Active fixed deposit account being converted into a &#x27;Premature Closed&#x27; fixed deposit account with options to withdraw prematured amount. (premature amount is calculated using interest rate chart applicable along with penal interest if any.)  Calculate Premature amount on Fixed deposit account:  Calculate premature amount on fixed deposit account till premature close date. Premature amount is calculated based on interest chart and penal interest applicable.  Calculate Interest on Fixed Deposit Account:  Calculates interest earned on a fixed deposit account based on todays date. It does not attempt to post or credit the interest on the account. That is responsibility of the Post Interest API that will likely be called by overnight process.  Post Interest on Fixed Deposit Account:  Calculates and Posts interest earned on a fixed deposit account based on today&#x27;s date and whether an interest posting or crediting event is due.  Showing request/response for Calculate Interest on Fixed Deposit Account

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

FixedDepositAccountApi apiService = defaultClient.createService(FixedDepositAccountApi.class);

// Initialize these parameters earlier.
Call<PostFixedDepositAccountsAccountIdResponse> call = apiService.handleCommands4(body, accountId, command);
call.enqueue(new Callback<PostFixedDepositAccountsAccountIdResponse>() {
    @Override
    public void onResponse(Call<PostFixedDepositAccountsAccountIdResponse> call, Response<PostFixedDepositAccountsAccountIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PostFixedDepositAccountsAccountIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PostFixedDepositAccountsAccountIdRequest**](PostFixedDepositAccountsAccountIdRequest.md)|  |
 **accountId** | **Long**| accountId |
 **command** | **String**| command | [optional]

### Return type

[**PostFixedDepositAccountsAccountIdResponse**](PostFixedDepositAccountsAccountIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postFixedDepositTemplate"></a>
# **postFixedDepositTemplate**
> String postFixedDepositTemplate(file, locale, dateFormat)



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

FixedDepositAccountApi apiService = defaultClient.createService(FixedDepositAccountApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.postFixedDepositTemplate(file, locale, dateFormat);
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

<a name="postFixedDepositTransactionTemplate"></a>
# **postFixedDepositTransactionTemplate**
> String postFixedDepositTransactionTemplate(file, locale, dateFormat)



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

FixedDepositAccountApi apiService = defaultClient.createService(FixedDepositAccountApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.postFixedDepositTransactionTemplate(file, locale, dateFormat);
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

<a name="retrieveAll28"></a>
# **retrieveAll28**
> List&lt;GetFixedDepositAccountsResponse&gt; retrieveAll28(paged, offset, limit, orderBy, sortOrder)

List Fixed deposit applications/accounts

Lists Fixed Deposit Accounts  Example Requests:    fixeddepositaccounts    fixeddepositaccounts?fields&#x3D;name

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

FixedDepositAccountApi apiService = defaultClient.createService(FixedDepositAccountApi.class);

// Initialize these parameters earlier.
Call<List&lt;GetFixedDepositAccountsResponse&gt;> call = apiService.retrieveAll28(paged, offset, limit, orderBy, sortOrder);
call.enqueue(new Callback<List&lt;GetFixedDepositAccountsResponse&gt;>() {
    @Override
    public void onResponse(Call<List&lt;GetFixedDepositAccountsResponse&gt;> call, Response<List&lt;GetFixedDepositAccountsResponse&gt;> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<List&lt;GetFixedDepositAccountsResponse&gt;> call, Throwable t) {
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

[**List&lt;GetFixedDepositAccountsResponse&gt;**](GetFixedDepositAccountsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveOne17"></a>
# **retrieveOne17**
> GetFixedDepositAccountsAccountIdResponse retrieveOne17(accountId, staffInSelectedOfficeOnly, chargeStatus)

Retrieve a fixed deposit application/account

Retrieves a fixed deposit application/account  Example Requests :    fixeddepositaccounts/1  fixeddepositaccounts/1?associations&#x3D;all

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

FixedDepositAccountApi apiService = defaultClient.createService(FixedDepositAccountApi.class);

// Initialize these parameters earlier.
Call<GetFixedDepositAccountsAccountIdResponse> call = apiService.retrieveOne17(accountId, staffInSelectedOfficeOnly, chargeStatus);
call.enqueue(new Callback<GetFixedDepositAccountsAccountIdResponse>() {
    @Override
    public void onResponse(Call<GetFixedDepositAccountsAccountIdResponse> call, Response<GetFixedDepositAccountsAccountIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetFixedDepositAccountsAccountIdResponse> call, Throwable t) {
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

[**GetFixedDepositAccountsAccountIdResponse**](GetFixedDepositAccountsAccountIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="submitApplication"></a>
# **submitApplication**
> PostFixedDepositAccountsResponse submitApplication(body)

Submit new fixed deposit application

Submits a new fixed deposit applicationMandatory Fields: clientId or groupId, productId, submittedOnDate, depositAmount, depositPeriod, depositPeriodFrequencyId  Optional Fields: accountNo, externalId, fieldOfficerId,linkAccountId(if provided initial deposit amount will be collected from this account),transferInterestToSavings(By enabling this flag all interest postings will be transferred to linked saving account )

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

FixedDepositAccountApi apiService = defaultClient.createService(FixedDepositAccountApi.class);

// Initialize these parameters earlier.
Call<PostFixedDepositAccountsResponse> call = apiService.submitApplication(body);
call.enqueue(new Callback<PostFixedDepositAccountsResponse>() {
    @Override
    public void onResponse(Call<PostFixedDepositAccountsResponse> call, Response<PostFixedDepositAccountsResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PostFixedDepositAccountsResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PostFixedDepositAccountsRequest**](PostFixedDepositAccountsRequest.md)|  |

### Return type

[**PostFixedDepositAccountsResponse**](PostFixedDepositAccountsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="template12"></a>
# **template12**
> GetFixedDepositAccountsTemplateResponse template12(clientId, groupId, productId, staffInSelectedOfficeOnly)

Retrieve Fixed Deposit Account Template

This is a convenience resource. It can be useful when building maintenance user interface screens for fixed deposit applications. The template data returned consists of any or all of:    Field Defaults  Allowed Value ListsExample Requests:    fixeddepositaccounts/template?clientId&#x3D;1

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

FixedDepositAccountApi apiService = defaultClient.createService(FixedDepositAccountApi.class);

// Initialize these parameters earlier.
Call<GetFixedDepositAccountsTemplateResponse> call = apiService.template12(clientId, groupId, productId, staffInSelectedOfficeOnly);
call.enqueue(new Callback<GetFixedDepositAccountsTemplateResponse>() {
    @Override
    public void onResponse(Call<GetFixedDepositAccountsTemplateResponse> call, Response<GetFixedDepositAccountsTemplateResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetFixedDepositAccountsTemplateResponse> call, Throwable t) {
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

[**GetFixedDepositAccountsTemplateResponse**](GetFixedDepositAccountsTemplateResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="update14"></a>
# **update14**
> PutFixedDepositAccountsAccountIdResponse update14(body, accountId)

Modify a fixed deposit application

Fixed deposit application can only be modified when in &#x27;Submitted and pending approval&#x27; state. Once the application is approved, the details cannot be changed using this method. Specific api endpoints will be created to allow change of interest detail such as rate, compounding period, posting period etc

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

FixedDepositAccountApi apiService = defaultClient.createService(FixedDepositAccountApi.class);

// Initialize these parameters earlier.
Call<PutFixedDepositAccountsAccountIdResponse> call = apiService.update14(body, accountId);
call.enqueue(new Callback<PutFixedDepositAccountsAccountIdResponse>() {
    @Override
    public void onResponse(Call<PutFixedDepositAccountsAccountIdResponse> call, Response<PutFixedDepositAccountsAccountIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PutFixedDepositAccountsAccountIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PutFixedDepositAccountsAccountIdRequest**](PutFixedDepositAccountsAccountIdRequest.md)|  |
 **accountId** | **Long**| accountId |

### Return type

[**PutFixedDepositAccountsAccountIdResponse**](PutFixedDepositAccountsAccountIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

