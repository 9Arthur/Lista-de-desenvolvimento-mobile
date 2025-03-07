// • [DESAFIO] Escreva um programa para calcular a redução do tempo
//de vida de um fumante. Pergunte a quantidade de cigarros fumados
//por dias e quantos anos ele já fumou. Considere que um fumante
//perde 10 min de vida a cada cigarro. Calcule quantos dias de vida
//um fumante perderá e exiba o total em dias.

fun main() {
    print("Quantidade de cigarros fumados por dia: ")
    val cigarrosPorDia = readLine()?.toIntOrNull() ?: return println("Entrada inválida")

    print("Quantidade de anos fumando: ")
    val anosFumando = readLine()?.toIntOrNull() ?: return println("Entrada inválida")

    val minutosPerdidosPorCigarro = 10
    val diasNoAno = 365
    val minutosPorDia = 24 * 60

    val totalCigarros = cigarrosPorDia * anosFumando * diasNoAno
    val minutosPerdidos = totalCigarros * minutosPerdidosPorCigarro
    val diasPerdidos = minutosPerdidos / minutosPorDia

    println("Total de dias de vida perdidos: $diasPerdidos")
}