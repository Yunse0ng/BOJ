package boj_29699

fun main() {
    val a = "WelcomeToSMUPC"
    val b = readln().toInt()
    println(if (b % 14 == 0) "C" else a[(b % 14) - 1])
}