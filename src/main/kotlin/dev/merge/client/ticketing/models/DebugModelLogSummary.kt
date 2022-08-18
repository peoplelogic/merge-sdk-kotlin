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

package dev.merge.client.ticketing.models


import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.JsonNode
import dev.merge.client.shared.ApiClient

/**
 * 
 *
 * @param url 
 * @param method 
 * @param statusCode 
 */

data class DebugModelLogSummary (

    @field:JsonProperty("url")
    val url: kotlin.String,

    @field:JsonProperty("method")
    val method: kotlin.String,

    @field:JsonProperty("status_code")
    val statusCode: kotlin.Int

) {

    data class Expanded(
        @field:JsonProperty("url")
        val url: JsonNode,

        @field:JsonProperty("method")
        val method: JsonNode,

        @field:JsonProperty("status_code")
        val statusCode: JsonNode

    )


    companion object {
        fun normalize(expanded: DebugModelLogSummary.Expanded): DebugModelLogSummary {
            return DebugModelLogSummary(
                url = ApiClient.jsonConvertRequiredSafe(expanded.url),
                method = ApiClient.jsonConvertRequiredSafe(expanded.method),
                statusCode = ApiClient.jsonConvertRequiredSafe(expanded.statusCode)
            )
        }
    }
}

