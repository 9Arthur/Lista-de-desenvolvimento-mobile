//[DESAFIO] Crie um jogo onde o computador vai sortear um número
//entre 1 e 5 o jogador vai tentar descobrir qual foi o valor
//sorteado.

import kotlin.random.Random

fun main() {
    val numeroSorteado = Random.nextInt(1, 6)

    print("Tente adivinhar o número sorteado (entre 1 e 5): ")
    val tentativa = readLine()?.toIntOrNull()

    if (tentativa == null || tentativa !in 1..5) {
        println("Entrada inválida! Escolha um número entre 1 e 5.")
        return
    }

    if (tentativa == numeroSorteado) {
        println("Você acertou!")
    } else {
        println("Errado! O número sorteado foi $numeroSorteado.")
    }
}
