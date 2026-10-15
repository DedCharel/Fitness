package ru.nvg_soft.fitness.domain.service

import javax.inject.Inject

class AddServiceUseCase @Inject constructor(
    private val repository: ServiceRepository
) {
    suspend operator fun invoke(service: Service){
        repository.addService(service)
    }
}