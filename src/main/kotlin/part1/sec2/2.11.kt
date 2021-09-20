package part1.sec2

import kotlinx.coroutines.*

fun main() {
    // coroutine builder
    GlobalScope.launch {
        printName("gri")

    }

    runBlocking {
        launch {
            delay(100L)
            println("CCC")
        }
        val result1 = async {
            sum(end = 10, delay = 100L)
        }
        val result2 = async {
            sum(end = 5, delay = 1000L)
        }

        println("sum=${result1.await() + result2.await()}")
        println("Im")
    }

    println("My name is ")

    // thread 終了を防ぐための sleep
    Thread.sleep(5000L)

    println("Have fun")
}

suspend fun printName(name: String){
    delay(1000L)
    println(name)
}

suspend fun sum(end: Int, delay: Long): Int{
    delay(delay)

    var sum = 0
    for (i in 1..end){
        sum += i
    }
    return sum
}
