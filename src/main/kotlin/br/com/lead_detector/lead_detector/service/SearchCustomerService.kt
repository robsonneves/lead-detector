package br.com.lead_detector.lead_detector.service

import br.com.lead_detector.lead_detector.model.SearchCustomerModel
import br.com.lead_detector.lead_detector.model.enum.FieldsEnum

interface SearchCustomerService {
    fun getSearchCustomers(niche: String, location: String): List<SearchCustomerModel>
    fun getDetailsCustomer(placeId: String, fields: FieldsEnum): Any
}
