package br.com.lead_detector.lead_detector.service

import br.com.lead_detector.lead_detector.model.SearchCustomerModel

interface SearchCustomerService {
    fun getSearchCustomers(niche: String, location: String): List<SearchCustomerModel>
}
