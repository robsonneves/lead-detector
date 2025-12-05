package br.com.lead_detector.lead_detector.feign

import br.com.lead_detector.lead_detector.feign.response.GooglePlacesResponse
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam

@FeignClient(
    name = "googlePlaces",
    url = "\${google.places.url}"
)
interface GooglePlacesClient {

    @GetMapping("/textsearch/json")
    fun searchPlaces(
        @RequestParam query: String,
        @RequestParam("key") apiKey: String
    ): GooglePlacesResponse
}
