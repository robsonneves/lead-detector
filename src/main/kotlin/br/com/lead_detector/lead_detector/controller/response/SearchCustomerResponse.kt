package br.com.lead_detector.lead_detector.controller.response

import br.com.lead_detector.lead_detector.feign.response.Geometry
import br.com.lead_detector.lead_detector.model.enum.LeadPriorityEnum
import br.com.lead_detector.lead_detector.model.enum.QualificationEnum

data class SearchCustomerResponse(
    val placeId: String?,
    val name: String?,
    val rating: Double?,
    val user_ratings_total: Int?,
    val formatted_address: String?,
    val geometry: Geometry?,
    val statusRating: LeadPriorityEnum,
    val qualification: QualificationEnum
)
