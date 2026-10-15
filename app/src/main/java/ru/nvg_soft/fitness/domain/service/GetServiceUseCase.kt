package ru.nvg_soft.fitness.domain.service

import javax.inject.Inject

class GetServiceUseCase @Inject constructor(
    private val repository: ServiceRepository
) {
    suspend operator fun invoke(serviceId: Long): Service{
        return repository.getService(serviceId)
    }
}