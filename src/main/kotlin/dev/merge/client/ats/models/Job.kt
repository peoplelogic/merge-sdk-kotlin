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

import dev.merge.client.ats.models.JobStatusEnum
import dev.merge.client.shared.RemoteData
import dev.merge.client.ats.models.Url

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.JsonNode
import dev.merge.client.shared.ApiClient

/**
 * # The Job Object ### Description The `Job` object can be used to track any jobs that are currently or will be open/closed for applications. ### Usage Example Fetch from the `LIST Jobs` endpoint to show all job postings.
 *
 * @param id 
 * @param remoteId The third-party API ID of the matching object.
 * @param name The job's name.
 * @param description The job's description.
 * @param code The job's code. Typically an additional identifier used to reference the particular job that is displayed on the ATS.
 * @param status The job's status.
 * @param jobPostingUrls 
 * @param remoteCreatedAt When the third party's job was created.
 * @param remoteUpdatedAt When the third party's job was updated.
 * @param confidential Whether the job is confidential.
 * @param departments IDs of `Department` objects for this `Job`.
 * @param offices IDs of `Office` objects for this `Job`.
 * @param hiringManagers IDs of `RemoteUser` objects that serve as hiring managers for this `Job`.
 * @param recruiters IDs of `RemoteUser` objects that serve as recruiters for this `Job`.
 * @param remoteWasDeleted Indicates whether or not this object has been deleted by third party webhooks.
 * @param fieldMappings 
 * @param remoteData 
 */

@JsonIgnoreProperties(ignoreUnknown = true)
data class Job (

    @field:JsonProperty("id")
    val id: java.util.UUID? = null,

    /* The third-party API ID of the matching object. */
    @field:JsonProperty("remote_id")
    val remoteId: kotlin.String? = null,

    /* The job's name. */
    @field:JsonProperty("name")
    val name: kotlin.String? = null,

    /* The job's description. */
    @field:JsonProperty("description")
    val description: kotlin.String? = null,

    /* The job's code. Typically an additional identifier used to reference the particular job that is displayed on the ATS. */
    @field:JsonProperty("code")
    val code: kotlin.String? = null,

    /* The job's status. */
    @field:JsonProperty("status")
    val status: JobStatusEnum? = null,

    @field:JsonProperty("job_posting_urls")
    val jobPostingUrls: kotlin.collections.List<Url>? = null,

    /* When the third party's job was created. */
    @field:JsonProperty("remote_created_at")
    val remoteCreatedAt: java.time.OffsetDateTime? = null,

    /* When the third party's job was updated. */
    @field:JsonProperty("remote_updated_at")
    val remoteUpdatedAt: java.time.OffsetDateTime? = null,

    /* Whether the job is confidential. */
    @field:JsonProperty("confidential")
    val confidential: kotlin.Boolean? = null,

    /* IDs of `Department` objects for this `Job`. */
    @field:JsonProperty("departments")
    val departments: kotlin.collections.List<java.util.UUID>? = null,

    /* IDs of `Office` objects for this `Job`. */
    @field:JsonProperty("offices")
    val offices: kotlin.collections.List<java.util.UUID>? = null,

    /* IDs of `RemoteUser` objects that serve as hiring managers for this `Job`. */
    @field:JsonProperty("hiring_managers")
    val hiringManagers: kotlin.collections.List<java.util.UUID>? = null,

    /* IDs of `RemoteUser` objects that serve as recruiters for this `Job`. */
    @field:JsonProperty("recruiters")
    val recruiters: kotlin.collections.List<java.util.UUID>? = null,

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

        @field:JsonProperty("description")
        val description: JsonNode?,

        @field:JsonProperty("code")
        val code: JsonNode?,

        @field:JsonProperty("status")
        val status: JsonNode?,

        @field:JsonProperty("job_posting_urls")
        val jobPostingUrls: kotlin.collections.List<JsonNode>?,

        @field:JsonProperty("remote_created_at")
        val remoteCreatedAt: JsonNode?,

        @field:JsonProperty("remote_updated_at")
        val remoteUpdatedAt: JsonNode?,

        @field:JsonProperty("confidential")
        val confidential: JsonNode?,

        @field:JsonProperty("departments")
        val departments: kotlin.collections.List<JsonNode>?,

        @field:JsonProperty("offices")
        val offices: kotlin.collections.List<JsonNode>?,

        @field:JsonProperty("hiring_managers")
        val hiringManagers: kotlin.collections.List<JsonNode>?,

        @field:JsonProperty("recruiters")
        val recruiters: kotlin.collections.List<JsonNode>?,

        @field:JsonProperty("remote_was_deleted")
        val remoteWasDeleted: JsonNode?,

        @field:JsonProperty("field_mappings")
        val fieldMappings: JsonNode?,

        @field:JsonProperty("remote_data")
        val remoteData: kotlin.collections.List<JsonNode>?

    )


    companion object {
        @JvmStatic
        fun normalize(expanded: Job.Expanded): Job {
            return Job(
                id = ApiClient.jsonConvertSafe(expanded.id),
                remoteId = ApiClient.jsonConvertSafe(expanded.remoteId),
                name = ApiClient.jsonConvertSafe(expanded.name),
                description = ApiClient.jsonConvertSafe(expanded.description),
                code = ApiClient.jsonConvertSafe(expanded.code),
                status = ApiClient.jsonConvertSafe(expanded.status),
                jobPostingUrls = ApiClient.jsonConvertSafe(expanded.jobPostingUrls),
                remoteCreatedAt = ApiClient.jsonConvertSafe(expanded.remoteCreatedAt),
                remoteUpdatedAt = ApiClient.jsonConvertSafe(expanded.remoteUpdatedAt),
                confidential = ApiClient.jsonConvertSafe(expanded.confidential),
                departments = ApiClient.jsonConvertSafe(expanded.departments),
                offices = ApiClient.jsonConvertSafe(expanded.offices),
                hiringManagers = ApiClient.jsonConvertSafe(expanded.hiringManagers),
                recruiters = ApiClient.jsonConvertSafe(expanded.recruiters),
                remoteWasDeleted = ApiClient.jsonConvertSafe(expanded.remoteWasDeleted),
                fieldMappings = ApiClient.jsonConvertSafe(expanded.fieldMappings),
                remoteData = ApiClient.jsonConvertSafe(expanded.remoteData)
            )
        }
    }
}

