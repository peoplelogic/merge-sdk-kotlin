/**
 * Merge Marketing Automation API
 *
 * The unified API for building rich integrations with multiple Marketing Automation platforms.
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

package dev.merge.client.mktg.models

import dev.merge.client.mktg.models.CountryEnum

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.JsonNode
import dev.merge.client.shared.ApiClient

/**
 * # The Contact Object ### Description The `Contact` object is used to represent a contact in the remote system. ### Usage Example Fetch from the `GET /api/mktg/v1/contact` endpoint and view their phone numbers.
 *
 * @param firstName The contact's first name.
 * @param lastName The contact's last name.
 * @param email The contact's email.
 * @param phone The contact's phone.
 * @param state The contact's state.
 * @param country The contact's country.
 * @param postalCode The contact's postal code.
 * @param integrationParams 
 * @param linkedAccountParams 
 */

@JsonIgnoreProperties(ignoreUnknown = true)
data class ContactRequest (

    /* The contact's first name. */
    @field:JsonProperty("first_name")
    val firstName: kotlin.String? = null,

    /* The contact's last name. */
    @field:JsonProperty("last_name")
    val lastName: kotlin.String? = null,

    /* The contact's email. */
    @field:JsonProperty("email")
    val email: kotlin.String? = null,

    /* The contact's phone. */
    @field:JsonProperty("phone")
    val phone: kotlin.String? = null,

    /* The contact's state. */
    @field:JsonProperty("state")
    val state: kotlin.String? = null,

    /* The contact's country. */
    @field:JsonProperty("country")
    val country: CountryEnum? = null,

    /* The contact's postal code. */
    @field:JsonProperty("postal_code")
    val postalCode: kotlin.String? = null,

    @field:JsonProperty("integration_params")
    val integrationParams: kotlin.collections.Map<kotlin.String, kotlin.Any>? = null,

    @field:JsonProperty("linked_account_params")
    val linkedAccountParams: kotlin.collections.Map<kotlin.String, kotlin.Any>? = null

) {

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class Expanded(
        @field:JsonProperty("first_name")
        val firstName: JsonNode?,

        @field:JsonProperty("last_name")
        val lastName: JsonNode?,

        @field:JsonProperty("email")
        val email: JsonNode?,

        @field:JsonProperty("phone")
        val phone: JsonNode?,

        @field:JsonProperty("state")
        val state: JsonNode?,

        @field:JsonProperty("country")
        val country: JsonNode?,

        @field:JsonProperty("postal_code")
        val postalCode: JsonNode?,

        @field:JsonProperty("integration_params")
        val integrationParams: JsonNode?,

        @field:JsonProperty("linked_account_params")
        val linkedAccountParams: JsonNode?

    )


    companion object {
        @JvmStatic
        fun normalize(expanded: ContactRequest.Expanded): ContactRequest {
            return ContactRequest(
                firstName = ApiClient.jsonConvertSafe(expanded.firstName),
                lastName = ApiClient.jsonConvertSafe(expanded.lastName),
                email = ApiClient.jsonConvertSafe(expanded.email),
                phone = ApiClient.jsonConvertSafe(expanded.phone),
                state = ApiClient.jsonConvertSafe(expanded.state),
                country = ApiClient.jsonConvertSafe(expanded.country),
                postalCode = ApiClient.jsonConvertSafe(expanded.postalCode),
                integrationParams = ApiClient.jsonConvertSafe(expanded.integrationParams),
                linkedAccountParams = ApiClient.jsonConvertSafe(expanded.linkedAccountParams)
            )
        }
    }
}

