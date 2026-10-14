package ru.nvg_soft.fitness.domain.client

import javax.inject.Inject

class EditClientUseCase @Inject constructor(
    private val repository: ClientRepository
) {
    suspend operator fun invoke(client: Client){
        repository.editClient(client)
    }
}