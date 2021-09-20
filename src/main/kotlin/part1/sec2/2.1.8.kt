package part1.sec2

// if/when basics

fun printOddEvenIf(num: Int) {
    var text = if (num % 2 == 1) "odd" else "even"
    println(text)
}

fun printOddEvenWhen(num: Int) {
    val text = when (num % 2) {
        0 -> {
            "even"
        }
        1 -> {
            "odd"
        }
        else -> {
            "undefined"
        }
    }
    println(text)
}

fun main () {
    val value: Int = 4
    printOddEvenIf(value)
    printOddEvenWhen(value)
}
