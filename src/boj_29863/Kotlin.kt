package boj_29863

fun main() {
    val a = readln().toInt()
    val b = readln().toInt()
    println(
        if (a in 20..23)
                "${24 - a + b}"
        else "${b - a}"
    )
}