package br.com.lead_detector.lead_detector.extension

import br.com.lead_detector.lead_detector.controller.response.SearchCustomerResponse
import br.com.lead_detector.lead_detector.model.SearchCustomerModel

fun SearchCustomerModel.toSearchCustomerResponse(): SearchCustomerResponse{
    return SearchCustomerResponse(
        placeId = this.placeId,
        name = this.name,
        rating = this.rating,
        user_ratings_total =  this.user_ratings_total,
        formatted_address = this.formatted_address,
        geometry =  this.geometry,
        statusRating =  this.statusRating,
        qualification = this.qualification
    )
}