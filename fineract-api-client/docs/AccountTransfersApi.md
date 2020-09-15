# AccountTransfersApi

All URIs are relative to *https://demo.fineract.dev/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create3**](AccountTransfersApi.md#create3) | **POST** accounttransfers | Create new Transfer
[**retrieveAll17**](AccountTransfersApi.md#retrieveAll17) | **GET** accounttransfers | List account transfers
[**retrieveOne8**](AccountTransfersApi.md#retrieveOne8) | **GET** accounttransfers/{transferId} | Retrieve account transfer
[**template5**](AccountTransfersApi.md#template5) | **GET** accounttransfers/template | Retrieve Account Transfer Template
[**templateRefundByTransfer**](AccountTransfersApi.md#templateRefundByTransfer) | **GET** accounttransfers/templateRefundByTransfer | Retrieve Refund of an Active Loan by Transfer Template
[**templateRefundByTransferPost**](AccountTransfersApi.md#templateRefundByTransferPost) | **POST** accounttransfers/refundByTransfer | Refund of an Active Loan by Transfer

<a name="create3"></a>
# **create3**
> PostAccountTransfersResponse create3(body)

Create new Transfer

Ability to create new transfer of monetary funds from one account to another.

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

AccountTransfersApi apiService = defaultClient.createService(AccountTransfersApi.class);

// Initialize these parameters earlier.
Call<PostAccountTransfersResponse> call = apiService.create3(body);
call.enqueue(new Callback<PostAccountTransfersResponse>() {
    @Override
    public void onResponse(Call<PostAccountTransfersResponse> call, Response<PostAccountTransfersResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PostAccountTransfersResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PostAccountTransfersRequest**](PostAccountTransfersRequest.md)|  |

### Return type

[**PostAccountTransfersResponse**](PostAccountTransfersResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveAll17"></a>
# **retrieveAll17**
> GetAccountTransfersResponse retrieveAll17(sqlSearch, externalId, offset, limit, orderBy, sortOrder, accountDetailId)

List account transfers

Lists account&#x27;s transfers  Example Requests:    accounttransfers

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

AccountTransfersApi apiService = defaultClient.createService(AccountTransfersApi.class);

// Initialize these parameters earlier.
Call<GetAccountTransfersResponse> call = apiService.retrieveAll17(sqlSearch, externalId, offset, limit, orderBy, sortOrder, accountDetailId);
call.enqueue(new Callback<GetAccountTransfersResponse>() {
    @Override
    public void onResponse(Call<GetAccountTransfersResponse> call, Response<GetAccountTransfersResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetAccountTransfersResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sqlSearch** | **String**| sqlSearch | [optional]
 **externalId** | **String**| externalId | [optional]
 **offset** | **Integer**| offset | [optional]
 **limit** | **Integer**|  | [optional]
 **orderBy** | **String**| orderBy | [optional]
 **sortOrder** | **String**| sortOrder | [optional]
 **accountDetailId** | **Long**| accountDetailId | [optional]

### Return type

[**GetAccountTransfersResponse**](GetAccountTransfersResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveOne8"></a>
# **retrieveOne8**
> GetAccountTransfersPageItems retrieveOne8(transferId)

Retrieve account transfer

Retrieves account transfer  Example Requests :    accounttransfers/1

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

AccountTransfersApi apiService = defaultClient.createService(AccountTransfersApi.class);

// Initialize these parameters earlier.
Call<GetAccountTransfersPageItems> call = apiService.retrieveOne8(transferId);
call.enqueue(new Callback<GetAccountTransfersPageItems>() {
    @Override
    public void onResponse(Call<GetAccountTransfersPageItems> call, Response<GetAccountTransfersPageItems> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetAccountTransfersPageItems> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transferId** | **Long**| transferId |

### Return type

[**GetAccountTransfersPageItems**](GetAccountTransfersPageItems.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="template5"></a>
# **template5**
> GetAccountTransfersTemplateResponse template5(fromOfficeId, fromClientId, fromAccountId, fromAccountType, toOfficeId, toClientId, toAccountId, toAccountType)

Retrieve Account Transfer Template

This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:    Field Defaults  Allowed Value Lists  Example Requests:    accounttransfers/template?fromAccountType&#x3D;2&amp;fromOfficeId&#x3D;1    accounttransfers/template?fromAccountType&#x3D;2&amp;fromOfficeId&#x3D;1&amp;fromClientId&#x3D;1    accounttransfers/template?fromClientId&#x3D;1&amp;fromAccountType&#x3D;2&amp;fromAccountId&#x3D;1

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

AccountTransfersApi apiService = defaultClient.createService(AccountTransfersApi.class);

// Initialize these parameters earlier.
Call<GetAccountTransfersTemplateResponse> call = apiService.template5(fromOfficeId, fromClientId, fromAccountId, fromAccountType, toOfficeId, toClientId, toAccountId, toAccountType);
call.enqueue(new Callback<GetAccountTransfersTemplateResponse>() {
    @Override
    public void onResponse(Call<GetAccountTransfersTemplateResponse> call, Response<GetAccountTransfersTemplateResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetAccountTransfersTemplateResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fromOfficeId** | **Long**| fromOfficeId | [optional]
 **fromClientId** | **Long**| fromClientId | [optional]
 **fromAccountId** | **Long**| fromAccountId | [optional]
 **fromAccountType** | **Integer**| fromAccountType | [optional]
 **toOfficeId** | **Long**| toOfficeId | [optional]
 **toClientId** | **Long**| toClientId | [optional]
 **toAccountId** | **Long**| toAccountId | [optional]
 **toAccountType** | **Integer**| toAccountType | [optional]

### Return type

[**GetAccountTransfersTemplateResponse**](GetAccountTransfersTemplateResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="templateRefundByTransfer"></a>
# **templateRefundByTransfer**
> GetAccountTransfersTemplateRefundByTransferResponse templateRefundByTransfer(fromOfficeId, fromClientId, fromAccountId, fromAccountType, toOfficeId, toClientId, toAccountId, toAccountType)

Retrieve Refund of an Active Loan by Transfer Template

Retrieves Refund of an Active Loan by Transfer TemplateExample Requests :    accounttransfers/templateRefundByTransfer?fromAccountId&#x3D;2&amp;fromAccountType&#x3D;1&amp; toAccountId&#x3D;1&amp;toAccountType&#x3D;2&amp;toClientId&#x3D;1&amp;toOfficeId&#x3D;1

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

AccountTransfersApi apiService = defaultClient.createService(AccountTransfersApi.class);

// Initialize these parameters earlier.
Call<GetAccountTransfersTemplateRefundByTransferResponse> call = apiService.templateRefundByTransfer(fromOfficeId, fromClientId, fromAccountId, fromAccountType, toOfficeId, toClientId, toAccountId, toAccountType);
call.enqueue(new Callback<GetAccountTransfersTemplateRefundByTransferResponse>() {
    @Override
    public void onResponse(Call<GetAccountTransfersTemplateRefundByTransferResponse> call, Response<GetAccountTransfersTemplateRefundByTransferResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetAccountTransfersTemplateRefundByTransferResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fromOfficeId** | **Long**| fromOfficeId | [optional]
 **fromClientId** | **Long**| fromClientId | [optional]
 **fromAccountId** | **Long**| fromAccountId | [optional]
 **fromAccountType** | **Integer**| fromAccountType | [optional]
 **toOfficeId** | **Long**| toOfficeId | [optional]
 **toClientId** | **Long**| toClientId | [optional]
 **toAccountId** | **Long**| toAccountId | [optional]
 **toAccountType** | **Integer**| toAccountType | [optional]

### Return type

[**GetAccountTransfersTemplateRefundByTransferResponse**](GetAccountTransfersTemplateRefundByTransferResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="templateRefundByTransferPost"></a>
# **templateRefundByTransferPost**
> PostAccountTransfersRefundByTransferResponse templateRefundByTransferPost(body)

Refund of an Active Loan by Transfer

Ability to refund an active loan by transferring to a savings account.

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

AccountTransfersApi apiService = defaultClient.createService(AccountTransfersApi.class);

// Initialize these parameters earlier.
Call<PostAccountTransfersRefundByTransferResponse> call = apiService.templateRefundByTransferPost(body);
call.enqueue(new Callback<PostAccountTransfersRefundByTransferResponse>() {
    @Override
    public void onResponse(Call<PostAccountTransfersRefundByTransferResponse> call, Response<PostAccountTransfersRefundByTransferResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PostAccountTransfersRefundByTransferResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PostAccountTransfersRefundByTransferRequest**](PostAccountTransfersRefundByTransferRequest.md)|  |

### Return type

[**PostAccountTransfersRefundByTransferResponse**](PostAccountTransfersRefundByTransferResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

