# RolesApi

All URIs are relative to *https://demo.fineract.dev/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**actionsOnRoles**](RolesApi.md#actionsOnRoles) | **POST** roles/{roleId} | Enable Role | Disable Role
[**createRole**](RolesApi.md#createRole) | **POST** roles | Create a New Role
[**deleteRole**](RolesApi.md#deleteRole) | **DELETE** roles/{roleId} | Delete a Role
[**retrieveAllRoles**](RolesApi.md#retrieveAllRoles) | **GET** roles | List Roles
[**retrieveRole**](RolesApi.md#retrieveRole) | **GET** roles/{roleId} | Retrieve a Role
[**retrieveRolePermissions**](RolesApi.md#retrieveRolePermissions) | **GET** roles/{roleId}/permissions | Retrieve a Role&#x27;s Permissions
[**updateRole**](RolesApi.md#updateRole) | **PUT** roles/{roleId} | Update a Role
[**updateRolePermissions**](RolesApi.md#updateRolePermissions) | **PUT** roles/{roleId}/permissions | Update a Role&#x27;s Permissions

<a name="actionsOnRoles"></a>
# **actionsOnRoles**
> PostRolesRoleIdResponse actionsOnRoles(roleId, command)

Enable Role | Disable Role

Description : Enable role in case role is disabled. | Disable the role in case role is not associated with any users.      Example Request:   https://DomainName/api/v1/roles/{roleId}?command&#x3D;enable      https://DomainName/api/v1/roles/{roleId}?command&#x3D;disable

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

RolesApi apiService = defaultClient.createService(RolesApi.class);

// Initialize these parameters earlier.
Call<PostRolesRoleIdResponse> call = apiService.actionsOnRoles(roleId, command);
call.enqueue(new Callback<PostRolesRoleIdResponse>() {
    @Override
    public void onResponse(Call<PostRolesRoleIdResponse> call, Response<PostRolesRoleIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PostRolesRoleIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **roleId** | **Long**| roleId |
 **command** | **String**| command | [optional]

### Return type

[**PostRolesRoleIdResponse**](PostRolesRoleIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createRole"></a>
# **createRole**
> PostRolesResponse createRole(body)

Create a New Role

Mandatory Fields name, description

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

RolesApi apiService = defaultClient.createService(RolesApi.class);

// Initialize these parameters earlier.
Call<PostRolesResponse> call = apiService.createRole(body);
call.enqueue(new Callback<PostRolesResponse>() {
    @Override
    public void onResponse(Call<PostRolesResponse> call, Response<PostRolesResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PostRolesResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PostRolesRequest**](PostRolesRequest.md)|  |

### Return type

[**PostRolesResponse**](PostRolesResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteRole"></a>
# **deleteRole**
> DeleteRolesRoleIdResponse deleteRole(roleId)

Delete a Role

Description : Delete the role in case role is not associated with any users.

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

RolesApi apiService = defaultClient.createService(RolesApi.class);

// Initialize these parameters earlier.
Call<DeleteRolesRoleIdResponse> call = apiService.deleteRole(roleId);
call.enqueue(new Callback<DeleteRolesRoleIdResponse>() {
    @Override
    public void onResponse(Call<DeleteRolesRoleIdResponse> call, Response<DeleteRolesRoleIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<DeleteRolesRoleIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **roleId** | **Long**| roleId |

### Return type

[**DeleteRolesRoleIdResponse**](DeleteRolesRoleIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveAllRoles"></a>
# **retrieveAllRoles**
> List&lt;GetRolesResponse&gt; retrieveAllRoles()

List Roles

Example Requests:  roles   roles?fields&#x3D;name

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

RolesApi apiService = defaultClient.createService(RolesApi.class);

// Initialize these parameters earlier.
Call<List&lt;GetRolesResponse&gt;> call = apiService.retrieveAllRoles();
call.enqueue(new Callback<List&lt;GetRolesResponse&gt;>() {
    @Override
    public void onResponse(Call<List&lt;GetRolesResponse&gt;> call, Response<List&lt;GetRolesResponse&gt;> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<List&lt;GetRolesResponse&gt;> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;GetRolesResponse&gt;**](GetRolesResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveRole"></a>
# **retrieveRole**
> GetRolesRoleIdResponse retrieveRole(roleId)

Retrieve a Role

Example Requests:  roles/1   roles/1?fields&#x3D;name

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

RolesApi apiService = defaultClient.createService(RolesApi.class);

// Initialize these parameters earlier.
Call<GetRolesRoleIdResponse> call = apiService.retrieveRole(roleId);
call.enqueue(new Callback<GetRolesRoleIdResponse>() {
    @Override
    public void onResponse(Call<GetRolesRoleIdResponse> call, Response<GetRolesRoleIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetRolesRoleIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **roleId** | **Long**| roleId |

### Return type

[**GetRolesRoleIdResponse**](GetRolesRoleIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveRolePermissions"></a>
# **retrieveRolePermissions**
> GetRolesRoleIdPermissionsResponse retrieveRolePermissions(roleId)

Retrieve a Role&#x27;s Permissions

Example Requests:  roles/1/permissions

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

RolesApi apiService = defaultClient.createService(RolesApi.class);

// Initialize these parameters earlier.
Call<GetRolesRoleIdPermissionsResponse> call = apiService.retrieveRolePermissions(roleId);
call.enqueue(new Callback<GetRolesRoleIdPermissionsResponse>() {
    @Override
    public void onResponse(Call<GetRolesRoleIdPermissionsResponse> call, Response<GetRolesRoleIdPermissionsResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetRolesRoleIdPermissionsResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **roleId** | **Long**| roleId |

### Return type

[**GetRolesRoleIdPermissionsResponse**](GetRolesRoleIdPermissionsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateRole"></a>
# **updateRole**
> PutRolesRoleIdResponse updateRole(body, roleId)

Update a Role

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

RolesApi apiService = defaultClient.createService(RolesApi.class);

// Initialize these parameters earlier.
Call<PutRolesRoleIdResponse> call = apiService.updateRole(body, roleId);
call.enqueue(new Callback<PutRolesRoleIdResponse>() {
    @Override
    public void onResponse(Call<PutRolesRoleIdResponse> call, Response<PutRolesRoleIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PutRolesRoleIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PutRolesRoleIdRequest**](PutRolesRoleIdRequest.md)|  |
 **roleId** | **Long**| roleId |

### Return type

[**PutRolesRoleIdResponse**](PutRolesRoleIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateRolePermissions"></a>
# **updateRolePermissions**
> PutRolesRoleIdPermissionsResponse updateRolePermissions(body, roleId)

Update a Role&#x27;s Permissions

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

RolesApi apiService = defaultClient.createService(RolesApi.class);

// Initialize these parameters earlier.
Call<PutRolesRoleIdPermissionsResponse> call = apiService.updateRolePermissions(body, roleId);
call.enqueue(new Callback<PutRolesRoleIdPermissionsResponse>() {
    @Override
    public void onResponse(Call<PutRolesRoleIdPermissionsResponse> call, Response<PutRolesRoleIdPermissionsResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PutRolesRoleIdPermissionsResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PutRolesRoleIdPermissionsRequest**](PutRolesRoleIdPermissionsRequest.md)|  |
 **roleId** | **Long**| roleId |

### Return type

[**PutRolesRoleIdPermissionsResponse**](PutRolesRoleIdPermissionsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

