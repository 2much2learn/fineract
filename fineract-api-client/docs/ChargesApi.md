# ChargesApi

All URIs are relative to *https://demo.fineract.dev/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCharge**](ChargesApi.md#createCharge) | **POST** charges | Create/Define a Charge
[**deleteCharge**](ChargesApi.md#deleteCharge) | **DELETE** charges/{chargeId} | Delete a Charge
[**retrieveAllCharges**](ChargesApi.md#retrieveAllCharges) | **GET** charges | Retrieve Charges
[**retrieveCharge**](ChargesApi.md#retrieveCharge) | **GET** charges/{chargeId} | Retrieve a Charge
[**retrieveNewChargeDetails**](ChargesApi.md#retrieveNewChargeDetails) | **GET** charges/template | Retrieve Charge Template
[**updateCharge**](ChargesApi.md#updateCharge) | **PUT** charges/{chargeId} | Update a Charge

<a name="createCharge"></a>
# **createCharge**
> PostChargesResponse createCharge(body)

Create/Define a Charge

Define a new charge that can later be associated with loans and savings through their respective product definitions or directly on each account instance.

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

ChargesApi apiService = defaultClient.createService(ChargesApi.class);

// Initialize these parameters earlier.
Call<PostChargesResponse> call = apiService.createCharge(body);
call.enqueue(new Callback<PostChargesResponse>() {
    @Override
    public void onResponse(Call<PostChargesResponse> call, Response<PostChargesResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PostChargesResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PostChargesRequest**](PostChargesRequest.md)|  |

### Return type

[**PostChargesResponse**](PostChargesResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteCharge"></a>
# **deleteCharge**
> DeleteChargesChargeIdResponse deleteCharge(chargeId)

Delete a Charge

Deletes a Charge.

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

ChargesApi apiService = defaultClient.createService(ChargesApi.class);

// Initialize these parameters earlier.
Call<DeleteChargesChargeIdResponse> call = apiService.deleteCharge(chargeId);
call.enqueue(new Callback<DeleteChargesChargeIdResponse>() {
    @Override
    public void onResponse(Call<DeleteChargesChargeIdResponse> call, Response<DeleteChargesChargeIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<DeleteChargesChargeIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chargeId** | **Long**| chargeId |

### Return type

[**DeleteChargesChargeIdResponse**](DeleteChargesChargeIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveAllCharges"></a>
# **retrieveAllCharges**
> List&lt;GetChargesResponse&gt; retrieveAllCharges()

Retrieve Charges

Returns the list of defined charges.  Example Requests:  charges

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

ChargesApi apiService = defaultClient.createService(ChargesApi.class);

// Initialize these parameters earlier.
Call<List&lt;GetChargesResponse&gt;> call = apiService.retrieveAllCharges();
call.enqueue(new Callback<List&lt;GetChargesResponse&gt;>() {
    @Override
    public void onResponse(Call<List&lt;GetChargesResponse&gt;> call, Response<List&lt;GetChargesResponse&gt;> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<List&lt;GetChargesResponse&gt;> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;GetChargesResponse&gt;**](GetChargesResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveCharge"></a>
# **retrieveCharge**
> GetChargesResponse retrieveCharge(chargeId)

Retrieve a Charge

Returns the details of a defined Charge.  Example Requests:  charges/1

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

ChargesApi apiService = defaultClient.createService(ChargesApi.class);

// Initialize these parameters earlier.
Call<GetChargesResponse> call = apiService.retrieveCharge(chargeId);
call.enqueue(new Callback<GetChargesResponse>() {
    @Override
    public void onResponse(Call<GetChargesResponse> call, Response<GetChargesResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetChargesResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chargeId** | **Long**| chargeId |

### Return type

[**GetChargesResponse**](GetChargesResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveNewChargeDetails"></a>
# **retrieveNewChargeDetails**
> GetChargesTemplateResponse retrieveNewChargeDetails()

Retrieve Charge Template

This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed description Lists Example Request:  charges/template 

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

ChargesApi apiService = defaultClient.createService(ChargesApi.class);

// Initialize these parameters earlier.
Call<GetChargesTemplateResponse> call = apiService.retrieveNewChargeDetails();
call.enqueue(new Callback<GetChargesTemplateResponse>() {
    @Override
    public void onResponse(Call<GetChargesTemplateResponse> call, Response<GetChargesTemplateResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetChargesTemplateResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetChargesTemplateResponse**](GetChargesTemplateResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateCharge"></a>
# **updateCharge**
> PutChargesChargeIdResponse updateCharge(body, chargeId)

Update a Charge

Updates the details of a Charge.

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

ChargesApi apiService = defaultClient.createService(ChargesApi.class);

// Initialize these parameters earlier.
Call<PutChargesChargeIdResponse> call = apiService.updateCharge(body, chargeId);
call.enqueue(new Callback<PutChargesChargeIdResponse>() {
    @Override
    public void onResponse(Call<PutChargesChargeIdResponse> call, Response<PutChargesChargeIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PutChargesChargeIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PutChargesChargeIdRequest**](PutChargesChargeIdRequest.md)|  |
 **chargeId** | **Long**| chargeId |

### Return type

[**PutChargesChargeIdResponse**](PutChargesChargeIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

