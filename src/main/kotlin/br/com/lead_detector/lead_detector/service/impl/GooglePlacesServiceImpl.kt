package br.com.lead_detector.lead_detector.service.impl

import br.com.lead_detector.lead_detector.config.GooglePlacesProperties
import br.com.lead_detector.lead_detector.feign.GooglePlacesClient
import br.com.lead_detector.lead_detector.feign.response.GooglePlacesResponse
import br.com.lead_detector.lead_detector.service.GooglePlacesService
import org.springframework.stereotype.Service

@Service
class GooglePlacesServiceImpl(
    private val googlePlacesClient: GooglePlacesClient,
    private val properties: GooglePlacesProperties
): GooglePlacesService {

    override fun buscar(nicho: String, cidade: String): GooglePlacesResponse {
        val query = "$nicho em $cidade"
        return googlePlacesClient.searchPlaces(query, properties.apiKey)
    }

    override fun getDetailsClient(placeId: String, fields: String): Any {
        return googlePlacesClient.getDetailsClient(placeId, fields, properties.apiKey)
    }
}
