package lesson_9

const val INGREDIENT_COUNT = 5

fun main() {

    println("Введите 5 ингредиентов")
    var ingredients = mutableListOf<String>()
    for (i in 0 until INGREDIENT_COUNT) {
        ingredients.add(readln())
    }

    ingredients = ingredients.distinctBy{it.uppercase()}.sorted().toMutableList()

    println("Ингредиенты: ${ingredients.joinToString(separator = ",") { 
                ingredient -> ingredient.replaceFirstChar { it.uppercase() }
            }}.")
}