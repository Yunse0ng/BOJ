package boj_2439

fun main() {
    val a: Int = readln().toInt()

    for (i in 1..a) {
        for (j in a downTo 1){
            if (i >= j) print("*")
            else print(" ")
        }
        println()
    }
}