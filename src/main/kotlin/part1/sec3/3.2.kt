package part1.sec3

import java.time.LocalDateTime
import java.util.*

data class Time(val time: LocalDateTime)

fun main() {
    val uuid: UUID = UUID.randomUUID()
    println(uuid.toString())
    val now = Time(LocalDateTime.now())
    println(now.time)
}

