//[DESAFIO] Vamos melhorar o jogo que fizemos no exercício
//A partir de agora, o computador vai sortear um número
//entre 1 e 10 e o jogador vai ter 4 tentativas para tentar
//acertar.

import kotlin.random.Random

fun main() {
    val numeroSorteado = Random.nextInt(1, 11)
    var tentativas = 4

    println("Tente adivinhar o número sorteado (entre 1 e 10). Você tem $tentativas tentativas.")

    while (tentativas > 0) {
        print("Digite o número da sua tentativa: ")
        val tentativa = readLine()?.toIntOrNull()

        if (tentativa == null || tentativa !in 1..10) {
            println("Entrada inválida! Escolha um número entre 1 e 10.")
            continue
        }

        if (tentativa == numeroSorteado) {
            println("Você acertou! O número sorteado foi $numeroSorteado.")
            return
        } else {
            tentativas--
            if (tentativas > 0) {
                println("Errado! Você ainda tem $tentativas tentativas.")
            }
        }
    }


    println("Você perdeu! O número sorteado era: $numeroSorteado.")
}
