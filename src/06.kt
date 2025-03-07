//[DESAFIO] Desenvolva um programa que leia o primeiro termo e
//a razão de uma PA (Progressão Aritmética), mostrando na tela os
//10 primeiros elementos da PA e a soma entre todos os valores da
//sequência.

fun main() {
    print("Digite o primeiro termo da PA: ")
    val primeiroTermo = readLine()?.toIntOrNull()

    print("Digite a razão da PA: ")
    val razao = readLine()?.toIntOrNull()

    if (primeiroTermo == null || razao == null) {
        println("Entrada inválida! Certifique-se de inserir números válidos.")
        return
    }

    var termo = primeiroTermo
    var soma = 0

    println("Os 10 primeiros termos da PA são:")
    for (i in 1..10) {
        println(termo)
        soma += termo
        termo += razao  // Atualiza o valor do termo para o próximo na PA
    }

    println("A soma de todos os 10 termos da PA é: $soma")
}
