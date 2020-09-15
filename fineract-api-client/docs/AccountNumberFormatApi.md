# AccountNumberFormatApi

All URIs are relative to *https://demo.fineract.dev/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](AccountNumberFormatApi.md#create) | **POST** accountnumberformats | Create an Account number format
[**delete**](AccountNumberFormatApi.md#delete) | **DELETE** accountnumberformats/{accountNumberFormatId} | Delete an Account number format
[**retrieveAll3**](AccountNumberFormatApi.md#retrieveAll3) | **GET** accountnumberformats | List Account number formats
[**retrieveOne**](AccountNumberFormatApi.md#retrieveOne) | **GET** accountnumberformats/{accountNumberFormatId} | Retrieve an Account number format
[**retrieveTemplate2**](AccountNumberFormatApi.md#retrieveTemplate2) | **GET** accountnumberformats/template | Retrieve Account number format Template
[**update1**](AccountNumberFormatApi.md#update1) | **PUT** accountnumberformats/{accountNumberFormatId} | Update an Account number format

<a name="create"></a>
# **create**
> PostAccountNumberFormatsResponse create(body)

Create an Account number format

Note: You may associate a single Account number format for a given account type Mandatory Fields for Account number formats accountType

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

AccountNumberFormatApi apiService = defaultClient.createService(AccountNumberFormatApi.class);

// Initialize these parameters earlier.
Call<PostAccountNumberFormatsResponse> call = apiService.create(body);
call.enqueue(new Callback<PostAccountNumberFormatsResponse>() {
    @Override
    public void onResponse(Call<PostAccountNumberFormatsResponse> call, Response<PostAccountNumberFormatsResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PostAccountNumberFormatsResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PostAccountNumberFormatsRequest**](PostAccountNumberFormatsRequest.md)|  | [optional]

### Return type

[**PostAccountNumberFormatsResponse**](PostAccountNumberFormatsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="delete"></a>
# **delete**
> DeleteAccountNumberFormatsResponse delete(accountNumberFormatId)

Delete an Account number format

Note: Account numbers created while this format was active would remain unchanged.

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

AccountNumberFormatApi apiService = defaultClient.createService(AccountNumberFormatApi.class);

// Initialize these parameters earlier.
Call<DeleteAccountNumberFormatsResponse> call = apiService.delete(accountNumberFormatId);
call.enqueue(new Callback<DeleteAccountNumberFormatsResponse>() {
    @Override
    public void onResponse(Call<DeleteAccountNumberFormatsResponse> call, Response<DeleteAccountNumberFormatsResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<DeleteAccountNumberFormatsResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountNumberFormatId** | **Long**| accountNumberFormatId |

### Return type

[**DeleteAccountNumberFormatsResponse**](DeleteAccountNumberFormatsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveAll3"></a>
# **retrieveAll3**
> List&lt;GetAccountNumberFormatsIdResponse&gt; retrieveAll3()

List Account number formats

Example Requests:  accountnumberformats   accountnumberformats?fields&#x3D;accountType,prefixType

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

AccountNumberFormatApi apiService = defaultClient.createService(AccountNumberFormatApi.class);

// Initialize these parameters earlier.
Call<List&lt;GetAccountNumberFormatsIdResponse&gt;> call = apiService.retrieveAll3();
call.enqueue(new Callback<List&lt;GetAccountNumberFormatsIdResponse&gt;>() {
    @Override
    public void onResponse(Call<List&lt;GetAccountNumberFormatsIdResponse&gt;> call, Response<List&lt;GetAccountNumberFormatsIdResponse&gt;> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<List&lt;GetAccountNumberFormatsIdResponse&gt;> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;GetAccountNumberFormatsIdResponse&gt;**](GetAccountNumberFormatsIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveOne"></a>
# **retrieveOne**
> GetAccountNumberFormatsIdResponse retrieveOne(accountNumberFormatId)

Retrieve an Account number format

Example Requests:  accountnumberformats/1   accountnumberformats/1?template&#x3D;true   accountnumberformats/1?fields&#x3D;accountType,prefixType

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

AccountNumberFormatApi apiService = defaultClient.createService(AccountNumberFormatApi.class);

// Initialize these parameters earlier.
Call<GetAccountNumberFormatsIdResponse> call = apiService.retrieveOne(accountNumberFormatId);
call.enqueue(new Callback<GetAccountNumberFormatsIdResponse>() {
    @Override
    public void onResponse(Call<GetAccountNumberFormatsIdResponse> call, Response<GetAccountNumberFormatsIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetAccountNumberFormatsIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountNumberFormatId** | **Long**| accountNumberFormatId |

### Return type

[**GetAccountNumberFormatsIdResponse**](GetAccountNumberFormatsIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveTemplate2"></a>
# **retrieveTemplate2**
> GetAccountNumberFormatsResponseTemplate retrieveTemplate2()

Retrieve Account number format Template

This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists  Example Request:  accountnumberformats/template

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

AccountNumberFormatApi apiService = defaultClient.createService(AccountNumberFormatApi.class);

// Initialize these parameters earlier.
Call<GetAccountNumberFormatsResponseTemplate> call = apiService.retrieveTemplate2();
call.enqueue(new Callback<GetAccountNumberFormatsResponseTemplate>() {
    @Override
    public void onResponse(Call<GetAccountNumberFormatsResponseTemplate> call, Response<GetAccountNumberFormatsResponseTemplate> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetAccountNumberFormatsResponseTemplate> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetAccountNumberFormatsResponseTemplate**](GetAccountNumberFormatsResponseTemplate.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="update1"></a>
# **update1**
> PutAccountNumberFormatsResponse update1(body, accountNumberFormatId)

Update an Account number format

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

AccountNumberFormatApi apiService = defaultClient.createService(AccountNumberFormatApi.class);

// Initialize these parameters earlier.
Call<PutAccountNumberFormatsResponse> call = apiService.update1(body, accountNumberFormatId);
call.enqueue(new Callback<PutAccountNumberFormatsResponse>() {
    @Override
    public void onResponse(Call<PutAccountNumberFormatsResponse> call, Response<PutAccountNumberFormatsResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PutAccountNumberFormatsResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PutAccountNumberFormatsRequest**](PutAccountNumberFormatsRequest.md)|  |
 **accountNumberFormatId** | **Long**| accountNumberFormatId |

### Return type

[**PutAccountNumberFormatsResponse**](PutAccountNumberFormatsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

