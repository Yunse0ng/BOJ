package boj_28691

fun main() {
    val a = readln()
    if (a == "M")
        println("MatKor")
    else if (a == "W")
        println("WiCys")
    else if (a == "C")
        println("CyKor")
    else if (a == "A")
        println("AlKor")
    else if (a == "$")
        println("$" + "clear")
}