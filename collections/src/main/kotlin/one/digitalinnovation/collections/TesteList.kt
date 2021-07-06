package one.digitalinnovation.collections

fun main() {
    val Joao = Funcionario("Joao", salario =  4000.0)
    val Pedro = Funcionario("Pedro", salario =  1000.0)
    val Maria = Funcionario("Maria", salario =  6000.0)

    val funcionarios = listOf(Joao, Pedro, Maria)

    funcionarios.forEach{println(it)}
    println("-----------------------")
    funcionarios.sortedBy { it.salario }.forEach{ println(it)}
}
    data class Funcionario(
        val nome: String,
        val salario: Double

    ){
        override fun toString(): String =
            """
                Nome: $nome
                Salario: $salario
            """.trimIndent()
        }


