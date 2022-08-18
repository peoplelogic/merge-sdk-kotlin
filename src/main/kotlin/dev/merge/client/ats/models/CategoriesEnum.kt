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


import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 
 *
 * Values: HRIS,ATS,ACCOUNTING,TICKETING,CRM,UNKNOWN_DEFAULT_OPEN_API
 */

enum class CategoriesEnum(val value: kotlin.String) {

    @JsonProperty(value = "hris")
    HRIS("hris"),

    @JsonProperty(value = "ats")
    ATS("ats"),

    @JsonProperty(value = "accounting")
    ACCOUNTING("accounting"),

    @JsonProperty(value = "ticketing")
    TICKETING("ticketing"),

    @JsonProperty(value = "crm")
    CRM("crm"),

    @JsonProperty(value = "unknown_default_open_api")
    UNKNOWN_DEFAULT_OPEN_API("unknown_default_open_api");

    /**
     * Override toString() to avoid using the enum variable name as the value, and instead use
     * the actual value defined in the API spec file.
     *
     * This solves a problem when the variable name and its value are different, and ensures that
     * the client sends the correct enum values to the server always.
     */
    override fun toString(): String = value

    companion object {
        /**
         * Converts the provided [data] to a [String] on success, null otherwise.
         */
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is CategoriesEnum) "$data" else null

        /**
         * Returns a valid [CategoriesEnum] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): CategoriesEnum? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}

