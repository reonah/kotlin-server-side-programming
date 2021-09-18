package part1.sec1

// Set basics

fun set(){
    val immutableSet: Set<String> = setOf("a", "b", "c")
    val mutableSet: MutableSet<String> = mutableSetOf("aa", "bb")
    mutableSet.add("ccc")
    println(immutableSet)
    println(mutableSet)
}

fun main() {
    set()
}
