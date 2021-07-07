package one.digitalinnovation.collections

fun main() {
    val Joao = Funcionario("Joao", salario =  4000.0, tipocontratado = "CLT")
    val Pedro = Funcionario("Pedro", salario =  1000.0, tipocontratado = "PJ" )
    val Maria = Funcionario("Maria", salario =  6000.0, tipocontratado = "CLT")
    println("___________List___________")
    val funcionarios = mutableListOf(Joao, Maria)
    funcionarios.forEach{ println(it)}

    println("______________________")
    funcionarios.add(Pedro)
    funcionarios.forEach{ println(it)}

    println("______________________")
    funcionarios.remove(Joao)
    funcionarios.forEach{ println(it)}

    println("__________SET____________")
    val funcionarioSet = mutableSetOf(Joao)
    funcionarioSet.forEach{ println(it)}

    println("______________________")
    funcionarioSet.add(Pedro)
    funcionarioSet.add(Maria)
    funcionarioSet.forEach{ println(it)}

    println("______________________")
    funcionarioSet.remove(Maria)
    funcionarioSet.forEach{ println(it)}


}