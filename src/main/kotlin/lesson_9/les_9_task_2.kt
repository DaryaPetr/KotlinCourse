package lesson_9

fun main() {

    val saladIngredients = mutableListOf("помидор", "огурец", "лук")
    println("В рецепте есть базовые ингредиенты:")
    printIngredients(saladIngredients)

    println("\nЖелаете добавить ещё?")
    if (readln() == "да") {
        println("\nКакой ингредиент вы хотите добавить?")
        saladIngredients.add(readln())
        println("\nТеперь в рецепте есть следующие ингредиенты:")
        printIngredients(saladIngredients)
    }
}

fun printIngredients(ingredients: MutableList<String>) = ingredients.forEach {println(it)}