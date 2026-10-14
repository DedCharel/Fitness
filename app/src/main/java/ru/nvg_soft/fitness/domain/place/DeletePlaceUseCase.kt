package ru.nvg_soft.fitness.domain.place

import javax.inject.Inject

class DeletePlaceUseCase @Inject constructor(
    private val repository: PlaceRepository
) {
    suspend operator fun invoke(placeId: Long){
        repository.deletePlace(placeId)
    }
}