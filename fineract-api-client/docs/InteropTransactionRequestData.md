# InteropTransactionRequestData

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transactionCode** | **String** |  | 
**requestCode** | **String** |  |  [optional]
**accountId** | **String** |  | 
**amount** | [**MoneyData**](MoneyData.md) |  | 
**transactionRole** | [**TransactionRoleEnum**](#TransactionRoleEnum) |  | 
**transactionType** | [**InteropTransactionTypeData**](InteropTransactionTypeData.md) |  |  [optional]
**note** | **String** |  |  [optional]
**geoCode** | [**GeoCodeData**](GeoCodeData.md) |  |  [optional]
**expiration** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**extensionList** | [**List&lt;ExtensionData&gt;**](ExtensionData.md) |  |  [optional]
**expirationLocalDate** | [**LocalDate**](LocalDate.md) |  |  [optional]

<a name="TransactionRoleEnum"></a>
## Enum: TransactionRoleEnum
Name | Value
---- | -----
PAYER | &quot;PAYER&quot;
PAYEE | &quot;PAYEE&quot;
