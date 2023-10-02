package lesson_9

fun main() {

    println("Введите все ингредиенты черз запятую")
    val ingredients = readln().split(',').sorted()
    println("Ингредиенты: $ingredients")

}