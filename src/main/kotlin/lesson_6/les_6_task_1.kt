package lesson_6

fun main() {

    println("Регистрация")
    print("Введите новый логин ")
    val userLogin = readln()
    print("Введите новый пароль ")
    val userPassword = readln()

    do {
        println()
        println("Вход в приложение")
        print("Введите ваш логин ")
        val login = readln()
        print("Введите ваш пароль ")
        val password = readln()
        println()
        if (userLogin != login || userPassword != password) println("Введённые данные не верны")
        else println("Авторизация прошла успешно")
    } while (userLogin != login || userPassword != password)


}