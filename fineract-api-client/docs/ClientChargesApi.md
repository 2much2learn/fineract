# ClientChargesApi

All URIs are relative to *https://demo.fineract.dev/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**applyClientCharge**](ClientChargesApi.md#applyClientCharge) | **POST** clients/{clientId}/charges | Add Client Charge
[**deleteClientCharge**](ClientChargesApi.md#deleteClientCharge) | **DELETE** clients/{clientId}/charges/{chargeId} | Delete a Client Charge
[**payOrWaiveClientCharge**](ClientChargesApi.md#payOrWaiveClientCharge) | **POST** clients/{clientId}/charges/{chargeId} | Pay a Client Charge | Waive a Client Charge
[**retrieveAllClientCharges**](ClientChargesApi.md#retrieveAllClientCharges) | **GET** clients/{clientId}/charges | List Client Charges
[**retrieveClientCharge**](ClientChargesApi.md#retrieveClientCharge) | **GET** clients/{clientId}/charges/{chargeId} | Retrieve a Client Charge
[**retrieveTemplate4**](ClientChargesApi.md#retrieveTemplate4) | **GET** clients/{clientId}/charges/template | 

<a name="applyClientCharge"></a>
# **applyClientCharge**
> PostClientsClientIdChargesResponse applyClientCharge(body, clientId)

Add Client Charge

 This API associates a Client charge with an implicit Client account Mandatory Fields :  chargeId and dueDate   Optional Fields :  amount

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

ClientChargesApi apiService = defaultClient.createService(ClientChargesApi.class);

// Initialize these parameters earlier.
Call<PostClientsClientIdChargesResponse> call = apiService.applyClientCharge(body, clientId);
call.enqueue(new Callback<PostClientsClientIdChargesResponse>() {
    @Override
    public void onResponse(Call<PostClientsClientIdChargesResponse> call, Response<PostClientsClientIdChargesResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PostClientsClientIdChargesResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PostClientsClientIdChargesRequest**](PostClientsClientIdChargesRequest.md)|  |
 **clientId** | **Long**| clientId |

### Return type

[**PostClientsClientIdChargesResponse**](PostClientsClientIdChargesResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteClientCharge"></a>
# **deleteClientCharge**
> DeleteClientsClientIdChargesChargeIdResponse deleteClientCharge(clientId, chargeId)

Delete a Client Charge

Deletes a Client Charge on which no transactions have taken place (either payments or waivers). 

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

ClientChargesApi apiService = defaultClient.createService(ClientChargesApi.class);

// Initialize these parameters earlier.
Call<DeleteClientsClientIdChargesChargeIdResponse> call = apiService.deleteClientCharge(clientId, chargeId);
call.enqueue(new Callback<DeleteClientsClientIdChargesChargeIdResponse>() {
    @Override
    public void onResponse(Call<DeleteClientsClientIdChargesChargeIdResponse> call, Response<DeleteClientsClientIdChargesChargeIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<DeleteClientsClientIdChargesChargeIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **Long**| clientId |
 **chargeId** | **Long**| chargeId |

### Return type

[**DeleteClientsClientIdChargesChargeIdResponse**](DeleteClientsClientIdChargesChargeIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="payOrWaiveClientCharge"></a>
# **payOrWaiveClientCharge**
> PostClientsClientIdChargesChargeIdResponse payOrWaiveClientCharge(body, clientId, chargeId, command)

Pay a Client Charge | Waive a Client Charge

Pay a Client Charge:  Mandatory Fields:transactionDate and amount \&quot;Pay either a part of or the entire due amount for a charge.(command&#x3D;paycharge)  Waive a Client Charge:   This API provides the facility of waiving off the remaining amount on a client charge (command&#x3D;waive)  Showing request/response for &#x27;Pay a Client Charge&#x27;

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

ClientChargesApi apiService = defaultClient.createService(ClientChargesApi.class);

// Initialize these parameters earlier.
Call<PostClientsClientIdChargesChargeIdResponse> call = apiService.payOrWaiveClientCharge(body, clientId, chargeId, command);
call.enqueue(new Callback<PostClientsClientIdChargesChargeIdResponse>() {
    @Override
    public void onResponse(Call<PostClientsClientIdChargesChargeIdResponse> call, Response<PostClientsClientIdChargesChargeIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PostClientsClientIdChargesChargeIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PostClientsClientIdChargesChargeIdRequest**](PostClientsClientIdChargesChargeIdRequest.md)|  |
 **clientId** | **Long**| clientId |
 **chargeId** | **Long**| chargeId |
 **command** | **String**| command | [optional]

### Return type

[**PostClientsClientIdChargesChargeIdResponse**](PostClientsClientIdChargesChargeIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveAllClientCharges"></a>
# **retrieveAllClientCharges**
> GetClientsClientIdChargesResponse retrieveAllClientCharges(clientId, chargeStatus, pendingPayment, limit, offset)

List Client Charges

The list capability of client charges supports pagination.Example Requests: clients/1/charges  clients/1/charges?offset&#x3D;0&amp;limit&#x3D;5

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

ClientChargesApi apiService = defaultClient.createService(ClientChargesApi.class);

// Initialize these parameters earlier.
Call<GetClientsClientIdChargesResponse> call = apiService.retrieveAllClientCharges(clientId, chargeStatus, pendingPayment, limit, offset);
call.enqueue(new Callback<GetClientsClientIdChargesResponse>() {
    @Override
    public void onResponse(Call<GetClientsClientIdChargesResponse> call, Response<GetClientsClientIdChargesResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetClientsClientIdChargesResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **Long**| clientId |
 **chargeStatus** | **String**| chargeStatus | [optional] [default to all]
 **pendingPayment** | **Boolean**| pendingPayment | [optional]
 **limit** | **Integer**| limit | [optional]
 **offset** | **Integer**| offset | [optional]

### Return type

[**GetClientsClientIdChargesResponse**](GetClientsClientIdChargesResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveClientCharge"></a>
# **retrieveClientCharge**
> GetClientsChargesPageItems retrieveClientCharge(clientId, chargeId)

Retrieve a Client Charge

Example Requests: clients/1/charges/1   clients/1/charges/1?fields&#x3D;name,id

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

ClientChargesApi apiService = defaultClient.createService(ClientChargesApi.class);

// Initialize these parameters earlier.
Call<GetClientsChargesPageItems> call = apiService.retrieveClientCharge(clientId, chargeId);
call.enqueue(new Callback<GetClientsChargesPageItems>() {
    @Override
    public void onResponse(Call<GetClientsChargesPageItems> call, Response<GetClientsChargesPageItems> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetClientsChargesPageItems> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **Long**| clientId |
 **chargeId** | **Long**| chargeId |

### Return type

[**GetClientsChargesPageItems**](GetClientsChargesPageItems.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveTemplate4"></a>
# **retrieveTemplate4**
> String retrieveTemplate4(clientId)



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

ClientChargesApi apiService = defaultClient.createService(ClientChargesApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.retrieveTemplate4(clientId);
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
 **clientId** | **Long**| clientId |

### Return type

**String**

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

