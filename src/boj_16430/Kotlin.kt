package boj_16430

fun main() {
    println(
        readln().split(" ").map { it.toInt() }
            .let { "${it[1] - it[0]} ${it[1]}" }
    )
}