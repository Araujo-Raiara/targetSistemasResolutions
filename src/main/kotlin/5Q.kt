/**
 * Escreva um programa que inverta os caracteres de um string.
 */

fun main() {
    println("Digite uma palavra qualquer:")
    val word = readln()
    val charList: ArrayList<String> = arrayListOf()

    for (i in word.length - 1 downTo 0) {
        charList.add(word[i].toString())
    }

    val wordInReverse = charList.joinToString(separator = "")

    println(
        "Inserted word: $word\n" +
                "word reversed: $wordInReverse"
    )


}
