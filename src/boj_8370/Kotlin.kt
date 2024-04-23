package boj_8370

fun main() {
    val a = readln().split(" ").map { it.toInt() }
    println((a[0] * a[1]) + (a[2] * a[3]))
}