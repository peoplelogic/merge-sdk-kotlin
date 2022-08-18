/**
 * Merge HRIS API
 *
 * The unified API for building rich integrations with multiple HR Information System platforms.
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

package dev.merge.client.hris.models


import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 
 *
 * Values: RAW,BASE64,GZIP_BASE64,UNKNOWN_DEFAULT_OPEN_API
 */

enum class EncodingEnum(val value: kotlin.String) {

    @JsonProperty(value = "RAW")
    RAW("RAW"),

    @JsonProperty(value = "BASE64")
    BASE64("BASE64"),

    @JsonProperty(value = "GZIP_BASE64")
    GZIP_BASE64("GZIP_BASE64"),

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
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is EncodingEnum) "$data" else null

        /**
         * Returns a valid [EncodingEnum] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): EncodingEnum? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}

