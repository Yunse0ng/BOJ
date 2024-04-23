package boj_6840

fun main() {
    val arr = IntArray(3)

    for (i in arr.indices)
        arr[i] = readln().toInt()

    arr.sort()

    println(arr[1])
}