package boj_27294

fun main() {
    val a = readln().split(" ").map { it.toInt() }

    if (a[0] in 12..16) {
        if (a[1] == 0)
            println("320")
        else
            println("280")
    } else
        println("280")
}