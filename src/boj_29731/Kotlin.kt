package boj_29731

fun main() {
    val a: Array<String> = arrayOf(
        "Never gonna give you up",
        "Never gonna let you down",
        "Never gonna run around and desert you",
        "Never gonna make you cry",
        "Never gonna say goodbye",
        "Never gonna tell a lie and hurt you",
        "Never gonna stop"
    )

    val b = (0 until readln().toInt()).any {
        !a.contains(readln().trim())
    }
    println(if (b) "Yes" else "No")
}