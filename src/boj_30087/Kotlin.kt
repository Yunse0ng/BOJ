package boj_30087

fun main() {
    repeat(readln().toInt()) {
        val a = readln()
        when (a) {
            "Algorithm" -> println("204")
            "DataAnalysis" -> println("207")
            "ArtificialIntelligence" -> println("302")
            "CyberSecurity" -> println("B101")
            "Network" -> println("303")
            "Startup" -> println("501")
            "TestStrategy" -> println("105")
        }
    }
}