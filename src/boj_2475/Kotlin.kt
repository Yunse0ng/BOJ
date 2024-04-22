package boj_2475

import java.util.*

fun main() = with(Scanner(System.`in`)) {
    var sum = 0

    for (i in 0..4) {
        val num = nextInt()
        sum += num * num
    }

    println(sum % 10)
}
