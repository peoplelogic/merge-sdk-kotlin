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
 * # The ReportItem Object ### Description The `ReportItem` object is used to represent a report item for a Balance Sheet, Cash Flow Statement or Profit and Loss Report.  ### Usage Example Fetch from the `GET BalanceSheet` endpoint and view the balance sheet's report items.
 *
 * @param remoteId The third-party API ID of the matching object.
 * @param name The report item's name.
 * @param `value` The report item's value.
 * @param subItems 
 */

data class ReportItem (

    /* The third-party API ID of the matching object. */
    @field:JsonProperty("remote_id")
    val remoteId: kotlin.String? = null,

    /* The report item's name. */
    @field:JsonProperty("name")
    val name: kotlin.String? = null,

    /* The report item's value. */
    @field:JsonProperty("value")
    val `value`: kotlin.Float? = null,

    @field:JsonProperty("sub_items")
    val subItems: kotlin.collections.Map<kotlin.String, kotlin.Any>? = null

) {

    data class Expanded(
        @field:JsonProperty("remote_id")
        val remoteId: JsonNode?,

        @field:JsonProperty("name")
        val name: JsonNode?,

        @field:JsonProperty("value")
        val `value`: JsonNode?,

        @field:JsonProperty("sub_items")
        val subItems: JsonNode?

    )


    companion object {
        fun normalize(expanded: ReportItem.Expanded): ReportItem {
            return ReportItem(
                remoteId = ApiClient.jsonConvertSafe(expanded.remoteId),
                name = ApiClient.jsonConvertSafe(expanded.name),
                `value` = ApiClient.jsonConvertSafe(expanded.`value`),
                subItems = ApiClient.jsonConvertSafe(expanded.subItems)
            )
        }
    }
}

