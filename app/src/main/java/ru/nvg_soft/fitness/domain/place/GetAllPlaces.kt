package ru.nvg_soft.fitness.domain.place

import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetAllPlaces @Inject constructor(
    private val repository: PlaceRepository
) {
    operator fun invoke(): Flow<List<Place>>{
        return repository.getAllPlaces()
    }
}