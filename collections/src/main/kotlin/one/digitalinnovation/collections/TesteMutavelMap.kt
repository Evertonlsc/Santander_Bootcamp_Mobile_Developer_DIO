package one.digitalinnovation.collections

fun main() {
    val Joao = Funcionario("Joao", salario =  4000.0, tipocontratado = "CLT")
    val Pedro = Funcionario("Pedro", salario =  1000.0, tipocontratado = "PJ" )
    val Maria = Funcionario("Maria", salario =  6000.0, tipocontratado = "CLT")

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(Joao.nome, Joao)
    repositorio.create(Maria.nome, Maria)
    repositorio.create(Pedro.nome, Pedro)

    println(repositorio.findById(Joao.nome))

    println("___________________________________")
    repositorio.remove(Maria.nome)
    repositorio.findAll().forEach {println(it)}
}