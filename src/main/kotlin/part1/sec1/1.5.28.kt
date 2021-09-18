package part1.sec1

// List basics

fun list(){
    val immutableIntList: List<Int> = listOf<Int>(1,2,3)
    val mutableIntList: MutableList<Int> = mutableListOf<Int>(1,2,3)
    mutableIntList.add(5)

    println(immutableIntList)
    println(mutableIntList)
}

fun main() {
    list()
}
