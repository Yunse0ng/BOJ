package boj_3733

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val sb = StringBuilder()
    while (scanner.hasNext()) {
        val a = scanner.nextInt()
        val b = scanner.nextInt()
        sb.append(b / (a + 1)).append('\n')
    }
    println(sb)
}