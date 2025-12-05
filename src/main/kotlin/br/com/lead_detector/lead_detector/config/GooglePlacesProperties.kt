package br.com.lead_detector.lead_detector.config

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component

@ConfigurationProperties(prefix = "google.places")
@Component
data class GooglePlacesProperties(
    var url: String = "",
    var apiKey: String = ""
)
