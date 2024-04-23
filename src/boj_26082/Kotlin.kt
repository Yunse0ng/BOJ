package boj_26082

fun main() {
    val a = readln().split(" ").map { it.toInt() }

    println(
        ((a[1] / a[0]) * 3) * a[2]
    )
}