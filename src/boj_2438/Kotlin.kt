package boj_2438

import java.util.*

fun main() = with(Scanner(System.`in`)) {
    val a = nextInt()

    for (i in 1..a) {
        for (j in 1..i) {
            print("*")
        }
        println()
    }
}