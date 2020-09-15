# PasswordPreferencesApi

All URIs are relative to *https://demo.fineract.dev/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**retrieve1**](PasswordPreferencesApi.md#retrieve1) | **GET** passwordpreferences | 
[**template21**](PasswordPreferencesApi.md#template21) | **GET** passwordpreferences/template | List Application Password validation policies
[**update22**](PasswordPreferencesApi.md#update22) | **PUT** passwordpreferences | Update password preferences

<a name="retrieve1"></a>
# **retrieve1**
> GetPasswordPreferencesTemplateResponse retrieve1()



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

PasswordPreferencesApi apiService = defaultClient.createService(PasswordPreferencesApi.class);

// Initialize these parameters earlier.
Call<GetPasswordPreferencesTemplateResponse> call = apiService.retrieve1();
call.enqueue(new Callback<GetPasswordPreferencesTemplateResponse>() {
    @Override
    public void onResponse(Call<GetPasswordPreferencesTemplateResponse> call, Response<GetPasswordPreferencesTemplateResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetPasswordPreferencesTemplateResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetPasswordPreferencesTemplateResponse**](GetPasswordPreferencesTemplateResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="template21"></a>
# **template21**
> List&lt;GetPasswordPreferencesTemplateResponse&gt; template21()

List Application Password validation policies

ARGUMENTS Example Requests:  passwordpreferences

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

PasswordPreferencesApi apiService = defaultClient.createService(PasswordPreferencesApi.class);

// Initialize these parameters earlier.
Call<List&lt;GetPasswordPreferencesTemplateResponse&gt;> call = apiService.template21();
call.enqueue(new Callback<List&lt;GetPasswordPreferencesTemplateResponse&gt;>() {
    @Override
    public void onResponse(Call<List&lt;GetPasswordPreferencesTemplateResponse&gt;> call, Response<List&lt;GetPasswordPreferencesTemplateResponse&gt;> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<List&lt;GetPasswordPreferencesTemplateResponse&gt;> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;GetPasswordPreferencesTemplateResponse&gt;**](GetPasswordPreferencesTemplateResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="update22"></a>
# **update22**
> Void update22(body)

Update password preferences

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

PasswordPreferencesApi apiService = defaultClient.createService(PasswordPreferencesApi.class);

// Initialize these parameters earlier.
Call<Void> call = apiService.update22(body);
call.enqueue(new Callback<Void>() {
    @Override
    public void onResponse(Call<Void> call, Response<Void> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<Void> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PutPasswordPreferencesTemplateRequest**](PutPasswordPreferencesTemplateRequest.md)|  |

### Return type

[**Void**](.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

