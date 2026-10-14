package ru.nvg_soft.fitness.domain.place

import javax.inject.Inject

class AddPlaceUseCase @Inject constructor(
    private val repository: PlaceRepository
) {
    suspend operator fun invoke(place: Place){
        repository.addPlace(place)
    }
}