package lesson_3

fun main() {
    val move = "D2-D4;0"
    val from = move.substringBefore("-")
    val to = move.substringAfter('-').substringBefore(';')
    val moveNumber = move.substringAfter(';').toInt()
    println(from)
    println(to)
    println(moveNumber)
}