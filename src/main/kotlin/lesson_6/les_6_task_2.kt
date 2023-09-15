package lesson_6

fun main() {

    print("Введите кол-во секунд, которое нужно засечь ")
    val secCount = readln().toInt()
    for (i in 1..secCount) Thread.sleep(1000)
    println("Секунд прошло: $secCount")
}