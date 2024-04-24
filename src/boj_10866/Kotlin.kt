package boj_10866

import java.util.*

fun main() {
    val dq = ArrayDeque<Int>()

    repeat(readln().toInt()) {
        val a = StringTokenizer(readln(), " ")
        when (a.nextToken().toString()) {
            "push_front" -> dq.addFirst(a.nextToken().toInt())
            "push_back" -> dq.addLast(a.nextToken().toInt())
            "pop_front" -> println(if (dq.isEmpty()) "-1" else dq.removeFirst())
            "pop_back" -> println(if (dq.isEmpty()) "-1" else dq.removeLast())
            "size" -> println(dq.size)
            "empty" -> println(if (dq.isEmpty()) "1" else "0")
            "front" -> println(if (dq.isEmpty()) "-1" else dq.first())
            "back" -> println(if (dq.isEmpty()) "-1" else dq.last())
        }
    }
}