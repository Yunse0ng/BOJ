package boj_14928

fun main() {
    val a: String = readln()
    var remain: Long = 0

    for (i in 0 until a.length) {
        remain = (remain * 10 + a[i].code.toLong() - '0'.code.toLong()) % 20000303
    }
    println(remain)
}