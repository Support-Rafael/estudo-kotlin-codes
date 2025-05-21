fun main() {
    //Condições (Controle de Fluxo)
    var a = 1
    var b = 2

    //Se, Senão -> Deve ser uma expressão booleana
    // (< , <= , > , >= , ! , == , != )

    // && Ambas expressões precisam ser verdadeiras
    // || Uma das expressões precisa ser verdadeira

    //Comparar String

    // Variavel que aceita null(nullable) e só adicionar o '?' atrás do tipo.
    var produto: String? = "iMac"
    produto = "iPhone"
    produto = null

    println(produto)

    //Exemplo de aplicação do null
    var endereco: String? = null

    //Condição para validar se a variavel tem alguma informação ou se ela é nula.
    if (endereco != null) {
        val qtdCaracteres = endereco.length
        println(qtdCaracteres)
    }

    //Maneira direta de retornar o resultado
    val qtdCaracter = endereco?.length
    println(qtdCaracter)

    //Maneira direta mantendo o controle de fluxo
    val qtdChar = if (endereco == null) endereco?.length else 0
    println(qtdChar)

    /*Maneira direta usando o operador elvis ( ?: ) é usado para definir um valor padrão caso
    a expressão esteja incorreta, retornando o resultado = 0 seria o mesmo que usar o else*/
    val qtChars = endereco?.length ?: 0
    println(qtChars)

    // Exemplo de simplificação usando o operador elvis

    var x = a ?: b
    println(x)
    //Os dois tem a mesma função e retornam o mesmo resultado
    var y = if (a == null) b else a
    println(y)
}