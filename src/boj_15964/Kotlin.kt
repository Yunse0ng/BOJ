package boj_15964

import java.math.BigInteger
import java.util.*

fun main() = with(Scanner(System.`in`)) {
    val a: BigInteger = nextBigInteger()
    val b: BigInteger = nextBigInteger()

    print((a + b) * (a - b))
}