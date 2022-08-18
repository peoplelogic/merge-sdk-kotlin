/**
 * Merge Accounting API
 *
 * The unified API for building rich integrations with multiple Accounting & Finance platforms.
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

package dev.merge.client.accounting.models


import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.JsonNode
import dev.merge.client.shared.ApiClient

/**
 * # The JournalLine Object ### Description The `JournalLine` object is used to represent a journal entry's line items.  ### Usage Example Fetch from the `GET JournalEntry` endpoint and view the journal entry's line items.
 *
 * @param remoteId The third-party API ID of the matching object.
 * @param account 
 * @param netAmount The line's net amount.
 * @param trackingCategory 
 * @param contact 
 * @param description The line's description.
 */

data class JournalLine (

    /* The third-party API ID of the matching object. */
    @field:JsonProperty("remote_id")
    val remoteId: kotlin.String? = null,

    @field:JsonProperty("account")
    val account: java.util.UUID? = null,

    /* The line's net amount. */
    @field:JsonProperty("net_amount")
    val netAmount: kotlin.Float? = null,

    @field:JsonProperty("tracking_category")
    val trackingCategory: java.util.UUID? = null,

    @field:JsonProperty("contact")
    val contact: java.util.UUID? = null,

    /* The line's description. */
    @field:JsonProperty("description")
    val description: kotlin.String? = null

) {

    data class Expanded(
        @field:JsonProperty("remote_id")
        val remoteId: JsonNode?,

        @field:JsonProperty("account")
        val account: JsonNode?,

        @field:JsonProperty("net_amount")
        val netAmount: JsonNode?,

        @field:JsonProperty("tracking_category")
        val trackingCategory: JsonNode?,

        @field:JsonProperty("contact")
        val contact: JsonNode?,

        @field:JsonProperty("description")
        val description: JsonNode?

    )


    companion object {
        fun normalize(expanded: JournalLine.Expanded): JournalLine {
            return JournalLine(
                remoteId = ApiClient.jsonConvertSafe(expanded.remoteId),
                account = ApiClient.jsonConvertSafe(expanded.account),
                netAmount = ApiClient.jsonConvertSafe(expanded.netAmount),
                trackingCategory = ApiClient.jsonConvertSafe(expanded.trackingCategory),
                contact = ApiClient.jsonConvertSafe(expanded.contact),
                description = ApiClient.jsonConvertSafe(expanded.description)
            )
        }
    }
}

