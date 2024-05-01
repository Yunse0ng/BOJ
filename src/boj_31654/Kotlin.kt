package boj_31654

fun main() {
    val a = readln().split(" ").map { it.toLong() }
    println(
        if (a[0] + a[1] == a[2]) "correct!" else "wrong!"
    )
}