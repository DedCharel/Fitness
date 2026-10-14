package ru.nvg_soft.fitness.domain.client

import javax.inject.Inject

class GetClientUseCase @Inject constructor(
    private val repository: ClientRepository
) {
    suspend operator fun invoke(clientId: Long): Client{
        return repository.getClient(clientId)
    }
}