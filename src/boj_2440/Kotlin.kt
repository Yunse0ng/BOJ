package boj_2440

fun main() {
    val a = readln().toInt()

    for (i in a downTo 1) {
        for (j in i downTo 1)
            print("*")
        println()
    }
}