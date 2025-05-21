fun main() {
    //Condições (Controle de Fluxo)

    //Se, Senão -> Deve ser uma expressão booleana
    // (< , <= , > , >= , ! , == , != )

    val preco = 49
    val produto = "Teclado"

    // && Ambas expressões precisam ser verdadeiras
    // || Uma das expressões precisa ser verdadeira

    if (preco == 49 && produto == "Teclado") {
        println("Sucesso")
    } else {
        println("Falha")
    }
}