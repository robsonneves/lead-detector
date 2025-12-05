package br.com.lead_detector.lead_detector.service.impl

import br.com.lead_detector.lead_detector.config.GooglePlacesProperties
import br.com.lead_detector.lead_detector.feign.GooglePlacesClient
import br.com.lead_detector.lead_detector.feign.response.GooglePlacesResponse
import org.springframework.stereotype.Service

@Service
class GooglePlacesService(
    private val googlePlacesClient: GooglePlacesClient,
    private val properties: GooglePlacesProperties
) {
    fun buscar(nicho: String, cidade: String): GooglePlacesResponse {
        val query = "$nicho em $cidade"
        return googlePlacesClient.searchPlaces(query, properties.apiKey)
    }
}
