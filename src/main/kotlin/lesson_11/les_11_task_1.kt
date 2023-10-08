package lesson_11

class User(
    val id: Int,
    val login: String,
    val password: String,
    val mail: String,
)

fun main() {

    val firstUser = User(
        id = 1,
        login = "first",
        password = "123",
        mail = "d@d",)
    val secondUser = User(
        id = 2,
        login = "second",
        password = "1231",
        mail = "a@d",)

    println("${firstUser.id}, ${firstUser.login}, ${firstUser.password}, ${firstUser.mail}")
    println("${secondUser.id}, ${secondUser.login}, ${secondUser.password}, ${secondUser.mail}")

}