# PermissionsApi

All URIs are relative to *https://demo.fineract.dev/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**retrieveAllPermissions**](PermissionsApi.md#retrieveAllPermissions) | **GET** permissions | List Application Permissions
[**updatePermissionsDetails**](PermissionsApi.md#updatePermissionsDetails) | **PUT** permissions | Enable/Disable Permissions for Maker Checker

<a name="retrieveAllPermissions"></a>
# **retrieveAllPermissions**
> List&lt;GetPermissionsResponse&gt; retrieveAllPermissions()

List Application Permissions

ARGUMENTS makerCheckerableoptional, Values are true, false. Default is false. If makerCheckerable&#x3D;false or not supplied then a list of application permissions is returned. The \&quot;selected\&quot; attribute is always true in this case.  If makerCheckerable&#x3D;true then the \&quot;selected\&quot; attribute shows whether the permission is enabled for Maker Check functionality.  Note: Each Apache Fineract transaction is associated with a permission.  Example Requests:  permissions   permissions?makerCheckerable&#x3D;true   permissions?fields&#x3D;grouping,code

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

PermissionsApi apiService = defaultClient.createService(PermissionsApi.class);

// Initialize these parameters earlier.
Call<List&lt;GetPermissionsResponse&gt;> call = apiService.retrieveAllPermissions();
call.enqueue(new Callback<List&lt;GetPermissionsResponse&gt;>() {
    @Override
    public void onResponse(Call<List&lt;GetPermissionsResponse&gt;> call, Response<List&lt;GetPermissionsResponse&gt;> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<List&lt;GetPermissionsResponse&gt;> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;GetPermissionsResponse&gt;**](GetPermissionsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updatePermissionsDetails"></a>
# **updatePermissionsDetails**
> CommandProcessingResult updatePermissionsDetails(body)

Enable/Disable Permissions for Maker Checker

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

PermissionsApi apiService = defaultClient.createService(PermissionsApi.class);

// Initialize these parameters earlier.
Call<CommandProcessingResult> call = apiService.updatePermissionsDetails(body);
call.enqueue(new Callback<CommandProcessingResult>() {
    @Override
    public void onResponse(Call<CommandProcessingResult> call, Response<CommandProcessingResult> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<CommandProcessingResult> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PutPermissionsRequest**](PutPermissionsRequest.md)|  |

### Return type

[**CommandProcessingResult**](CommandProcessingResult.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

