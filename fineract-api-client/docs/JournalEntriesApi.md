# JournalEntriesApi

All URIs are relative to *https://demo.fineract.dev/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createGLJournalEntry**](JournalEntriesApi.md#createGLJournalEntry) | **POST** journalentries | Create \&quot;Balanced\&quot; Journal Entries
[**createReversalJournalEntry**](JournalEntriesApi.md#createReversalJournalEntry) | **POST** journalentries/{transactionId} | Update Running balances for Journal Entries
[**getJournalEntriesTemplate**](JournalEntriesApi.md#getJournalEntriesTemplate) | **GET** journalentries/downloadtemplate | 
[**postJournalEntriesTemplate**](JournalEntriesApi.md#postJournalEntriesTemplate) | **POST** journalentries/uploadtemplate | 
[**retreiveJournalEntryById**](JournalEntriesApi.md#retreiveJournalEntryById) | **GET** journalentries/{journalEntryId} | Retrieve a single Entry
[**retrieveAll1**](JournalEntriesApi.md#retrieveAll1) | **GET** journalentries | List Journal Entries
[**retrieveJournalEntries**](JournalEntriesApi.md#retrieveJournalEntries) | **GET** journalentries/provisioning | 
[**retrieveOpeningBalance**](JournalEntriesApi.md#retrieveOpeningBalance) | **GET** journalentries/openingbalance | 

<a name="createGLJournalEntry"></a>
# **createGLJournalEntry**
> PostJournalEntriesResponse createGLJournalEntry(body, command)

Create \&quot;Balanced\&quot; Journal Entries

Note: A Balanced (simple) Journal entry would have atleast one \&quot;Debit\&quot; and one \&quot;Credit\&quot; entry whose amounts are equal  Compound Journal entries may have \&quot;n\&quot; debits and \&quot;m\&quot; credits where both \&quot;m\&quot; and \&quot;n\&quot; are greater than 0 and the net sum or all debits and credits are equal    Mandatory Fields officeId, transactionDate   credits- glAccountId, amount, comments    debits-  glAccountId, amount, comments    Optional Fields paymentTypeId, accountNumber, checkNumber, routingCode, receiptNumber, bankNumber

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

JournalEntriesApi apiService = defaultClient.createService(JournalEntriesApi.class);

// Initialize these parameters earlier.
Call<PostJournalEntriesResponse> call = apiService.createGLJournalEntry(body, command);
call.enqueue(new Callback<PostJournalEntriesResponse>() {
    @Override
    public void onResponse(Call<PostJournalEntriesResponse> call, Response<PostJournalEntriesResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PostJournalEntriesResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**JournalEntryCommand**](JournalEntryCommand.md)|  | [optional]
 **command** | **String**| command | [optional]

### Return type

[**PostJournalEntriesResponse**](PostJournalEntriesResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createReversalJournalEntry"></a>
# **createReversalJournalEntry**
> PostJournalEntriesTransactionIdResponse createReversalJournalEntry(transactionId, body, command)

Update Running balances for Journal Entries

This API calculates the running balances for office. If office ID not provided this API calculates running balances for all offices.  Mandatory Fields officeId

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

JournalEntriesApi apiService = defaultClient.createService(JournalEntriesApi.class);

// Initialize these parameters earlier.
Call<PostJournalEntriesTransactionIdResponse> call = apiService.createReversalJournalEntry(transactionId, body, command);
call.enqueue(new Callback<PostJournalEntriesTransactionIdResponse>() {
    @Override
    public void onResponse(Call<PostJournalEntriesTransactionIdResponse> call, Response<PostJournalEntriesTransactionIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PostJournalEntriesTransactionIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transactionId** | **String**| transactionId |
 **body** | [**PostJournalEntriesTransactionIdRequest**](PostJournalEntriesTransactionIdRequest.md)|  | [optional]
 **command** | **String**| command | [optional]

### Return type

[**PostJournalEntriesTransactionIdResponse**](PostJournalEntriesTransactionIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getJournalEntriesTemplate"></a>
# **getJournalEntriesTemplate**
> Void getJournalEntriesTemplate(officeId, dateFormat)



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

JournalEntriesApi apiService = defaultClient.createService(JournalEntriesApi.class);

// Initialize these parameters earlier.
Call<Void> call = apiService.getJournalEntriesTemplate(officeId, dateFormat);
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

<a name="postJournalEntriesTemplate"></a>
# **postJournalEntriesTemplate**
> String postJournalEntriesTemplate(file, locale, dateFormat)



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

JournalEntriesApi apiService = defaultClient.createService(JournalEntriesApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.postJournalEntriesTemplate(file, locale, dateFormat);
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

<a name="retreiveJournalEntryById"></a>
# **retreiveJournalEntryById**
> JournalEntryData retreiveJournalEntryById(journalEntryId, runningBalance, transactionDetails)

Retrieve a single Entry

Example Requests:  journalentries/1    journalentries/1?fields&#x3D;officeName,glAccountId,entryType,amount  journalentries/1?runningBalance&#x3D;true  journalentries/1?transactionDetails&#x3D;true

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

JournalEntriesApi apiService = defaultClient.createService(JournalEntriesApi.class);

// Initialize these parameters earlier.
Call<JournalEntryData> call = apiService.retreiveJournalEntryById(journalEntryId, runningBalance, transactionDetails);
call.enqueue(new Callback<JournalEntryData>() {
    @Override
    public void onResponse(Call<JournalEntryData> call, Response<JournalEntryData> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<JournalEntryData> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **journalEntryId** | **Long**| journalEntryId |
 **runningBalance** | **Boolean**| runningBalance | [optional]
 **transactionDetails** | **Boolean**| transactionDetails | [optional]

### Return type

[**JournalEntryData**](JournalEntryData.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveAll1"></a>
# **retrieveAll1**
> List&lt;JournalEntryData&gt; retrieveAll1(officeId, glAccountId, manualEntriesOnly, fromDate, toDate, transactionId, entityType, offset, limit, orderBy, sortOrder, locale, dateFormat, loanId, savingsId, runningBalance, transactionDetails)

List Journal Entries

The list capability of journal entries can support pagination and sorting.  Example Requests:  journalentries  journalentries?transactionId&#x3D;PB37X8Y21EQUY4S  journalentries?officeId&#x3D;1&amp;manualEntriesOnly&#x3D;true&amp;fromDate&#x3D;1 July 2013&amp;toDate&#x3D;15 July 2013&amp;dateFormat&#x3D;dd MMMM yyyy&amp;locale&#x3D;en  journalentries?fields&#x3D;officeName,glAccountName,transactionDate  journalentries?offset&#x3D;10&amp;limit&#x3D;50  journalentries?orderBy&#x3D;transactionId&amp;sortOrder&#x3D;DESC  journalentries?runningBalance&#x3D;true  journalentries?transactionDetails&#x3D;true  journalentries?loanId&#x3D;12  journalentries?savingsId&#x3D;24

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

JournalEntriesApi apiService = defaultClient.createService(JournalEntriesApi.class);

// Initialize these parameters earlier.
Call<List&lt;JournalEntryData&gt;> call = apiService.retrieveAll1(officeId, glAccountId, manualEntriesOnly, fromDate, toDate, transactionId, entityType, offset, limit, orderBy, sortOrder, locale, dateFormat, loanId, savingsId, runningBalance, transactionDetails);
call.enqueue(new Callback<List&lt;JournalEntryData&gt;>() {
    @Override
    public void onResponse(Call<List&lt;JournalEntryData&gt;> call, Response<List&lt;JournalEntryData&gt;> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<List&lt;JournalEntryData&gt;> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **officeId** | **Long**| officeId | [optional]
 **glAccountId** | **Long**| glAccountId | [optional]
 **manualEntriesOnly** | **Boolean**| manualEntriesOnly | [optional]
 **fromDate** | [**DateParam**](.md)| fromDate | [optional]
 **toDate** | [**DateParam**](.md)| toDate | [optional]
 **transactionId** | **String**| transactionId | [optional]
 **entityType** | **Integer**| entityType | [optional]
 **offset** | **Integer**| offset | [optional]
 **limit** | **Integer**| limit | [optional]
 **orderBy** | **String**| orderBy | [optional]
 **sortOrder** | **String**| sortOrder | [optional]
 **locale** | **String**| locale | [optional]
 **dateFormat** | **String**| dateFormat | [optional]
 **loanId** | **Long**| loanId | [optional]
 **savingsId** | **Long**| savingsId | [optional]
 **runningBalance** | **Boolean**| runningBalance | [optional]
 **transactionDetails** | **Boolean**| transactionDetails | [optional]

### Return type

[**List&lt;JournalEntryData&gt;**](JournalEntryData.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveJournalEntries"></a>
# **retrieveJournalEntries**
> String retrieveJournalEntries(offset, limit, entryId)



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

JournalEntriesApi apiService = defaultClient.createService(JournalEntriesApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.retrieveJournalEntries(offset, limit, entryId);
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
 **offset** | **Integer**|  | [optional]
 **limit** | **Integer**|  | [optional]
 **entryId** | **Long**|  | [optional]

### Return type

**String**

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveOpeningBalance"></a>
# **retrieveOpeningBalance**
> String retrieveOpeningBalance(officeId, currencyCode)



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

JournalEntriesApi apiService = defaultClient.createService(JournalEntriesApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.retrieveOpeningBalance(officeId, currencyCode);
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
 **officeId** | **Long**|  | [optional]
 **currencyCode** | **String**|  | [optional]

### Return type

**String**

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

