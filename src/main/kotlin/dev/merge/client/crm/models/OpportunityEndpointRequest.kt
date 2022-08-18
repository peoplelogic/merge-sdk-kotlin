/**
 * Merge CRM API
 *
 * The unified API for building rich integrations with multiple CRM platforms.
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

package dev.merge.client.crm.models

import dev.merge.client.crm.models.OpportunityRequest

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.JsonNode
import dev.merge.client.shared.ApiClient

/**
 * 
 *
 * @param model 
 */

data class OpportunityEndpointRequest (

    @field:JsonProperty("model")
    val model: OpportunityRequest

) {

    data class Expanded(
        @field:JsonProperty("model")
        val model: JsonNode

    )


    companion object {
        fun normalize(expanded: OpportunityEndpointRequest.Expanded): OpportunityEndpointRequest {
            return OpportunityEndpointRequest(
                model = ApiClient.jsonConvertRequiredSafe(expanded.model)
            )
        }
    }
}

