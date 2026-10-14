package ru.nvg_soft.fitness.domain.worker

import javax.inject.Inject

class DeleteWorkerUseCase @Inject constructor(
    private val repository: WorkerRepository
) {
    suspend operator fun invoke(workerId: Long){
       repository.deleteWorker(workerId)
    }
}