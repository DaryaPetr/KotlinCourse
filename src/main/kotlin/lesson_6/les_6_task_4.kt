package lesson_6

const val ATTEMPT_COUNT = 5

fun main() {

    val number = (1..9).random()

    println("Загадано число от 1 до 9. У вас есть 5 попыток, чтобы угадать его")
    println()

    for (i in 1..ATTEMPT_COUNT) {
        print("Попытка $i: Введите число ")
        val num = readln().toInt()
        if (num == number) {
            println("Это была великолепная игра!")
            break
        }
        else println("Неверно. Попыток осталось: ${ATTEMPT_COUNT - i}")
        if (i == ATTEMPT_COUNT) println("Было загадано число $number")
    }

}