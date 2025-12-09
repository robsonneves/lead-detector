package br.com.lead_detector.lead_detector.feign.response

data class PlaceDetailsResponse(
    val result: PlaceDetailsResult?,
    val status: String
)

data class PlaceDetailsResult(
    val name: String?,
    val formatted_phone_number: String?,
    val international_phone_number: String?,
    val website: String?
)