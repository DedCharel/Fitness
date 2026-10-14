package ru.nvg_soft.fitness.domain.sсhedule

import kotlinx.coroutines.flow.Flow
import ru.nvg_soft.fitness.domain.worker.Worker
import javax.inject.Inject

class GetSchedulesByWorkerUseCase @Inject constructor(
    private val repository: ScheduleRepository
) {
    operator fun invoke(worker: Worker, date:Long): Flow<List<Schedule>>{
        return repository.getSchedulesByWorker(worker,date)
    }
}