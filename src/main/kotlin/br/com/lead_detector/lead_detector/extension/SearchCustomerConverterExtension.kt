package br.com.lead_detector.lead_detector.extension

import br.com.lead_detector.lead_detector.controller.response.SearchCustomerResponse
import br.com.lead_detector.lead_detector.model.SearchCustomerModel

fun SearchCustomerModel.toSearchCustomerResponse(): SearchCustomerResponse{
    return SearchCustomerResponse(
        name = this.name
    )
}