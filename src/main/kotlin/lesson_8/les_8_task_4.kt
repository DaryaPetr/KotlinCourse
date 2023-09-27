package lesson_8

fun main() {

    val saladIngredients = arrayOf("помидор", "огурец", "лук", "соль")
    printArray(saladIngredients)

    println("Какой ингредиент вы хотите заменить?")
    val ingredient = readln()

    if (saladIngredients.contains(ingredient)) {
        println("Какой ингредиент вы бы хотели добавить?")
        val newIngredient = readln()
        saladIngredients[saladIngredients.indexOf(ingredient)] = newIngredient
        println("Готово! Вы сохранили следующий список: ")
        printArray(saladIngredients)

    }
    else println("Такого ингредиента в рецепте нет")

}

fun printArray(array: Array<String>) {
    for (i in array)
        println(i)
}