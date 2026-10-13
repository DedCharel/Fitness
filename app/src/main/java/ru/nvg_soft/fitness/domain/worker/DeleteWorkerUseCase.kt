package ru.nvg_soft.fitness.domain.worker

class DeleteWorkerUseCase(
    private val repository: WorkerRepository
) {
    suspend operator fun invoke(workerId: Long){
       repository.deleteWorker(workerId)
    }
}