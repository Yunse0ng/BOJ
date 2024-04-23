package boj_26545

fun main() {
    var sum = 0
    for (i in 0 until readln().toInt())
        sum += readln().toInt()
    println(sum)
}