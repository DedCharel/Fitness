package ru.nvg_soft.fitness.domain.client

import javax.inject.Inject

class DeleteClientUseCase @Inject constructor(
    private val repository: ClientRepository
) {
    suspend operator fun invoke(clientId: Long){
        repository.deleteClient(clientId)
    }
}