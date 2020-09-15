# AccountingRulesApi

All URIs are relative to *https://demo.fineract.dev/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAccountingRule**](AccountingRulesApi.md#createAccountingRule) | **POST** accountingrules | Create/Define a Accounting rule
[**deleteAccountingRule**](AccountingRulesApi.md#deleteAccountingRule) | **DELETE** accountingrules/{accountingRuleId} | Delete a Accounting Rule
[**retreiveAccountingRule**](AccountingRulesApi.md#retreiveAccountingRule) | **GET** accountingrules/{accountingRuleId} | Retrieve a Accounting rule
[**retrieveAllAccountingRules**](AccountingRulesApi.md#retrieveAllAccountingRules) | **GET** accountingrules | Retrieve Accounting Rules
[**retrieveTemplate1**](AccountingRulesApi.md#retrieveTemplate1) | **GET** accountingrules/template | Retrieve Accounting Rule Details Template
[**updateAccountingRule**](AccountingRulesApi.md#updateAccountingRule) | **PUT** accountingrules/{accountingRuleId} | Update a Accounting Rule

<a name="createAccountingRule"></a>
# **createAccountingRule**
> PostAccountingRulesResponse createAccountingRule(body)

Create/Define a Accounting rule

Define a new Accounting rule.  Mandatory Fields name, officeId, accountToDebit OR debitTags, accountToCredit OR creditTags.  Optional Fields description

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

AccountingRulesApi apiService = defaultClient.createService(AccountingRulesApi.class);

// Initialize these parameters earlier.
Call<PostAccountingRulesResponse> call = apiService.createAccountingRule(body);
call.enqueue(new Callback<PostAccountingRulesResponse>() {
    @Override
    public void onResponse(Call<PostAccountingRulesResponse> call, Response<PostAccountingRulesResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PostAccountingRulesResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PostAccountingRulesRequest**](PostAccountingRulesRequest.md)|  | [optional]

### Return type

[**PostAccountingRulesResponse**](PostAccountingRulesResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteAccountingRule"></a>
# **deleteAccountingRule**
> DeleteAccountingRulesResponse deleteAccountingRule(accountingRuleId)

Delete a Accounting Rule

Deletes a Accounting rule.

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

AccountingRulesApi apiService = defaultClient.createService(AccountingRulesApi.class);

// Initialize these parameters earlier.
Call<DeleteAccountingRulesResponse> call = apiService.deleteAccountingRule(accountingRuleId);
call.enqueue(new Callback<DeleteAccountingRulesResponse>() {
    @Override
    public void onResponse(Call<DeleteAccountingRulesResponse> call, Response<DeleteAccountingRulesResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<DeleteAccountingRulesResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountingRuleId** | **Long**| accountingRuleId |

### Return type

[**DeleteAccountingRulesResponse**](DeleteAccountingRulesResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retreiveAccountingRule"></a>
# **retreiveAccountingRule**
> AccountingRuleData retreiveAccountingRule(accountingRuleId)

Retrieve a Accounting rule

Returns the details of a defined Accounting rule.  Example Requests:  accountingrules/1

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

AccountingRulesApi apiService = defaultClient.createService(AccountingRulesApi.class);

// Initialize these parameters earlier.
Call<AccountingRuleData> call = apiService.retreiveAccountingRule(accountingRuleId);
call.enqueue(new Callback<AccountingRuleData>() {
    @Override
    public void onResponse(Call<AccountingRuleData> call, Response<AccountingRuleData> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<AccountingRuleData> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountingRuleId** | **Long**| accountingRuleId |

### Return type

[**AccountingRuleData**](AccountingRuleData.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveAllAccountingRules"></a>
# **retrieveAllAccountingRules**
> List&lt;GetAccountRulesResponse&gt; retrieveAllAccountingRules()

Retrieve Accounting Rules

Returns the list of defined accounting rules.  Example Requests:  accountingrules

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

AccountingRulesApi apiService = defaultClient.createService(AccountingRulesApi.class);

// Initialize these parameters earlier.
Call<List&lt;GetAccountRulesResponse&gt;> call = apiService.retrieveAllAccountingRules();
call.enqueue(new Callback<List&lt;GetAccountRulesResponse&gt;>() {
    @Override
    public void onResponse(Call<List&lt;GetAccountRulesResponse&gt;> call, Response<List&lt;GetAccountRulesResponse&gt;> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<List&lt;GetAccountRulesResponse&gt;> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;GetAccountRulesResponse&gt;**](GetAccountRulesResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveTemplate1"></a>
# **retrieveTemplate1**
> GetAccountRulesTemplateResponse retrieveTemplate1()

Retrieve Accounting Rule Details Template

This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists Example Request:  accountingrules/template

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

AccountingRulesApi apiService = defaultClient.createService(AccountingRulesApi.class);

// Initialize these parameters earlier.
Call<GetAccountRulesTemplateResponse> call = apiService.retrieveTemplate1();
call.enqueue(new Callback<GetAccountRulesTemplateResponse>() {
    @Override
    public void onResponse(Call<GetAccountRulesTemplateResponse> call, Response<GetAccountRulesTemplateResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetAccountRulesTemplateResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetAccountRulesTemplateResponse**](GetAccountRulesTemplateResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateAccountingRule"></a>
# **updateAccountingRule**
> PutAccountingRulesResponse updateAccountingRule(accountingRuleId, body)

Update a Accounting Rule

Updates the details of a Accounting rule.

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

AccountingRulesApi apiService = defaultClient.createService(AccountingRulesApi.class);

// Initialize these parameters earlier.
Call<PutAccountingRulesResponse> call = apiService.updateAccountingRule(accountingRuleId, body);
call.enqueue(new Callback<PutAccountingRulesResponse>() {
    @Override
    public void onResponse(Call<PutAccountingRulesResponse> call, Response<PutAccountingRulesResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PutAccountingRulesResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountingRuleId** | **Long**| accountingRuleId |
 **body** | [**PutAccountingRulesRequest**](PutAccountingRulesRequest.md)|  | [optional]

### Return type

[**PutAccountingRulesResponse**](PutAccountingRulesResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

