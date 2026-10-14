package ru.nvg_soft.fitness.domain.sсhedule

import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetAllSchedulesUseCase @Inject constructor(
    private val repository: ScheduleRepository
) {
    operator fun invoke(date:Long): Flow<List<Schedule>>{
        return repository.getAllSchedules(date)
    }
}