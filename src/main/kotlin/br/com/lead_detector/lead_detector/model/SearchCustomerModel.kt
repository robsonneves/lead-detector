package br.com.lead_detector.lead_detector.model

import br.com.lead_detector.lead_detector.feign.response.Geometry
import br.com.lead_detector.lead_detector.model.enum.LeadPriorityEnum
import br.com.lead_detector.lead_detector.model.enum.QualificationEnum

data class SearchCustomerModel (
    var name: String?,
    var rating: Double?,
    var user_ratings_total: Int?,
    var formatted_address: String?,
    var geometry: Geometry?,
    var statusRating: LeadPriorityEnum,
    var qualification: QualificationEnum
)
