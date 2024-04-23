package boj_27959

fun main() {
    val a = readln().split(" ").map { it.toInt() }
    if(100 * a[0] >= a[1])
        println("Yes")
    else
        println("No")
}