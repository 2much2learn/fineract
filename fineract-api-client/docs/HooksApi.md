# HooksApi

All URIs are relative to *https://demo.fineract.dev/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createHook**](HooksApi.md#createHook) | **POST** hooks | Create a Hook
[**deleteHook**](HooksApi.md#deleteHook) | **DELETE** hooks/{hookId} | Delete a Hook
[**retrieveHook**](HooksApi.md#retrieveHook) | **GET** hooks/{hookId} | Retrieve a Hook
[**retrieveHooks**](HooksApi.md#retrieveHooks) | **GET** hooks | Retrieve Hooks
[**template3**](HooksApi.md#template3) | **GET** hooks/template | Retrieve Hooks Template
[**updateHook**](HooksApi.md#updateHook) | **PUT** hooks/{hookId} | Update a Hook

<a name="createHook"></a>
# **createHook**
> PostHookResponse createHook(body)

Create a Hook

The following parameters can be passed for the creation of a hook :-  name - string - Required. The name of the template that is being called. (See /hooks/template for the list of valid hook names.)  isActive - boolean - Determines whether the hook is actually triggered.  events - array - Determines what events the hook is triggered for.  config - hash - Required. Key/value pairs to provide settings for this hook. These settings vary between the templates.  templateId - Optional. The UGD template ID associated with the same entity (client or loan).

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

HooksApi apiService = defaultClient.createService(HooksApi.class);

// Initialize these parameters earlier.
Call<PostHookResponse> call = apiService.createHook(body);
call.enqueue(new Callback<PostHookResponse>() {
    @Override
    public void onResponse(Call<PostHookResponse> call, Response<PostHookResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PostHookResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PostHookRequest**](PostHookRequest.md)|  |

### Return type

[**PostHookResponse**](PostHookResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteHook"></a>
# **deleteHook**
> DeleteHookResponse deleteHook(hookId)

Delete a Hook

Deletes a hook.

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

HooksApi apiService = defaultClient.createService(HooksApi.class);

// Initialize these parameters earlier.
Call<DeleteHookResponse> call = apiService.deleteHook(hookId);
call.enqueue(new Callback<DeleteHookResponse>() {
    @Override
    public void onResponse(Call<DeleteHookResponse> call, Response<DeleteHookResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<DeleteHookResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hookId** | **Long**| hookId |

### Return type

[**DeleteHookResponse**](DeleteHookResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveHook"></a>
# **retrieveHook**
> GetHookResponse retrieveHook(hookId)

Retrieve a Hook

Returns the details of a Hook.  Example Requests:  hooks/1

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

HooksApi apiService = defaultClient.createService(HooksApi.class);

// Initialize these parameters earlier.
Call<GetHookResponse> call = apiService.retrieveHook(hookId);
call.enqueue(new Callback<GetHookResponse>() {
    @Override
    public void onResponse(Call<GetHookResponse> call, Response<GetHookResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetHookResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hookId** | **Long**| hookId |

### Return type

[**GetHookResponse**](GetHookResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveHooks"></a>
# **retrieveHooks**
> List&lt;GetHookResponse&gt; retrieveHooks()

Retrieve Hooks

Returns the list of hooks.  Example Requests:  hooks

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

HooksApi apiService = defaultClient.createService(HooksApi.class);

// Initialize these parameters earlier.
Call<List&lt;GetHookResponse&gt;> call = apiService.retrieveHooks();
call.enqueue(new Callback<List&lt;GetHookResponse&gt;>() {
    @Override
    public void onResponse(Call<List&lt;GetHookResponse&gt;> call, Response<List&lt;GetHookResponse&gt;> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<List&lt;GetHookResponse&gt;> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;GetHookResponse&gt;**](GetHookResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="template3"></a>
# **template3**
> GetHookTemplateResponse template3()

Retrieve Hooks Template

This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed description Lists Example Request:  hooks/template

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

HooksApi apiService = defaultClient.createService(HooksApi.class);

// Initialize these parameters earlier.
Call<GetHookTemplateResponse> call = apiService.template3();
call.enqueue(new Callback<GetHookTemplateResponse>() {
    @Override
    public void onResponse(Call<GetHookTemplateResponse> call, Response<GetHookTemplateResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetHookTemplateResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetHookTemplateResponse**](GetHookTemplateResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateHook"></a>
# **updateHook**
> PutHookResponse updateHook(body, hookId)

Update a Hook

Updates the details of a hook.

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

HooksApi apiService = defaultClient.createService(HooksApi.class);

// Initialize these parameters earlier.
Call<PutHookResponse> call = apiService.updateHook(body, hookId);
call.enqueue(new Callback<PutHookResponse>() {
    @Override
    public void onResponse(Call<PutHookResponse> call, Response<PutHookResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PutHookResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PutHookRequest**](PutHookRequest.md)|  |
 **hookId** | **Long**| hookId |

### Return type

[**PutHookResponse**](PutHookResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

