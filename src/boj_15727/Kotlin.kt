package boj_15727

fun main() {
    val a: Int = readln().toInt()

    if (a % 5 != 0)
        println((a / 5) + 1)
    else
        println(a / 5)
}