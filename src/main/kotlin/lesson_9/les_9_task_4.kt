package lesson_9

fun main() {

    println("Введите все ингредиенты через запятую")
    val ingredients = readln().split(',').sorted()
    println("Ингредиенты: $ingredients")

}