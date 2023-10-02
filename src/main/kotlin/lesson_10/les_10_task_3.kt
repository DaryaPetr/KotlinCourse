package lesson_10

const val FIRST_ACCEPT_SYMBOL = 32
const val LAST_ACCEPT_SYMBOL = 57

fun main() {

    println("Какой длины должен быть пароль?")
    val password = generatePassword(readln().toInt())
    println(password)

}

fun generatePassword(length: Int): String {
    var pas = ""
    for (i in 1..length) pas += (FIRST_ACCEPT_SYMBOL..LAST_ACCEPT_SYMBOL).random().toChar()
    return pas
}