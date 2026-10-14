package ru.nvg_soft.fitness.domain.place

import javax.inject.Inject

class GetPlaceUseCase @Inject constructor(
    private val repository: PlaceRepository
) {
    suspend operator fun invoke(placeId: Long): Place {
        return repository.getPlace(placeId)
    }
}