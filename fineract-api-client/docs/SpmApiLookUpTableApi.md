# SpmApiLookUpTableApi

All URIs are relative to *https://demo.fineract.dev/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createLookupTable**](SpmApiLookUpTableApi.md#createLookupTable) | **POST** surveys/{surveyId}/lookuptables | Create a Lookup Table entry
[**fetchLookupTables**](SpmApiLookUpTableApi.md#fetchLookupTables) | **GET** surveys/{surveyId}/lookuptables | List all Lookup Table entries
[**findLookupTable**](SpmApiLookUpTableApi.md#findLookupTable) | **GET** surveys/{surveyId}/lookuptables/{key} | Retrieve a Lookup Table entry

<a name="createLookupTable"></a>
# **createLookupTable**
> Void createLookupTable(surveyId, body)

Create a Lookup Table entry

Add a new entry to a survey.  Mandatory Fields key, score, validFrom, validTo

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

SpmApiLookUpTableApi apiService = defaultClient.createService(SpmApiLookUpTableApi.class);

// Initialize these parameters earlier.
Call<Void> call = apiService.createLookupTable(surveyId, body);
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
 **surveyId** | **Long**| Enter surveyId |
 **body** | [**LookupTableData**](LookupTableData.md)|  | [optional]

### Return type

[**Void**](.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="fetchLookupTables"></a>
# **fetchLookupTables**
> List&lt;LookupTableData&gt; fetchLookupTables(surveyId)

List all Lookup Table entries

List all Lookup Table entries for a survey.

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

SpmApiLookUpTableApi apiService = defaultClient.createService(SpmApiLookUpTableApi.class);

// Initialize these parameters earlier.
Call<List&lt;LookupTableData&gt;> call = apiService.fetchLookupTables(surveyId);
call.enqueue(new Callback<List&lt;LookupTableData&gt;>() {
    @Override
    public void onResponse(Call<List&lt;LookupTableData&gt;> call, Response<List&lt;LookupTableData&gt;> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<List&lt;LookupTableData&gt;> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **surveyId** | **Long**| Enter surveyId |

### Return type

[**List&lt;LookupTableData&gt;**](LookupTableData.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findLookupTable"></a>
# **findLookupTable**
> LookupTableData findLookupTable(surveyId, key)

Retrieve a Lookup Table entry

Retrieve a Lookup Table entry for a survey.

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

SpmApiLookUpTableApi apiService = defaultClient.createService(SpmApiLookUpTableApi.class);

// Initialize these parameters earlier.
Call<LookupTableData> call = apiService.findLookupTable(surveyId, key);
call.enqueue(new Callback<LookupTableData>() {
    @Override
    public void onResponse(Call<LookupTableData> call, Response<LookupTableData> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<LookupTableData> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **surveyId** | **Long**| Enter surveyId |
 **key** | **String**| Enter key |

### Return type

[**LookupTableData**](LookupTableData.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

