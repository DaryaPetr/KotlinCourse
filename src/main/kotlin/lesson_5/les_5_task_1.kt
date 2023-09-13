package lesson_5

fun main() {

    val firstNum = 14
    val secondNum = 23

    print("Для входа в приложение введите результат выражения $firstNum + $secondNum = ")
    val result = readln().toInt()

    if (result == firstNum + secondNum)
        println("Добро пожаловать!")
    else
        println("Доступ запрещён.")

}