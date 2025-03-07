//• [DESAFIO] Desenvolva um aplicativo que tenha um procedimento
//chamado Fibonacci() que recebe um único valor inteiro como
//parâmetro, indicando quantos termos da sequência serão mostrados
//na tela. O seu procedimento deve receber esse valor e mostrar a
//quantidade de elementos solicitados.
//Obs: Use os exercícios 70 e 75 para te ajudar
//na solução Ex:
//
//Fibonacci(5) vai gerar 1 &gt;&gt; 1 &gt;&gt; 2 &gt;&gt; 3 &gt;&gt; 5 &gt;&gt; FIM
//Fibonacci(9) vai gerar 1 &gt;&gt; 1 &gt;&gt; 2 &gt;&gt; 3 &gt;&gt; 5 &gt;&gt; 8 &gt;&gt; 13 &gt;&gt; 21 &gt;&gt; 34
//&gt;&gt; FIM

fun main() {
    print("Digite o número de termos da sequência de Fibonacci: ")
    val n = readLine()?.toIntOrNull()

    if (n == null || n <= 0) {
        println("Entrada inválida! Por favor, insira um número inteiro positivo.")
    } else {
        Fibonacci(n)
    }
}

// Procedimento que exibe a sequência de Fibonacci até o número de termos solicitado
fun Fibonacci(n: Int) {
    var primeiro = 1
    var segundo = 1
    var termo: Int

    // Exibindo os primeiros dois termos
    if (n >= 1) println(primeiro)
    if (n >= 2) println(segundo)

    // Calculando e exibindo os próximos termos da sequência
    for (i in 3..n) {
        termo = primeiro + segundo
        println(termo)
        primeiro = segundo
        segundo = termo
    }
    println("FIM")
}

