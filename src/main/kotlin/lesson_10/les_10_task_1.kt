package lesson_10

fun main() {

    do {
        val userRes = rollDice()
        val computerRes = rollDice()
        println("Человек: $userRes, Компьютер: $computerRes")
        if (userRes > computerRes) println("Победило человечество")
        else if (userRes < computerRes) println("Победила машина")
    } while (userRes == computerRes)

}

fun rollDice() = (1..6).random()