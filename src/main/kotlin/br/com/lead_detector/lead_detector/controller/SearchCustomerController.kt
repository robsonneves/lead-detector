package br.com.lead_detector.lead_detector.controller

import br.com.lead_detector.lead_detector.controller.response.SearchCustomerResponse
import br.com.lead_detector.lead_detector.extension.toSearchCustomerResponse
import br.com.lead_detector.lead_detector.model.enum.FieldsEnum
import br.com.lead_detector.lead_detector.service.SearchCustomerService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("search")
class SearchCustomerController(
    private val searchService: SearchCustomerService
) {

    @GetMapping
    fun getSearchCustomers(@RequestParam niche: String, @RequestParam location: String): List<SearchCustomerResponse> {
        return searchService.getSearchCustomers(niche, location).map { it.toSearchCustomerResponse() }
    }

    @GetMapping("/details")
    fun getDetailsCustomer(@RequestParam placeId: String, @RequestParam fields: FieldsEnum): Any {
        return searchService.getDetailsCustomer(placeId, fields)
    }
}