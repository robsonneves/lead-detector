package br.com.lead_detector.lead_detector.service.impl

import br.com.lead_detector.lead_detector.model.SearchCustomerModel
import br.com.lead_detector.lead_detector.service.SearchCustomerService

class SearchCustomerServiceImpl(): SearchCustomerService {


    override fun getSearchCustomers(niche: String, location: String): List<SearchCustomerModel> {
    }
}