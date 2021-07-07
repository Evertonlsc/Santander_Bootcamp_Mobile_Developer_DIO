package one.digitalinnovation.collections

fun main() {
    val Joao = Funcionario("Joao", salario =  4000.0, tipocontratado = "CLT")
    val Pedro = Funcionario("Pedro", salario =  1000.0, tipocontratado = "PJ" )
    val Maria = Funcionario("Maria", salario =  6000.0, tipocontratado = "CLT")

    val funcionarios = listOf(Joao, Pedro, Maria)

    funcionarios.forEach{println(it)}
    println("-----------------------")
    funcionarios.sortedBy { it.salario }.forEach{ println(it)}

    println("-----------------------")
    funcionarios.groupBy { it.tipocontratado }.forEach{ println(it)}
}


