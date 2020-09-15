# ClientIdentifierApi

All URIs are relative to *https://demo.fineract.dev/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createClientIdentifier**](ClientIdentifierApi.md#createClientIdentifier) | **POST** clients/{clientId}/identifiers | Create an Identifier for a Client
[**deleteClientIdentifier**](ClientIdentifierApi.md#deleteClientIdentifier) | **DELETE** clients/{clientId}/identifiers/{identifierId} | Delete a Client Identifier
[**newClientIdentifierDetails**](ClientIdentifierApi.md#newClientIdentifierDetails) | **GET** clients/{clientId}/identifiers/template | Retrieve Client Identifier Details Template
[**retrieveAllClientIdentifiers**](ClientIdentifierApi.md#retrieveAllClientIdentifiers) | **GET** clients/{clientId}/identifiers | List all Identifiers for a Client
[**retrieveClientIdentifiers**](ClientIdentifierApi.md#retrieveClientIdentifiers) | **GET** clients/{clientId}/identifiers/{identifierId} | Retrieve a Client Identifier
[**updateClientIdentifer**](ClientIdentifierApi.md#updateClientIdentifer) | **PUT** clients/{clientId}/identifiers/{identifierId} | Update a Client Identifier

<a name="createClientIdentifier"></a>
# **createClientIdentifier**
> PostClientsClientIdIdentifiersResponse createClientIdentifier(body, clientId)

Create an Identifier for a Client

Mandatory Fields documentKey, documentTypeId 

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

ClientIdentifierApi apiService = defaultClient.createService(ClientIdentifierApi.class);

// Initialize these parameters earlier.
Call<PostClientsClientIdIdentifiersResponse> call = apiService.createClientIdentifier(body, clientId);
call.enqueue(new Callback<PostClientsClientIdIdentifiersResponse>() {
    @Override
    public void onResponse(Call<PostClientsClientIdIdentifiersResponse> call, Response<PostClientsClientIdIdentifiersResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PostClientsClientIdIdentifiersResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PostClientsClientIdIdentifiersRequest**](PostClientsClientIdIdentifiersRequest.md)|  |
 **clientId** | **Long**| clientId |

### Return type

[**PostClientsClientIdIdentifiersResponse**](PostClientsClientIdIdentifiersResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteClientIdentifier"></a>
# **deleteClientIdentifier**
> DeleteClientsClientIdIdentifiersIdentifierIdResponse deleteClientIdentifier(clientId, identifierId)

Delete a Client Identifier

Deletes a Client Identifier

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

ClientIdentifierApi apiService = defaultClient.createService(ClientIdentifierApi.class);

// Initialize these parameters earlier.
Call<DeleteClientsClientIdIdentifiersIdentifierIdResponse> call = apiService.deleteClientIdentifier(clientId, identifierId);
call.enqueue(new Callback<DeleteClientsClientIdIdentifiersIdentifierIdResponse>() {
    @Override
    public void onResponse(Call<DeleteClientsClientIdIdentifiersIdentifierIdResponse> call, Response<DeleteClientsClientIdIdentifiersIdentifierIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<DeleteClientsClientIdIdentifiersIdentifierIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **Long**| clientId |
 **identifierId** | **Long**| identifierId |

### Return type

[**DeleteClientsClientIdIdentifiersIdentifierIdResponse**](DeleteClientsClientIdIdentifiersIdentifierIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="newClientIdentifierDetails"></a>
# **newClientIdentifierDetails**
> GetClientsClientIdIdentifiersTemplateResponse newClientIdentifierDetails(clientId)

Retrieve Client Identifier Details Template

This is a convenience resource useful for building maintenance user interface screens for client applications. The template data returned consists of any or all of:   Field Defaults  Allowed description Lists   Example Request: clients/1/identifiers/template

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

ClientIdentifierApi apiService = defaultClient.createService(ClientIdentifierApi.class);

// Initialize these parameters earlier.
Call<GetClientsClientIdIdentifiersTemplateResponse> call = apiService.newClientIdentifierDetails(clientId);
call.enqueue(new Callback<GetClientsClientIdIdentifiersTemplateResponse>() {
    @Override
    public void onResponse(Call<GetClientsClientIdIdentifiersTemplateResponse> call, Response<GetClientsClientIdIdentifiersTemplateResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetClientsClientIdIdentifiersTemplateResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **Long**| clientId |

### Return type

[**GetClientsClientIdIdentifiersTemplateResponse**](GetClientsClientIdIdentifiersTemplateResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveAllClientIdentifiers"></a>
# **retrieveAllClientIdentifiers**
> List&lt;GetClientsClientIdIdentifiersResponse&gt; retrieveAllClientIdentifiers(clientId)

List all Identifiers for a Client

Example Requests: clients/1/identifiers   clients/1/identifiers?fields&#x3D;documentKey,documentType,description

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

ClientIdentifierApi apiService = defaultClient.createService(ClientIdentifierApi.class);

// Initialize these parameters earlier.
Call<List&lt;GetClientsClientIdIdentifiersResponse&gt;> call = apiService.retrieveAllClientIdentifiers(clientId);
call.enqueue(new Callback<List&lt;GetClientsClientIdIdentifiersResponse&gt;>() {
    @Override
    public void onResponse(Call<List&lt;GetClientsClientIdIdentifiersResponse&gt;> call, Response<List&lt;GetClientsClientIdIdentifiersResponse&gt;> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<List&lt;GetClientsClientIdIdentifiersResponse&gt;> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **Long**| clientId |

### Return type

[**List&lt;GetClientsClientIdIdentifiersResponse&gt;**](GetClientsClientIdIdentifiersResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveClientIdentifiers"></a>
# **retrieveClientIdentifiers**
> GetClientsClientIdIdentifiersResponse retrieveClientIdentifiers(clientId, identifierId)

Retrieve a Client Identifier

Example Requests: clients/1/identifier/2   clients/1/identifier/2?template&#x3D;true  clients/1/identifiers/2?fields&#x3D;documentKey,documentType,description

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

ClientIdentifierApi apiService = defaultClient.createService(ClientIdentifierApi.class);

// Initialize these parameters earlier.
Call<GetClientsClientIdIdentifiersResponse> call = apiService.retrieveClientIdentifiers(clientId, identifierId);
call.enqueue(new Callback<GetClientsClientIdIdentifiersResponse>() {
    @Override
    public void onResponse(Call<GetClientsClientIdIdentifiersResponse> call, Response<GetClientsClientIdIdentifiersResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetClientsClientIdIdentifiersResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **Long**| clientId |
 **identifierId** | **Long**| identifierId |

### Return type

[**GetClientsClientIdIdentifiersResponse**](GetClientsClientIdIdentifiersResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateClientIdentifer"></a>
# **updateClientIdentifer**
> PutClientsClientIdIdentifiersIdentifierIdResponse updateClientIdentifer(body, clientId, identifierId)

Update a Client Identifier

Updates a Client Identifier

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

ClientIdentifierApi apiService = defaultClient.createService(ClientIdentifierApi.class);

// Initialize these parameters earlier.
Call<PutClientsClientIdIdentifiersIdentifierIdResponse> call = apiService.updateClientIdentifer(body, clientId, identifierId);
call.enqueue(new Callback<PutClientsClientIdIdentifiersIdentifierIdResponse>() {
    @Override
    public void onResponse(Call<PutClientsClientIdIdentifiersIdentifierIdResponse> call, Response<PutClientsClientIdIdentifiersIdentifierIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PutClientsClientIdIdentifiersIdentifierIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PutClientsClientIdIdentifiersIdentifierIdRequest**](PutClientsClientIdIdentifiersIdentifierIdRequest.md)|  |
 **clientId** | **Long**| clientId |
 **identifierId** | **Long**| identifierId |

### Return type

[**PutClientsClientIdIdentifiersIdentifierIdResponse**](PutClientsClientIdIdentifiersIdentifierIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

