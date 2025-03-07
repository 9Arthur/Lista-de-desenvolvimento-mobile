//[DESAFIO] Faça um programa que mostre os 10 primeiros
//elementos da Sequência de Fibonacci:

fun main() {
    var primeiro = 1
    var segundo = 1

    println("Os 10 primeiros termos da sequência de Fibonacci são:")

    println(primeiro)
    println(segundo)

    for (i in 3..10) {
        val proximo = primeiro + segundo
        println(proximo)

        primeiro = segundo
        segundo = proximo
    }
}
