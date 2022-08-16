/**
 * Merge HRIS API
 *
 * The unified API for building rich integrations with multiple HR Information System platforms.
 *
 * The version of the OpenAPI document: 1.0
 * Contact: hello@merge.dev
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package dev.merge.client.hris.apis

import dev.merge.client.hris.models.WebhookReceiver
import dev.merge.client.hris.models.WebhookReceiverRequest

import io.ktor.client.HttpClientConfig
import io.ktor.client.request.forms.formData
import io.ktor.client.engine.HttpClientEngine
import io.ktor.http.ParametersBuilder
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.serialization.jackson.jackson
import io.ktor.client.call.body

import com.fasterxml.jackson.databind.ObjectMapper

import dev.merge.client.shared.*

open class WebhookReceiversApi(
baseUrl: String = ApiClient.BASE_URL + "hris/v1",
httpClientEngine: HttpClientEngine? = null,
httpClientConfig: HttpClientConfig<*>.() -> Unit = {
    install(ContentNegotiation) {
        jackson()
    }
},
json: ObjectMapper = ApiClient.JSON_DEFAULT,
) : ApiClient(baseUrl, httpClientEngine, httpClientConfig, json) {

    data class WebhookReceiversCreateRequest (
        val webhookReceiverRequest: WebhookReceiverRequest
    )

    /**
    * 
    * Creates a &#x60;WebhookReceiver&#x60; object with the given values.
     * @param webhookReceiverRequest  
     * @return WebhookReceiver
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun webhookReceiversCreate(requestModel: WebhookReceiversApi.WebhookReceiversCreateRequest): WebhookReceiver {

        val localVariableAuthNames = listOf<String>("accountTokenAuth", "bearerAuth")

        val localVariableBody = requestModel.webhookReceiverRequest

        val localVariableQuery = mutableMapOf<String, List<String>>()

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
        RequestMethod.POST,
        "/webhook-receivers",
        query = localVariableQuery,
        headers = localVariableHeaders
        )

        return jsonRequest(
        localVariableConfig,
        localVariableBody,
        localVariableAuthNames
        ).body()
    }

    /**
    * 
    * Returns a list of &#x60;WebhookReceiver&#x60; objects.
     * @return kotlin.collections.List<WebhookReceiver>
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun webhookReceiversList(): kotlin.collections.List<WebhookReceiver> {

        val localVariableAuthNames = listOf<String>("accountTokenAuth", "bearerAuth")

        val localVariableBody = 
                io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
        RequestMethod.GET,
        "/webhook-receivers",
        query = localVariableQuery,
        headers = localVariableHeaders
        )

        return request(
        localVariableConfig,
        localVariableBody,
        localVariableAuthNames
        ).body()
    }

}
