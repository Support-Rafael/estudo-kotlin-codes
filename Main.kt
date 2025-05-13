fun main() {
    //Formatação de Texto

    //1° Maneira de Formatar
    val message = "Olá Rafael.\n Seu produto chegou!"
    println(message)

    println("==============================")

    //2° Maneira de Formatar
    val mensagem = """
        Olá Rafael
         Seu produto chegou!
    """.trimIndent()
    //.trimIndent() = Método usado pra eliminar todos os espaços em branco do Texto
    //.replaceIndent(";") = Método usado para substituir todos os espaços pelo caracter selecionado, no caso do exemplo anterior ";"
    println(mensagem)

    println("==============================")

    //3° Maneira de Formatar
    val nome = "Rafael"
    val idade = 22
    val cidade = "Cuiaba"
    //Método padrão
    println("Seu nome é: " + nome + ". Sua idade é: " + idade + ". Sua cidade natal é: " + cidade)
    //Método aprimorado
    println("Seu nome é: $nome. Sua idade é: ${cidade+10}. Sua cidade natal é: $cidade") //É possível fazer expressões dentro dos colchetes{}

}