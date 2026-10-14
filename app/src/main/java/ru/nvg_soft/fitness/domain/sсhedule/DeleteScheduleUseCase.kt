package ru.nvg_soft.fitness.domain.sсhedule

import javax.inject.Inject

class DeleteScheduleUseCase @Inject constructor(
    private val repository: ScheduleRepository
) {
    suspend operator fun invoke(scheduleId: Long){
        repository.deleteSchedule(scheduleId)
    }
}