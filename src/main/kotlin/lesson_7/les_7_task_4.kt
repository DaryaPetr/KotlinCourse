package lesson_7

fun main() {

    print("Сколько секунд засечь? ")
    val secCount = readln().toInt()

    for (i in secCount downTo 1) {
        println("Секунд осталось: $i")
        Thread.sleep(1000)
    }
    println("Время вышло")

}