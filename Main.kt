fun main() {
    //Condições
    val produto = "iPhone"
    if (produto.length < 3) {
        println("Você não pode cadastrar produtos com nome pequeno")
    }
    val nome = "RafaelBruno"
    val tamanhoDoNome = nome.length //Acessando a propriedado do objeto String para mostrar quantos caracteres tem armazenado dentro da String

    val nomeMaiusculo = "Rafael Bruno".uppercase() //Função que deixa todos os caracteres maiusculos
    val nomeMinusculo = "Rafael Bruno".lowercase() //Função que deixa todos os caracteres minusculos

    println(tamanhoDoNome)
    println(nomeMaiusculo)
    println(nomeMinusculo)

}