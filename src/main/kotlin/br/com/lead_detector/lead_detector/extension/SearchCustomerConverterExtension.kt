package br.com.lead_detector.lead_detector.extension

import br.com.lead_detector.lead_detector.controller.response.SearchCustomerResponse
import br.com.lead_detector.lead_detector.feign.response.Geometry
import br.com.lead_detector.lead_detector.model.SearchCustomerModel
import br.com.lead_detector.lead_detector.model.enum.LeadPriorityEnum
import br.com.lead_detector.lead_detector.model.enum.QualificationEnum
import kotlin.String

fun SearchCustomerModel.toSearchCustomerResponse(): SearchCustomerResponse{
    return SearchCustomerResponse(
        name = this.name,
        rating = this.rating,
        user_ratings_total =  this.user_ratings_total,
        formatted_address = this.formatted_address,
        geometry =  this.geometry,
        statusRating =  this.statusRating,
        qualification = this.qualification
    )
}