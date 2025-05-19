fun main() {
    println("Qual foi o problema identificado? 1-Lentidão, 2-Quedas, 3-Sem Conexão")
    val solicitacao = readLine()

    println("Adicione a observação do atendimento")
    val observacao = readLine()

    println("Nome do cliente")
    val nome = readLine()

    println("Número do cliente")
    val telefone = readLine()

    println("Observação do atendimento")
    val observacaoAtendimento = readLine()

    println("Localização do cliente")
    val localizacao = readLine()

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

    println("""
        CLIENTE APRESENTA QUAL PROBLEMA?
        SOLICITAÇÃO(x) - LENTIDÃO ( $lentidao ) - QUEDAS ($quedas) - SEM CONEXÃO ($loss)
        OBS.: $observacao
        SOLICITANTE: $nome
        CONTATO: $telefone
        OBSERVAÇÃO: $observacaoAtendimento
        LOCALIZAÇÃO: $localizacao
    """.trimIndent())

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