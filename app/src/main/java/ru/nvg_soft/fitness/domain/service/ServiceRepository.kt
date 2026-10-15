package ru.nvg_soft.fitness.domain.service

import kotlinx.coroutines.flow.Flow

interface ServiceRepository {

    fun getAllServices(): Flow<List<Service>>

    suspend fun addService(service: Service)

    suspend fun deleteService(serviceId: Long)

    suspend fun editService(service: Service)

    suspend fun getService(serviceId: Long): Service
}