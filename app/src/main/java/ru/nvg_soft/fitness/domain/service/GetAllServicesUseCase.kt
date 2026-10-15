package ru.nvg_soft.fitness.domain.service

import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetAllServicesUseCase @Inject constructor(
    private val repository: ServiceRepository
) {
    operator fun invoke(): Flow<List<Service>>{
        return repository.getAllServices()
    }
}