package boj_16170

import java.time.LocalDate
import java.time.format.DateTimeFormatter

fun main() {
    println(
        LocalDate.now()
            .format(DateTimeFormatter.ISO_DATE)
            .split("-")
            .joinToString("\n")
    )
}