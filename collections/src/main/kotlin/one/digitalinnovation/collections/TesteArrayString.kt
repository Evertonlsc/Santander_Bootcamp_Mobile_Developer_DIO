package one.digitalinnovation.collections

fun main() {
    val nomes = Array(3) {""}

    nomes[0] = "Maria"
    nomes[1] = "Zaza"
    nomes[2] = "Pedro"

    for (nome in nomes) {
        println(nome)
    }

    println("___________________________")

    nomes.sort()
    nomes.forEach { println(it) }

    println("___________________________")

    val nomes2 = arrayOf ("Maria", "Zaza", "João")
    nomes.sort()
    nomes.forEach {
        println(it)
    } }

