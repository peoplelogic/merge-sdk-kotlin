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

import dev.merge.client.ats.models.AttachmentTypeEnum
import dev.merge.client.shared.RemoteData

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.JsonNode
import dev.merge.client.shared.ApiClient

/**
 * # The Attachment Object ### Description The `Attachment` object is used to represent a attachment for a candidate. ### Usage Example Fetch from the `LIST Attachments` endpoint and view attachments accessible by a company.
 *
 * @param id 
 * @param remoteId The third-party API ID of the matching object.
 * @param fileName The attachment's name.
 * @param fileUrl The attachment's url.
 * @param candidate 
 * @param attachmentType The attachment's type.
 * @param remoteData 
 * @param remoteWasDeleted 
 */

data class Attachment (

    @field:JsonProperty("id")
    val id: java.util.UUID? = null,

    /* The third-party API ID of the matching object. */
    @field:JsonProperty("remote_id")
    val remoteId: kotlin.String? = null,

    /* The attachment's name. */
    @field:JsonProperty("file_name")
    val fileName: kotlin.String? = null,

    /* The attachment's url. */
    @field:JsonProperty("file_url")
    val fileUrl: java.net.URI? = null,

    @field:JsonProperty("candidate")
    val candidate: java.util.UUID? = null,

    /* The attachment's type. */
    @field:JsonProperty("attachment_type")
    val attachmentType: AttachmentTypeEnum? = null,

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

        @field:JsonProperty("file_name")
        val fileName: JsonNode?,

        @field:JsonProperty("file_url")
        val fileUrl: JsonNode?,

        @field:JsonProperty("candidate")
        val candidate: JsonNode?,

        @field:JsonProperty("attachment_type")
        val attachmentType: JsonNode?,

        @field:JsonProperty("remote_data")
        val remoteData: kotlin.collections.List<JsonNode>?,

        @field:JsonProperty("remote_was_deleted")
        val remoteWasDeleted: JsonNode?

    )


    companion object {
        fun normalize(expanded: Attachment.Expanded): Attachment {
            return Attachment(
                id = ApiClient.jsonConvertSafe(expanded.id),
                remoteId = ApiClient.jsonConvertSafe(expanded.remoteId),
                fileName = ApiClient.jsonConvertSafe(expanded.fileName),
                fileUrl = ApiClient.jsonConvertSafe(expanded.fileUrl),
                candidate = ApiClient.jsonConvertSafe(expanded.candidate),
                attachmentType = ApiClient.jsonConvertSafe(expanded.attachmentType),
                remoteData = ApiClient.jsonConvertSafe(expanded.remoteData),
                remoteWasDeleted = ApiClient.jsonConvertSafe(expanded.remoteWasDeleted)
            )
        }
    }
}

