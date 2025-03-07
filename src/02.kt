//[DESAFIO] Refaça o algoritmo 25, acrescentando o recurso de
//mostrar que tipo de triângulo será formado:
//• EQUILÁTERO: todos os lados iguais
//• ISÓSCELES: dois lados iguais
//• ESCALENO: todos os lados diferentes


fun main() {
    print("Digite o comprimento do primeiro segmento: ")
    val a = readLine()?.toDoubleOrNull()

    print("Digite o comprimento do segundo segmento: ")
    val b = readLine()?.toDoubleOrNull()

    print("Digite o comprimento do terceiro segmento: ")
    val c = readLine()?.toDoubleOrNull()

    if (a == null || b == null || c == null) {
        println("Entrada inválida! Certifique-se de inserir números válidos.")
        return
    }

    if (a + b > c && a + c > b && b + c > a) {
        println("Os segmentos informados podem formar um triângulo.")


        when {
            a == b && b == c -> println("O triângulo é EQUILÁTERO.")
            a == b || a == c || b == c -> println("O triângulo é ISÓSCELES.")
            else -> println("O triângulo é ESCALENO.")
        }
    } else {
        println("Os segmentos informados NÃO podem formar um triângulo.")
    }
}
