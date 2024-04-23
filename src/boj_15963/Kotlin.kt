package boj_15963

fun main() {
    println(
        readln().split(" ").let {
            if (it[0] == it[1]) 1
            else 0
        }
    )
}