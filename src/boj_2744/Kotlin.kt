package boj_2744

fun main() {
    val str = readln()
    var result = ""

    for (x in str.toCharArray()) {
        result +=
            if (Character.isLowerCase(x)) x.uppercaseChar()
            else x.lowercaseChar()
    }
    println(result)
}
