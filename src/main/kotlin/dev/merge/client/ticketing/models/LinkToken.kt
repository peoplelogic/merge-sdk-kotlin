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


import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.JsonNode
import dev.merge.client.shared.ApiClient

/**
 * 
 *
 * @param linkToken 
 * @param integrationName 
 * @param magicLinkUrl 
 */

@JsonIgnoreProperties(ignoreUnknown = true)
data class LinkToken (

    @field:JsonProperty("link_token")
    val linkToken: kotlin.String,

    @field:JsonProperty("integration_name")
    val integrationName: kotlin.String,

    @field:JsonProperty("magic_link_url")
    val magicLinkUrl: kotlin.String? = null

) {

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class Expanded(
        @field:JsonProperty("link_token")
        val linkToken: JsonNode,

        @field:JsonProperty("integration_name")
        val integrationName: JsonNode,

        @field:JsonProperty("magic_link_url")
        val magicLinkUrl: JsonNode?

    )


    companion object {
        @JvmStatic
        fun normalize(expanded: LinkToken.Expanded): LinkToken {
            return LinkToken(
                linkToken = ApiClient.jsonConvertRequiredSafe(expanded.linkToken),
                integrationName = ApiClient.jsonConvertRequiredSafe(expanded.integrationName),
                magicLinkUrl = ApiClient.jsonConvertSafe(expanded.magicLinkUrl)
            )
        }
    }
}

