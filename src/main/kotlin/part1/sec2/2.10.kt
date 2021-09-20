package part1.sec2

//  scope function basics


fun <T> forEachFunc(list: List<T>) : MutableList<String> {
    var newList: MutableList<String> = mutableListOf<String>()
    list.forEach {
            it ->
        println(it)
        newList.add(it.toString() + it.toString())
    }
    println(newList)
    return newList
}

fun main() {
    val intList: MutableList<Int> = mutableListOf()
    for (i in 1..10) {
        intList.add(i)
    }
    val stringList: MutableList<String> = mutableListOf("a", "b", "c")
    forEachFunc<Int>(list=intList)
    forEachFunc<String>(list=stringList)




}

