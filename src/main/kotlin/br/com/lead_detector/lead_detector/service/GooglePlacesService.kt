package br.com.lead_detector.lead_detector.service

import br.com.lead_detector.lead_detector.feign.response.GooglePlacesResponse
import br.com.lead_detector.lead_detector.model.enum.FieldsEnum

interface GooglePlacesService {
    fun buscar(nicho: String, cidade: String): GooglePlacesResponse
    fun getDetailsClient(placeId: String, fields: FieldsEnum): Any
}