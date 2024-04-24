package boj_29699

fun main() {
    val a = "WelcomeToSMUPC"
    val b = readln().toInt()
    if ((b % 14) == 0)
        println("C")
    else
        print(a[(b % 14) -1])
}