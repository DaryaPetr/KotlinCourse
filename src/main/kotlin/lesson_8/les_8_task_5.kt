package lesson_8

fun main() {

    println("Сколько будет ингредиентов?")
    val ingredientsCount = readln().toInt()
    val ingredients = Array<String>(ingredientsCount) {""}

    for (i in 0 until ingredientsCount) {
        print("Ингредиент, который нужно добавить: ")
        ingredients[i] = readln()
    }

    for (i in ingredients) println(i)

}