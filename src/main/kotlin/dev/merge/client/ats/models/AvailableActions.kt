/**
 * Merge ATS API
 *
 * The unified API for building rich integrations with multiple Applicant Tracking System platforms.
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

package dev.merge.client.ats.models

import dev.merge.client.ats.models.AccountIntegration
import dev.merge.client.ats.models.ModelOperation

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.JsonNode
import dev.merge.client.shared.ApiClient

/**
 * # The AvailableActions Object ### Description The `Activity` object is used to see all available model/operation combinations for an integration.  ### Usage Example Fetch all the actions available for the `Zenefits` integration.
 *
 * @param integration 
 * @param passthroughAvailable 
 * @param availableModelOperations 
 */

data class AvailableActions (

    @field:JsonProperty("integration")
    val integration: AccountIntegration,

    @field:JsonProperty("passthrough_available")
    val passthroughAvailable: kotlin.Boolean,

    @field:JsonProperty("available_model_operations")
    val availableModelOperations: kotlin.collections.List<ModelOperation>? = null

) {

    data class Expanded(
        @field:JsonProperty("integration")
        val integration: JsonNode,

        @field:JsonProperty("passthrough_available")
        val passthroughAvailable: JsonNode,

        @field:JsonProperty("available_model_operations")
        val availableModelOperations: kotlin.collections.List<JsonNode>?

    )


    companion object {
        fun normalize(expanded: AvailableActions.Expanded): AvailableActions {
            return AvailableActions(
                integration = ApiClient.jsonConvertRequiredSafe(expanded.integration),
                passthroughAvailable = ApiClient.jsonConvertRequiredSafe(expanded.passthroughAvailable),
                availableModelOperations = ApiClient.jsonConvertSafe(expanded.availableModelOperations)
            )
        }
    }
}

