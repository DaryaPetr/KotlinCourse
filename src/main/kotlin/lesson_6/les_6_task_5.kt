package lesson_6

fun main() {

    println("Регистрация\n")
    print("Введите новый логин ")
    val userLogin = readln()
    print("Введите новый пароль ")
    val userPassword = readln()

    do {
        println("\nВход в приложение\n")
        print("Введите ваш логин ")
        val login = readln()
        print("Введите ваш пароль ")
        val password = readln()
        if (userLogin != login || userPassword != password) println("\nВведённые данные не верны")
        else println("\nАвторизация прошла успешно\n")
    } while (userLogin != login || userPassword != password)

    if (checkIsNotBot()) println("Добро пожаловать!")
    else println("Доступ запрещён.")
}

fun checkIsNotBot(): Boolean {

    val attemptsCount = 3

    for (i in 1..attemptsCount) {
        val firstNum = (1..9).random()
        val secondNum = (1..9).random()
        print("Для входа в приложение введите результат выражения $firstNum + $secondNum = ")
        val result = readln().toInt()
        if (result == firstNum + secondNum)
            return true
       println("Неверно. Попыток осталось: ${attemptsCount - i}")
    }

    return false
}