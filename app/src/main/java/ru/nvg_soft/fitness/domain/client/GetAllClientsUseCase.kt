package ru.nvg_soft.fitness.domain.client

import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetAllClientsUseCase @Inject constructor(
    private val repository: ClientRepository
) {
    operator fun invoke(): Flow<List<Client>>{
        return repository.getAllClients()
    }
}