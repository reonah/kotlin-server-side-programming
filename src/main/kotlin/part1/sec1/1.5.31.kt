package part1.sec1

// Map basics

fun map(){
    val immutableMap: Map<Int, String> = mapOf(1 to "a", 2 to "b", 3 to "c")
    val mutableMap: MutableMap<Int, String> = mutableMapOf(1 to "aa", 2 to "bb")
    mutableMap[4] = "dd"

    println(immutableMap)
    println(mutableMap)
    println(mutableMap[4])
}

fun main() {
    map()
}
