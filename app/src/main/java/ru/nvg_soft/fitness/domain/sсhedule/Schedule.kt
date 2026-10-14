package ru.nvg_soft.fitness.domain.sсhedule

import ru.nvg_soft.fitness.domain.client.Client
import ru.nvg_soft.fitness.domain.place.Place
import ru.nvg_soft.fitness.domain.worker.Worker

data class Schedule(
    val id: Long,
    val date:Long,
    val time: Long,
    val worker: Worker,
    val clients: List<Client>,
    val place: Place,
    val duration: Long,
    val comment: String
)
