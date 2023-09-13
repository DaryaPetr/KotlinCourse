package lesson_3

fun main() {

    val userName = "User"
    var currentHour = 13
    println("${greeting(currentHour)}, $userName!")
    currentHour = 20
    println("${greeting(currentHour)}, $userName!")

}

private fun greeting(currentHour: Int): String {
    val greetMessage = when (currentHour) {
        in 6..11 -> "Доброе утро"
        in 12..16 -> "Добрый день"
        in 17..23 -> "Добрый вечер"
        else -> "Доброй ночи"
    }
    return greetMessage
}