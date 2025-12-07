package br.com.lead_detector.lead_detector.service.impl

import br.com.lead_detector.lead_detector.feign.response.PlaceResult
import br.com.lead_detector.lead_detector.model.SearchCustomerModel
import br.com.lead_detector.lead_detector.model.enum.LeadPriorityEnum
import br.com.lead_detector.lead_detector.model.enum.QualificationEnum
import br.com.lead_detector.lead_detector.service.GooglePlacesService
import br.com.lead_detector.lead_detector.service.SearchCustomerService
import org.springframework.stereotype.Service

@Service
class SearchCustomerServiceImpl(
    private val googlePlacesService: GooglePlacesService
): SearchCustomerService {

    override fun getSearchCustomers(niche: String, location: String): List<SearchCustomerModel> {

        val listGoogleResult = googlePlacesService.buscar(niche, location)
        return sortPriority(listGoogleResult.results)
    }

    private fun sortPriority(listPlaceResult: List<PlaceResult>): List<SearchCustomerModel>{

        var listSearchCustomerModel = ArrayList<SearchCustomerModel>();

        listPlaceResult.forEach { place ->
            val rating = place.rating ?: 0.0
            val totalRatings = place.user_ratings_total ?: 0

            listSearchCustomerModel.add(
                SearchCustomerModel(
                    name = place.name,
                    rating = rating,
                    user_ratings_total = totalRatings,
                    formatted_address = place.formatted_address,
                    geometry = place.geometry,
                    statusRating = statusRating(rating, totalRatings),
                    qualification = createQualification(totalRatings)
                )
            )
        }

        // melhores leads ALTO / QUENTE
        return listSearchCustomerModel
    }

    private fun statusRating(rating: Double, totalRatings: Int): LeadPriorityEnum {
        return when {
            rating < 3.5 && totalRatings >= 20 -> LeadPriorityEnum.ALTA
            (rating >= 3.5 && rating < 4.2) || (totalRatings >= 10 && totalRatings < 20) -> LeadPriorityEnum.MEDIA
            else -> LeadPriorityEnum.BAIXA
        }
    }

    private fun createQualification(totalRatings: Int): QualificationEnum {
        val totalRatings = totalRatings
        return when {
            totalRatings >= 50 -> QualificationEnum.QUENTE
            totalRatings >= 10 -> QualificationEnum.MORNO
            else -> QualificationEnum.FRIO
        }
    }
}