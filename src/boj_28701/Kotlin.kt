package boj_28701

fun main() {
    val a = readln().toInt()
    val sum = (1..a).sum()
    println(sum)
    println(sum*sum)
    println((1..a).sumOf { it * it * it })
}