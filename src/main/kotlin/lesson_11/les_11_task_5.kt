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
        print("Введите логин ")
        val login = readln()
        print("Введите пароль ")
        val password = readln()
        print("Введите почту ")
        val mail = readln()
        val user = User6(users.size + 1, login, password, mail)
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
    forum.createNewMessage(forum.users[0].id,"111")
    forum.createNewMessage(forum.users[0].id,"aaa")
    forum.createNewMessage(forum.users[1].id,"222")
    forum.createNewMessage(forum.users[1].id,"bbb")
    forum.printThread()

}