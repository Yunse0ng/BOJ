package boj_5522

fun main() {
    var sum = 0

    for ( i in 1..5) {
        val a: Int = readln().toInt()
        sum += a
    }
    println(sum)
}