package lesson_5

const val AGE_OF_MAJORITY = 18

fun main() {

    val currentYear = 2023
    print("Введите год рождения: ")
    val birthYear = readln().toInt()

    if (currentYear - birthYear >= AGE_OF_MAJORITY) println("Показать экран со скрытым контентом")
    else println("Вернуться на главный экран")
}