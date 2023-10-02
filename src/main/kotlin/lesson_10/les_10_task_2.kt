package lesson_10

fun main() {

    print("Введите логин ")
    val login = readln()
    print("Введите пароль ")
    val password = readln()
    if (isEnoughLength(login) && isEnoughLength((password))) println("Добро пожаловать!")
    else println("Логин или пароль недостаточно длинные")

}

fun isEnoughLength(str: String) = str.length >= 4