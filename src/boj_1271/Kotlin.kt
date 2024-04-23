package boj_1271

import java.util.*

fun main() = with(Scanner(System.`in`)) {
        val a = nextBigInteger()
        val b = nextBigInteger()

        println(a / b)
        println(a % b)
}
