package br.com.lead_detector.lead_detector.feign.response

data class GooglePlacesResponse(
    val results: List<PlaceResult>,
    val status: String
)

data class PlaceResult(
    val name: String?,
    val rating: Double?,
    val user_ratings_total: Int?,
    val formatted_address: String?,
    val geometry: Geometry?
)

data class Geometry(val location: Location)
data class Location(val lat: Double, val lng: Double)