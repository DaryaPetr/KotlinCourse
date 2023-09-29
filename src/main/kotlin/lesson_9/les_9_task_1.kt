package lesson_9

fun main() {

    val saladIngredients = listOf("помидор", "огурец", "лук", "соль")
    println("В рецепте есть следующие ингредиенты:")
    saladIngredients.forEach {
        println(it)
    }

}