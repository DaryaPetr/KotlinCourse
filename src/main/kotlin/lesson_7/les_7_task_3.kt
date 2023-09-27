package lesson_7

const val START = 0

fun main() {

    println("Введите число > 0")
    val num = readln().toInt()
    for (i in START..num step 2) {
        val even = i
        println(even)
    }
}