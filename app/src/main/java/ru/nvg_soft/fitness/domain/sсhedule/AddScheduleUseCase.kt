package ru.nvg_soft.fitness.domain.sсhedule

import javax.inject.Inject

class AddScheduleUseCase @Inject constructor(
    private val repository: ScheduleRepository
) {
    suspend operator fun invoke(schedule: Schedule){
        repository.addSchedule(schedule)
    }
}