package lesson_5

fun main() {

    val firstWinNum = 43
    val secondWinNum = 89
    val winNumbers = listOf(firstWinNum, secondWinNum)

    println("Загадано 2 числа от 1 до 100. У вас есть 5 попыток, чтобы их угадать")

    var guessedNumCount = 0

    for (i in 1..5) {
        print("Попытка $i: Введите число ")
        val num = readLine()!!.toInt()
        if (winNumbers.contains(num)) guessedNumCount++
        if (guessedNumCount == 2) break
    }

    when (guessedNumCount) {
        0 -> println("Неудача! Крутите барабан!")
        1 -> println("Вы выиграли утешительный приз!")
        else -> println("Поздравляем! Вы выиграли главный приз!")
    }
    println("Загаданные числа: $firstWinNum, $secondWinNum")
}