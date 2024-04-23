package boj_26766

fun main() {
    for (i in 0 until readln().toInt())
        printHeart()
}

fun printHeart() {
    print(  " @@@   @@@ \n" +
            "@   @ @   @\n" +
            "@    @    @\n" +
            "@         @\n" +
            " @       @ \n" +
            "  @     @  \n" +
            "   @   @   \n" +
            "    @ @    \n" +
            "     @     \n")
}