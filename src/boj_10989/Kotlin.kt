package boj_10989

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()
    val a = IntArray(10001)

    for (i in 0 until readln().toInt())
        a[br.readLine().toInt()]++
    br.close()
    for (i in a.indices)
        bw.write("$i\n".repeat(a[i]))
    bw.close()
}