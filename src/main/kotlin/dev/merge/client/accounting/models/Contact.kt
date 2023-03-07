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

import dev.merge.client.accounting.models.AccountingPhoneNumber
import dev.merge.client.shared.RemoteData
import dev.merge.client.accounting.models.Status7d1Enum

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.JsonNode
import dev.merge.client.shared.ApiClient

/**
 * # The Contact Object ### Description The `Contact` object refers to either a supplier or a customer.  ### Usage Example Fetch from the `LIST Contacts` endpoint and view a company's contacts.
 *
 * @param id 
 * @param remoteId The third-party API ID of the matching object.
 * @param name The contact's name.
 * @param isSupplier Whether the contact is a supplier.
 * @param isCustomer Whether the contact is a customer.
 * @param emailAddress The contact's email address.
 * @param taxNumber The contact's tax number.
 * @param status The contact's status
 * @param currency The currency the contact's transactions are in.
 * @param remoteUpdatedAt When the third party's contact was updated.
 * @param company The company the contact belongs to.
 * @param addresses `Address` object IDs for the given `Contacts` object.
 * @param phoneNumbers `AccountingPhoneNumber` object for the given `Contacts` object.
 * @param remoteWasDeleted Indicates whether or not this object has been deleted by third party webhooks.
 * @param fieldMappings 
 * @param remoteData 
 */

@JsonIgnoreProperties(ignoreUnknown = true)
data class Contact (

    @field:JsonProperty("id")
    val id: java.util.UUID? = null,

    /* The third-party API ID of the matching object. */
    @field:JsonProperty("remote_id")
    val remoteId: kotlin.String? = null,

    /* The contact's name. */
    @field:JsonProperty("name")
    val name: kotlin.String? = null,

    /* Whether the contact is a supplier. */
    @field:JsonProperty("is_supplier")
    val isSupplier: kotlin.Boolean? = null,

    /* Whether the contact is a customer. */
    @field:JsonProperty("is_customer")
    val isCustomer: kotlin.Boolean? = null,

    /* The contact's email address. */
    @field:JsonProperty("email_address")
    val emailAddress: kotlin.String? = null,

    /* The contact's tax number. */
    @field:JsonProperty("tax_number")
    val taxNumber: kotlin.String? = null,

    /* The contact's status */
    @field:JsonProperty("status")
    val status: Status7d1Enum? = null,

    /* The currency the contact's transactions are in. */
    @field:JsonProperty("currency")
    val currency: kotlin.String? = null,

    /* When the third party's contact was updated. */
    @field:JsonProperty("remote_updated_at")
    val remoteUpdatedAt: java.time.OffsetDateTime? = null,

    /* The company the contact belongs to. */
    @field:JsonProperty("company")
    val company: java.util.UUID? = null,

    /* `Address` object IDs for the given `Contacts` object. */
    @field:JsonProperty("addresses")
    val addresses: kotlin.collections.List<java.util.UUID>? = null,

    /* `AccountingPhoneNumber` object for the given `Contacts` object. */
    @field:JsonProperty("phone_numbers")
    val phoneNumbers: kotlin.collections.List<AccountingPhoneNumber>? = null,

    /* Indicates whether or not this object has been deleted by third party webhooks. */
    @field:JsonProperty("remote_was_deleted")
    val remoteWasDeleted: kotlin.Boolean? = null,

    @field:JsonProperty("field_mappings")
    val fieldMappings: kotlin.collections.Map<kotlin.String, kotlin.Any>? = null,

    @field:JsonProperty("remote_data")
    val remoteData: kotlin.collections.List<RemoteData>? = null

) {

    @JsonIgnoreProperties(ignoreUnknown = true)
    data class Expanded(
        @field:JsonProperty("id")
        val id: JsonNode?,

        @field:JsonProperty("remote_id")
        val remoteId: JsonNode?,

        @field:JsonProperty("name")
        val name: JsonNode?,

        @field:JsonProperty("is_supplier")
        val isSupplier: JsonNode?,

        @field:JsonProperty("is_customer")
        val isCustomer: JsonNode?,

        @field:JsonProperty("email_address")
        val emailAddress: JsonNode?,

        @field:JsonProperty("tax_number")
        val taxNumber: JsonNode?,

        @field:JsonProperty("status")
        val status: JsonNode?,

        @field:JsonProperty("currency")
        val currency: JsonNode?,

        @field:JsonProperty("remote_updated_at")
        val remoteUpdatedAt: JsonNode?,

        @field:JsonProperty("company")
        val company: JsonNode?,

        @field:JsonProperty("addresses")
        val addresses: kotlin.collections.List<JsonNode>?,

        @field:JsonProperty("phone_numbers")
        val phoneNumbers: kotlin.collections.List<JsonNode>?,

        @field:JsonProperty("remote_was_deleted")
        val remoteWasDeleted: JsonNode?,

        @field:JsonProperty("field_mappings")
        val fieldMappings: JsonNode?,

        @field:JsonProperty("remote_data")
        val remoteData: kotlin.collections.List<JsonNode>?

    )


    companion object {
        @JvmStatic
        fun normalize(expanded: Contact.Expanded): Contact {
            return Contact(
                id = ApiClient.jsonConvertSafe(expanded.id),
                remoteId = ApiClient.jsonConvertSafe(expanded.remoteId),
                name = ApiClient.jsonConvertSafe(expanded.name),
                isSupplier = ApiClient.jsonConvertSafe(expanded.isSupplier),
                isCustomer = ApiClient.jsonConvertSafe(expanded.isCustomer),
                emailAddress = ApiClient.jsonConvertSafe(expanded.emailAddress),
                taxNumber = ApiClient.jsonConvertSafe(expanded.taxNumber),
                status = ApiClient.jsonConvertSafe(expanded.status),
                currency = ApiClient.jsonConvertSafe(expanded.currency),
                remoteUpdatedAt = ApiClient.jsonConvertSafe(expanded.remoteUpdatedAt),
                company = ApiClient.jsonConvertSafe(expanded.company),
                addresses = ApiClient.jsonConvertSafe(expanded.addresses),
                phoneNumbers = ApiClient.jsonConvertSafe(expanded.phoneNumbers),
                remoteWasDeleted = ApiClient.jsonConvertSafe(expanded.remoteWasDeleted),
                fieldMappings = ApiClient.jsonConvertSafe(expanded.fieldMappings),
                remoteData = ApiClient.jsonConvertSafe(expanded.remoteData)
            )
        }
    }
}

