package ru.nvg_soft.fitness.domain.place

import javax.inject.Inject

class EditPlaceUseCase @Inject constructor(
    private val repository: PlaceRepository
) {
    suspend operator fun invoke(place: Place){
        repository.editPlace(place)
    }
}