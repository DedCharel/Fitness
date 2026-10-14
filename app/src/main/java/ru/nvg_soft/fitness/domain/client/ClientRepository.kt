package ru.nvg_soft.fitness.domain.client

import kotlinx.coroutines.flow.Flow

interface ClientRepository {

    fun getAllClients(): Flow<List<Client>>

    suspend fun getClient(clientId: Long): Client

    suspend fun addClient(client: Client)

    suspend fun deleteClient(clientId: Long)

    suspend fun editClient(client: Client)
}