fun main() {

    //Solicitando informações sobre o problema enfrentado
    println("Qual foi o problema identificado? 1-Lentidão, 2-Quedas, 3-Sem Conexão")
    val solicitacao = readLine()

    //Adicionando descrição do atendimento (Colocar todas informações)
    println("Adicione a observação do atendimento")
    val observacao = readLine()

    //Entrada do nome do cliente
    println("Nome do cliente")
    val nome = readLine()

    //Entrada do número do cliente
    println("Número do cliente")
    val telefone = readLine()

    //Adicionar informação do problema principal relatado
    println("Observação do atendimento")
    val observacaoAtendimento = readLine()

    //Adicionar localização fixa
    println("Localização do cliente")
    val localizacao = readLine()

    //Condição para identificar qual problema de acordo com a entrada da variável "solicitacao"
    val lentidao = if (solicitacao?.contains("1") == true) {
        "x"
    } else {
        ""
    }

    val quedas = if (solicitacao?.contains("2") == true) {
        "x"
    } else {
        ""
    }

    val loss = if (solicitacao?.contains("3") ==  true) {
        "x"
    } else {
        ""
    }

    //Usando (""") para printar o texto inteiro formatado
    println("""
        CLIENTE APRESENTA QUAL PROBLEMA?
        SOLICITAÇÃO(x) - LENTIDÃO ( $lentidao ) - QUEDAS ($quedas) - SEM CONEXÃO ($loss)
        OBS.: $observacao
        SOLICITANTE: $nome
        CONTATO: $telefone
        OBSERVAÇÃO: $observacaoAtendimento
        LOCALIZAÇÃO: $localizacao
    """.trimIndent())

    //Usando as informações da N2 para preencher a N3 e finalizar ou encaminhar equipe
    println("""
        -QUAL O PROBLEMA RELATADO PELO CLIENTE?
         $observacaoAtendimento
        --//--
        -RESOLVIDO?
        SIM-(  ) - Obs:
        NÃO-( x ) - Obs:
        --//--
        -INFORMACOES ADICIONAIS.
        - $observacao
        SOLICITANTE: $nome
        CONTATO DO SOLICITANTE: $telefone
        LOCALIZAÇÃO: $localizacao
        (  )-NAO?! QUAL O MOTIVO?
        --//--
        PERIODO SOLICITADO PELO CLIENTE: ( x )-MANHA (  )-TARDE.
        PRIORIDADE: (  )-BAIXA  (  )-NORMAL  ( x )-ALTA.
    """.trimIndent())
}