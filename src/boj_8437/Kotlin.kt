package boj_8437

import java.math.BigInteger

fun main() {
    val a = readln().toBigInteger()
    val b = readln().toBigInteger()
    println((a + b)/BigInteger("2"))
    println((a - b)/BigInteger("2"))
}