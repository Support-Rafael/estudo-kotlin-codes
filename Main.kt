fun main() {
    //Condições (Controle de Fluxo)

    //Se, Senão -> Deve ser uma expressão booleana
    // (< , <= , > , >= , ! , == , != )

    // && Ambas expressões precisam ser verdadeiras
    // || Uma das expressões precisa ser verdadeira

    //Comparar String
    val produto1 = "iMac"
    val produto2 = "iPhone"

    //Verificar se às Strings são diferentes
    println(produto1 != produto2)

    //Verificar se às Strings são iguais
    println(produto1 == produto2)

    //Método do Java para verificar se Strings são iguais
    println(produto1.equals(produto2))
}