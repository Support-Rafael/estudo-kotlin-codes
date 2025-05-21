fun main() {
    //Condições (Controle de Fluxo)
    val produto = "iPhone"

    //Se, Senão -> Deve ser uma expressão booleana
    // (< , <= , > , >= , !)
    if (produto.length <= 3) {
        println("Você não pode cadastrar produtos com nome pequeno")
    } else {
        println("Produto Cadastrado com sucesso")
    }
}