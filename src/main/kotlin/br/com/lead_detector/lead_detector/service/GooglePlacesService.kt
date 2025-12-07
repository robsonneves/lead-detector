package br.com.lead_detector.lead_detector.service

import br.com.lead_detector.lead_detector.feign.response.GooglePlacesResponse

interface GooglePlacesService {
    fun buscar(nicho: String, cidade: String): GooglePlacesResponse
}