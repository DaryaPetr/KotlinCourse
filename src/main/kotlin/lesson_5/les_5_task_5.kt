package lesson_5

fun main() {

    val firstWinNum = (1..100).random()
    var secondWinNum = (1..100).random()
    while (secondWinNum == firstWinNum) secondWinNum = (1..100).random()

    println("Загадано 2 числа от 1 до 100. У вас есть 5 попыток, чтобы их угадать")
    println()

    var firstIsGuessed = false
    var secondIsGuessed = false

    for (i in 1..5) {
        print("Попытка $i: Введите число ")
        val num = readln().toInt()
        if (num == firstWinNum) firstIsGuessed = true
        if (num == secondWinNum) secondIsGuessed = true
        if (firstIsGuessed && secondIsGuessed) break
    }
    println()

    if (firstIsGuessed && secondIsGuessed) println("Поздравляем! Вы выиграли главный приз!")
    else if (firstIsGuessed || secondIsGuessed) println("Вы выиграли утешительный приз!")
    else println("Неудача! Крутите барабан!")
    println()
    println("Загаданные числа: $firstWinNum, $secondWinNum")

}