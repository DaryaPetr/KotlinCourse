package lesson_5

fun main() {

    val firstWinNum = 43
    val secondWinNum = 89

    println("Загадано 2 числа от 1 до 100. У вас есть 5 попыток, чтобы их угадать")
    println()

    var firstGuessed = false
    var secondGuessed = false

    for (i in 1..5) {
        print("Попытка $i: Введите число ")
        val num = readln().toInt()
        if (num == firstWinNum) firstGuessed = true
        if (num == secondWinNum) secondGuessed = true
        if (firstGuessed && secondGuessed) break
    }
    println()

    if (firstGuessed && secondGuessed) println("Поздравляем! Вы выиграли главный приз!")
    else if (firstGuessed || secondGuessed) println("Вы выиграли утешительный приз!")
    else println("Неудача! Крутите барабан!")
    println()

    println("Загаданные числа: $firstWinNum, $secondWinNum")
}