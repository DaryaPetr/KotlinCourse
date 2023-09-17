package lesson_6

fun main() {

    print("Введите кол-во секунд, которое нужно засечь ")
    val secCount = readln().toLong()
    Thread.sleep(secCount * 1000)
    println("Секунд прошло: $secCount")
}