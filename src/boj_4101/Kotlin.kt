package boj_4101

import java.io.*
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    while (true) {
        val st = StringTokenizer(readLine())
        val a = st.nextToken().toInt()
        val b = st.nextToken().toInt()

        if (a == 0 && b == 0) break
        if (a > b) println("Yes")
        else println("No")
    }
}