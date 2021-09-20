package part1.sec2

//  higher-order function basics

fun highOrderFunc(num1: Int, num2: Int, func: (Int, Int)-> Int){
    println(func(num1, num2))
}

fun main() {
    val sum: (Int, Int) -> Int = fun (num1: Int, num2: Int) : Int {return num1 + num2}
    val mul: (Int, Int) -> Int = fun (num1: Int, num2: Int) : Int {return num1 * num2}

    highOrderFunc(num1 = 3, num2 = 4, func = sum)
    highOrderFunc(num1 = 3, num2 = 4, func = mul)

}
