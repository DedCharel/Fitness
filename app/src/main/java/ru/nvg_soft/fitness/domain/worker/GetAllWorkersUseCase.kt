package ru.nvg_soft.fitness.domain.worker

import kotlinx.coroutines.flow.Flow

class GetAllWorkersUseCase (
    private val repository: WorkerRepository
) {
    operator fun invoke(): Flow<List<Worker>>{
        return repository.getAllWorkers()
    }
}