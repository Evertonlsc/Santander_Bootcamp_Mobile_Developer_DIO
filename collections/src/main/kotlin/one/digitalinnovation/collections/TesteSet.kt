package one.digitalinnovation.collections

fun main() {
    val Joao = Funcionario("Joao", salario = 4000.0, tipocontratado = "CLT")
    val Pedro = Funcionario("Pedro", salario = 1000.0, tipocontratado = "PJ")
    val Maria = Funcionario("Maria", salario = 6000.0, tipocontratado = "CLT")

    val funcionarios1 = setOf(Joao, Pedro)
    val funcionarios2 = setOf(Maria)

    val resultUnion = funcionarios1.union(funcionarios2)
    resultUnion.forEach{ println(it)}

    println("|||||||||||||||||||||||||||||")
    val funcionarios3 = setOf(Joao, Pedro, Maria)
    val resultSubtract = funcionarios3.subtract(funcionarios2)
    resultSubtract.forEach{ println(it)}

    println("|||||||||||||||||||||||||||||")
    val resultInterceptor = funcionarios3.intersect(funcionarios2)
    resultInterceptor.forEach{ println(it)}
}