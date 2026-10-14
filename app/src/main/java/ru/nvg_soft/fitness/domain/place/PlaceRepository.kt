package ru.nvg_soft.fitness.domain.place

import kotlinx.coroutines.flow.Flow

interface PlaceRepository {

    fun getAllPlaces(): Flow<List<Place>>

    suspend fun getPlace(placeId: Long): Place

    suspend fun addPlace(place: Place)

    suspend fun editPlace(place: Place)

    suspend fun deletePlace(placeId: Long)
}