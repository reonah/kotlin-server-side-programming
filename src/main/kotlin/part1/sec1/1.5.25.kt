package part1.sec1

// interface basics

interface Greeter{
    fun hello(greet: String)
}

class GreeterImpl: Greeter{
    override fun hello(greet: String) {
        println(greet)
    }
}

fun main() {
    GreeterImpl().hello(greet="hey yo")
}
