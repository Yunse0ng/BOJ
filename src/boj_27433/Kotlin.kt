package boj_27433

import java.math.BigInteger

fun main() {
    var sum: BigInteger = 1.toBigInteger()

    for (i in 1..readln().toInt())
        sum *= i.toBigInteger()
    println(sum)
}