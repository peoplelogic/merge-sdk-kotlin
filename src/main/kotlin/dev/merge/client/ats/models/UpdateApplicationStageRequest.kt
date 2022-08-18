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
import com.fasterxml.jackson.databind.JsonNode
import dev.merge.client.shared.ApiClient

/**
 * 
 *
 * @param jobInterviewStage The interview stage to move the application to.
 * @param remoteUserId 
 */

data class UpdateApplicationStageRequest (

    /* The interview stage to move the application to. */
    @field:JsonProperty("job_interview_stage")
    val jobInterviewStage: java.util.UUID? = null,

    @field:JsonProperty("remote_user_id")
    val remoteUserId: kotlin.String? = null

) {

    data class Expanded(
        @field:JsonProperty("job_interview_stage")
        val jobInterviewStage: JsonNode?,

        @field:JsonProperty("remote_user_id")
        val remoteUserId: JsonNode?

    )


    companion object {
        fun normalize(expanded: UpdateApplicationStageRequest.Expanded): UpdateApplicationStageRequest {
            return UpdateApplicationStageRequest(
                jobInterviewStage = ApiClient.jsonConvertSafe(expanded.jobInterviewStage),
                remoteUserId = ApiClient.jsonConvertSafe(expanded.remoteUserId)
            )
        }
    }
}

