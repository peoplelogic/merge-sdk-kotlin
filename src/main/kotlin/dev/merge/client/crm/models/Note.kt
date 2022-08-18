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

import dev.merge.client.shared.RemoteData

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.JsonNode
import dev.merge.client.shared.ApiClient

/**
 * # The Note Object ### Description The `Note` object is used to represent a note in the remote system. ### Usage Example TODO
 *
 * @param id 
 * @param remoteId The third-party API ID of the matching object.
 * @param owner 
 * @param content The note's content.
 * @param contact 
 * @param account 
 * @param opportunity 
 * @param remoteUpdatedAt When the third party's lead was updated.
 * @param remoteCreatedAt When the third party's lead was created.
 * @param remoteData 
 * @param remoteWasDeleted 
 */

data class Note (

    @field:JsonProperty("id")
    val id: java.util.UUID? = null,

    /* The third-party API ID of the matching object. */
    @field:JsonProperty("remote_id")
    val remoteId: kotlin.String? = null,

    @field:JsonProperty("owner")
    val owner: java.util.UUID? = null,

    /* The note's content. */
    @field:JsonProperty("content")
    val content: kotlin.String? = null,

    @field:JsonProperty("contact")
    val contact: java.util.UUID? = null,

    @field:JsonProperty("account")
    val account: java.util.UUID? = null,

    @field:JsonProperty("opportunity")
    val opportunity: java.util.UUID? = null,

    /* When the third party's lead was updated. */
    @field:JsonProperty("remote_updated_at")
    val remoteUpdatedAt: java.time.OffsetDateTime? = null,

    /* When the third party's lead was created. */
    @field:JsonProperty("remote_created_at")
    val remoteCreatedAt: java.time.OffsetDateTime? = null,

    @field:JsonProperty("remote_data")
    val remoteData: kotlin.collections.List<RemoteData>? = null,

    @field:JsonProperty("remote_was_deleted")
    val remoteWasDeleted: kotlin.Boolean? = null

) {

    data class Expanded(
        @field:JsonProperty("id")
        val id: JsonNode?,

        @field:JsonProperty("remote_id")
        val remoteId: JsonNode?,

        @field:JsonProperty("owner")
        val owner: JsonNode?,

        @field:JsonProperty("content")
        val content: JsonNode?,

        @field:JsonProperty("contact")
        val contact: JsonNode?,

        @field:JsonProperty("account")
        val account: JsonNode?,

        @field:JsonProperty("opportunity")
        val opportunity: JsonNode?,

        @field:JsonProperty("remote_updated_at")
        val remoteUpdatedAt: JsonNode?,

        @field:JsonProperty("remote_created_at")
        val remoteCreatedAt: JsonNode?,

        @field:JsonProperty("remote_data")
        val remoteData: kotlin.collections.List<JsonNode>?,

        @field:JsonProperty("remote_was_deleted")
        val remoteWasDeleted: JsonNode?

    )


    companion object {
        fun normalize(expanded: Note.Expanded): Note {
            return Note(
                id = ApiClient.jsonConvertSafe(expanded.id),
                remoteId = ApiClient.jsonConvertSafe(expanded.remoteId),
                owner = ApiClient.jsonConvertSafe(expanded.owner),
                content = ApiClient.jsonConvertSafe(expanded.content),
                contact = ApiClient.jsonConvertSafe(expanded.contact),
                account = ApiClient.jsonConvertSafe(expanded.account),
                opportunity = ApiClient.jsonConvertSafe(expanded.opportunity),
                remoteUpdatedAt = ApiClient.jsonConvertSafe(expanded.remoteUpdatedAt),
                remoteCreatedAt = ApiClient.jsonConvertSafe(expanded.remoteCreatedAt),
                remoteData = ApiClient.jsonConvertSafe(expanded.remoteData),
                remoteWasDeleted = ApiClient.jsonConvertSafe(expanded.remoteWasDeleted)
            )
        }
    }
}

