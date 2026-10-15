package ru.nvg_soft.fitness.domain.service

import javax.inject.Inject

class EditServiceUseCase @Inject constructor(
    private val repository: ServiceRepository
) {
    suspend operator fun invoke(service: Service){
        repository.editService(service)
    }
}