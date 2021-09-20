package part1.sec2

//  scope function basics

fun with(list: List<Int>){
    val oddNumList = with(mutableListOf<Int>()) {
        for (i in list) {
            if (i % 2 == 1) this.add(i)
        }
        this.joinToString(separator = ",")
    }
    println(oddNumList)
}

fun run(list: List<Int>) {
    val oddNumList = mutableListOf<Int>().run {
        for (i in list) {
            if (i % 2 == 0) this.add(i)
        }
        this.joinToString(",")
    }
    println(oddNumList)
}

fun main() {
    val list: MutableList<Int> = mutableListOf()
    for(i in 1..100) {
        list.add(i)
    }
    with(list)
    run(list)
}

