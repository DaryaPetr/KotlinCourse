package lesson_8

fun main() {

    val saladIngredients = arrayOf("помидор", "огурец", "лук", "соль")
    println("Какой ингидиент вы хотите найти в рецепте?")
    val ingredient = readln()
    if (ingredient in saladIngredients) println("Ингредиент [$ingredient] в рецепте есть")
    else println("Такого ингредиента в рецепте нет")

}