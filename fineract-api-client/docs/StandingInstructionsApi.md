# StandingInstructionsApi

All URIs are relative to *https://demo.fineract.dev/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create4**](StandingInstructionsApi.md#create4) | **POST** standinginstructions | Create new Standing Instruction
[**retrieveAll18**](StandingInstructionsApi.md#retrieveAll18) | **GET** standinginstructions | List Standing Instructions
[**retrieveOne9**](StandingInstructionsApi.md#retrieveOne9) | **GET** standinginstructions/{standingInstructionId} | Retrieve Standing Instruction
[**template6**](StandingInstructionsApi.md#template6) | **GET** standinginstructions/template | Retrieve Standing Instruction Template
[**update8**](StandingInstructionsApi.md#update8) | **PUT** standinginstructions/{standingInstructionId} | Update Standing Instruction | Delete Standing Instruction

<a name="create4"></a>
# **create4**
> PostStandingInstructionsResponse create4(body)

Create new Standing Instruction

Ability to create new instruction for transfer of monetary funds from one account to another

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

StandingInstructionsApi apiService = defaultClient.createService(StandingInstructionsApi.class);

// Initialize these parameters earlier.
Call<PostStandingInstructionsResponse> call = apiService.create4(body);
call.enqueue(new Callback<PostStandingInstructionsResponse>() {
    @Override
    public void onResponse(Call<PostStandingInstructionsResponse> call, Response<PostStandingInstructionsResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PostStandingInstructionsResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PostStandingInstructionsRequest**](PostStandingInstructionsRequest.md)|  |

### Return type

[**PostStandingInstructionsResponse**](PostStandingInstructionsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveAll18"></a>
# **retrieveAll18**
> GetStandingInstructionsResponse retrieveAll18(sqlSearch, externalId, offset, limit, orderBy, sortOrder, transferType, clientName, clientId, fromAccountId, fromAccountType)

List Standing Instructions

Example Requests:  standinginstructions

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

StandingInstructionsApi apiService = defaultClient.createService(StandingInstructionsApi.class);

// Initialize these parameters earlier.
Call<GetStandingInstructionsResponse> call = apiService.retrieveAll18(sqlSearch, externalId, offset, limit, orderBy, sortOrder, transferType, clientName, clientId, fromAccountId, fromAccountType);
call.enqueue(new Callback<GetStandingInstructionsResponse>() {
    @Override
    public void onResponse(Call<GetStandingInstructionsResponse> call, Response<GetStandingInstructionsResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetStandingInstructionsResponse> call, Throwable t) {
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
 **limit** | **Integer**| limit | [optional]
 **orderBy** | **String**| orderBy | [optional]
 **sortOrder** | **String**| sortOrder | [optional]
 **transferType** | **Integer**| transferType | [optional]
 **clientName** | **String**| clientName | [optional]
 **clientId** | **Long**| clientId | [optional]
 **fromAccountId** | **Long**| fromAccountId | [optional]
 **fromAccountType** | **Integer**| fromAccountType | [optional]

### Return type

[**GetStandingInstructionsResponse**](GetStandingInstructionsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveOne9"></a>
# **retrieveOne9**
> GetStandingInstructionsStandingInstructionIdResponse retrieveOne9(standingInstructionId, sqlSearch, externalId, offset, limit, orderBy, sortOrder)

Retrieve Standing Instruction

Example Requests :  standinginstructions/1

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

StandingInstructionsApi apiService = defaultClient.createService(StandingInstructionsApi.class);

// Initialize these parameters earlier.
Call<GetStandingInstructionsStandingInstructionIdResponse> call = apiService.retrieveOne9(standingInstructionId, sqlSearch, externalId, offset, limit, orderBy, sortOrder);
call.enqueue(new Callback<GetStandingInstructionsStandingInstructionIdResponse>() {
    @Override
    public void onResponse(Call<GetStandingInstructionsStandingInstructionIdResponse> call, Response<GetStandingInstructionsStandingInstructionIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetStandingInstructionsStandingInstructionIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **standingInstructionId** | **Long**| standingInstructionId |
 **sqlSearch** | **String**| sqlSearch | [optional]
 **externalId** | **String**| externalId | [optional]
 **offset** | **Integer**| offset | [optional]
 **limit** | **Integer**| limit | [optional]
 **orderBy** | **String**| orderBy | [optional]
 **sortOrder** | **String**| sortOrder | [optional]

### Return type

[**GetStandingInstructionsStandingInstructionIdResponse**](GetStandingInstructionsStandingInstructionIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="template6"></a>
# **template6**
> GetStandingInstructionsTemplateResponse template6(fromOfficeId, fromClientId, fromAccountId, fromAccountType, toOfficeId, toClientId, toAccountId, toAccountType, transferType)

Retrieve Standing Instruction Template

This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists Example Requests:  standinginstructions/template?fromAccountType&#x3D;2&amp;fromOfficeId&#x3D;1  standinginstructions/template?fromAccountType&#x3D;2&amp;fromOfficeId&#x3D;1&amp;fromClientId&#x3D;1&amp;transferType&#x3D;1  standinginstructions/template?fromClientId&#x3D;1&amp;fromAccountType&#x3D;2&amp;fromAccountId&#x3D;1&amp;transferType&#x3D;1

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

StandingInstructionsApi apiService = defaultClient.createService(StandingInstructionsApi.class);

// Initialize these parameters earlier.
Call<GetStandingInstructionsTemplateResponse> call = apiService.template6(fromOfficeId, fromClientId, fromAccountId, fromAccountType, toOfficeId, toClientId, toAccountId, toAccountType, transferType);
call.enqueue(new Callback<GetStandingInstructionsTemplateResponse>() {
    @Override
    public void onResponse(Call<GetStandingInstructionsTemplateResponse> call, Response<GetStandingInstructionsTemplateResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetStandingInstructionsTemplateResponse> call, Throwable t) {
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
 **transferType** | **Integer**| transferType | [optional]

### Return type

[**GetStandingInstructionsTemplateResponse**](GetStandingInstructionsTemplateResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="update8"></a>
# **update8**
> PutStandingInstructionsStandingInstructionIdResponse update8(standingInstructionId, body, command)

Update Standing Instruction | Delete Standing Instruction

Ability to modify existing instruction for transfer of monetary funds from one account to another.  PUT https://DomainName/api/v1/standinginstructions/1?command&#x3D;update   Ability to modify existing instruction for transfer of monetary funds from one account to another.  PUT https://DomainName/api/v1/standinginstructions/1?command&#x3D;delete

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

StandingInstructionsApi apiService = defaultClient.createService(StandingInstructionsApi.class);

// Initialize these parameters earlier.
Call<PutStandingInstructionsStandingInstructionIdResponse> call = apiService.update8(standingInstructionId, body, command);
call.enqueue(new Callback<PutStandingInstructionsStandingInstructionIdResponse>() {
    @Override
    public void onResponse(Call<PutStandingInstructionsStandingInstructionIdResponse> call, Response<PutStandingInstructionsStandingInstructionIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PutStandingInstructionsStandingInstructionIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **standingInstructionId** | **Long**| standingInstructionId |
 **body** | [**PutStandingInstructionsStandingInstructionIdRequest**](PutStandingInstructionsStandingInstructionIdRequest.md)|  | [optional]
 **command** | **String**| command | [optional]

### Return type

[**PutStandingInstructionsStandingInstructionIdResponse**](PutStandingInstructionsStandingInstructionIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

