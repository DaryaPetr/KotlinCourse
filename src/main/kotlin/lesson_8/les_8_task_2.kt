package lesson_8

fun main() {

    val saladIngredients = arrayOf("помидор", "огурец", "лук", "соль")
    println("Какой ингидиент вы хотите найти в рецепте?")
    val ingredient = readln()
    for (i in saladIngredients) {
        if (i == ingredient) {
            println("Ингредиент [$ingredient] в рецепте есть")
            return
        }
    }
    println("Такого ингредиента в рецепте нет")

}