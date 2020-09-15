# GroupsApi

All URIs are relative to *https://demo.fineract.dev/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**activateOrGenerateCollectionSheet**](GroupsApi.md#activateOrGenerateCollectionSheet) | **POST** groups/{groupId} | Activate a Group | Associate Clients | Disassociate Clients | Transfer Clients across groups | Generate Collection Sheet | Save Collection Sheet | Unassign a Staff | Assign a Staff | Close a Group | Unassign a Role | Update a Role
[**create7**](GroupsApi.md#create7) | **POST** groups | Create a Group
[**delete11**](GroupsApi.md#delete11) | **DELETE** groups/{groupId} | Delete a Group
[**getGroupsTemplate**](GroupsApi.md#getGroupsTemplate) | **GET** groups/downloadtemplate | 
[**postGroupTemplate**](GroupsApi.md#postGroupTemplate) | **POST** groups/uploadtemplate | 
[**retrieveAccounts**](GroupsApi.md#retrieveAccounts) | **GET** groups/{groupId}/accounts | Retrieve Group accounts overview
[**retrieveAll23**](GroupsApi.md#retrieveAll23) | **GET** groups | List Groups
[**retrieveGsimAccounts**](GroupsApi.md#retrieveGsimAccounts) | **GET** groups/{groupId}/gsimaccounts | 
[**retrieveOne13**](GroupsApi.md#retrieveOne13) | **GET** groups/{groupId} | Retrieve a Group
[**retrieveTemplate7**](GroupsApi.md#retrieveTemplate7) | **GET** groups/template | Retrieve Group Template
[**retrieveglimAccounts**](GroupsApi.md#retrieveglimAccounts) | **GET** groups/{groupId}/glimaccounts | 
[**unassignLoanOfficer**](GroupsApi.md#unassignLoanOfficer) | **POST** groups/{groupId}/command/unassign_staff | Unassign a Staff
[**update11**](GroupsApi.md#update11) | **PUT** groups/{groupId} | Update a Group

<a name="activateOrGenerateCollectionSheet"></a>
# **activateOrGenerateCollectionSheet**
> PostGroupsGroupIdResponse activateOrGenerateCollectionSheet(body, groupId, command, roleId)

Activate a Group | Associate Clients | Disassociate Clients | Transfer Clients across groups | Generate Collection Sheet | Save Collection Sheet | Unassign a Staff | Assign a Staff | Close a Group | Unassign a Role | Update a Role

Activate a Group:  Groups can be created in a Pending state. This API exists to enable group activation.    If the group happens to be already active this API will result in an error.  Mandatory Fields: activationDate  Associate Clients:  This API allows to associate existing clients to a group.    The clients are listed from the office to which the group is associated.    If client(s) is already associated with group then API will result in an error.  Mandatory Fields: clientMembers  Disassociate Clients:  This API allows to disassociate clients from a group.    Disassociating a client with active joint liability group loans results in an error.  Mandatory Fields: clientMembers  Transfer Clients across groups:  This API allows to transfer clients from one group to another  Mandatory Fields: destinationGroupId and clients  Optional Fields: inheritDestinationGroupLoanOfficer (defaults to true) and transferActiveLoans (defaults to true)  Generate Collection Sheet:  This API retrieves repayment details of all jlg loans of all members of a group on a specified meeting date.  Mandatory Fields: calendarId and transactionDate  Save Collection Sheet:  This api allows the loan officer to perform bulk repayments of JLG loans for a group on its meeting date.  Mandatory Fields: calendarId, transactionDate, actualDisbursementDate  Optional Fields: clientsAttendance, bulkRepaymentTransaction, bulkDisbursementTransactions  Unassign a Staff:  Allows you to unassign the Staff.  Mandatory Fields: staffId  Assign a Staff:  Allows you to assign Staff to an existing Group.    The selected Staff should be belong to the same office (or an office higher up in the hierarchy) as this groupMandatory Fields: staffId  Optional Fields: inheritStaffForClientAccounts (Optional: Boolean if true all members of the group (i.e all clients with active loans and savings ) will inherit the staffId)  Close a Group:  This API exists to close a group. Groups can be closed if they don&#x27;t have any non-closed clients/loans/savingsAccounts.    If the group has any active clients/loans/savingsAccount, this API will result in an error.Assign a Role:  Allows you to assign a Role to an existing member of a group.    We can define the different roles applicable to group members by adding code values to the pre-defined system code GROUPROLE. Example:Group leader etc.  Mandatory Fields: clientId, role  Unassign a Role:  Allows you to unassign Roles associated tp Group members.  Update a Role:  Allows you to update the member Role.  Mandatory Fields: role  Showing request/response for Transfer Clients across groups

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

GroupsApi apiService = defaultClient.createService(GroupsApi.class);

// Initialize these parameters earlier.
Call<PostGroupsGroupIdResponse> call = apiService.activateOrGenerateCollectionSheet(body, groupId, command, roleId);
call.enqueue(new Callback<PostGroupsGroupIdResponse>() {
    @Override
    public void onResponse(Call<PostGroupsGroupIdResponse> call, Response<PostGroupsGroupIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PostGroupsGroupIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PostGroupsGroupIdRequest**](PostGroupsGroupIdRequest.md)|  |
 **groupId** | **Long**| groupId |
 **command** | **String**| command | [optional]
 **roleId** | **Long**| roleId | [optional]

### Return type

[**PostGroupsGroupIdResponse**](PostGroupsGroupIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="create7"></a>
# **create7**
> PostGroupsResponse create7(body)

Create a Group

Creates a Group  Mandatory Fields: name, officeId, active, activationDate (if active&#x3D;true)  Optional Fields: externalId, staffId, clientMembers

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

GroupsApi apiService = defaultClient.createService(GroupsApi.class);

// Initialize these parameters earlier.
Call<PostGroupsResponse> call = apiService.create7(body);
call.enqueue(new Callback<PostGroupsResponse>() {
    @Override
    public void onResponse(Call<PostGroupsResponse> call, Response<PostGroupsResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PostGroupsResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PostGroupsRequest**](PostGroupsRequest.md)|  |

### Return type

[**PostGroupsResponse**](PostGroupsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="delete11"></a>
# **delete11**
> DeleteGroupsGroupIdResponse delete11(groupId)

Delete a Group

A group can be deleted if it is in pending state and has no associations - clients, loans or savings

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

GroupsApi apiService = defaultClient.createService(GroupsApi.class);

// Initialize these parameters earlier.
Call<DeleteGroupsGroupIdResponse> call = apiService.delete11(groupId);
call.enqueue(new Callback<DeleteGroupsGroupIdResponse>() {
    @Override
    public void onResponse(Call<DeleteGroupsGroupIdResponse> call, Response<DeleteGroupsGroupIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<DeleteGroupsGroupIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **Long**| groupId |

### Return type

[**DeleteGroupsGroupIdResponse**](DeleteGroupsGroupIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getGroupsTemplate"></a>
# **getGroupsTemplate**
> Void getGroupsTemplate(officeId, staffId, dateFormat)



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

GroupsApi apiService = defaultClient.createService(GroupsApi.class);

// Initialize these parameters earlier.
Call<Void> call = apiService.getGroupsTemplate(officeId, staffId, dateFormat);
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
 **officeId** | **Long**|  | [optional]
 **staffId** | **Long**|  | [optional]
 **dateFormat** | **String**|  | [optional]

### Return type

[**Void**](.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.ms-excel

<a name="postGroupTemplate"></a>
# **postGroupTemplate**
> String postGroupTemplate(file, locale, dateFormat)



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

GroupsApi apiService = defaultClient.createService(GroupsApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.postGroupTemplate(file, locale, dateFormat);
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
 **file** | [**FormDataContentDisposition**](.md)|  | [optional]
 **locale** | **String**|  | [optional]
 **dateFormat** | **String**|  | [optional]

### Return type

**String**

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: */*

<a name="retrieveAccounts"></a>
# **retrieveAccounts**
> GetGroupsGroupIdAccountsResponse retrieveAccounts(groupId)

Retrieve Group accounts overview

Retrieves details of all Loan and Savings accounts associated with this group.    Example Requests:    groups/1/accounts      groups/1/accounts?fields&#x3D;loanAccounts,savingsAccounts,memberLoanAccounts,  memberSavingsAccounts

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

GroupsApi apiService = defaultClient.createService(GroupsApi.class);

// Initialize these parameters earlier.
Call<GetGroupsGroupIdAccountsResponse> call = apiService.retrieveAccounts(groupId);
call.enqueue(new Callback<GetGroupsGroupIdAccountsResponse>() {
    @Override
    public void onResponse(Call<GetGroupsGroupIdAccountsResponse> call, Response<GetGroupsGroupIdAccountsResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetGroupsGroupIdAccountsResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **Long**| groupId |

### Return type

[**GetGroupsGroupIdAccountsResponse**](GetGroupsGroupIdAccountsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveAll23"></a>
# **retrieveAll23**
> GetGroupsResponse retrieveAll23(officeId, staffId, externalId, name, underHierarchy, paged, offset, limit, orderBy, sortOrder, orphansOnly)

List Groups

The default implementation of listing Groups returns 200 entries with support for pagination and sorting. Using the parameter limit with description -1 returns all entries.  Example Requests:    groups    groups?fields&#x3D;name,officeName,joinedDate    groups?offset&#x3D;10&amp;limit&#x3D;50    groups?orderBy&#x3D;name&amp;sortOrder&#x3D;DESC

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

GroupsApi apiService = defaultClient.createService(GroupsApi.class);

// Initialize these parameters earlier.
Call<GetGroupsResponse> call = apiService.retrieveAll23(officeId, staffId, externalId, name, underHierarchy, paged, offset, limit, orderBy, sortOrder, orphansOnly);
call.enqueue(new Callback<GetGroupsResponse>() {
    @Override
    public void onResponse(Call<GetGroupsResponse> call, Response<GetGroupsResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetGroupsResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **officeId** | **Long**| officeId | [optional]
 **staffId** | **Long**| staffId | [optional]
 **externalId** | **String**| externalId | [optional]
 **name** | **String**| name | [optional]
 **underHierarchy** | **String**| underHierarchy | [optional]
 **paged** | **Boolean**| paged | [optional]
 **offset** | **Integer**| offset | [optional]
 **limit** | **Integer**| limit | [optional]
 **orderBy** | **String**| orderBy | [optional]
 **sortOrder** | **String**| sortOrder | [optional]
 **orphansOnly** | **Boolean**| orphansOnly | [optional]

### Return type

[**GetGroupsResponse**](GetGroupsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveGsimAccounts"></a>
# **retrieveGsimAccounts**
> String retrieveGsimAccounts(groupId, parentGSIMAccountNo, parentGSIMId)



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

GroupsApi apiService = defaultClient.createService(GroupsApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.retrieveGsimAccounts(groupId, parentGSIMAccountNo, parentGSIMId);
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
 **groupId** | **Long**|  |
 **parentGSIMAccountNo** | **String**|  | [optional]
 **parentGSIMId** | **Long**|  | [optional]

### Return type

**String**

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveOne13"></a>
# **retrieveOne13**
> GetGroupsGroupIdResponse retrieveOne13(groupId, staffInSelectedOfficeOnly, roleId)

Retrieve a Group

Retrieve group information.  Example Requests:    groups/1    groups/1?associations&#x3D;clientMembers

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

GroupsApi apiService = defaultClient.createService(GroupsApi.class);

// Initialize these parameters earlier.
Call<GetGroupsGroupIdResponse> call = apiService.retrieveOne13(groupId, staffInSelectedOfficeOnly, roleId);
call.enqueue(new Callback<GetGroupsGroupIdResponse>() {
    @Override
    public void onResponse(Call<GetGroupsGroupIdResponse> call, Response<GetGroupsGroupIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetGroupsGroupIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **Long**| groupId |
 **staffInSelectedOfficeOnly** | **Boolean**| staffInSelectedOfficeOnly | [optional] [default to false]
 **roleId** | **Long**| roleId | [optional]

### Return type

[**GetGroupsGroupIdResponse**](GetGroupsGroupIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveTemplate7"></a>
# **retrieveTemplate7**
> GetGroupsTemplateResponse retrieveTemplate7(officeId, center, centerId, command, staffInSelectedOfficeOnly)

Retrieve Group Template

This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:    Field Defaults  Allowed Value Lists  Example Requests:    groups/template    groups/template?officeId&#x3D;2    groups/template?centerId&#x3D;1    groups/template?centerId&#x3D;1&amp;staffInSelectedOfficeOnly&#x3D;true

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

GroupsApi apiService = defaultClient.createService(GroupsApi.class);

// Initialize these parameters earlier.
Call<GetGroupsTemplateResponse> call = apiService.retrieveTemplate7(officeId, center, centerId, command, staffInSelectedOfficeOnly);
call.enqueue(new Callback<GetGroupsTemplateResponse>() {
    @Override
    public void onResponse(Call<GetGroupsTemplateResponse> call, Response<GetGroupsTemplateResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetGroupsTemplateResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **officeId** | **Long**| officeId | [optional]
 **center** | **Boolean**| center | [optional]
 **centerId** | **Long**| centerId | [optional]
 **command** | **String**| command | [optional]
 **staffInSelectedOfficeOnly** | **Boolean**| staffInSelectedOfficeOnly | [optional] [default to false]

### Return type

[**GetGroupsTemplateResponse**](GetGroupsTemplateResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveglimAccounts"></a>
# **retrieveglimAccounts**
> String retrieveglimAccounts(groupId, parentLoanAccountNo)



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

GroupsApi apiService = defaultClient.createService(GroupsApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.retrieveglimAccounts(groupId, parentLoanAccountNo);
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
 **groupId** | **Long**|  |
 **parentLoanAccountNo** | **String**|  | [optional]

### Return type

**String**

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="unassignLoanOfficer"></a>
# **unassignLoanOfficer**
> PostGroupsGroupIdCommandUnassignStaffResponse unassignLoanOfficer(body, groupId)

Unassign a Staff

Allows you to unassign the Staff.  Mandatory Fields: staffId

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

GroupsApi apiService = defaultClient.createService(GroupsApi.class);

// Initialize these parameters earlier.
Call<PostGroupsGroupIdCommandUnassignStaffResponse> call = apiService.unassignLoanOfficer(body, groupId);
call.enqueue(new Callback<PostGroupsGroupIdCommandUnassignStaffResponse>() {
    @Override
    public void onResponse(Call<PostGroupsGroupIdCommandUnassignStaffResponse> call, Response<PostGroupsGroupIdCommandUnassignStaffResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PostGroupsGroupIdCommandUnassignStaffResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PostGroupsGroupIdCommandUnassignStaffRequest**](PostGroupsGroupIdCommandUnassignStaffRequest.md)|  |
 **groupId** | **Long**| groupId |

### Return type

[**PostGroupsGroupIdCommandUnassignStaffResponse**](PostGroupsGroupIdCommandUnassignStaffResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="update11"></a>
# **update11**
> PutGroupsGroupIdResponse update11(body, groupId)

Update a Group

Updates a Group

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

GroupsApi apiService = defaultClient.createService(GroupsApi.class);

// Initialize these parameters earlier.
Call<PutGroupsGroupIdResponse> call = apiService.update11(body, groupId);
call.enqueue(new Callback<PutGroupsGroupIdResponse>() {
    @Override
    public void onResponse(Call<PutGroupsGroupIdResponse> call, Response<PutGroupsGroupIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PutGroupsGroupIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PutGroupsGroupIdRequest**](PutGroupsGroupIdRequest.md)|  |
 **groupId** | **Long**| groupId |

### Return type

[**PutGroupsGroupIdResponse**](PutGroupsGroupIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

