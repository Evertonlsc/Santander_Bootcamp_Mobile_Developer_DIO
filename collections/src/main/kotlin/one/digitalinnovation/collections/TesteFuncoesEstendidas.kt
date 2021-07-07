package one.digitalinnovation.collections

fun main() {
    val salarios = arrayOf(
        "2000".toBigDecimal(),
        "5500".toBigDecimal(),
        "4000".toBigDecimal()
    )

    println("___________________")
    println(salarios.somatoria())

    println("___________________")
    println(salarios.media())
}