package part1.sec3


fun main() {
    val max = Constants.maxEmployeeCount
    println(max)
}


class Constants {
    companion object {
        const val maxEmployeeCount: Int = 100
    }
}
