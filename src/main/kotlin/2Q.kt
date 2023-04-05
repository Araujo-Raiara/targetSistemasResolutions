/**
 * Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo
 * valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...),
 * escreva um programa na linguagem que desejar onde, informado um número,
 * ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se
 * o número informado pertence ou não a sequência.
 */
fun main() {
    println("Digite a quantidade de termos que deseja exibir na sequência  Fibonacci?")
    val num = readln().toInt()

    var first = 0
    var second = 1
    var sum = 0

    val listFibonacci: MutableList<Int> = mutableListOf()

    for (i in 1..num) {

        when (i) {
            1 -> {
                listFibonacci.add(first)
            }
            2 -> {
                listFibonacci.add(second)
            }
            else -> {
                sum = first + second
                first = second
                second = sum

                listFibonacci.add(sum)
            }
        }
    }

    println(listFibonacci.toString())
}
