package ru.nvg_soft.fitness.domain.sсhedule

import kotlinx.coroutines.flow.Flow
import ru.nvg_soft.fitness.domain.client.Client
import ru.nvg_soft.fitness.domain.worker.Worker

interface ScheduleRepository {

    fun getAllSchedules(date: Long): Flow<List<Schedule>>

    fun getSchedulesByWorker(worker: Worker, date: Long): Flow<List<Schedule>>

    fun getSchedulesByClient(client: Client, date: Long): Flow<List<Schedule>>

    suspend fun addSchedule(schedule: Schedule)

    suspend fun deleteSchedule(scheduleId: Long)

    suspend fun editSchedule(schedule: Schedule)
}