package boj_27434

import java.io.*
import java.math.BigInteger

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = Integer.valueOf(br.readLine())

    println(fact(1, n))
}

fun fact(a: Int, n: Int): BigInteger {
    var sum = BigInteger.valueOf(a.toLong())

    if (a < n) {
        val b = (a + n) / 2
        sum = fact(a, b).multiply(fact(b + 1, n))
    }
    return sum
}