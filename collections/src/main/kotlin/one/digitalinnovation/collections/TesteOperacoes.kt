package one.digitalinnovation.collections

fun main() {
    val salarios = doubleArrayOf(1000.0, 2250.0, 4500.0)

    for (salario in salarios) {
        println(salario)
    }
    println("____________________")

    println("Maior salario: ${salarios.maxOrNull()}")
    println("Menor salario: ${salarios.minOrNull()}")
    println("Media salarial: ${salarios.average()}")

    val salariosMaiorQue2500 = salarios.filter {it > 2500.0}
    println("____________________")
    salariosMaiorQue2500.forEach{ println(it)}

    println("____________________")
    println(salarios.count{it in 2500.0..5000.0})

    println("____________________")
    println(salarios.find{it == 2250.0})
    println(salarios.find{it == 500.0})

    println("____________________")
    println(salarios.any{it == 2250.0})
    println(salarios.any{it == 7500.0})

}