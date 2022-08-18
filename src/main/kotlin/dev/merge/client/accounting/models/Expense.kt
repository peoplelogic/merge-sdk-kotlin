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

import dev.merge.client.accounting.models.CurrencyEnum
import dev.merge.client.accounting.models.ExpenseLine
import dev.merge.client.shared.RemoteData

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.JsonNode
import dev.merge.client.shared.ApiClient

/**
 * # The Expense Object ### Description The `Expense` object is used to represent a company's expenses  ### Usage Example Fetch from the `GET Expense` endpoint and view a company's expense.
 *
 * @param id 
 * @param remoteId The third-party API ID of the matching object.
 * @param remoteData 
 * @param transactionDate When the transaction occurred.
 * @param remoteCreatedAt When the expense was created.
 * @param account 
 * @param contact 
 * @param totalAmount The expense's total amount.
 * @param currency The expense's currency.
 * @param memo The expense's private note.
 * @param lines 
 * @param remoteWasDeleted Indicates whether or not this object has been deleted by third party webhooks.
 */

data class Expense (

    @field:JsonProperty("id")
    val id: java.util.UUID? = null,

    /* The third-party API ID of the matching object. */
    @field:JsonProperty("remote_id")
    val remoteId: kotlin.String? = null,

    @field:JsonProperty("remote_data")
    val remoteData: kotlin.collections.List<RemoteData>? = null,

    /* When the transaction occurred. */
    @field:JsonProperty("transaction_date")
    val transactionDate: java.time.OffsetDateTime? = null,

    /* When the expense was created. */
    @field:JsonProperty("remote_created_at")
    val remoteCreatedAt: java.time.OffsetDateTime? = null,

    @field:JsonProperty("account")
    val account: java.util.UUID? = null,

    @field:JsonProperty("contact")
    val contact: java.util.UUID? = null,

    /* The expense's total amount. */
    @field:JsonProperty("total_amount")
    val totalAmount: kotlin.Float? = null,

    /* The expense's currency. */
    @field:JsonProperty("currency")
    val currency: CurrencyEnum? = null,

    /* The expense's private note. */
    @field:JsonProperty("memo")
    val memo: kotlin.String? = null,

    @field:JsonProperty("lines")
    val lines: kotlin.collections.List<ExpenseLine>? = null,

    /* Indicates whether or not this object has been deleted by third party webhooks. */
    @field:JsonProperty("remote_was_deleted")
    val remoteWasDeleted: kotlin.Boolean? = null

) {

    data class Expanded(
        @field:JsonProperty("id")
        val id: JsonNode?,

        @field:JsonProperty("remote_id")
        val remoteId: JsonNode?,

        @field:JsonProperty("remote_data")
        val remoteData: kotlin.collections.List<JsonNode>?,

        @field:JsonProperty("transaction_date")
        val transactionDate: JsonNode?,

        @field:JsonProperty("remote_created_at")
        val remoteCreatedAt: JsonNode?,

        @field:JsonProperty("account")
        val account: JsonNode?,

        @field:JsonProperty("contact")
        val contact: JsonNode?,

        @field:JsonProperty("total_amount")
        val totalAmount: JsonNode?,

        @field:JsonProperty("currency")
        val currency: JsonNode?,

        @field:JsonProperty("memo")
        val memo: JsonNode?,

        @field:JsonProperty("lines")
        val lines: kotlin.collections.List<JsonNode>?,

        @field:JsonProperty("remote_was_deleted")
        val remoteWasDeleted: JsonNode?

    )


    companion object {
        fun normalize(expanded: Expense.Expanded): Expense {
            return Expense(
                id = ApiClient.jsonConvertSafe(expanded.id),
                remoteId = ApiClient.jsonConvertSafe(expanded.remoteId),
                remoteData = ApiClient.jsonConvertSafe(expanded.remoteData),
                transactionDate = ApiClient.jsonConvertSafe(expanded.transactionDate),
                remoteCreatedAt = ApiClient.jsonConvertSafe(expanded.remoteCreatedAt),
                account = ApiClient.jsonConvertSafe(expanded.account),
                contact = ApiClient.jsonConvertSafe(expanded.contact),
                totalAmount = ApiClient.jsonConvertSafe(expanded.totalAmount),
                currency = ApiClient.jsonConvertSafe(expanded.currency),
                memo = ApiClient.jsonConvertSafe(expanded.memo),
                lines = ApiClient.jsonConvertSafe(expanded.lines),
                remoteWasDeleted = ApiClient.jsonConvertSafe(expanded.remoteWasDeleted)
            )
        }
    }
}

