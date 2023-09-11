package lesson_5

fun main() {

    val numbers = List(100) { it + 1 }
    val firstWinNum = numbers.shuffled().last()
    var secondWinNum = numbers.shuffled().last()
    while (secondWinNum == firstWinNum) secondWinNum = numbers.shuffled().last()

    println("Загадано 2 числа от 1 до 100. У вас есть 5 попыток, чтобы их угадать")
    println()

    var firstIsGuessed = false
    var secondIsGuessed = false

    for (i in 1..5) {
        print("Попытка $i: Введите число ")
        val num = readLine()!!.toInt()
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