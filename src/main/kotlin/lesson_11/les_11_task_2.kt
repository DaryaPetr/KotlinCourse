package lesson_11

class User2(
    val id: Int,
    val login: String,
    var password: String,
    val mail: String,
    var bio: String = ""
) {

    fun printData() {
        println("id = $id, login = $login, password = $password, mail = $mail, bio = $bio")
    }

    fun setBio() {
        bio = readln()
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

    val user = User2(id, login, password, mail)
    user.printData()
    user.changePassword()
    user.printData()
    user.sendString(user.login)

}