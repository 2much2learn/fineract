# SelfThirdPartyTransferApi

All URIs are relative to *https://demo.fineract.dev/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add**](SelfThirdPartyTransferApi.md#add) | **POST** self/beneficiaries/tpt | Add TPT Beneficiary
[**delete20**](SelfThirdPartyTransferApi.md#delete20) | **DELETE** self/beneficiaries/tpt/{beneficiaryId} | Delete TPT Beneficiary
[**retrieveAll34**](SelfThirdPartyTransferApi.md#retrieveAll34) | **GET** self/beneficiaries/tpt | Get All TPT Beneficiary
[**template16**](SelfThirdPartyTransferApi.md#template16) | **GET** self/beneficiaries/tpt/template | Beneficiary Third Party Transfer Template
[**update20**](SelfThirdPartyTransferApi.md#update20) | **PUT** self/beneficiaries/tpt/{beneficiaryId} | Update TPT Beneficiary

<a name="add"></a>
# **add**
> PostSelfBeneficiariesTPTResponse add(body)

Add TPT Beneficiary

Api to add third party beneficiary linked to current user.  Parameter Definitions  name : Nick name for beneficiary, should be unique for an self service user  officeName : Office Name of beneficiary(not id)  accountNumber : Account Number of beneficiary(not id)  transferLimit : Each transfer initiated to this account will not exceed this amount  Example Requests:  /self/beneficiaries/tpt  Mandatory Fields: name, officeName, accountNumber, accountType  Optional Fields: transferLimit

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

SelfThirdPartyTransferApi apiService = defaultClient.createService(SelfThirdPartyTransferApi.class);

// Initialize these parameters earlier.
Call<PostSelfBeneficiariesTPTResponse> call = apiService.add(body);
call.enqueue(new Callback<PostSelfBeneficiariesTPTResponse>() {
    @Override
    public void onResponse(Call<PostSelfBeneficiariesTPTResponse> call, Response<PostSelfBeneficiariesTPTResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PostSelfBeneficiariesTPTResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PostSelfBeneficiariesTPTRequest**](PostSelfBeneficiariesTPTRequest.md)|  |

### Return type

[**PostSelfBeneficiariesTPTResponse**](PostSelfBeneficiariesTPTResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="delete20"></a>
# **delete20**
> DeleteSelfBeneficiariesTPTBeneficiaryIdResponse delete20(beneficiaryId)

Delete TPT Beneficiary

Api to delete third party beneficiary linked to current user.  Example Requests:  /self/beneficiaries/tpt/{beneficiaryId}

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

SelfThirdPartyTransferApi apiService = defaultClient.createService(SelfThirdPartyTransferApi.class);

// Initialize these parameters earlier.
Call<DeleteSelfBeneficiariesTPTBeneficiaryIdResponse> call = apiService.delete20(beneficiaryId);
call.enqueue(new Callback<DeleteSelfBeneficiariesTPTBeneficiaryIdResponse>() {
    @Override
    public void onResponse(Call<DeleteSelfBeneficiariesTPTBeneficiaryIdResponse> call, Response<DeleteSelfBeneficiariesTPTBeneficiaryIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<DeleteSelfBeneficiariesTPTBeneficiaryIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **beneficiaryId** | **Long**|  |

### Return type

[**DeleteSelfBeneficiariesTPTBeneficiaryIdResponse**](DeleteSelfBeneficiariesTPTBeneficiaryIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveAll34"></a>
# **retrieveAll34**
> List&lt;GetSelfBeneficiariesTPTResponse&gt; retrieveAll34()

Get All TPT Beneficiary

Api to get all third party beneficiary linked to current user.  Example Requests:  /self/beneficiaries/tpt

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

SelfThirdPartyTransferApi apiService = defaultClient.createService(SelfThirdPartyTransferApi.class);

// Initialize these parameters earlier.
Call<List&lt;GetSelfBeneficiariesTPTResponse&gt;> call = apiService.retrieveAll34();
call.enqueue(new Callback<List&lt;GetSelfBeneficiariesTPTResponse&gt;>() {
    @Override
    public void onResponse(Call<List&lt;GetSelfBeneficiariesTPTResponse&gt;> call, Response<List&lt;GetSelfBeneficiariesTPTResponse&gt;> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<List&lt;GetSelfBeneficiariesTPTResponse&gt;> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;GetSelfBeneficiariesTPTResponse&gt;**](GetSelfBeneficiariesTPTResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="template16"></a>
# **template16**
> GetSelfBeneficiariesTPTTemplateResponse template16()

Beneficiary Third Party Transfer Template

Returns Account Type enumerations. Self User is expected to know office name and account number to be able to add beneficiary.  Example Requests:  /self/beneficiaries/tpt/template

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

SelfThirdPartyTransferApi apiService = defaultClient.createService(SelfThirdPartyTransferApi.class);

// Initialize these parameters earlier.
Call<GetSelfBeneficiariesTPTTemplateResponse> call = apiService.template16();
call.enqueue(new Callback<GetSelfBeneficiariesTPTTemplateResponse>() {
    @Override
    public void onResponse(Call<GetSelfBeneficiariesTPTTemplateResponse> call, Response<GetSelfBeneficiariesTPTTemplateResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetSelfBeneficiariesTPTTemplateResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetSelfBeneficiariesTPTTemplateResponse**](GetSelfBeneficiariesTPTTemplateResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="update20"></a>
# **update20**
> PutSelfBeneficiariesTPTBeneficiaryIdResponse update20(body, beneficiaryId)

Update TPT Beneficiary

Api to update third party beneficiary linked to current user.  Example Requests:  /self/beneficiaries/tpt/{beneficiaryId}  Optional Fields: name, transferLimit

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

SelfThirdPartyTransferApi apiService = defaultClient.createService(SelfThirdPartyTransferApi.class);

// Initialize these parameters earlier.
Call<PutSelfBeneficiariesTPTBeneficiaryIdResponse> call = apiService.update20(body, beneficiaryId);
call.enqueue(new Callback<PutSelfBeneficiariesTPTBeneficiaryIdResponse>() {
    @Override
    public void onResponse(Call<PutSelfBeneficiariesTPTBeneficiaryIdResponse> call, Response<PutSelfBeneficiariesTPTBeneficiaryIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PutSelfBeneficiariesTPTBeneficiaryIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PutSelfBeneficiariesTPTBeneficiaryIdRequest**](PutSelfBeneficiariesTPTBeneficiaryIdRequest.md)|  |
 **beneficiaryId** | **Long**| beneficiaryId |

### Return type

[**PutSelfBeneficiariesTPTBeneficiaryIdResponse**](PutSelfBeneficiariesTPTBeneficiaryIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

