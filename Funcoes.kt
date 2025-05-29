fun main() {
    //Valores Nulos
    //Toda função sem tipo de retorno declarado é do tipo : Unit
    // Functions - Blocos de códigos Reutilizáveis | Organizar o Código


    val resposta = somar() //Valor da variável recebendo retorno da função

    olaMundo() //Call ou Chamada de Função

    println(resposta) //Printado o resultado da chamada da função somar
}
//Função para somar dois números e printar o resultado
fun somar(): String {
    val resultado = 2 + 3
    return "Estou somando 2 com 3 e o resultado é: $resultado"
}
//Função para retornar um texto
fun olaMundo() {
    println("Olá, mundo")

    //Funções de escopo
    fun subtracao() {
        println("Mensagem informando que começou a execução")
        println(2 + 4)
    }

    subtracao()
}