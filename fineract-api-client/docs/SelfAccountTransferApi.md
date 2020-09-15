# SelfAccountTransferApi

All URIs are relative to *https://demo.fineract.dev/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create13**](SelfAccountTransferApi.md#create13) | **POST** self/accounttransfers | Create new Transfer
[**template15**](SelfAccountTransferApi.md#template15) | **GET** self/accounttransfers/template | Retrieve Account Transfer Template

<a name="create13"></a>
# **create13**
> List&lt;PostNewTransferResponse&gt; create13(body, type)

Create new Transfer

Ability to create new transfer of monetary funds from one account to another.   Example Requests:   self/accounttransfers/ 

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

SelfAccountTransferApi apiService = defaultClient.createService(SelfAccountTransferApi.class);

// Initialize these parameters earlier.
Call<List&lt;PostNewTransferResponse&gt;> call = apiService.create13(body, type);
call.enqueue(new Callback<List&lt;PostNewTransferResponse&gt;>() {
    @Override
    public void onResponse(Call<List&lt;PostNewTransferResponse&gt;> call, Response<List&lt;PostNewTransferResponse&gt;> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<List&lt;PostNewTransferResponse&gt;> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**String**](String.md)|  | [optional]
 **type** | **String**|  | [optional]

### Return type

[**List&lt;PostNewTransferResponse&gt;**](PostNewTransferResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="template15"></a>
# **template15**
> List&lt;GetAccountTransferTemplateResponse&gt; template15(type)

Retrieve Account Transfer Template

Returns list of loan/savings accounts that can be used for account transfer   Example Requests:  self/accounttransfers/template 

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

SelfAccountTransferApi apiService = defaultClient.createService(SelfAccountTransferApi.class);

// Initialize these parameters earlier.
Call<List&lt;GetAccountTransferTemplateResponse&gt;> call = apiService.template15(type);
call.enqueue(new Callback<List&lt;GetAccountTransferTemplateResponse&gt;>() {
    @Override
    public void onResponse(Call<List&lt;GetAccountTransferTemplateResponse&gt;> call, Response<List&lt;GetAccountTransferTemplateResponse&gt;> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<List&lt;GetAccountTransferTemplateResponse&gt;> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **String**|  | [optional]

### Return type

[**List&lt;GetAccountTransferTemplateResponse&gt;**](GetAccountTransferTemplateResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

