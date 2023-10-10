package lesson_11

class User6(
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

class Forum() {

    val users: MutableList<User6> = mutableListOf()
    val messages: MutableList<String> = mutableListOf()

    fun createNewUser() {
        print("Введите id ")
        val id = readln().toInt()
        print("Введите логин ")
        val login = readln()
        print("Введите пароль ")
        val password = readln()
        print("Введите почту ")
        val mail = readln()
        val user = User6(id, login, password, mail)
        users.add(user)
    }

    fun createNewMessage(authorId: Int, message: String) {
        val name = users.find{ it.id == authorId }?.login ?: "Незарегистрированный пользователь"
        messages.add("$name: $message")
    }

    fun printThread() {
        for (i in messages) println(i)
    }

}

fun main() {

    val forum = Forum()
    forum.createNewUser()
    forum.createNewUser()
    forum.createNewMessage(1,"111")
    forum.createNewMessage(1,"aaa")
    forum.createNewMessage(2,"222")
    forum.createNewMessage(2,"bbb")
    forum.printThread()

}