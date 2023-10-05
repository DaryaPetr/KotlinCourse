package lesson_10

const val FIRST_SPECIAL_SYMBOL = 32
const val LAST_SPECIAL_SYMBOL = 47
const val FIRST_NUM_SYMBOL = 48
const val LAST_NUM_SYMBOL = 57

fun main() {
    println("Какой длины должен быть пароль?")
    val password = generatePassword(readln().toInt())
    println(password)
}

fun generatePassword(length: Int): String {
    var pas = ""
    for (i in 1..length)
        pas += when (i % 2) {
            0 -> (FIRST_SPECIAL_SYMBOL..LAST_SPECIAL_SYMBOL).random().toChar()
            else -> (FIRST_NUM_SYMBOL..LAST_NUM_SYMBOL).random().toChar()
        }
    return pas
}