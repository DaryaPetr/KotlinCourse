package lesson_11

class User1(
    val id: Int,
    val login: String,
    val password: String,
    val mail: String,
)

fun main() {

    val firstUser = User1(
        id = 1,
        login = "first",
        password = "123",
        mail = "d@d",)
    val secondUser = User1(
        id = 2,
        login = "second",
        password = "1231",
        mail = "a@d",)

    println("${firstUser.id}, ${firstUser.login}, ${firstUser.password}, ${firstUser.mail}")
    println("${secondUser.id}, ${secondUser.login}, ${secondUser.password}, ${secondUser.mail}")

}