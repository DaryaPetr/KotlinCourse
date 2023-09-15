package lesson_6

fun main() {

    print("Введите кол-во секунд, которое нужно засечь ")
    val secCount = readln().toInt()
    var count = 0
    while (count < secCount) {
        Thread.sleep(1000)
        println("Осталось секунд: ${secCount - ++count}")
    }
    println("Время вышло")

}