package boj_5341

fun main() {
    while (true) {
        val a = readln().toInt()
        var sum = 0
        if (a == 0) break
        for (i in 1..a)
            sum += i
        println(sum)
    }
}