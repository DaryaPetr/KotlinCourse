package lesson_8

fun main() {

    println("Сколько будет ингредиентов?")
    val ingredientsCount = readln().toInt()
    val ingredients = Array<String>(ingredientsCount) {
            print("Ингредиент, который нужно добавить: ")
            readln()
    }

    for (i in ingredients) println(i)

}