package part1.sec3

import AnimalJava

fun main() {
    val dog = AnimalImpl()
    dog.cry()
}


class AnimalImpl: AnimalJava {
    override fun cry() {
        println("Hey")
    }
}
