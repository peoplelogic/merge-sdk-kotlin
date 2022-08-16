/**
 * Merge Ticketing API
 *
 * The unified API for building rich integrations with multiple Ticketing platforms.
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

package dev.merge.client.ticketing.apis

import dev.merge.client.ticketing.models.GenerateRemoteKeyRequest
import dev.merge.client.ticketing.models.RemoteKey

import io.ktor.client.HttpClientConfig
import io.ktor.client.request.forms.formData
import io.ktor.client.engine.HttpClientEngine
import io.ktor.http.ParametersBuilder
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.serialization.jackson.jackson
import io.ktor.client.call.body

import com.fasterxml.jackson.databind.ObjectMapper

import dev.merge.client.shared.*

open class GenerateKeyApi(
baseUrl: String = ApiClient.BASE_URL + "ticketing/v1",
httpClientEngine: HttpClientEngine? = null,
httpClientConfig: HttpClientConfig<*>.() -> Unit = {
    install(ContentNegotiation) {
        jackson()
    }
},
json: ObjectMapper = ApiClient.JSON_DEFAULT,
) : ApiClient(baseUrl, httpClientEngine, httpClientConfig, json) {

    data class GenerateKeyCreateRequest (
        val generateRemoteKeyRequest: GenerateRemoteKeyRequest
    )

    /**
    * 
    * Create a remote key.
     * @param generateRemoteKeyRequest  
     * @return RemoteKey
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun generateKeyCreate(requestModel: GenerateKeyApi.GenerateKeyCreateRequest): RemoteKey {

        val localVariableAuthNames = listOf<String>("bearerAuth")

        val localVariableBody = requestModel.generateRemoteKeyRequest

        val localVariableQuery = mutableMapOf<String, List<String>>()

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
        RequestMethod.POST,
        "/generate-key",
        query = localVariableQuery,
        headers = localVariableHeaders
        )

        return jsonRequest(
        localVariableConfig,
        localVariableBody,
        localVariableAuthNames
        ).body()
    }

}
