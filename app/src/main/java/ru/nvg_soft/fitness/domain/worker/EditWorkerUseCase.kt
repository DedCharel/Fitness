package ru.nvg_soft.fitness.domain.worker

class EditWorkerUseCase (
    private val repository: WorkerRepository
) {
    suspend operator fun invoke(worker: Worker){
        repository.editWorker(worker)
    }
}