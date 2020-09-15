# SearchApiApi

All URIs are relative to *https://demo.fineract.dev/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**advancedSearch**](SearchApiApi.md#advancedSearch) | **POST** search/advance | Adhoc query search
[**retrieveAdHocSearchQueryTemplate**](SearchApiApi.md#retrieveAdHocSearchQueryTemplate) | **GET** search/template | Retrive Adhoc Search query template
[**searchData**](SearchApiApi.md#searchData) | **GET** search | Search Resources

<a name="advancedSearch"></a>
# **advancedSearch**
> PostAdhocQuerySearchResponse advancedSearch(body)

Adhoc query search

AdHocQuery search has more search options, it is a POST request, it uses request body to send search parameters   Mandatory fields:entities  Optional fields:loanStatus, loanProducts, offices, loanDateOption, loanFromDate, loanToDate,  includeOutStandingAmountPercentage, outStandingAmountPercentageCondition,  minOutStandingAmountPercentage and maxOutStandingAmountPercentage OR outStandingAmountPercentage,  includeOutstandingAmount, outstandingAmountCondition,  minOutstandingAmount and maxOutstandingAmount OR outstandingAmount

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

SearchApiApi apiService = defaultClient.createService(SearchApiApi.class);

// Initialize these parameters earlier.
Call<PostAdhocQuerySearchResponse> call = apiService.advancedSearch(body);
call.enqueue(new Callback<PostAdhocQuerySearchResponse>() {
    @Override
    public void onResponse(Call<PostAdhocQuerySearchResponse> call, Response<PostAdhocQuerySearchResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PostAdhocQuerySearchResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PostAdhocQuerySearchRequest**](PostAdhocQuerySearchRequest.md)|  |

### Return type

[**PostAdhocQuerySearchResponse**](PostAdhocQuerySearchResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveAdHocSearchQueryTemplate"></a>
# **retrieveAdHocSearchQueryTemplate**
> GetSearchResponse retrieveAdHocSearchQueryTemplate()

Retrive Adhoc Search query template

Mandatory Fields  search?query&#x3D;000000001 

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

SearchApiApi apiService = defaultClient.createService(SearchApiApi.class);

// Initialize these parameters earlier.
Call<GetSearchResponse> call = apiService.retrieveAdHocSearchQueryTemplate();
call.enqueue(new Callback<GetSearchResponse>() {
    @Override
    public void onResponse(Call<GetSearchResponse> call, Response<GetSearchResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetSearchResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetSearchResponse**](GetSearchResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="searchData"></a>
# **searchData**
> GetSearchResponse searchData(query, resource, exactMatch)

Search Resources

Example Requests:  search?query&#x3D;000000001   search?query&#x3D;Petra&amp;resource&#x3D;clients,groups   search?query&#x3D;Petra&amp;resource&#x3D;clients,groups&amp;exactMatch&#x3D;true

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

SearchApiApi apiService = defaultClient.createService(SearchApiApi.class);

// Initialize these parameters earlier.
Call<GetSearchResponse> call = apiService.searchData(query, resource, exactMatch);
call.enqueue(new Callback<GetSearchResponse>() {
    @Override
    public void onResponse(Call<GetSearchResponse> call, Response<GetSearchResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetSearchResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query** | **String**| query | [optional]
 **resource** | **String**| resource | [optional]
 **exactMatch** | **Boolean**| exactMatch | [optional] [default to false]

### Return type

[**GetSearchResponse**](GetSearchResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

