package lesson_10

const val MIN_LOGIN_SYMB_AMOUNT = 4
const val PASSWORD_SYMB_AMOUNT = 16

fun main() {

    val login = createLogin()
    val password = generatePassword()
    println("Ваш пароль: $password")
    signIn(login, password)

}

fun createLogin(): String {
    var login = ""
    while (!isEnoughLength1(login)) {
        print("Введите логин. Минимум $MIN_LOGIN_SYMB_AMOUNT символа ")
        login = readln()
    }
    return login
}

fun isEnoughLength1(str: String) = str.length >= 4

fun generatePassword(): String {
    var password = ""
    for (i in 0 until PASSWORD_SYMB_AMOUNT) {
        val symb = when (listOf(1, 2, 3).random()) {
            1 -> generateNumber()
            2 -> generateLowercaseLetter()
            else -> generateCapitalLetter()
        }
        password += symb
    }
    return password
}

fun generateNumber() = (0..9).random()

fun generateLowercaseLetter() = ('a'..'z').random()

fun generateCapitalLetter() = ('A'..'Z').random()

fun signIn(userLogin: String, userPassword:String){
    do {
        println()
        println("Вход в приложение")
        print("Введите ваш логин ")
        val login = readln()
        print("Введите ваш пароль ")
        val password = readln()
        if (userLogin != login || userPassword != password) println("Введённые данные не верны")
    } while (userLogin != login || userPassword != password)
    checkCode()
}

fun generateCode(): Int = (1000..9999).random()

fun checkCode() {
    do {
        val code = generateCode()
        println("\nВаш код авторизации: $code")
        print("Введите код авторизации ")
        val data = readln().toInt()
        if (code != data) println("\nНеверный код")
    } while (code != data)
    println("\nДобро пожаловать!")
}
