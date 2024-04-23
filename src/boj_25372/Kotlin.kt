package boj_25372

fun main() {
    for (i in 0 until readln().toInt()) {
        val a: String = readln()
        if (a.length in 6..9)
            println("yes")
        else
            println("no")
    }
}