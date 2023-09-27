package lesson_7

fun main() {

    val symb1 = generateCharSymbol()
    val symb2 = generateNumSymbol()
    val symb3 = generateCharSymbol()
    val symb4 = generateNumSymbol()
    val symb5 = generateCharSymbol()
    val symb6 = generateNumSymbol()

    val password = "$symb1$symb2$symb3$symb4$symb5$symb6"
    println("Пароль: $password")
}

fun generateNumSymbol() = (0..9).random()

fun generateCharSymbol() = ('a'..'z').random()