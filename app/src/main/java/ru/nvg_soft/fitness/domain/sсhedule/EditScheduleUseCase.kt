package ru.nvg_soft.fitness.domain.sсhedule

import javax.inject.Inject

class EditScheduleUseCase @Inject constructor(
    private val repository: ScheduleRepository
) {
    suspend operator fun invoke(schedule: Schedule){
        repository.editSchedule(schedule)
    }
}