package boj_7891

fun main() {
    for (i in 0 until readln().toInt()) {
        val a = readln().split(" ").map { it.toBigInteger() }
        println(a[0] + a[1])
    }
}