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

import dev.merge.client.ticketing.models.EnabledActionsEnum

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.JsonNode
import dev.merge.client.shared.ApiClient

/**
 * 
 *
 * @param modelId 
 * @param enabledActions 
 * @param disabledFields 
 */

@JsonIgnoreProperties(ignoreUnknown = true)
data class CommonModelScopesBodyRequest (

    @field:JsonProperty("model_id")
    val modelId: kotlin.String,

    @field:JsonProperty("enabled_actions")
    val enabledActions: kotlin.collections.List<EnabledActionsEnum>,

    @field:JsonProperty("disabled_fields")
    val disabledFields: kotlin.collections.List<kotlin.String>

) {

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class Expanded(
        @field:JsonProperty("model_id")
        val modelId: JsonNode,

        @field:JsonProperty("enabled_actions")
        val enabledActions: kotlin.collections.List<JsonNode>,

        @field:JsonProperty("disabled_fields")
        val disabledFields: kotlin.collections.List<JsonNode>

    )


    companion object {
        @JvmStatic
        fun normalize(expanded: CommonModelScopesBodyRequest.Expanded): CommonModelScopesBodyRequest {
            return CommonModelScopesBodyRequest(
                modelId = ApiClient.jsonConvertRequiredSafe(expanded.modelId),
                enabledActions = ApiClient.jsonConvertRequiredSafe(expanded.enabledActions),
                disabledFields = ApiClient.jsonConvertRequiredSafe(expanded.disabledFields)
            )
        }
    }
}

