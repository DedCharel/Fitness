package ru.nvg_soft.fitness.domain.worker

class AddWorkerUseCase(
    private val repository: WorkerRepository
) {
    suspend operator fun invoke(worker: Worker){
        repository.addWorker(worker)
    }
}