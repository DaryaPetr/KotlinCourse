package lesson_11

class User(
    var id: Int,
    var login: String,
    var password: String,
    var mail: String,
    var bio: Int = 0
) {

    fun printData() {
        println("id = $id, login = $login, password = $password, mail = $mail, bio = $bio")
    }

    fun setBio() {
        bio = readln().toInt()
    }

    fun setPasword(pas: String) {
        password = pas
    }

    fun changePassword() {
        print("Введите текущий пароль ")
        val pas = readln()
        if (pas == password) {
            print("Введите новый пароль ")
            setPasword(readln())
        }
    }

    fun sendString(str: String) {
        println(str)
    }

}

fun main() {

    print("Введите id ")
    val id = readln().toInt()
    print("Введите логин ")
    val login = readln()
    print("Введите пароль ")
    val password = readln()
    print("Введите почту ")
    val mail = readln()

    val user = User(id, login, password, mail)
    user.printData()
    user.changePassword()
    user.printData()
    user.sendString(user.login)

}