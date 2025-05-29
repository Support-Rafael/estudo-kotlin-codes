fun main() {
    //Valores Nulos
    //Toda função sem tipo de retorno declarado é do tipo : Unit
    // Functions - Blocos de códigos Reutilizáveis | Organizar o Código
    //A função pode ter um tipo de retorno (Double, String, etc.) Caso não tenha retorno (): Unit ou ()
    //Escopo de Funções
    // Declaração e o Corpo da Função

    olaMundo()
    olaMundo2()


}
//Função Body Line
fun olaMundo() = println("Olá, Mundo!")

fun olaMundo2() {
    val age = 25
    if (age < 18) {
        println("Não pode dirigir")
    } else {
        println("Pode dirigir")
    }
}