package lesson_6

const val ATTEMPT_COUNT = 5

fun main() {

    val number = (1..9).random()

    println("Загадано число от 1 до 9. У вас есть 5 попыток, чтобы угадать его\n")

    var count = ATTEMPT_COUNT

    while (count-- > 0) {
        print("Попытка ${ATTEMPT_COUNT - count}: Введите число ")
        val num = readln().toInt()
        if (num == number) {
            println("Это была великолепная игра!")
            return
        }
        else println("Неверно. Попыток осталось: $count")
    }

    println("Было загадано число $number")

}