fun main() {
    //Condições (Controle de Fluxo)
    val produto = "iPhone"

    //Se, Senão -> Deve ser uma expressão booleana
    // (< , <= , > , >= , ! , == , != )

    val preco = 20_000
    if (preco > 30_000) {
        println("Você ganhou 30% de desconto")
    } else if (preco > 20_000) {
        println("Você ganhou 20% de desconto")
    } else if (preco > 10_000) {
        println("Você ganhou 10% de desconto")
    } else {
        println("O valor não é suficiente para aplicar um desconto")
    }
}