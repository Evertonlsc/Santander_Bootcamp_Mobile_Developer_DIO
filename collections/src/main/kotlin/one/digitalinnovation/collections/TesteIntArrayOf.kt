package one.digitalinnovation.collections

fun main() {
    val values = intArrayOf(2, 3, 4, 10, 1, 7)
    values.forEach {
        println(it)
    }

    println("_________________________________________")
    values.sort()
    values.forEach {
        println(it)
    }

}
