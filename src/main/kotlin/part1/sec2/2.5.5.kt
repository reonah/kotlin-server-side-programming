package part1.sec2

//  functional programming basics

fun functionalPG(){
    val sum: (Int, Int) -> Int = {num1: Int, num2: Int -> num1 + num2}
    val mul: (Int, Int) -> Int = {num1: Int, num2: Int -> num1 * num2}
    val squ: (Int) -> Int = {it * it}
    val squ2: (Int) -> Int = fun(num: Int): Int {return num * num}
    println(sum(2,3))
    println(mul(2,3))
    println(squ(3))
    println(squ2(4))
}

fun main() {
    functionalPG()
}
