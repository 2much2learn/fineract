# HolidaysApi

All URIs are relative to *https://demo.fineract.dev/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createNewHoliday**](HolidaysApi.md#createNewHoliday) | **POST** holidays | Create a Holiday
[**delete7**](HolidaysApi.md#delete7) | **DELETE** holidays/{holidayId} | Delete a Holiday
[**handleCommands1**](HolidaysApi.md#handleCommands1) | **POST** holidays/{holidayId} | Activate a Holiday
[**retrieveAllHolidays**](HolidaysApi.md#retrieveAllHolidays) | **GET** holidays | List Holidays
[**retrieveOne7**](HolidaysApi.md#retrieveOne7) | **GET** holidays/{holidayId} | Retrieve a Holiday
[**retrieveRepaymentScheduleUpdationTyeOptions**](HolidaysApi.md#retrieveRepaymentScheduleUpdationTyeOptions) | **GET** holidays/template | 
[**update6**](HolidaysApi.md#update6) | **PUT** holidays/{holidayId} | Update a Holiday

<a name="createNewHoliday"></a>
# **createNewHoliday**
> PostHolidaysResponse createNewHoliday(body)

Create a Holiday

Mandatory Fields: name, description, fromDate, toDate, repaymentsRescheduledTo, offices

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

HolidaysApi apiService = defaultClient.createService(HolidaysApi.class);

// Initialize these parameters earlier.
Call<PostHolidaysResponse> call = apiService.createNewHoliday(body);
call.enqueue(new Callback<PostHolidaysResponse>() {
    @Override
    public void onResponse(Call<PostHolidaysResponse> call, Response<PostHolidaysResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PostHolidaysResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PostHolidaysRequest**](PostHolidaysRequest.md)|  |

### Return type

[**PostHolidaysResponse**](PostHolidaysResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="delete7"></a>
# **delete7**
> DeleteHolidaysHolidayIdResponse delete7(holidayId)

Delete a Holiday

This API allows to delete a holiday. This is a soft delete the deleted holiday status is marked as deleted.

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

HolidaysApi apiService = defaultClient.createService(HolidaysApi.class);

// Initialize these parameters earlier.
Call<DeleteHolidaysHolidayIdResponse> call = apiService.delete7(holidayId);
call.enqueue(new Callback<DeleteHolidaysHolidayIdResponse>() {
    @Override
    public void onResponse(Call<DeleteHolidaysHolidayIdResponse> call, Response<DeleteHolidaysHolidayIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<DeleteHolidaysHolidayIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **holidayId** | **Long**| holidayId |

### Return type

[**DeleteHolidaysHolidayIdResponse**](DeleteHolidaysHolidayIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="handleCommands1"></a>
# **handleCommands1**
> PostHolidaysHolidayIdResponse handleCommands1(body, holidayId, command)

Activate a Holiday

Always Holidays are created in pending state. This API allows to activate a holiday.  Only the active holidays are considered for rescheduling the loan repayment.

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

HolidaysApi apiService = defaultClient.createService(HolidaysApi.class);

// Initialize these parameters earlier.
Call<PostHolidaysHolidayIdResponse> call = apiService.handleCommands1(body, holidayId, command);
call.enqueue(new Callback<PostHolidaysHolidayIdResponse>() {
    @Override
    public void onResponse(Call<PostHolidaysHolidayIdResponse> call, Response<PostHolidaysHolidayIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PostHolidaysHolidayIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PostHolidaysHolidayIdRequest**](PostHolidaysHolidayIdRequest.md)|  |
 **holidayId** | **Long**| holidayId |
 **command** | **String**| command | [optional]

### Return type

[**PostHolidaysHolidayIdResponse**](PostHolidaysHolidayIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveAllHolidays"></a>
# **retrieveAllHolidays**
> List&lt;GetHolidaysResponse&gt; retrieveAllHolidays(officeId, fromDate, toDate, locale, dateFormat)

List Holidays

Example Requests:  holidays?officeId&#x3D;1

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

HolidaysApi apiService = defaultClient.createService(HolidaysApi.class);

// Initialize these parameters earlier.
Call<List&lt;GetHolidaysResponse&gt;> call = apiService.retrieveAllHolidays(officeId, fromDate, toDate, locale, dateFormat);
call.enqueue(new Callback<List&lt;GetHolidaysResponse&gt;>() {
    @Override
    public void onResponse(Call<List&lt;GetHolidaysResponse&gt;> call, Response<List&lt;GetHolidaysResponse&gt;> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<List&lt;GetHolidaysResponse&gt;> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **officeId** | **Long**| officeId | [optional]
 **fromDate** | [**DateParam**](.md)| fromDate | [optional]
 **toDate** | [**DateParam**](.md)| toDate | [optional]
 **locale** | **String**| locale | [optional]
 **dateFormat** | **String**| dateFormat | [optional]

### Return type

[**List&lt;GetHolidaysResponse&gt;**](GetHolidaysResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveOne7"></a>
# **retrieveOne7**
> GetHolidaysResponse retrieveOne7(holidayId)

Retrieve a Holiday

Example Requests:  holidays/1

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

HolidaysApi apiService = defaultClient.createService(HolidaysApi.class);

// Initialize these parameters earlier.
Call<GetHolidaysResponse> call = apiService.retrieveOne7(holidayId);
call.enqueue(new Callback<GetHolidaysResponse>() {
    @Override
    public void onResponse(Call<GetHolidaysResponse> call, Response<GetHolidaysResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetHolidaysResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **holidayId** | **Long**| holidayId |

### Return type

[**GetHolidaysResponse**](GetHolidaysResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveRepaymentScheduleUpdationTyeOptions"></a>
# **retrieveRepaymentScheduleUpdationTyeOptions**
> String retrieveRepaymentScheduleUpdationTyeOptions()



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

HolidaysApi apiService = defaultClient.createService(HolidaysApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.retrieveRepaymentScheduleUpdationTyeOptions();
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

<a name="update6"></a>
# **update6**
> PutHolidaysHolidayIdResponse update6(body, holidayId)

Update a Holiday

If a holiday is in pending state (created and not activated) then all fields are allowed to modify. Once holidays become active only name and descriptions are allowed to modify.

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

HolidaysApi apiService = defaultClient.createService(HolidaysApi.class);

// Initialize these parameters earlier.
Call<PutHolidaysHolidayIdResponse> call = apiService.update6(body, holidayId);
call.enqueue(new Callback<PutHolidaysHolidayIdResponse>() {
    @Override
    public void onResponse(Call<PutHolidaysHolidayIdResponse> call, Response<PutHolidaysHolidayIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PutHolidaysHolidayIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PutHolidaysHolidayIdRequest**](PutHolidaysHolidayIdRequest.md)|  |
 **holidayId** | **Long**| holidayId |

### Return type

[**PutHolidaysHolidayIdResponse**](PutHolidaysHolidayIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

