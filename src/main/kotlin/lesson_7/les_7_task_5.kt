package lesson_7

fun main() {

    println("Какой длины должен быть пароль? ")
    val passLength = readln().toInt()

    var password = ""
    for (i in 0 until passLength) {
        val symb = when (listOf(1, 2, 3).random()) {
            1 -> generateNumber()
            2 -> generateLowercaseLetter()
            else -> generateCapitalLetter()
        }
        password += symb
    }

    println("Пароль: $password")
}

fun generateNumber() = (0..9).random()

fun generateLowercaseLetter() = ('a'..'z').random()

fun generateCapitalLetter() = ('A'..'Z').random()


