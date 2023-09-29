package lesson_9

fun main() {

    val omeletProportions = listOf(2, 50, 15)
    print("Сколько порций омлета рассчитать? ")
    val portionCount = readln().toInt()
    println("На [$portionCount] порций вам понадобится: " +
            "Яиц – ${portionCount * omeletProportions[0]} шт, " +
            "молока – ${portionCount * omeletProportions[1]} мл, " +
            "сливочного масла – ${portionCount * omeletProportions[2]} гр")

}