//[DESAFIO] Crie um jogo de JoKenPo (Pedra-Papel-Tesoura)

import kotlin.random.Random

fun main() {
    val opcoes = listOf("Pedra", "Papel", "Tesoura")

    print("Escolha Pedra, Papel ou Tesoura: ")
    val escolhaUsuario = readLine()?.replaceFirstChar { it.uppercase() }
    val escolhaComputador = opcoes.random()

    if (escolhaUsuario !in opcoes) {
        println("Escolha inválida")
        return
    }

    println("Computador escolheu: $escolhaComputador")

    val resultado = when {
        escolhaUsuario == escolhaComputador -> "Empate"
        escolhaUsuario == "Pedra" && escolhaComputador == "Tesoura" ||
                escolhaUsuario == "Papel" && escolhaComputador == "Pedra" ||
                escolhaUsuario == "Tesoura" && escolhaComputador == "Papel" -> "Você venceu"
        else -> "Você perdeu"
    }

    println(resultado)
}

