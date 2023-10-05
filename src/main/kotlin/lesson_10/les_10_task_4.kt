package lesson_10

fun main() {

    var winCount = 0
    do {
        do {
            val userRes = rollDice1()
            val computerRes = rollDice1()
            println("Человек: $userRes, Компьютер: $computerRes")
            if (userRes > computerRes) {
                println("Победило человечество")
                winCount++
            }
            else if (userRes < computerRes) println("Победила машина")
        } while (userRes == computerRes)
    } while (isContinue())
    println("Человек выиграл $winCount партий")

}

fun rollDice1() = (1..6).random()

fun isContinue(): Boolean {
    println("\nХотите бросить кости еще раз? Введите Да или Нет")
    if (readln() == "Да") return true
    return false
}