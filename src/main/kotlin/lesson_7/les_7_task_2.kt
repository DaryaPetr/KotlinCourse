package lesson_7

fun main() {

    while (true) {
        val code = (1000..9999).random()
        println("Ваш код авторизации: $code")
        print("Введите код авторизации ")
        val data = readln().toInt()
        if (code == data) {
            println("Добро пожаловать!")
            break
        } else println("Неверный код")
    }

}