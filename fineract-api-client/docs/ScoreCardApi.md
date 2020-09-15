# ScoreCardApi

All URIs are relative to *https://demo.fineract.dev/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createScorecard1**](ScoreCardApi.md#createScorecard1) | **POST** surveys/scorecards/{surveyId} | Create a Scorecard entry
[**findByClient1**](ScoreCardApi.md#findByClient1) | **GET** surveys/scorecards/clients/{clientId} | 
[**findBySurvey**](ScoreCardApi.md#findBySurvey) | **GET** surveys/scorecards/{surveyId} | List all Scorecard entries
[**findBySurveyAndClient**](ScoreCardApi.md#findBySurveyAndClient) | **GET** surveys/scorecards/{surveyId}/clients/{clientId} | 

<a name="createScorecard1"></a>
# **createScorecard1**
> Void createScorecard1(surveyId, body)

Create a Scorecard entry

Add a new entry to a survey.  Mandatory Fields clientId, createdOn, questionId, responseId, staffId

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

ScoreCardApi apiService = defaultClient.createService(ScoreCardApi.class);

// Initialize these parameters earlier.
Call<Void> call = apiService.createScorecard1(surveyId, body);
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
 **surveyId** | **Long**| Enter surveyId |
 **body** | [**ScorecardData**](ScorecardData.md)| scorecardData | [optional]

### Return type

[**Void**](.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="findByClient1"></a>
# **findByClient1**
> List&lt;ScorecardData&gt; findByClient1(clientId)



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

ScoreCardApi apiService = defaultClient.createService(ScoreCardApi.class);

// Initialize these parameters earlier.
Call<List&lt;ScorecardData&gt;> call = apiService.findByClient1(clientId);
call.enqueue(new Callback<List&lt;ScorecardData&gt;>() {
    @Override
    public void onResponse(Call<List&lt;ScorecardData&gt;> call, Response<List&lt;ScorecardData&gt;> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<List&lt;ScorecardData&gt;> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **Long**|  |

### Return type

[**List&lt;ScorecardData&gt;**](ScorecardData.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findBySurvey"></a>
# **findBySurvey**
> List&lt;Scorecard&gt; findBySurvey(surveyId)

List all Scorecard entries

List all Scorecard entries for a survey.

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

ScoreCardApi apiService = defaultClient.createService(ScoreCardApi.class);

// Initialize these parameters earlier.
Call<List&lt;Scorecard&gt;> call = apiService.findBySurvey(surveyId);
call.enqueue(new Callback<List&lt;Scorecard&gt;>() {
    @Override
    public void onResponse(Call<List&lt;Scorecard&gt;> call, Response<List&lt;Scorecard&gt;> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<List&lt;Scorecard&gt;> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **surveyId** | **Long**| Enter surveyId |

### Return type

[**List&lt;Scorecard&gt;**](Scorecard.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findBySurveyAndClient"></a>
# **findBySurveyAndClient**
> List&lt;ScorecardData&gt; findBySurveyAndClient(surveyId, clientId)



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

ScoreCardApi apiService = defaultClient.createService(ScoreCardApi.class);

// Initialize these parameters earlier.
Call<List&lt;ScorecardData&gt;> call = apiService.findBySurveyAndClient(surveyId, clientId);
call.enqueue(new Callback<List&lt;ScorecardData&gt;>() {
    @Override
    public void onResponse(Call<List&lt;ScorecardData&gt;> call, Response<List&lt;ScorecardData&gt;> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<List&lt;ScorecardData&gt;> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **surveyId** | **Long**| Enter surveyId |
 **clientId** | **Long**| Enter clientId |

### Return type

[**List&lt;ScorecardData&gt;**](ScorecardData.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

