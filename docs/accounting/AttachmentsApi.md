# AttachmentsApi

All URIs are relative to *https://api.merge.dev/api/accounting/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**attachmentsCreate**](AttachmentsApi.md#attachmentsCreate) | **POST** /attachments | 
[**attachmentsList**](AttachmentsApi.md#attachmentsList) | **GET** /attachments | 
[**attachmentsMetaPostRetrieve**](AttachmentsApi.md#attachmentsMetaPostRetrieve) | **GET** /attachments/meta/post | 
[**attachmentsRetrieve**](AttachmentsApi.md#attachmentsRetrieve) | **GET** /attachments/{id} | 


<a name="attachmentsCreate"></a>
# **attachmentsCreate**
> AccountingAttachmentResponse attachmentsCreate(accountingAttachmentEndpointRequest, isDebugMode, runAsync)



Creates an &#x60;AccountingAttachment&#x60; object with the given values.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.accounting.models.*

val apiInstance = AttachmentsApi()
val accountingAttachmentEndpointRequest : AccountingAttachmentEndpointRequest =  // AccountingAttachmentEndpointRequest | 
val isDebugMode : kotlin.Boolean = true // kotlin.Boolean | Whether to include debug fields (such as log file links) in the response.
val runAsync : kotlin.Boolean = true // kotlin.Boolean | Whether or not third-party updates should be run asynchronously.
try {
    val result : AccountingAttachmentResponse = apiInstance.attachmentsCreate(accountingAttachmentEndpointRequest, isDebugMode, runAsync)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AttachmentsApi#attachmentsCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AttachmentsApi#attachmentsCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountingAttachmentEndpointRequest** | [**AccountingAttachmentEndpointRequest**](AccountingAttachmentEndpointRequest.md)|  |
 **isDebugMode** | **kotlin.Boolean**| Whether to include debug fields (such as log file links) in the response. | [optional]
 **runAsync** | **kotlin.Boolean**| Whether or not third-party updates should be run asynchronously. | [optional]

### Return type

[**AccountingAttachmentResponse**](AccountingAttachmentResponse.md)

### Authorization


Configure accountTokenAuth:
    ApiClient.apiKey["X-Account-Token"] = ""
    ApiClient.apiKeyPrefix["X-Account-Token"] = ""
Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json

<a name="attachmentsList"></a>
# **attachmentsList**
> PaginatedAccountingAttachmentList attachmentsList(companyId, createdAfter, createdBefore, cursor, includeDeletedData, includeRemoteData, modifiedAfter, modifiedBefore, pageSize, remoteId)



Returns a list of &#x60;AccountingAttachment&#x60; objects.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.accounting.models.*

val apiInstance = AttachmentsApi()
val companyId : kotlin.String = companyId_example // kotlin.String | If provided, will only return accounting attachments for this company.
val createdAfter : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects created after this datetime.
val createdBefore : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects created before this datetime.
val cursor : kotlin.String = cD0yMDIxLTAxLTA2KzAzJTNBMjQlM0E1My40MzQzMjYlMkIwMCUzQTAw // kotlin.String | The pagination cursor value.
val includeDeletedData : kotlin.Boolean = true // kotlin.Boolean | Whether to include data that was marked as deleted by third party webhooks.
val includeRemoteData : kotlin.Boolean = true // kotlin.Boolean | Whether to include the original data Merge fetched from the third-party to produce these models.
val modifiedAfter : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects modified after this datetime.
val modifiedBefore : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | If provided, will only return objects modified before this datetime.
val pageSize : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val remoteId : kotlin.String = remoteId_example // kotlin.String | The API provider's ID for the given object.
try {
    val result : PaginatedAccountingAttachmentList = apiInstance.attachmentsList(companyId, createdAfter, createdBefore, cursor, includeDeletedData, includeRemoteData, modifiedAfter, modifiedBefore, pageSize, remoteId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AttachmentsApi#attachmentsList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AttachmentsApi#attachmentsList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **companyId** | **kotlin.String**| If provided, will only return accounting attachments for this company. | [optional]
 **createdAfter** | **java.time.OffsetDateTime**| If provided, will only return objects created after this datetime. | [optional]
 **createdBefore** | **java.time.OffsetDateTime**| If provided, will only return objects created before this datetime. | [optional]
 **cursor** | **kotlin.String**| The pagination cursor value. | [optional]
 **includeDeletedData** | **kotlin.Boolean**| Whether to include data that was marked as deleted by third party webhooks. | [optional]
 **includeRemoteData** | **kotlin.Boolean**| Whether to include the original data Merge fetched from the third-party to produce these models. | [optional]
 **modifiedAfter** | **java.time.OffsetDateTime**| If provided, will only return objects modified after this datetime. | [optional]
 **modifiedBefore** | **java.time.OffsetDateTime**| If provided, will only return objects modified before this datetime. | [optional]
 **pageSize** | **kotlin.Int**| Number of results to return per page. | [optional]
 **remoteId** | **kotlin.String**| The API provider&#39;s ID for the given object. | [optional]

### Return type

[**PaginatedAccountingAttachmentList**](PaginatedAccountingAttachmentList.md)

### Authorization


Configure accountTokenAuth:
    ApiClient.apiKey["X-Account-Token"] = ""
    ApiClient.apiKeyPrefix["X-Account-Token"] = ""
Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="attachmentsMetaPostRetrieve"></a>
# **attachmentsMetaPostRetrieve**
> MetaResponse attachmentsMetaPostRetrieve()



Returns metadata for &#x60;AccountingAttachment&#x60; POSTs.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.accounting.models.*

val apiInstance = AttachmentsApi()
try {
    val result : MetaResponse = apiInstance.attachmentsMetaPostRetrieve()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AttachmentsApi#attachmentsMetaPostRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AttachmentsApi#attachmentsMetaPostRetrieve")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**MetaResponse**](MetaResponse.md)

### Authorization


Configure accountTokenAuth:
    ApiClient.apiKey["X-Account-Token"] = ""
    ApiClient.apiKeyPrefix["X-Account-Token"] = ""
Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="attachmentsRetrieve"></a>
# **attachmentsRetrieve**
> AccountingAttachment attachmentsRetrieve(id, includeRemoteData)



Returns an &#x60;AccountingAttachment&#x60; object with the given &#x60;id&#x60;.

### Example
```kotlin
// Import classes:
//import dev.merge.client.shared.*
//import dev.merge.client.accounting.models.*

val apiInstance = AttachmentsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val includeRemoteData : kotlin.Boolean = true // kotlin.Boolean | Whether to include the original data Merge fetched from the third-party to produce these models.
try {
    val result : AccountingAttachment = apiInstance.attachmentsRetrieve(id, includeRemoteData)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AttachmentsApi#attachmentsRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AttachmentsApi#attachmentsRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **java.util.UUID**|  |
 **includeRemoteData** | **kotlin.Boolean**| Whether to include the original data Merge fetched from the third-party to produce these models. | [optional]

### Return type

[**AccountingAttachment**](AccountingAttachment.md)

### Authorization


Configure accountTokenAuth:
    ApiClient.apiKey["X-Account-Token"] = ""
    ApiClient.apiKeyPrefix["X-Account-Token"] = ""
Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

