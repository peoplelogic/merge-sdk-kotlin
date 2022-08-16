/**
 * Merge Ticketing API
 *
 * The unified API for building rich integrations with multiple Ticketing platforms.
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

package dev.merge.client.ticketing.apis

import dev.merge.client.ticketing.models.Issue

import io.ktor.client.HttpClientConfig
import io.ktor.client.request.forms.formData
import io.ktor.client.engine.HttpClientEngine
import io.ktor.http.ParametersBuilder
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.serialization.jackson.jackson
import io.ktor.client.call.body

import com.fasterxml.jackson.databind.ObjectMapper

import dev.merge.client.shared.*

open class IssuesApi(
baseUrl: String = ApiClient.BASE_URL + "ticketing/v1",
httpClientEngine: HttpClientEngine? = null,
httpClientConfig: HttpClientConfig<*>.() -> Unit = {
    install(ContentNegotiation) {
        jackson()
    }
},
json: ObjectMapper = ApiClient.JSON_DEFAULT,
) : ApiClient(baseUrl, httpClientEngine, httpClientConfig, json) {

    data class IssuesListRequest (
        val accountToken: kotlin.String? = null,
        val cursor: kotlin.String? = null,
        val endDate: kotlin.String? = null,
        val endUserOrganizationName: kotlin.String? = null,
        val firstIncidentTimeAfter: java.time.OffsetDateTime? = null,
        val firstIncidentTimeBefore: java.time.OffsetDateTime? = null,
        val includeMuted: kotlin.String? = null,
        val integrationName: kotlin.String? = null,
        val lastIncidentTimeAfter: java.time.OffsetDateTime? = null,
        val lastIncidentTimeBefore: java.time.OffsetDateTime? = null,
        val pageSize: kotlin.Int? = null,
        val startDate: kotlin.String? = null,
        val status: kotlin.String? = null
    )

    data class IssuesRetrieveRequest (
        val id: java.util.UUID
    )

    /**
    * 
    * Gets issues.
     * @param accountToken  (optional)
     * @param cursor The pagination cursor value. (optional)
     * @param endDate If included, will only include issues whose most recent action occurred before this time (optional)
     * @param endUserOrganizationName  (optional)
     * @param firstIncidentTimeAfter If provided, will only return issues whose first incident time was after this datetime. (optional)
     * @param firstIncidentTimeBefore If provided, will only return issues whose first incident time was before this datetime. (optional)
     * @param includeMuted If True, will include muted issues (optional)
     * @param integrationName  (optional)
     * @param lastIncidentTimeAfter If provided, will only return issues whose first incident time was after this datetime. (optional)
     * @param lastIncidentTimeBefore If provided, will only return issues whose first incident time was before this datetime. (optional)
     * @param pageSize Number of results to return per page. (optional)
     * @param startDate If included, will only include issues whose most recent action occurred after this time (optional)
     * @param status  (optional)
     * @return PaginatedIssueList
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun issuesList(requestModel: IssuesApi.IssuesListRequest): MergePaginatedResponse<Issue> {

        val localVariableAuthNames = listOf<String>("bearerAuth")

        val localVariableBody = 
                io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
        requestModel.accountToken?.apply { localVariableQuery["account_token"] = listOf("$requestModel?.accountToken") }
        requestModel.cursor?.apply { localVariableQuery["cursor"] = listOf("$requestModel?.cursor") }
        requestModel.endDate?.apply { localVariableQuery["end_date"] = listOf("$requestModel?.endDate") }
        requestModel.endUserOrganizationName?.apply { localVariableQuery["end_user_organization_name"] = listOf("$requestModel?.endUserOrganizationName") }
        requestModel.firstIncidentTimeAfter?.apply { localVariableQuery["first_incident_time_after"] = listOf("$requestModel?.firstIncidentTimeAfter") }
        requestModel.firstIncidentTimeBefore?.apply { localVariableQuery["first_incident_time_before"] = listOf("$requestModel?.firstIncidentTimeBefore") }
        requestModel.includeMuted?.apply { localVariableQuery["include_muted"] = listOf("$requestModel?.includeMuted") }
        requestModel.integrationName?.apply { localVariableQuery["integration_name"] = listOf("$requestModel?.integrationName") }
        requestModel.lastIncidentTimeAfter?.apply { localVariableQuery["last_incident_time_after"] = listOf("$requestModel?.lastIncidentTimeAfter") }
        requestModel.lastIncidentTimeBefore?.apply { localVariableQuery["last_incident_time_before"] = listOf("$requestModel?.lastIncidentTimeBefore") }
        requestModel.pageSize?.apply { localVariableQuery["page_size"] = listOf("$requestModel?.pageSize") }
        requestModel.startDate?.apply { localVariableQuery["start_date"] = listOf("$requestModel?.startDate") }
        requestModel.status?.apply { localVariableQuery["status"] = listOf("$requestModel?.status") }

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
        RequestMethod.GET,
        "/issues",
        query = localVariableQuery,
        headers = localVariableHeaders
        )

        return request(
        localVariableConfig,
        localVariableBody,
        localVariableAuthNames
        ).body()
    }

    /**
    * 
    * Get a specific issue.
     * @param id  
     * @return Issue
    */
    @Suppress("UNCHECKED_CAST")
    open suspend fun issuesRetrieve(requestModel: IssuesApi.IssuesRetrieveRequest): Issue {

        val localVariableAuthNames = listOf<String>("bearerAuth")

        val localVariableBody = 
                io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
        RequestMethod.GET,
        "/issues/{id}".replace("{" + "id" + "}", "$requestModel.id"),
        query = localVariableQuery,
        headers = localVariableHeaders
        )

        return request(
        localVariableConfig,
        localVariableBody,
        localVariableAuthNames
        ).body()
    }

}
