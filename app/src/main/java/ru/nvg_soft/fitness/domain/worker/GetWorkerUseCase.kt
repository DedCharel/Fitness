package ru.nvg_soft.fitness.domain.worker

class GetWorkerUseCase (
    private val repository: WorkerRepository
) {
    suspend operator fun invoke(workerId: Long): Worker{
       return repository.getWorker(workerId)
    }
}