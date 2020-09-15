# ClientsAddressApi

All URIs are relative to *https://demo.fineract.dev/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addClientAddress**](ClientsAddressApi.md#addClientAddress) | **POST** client/{clientid}/addresses | Create an address for a Client
[**getAddresses1**](ClientsAddressApi.md#getAddresses1) | **GET** client/{clientid}/addresses | List all addresses for a Client
[**getAddressesTemplate**](ClientsAddressApi.md#getAddressesTemplate) | **GET** client/addresses/template | 
[**updateClientAddress**](ClientsAddressApi.md#updateClientAddress) | **PUT** client/{clientid}/addresses | Update an address for a Client

<a name="addClientAddress"></a>
# **addClientAddress**
> PostClientClientIdAddressesResponse addClientAddress(body, clientid, type)

Create an address for a Client

Mandatory Fields :  type and clientId

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

ClientsAddressApi apiService = defaultClient.createService(ClientsAddressApi.class);

// Initialize these parameters earlier.
Call<PostClientClientIdAddressesResponse> call = apiService.addClientAddress(body, clientid, type);
call.enqueue(new Callback<PostClientClientIdAddressesResponse>() {
    @Override
    public void onResponse(Call<PostClientClientIdAddressesResponse> call, Response<PostClientClientIdAddressesResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PostClientClientIdAddressesResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PostClientClientIdAddressesRequest**](PostClientClientIdAddressesRequest.md)|  |
 **clientid** | **Long**| clientId |
 **type** | **Long**| type | [optional]

### Return type

[**PostClientClientIdAddressesResponse**](PostClientClientIdAddressesResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAddresses1"></a>
# **getAddresses1**
> List&lt;GetClientClientIdAddressesResponse&gt; getAddresses1(clientid, status, type)

List all addresses for a Client

Example Requests:  client/1/addresses   clients/1/addresses?status&#x3D;false,true&amp;&amp;type&#x3D;1,2,3

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

ClientsAddressApi apiService = defaultClient.createService(ClientsAddressApi.class);

// Initialize these parameters earlier.
Call<List&lt;GetClientClientIdAddressesResponse&gt;> call = apiService.getAddresses1(clientid, status, type);
call.enqueue(new Callback<List&lt;GetClientClientIdAddressesResponse&gt;>() {
    @Override
    public void onResponse(Call<List&lt;GetClientClientIdAddressesResponse&gt;> call, Response<List&lt;GetClientClientIdAddressesResponse&gt;> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<List&lt;GetClientClientIdAddressesResponse&gt;> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientid** | **Long**| clientId |
 **status** | **String**| status | [optional]
 **type** | **Long**| type | [optional]

### Return type

[**List&lt;GetClientClientIdAddressesResponse&gt;**](GetClientClientIdAddressesResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAddressesTemplate"></a>
# **getAddressesTemplate**
> String getAddressesTemplate()



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

ClientsAddressApi apiService = defaultClient.createService(ClientsAddressApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.getAddressesTemplate();
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
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateClientAddress"></a>
# **updateClientAddress**
> PutClientClientIdAddressesResponse updateClientAddress(body, clientid)

Update an address for a Client

All the address fields can be updated by using update client address API  Mandatory Fields type and addressId

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

ClientsAddressApi apiService = defaultClient.createService(ClientsAddressApi.class);

// Initialize these parameters earlier.
Call<PutClientClientIdAddressesResponse> call = apiService.updateClientAddress(body, clientid);
call.enqueue(new Callback<PutClientClientIdAddressesResponse>() {
    @Override
    public void onResponse(Call<PutClientClientIdAddressesResponse> call, Response<PutClientClientIdAddressesResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PutClientClientIdAddressesResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PutClientClientIdAddressesRequest**](PutClientClientIdAddressesRequest.md)|  |
 **clientid** | **Long**| clientId |

### Return type

[**PutClientClientIdAddressesResponse**](PutClientClientIdAddressesResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

