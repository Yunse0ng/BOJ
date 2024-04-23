package boj_15232

fun main() {
    val a: Int = readln().toInt()
    val b: Int = readln().toInt()

    for (i in 0 until a) {
        for (j in 0 until b)
            print("*")
        println()
    }
}