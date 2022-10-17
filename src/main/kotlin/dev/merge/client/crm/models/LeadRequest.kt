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


import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.JsonNode
import dev.merge.client.shared.ApiClient

/**
 * # The Lead Object ### Description The `Lead` object is used to represent a lead in the remote system. ### Usage Example TODO
 *
 * @param remoteId The third-party API ID of the matching object.
 * @param owner 
 * @param leadSource The lead's source.
 * @param title The lead's title.
 * @param company The lead's company.
 * @param firstName The lead's first name.
 * @param lastName The lead's last name.
 * @param remoteUpdatedAt When the third party's lead was updated.
 * @param remoteCreatedAt When the third party's lead was created.
 * @param convertedDate When the lead was converted.
 * @param convertedContact 
 * @param convertedAccount 
 * @param integrationParams 
 * @param linkedAccountParams 
 */

@JsonIgnoreProperties(ignoreUnknown = true)
data class LeadRequest (

    /* The third-party API ID of the matching object. */
    @field:JsonProperty("remote_id")
    val remoteId: kotlin.String? = null,

    @field:JsonProperty("owner")
    val owner: java.util.UUID? = null,

    /* The lead's source. */
    @field:JsonProperty("lead_source")
    val leadSource: kotlin.String? = null,

    /* The lead's title. */
    @field:JsonProperty("title")
    val title: kotlin.String? = null,

    /* The lead's company. */
    @field:JsonProperty("company")
    val company: kotlin.String? = null,

    /* The lead's first name. */
    @field:JsonProperty("first_name")
    val firstName: kotlin.String? = null,

    /* The lead's last name. */
    @field:JsonProperty("last_name")
    val lastName: kotlin.String? = null,

    /* When the third party's lead was updated. */
    @field:JsonProperty("remote_updated_at")
    val remoteUpdatedAt: java.time.OffsetDateTime? = null,

    /* When the third party's lead was created. */
    @field:JsonProperty("remote_created_at")
    val remoteCreatedAt: java.time.OffsetDateTime? = null,

    /* When the lead was converted. */
    @field:JsonProperty("converted_date")
    val convertedDate: java.time.OffsetDateTime? = null,

    @field:JsonProperty("converted_contact")
    val convertedContact: java.util.UUID? = null,

    @field:JsonProperty("converted_account")
    val convertedAccount: java.util.UUID? = null,

    @field:JsonProperty("integration_params")
    val integrationParams: kotlin.collections.Map<kotlin.String, kotlin.Any>? = null,

    @field:JsonProperty("linked_account_params")
    val linkedAccountParams: kotlin.collections.Map<kotlin.String, kotlin.Any>? = null

) {

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class Expanded(
        @field:JsonProperty("remote_id")
        val remoteId: JsonNode?,

        @field:JsonProperty("owner")
        val owner: JsonNode?,

        @field:JsonProperty("lead_source")
        val leadSource: JsonNode?,

        @field:JsonProperty("title")
        val title: JsonNode?,

        @field:JsonProperty("company")
        val company: JsonNode?,

        @field:JsonProperty("first_name")
        val firstName: JsonNode?,

        @field:JsonProperty("last_name")
        val lastName: JsonNode?,

        @field:JsonProperty("remote_updated_at")
        val remoteUpdatedAt: JsonNode?,

        @field:JsonProperty("remote_created_at")
        val remoteCreatedAt: JsonNode?,

        @field:JsonProperty("converted_date")
        val convertedDate: JsonNode?,

        @field:JsonProperty("converted_contact")
        val convertedContact: JsonNode?,

        @field:JsonProperty("converted_account")
        val convertedAccount: JsonNode?,

        @field:JsonProperty("integration_params")
        val integrationParams: JsonNode?,

        @field:JsonProperty("linked_account_params")
        val linkedAccountParams: JsonNode?

    )


    companion object {
        @JvmStatic
        fun normalize(expanded: LeadRequest.Expanded): LeadRequest {
            return LeadRequest(
                remoteId = ApiClient.jsonConvertSafe(expanded.remoteId),
                owner = ApiClient.jsonConvertSafe(expanded.owner),
                leadSource = ApiClient.jsonConvertSafe(expanded.leadSource),
                title = ApiClient.jsonConvertSafe(expanded.title),
                company = ApiClient.jsonConvertSafe(expanded.company),
                firstName = ApiClient.jsonConvertSafe(expanded.firstName),
                lastName = ApiClient.jsonConvertSafe(expanded.lastName),
                remoteUpdatedAt = ApiClient.jsonConvertSafe(expanded.remoteUpdatedAt),
                remoteCreatedAt = ApiClient.jsonConvertSafe(expanded.remoteCreatedAt),
                convertedDate = ApiClient.jsonConvertSafe(expanded.convertedDate),
                convertedContact = ApiClient.jsonConvertSafe(expanded.convertedContact),
                convertedAccount = ApiClient.jsonConvertSafe(expanded.convertedAccount),
                integrationParams = ApiClient.jsonConvertSafe(expanded.integrationParams),
                linkedAccountParams = ApiClient.jsonConvertSafe(expanded.linkedAccountParams)
            )
        }
    }
}

